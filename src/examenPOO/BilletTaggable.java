package examenPOO;

import java.time.LocalDate;
import java.util.Arrays;

public abstract class BilletTaggable extends Billet implements Taggable {
    
    private String[] tags;
    private int nbTags; // Actual number of tags
    private int capacite; // Maximum capacity for tags

    public BilletTaggable(LocalDate datePub, String auteur, int capacite) {
        super(datePub, auteur);
        this.capacite = capacite;
        this.tags = new String[capacite];
        this.nbTags = 0;
    }

    @Override
    public void ajoutTag(String tag) {
        if (nbTags >= capacite) {
            System.out.println("Cannot add more tags, capacity reached.");
            return;
        }
        for (int i = 0; i < nbTags; i++) {
            if (tags[i].equals(tag)) {
                System.out.println("Tag already exists.");
                return;
            }
        }
        tags[nbTags++] = tag;
    }

    @Override
    public void supprimeTag(String tag) {
        for (int i = 0; i < nbTags; i++) {
            if (tags[i].equals(tag)) {
                // Shift tags left to fill the gap
                for (int j = i; j < nbTags - 1; j++) {
                    tags[j] = tags[j + 1];
                }
                tags[--nbTags] = null; // Clear the last slot
                return;
            }
        }
        System.out.println("Tag not found.");
    }

    @Override
    public int nombreTags() {
        return nbTags;
    }

    @Override
    public int rechercheTag(String tag) {
        for (int i = 0; i < nbTags; i++) {
            if (tags[i].equals(tag)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tags: " + Arrays.toString(Arrays.copyOf(tags, nbTags));
    }
}

