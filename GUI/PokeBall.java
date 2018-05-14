package GUI;

public class PokeBall {

    private int typePokeBall ;
    private String name  = "";
    private float chance  ;

    public PokeBall(int n){
        this.typePokeBall = n;
        if(this.typePokeBall ==0){
             this.name = "PokeBall";
             this.chance = (float)0.8;
        }
        else if(this.typePokeBall == 1){
            this.name = "GreatBall";
            this.chance = (float)0.9;
        }
        else if(this.typePokeBall == 2){
            this.name = "UltraBall";
            this.chance = (float)1.0;
        }

    }

    public String getName(){
        return this.name;
    }

    public float getChance(){
        return this.chance;
    }

}