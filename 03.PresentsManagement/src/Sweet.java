public abstract class Sweet {
    String name;
    double weight;
    double sugarWeight;

    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setSugarWeight (double sugarWeight){
        this.sugarWeight = sugarWeight;
    }
    public String toString(){
        return "Sweet [name=" + name + ", weight=" + weight + ", sugarWeight=" + sugarWeight + "]";
    }
}
