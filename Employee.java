class Employee {
    static String companyName="KMMI";
    String name;
    int id;

    Employee(int id,String n){
        this.id=id;
        this.name=n;

    }
    void display(){
        System.out.println("Name : "+this.name);
        System.out.println("ID : "+ this.id);
        System.out.println("Company : "+companyName);


    }
    static String newName(String c){
        return companyName=c;

    }
    public static void main(String[] args) {
        Employee e1=new Employee(1, "Soham");
        Employee e2=new Employee(2, "Jay");
        e1.display();
        Employee.newName("VIT");
        e2.display();
    }




}
