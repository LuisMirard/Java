package vacinas;

import java.util.List;
import java.util.Scanner;

public class VacinasAction {
		
		private Scanner ler = new Scanner(System.in);
		
		
		public void cadastrar(myList<Vacinas> vac, Integer count,String desc){	
			Vacinas obj = new Vacinas();			
			obj.setCodigo(count);
			obj.setDescricao(desc);
			vac.add(obj);
			System.out.println("CADASTRO REALIZADO COM SUCESSO!!!!");						
			
		}
		public void editar(Integer codigo, String descricao, myList<Vacinas> vac){
			if(vac == null/* || vac.isEmpty()*/){
				System.out.println("SEM REGISTRO");
			}else{
				/*inter
				for (int i = 0; i < vac.tamanho; i++) {
					if(codigo == ) {
						 
						v.setDescricao(descricao);
						System.out.println("DESCRIÇÂO EDITADA COM SUCESSO!!!!");
					}else {
						System.out.println("VACINA NÃO ENCONTRADA!!!!");		
					}
				}*/
				/*for (Vacinas v : vac) {
					if(codigo == v.getCodigo()) {
						v.setDescricao(descricao);
						System.out.println("DESCRIÇÂO EDITADA COM SUCESSO!!!!");
					}else {
						System.out.println("VACINA NÃO ENCONTRADA!!!!");		
					}
				}*/
			}
		}
		public void listar(myList<Vacinas> vac){
			if(vac == null /*|| vac.isEmpty()*/){
				System.out.println("SEM REGISTRO");
			}else{
				System.out.println("-> LISTAGEM DE VACINAS <-");
				//vac.stream().forEach(p -> System.out.println("|"+p.getCodigo()+"|" + p.getDescricao()+"|"));
				
			}			
		}
			

		public void excluir(Integer codigo,myList<Vacinas> vac ){			
			if(vac == null /*|| vac.isEmpty()*/){
				System.out.println("SEM REGISTRO");
			}else{
				vac.remove(codigo);
				System.out.println("VACINA EXCLUIDA COM SUCESSO!!!!");
			}
			
		}
		
		public String menu(){
			System.out.println("");
			System.out.println(">> Menu Vacina <<");
			System.out.println("1 - Cadastro");
			System.out.println("2 - Listar");
			System.out.println("3 - Editar");
			System.out.println("4 - Excluir");
			System.out.println("5 - Sair");
			System.out.println("");
			System.out.println("Escolha sua opção:");
			Scanner ler = new Scanner(System.in);
			String opcao = ler.nextLine();
			return opcao;
		}
		
		public void validaopcao(String opcao, myList<Vacinas> vac, Integer count){		
			Integer op = Integer.parseInt(opcao);
			switch (op){
			case 1:
				System.out.println("Digite descrição da vacina:");
				String desc = ler.nextLine();
				cadastrar(vac,count,desc);
			break;
			case 2:
				listar(vac);
			break;
			case 3:
				System.out.println("Informe código da vacina:");
				String codigo = ler.nextLine();
				Integer cd = Integer.parseInt(codigo);
				System.out.println("Informe nova descrição:");
				String descricao = ler.nextLine();
				editar(cd,descricao,vac);
			break;
			case 4:
				System.out.println("Informe o código da vacina:");
				String cod = ler.nextLine();
				Integer codi = Integer.parseInt(cod);
				excluir(codi,vac);
			break;
			default:		
				System.out.println("SAINDO .....");				
			}	

		}
		
}
