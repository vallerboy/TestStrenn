package lambdas;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        //Otwieranie pliku
        List<String> names =
                Arrays.asList("1:Oskarkos", "12:Barbadores", "1:Manichius", "45:Tetranus");


    Map<Integer, List<Player>> grouped = names.stream()
                .map(s -> s.split(":"))
                .map(s -> new Player(Integer.valueOf(s[0]), s[1]))
                .collect(Collectors.groupingBy(s -> s.getLvl()));




    }

    static class Player{
        private int lvl;
        private String name;

        public Player(int lvl, String name) {
            this.lvl = lvl;
            this.name = name;
        }

        public int getLvl() {
            return lvl;
        }

        public void setLvl(int lvl) {
            this.lvl = lvl;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
