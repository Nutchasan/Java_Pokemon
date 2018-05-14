package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonGui extends JFrame{
    private Pokemon pokemon;
    private PokemonFarm pokemonFarm;
    private String[] pokemonList;
    private String pokemonType;

    public PokemonGui(PokemonFarm pokemonFarm){
        super("PokemonGame");

        this.pokemonFarm = pokemonFarm;


        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());

        JLabel jLabelIcon = new JLabel("");
        jLabelIcon.setHorizontalAlignment(JLabel.CENTER);
        Icon img = new ImageIcon(getClass().getResource("/Image/Icon2.png"));
        jLabelIcon.setIcon(img);

        JLabel jLabelIcon2 = new JLabel("");
        jLabelIcon2.setHorizontalAlignment(JLabel.CENTER);
        Icon img2 = new ImageIcon(getClass().getResource("/Image/pikachu_icon.png"));
        jLabelIcon2.setIcon(img2);
        
        JButton jButtonAdd = new JButton("Add My Pokemon");
        JButton jButtonList = new JButton("Choose My Pokemon");
        
        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new AddPokemonGui(pokemonFarm); 
            }
        });

        jButtonList.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               new PokemonListGui(pokemonFarm); 
            }
        });

        p1.add(jLabelIcon);
        p3.add(jLabelIcon2);
        p2.add(jButtonAdd);
        p2.add(jButtonList);

        c.add(p1,BorderLayout.PAGE_START);
        c.add(p3,BorderLayout.CENTER);
        c.add(p2,BorderLayout.PAGE_END);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,600);
        setVisible(true);


    }
    public static void main (String args[]){
        PokemonFarm pokemonFarm = new PokemonFarm();
        new PokemonGui(pokemonFarm);
    }
}