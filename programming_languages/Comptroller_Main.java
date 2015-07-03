import java.io.*;
public class Comptroller_Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {
		
		String csv_file;
		String required_item_list[];//string array
		String csv_file_contents="";//String
		int food_list_size;//number of food items in query
		BufferedReader br=null;
		String csv_split_by=",";
		String line="";
		String split[]=null;
		boolean flag_item_present=false;
		int length_required_food_list=0;
		
		if(args.length<2){
			System.out.println("Kindly enter the correct format");
			System.exit(1);
		}
		//extract food items from args[]
		else{
			csv_file=args[0];
			required_item_list=new String[args.length-1];
			food_list_size=args.length-1;
			for(int i=1;i<=food_list_size;i++){
				required_item_list[i-1]=args[i];
			}
			
			length_required_food_list=required_item_list.length;
			
			
			for(int i=0;i<required_item_list.length;i++)
			System.out.println(required_item_list[i]);
			
			
			try{
			//read the file and parse it
			br=new BufferedReader(new FileReader(csv_file));
				while ((line = br.readLine()) != null) {
				 
					// use comma as separator
					split= line.split(csv_split_by);
					for(int g=0;g<split.length;g++)
						csv_file_contents+=split[g];
						csv_file_contents+="#";
				}
					
			}catch(FileNotFoundException f){
				f.printStackTrace();
			}catch(IOException i){
				i.printStackTrace();
			}
			
			System.out.println(csv_file_contents);
			
			//check if items requested are present in menu of any hotel
			
			for(int i=0;i<length_required_food_list;i++){
				if(flag_item_present==true)
					break;
				
				flag_item_present=csv_file_contents.contains(required_item_list[i]);
				
			}
			
			if(flag_item_present){ // if present process further
				System.out.println("requested items are present/n processing your request");
				Operations operation_obj=new Operations();
				operation_obj.create_menu(csv_file_contents,required_item_list);
			}
			
			else{
				System.out.println("requested items are not present");
				System.exit(0);
			}
			
			
			
			
			
		}
		
	}

}
