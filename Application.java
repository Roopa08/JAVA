import java.util.Scanner;
class CafeApplication {

	public static void main(String[] args) {
				Coffeeone obj=new Coffeeone();
			     obj.method();
			     
			    }

			}
			class Coffeeone
			{
				Scanner s=new Scanner(System.in);
			        int cost=0,total=0,quantity=0;
			        		double discount=0;
				public void method()
				{
			       do
			       {
					System.out.println("welcome");
					System.out.println("the list of coffees we have");
					System.out.println("1. americano 100");
					System.out.println("2. icedamericano 160");
					System.out.println("3. blackcoffee 120");
			        System.out.println("4. latte 140");
			        System.out.println("5. expresso 120");
			        System.out.println("6. hotchocolate 180");
					System.out.println("what do you want to order");
				    String num=s.next();
			        System.out.println("enter quantity");
				    int quantity=s.nextInt();
			        switch(num)
			        {
			        case "americano":
			                                  cost=100;
			                                  System.out.println("cost is"+cost);
			                                  total=total+cost*quantity;
			                                  break;
			                                  
			         case "icedamericano":
			                                  cost=160;
			                                  System.out.println("cost is"+cost);
			                                  total=total+cost*quantity;
			                                  break;
			                                  
			         case "blackcoffee":
			                                  cost=110;
			                                  System.out.println("cost is"+cost);
			                                  total=total+cost*quantity;
			                                  break;
			                                  
			         case "latte":
			                                  cost=140;
			                                  System.out.println("cost is"+cost);
			                                  total=total+cost*quantity;
			                                    break;
			                                  
			         case "expresso":
			                                  cost=120;
			                                  System.out.println("cost is"+cost);
			                                  total=total+cost*quantity;
			                                   break;
			                                  
			         case "hotchocolate":
			                                   cost=180;
			                                    System.out.println("cost is"+cost);
			                                 total=total+cost*quantity;
			                                   break;
			       }
					System.out.println("do you want to order more");
					String decision=s.next();
					if(decision.equals("no"))
					{
			            System.out.println("total cost is"+total);
			            if(total>2000)
						{
							System.out.println("you will get 80% discount");
							discount=((80/100.0)*total);
							System.out.println(discount);
						}
						else if(total>1000)
						{
							System.out.println("you will get 50% discount");
							discount=((50/100.0)*total);
							System.out.println(discount);
						}
						else if(total>500)
						{
							System.out.println("you will get 20% discount");
							discount=(20/100.0)*total;
							System.out.println(discount);
						}
						else
						{
							System.out.println("you will not get discount");
						System.out.println(total);
						}
						break;
			                      
					}
			      }
					while(true);
			       }


}