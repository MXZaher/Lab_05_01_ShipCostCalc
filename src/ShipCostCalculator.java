import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        System.out.print("Order Price?: ");
        Scanner op = new Scanner(System.in);
        double shippingCost = 0;
        double orderPrice = op.nextDouble();
        if(orderPrice >= 100){
            shippingCost = 0;
        }
        else{
            shippingCost = orderPrice * .02;
        }
        orderPrice = orderPrice + shippingCost;
        System.out.println("The total cost after shipping is: $" + orderPrice);
    }

}
