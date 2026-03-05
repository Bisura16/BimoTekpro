package teori;

import java.util.*;

public class AntrianPasien {

    Queue<String> antrian = new LinkedList<>();
    Deque<String> antrianDarurat = new ArrayDeque<>();

    public void tambahAntrian(String nama){
        antrian.add(nama);
    }

    public void pasienDarurat(String nama){
        antrianDarurat.addFirst(nama);
    }

    public String panggilPasien(){
        if(!antrianDarurat.isEmpty()){
            return antrianDarurat.pollFirst();
        }
        return antrian.poll();
    }

}