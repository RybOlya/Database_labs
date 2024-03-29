package ua.lviv.iot.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Builder
@Getter
@EqualsAndHashCode(callSuper = false)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Relation(itemRelation = "solarSystem", collectionRelation = "solarSystem")
public class SolarSystemDto  extends RepresentationModel<SolarSystemDto>{
    private final Integer id;
    private final Double feedInTariff;
    private final Integer energySold;
    private final String street;
    private final String apartment;
    private final String city;
}
