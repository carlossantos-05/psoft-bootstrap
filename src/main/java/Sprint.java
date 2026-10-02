public class Sprint {

    private int numero;
    private Boolean encerrado = false;
    private Funcionario lider;

    public void adicionarLider(Funcionario funcionario) {
        lider = funcionario;

        funcionario.promover(
            new LiderDecorator(funcionario.getCargo())
        );
    }

    public Boolean encerrar() {

        if (encerrado) {
            return false;
        }

        if (lider != null) {
            LiderDecorator liderDecorator =
                (LiderDecorator) lider.getCargo();

            lider.promover(
                liderDecorator.getCargoBase()
            );
        }
        encerrado = true;
        return true;
    }

    public int getNumero() {
        return numero;
    }

    public Boolean getEncerrado() {
        return encerrado;
    }

    public Funcionario getLider() {
        return lider;
    }
}