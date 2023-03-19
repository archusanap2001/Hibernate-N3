package org.tnsif.unidirectional;

	import java.io.Serializable;

	import javax.persistence.Entity;
	import javax.persistence.Table;

	@Entity
	@Table(name="Address")
	public class Address implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		//private data members
		private String area;
		private Integer pincode;
		private String city;
		private String state;
		public String getArea() {
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public Integer getPincode() {
			return pincode;
		}
		public void setPincode(Integer pincode) {
			this.pincode = pincode;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		@Override
		public String toString() {
			return "Address [area=" + area + ", pincode=" + pincode + ", city=" + city + ", state=" + state + "]";
		}
		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Address(String area, Integer pincode, String city, String state) {
			super();
			this.area = area;
			this.pincode = pincode;
			this.city = city;
			this.state = state;
		}
		
		

	}


