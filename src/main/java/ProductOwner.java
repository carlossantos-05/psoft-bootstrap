import java.util.List;

public class ProductOwner implements Cargo {

    @Override
    public Funcionario promover(Funcionario funcionario) {
        return funcionario;
    }

    @Override
    public List<String> getFuncoes() {
        return List.of("ProductOwner");
    }
}