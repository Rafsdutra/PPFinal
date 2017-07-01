
package EmpresaPP;

/**
 *
 * @author Rafa
 */
public class StrategyImposto20ou15 implements StrategyCalculaImposto {
	@Override
	public double calculaSalarioComImposto(StrategyFuncionarios umFuncionario) {
		if (umFuncionario.getSalarioBase() > 3500) {
			return umFuncionario.getSalarioBase() * 0.8;
		}
		return umFuncionario.getSalarioBase() * 0.85;
	}
}
