public class Mammal {

    //initial animal energy level
    protected int energyLevel = 100;

    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    //Display energy levels through method
    public int displayEnergyLevel() {
        System.out.println(" Current energy level: " + this.energyLevel);
        return energyLevel;
    }


}
