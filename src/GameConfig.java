public class GameConfig{
    int dificulty; 
    int live; 
    int enemySpeed; 
    private static GameConfig instance; 
    private GameConfig(){

    }
    public static GameConfig getInstance(){
        if(instance == null){
            instance = new GameConfig();
        }
        return instance; 
    }
     public int getEnemySpeed() {
        return enemySpeed;
    }
    public void setEnemySpeed(int enemySpeed) {
        this.enemySpeed = enemySpeed;
    }
     public int getDificulty() {
        return dificulty;
    }
    public void setDificulty(int dificulty) {
        this.dificulty = dificulty;
    }
    public int getLive() {
        return live;
    }
    public void setLive(int live) {
        this.live = live;
    }
    public String showInfomation() {
        return " The GameConfig \n" 
        + "-> dificulty = " + dificulty +
         "\n-> live = " + live + 
         "\n-> enemySpeed = " + enemySpeed;
    }
    //singleton 
    //enemySistem; getEnemySpped y metido mostrar un syso que diga el enemySpeed atributo de gameConfig
    //system muestra las vidas atributo de tipo gameConfig
}