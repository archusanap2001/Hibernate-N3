package org.tnsif.bidirectional;
	import java.io.Serializable;
	import javax.persistence.CascadeType;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.OneToMany;
	import javax.persistence.Table;
	//PROGRAM TO DEMONSTRATE ON ONETOMANY AND MANYTOONE BIDIRECTIONAL
	@Entity
	@Table(name="Person")
	public class Person implements Serializable{
	

		private static final long serialVersionUID = 1L;
		
		@Id
		private Integer adharno;
		private String name;
		
		@ManyToOne(cascade=CascadeType.ALL)
		@JoinColumn(name="contactNO")
		private Contact contact;

		public Integer getAdharno() {
			return adharno;
		}

		public void setAdharno(Integer adharno) {
			this.adharno = adharno;
		}

}
