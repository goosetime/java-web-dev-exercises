package exercises.technology;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Computer pbbh = new Computer("poopy butthole", "dicks");
        pbbh.speakToDevice("heyyy what's up?");
        pbbh.feedDevice("bytes");
        pbbh.feedDevice("blood");
        pbbh.feedDevice("more blood");
        System.out.println(pbbh.isHungry());
        pbbh.speakToDevice("how you doin'?");

        Laptop baby = new Laptop("baby dickens", "dell", false);
        baby.speakToDevice("hi baby");
        System.out.println(baby.isMainframeHacked());

        SmartPhone crunky = new SmartPhone("crunkie", "also dell somehow", true);
        crunky.feedDevice("long long buttholes");
        crunky.setMainframeHacked(true);
        crunky.speakToDevice("hi crunkk");

    }
}
