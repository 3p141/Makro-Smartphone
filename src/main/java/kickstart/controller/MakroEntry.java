package kickstart.controller;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MakroEntry {
    @Id
    private int id;

    public ArrayList<String> commands = new ArrayList<String>();

    public MakroEntry(int id, ArrayList<String> commands){
        this.id = id;
        this.commands = commands;
    }
}
