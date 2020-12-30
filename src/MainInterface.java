import javax.swing.*;
import java.awt.*;
import java.awt.Image;
import java.awt.Dimension;

public class MainInterface {
    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;

    public MainInterface() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container pane = frame.getContentPane();
        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        if (shouldFill) {
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        JToggleButton buttonTog;
        JButton button;

        Header header = new Header();
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.gridwidth = 10;
        c.gridx = 0;
        c.gridy = 1;
        pane.add(header, c);

        SearchBar search = new SearchBar("");
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1;
        c.gridwidth = 1;
        c.gridx = 0;
        c.gridy = 2;
        pane.add(search, c);

        ImageIcon whiteManaIcon = new ImageIcon(this.getClass().getResource("/images/mana/white_mana.png"));   
        Image whiteNewImg = whiteManaIcon.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
        ImageIcon manaIconW = new ImageIcon(whiteNewImg);
        JToggleButton whiteManaButton = new JToggleButton(); 
        whiteManaButton.setPreferredSize(new Dimension(40,40));
        whiteManaButton.setIcon(manaIconW);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.gridx = 1; 
        c.gridy = 2; 
        pane.add(whiteManaButton, c);


        ImageIcon blueManaIcon = new ImageIcon(this.getClass().getResource("/images/mana/blue_mana.png"));   
        Image newimg = blueManaIcon.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
        ImageIcon manaIconBlu = new ImageIcon(newimg);
        JToggleButton blueManaButton = new JToggleButton(); 
        blueManaButton.setPreferredSize(new Dimension(40,40));
        blueManaButton.setIcon(manaIconBlu);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 2; 
        c.gridy = 2; 
        pane.add(blueManaButton, c);

  // black
        ImageIcon blackManaIcon = new ImageIcon(this.getClass().getResource("/images/mana/black_mana.png"));   
        Image blackNewImg = blackManaIcon.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
        ImageIcon manaIconBla = new ImageIcon(blackNewImg);
        JToggleButton blackManaButton = new JToggleButton(); 
        blackManaButton.setPreferredSize(new Dimension(40,40));
        blackManaButton.setIcon(manaIconBla);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 3; 
        c.gridy = 2; 
        pane.add(blackManaButton, c);

          // red

          ImageIcon redManaIcon = new ImageIcon(this.getClass().getResource("/images/mana/red_mana.png"));   
          Image redNewImg = redManaIcon.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
          ImageIcon manaIconR = new ImageIcon(redNewImg);
          JToggleButton redManaButton = new JToggleButton(); 
          redManaButton.setPreferredSize(new Dimension(40,40));
          redManaButton.setIcon(manaIconR);
          c.fill = GridBagConstraints.HORIZONTAL;
          c.gridx = 4; 
          c.gridy = 2; 
          pane.add(redManaButton, c);

          ImageIcon greenManaIcon = new ImageIcon(this.getClass().getResource("/images/mana/green_mana.png"));   
          Image greenNewImg = greenManaIcon.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
          ImageIcon manaIconG = new ImageIcon(greenNewImg);
          JToggleButton greenManaButton = new JToggleButton(); 
          greenManaButton.setPreferredSize(new Dimension(40,40));
          greenManaButton.setIcon(manaIconG);
          c.fill = GridBagConstraints.HORIZONTAL;
          c.gridx = 5; 
          c.gridy = 2; 
          pane.add(greenManaButton, c);

          ImageIcon colorlessManaIcon = new ImageIcon(this.getClass().getResource("/images/mana/colorless_mana.png"));   
          Image colorlessNewImg = colorlessManaIcon.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
          ImageIcon manaIcon = new ImageIcon(colorlessNewImg);
          JToggleButton colorlessManaButton = new JToggleButton(); 
          colorlessManaButton.setPreferredSize(new Dimension(40,40));
          colorlessManaButton.setIcon(manaIcon);
          c.fill = GridBagConstraints.HORIZONTAL;
          c.gridx = 6; 
          c.gridy = 2; 
          pane.add(colorlessManaButton, c);

          ImageIcon multicolorManaIcon = new ImageIcon(this.getClass().getResource("/images/mana/multicolor_mana.png"));   
          Image multicolorNewImg = multicolorManaIcon.getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
          ImageIcon manaIconM = new ImageIcon(multicolorNewImg);
          JToggleButton multicolorManaButton = new JToggleButton(); 
          multicolorManaButton.setPreferredSize(new Dimension(40,40));
          multicolorManaButton.setIcon(manaIconM);
          c.fill = GridBagConstraints.HORIZONTAL;
          c.gridx = 7; 
          c.gridy = 2; 
          pane.add(multicolorManaButton, c);
    



       


//ADD PRICE HERE

        button = new JButton("price1");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 8;
        c.gridy = 2;
        pane.add(button, c);

        button = new JButton("price2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1;
        c.gridx = 9;
        c.gridy = 2;
        pane.add(button, c);

        SearchCheckBoxes scBox = new SearchCheckBoxes();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;
        c.weighty = 0.5;
        c.gridx = 0;
        c.gridwidth = 1;
        c.gridy = 3;
        pane.add(scBox, c);

        RarityCheckBoxes rarityCheckBox = new RarityCheckBoxes();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weighty = 0;
        c.gridx = 1;
        c.gridwidth = 8;
        c.gridy = 3;
        pane.add(rarityCheckBox, c);

        // Placeholder for Card Type Dropdown
        button = new JButton("Card Type");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridwidth = 2;
        c.gridx = 9;
        c.gridy = 3;
        pane.add(button, c);

        JCheckBox collected = new JCheckBox("Show only collected");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0;
        c.gridwidth = 10;
        c.anchor = GridBagConstraints.CENTER;
        c.gridx = 5;
        c.gridy = 4;
        pane.add(collected, c);

        frame.pack();
        frame.setVisible(true);

        /*
         * ManaSymbols symbols = new ManaSymbols(); PriceRange priceRange = new
         * PriceRange();
         * 
         * frame.add(priceRange); frame.add(symbols);
         */

    }

}
