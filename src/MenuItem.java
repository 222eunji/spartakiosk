import javax.xml.namespace.QName;

public class MenuItem {
    // 1.속성
      private String name;
      private double price;
      private String detail;


    // 2.생성자
    MenuItem(String name, double price, String detail) {
        this.name = name;
        this.price = price;
        this.detail = detail;
    }


    // 3.기능
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public String getDetail(){
        return detail;
    }


}
