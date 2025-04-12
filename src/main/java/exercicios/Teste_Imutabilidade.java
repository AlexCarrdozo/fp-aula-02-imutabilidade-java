public class Teste_Imutabilidade {
    public static void main(String[] args) {
        CidadeRecord cc = new CidadeRecord("Arraias");
        //cc.nome("Campo Belo"); ERRO!!
        Cidade cc2 = new Cidade("Palmas");
        //cc2.setNome("Paris"); CERTO!!
        PessoaRecordShallow a = new PessoaRecordShallow("Alex",cc2);
        //a.nome("Luiz"); ERRO!!
        //a.cidade().setNome("Paris"); CERTO!!
        PessoaRecord b = new PessoaRecord("João", cc);
        //b.nome("Arthur"); ERRO!!
        //b.cidade("Arraias"); ERRO!!
    }
}
