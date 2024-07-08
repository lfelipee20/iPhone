public class Smartphone implements MusicPlayer, Telefone, Navegador {
    
    private String currentMusicPlayer;
    private String currentNavegador;
    private String currentTelefone;

    @Override
    public void tocar () {
        System.out.println("Tocando musica" + currentMusicPlayer);

    }

    @Override
    public void pausar () {
        System.out.println("Musica pausada");

}

    @Override
    public void selecionarMusica () {
        System.out.println("Selecione uma musica");

    }

    @Override
    public void navegadorWeb (String url) {
        this.currentNavegador = url;
        System.out.println("Navegar:" + url);

    }

    @Override
    public void novaAba () {
        System.out.println("Abrindo nova aba.");

    }

    @Override
    public void atualizarPagina () {
        System.out.println("Atualizando pagina...");

    }

    @Override
    public void fazerLigacao (String contact) {
        this.currentTelefone = contact;
        System.out.println("Chamando" + contact);

    }

    @Override
    public void atender () {
        System.out.println("Chamada atendida");
    }

    @Override
    public void correioVoz () {
        System.out.println("Deixe seu recado");

    }

    public void setCurrentMusicPlayer (String currentMusicPlayer) {
        this.currentMusicPlayer = currentMusicPlayer;

    }

}
