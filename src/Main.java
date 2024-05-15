//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bateau b1 = new Bateau();
        b1.masse = 400;
        Soumarin s = new Soumarin();
        s.masse = 800;
        Voilier v1 = new Voilier();
        v1.masse = 200;
        Croisiere c1 =new Croisiere();
        c1.masse =300;
        Peche p1 = new Peche();
        p1.masse=500;
        Port brest = new Port ("brest");
        brest.acceuilVaisseau(b1);
        brest.acceuilVaisseau(s);
        brest.acceuilVaisseau(v1);
        brest.acceuilVaisseau(c1);
        brest.acceuilVaisseau(p1);
        }
    }
