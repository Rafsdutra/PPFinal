
package EmpresaPP;

/**
 *
 * @author Rafa
 */
public class StrategyImposto15ou10 implements StrategyCalculaImposto {
	@Override
	public double calculaSalarioComImposto(StrategyFuncionarios umFuncionario) {
		if (umFuncionario.getSalarioBase() > 2000) {
			return umFuncionario.getSalarioBase() * 0.85;
		}
		return umFuncionario.getSalarioBase() * 0.9;
	}
}
