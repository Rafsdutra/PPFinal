package EmpresaPP;




public class Main {
	public static void main(String[] args) {
		
            
                StrategyFuncionarios umFuncionario = new StrategyFuncionarios(StrategyFuncionarios.Zelador,
				2100);
		System.out.println("Salario do Zelador com desconto de imposto: " + umFuncionario.calcularSalarioComImposto());
		
		StrategyFuncionarios outroFuncionario = new StrategyFuncionarios(StrategyFuncionarios.Motorista,
				1700);
		System.out.println("Salario do Motorista com desconto de imposto: " + outroFuncionario.calcularSalarioComImposto());
                
                SingletonSetores conf = SingletonSetores.getInstancia();
                conf.autenticar();
	}
}