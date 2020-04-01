package entities;

public class PessoaFisica extends Pessoa{
	private Double gastoSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, Double rendaAnual, Double gastoSaude) {
		super(name, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	@Override
	public double imposto() {
		double imposto = getRendaAnual();
		if(imposto < 20000.00) {
			imposto = imposto * 0.15 - gastoSaude * 0.5;
		} else {
			imposto = imposto * 0.25 - gastoSaude * 0.5;
		}
		
		return imposto;
	} 
}
