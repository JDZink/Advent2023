package day02;

public class Result {
    private int maxRed;
    private int maxGreen;
    private int maxBlue;
    private int gameNum;

    public int getMaxRed() {
        return maxRed;
    }

    public void setMaxRed(int maxRed) {
        this.maxRed = maxRed < this.maxRed? this.maxRed: maxRed;
    }

    public int getMaxGreen() {
        return maxGreen;
    }

    public void setMaxGreen(int maxGreen) {
        this.maxGreen = maxGreen < this.maxGreen? this.maxGreen: maxGreen;
    }

    public int getMaxBlue() {
        return maxBlue;
    }

    public void setMaxBlue(int maxBlue) {
        this.maxBlue = maxBlue < this.maxBlue? this.maxBlue: maxBlue;
    }

    public int getGameNum() {
        return gameNum;
    }

    public void setGameNum(int gameNum) {
        this.gameNum = gameNum;
    }

    @Override
    public String toString() {
        return "Result{" +
                "maxRed=" + maxRed +
                ", maxGreen=" + maxGreen +
                ", maxBlue=" + maxBlue +
                ", gameNum=" + gameNum +
                '}';
    }
}
