package portoOAD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;
import porto.entidade.Conteiner;
import porto.conexao.ConexaoBanco;

public class ObjetoAcessoDados {
	
	public void save(Conteiner conteiner) {
		
		String sql = "INSERT INTO requisitos(cliente, numeroConteiner, tipo, statuss, categoria,"
				+ "tipoMovimentacao, dataCadastro, horaInicio, horaFim) VALUES (?, ?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
		
		
		conn = ConexaoBanco.conexaoMySQL();
		
		pstm = (PreparedStatement) conn.prepareStatement(sql);
		
		pstm.setString(1, conteiner.getCliente());
		pstm.setString(2, conteiner.getNumeroConteiner());
		pstm.setInt(3, conteiner.getTipo());
		pstm.setString(4, conteiner.getStatus());
		pstm.setString(5, conteiner.getCategoria());
		pstm.setString(6, conteiner.getTipoMovimentacao());
		pstm.setDate(7, new Date(conteiner.getDataCadastro().getTime()));
		pstm.setDouble(8, conteiner.getHoraInicio());
		pstm.setDouble(9, conteiner.getHoraFim());
		
		pstm.execute();
		System.out.print("Contato Salvo!");
		} 
		
		catch(Exception e) {
			e.printStackTrace();
		} 
		
		finally { 
			try {
				if(pstm != null) {
					pstm.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
				} }
			
		}
	
	
		public void update (Conteiner conteiner) {
			String sql = "UPDATE requisitos SET cliente=?, numeroConteiner = ?, tipo = ?, statuss = ?,"
					+ "categoria = ?, tipoMovimentacao = ?, dataCadastro =?, horaInicio = ?, horaFim = ?"
					+ "WHERE id = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = ConexaoBanco.conexaoMySQL();
				pstm = (PreparedStatement) conn.prepareStatement(sql);
				
				pstm.setString(1, conteiner.getCliente());
				pstm.setString(2, conteiner.getNumeroConteiner());
				pstm.setInt(3, conteiner.getTipo());
				pstm.setString(4,  conteiner.getStatus());
				pstm.setString(5, conteiner.getCategoria());
				pstm.setString(6, conteiner.getTipoMovimentacao());
				pstm.setDate(7, new Date(conteiner.getDataCadastro().getTime()));
				pstm.setDouble(8, conteiner.getHoraInicio());
				pstm.setDouble(9, conteiner.getHoraFim());
				pstm.setInt(10, conteiner.getId());
				
				pstm.execute();			
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstm!= null) {
						pstm.close();
					}
					
					if(conn != null) {
						conn.close();
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
			
		}
	
	
		public void deleteId (int id) {
			String sql = "DELETE FROM  requisitos WHERE id = ?";
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			try {
				conn = ConexaoBanco.conexaoMySQL();
				pstm = (PreparedStatement) conn.prepareStatement(sql);
				
				pstm.setInt(1, id);
				pstm.execute();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if(pstm != null) {
						pstm.close();
					}
					if(conn != null) {
						conn.close();
					}
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		public List<Conteiner> getConteiners () {
			
			String sql = "SELECT * FROM requisitos";
			List<Conteiner> conteiners = new ArrayList<Conteiner>();
			
			Connection conn = null;
			PreparedStatement pstm = null;
			
			ResultSet rset = null;
			
			try {
				conn = ConexaoBanco.conexaoMySQL();
				pstm = conn.prepareStatement(sql);
				rset = pstm.executeQuery();
				
				while (rset.next()) {
					Conteiner conteiner = new Conteiner();
					
					conteiner.setCliente(rset.getString("cliente"));
					conteiner.setNumeroConteiner(rset.getString("numeroConteiner"));
					conteiner.setTipo(rset.getInt("tipo"));
					conteiner.setStatus(rset.getString("statuss"));
					conteiner.setCategoria(rset.getString("categoria"));
					conteiner.setTipoMovimentacao(rset.getString("tipoMovimentacao"));
					conteiner.setDataCadastro(rset.getDate("dataCadastro"));
					conteiner.setHoraInicio(rset.getDouble("horaInicio"));
					conteiner.setHoraFim(rset.getDouble("horaFim"));
					
					conteiners.add(conteiner);					
					
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if ( rset!= null) {
						rset.close();
					}
					
					if(pstm != null) {
						pstm.close();
					}
					
					if (conn != null) {
						conn.close();
					}
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			return conteiners;
		}
	} 
	

