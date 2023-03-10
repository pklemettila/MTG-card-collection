import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

// Class representing a single MTG card

public class MtgCard extends JPanel {

    public int getIdNumber() {
        return this.idNumber;
    }
    static final long serialVersionUID = 42L;
    private int idNumber;
    Database app = new Database();

    public MtgCard(int id) {

        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        this.idNumber = id;
        JLabel cardImageLabel = checkCardImage(id);
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 0;
        c.gridwidth = 2;
        c.gridheight = 2;
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(0, 0, 0, 0);
        this.add(cardImageLabel, c);

        JLabel priceLabel = new JLabel("Price: " + app.getPrice(id));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 3;
        c.insets = new Insets(5, 60, 0, 0);
        this.add(priceLabel, c);

        JLabel ownedLabel = new JLabel("Owned: " + app.searchOwnedById(id));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 1;
        c.gridy = 4;
        c.insets = new Insets(0, 60, 0, 0);
        this.add(ownedLabel, c);

        JButton plusButton = new JButton();
        plusButton.setIcon(new ImageIcon(this.getClass()
                .getResource(File.separator + "images" + File.separator + "plusimage.png" + File.separator)));
        plusButton.setBorder(BorderFactory.createEmptyBorder());
        plusButton.setContentAreaFilled(false);

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 0;
        c.insets = new Insets(10, 10, 0, 15);
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ownedLabel.setText("Owned: " + addToOwned(id));
            }
        });

        this.add(plusButton, c);
        JButton minusButton = new JButton();
        minusButton.setIcon(new ImageIcon(this.getClass()
                .getResource(File.separator + "images" + File.separator + "minusimage.png" + File.separator)));
        minusButton.setBorder(BorderFactory.createEmptyBorder());
        minusButton.setContentAreaFilled(false);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.gridx = 3;
        c.gridy = 1;
        c.insets = new Insets(0, 10, 150, 15);

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ownedLabel.setText("Owned: " + subtractFromOwned(id));
            }
        });
        this.add(minusButton, c);
    }

    // Gets an image of the specific MTG card from the directory. If no image is
    // available, uses a placeholder
    private JLabel checkCardImage(int id) { 

        JLabel LabelToReturn = new JLabel();
        ImageIcon rawImage;
        Image imgImage;
        String imgName = Integer.toString(id);
        if ((this.getClass().getResource(File.separator + "images" + File.separator + "Cards" + File.separator + ""
                + imgName + ".jpg") != null)) {

            rawImage = new ImageIcon(this.getClass().getResource(File.separator + "images" + File.separator + "Cards"
                    + File.separator + imgName + ".jpg" + File.separator));
        
                } else {

            rawImage = new ImageIcon(this.getClass().getResource(File.separator + "images" + File.separator + "Cards"
                    + File.separator + "tempCard.jpg" + File.separator));
            Font tempCardFont = new Font(LabelToReturn.getFont().getName(), LabelToReturn.getFont().getStyle(), 8);
            LabelToReturn.setText(app.searchCardsById(id));
            LabelToReturn.setFont(tempCardFont);
            LabelToReturn.setHorizontalTextPosition(JLabel.CENTER);
        }

        imgImage = rawImage.getImage().getScaledInstance(172, 240, Image.SCALE_SMOOTH);
        LabelToReturn.setIcon(new ImageIcon(imgImage));
        return LabelToReturn;
    }

    /* adds 1 owned card with this id to the database and returns updated amount of
    owned cards */
    private int addToOwned(int id) { 

        app.addToOwned(id);
        return (app.searchOwnedById(id));
    }

    /*removes 1 owned card with this id from the database and returns updated
    amount of owned cards */
    private int subtractFromOwned(int id) { 

        app.substractFromOwned(id);
        return (app.searchOwnedById(id));
    }
}