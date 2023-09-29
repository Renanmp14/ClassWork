public interface TipoBD {
    void conectaBanco();
    void enviaQueryBanco(String mensagem);

    void errorQuery(String mensagem);
}
