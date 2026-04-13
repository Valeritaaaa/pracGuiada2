public class Main {
    public static void main(String[] args) {
        GameConfig gameConfig = GameConfig.getInstance(); 
        gameConfig.setDificulty(10);
        gameConfig.setEnemySpeed(2);
        gameConfig.setLive(3);
        
        gameConfig.showInfomation(); 
        EnemySystem enemySystem = new EnemySystem(); 
        enemySystem.showInfo(); 
        Player player = new Player(); 
        player.showInfo(); 


    }
    
}
