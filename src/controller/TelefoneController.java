package controller;

import adamczuk.nathan.Fila;

public class TelefoneController {

	public void insereLigacao(Fila f, String numeroTelefone) {
		f.insert(numeroTelefone);
	}

	public void consultaLigacoes(Fila f) throws Exception {

		if (f.isEmpty()) {
			throw new Exception("\nNÃO HÁ LIGAÇÕES A SEREM EXIBIDAS");
		} else {
			
			System.out.println("\nLISTA DE CHAMADAS REGISTRADAS:\n");
			
			while (!f.isEmpty()) {
				try {
					System.out.println(f.remove());
				} catch (Exception e) {
				}
			}
		}
	}

}
