package org.example.schroniskozwierzat;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-07T15:20:14+0200",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.1 (Oracle Corporation)"
)
@Component
public class AnimalMapperImpl implements AnimalMapper {

    @Override
    public Animal mapToAnimal(AnimalRequest request) {
        if ( request == null ) {
            return null;
        }

        Animal animal = new Animal();

        return animal;
    }

    @Override
    public AnimalResponse roResponse(Animal animal) {
        if ( animal == null ) {
            return null;
        }

        AnimalResponse animalResponse = new AnimalResponse();

        animalResponse.setId( animal.getId() );
        animalResponse.setName( animal.getName() );
        animalResponse.setSpecies( animal.getSpecies() );
        animalResponse.setAge( animal.getAge() );

        return animalResponse;
    }
}
