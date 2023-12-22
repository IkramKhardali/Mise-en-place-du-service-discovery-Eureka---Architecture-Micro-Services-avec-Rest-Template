package ma.khardali.voiture.Model;

import jakarta.persistence.*;
import lombok.*;

import java.beans.Transient;

@Entity
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Voiture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricule;
    private String marque;
    private String model;
    @Column(name = "id_client")
    private Long clientId;

}