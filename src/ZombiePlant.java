public class ZombiePlant {
    private int neededT;
    private boolean danger;
    private int potency;
    public ZombiePlant(int maxP, int successT){
        if(successT <= 0)
            danger = false;
        else {
            danger = true;
            neededT = successT;
            potency = maxP;
        }
    }
    public int treatmentsNeeded(){
        return neededT;
    }
    public boolean isDangerous(){
        if(neededT>0)
            danger = true;
        else
            danger = false;
        return danger;
    }
    public void treat(int p){
        if(p <= potency) {
            if (neededT > 0)
                neededT = neededT - 1;
        }
        }


    }



