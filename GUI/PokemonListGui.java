package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonListGui extends JFrame{
    private Pokemon pokemon;
    private PokemonFarm pokemonFarm;
    private String[] pokemonList;
    private String pokemonType;

    public PokemonListGui(PokemonFarm pokemonFarm){
        super("PokemonGame");

        this.pokemonFarm = pokemonFarm;


        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(0,1));
        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(0,1));
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        
        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout(0,1));

        JLabel jLabelBox = new JLabel("");
        jLabelBox.setHorizontalAlignment(JLabel.CENTER);
        Icon img = new ImageIcon(getClass().getResource("/Image/nothing.png"));
        jLabelBox.setIcon(img);

        Icon imgPokemon = new ImageIcon(getClass().getResource("/Image/nothing2.png"));
        JLabel jLabelpic = new JLabel();
        jLabelpic.setIcon(imgPokemon);

        JLabel jLabelImage = new JLabel("Pokemon_Image");
        
        JButton jButtonFeed = new JButton("Feed");
        JButton jButtonWalk = new JButton("Walk");
        JButton jButtonBattle = new JButton("Battle");
        
        JButton jButtonStatus = new JButton("Show Status");
        JButton jButtonCancel = new JButton("Back to Menu");

        JLabel jLabelNameInfo = new JLabel("Please Select and Show status");
        JLabel jLabelWeightInfo = new JLabel("");
        JLabel jLabelHealtInfo = new JLabel("");
        JLabel jLabelEXPInfo = new JLabel("");
        JLabel jLabelLevelInfo = new JLabel("");
        JLabel jLabelStepLengthInfo = new JLabel("");
        

        
        pokemonList = new String[pokemonFarm.getPokemonSize()];

        for (int i = 0; i < pokemonFarm.getPokemonSize(); i++) {
            pokemonList[i] = pokemonFarm.getPokemonName(i);
        }
        JComboBox jComboBoxList = new JComboBox(pokemonList);

        jButtonFeed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = (String) jComboBoxList.getSelectedItem();
                Pokemon thisPokemon = pokemonFarm.getPokemon(name);
                thisPokemon.eat();
                jLabelWeightInfo.setText("Weight : " + thisPokemon.getWeight());
                jLabelHealtInfo.setText("Healt : " + thisPokemon.getHealt() + "%");
            }
        });

        jButtonWalk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = (String) jComboBoxList.getSelectedItem();
                Pokemon thisPokemon = pokemonFarm.getPokemon(name);
                thisPokemon.walk();
                jLabelWeightInfo.setText("Weight : " + thisPokemon.getWeight());

            }
        });
        
        jButtonBattle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = (String) jComboBoxList.getSelectedItem();
                Pokemon thisPokemon = pokemonFarm.getPokemon(name);
                thisPokemon.levelUp();
                jLabelHealtInfo.setText("Healt : " + thisPokemon.getHealt() + "%");
                jLabelEXPInfo.setText("EXP : " + thisPokemon.getEXP() + "%");
                jLabelLevelInfo.setText("Level :" + thisPokemon.getLevel());
            }
        });

        jButtonStatus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = (String) jComboBoxList.getSelectedItem();
                Pokemon thisPokemon = pokemonFarm.getPokemon(name);
                jLabelpic.setIcon(new ImageIcon(getClass().getResource("/Image/" + thisPokemon.getClass().getSimpleName() + ".gif")));
                jLabelNameInfo.setText("Name : " + thisPokemon.getName());
                jLabelWeightInfo.setText("Weight : " + thisPokemon.getWeight());
                jLabelHealtInfo.setText("Healt : " + thisPokemon.getHealt() + "%");
                jLabelEXPInfo.setText("EXP : " + thisPokemon.getEXP() + "%");
                jLabelLevelInfo.setText("Level :" + thisPokemon.getLevel());
                jLabelStepLengthInfo.setText("Step Length : " + thisPokemon.getStepLength());
            }
        });

        jButtonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        p1.add(jLabelBox);
        p1.add(jLabelpic);
        
        p4.add(jLabelNameInfo);
        p4.add(jLabelWeightInfo);
        p4.add(jLabelStepLengthInfo);
        p4.add(jLabelHealtInfo);
        p4.add(jLabelEXPInfo);
        p4.add(jLabelLevelInfo);
        
        p2.add(jButtonFeed);
        p2.add(jButtonWalk);
        p2.add(jButtonBattle);

        p3.add(jComboBoxList);
        p3.add(jButtonStatus);
        p3.add(jButtonCancel);

        c.add(p1,BorderLayout.LINE_START);
        c.add(p4,BorderLayout.CENTER);
        c.add(p2,BorderLayout.LINE_END);
        c.add(p3,BorderLayout.PAGE_END);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700,400);
        setVisible(true);
    }
}

