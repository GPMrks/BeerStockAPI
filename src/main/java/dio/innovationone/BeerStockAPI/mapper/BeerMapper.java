package dio.innovationone.BeerStockAPI.mapper;

import dio.innovationone.BeerStockAPI.dto.BeerDTO;
import dio.innovationone.BeerStockAPI.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE = Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);

}
