public class SLNode  {

	private String name;
        private String address;
        private String workPhoneNumber;
        private String homePhoneNumber;
        private String cellPhoneNumber;
	private SLNode next;
	
	
	// create instance of SLNode and set next to 'null'
	public SLNode() {
		//data = -1;
		next = null;
	}

	/**
	 * create setters and getters for name, email, phone number, and SLNode
	 */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
        public String getAddress(){
            return address;
        }
        public void setAddress(String address){
            this.address=address;
        }

	public String getWorkPhoneNumber() {
		return workPhoneNumber;
	}

	public void setWorkPhoneNumber(String workPhoneNumber) {
		this.workPhoneNumber = workPhoneNumber;
	}
        
	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;    
	}
        
        public String getCellPhoneNumber() {
		return cellPhoneNumber;
	}

	public void setCellPhoneNumber(String cellPhoneNumber) {
		this.cellPhoneNumber = cellPhoneNumber;
	}
	public SLNode getNext() {
		return next;
	}

	public void setNext(SLNode next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Name : " + name + "Address : "+ address + " Workphone: "
				+ workPhoneNumber +" \tHomephone:  " +homePhoneNumber +"\tCellphone" +cellPhoneNumber;
	}
}