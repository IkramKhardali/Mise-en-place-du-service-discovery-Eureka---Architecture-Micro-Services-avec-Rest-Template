package ma.khardali.voiture.Service;

import ma.khardali.voiture.Model.Voiture;
import ma.khardali.voiture.Repository.VoitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VoitureService {
    @Autowired
    private VoitureRepository voitureRepo;

    public List<Voiture> findAll() {
        return voitureRepo.findAll();
    }

    public  Voiture save(Voiture entity) {
        return voitureRepo.save(entity);
    }

    public Optional<Voiture> findById(Long aLong) {
        return voitureRepo.findById(aLong);
    }

    public void deleteById(Long aLong) {
        voitureRepo.deleteById(aLong);
    }
}
