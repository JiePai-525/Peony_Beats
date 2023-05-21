package applet.beats.bean;


public class QBean {
	
	private String q_sku; 
	private String q_desc; 
	private String q_title;
	private double q_price; 
	private String q_image; 
	
	private String f_name;
	 private String l_name;
	 private String address;
	 private int phone;
	 private String email;
	 private String city;
	 private String state;
	 private int zip;
	 private int card_info; 
	 private int q_id;
	
	
	public void setID(int q_id) {
		
		
		this.q_id = q_id; 
	}
	
	 
	public int getID() {
		
		return q_id;
		
	}
	 public void setFName(String f_name) {
		 
		 
		 this.f_name = f_name;  
	 }
	 
	 
	 public String getFName() {
		 
		 
		 return f_name; 
	 }
	 
	 
	 
	 public void setLName(String l_name) {
		 
		 
		 this.l_name = l_name; 
	 
	 }
	 
	 
	 public String getLName() {
		 
		return l_name;  
	 }
		 
	 public void setAddress(String address) {
		 
		 
		 this.address = address; 
	 }
	 
	 
	 public String getAddress() {
		 
		 
		 return address; 
	 }
	 
	 
	 public void setPhone(int phone) {
		 
		 
		 this.phone = phone; 
	 }
	 
	 
	 public int getPhone () {
		 
		 
		 return phone; 
	 }
	 
	 
	 public void setEmail(String email) {
		 
		 this.email = email;
		 
	 }
	 
	 public String getEmail() {
		 
		 return email;
		 
	 }
	 
	 public void setCity(String city) {
		 
		 this.city = city; 
		 
		 
	 }
	 
	 
	 public String getCity() {
		 
		 
		 return city; 
		 
	 }
	 
	 
	 
	 public void setState(String state) {
		 
		 
		 this.state = state; 
	 }
	 
	 
	 public String getState () {
		 
		 return state;
		 
	 }
	 
	 
	 public void setZip (int zip) {
		 
		 
		 this.zip = zip; 
		 
	 }
	 
	 
	 public int getZip() { 
	 
	 return zip; 
	 
	 }
	 
	 public void setCardInfo(int card_info) {
		 
		 
		 this.card_info = card_info;
	 }
	 
	 
	 
	 public int getCardInfo() {
		 
		 return card_info;
		 
		 
	 }
	 
	 
	 
	 
	public void setSku(String q_sku) {
		
		this.q_sku = q_sku; 

		
	}
	
			public String getSku() {
		
					return q_sku; 
		
					}
	
	
	public void setDesc(String q_desc) {
		
				this.q_desc = q_desc; 
		
				}
	
	
				public String getDesc()  {
		
						return  q_desc; 
						}
	
	
	public void setTitle(String q_title) {
		
		
		this.q_title = q_title;  
		
	}
	
	
			public String getTitle() {
		
					return q_title; 	
		
					}
			

			public void setPrice(double q_price) {
    	
    	
				this.q_price = q_price; 
    	
				}
			
	
			
			public double getPrice() {
				
				return q_price; 
				
				
			}
			
			
			public void setImage(String q_image) {
				
				this.q_image = q_image; 
				
				
			}
			
			
			public String getImageURL() {
		    
				
				String imageURL = "/images/music/warriors.png";
				
		        return imageURL;
		    }
			
			
			
			
}
