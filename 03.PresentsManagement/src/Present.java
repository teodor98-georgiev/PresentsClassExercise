import java.util.ArrayList;


public class Present {
    ArrayList<Sweet> sweets = new ArrayList<>();
    ArrayList<Sweet> filteredSweets = new ArrayList<>();
    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweets){
            totalWeight = totalWeight + sweet.weight;
        }
        return totalWeight;
    }

    public Sweet[] filterSweetsBySugarRange(double minSugarWeight,
                                            double maxSugarWeight) {
        for (Sweet sweet : sweets){
            if (sweet.sugarWeight >= minSugarWeight && sweet.sugarWeight <= maxSugarWeight){
                filteredSweets.add(sweet);
            }
        }
        return filteredSweets.toArray(new Sweet[0]);
    }

    public Sweet[] getSweets() {
        ArrayList<Sweet> sweetsCopy = new ArrayList<>();
        for (Sweet sweet : sweets){
            if (!sweet.equals(null)){
                sweetsCopy.add(sweet);
            }
        }
        return sweetsCopy.toArray(new Sweet[0]);
    }
}
