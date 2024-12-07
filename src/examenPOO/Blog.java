package examenPOO;

public class Blog {
    private String titre;
    private Publiable[] billets;
    private int nbBillets;

    public Blog(String titre, int capacité) {
        this.titre = titre;
        this.billets = new Publiable[capacité];
        this.nbBillets = 0;
    }

    public void post(Publiable billet) throws InvalidURLException {
        if (billet instanceof Video) {
            Video video = (Video) billet;
            if (!video.getUrl().startsWith("https")) {
                throw new InvalidURLException("L'URL n'est pas sécurisée !");
            }
        }
        if (nbBillets < billets.length) {
            billets[nbBillets++] = billet;
        }
    }
}

