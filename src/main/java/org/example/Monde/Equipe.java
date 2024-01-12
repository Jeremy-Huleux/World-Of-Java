package org.example.Monde;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

//Todo : Continuer Equipe trouver solution pour utilisation simple
public class Equipe {

    private List<Personnage> list = new ArrayList<>();
    private int taille;
    private boolean a2ouH2;
    private boolean allDead; // Si true = equipe MORT MORT MORT MORT
    private String a2ouH2Trad;

    public List<Personnage> getList() {
        return list;
    }

    public void setList(List<Personnage> list) {
        this.list = list;
    }

    public int getTaille() {
        return list.size();
    }

    /**
     * Methode qui permet de récupérer un objet Personnage
     * grace a l'index de la liste Equipe
     * @param i, est un index en integer
     * @return personnage
     */
    public Personnage getPerso(int i) {
        return list.get(i);
    }



    public Equipe(List<Personnage> list) {
        this.list = list;
        this.a2ouH2 = this.list.get(1).isA2ouH2();
        this.a2ouH2Trad = this.getA2ouH2Trad();
    }

    public Equipe() {}

    public boolean isAllDead() {
        return allDead;
    }

    public void setAllDead(boolean allDead) {
        this.allDead = allDead;
    }

    /**
     * methode qui permets de verifier si
     * l'equipe entière est MORTE si OUI cela
     * mets la variable allDead à true
     */
    public void verifAllDead(){
        int l =0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i).isDeadOrAlive()){
                l++;
                if(l == i){
                    this.setAllDead(true);
                    break;
                }
            }
        }
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public boolean isA2ouH2() {
        return a2ouH2;
    }

    public void setA2ouH2(boolean a2ouH2) {
        this.a2ouH2 = a2ouH2;
    }

    public String getA2ouH2Trad() {
        return (this.a2ouH2 ? "Alliance" : "Horde");
    }

    public void setA2ouH2Trad(String a2ouH2Trad) {
        this.a2ouH2Trad = a2ouH2Trad;
    }

    @Override
    public String toString(){
        StringJoiner instance = new StringJoiner("\n", Equipe.class.getSimpleName() + "[", "]")
                .add("taille = '"+ taille +"'");
                for(int i = 0; i < list.size(); i++){
                    instance.add("Le nom du perso n°"+i+" = " +list.get(i).getNom());
                    instance.add("La faction du perso n°"+i+" = " +list.get(i).getA2ouH2());
                    instance.add("Les points de vie du perso n°"+i+" = " +list.get(i).getPointsDeVie());

                }

                return instance.toString();

    }
}
