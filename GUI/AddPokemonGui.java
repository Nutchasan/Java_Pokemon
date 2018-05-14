package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class AddPokemonGui extends JFrame{
    private String[] pokemonList ={"Eevee",
                                    "Espeon",
                                    "Snorlax"};

    private PokemonFarm pokemonFarm;

    public AddPokemonGui(PokemonFarm pokemonFarm){
        super("AddPokemon");

        this.pokemonFarm = pokemonFarm;

        Container c = getContentPane();
        c.setLayout(new GridLayout(0,2));

        JComboBox jComboBoxChoose = new JComboBox(pokemonList);
        
        JLabel jLabelType = new JLabel("Type: ");
        JLabel jLabelName = new JLabel("Name: ");
        JLabel jLabelWeight = new JLabel("Weight: ");
        JLabel jLabelLenght = new JLabel("Lenght: ");

        JTextField jTextFieldName = new JTextField(10);
        JTextField jTextFieldWeight = new JTextField(10);
        JTextField jTextFieldLeght = new JTextField(10);

        JButton jButtonSelect = new JButton("Select");
        JButton jButtonCancel = new JButton("Cancel"); 

        jButtonSelect.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String type = (String) jComboBoxChoose.getSelectedItem();
                String name = jTextFieldName.getText();
                float weight = Float.parseFloat(jTextFieldWeight.getText());
                float length = Float.parseFloat(jTextFieldLeght.getText());

                if(type.equals("Eevee")){
                    Eevee eevee = new Eevee(name,weight,length);
                    pokemonFarm.addPokemon(eevee);
                }
                else if(type.equals("Espeon")){
                    Espeon espeon = new Espeon(name,weight,length);
                    pokemonFarm.addPokemon(espeon);
                }
                else if(type.equals("Snorlax")){
                    Snorlax snorlax = new Snorlax(name,weight,length);
                    pokemonFarm.addPokemon(snorlax);
                }

                setVisible(false);
            }
        });

        jButtonCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        c.add(jLabelType);
        c.add(jComboBoxChoose);
        c.add(jLabelName);
        c.add(jTextFieldName);
        c.add(jLabelWeight);
        c.add(jTextFieldWeight);
        c.add(jLabelLenght);
        c.add(jTextFieldLeght);
        
        c.add(jButtonSelect);
        c.add(jButtonCancel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }                                
}
