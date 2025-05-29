package controller;

import dao.CadastrarLivroDAO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Livro;

public class CadastroLivroController {

    @FXML
    private Button btncadastrar;

    @FXML
    private TextField txtAno;

    @FXML
    private TextField txtAutor;

    @FXML
    private TextField txtEdicao;

    @FXML
    private TextField txtTitulo;

    @FXML
    private TextField txtidProduto;

    @FXML
    void acaocadastrar(ActionEvent event) {
        Livro livro = new Livro();
        livro.setId(Integer.parseInt(txtidProduto.getText()));
        livro.setNome(txtTitulo.getText());
        livro.setAutor(txtAutor.getText());
        livro.setAnoLancamento(Integer.parseInt(txtAno.getText()));
        livro.setEdicao(Integer.parseInt(txtEdicao.getText()));
        
        System.out.println("Livro cadastrado com sucesso!");
        System.out.println("ID: " + livro.getId());
        System.out.println("Título: " + livro.getNome());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de Lançamento: " + livro.getAnoLancamento());
        System.out.println("Edição: " + livro.getEdicao());
        CadastrarLivroDAO.cadastrar(livro);
    }

}
