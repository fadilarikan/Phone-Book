public class SLList {

	private SLNode head;
	private int length;

	// initialize the list
	public SLList() {
		head = null;
		length = 0;
	}

	// create method to add name, email, and phone number in String form

	public void add(String name,String address, String workPhoneNumber, String homePhoneNumber , String cellPhoneNumber) {

		SLNode current = head;
		SLNode previous = null;
		SLNode newNode = new SLNode();
		// Set the data

		newNode.setName(name);
                newNode.setAddress(address);
		newNode.setWorkPhoneNumber(workPhoneNumber);
		newNode.setHomePhoneNumber(homePhoneNumber);
                newNode.setCellPhoneNumber(cellPhoneNumber);




	}





	// method to use if the linked list is empty
	public boolean isEmpty() {
		return (length == 0);
	}

}

