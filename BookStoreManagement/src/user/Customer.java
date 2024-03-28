package user;

public class Customer {
        private String name;
        private String contactDetails;
        private String purchaseHistory;
        
        public Customer(String name, String contactDetails) {
        	this.name=name;
        	this.contactDetails=contactDetails;
        	this.purchaseHistory="";
        }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getContactDetails() {
			return contactDetails;
		}

		public void setContactDetails(String contactDetails) {
			this.contactDetails = contactDetails;
		}

		public String getPurchaseHistory() {
			return purchaseHistory;
		}

		public void setPurchaseHistory(String purchaseHistory) {
			this.purchaseHistory = purchaseHistory;
		}
	

}