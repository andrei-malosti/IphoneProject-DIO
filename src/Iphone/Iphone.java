package Iphone;

import funcionalidades.AparelhoTelefone;
import funcionalidades.Internet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefone, Internet {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void atender(String numero) {
        ligar(numero);
        System.out.println("o numero: " + numero + " atendeu");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("exibindo pagina de url: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página recarregada");
    }

    @Override
    public void tocar(String musica) {
        selecionarMusica(musica);
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: " + musica);
    }
}
