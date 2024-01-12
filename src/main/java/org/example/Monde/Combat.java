package org.example.Monde;

import java.util.Random;

public class Combat {
    private Equipe equipe1;
    private String nomEquipe1 = "Equipe 1";
    private Equipe equipe2;
    private String nomEquipe2 = "Equipe 2";
    private Equipe equipeGagnante;
    private Equipe equipeCommenceur;
    private Equipe equipePascommenceur;

    public Combat(Equipe equipe1, Equipe equipe2) {
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    /**
     * Methode qui permet de déterminer l'equipe qui commence
     * et ensuite appelle la methode "bagarre" qui permet de
     * determiner l'equipe gagnante
     */
    public void startCombat(){
        boolean rand = new Random().nextBoolean();
       /* Equipe equipeCommenceur ;
        Equipe equipePascommenceur ;*/
        if (rand){
            equipeCommenceur = this.equipe1;
            equipePascommenceur = this.equipe2;
            System.out.println("L'équipe qui commence est l'équipe : "+nomEquipe1);
            System.out.println("L'équipe "+nomEquipe1+" est de la faction : "+equipeCommenceur.getA2ouH2Trad());
            System.out.println("L'équipe "+nomEquipe2+" est de la faction : "+equipePascommenceur.getA2ouH2Trad());
        }else{
            equipeCommenceur = this.equipe2;
            equipePascommenceur = this.equipe1;
            System.out.println("L'équipe qui commence est l'équipe : "+nomEquipe2);
            System.out.println("L'équipe "+nomEquipe2+" est de la faction : "+equipeCommenceur.getA2ouH2Trad());
            System.out.println("L'équipe "+nomEquipe1+" est de la faction : "+equipePascommenceur.getA2ouH2Trad());
        }
        bagarre(equipeCommenceur, equipePascommenceur);
    }

    /**
     * methode qui permet de faire faire la bagarre
     * entre 2 equipe donc la premiere equipe
     * entrée dans la methode est l'equipe qui commence
     * Donc la methode permet de déterminer l'equipe gagnante
     * @param equipe1, est l'equipe qui commence
     * @param equipe2, est l'equipe qui commence pas
     */
    public void bagarre(Equipe equipe1, Equipe equipe2){
        if(equipe1.isAllDead() != true && equipe2.isAllDead() != true){
            for(int i = 0; i < equipe1.getTaille(); i++){
                while(equipe2.getPerso(i).isDeadOrAlive() != true && equipe1.getPerso(i).isDeadOrAlive() != true){
                    if(equipe1.getPerso(i).isDeadOrAlive() != true) {
                        System.out.println("\n**\nL'équipe 1 : "
                                + equipe1.getPerso(i).getNom()
                                + " inflige : "
                                + equipe1.getPerso(i).attaque(equipe2.getPerso(i))
                                + " à "
                                + equipe2.getPerso(i).getNom()
                                + "\nAvec un : "
                                + equipe1.getPerso(i).getArme().getType()
                                + "Nommée : "
                                + equipe1.getPerso(i).getArme().getNom()
                                + "\n" + equipe2.getPerso(i).getNom()
                                + " à actuellement : "
                                + equipe2.getPerso(i).getPointsDeVie()
                                + " points de vie\n"
                                + "************************************");
                        equipe2.verifAllDead();

                    }
                    if(equipe2.getPerso(i).isDeadOrAlive() != true){
                        System.out.println("\n**\nl'Equipe 2 : "
                                +equipe2.getPerso(i).getNom()
                                +" inflige : "
                                + equipe2.getPerso(i).attaque(equipe1.getPerso(i))
                                +" à "
                                + equipe1.getPerso(i).getNom()
                                +"\nAvec un : "
                                + equipe2.getPerso(i).getArme().getType()
                                +"Nommée : "
                                + equipe2.getPerso(i).getArme().getNom()
                                +"\n"+ equipe1.getPerso(i).getNom()
                                +" à actuellement : "
                                +equipe1.getPerso(i).getPointsDeVie()
                                +" points de vie\n"
                                +"************************************");
                        equipe1.verifAllDead();

                    }


                }
            }

        }
        if (equipe1.isAllDead() != false){
            this.equipeGagnante = equipe2;
            System.out.println("\n*********************************");
            System.out.println("l'équipe gagnante est l'équipe 2");
            System.out.println("*********************************");
        }else{
            this.equipeGagnante = equipe1;
            System.out.println("\n*********************************");
            System.out.println("l'équipe gagnante est l'équipe 1");
            System.out.println("*********************************");
        }
    }
    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
    }

    public Equipe getEquipeGagnante() {
        return equipeGagnante;
    }

    public void setEquipeGagnante(Equipe equipeGagnante) {
        this.equipeGagnante = equipeGagnante;
    }
}
