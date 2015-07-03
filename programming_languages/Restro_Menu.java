import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;


public class Restro_Menu {
	
	String split[];

	private int restro_id;
	private double price;
	private String food[];// contains food for dat price
	private int food_count;
	public  String food_final_shortlist;
	
	public Restro_Menu(String input_str) {
		System.out.println("making objcet");
		// TODO Auto-generated constructor stub
		split=input_str.split(" ");
		restro_id=Integer.parseInt(split[0]);
		price=Double.parseDouble(split[1]);
		int split_length=split.length;// lenght of the splitted string
		food=new String[split_length-2];//
		int i=2,j=0;
		while(i<split_length){
			food[j]=split[i];
			i++;
			j++;
			
		}
		food_count=food.length;
		
		//makeString();	
	}
	
	public Restro_Menu(int rid,double rprice,String rfood){
		restro_id=rid;
		price=rprice;
		food_final_shortlist=rfood;
		
	}
	
	
	public int get_restro_id(){
		return restro_id;
	}
	
	public double get_price(){
		return price;
	}
	
	public String[] get_food(){
		return food;
	}

	public int get_foodcount(){
		return food_count;
	}

	
	public void makeString() {
		System.out.println("Restroid= "+restro_id+"price ="+price);
		for(int i=0;i<food.length;i++)
			System.out.println("/n"+food[i]);
	}
	 
	
	public void set_price(double p){
		price=p;
	}
	
	public void set_food(String food){
		food_final_shortlist+=food;
	}
	
	
	public String add_csv_to_food(){
		String foodtoreturn="";
		for(int i=0;i<food.length;i++){
			foodtoreturn=foodtoreturn+food[i];
			System.out.println(food[i]);
			foodtoreturn+=",";
		}
		
		return foodtoreturn;
	}
	
}
