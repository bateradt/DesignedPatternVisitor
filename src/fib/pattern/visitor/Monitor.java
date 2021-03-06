package fib.pattern.visitor;

import fib.pattern.visitor.interfaces.IPeriferico;
import fib.pattern.visitor.interfaces.IPerifericoVisitor;

/**
 * Classe que representa um componente "Monitor" do computador. Há apenas um
 * método implementado. Esse método é responsável pela execução da ação
 * definida no parâmetro passado. Essa operação é denominada visitação.
 */
public class Monitor implements IPeriferico {
	@Override
	public void accept(IPerifericoVisitor visitor) {
		visitor.visitar(this);
	}
}
