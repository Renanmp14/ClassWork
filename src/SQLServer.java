public class SQLServer implements TipoBD{

    public String user, password, dataBaseName;

    public SQLServer(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    @Override
    public void conectaBanco() {
        user = "Irineu_Batista";
        password = "2469";
    }

    @Override
    public void enviaQueryBanco(String mensagem) {
        mensagem = "Conectado no banco de dados SQLServer";

    }

    @Override
    public void errorQuery(String mensagem) {
        mensagem = "Erro ao enviar query";
    }


}
