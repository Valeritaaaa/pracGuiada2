public class Player {
    private GameConfig gameConfig; 
    public Player(){
        gameConfig = gameConfig.getInstance();
    }

    public String showInfo(){
        return "The lifes = " + gameConfig.getLive(); 
    }
}
