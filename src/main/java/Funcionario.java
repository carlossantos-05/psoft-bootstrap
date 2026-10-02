import java.util.List;

public class Funcionario {

    private String id;
    private String nome;
    private Cargo cargo;

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void promover(Cargo cargo) {
        this.cargo = cargo;
    }

    public List<String> getFuncoes() {
        return cargo.getFuncoes();
    }
}