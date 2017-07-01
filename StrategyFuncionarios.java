package EmpresaPP;

/**
 *
 * @author Rafa
 */
public class StrategyFuncionarios {
	public static final int Zelador = 1;
	public static final int Motorista = 2;
	public static final int Secretario = 3;
        public static final int Gerente = 4;
	protected double salarioBase;
	protected int cargo;
	protected StrategyCalculaImposto estrategiaDeCalculo;

	public StrategyFuncionarios(int cargo, double salarioBase) {
		this.salarioBase = salarioBase;
		switch (cargo) {
		case Zelador:
			estrategiaDeCalculo = new StrategyImposto15ou10();
			cargo = Zelador;
			break;
		case Motorista:
			estrategiaDeCalculo = new StrategyImposto15ou10();
			cargo = Motorista;
			break;
		case Secretario:
			estrategiaDeCalculo = new StrategyImposto20ou15();
			cargo = Secretario;
			break;
                case Gerente:
			estrategiaDeCalculo = new StrategyImposto20ou15();
			cargo = Gerente;
			break;        
		default:
			throw new RuntimeException("Cargo não encontrado :/");
		}
	}

	public double calcularSalarioComImposto() {
		return estrategiaDeCalculo.calculaSalarioComImposto(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}
}
