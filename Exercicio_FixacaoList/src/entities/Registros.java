package entities;

public class Registros {
	private int Id;
	private String name;
	private double salario;
	
	public Registros(int id, String name, double salario) {
		super();
		Id = id;
		this.name = name;
		this.salario = salario;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public
	
}
