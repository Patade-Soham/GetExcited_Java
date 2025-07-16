public class Rectangle {
    int len;
    int bre;
    Rectangle(){
        this.len=10;
        this.bre=5;
    }
    Rectangle(int l,int b){
        this.len=l;
        this.bre=b;
    }
    void area(){
        System.out.println("Area of Rectangle is "+this.len*this.bre);
    }
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.area();
        Rectangle r2 = new Rectangle(7,2);
        r2.area();
    }
}
