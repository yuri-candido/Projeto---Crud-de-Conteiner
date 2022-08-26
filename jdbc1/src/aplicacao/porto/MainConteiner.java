package aplicacao.porto;

import java.util.Date;

import porto.entidade.Conteiner;
import portoOAD.ObjetoAcessoDados;

public class MainConteiner {

	public static void main(String[] args) {
		
		ObjetoAcessoDados conteinerOAD = new ObjetoAcessoDados();
		Conteiner conteiner = new Conteiner();
		
		conteiner.setCliente("Maria");
		conteiner.setCategoria("Exportação");
		conteiner.setDataCadastro(new Date());
		conteiner.setHoraFim(17.00);
		conteiner.setHoraInicio(16.00);
		conteiner.setTipoMovimentacao("Descarga");
		conteiner.setStatus("cheio");
		conteiner.setNumeroConteiner("TEST1234567");
		conteiner.setTipo(40);
		
		//conteinerOAD.save(conteiner);
		
		Conteiner c1 = new Conteiner();
		
		c1.setCliente("Maria Santos");
		c1.setCategoria("Importação");
		c1.setDataCadastro(new Date());
		c1.setHoraFim(21.00);
		c1.setHoraInicio(19.00);
		c1.setTipoMovimentacao("Embarque");
		c1.setStatus("vazio");
		c1.setNumeroConteiner("Teste00");
		c1.setTipo(20);
		c1.setId(2);
		
		//conteinerOAD.update(c1);
		
		
		conteinerOAD.deleteId(1);
		
		for(Conteiner c : conteinerOAD.getConteiners()) {
			System.out.print("\nRequisitos da Aplicação: \nCliente:" + c.getCliente() + "\n" +
					"Categoria: " + c.getCategoria() + "\n" + "Data de Cadastro:" + c.getDataCadastro()
					+ "\n" + "Hora Fim" + c.getHoraFim() + "\n" + "Hora Inicio" + c.getHoraInicio() +
					"\n" + "Tipo de Movimentação" + c.getTipoMovimentacao() + "\n" + 
					"Status:" + c.getStatus() + "\n" + "Número do Conteiner:" + c.getNumeroConteiner() +
					"\n" + "Tipo:" + c.getTipo());
		} 
	}

}
