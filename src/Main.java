public class Main {
    public static void main(String[] args) {
        HavingSuperAbility[] AllHeroes = {new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < AllHeroes.length; i++) {
            AllHeroes[i].applySuperAbility();
        }
        Hero[] hero = { new Magic(), new Medic(), new Warrior()};
        for (int i = 0; i < hero.length; i++) {
            HeroesAll(hero[i]);

            
        }
    }
    public static void HeroesAll(Hero hero){
          Hero.HeroesHP();
          System.out.println(hero.SuperHeroes ( Medic ));
    }


    }
