package ibm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "DucatStudent")
//@Table(name="ducatStud")
public class Student {
	@Id
	private int id;
	@Column(name = "d_name")
	private String name;
	@Column(name = "d_gender")
	private String Gender;
	@Column(name = "d_add")
	private String address;

	public Student(int id, String name, String gender, String address) {
		super();
		this.id = id;
		this.name = name;
		Gender = gender;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Gender=" + Gender + ", address=" + address + "]";
	}

}
