package entities;

public class PessoaJuridica extends Pessoa {
	private Integer numFuncionario;
	
	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, Double rendaAnual, Integer numFuncionario) {
		super(name, rendaAnual);
		this.numFuncionario = numFuncionario;
	}

	public Integer getNumFuncionario() {
		return numFuncionario;
	}

	public void setNumFuncionario(Integer numFuncionario) {
		this.numFuncionario = numFuncionario;
	}
	
	@Override
	public double imposto() {
		double imposto = getRendaAnual();
		if(numFuncionario > 10) {
			imposto *=  0.14;
		} else {
			imposto *= 0.16;
		}
		
		return imposto;
	}
}
