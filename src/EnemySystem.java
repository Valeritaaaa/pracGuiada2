public class EnemySystem {
    private GameConfig gameConfig; 
    public EnemySystem(){
        gameConfig = gameConfig.getInstance();
    }
    public String showInfo(){
        return "The enemy speed = " + gameConfig.getEnemySpeed();
    }
}
