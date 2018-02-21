
class Pokeball{
    private float poss;
    public Pokeball(float poss){
        this.poss = poss;
    }

    public void normalBall(){
        this.poss = 0.8;
        return this.poss;
    }

    public void greatBall(){
        this.poss = 0.9;
        return this.poss;
    }

    public void ultraBall(){
        this.poss = 1.0;
        return this.poss;
    } 
}