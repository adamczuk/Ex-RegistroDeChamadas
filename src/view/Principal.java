package view;

import javax.swing.JOptionPane;

import adamczuk.nathan.Fila;
import controller.TelefoneController;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();

		String entrada = null;

		do {
			entrada = JOptionPane.showInputDialog("ESCOLHA UMA OPÇÃO: \n\n" + "1 - REGISTRAR UMA CHAMADA \n\n"
					+ "2 - VISUALIZAR CHAMADAS REGISTRADAS \n\n" + "9 - FINALIZAR O PROGRAMA");

			if (entrada == null || entrada.equals("9")) {
				break;
			} else {
				switch (entrada) {
				case "1":
					insereLigacao(fila);
					break;
				case "2":
					consultaLicacoes(fila);
					break;
				default:
					JOptionPane.showMessageDialog(null, "OPÇÃO INVALIDA! TENTE NOVAMENTE");
				}
			}
		} while (true);

	}

	private static void consultaLicacoes(Fila fila) {

		TelefoneController tCont = new TelefoneController();

		try {
			tCont.consultaLigacoes(fila);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	private static void insereLigacao(Fila fila) {

		TelefoneController tCont = new TelefoneController();

		String telefone = JOptionPane.showInputDialog("DIGITE O NUMERO DO TELEFONE PARA INSERIR NO REGISTRO:");

		tCont.insereLigacao(fila, telefone);

	}

}
