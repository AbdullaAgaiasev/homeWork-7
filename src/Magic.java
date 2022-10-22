public class Magic extends Hero{
    public int HealPoint = 150;
    public String increaseExperience(){
      double Point = (((10 * HealPoint)/150 )+ HealPoint);
      return " Heal Points " + " увеличился на 10%, стало: " + Point;
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил магическую суперспособность ");
    }
}
