import java.util.ArrayList;
import java.util.List;


public class Operations {

	public int length_menu_items,length_requested_items;
	public String requested_items[];
	public String menu_items[];
	public ArrayList<Restro_Menu> array_list_restro_menu=new ArrayList<>();//arraylist for storing shortlisted objects 
	public  int length_array_list;//main arraylist
	public List<Integer> list_selecled_restro_id=new ArrayList<>();// array to store the restro ids selected,from arraylist
	public ArrayList<Restro_Menu> final_shortlist_restro=new ArrayList<Restro_Menu>();
	public int lenght_selected_restro_list,lenght_final_shortlist_restro;
	double lowest_price;
	int selected_restro_id,selected_restro_index=0;
	
	
	protected void create_menu(String str,String[] required){
		//format string to hold 1 col for each item
		
		menu_items=str.split("#");
		//for(int i=0;i<menu_items.length;i++)
		//System.out.println(menu_items[i]);
		
		// initialize requested_items;
		length_requested_items=required.length;
		requested_items=new String[length_requested_items];
		//initialize requested items array
		for(int i=0;i<length_requested_items;i++)
			requested_items[i]=required[i];
		length_menu_items=menu_items.length;
		find_restro_menu_for_requsted_items();
	}
	
	
	
	
	// scans the menu_items ,if requested items are found creates an object for that and proceeds
	protected void find_restro_menu_for_requsted_items(){
		int flag=0;
		
		for(int i=0;i<length_menu_items;i++){//menu items
			
			for(int j=0;j<length_requested_items;j++){//requested items
				//System.out.println("menu item:"+menu_items[i]+"/n requested items:"+requested_items[j]);
				
				if(menu_items[i].contains(requested_items[j])){
				// create object if found
				Restro_Menu obj=new Restro_Menu(menu_items[i]);
				obj.makeString();
				array_list_restro_menu.add(obj);
				}
				
			}//end of inner for
			
		}//end of outer for
		
		
		
		//parse through the array list and find number of restro ids
		
		length_array_list=array_list_restro_menu.size();
		
		if(length_array_list==0){
			System.out.println("no matching restro was found");
			System.exit(1);
		}
		for(int i=0;i<length_array_list;i++){
			
			int id=array_list_restro_menu.get(i).get_restro_id();
			if(list_selecled_restro_id.isEmpty()){
				list_selecled_restro_id.add(id);
			}
			if(!list_selecled_restro_id.contains(id)){
				list_selecled_restro_id.add(id);
			}
			
			
			
		}
		//displaying the selected list
		for(int j=0;j<list_selecled_restro_id.size();j++){
			System.out.println(list_selecled_restro_id.get(j));
		}
		lenght_selected_restro_list=list_selecled_restro_id.size();
		
		
		for(int i=0;i<lenght_selected_restro_list;i++){
			double price=0.00;
			String food="";
			String food1;
			//String[] food_from_array_list;
			
			
			Restro_Menu obj=new Restro_Menu(list_selecled_restro_id.get(i),0.00,"");
			final_shortlist_restro.add(obj);
			
			for(int j=0;j<length_array_list;j++){
				food1="";
				if(list_selecled_restro_id.get(i)==array_list_restro_menu.get(j).get_restro_id()){
					// add price if id matches and store in final shortlist
					price=array_list_restro_menu.get(j).get_price();
					price+=final_shortlist_restro.get(i).get_price();
					final_shortlist_restro.get(i).set_price(price);
					
					//add food available
					
					food1=array_list_restro_menu.get(j).add_csv_to_food();
					food=food+food1;
					
					final_shortlist_restro.get(i).set_food(food);
					
				}
				
			}//inner for
		}//outer for
		
		for(int i=0;i<final_shortlist_restro.size();i++){
			System.out.println("in final selected arraylist");
			System.out.println(final_shortlist_restro.get(i).food_final_shortlist);
		}
		
		lenght_final_shortlist_restro=final_shortlist_restro.size();
		//check prices now and food count
		
		selected_restro_id=final_shortlist_restro.get(0).get_restro_id();
		lowest_price=final_shortlist_restro.get(0).get_price();
		for(int i=0;i<lenght_final_shortlist_restro;i++){
			
			System.out.println("lowest price:"+lowest_price+"");
			
			for(int j=i+1;j<=lenght_final_shortlist_restro-1;j++){
				if(final_shortlist_restro.get(j).get_price()<=lowest_price)
					lowest_price=final_shortlist_restro.get(j).get_price();
				selected_restro_id=final_shortlist_restro.get(j).get_restro_id();
				selected_restro_index=j;
			}
		}
		
		//check for value meal
		
		
		
		//display the selected restro
		
		
		System.out.println("Selected restro id:"+selected_restro_id+"price :"+final_shortlist_restro.get(selected_restro_index).get_price());
		//System.out.println("food :"+final_shortlist_restro.get(selected_restro_index).food_final_shortlist);
		
		
	}
	
}
