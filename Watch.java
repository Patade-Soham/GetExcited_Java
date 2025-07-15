public class Watch {
    String type;
    String brand;
    double cost;

    void setDetails(String t,String b,double c){
        this.type=t;
        this.brand=b;
        this.cost= c;
    }

    void display(){
        System.out.println("Tupe : "+type);
        System.out.println("Brand : "+brand);
        System.out.println("Cost : Rs."+cost);


    }
    public static void main(String[] args) {
        
        Watch watch1 = new Watch();
        watch1.setDetails("analog","titan",3423);

        watch1.display();


    }
}
