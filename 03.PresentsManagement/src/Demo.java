import java.util.Arrays;
public class Demo {
    //Implement console program which will meet the following requirements:
    //
    //Implement a hierarchy of Sweets. All Sweets should have next properties: name, weight and sugarWeight. Weight is a weight of the specific sweet in kilograms. sugarWeight is a weight of sugar in this sweet in kilograms.
    //
    //I don’t want to give you specific directions here to give you an opportunity to decide what will work the best here to start describing the Sweet hierarchy: an interface or an abstract class?
    //
    //
    //Candy, Lollipop and Cookie - two other types from Sweet hierarchy.
    //
    //
    //Create class Present. Present has next behavior:
    //
    //
    //// the method filters sweets by sugar weight inclusively
    //public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight) {
    //<write your code here>
    //}
    //
    //// the method calculates total weight of the present
    //public double calculateTotalWeight() {
    //<write your code here>
    //}
    //
    //// the method that adds sweet to the present
    //public void addSweet(Sweet sweet) {
    //<write your code here>
    //}
    //
    //
    //
    //// the method returns copy of the Sweet[] array so that nobody could
    //// modify state of the present without addSweet() method.
    //// Also array shouldn’t contain null values.
    //
    //public Sweet[] getSweets() {
    //
    //<write your code here>
    //
    //}
    public static void main(String[] args) {
        // code works but as always compiler not 2 errors
        Sweet candy = new ChocolateCandy();
        candy.setName("Ritter Sport");
        candy.setSugarWeight(0.53);
        candy.setWeight(0.05);

        Cookie cookie = new Oreo();
        cookie.setName("Milk Oreo");
        cookie.setSugarWeight(0.1);
        cookie.setDoughWeight(0.3);
        cookie.setWeight(0.2);

        Sweet lollipop = new Lollipop();
        lollipop.setWeight(0.5);
        lollipop.setName("Lollipop");
        lollipop.setSugarWeight(0.2);

        Present present = new Present();
        present.addSweet(candy);
        present.addSweet(cookie);
        present.addSweet(lollipop);

        Sweet[] filteredSweets = present.filterSweetsBySugarRange(0, 0.20);
        System.out.println(Arrays.toString(filteredSweets));

        System.out.println("Total weight of the present: " + present.calculateTotalWeight());
        Sweet[] sweetsCopy = present.getSweets();
        System.out.println(Arrays.toString(sweetsCopy));
    }
}