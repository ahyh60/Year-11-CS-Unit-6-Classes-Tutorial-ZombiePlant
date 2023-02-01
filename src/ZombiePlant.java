public class ZombiePlant {
    private int neededT;
    private boolean danger;
    private int potency;

    public ZombiePlant(int maxP, int successT) {
        if (successT <= 0)
            danger = false;
        else {
            danger = true;
            neededT = successT;
            potency = maxP;
        }
    }

    public int getPotencyRequired() {
        return potency;
    }

    public int treatmentsNeeded() {
        return neededT;
    }

    public boolean isDangerous() {
        if (neededT > 0)
            danger = true;
        else {
            danger = false;

        }
        return danger;
    }

    public void treat(int p) {
        if (p > 0 && p <= potency) {
            if (neededT > 0)
                neededT = neededT - 1;
        }
        if (p <= 0) {
            neededT = neededT;
        }
        if(p > potency){
                neededT = neededT + 1;


        }
    }


    }




