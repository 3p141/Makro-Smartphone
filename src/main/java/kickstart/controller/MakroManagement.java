package kickstart.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.util.Streamable;
import org.springframework.util.Assert;

public class MakroManagement {
    private MakroRepository makroRepository;

    public MakroManagement(MakroManagement makroManagement){
        Assert.notNull(makroManagement, "MakroRepository should not be null.");

        this.makroRepository = makroRepository;
    }

    public MakroEntry createEntry(int id, ArrayList<String> commands){
        MakroEntry makro = new MakroEntry(id, commands);

        return makroRepository.save(makro);
    }

    public MakroEntry update(MakroEntry makro){
        return makroRepository.save(makro);
    }

    public Streamable<MakroEntry> findAll(){
        return makroRepository.findAll();
    }

    public Optional<MakroEntry> findByID(int id) {
        return makroRepository.findById(id);
    }
}
