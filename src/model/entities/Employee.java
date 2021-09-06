package model.entities;

public class Employee implements Comparable<Employee>{
	
	private String nome;
	private Double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String nome, Double salary) {
		super();
		this.nome = nome;
		this.salary = salary;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee other) {
		return -this.salary.compareTo(other.getSalary());
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.nome + ", ");
		sb.append(String.format("R$ %.2f", this.salary));
		return sb.toString();
	}
}
