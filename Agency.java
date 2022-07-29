package models;

public class Agency {
    private Dood[] doods;

    public Agency(Dood[] doods) {
        this.doods = new Dood[doods.length];
        for (int i = 0; i < doods.length; i++) {
            this.doods[i] = new Dood(doods[i]);
        }
    }

    public void setDood(Dood dood, int index) {
        this.doods[index] = new Dood(dood);
    }

    public Dood getDood(int index) {
        return this.doods[index] == null ? null : new Dood(this.doods[index]);
    }

    public int getLength() {
        return this.doods.length;
    }
    
    public void adoption(int index) {
        if (this.isEmpty()) {
            throw new IllegalStateException("Cannot call adoption when the agency is empty.");
        }  
        this.doods[index].adopt();
        this.doods[index] = null;
    }


    public boolean isEmpty() { // returns true if there are no more doods
        for (int i = 0; i < doods.length; i++) {
            if (doods[i] != null) {
                return false;
            }
        }
        return true;
    }

     
    public String toString() {
        String temp = "\n\n";
        for (int i = 0; i < this.doods.length; i++) {
            temp += "\tKennel Number: " + i +  "\n";
            if (this.doods[i] == null) {
                temp += "\tEmpty\n\n";
            } else {
                temp += this.doods[i].toString() + "\n";
            }
        }
        return temp;
    }


}
