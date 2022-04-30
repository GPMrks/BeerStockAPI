package dio.innovationone.BeerStockAPI.controller;

import dio.innovationone.BeerStockAPI.dto.BeerDTO;
import dio.innovationone.BeerStockAPI.exception.BeerAlreadyRegisteredException;
import dio.innovationone.BeerStockAPI.exception.BeerNotFoundException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Api("Manages beer stock")
public interface BeerControllerDocs {

    @ApiOperation(value = "Beer creation operation")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Success beer creation"),
            @ApiResponse(code = 400, message = "Missing required fields or wrong field range value.")
    })
    BeerDTO createBeer(BeerDTO beerDTO) throws BeerAlreadyRegisteredException;

    @ApiOperation(value = "Beer not found by a given name")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully found beer in the system."),
            @ApiResponse(code = 404, message = "Beer with given name not found.")
    })
    BeerDTO findByName(@PathVariable String name) throws BeerNotFoundException;

    @ApiOperation(value = "Returns a list of all beers registered in the system")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of all beers registered in the system."),
    })
    List<BeerDTO> listBeers();

    @ApiOperation(value = "Delete a beer found by a given valid ID")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully deleted beer in the system."),
            @ApiResponse(code = 404, message = "Beer with given id not found.")
    })
    void deleteById(@PathVariable Long id) throws BeerNotFoundException;

}
