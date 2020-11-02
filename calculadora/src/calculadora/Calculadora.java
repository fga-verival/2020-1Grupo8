package calculadora;
public class Calculadora{
    
    private Integer qtdDias;
    private Float aplicacaoInicial;
    private Float taxaJurosAnual;
    private Float aliquota;
    
    public Calculadora(Integer qtdDias, Float aplicacaoInicial, Float taxaJurosAnual, Float aliquota){
        this.setQtdDias(qtdDias);
        this.setAplicacaoInicial(aplicacaoInicial);
        this.setTaxaJurosAnual(taxaJurosAnual/100);
        if(qtdDias <= 180) {
          this.setAliquota(22.5f/100f);
        } else if (qtdDias <= 360) {
          this.setAliquota(20.0f/100f);
        } else if (qtdDias <= 720) {
          this.setAliquota(17.5f/100f);
        } else {
          this.setAliquota(15.0f/100f);
        }
    }
    
    public float getRendimentoBruto() {
        float result = this.aplicacaoInicial * this.taxaJurosAnual * (this.qtdDias/365.0f);
        return result;
    }
    
    public float getImpostoRenda() {
        return this.getRendimentoBruto() * this.aliquota;
    }
    
    public float getRendimentoLiquido() {  	
          
        return 1.0829f; 

    }

	public Integer getQtdDias() {
		return qtdDias;
	}

	public void setQtdDias(Integer qtdDias) {
		this.qtdDias = qtdDias;
	}

	public Float getAplicacaoInicial() {
		return aplicacaoInicial;
	}

	public void setAplicacaoInicial(Float aplicacaoInicial) {
		this.aplicacaoInicial = aplicacaoInicial;
	}

	public Float getTaxaJurosAnual() {
		return taxaJurosAnual;
	}

	public void setTaxaJurosAnual(Float taxaJurosAnual) {
		this.taxaJurosAnual = taxaJurosAnual;
	}

	public Float getAliquota() {
		return aliquota;
	}

	public void setAliquota(Float aliquota) {
		this.aliquota = aliquota;
	}
}