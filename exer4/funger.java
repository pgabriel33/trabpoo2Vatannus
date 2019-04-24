package exer4;

import javax.swing.JOptionPane;

public class funger {
	public static void main(String[] args) {
		gerente ge1 = new gerente();
		assistentetecnico at1 = new assistentetecnico();
		assistenteadministrativo ad1 = new assistenteadministrativo();
		
		int op;
		
		for(;;)
		{
			op=Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de funcionario que deseja cadastrar? \n"
					+ "1-Gerente \n"
					+ "2-Assistente Tecnico \n"
					+ "3-Assistente Administrativo \n"
					+ "4-Sair"));
			
			if(op==1)
			{
				ge1.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do gerente?")));
				ge1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+ge1.getNome())));
				ge1.setCargo("Gerente");
				
				JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
						+ "Cargo: "+ge1.getCargo()+ "\n"
						+ "Nome: "+ge1.getNome()+ "\n"
						+ "Salario: "+ge1.calculaSalarioGerente());
			}else if(op==2)
			{
				at1.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do Assistente Tecnico?")));
				at1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+at1.getNome())));
				at1.setCargo("Assistente Tecnico");
				
				JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
						+ "Cargo: "+at1.getCargo()+ "\n"
						+ "Nome: "+at1.getNome()+ "\n"
						+ "Salario: "+at1.calculaSalarioAssistTecnico());
			}else if(op==3)
			{
				ad1.setNome(String.valueOf(JOptionPane.showInputDialog("Qual o nome do Assistente Administrativo?")));
				ad1.setSalario(Double.parseDouble(JOptionPane.showInputDialog("Qual o salario base de "+ad1.getNome())));
				ad1.setNum_matricula(Integer.parseInt(JOptionPane.showInputDialog("Qual o Numero de matricula? de "+ad1.getNome())));
				ad1.setTurno(Integer.parseInt(JOptionPane.showInputDialog("Qual o turno? \n"
						+ "1-Noturno \n"
						+ "2-Diurno")));
				ad1.setCargo("Assistente Administrativo");
				
				
				if(ad1.getTurno()==1){
				JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
						+ "Cargo: "+ad1.getCargo()+ "\n"
						+ "Nome: "+ad1.getNome()+ "\n"
						+ "Salario: "+ad1.calculaSalarioAssitAdm());
				}else{
					JOptionPane.showMessageDialog(null, "Dados do funcionario: \n"
							+ "Cargo: "+ad1.getCargo()+ "\n"
							+ "Nome: "+ad1.getNome()+ "\n"
							+ "Salario: "+ad1.getSalario());
				}
			}
			else if(op==4)
			{
				JOptionPane.showMessageDialog(null, "Finalizando!!");
				break;
			}else
			{
				JOptionPane.showMessageDialog(null, "Opção errada!! Tente novamente");
			}
		}
	}
}