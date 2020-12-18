import java.util.*;


public class PhoneBook {

	public static void main(String[] args) {
                TreeSet<String> names = new TreeSet<String>();
                TreeSet<String> works= new TreeSet<String>();
                TreeSet<String> homes = new TreeSet<String>();
                TreeSet<String> cells = new TreeSet<String>();
                TreeSet<String> addresses=new TreeSet<String>();
		SLList newList = new SLList();
		Scanner in = new Scanner(System.in);

		String menu;
		boolean done = false;

		do {
			System.out.println(" Create new person(A)  \n Search a person(B) \n Search a workphone number(C) \n Search a homephone number(D) \n Search a cellphone number(E) \n List all(F) \n Exit(G) ");	
			System.out.format("Please enter a letter: ");
			menu = in.nextLine().toUpperCase();

			switch (menu) {
				case "A": 
					
					
					System.out.print("Enter a FIRST and LAST Name: ");
					String name = in.nextLine();
                                        names.add(name);
                                        System.out.println("Enter an address: ");
                                        String address = in.nextLine();
                                        addresses.add(address);
                                        System.out.println("If you want to save numbers enter 1 or 0 to quit:");
                                        String binary =in.nextLine();
                                        switch(binary){          
                                   case"1":
					System.out.print("Enter WORKPHONE NUMBER: ");
					String workPhoneNumber = in.nextLine();
                                        works.add(workPhoneNumber);
                                        
                                        
                                        System.out.print("Enter HOMEPHONE NUMBER: ");
					String homePhoneNumber = in.nextLine();
                                        homes.add(homePhoneNumber);
                                        
                                        System.out.print("Enter CELLPHONE NUMBER: ");
					String cellPhoneNumber = in.nextLine();
                                        cells.add(cellPhoneNumber);
					newList.add(name,address,workPhoneNumber ,homePhoneNumber ,cellPhoneNumber);
                                   case"0":
                                       newList.add(name, address, null , null,null );
                                    break;
                                        }
                                        break;
                                        
                                case "B": 
                                   int j=0;
					System.out.print("Enter a Name to search for: ");
                                        String sName= in.nextLine();

                                         for(String item : names){
                                            if(j<10){
                                             if(names.contains(item))
                                         System.out.println((j+1)+".\t"+item);
                                         j++;
                                         
                                         }
                                    }
					break; 
                                case "C": 
                                       int k=0;

 					System.out.print("Enter a workphone number to search for: ");
 					String sWorkPhoneNumber = in.nextLine();

                                         for(String item : works){
                                            if(k<10){
                                             if(works.contains(item))
                                         System.out.println((k+1)+".\t"+item);
                                         k++;
                                         
                                         }
                                    }
					break; 

                                case "D": 
                                     int l=0;   
                                        System.out.print("Enter a homephone number to search for: ");
 					String sHomePhoneNumber = in.nextLine();

                                         for(String item : homes){
                                            if(l<10){
                                             if(homes.contains(item))
                                         System.out.println((l+1)+".\t"+item);
                                         l++;
                                         
                                         }
                                    }
					break; 

                                case "E": 
                                    int m=0;
 					System.out.print("Enter a cellphone number to search for: ");
 					String sCellPhoneNumber = in.nextLine();

                                         for(String item : cells){
                                            if(m<10){
                                             if(cells.contains(item))
                                         System.out.println((m+1)+".\t"+item);
                                         m++;
                                         
                                         }
                                    }
					break; 
				case "F": 
					 int i=0;
					System.out.println("Print List: ");
					 for(String item : names){
                                         System.out.println((i+1)+".\t"+item);
                                         i++;
                                         }
					break; 
                                case "G": 
					System.out.println("Exiting!");
					done = true;
					break;
				default: 
					System.out.println("ERROR!!!");
                                        
													}

		}  while (!done);
		System.out.println("Thanks for using our program!");

	}
}