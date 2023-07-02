/**
 * 
 */
package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

/**
 * @author user
 *
 */
public class PrimeiraClasseJava {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* new Aluno () é uma instancia (Criação de objetos) */
		/* Aluno1 é uma referencia para o objeto aluno */

		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		/*String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual a RG ?");
		String cpf = JOptionPane.showInputDialog("Qual a CPF?");
		String mae = JOptionPane.showInputDialog("Qual O NOME DA MÃE?");
		String pai = JOptionPane.showInputDialog("Qual o nome do Pai ?");
		String matricula = JOptionPane.showInputDialog("Qual a matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Qual a escola?");*/


		Aluno aluno1 = new Aluno(); /* Aqui sera o nome do aluno */

		aluno1.setNome(nome);
		/*aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);*/


		for (int pos = 1; pos <= 4; pos++) {

			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina" + pos + "");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina" + pos + "");

			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));

			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha =JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina");
		if  (escolha ==0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a opcão 1,2,3 ou 	4");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue()-1);
		}
		System.out.println(aluno1);
		System.out.println(" Resultado  " + aluno1.getIdade());
		System.out.println(" Media  e =" + aluno1.getAlunoAprovado2());



		/* Aluno aluno2 = new Aluno(); /*Aqui sera o nome do aluno */
		/*
		 * aluno2.setNome("Maria"); aluno2.setIdade(30);
		 * aluno2.setDataNascimento("18/10/1987");
		 * aluno2.setRegistroGeral("4454.9860,0987");
		 * aluno2.setNumeroCpf("987.098.098.00"); aluno2.setNomeMae("catia");
		 * aluno2.setNomePai("Ze"); aluno2.setDataMatricula("10/05/2019");
		 * aluno2.setSerieMatriculado("6");
		 * aluno2.setNomeEscola("Escola JDEV Treinamentos");
		 * 
		 * System.out.println(" Nome do aluno  e " +aluno2.getNome());
		 * System.out.println(" Idade do aluno  e " +aluno2.getIdade());
		 * System.out.println(" Nascimento do aluno  e " +aluno2.getDataNascimento());
		 */

		/*
		 * Aluno aluno = new Aluno (); System.out.println(aluno.toString());/*Descrição
		 * do objeto na memoria
		 */
		/* System.out.println(aluno);/*Descrição do objeto na memoria */

		/*
		 * aluno = new Aluno (); /* System.out.println(aluno1 .toString());/*Descrição
		 * do objeto na memoria
		 */
		/*
		 * System.out.println("media " + aluno.getMediaNota());
		 * System.out.println("media " + aluno.getAlunoAprovado2());
		 */

		/*
		 * Aluno aluno1 = new Aluno(); aluno1.setNome("ALE");
		 * aluno1.setNumeroCpf("123");
		 * 
		 * Aluno aluno2 = new Aluno(); aluno2.setNome("ALE");
		 * aluno2.setNumeroCpf("132"); if(aluno1.equals(aluno2)) {
		 * System.out.println("Alunos são iguais");
		 * 
		 * }else { System.out.println("Alunos não são iguais");
		 * 
		 * }
		 */
	}

}
