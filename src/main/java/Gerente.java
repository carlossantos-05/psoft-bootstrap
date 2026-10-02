import java.util.List;

public class Gerente implements Cargo {

    @Override
    public Funcionario promover(Funcionario funcionario) {
        return funcionario;
    }

    @Override
    public List<String> getFuncoes() {
        return List.of("Gerente");
    }
}
