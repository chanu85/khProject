package part06;

public class DeptDTO {
	

	private String department_id, department_name, location_id;



	public DeptDTO() {

	}

	
	public DeptDTO(String department_id, String department_name) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
	}
	
	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public String getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(String department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

}// end class
