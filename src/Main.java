import day01.ElfCode;
import day02.SnowIsland;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Runnable> runners = new ArrayList<>();
//        runners.add(new ElfCode());
        runners.add(new SnowIsland());


        runners.forEach(Runnable::run);
    }
}