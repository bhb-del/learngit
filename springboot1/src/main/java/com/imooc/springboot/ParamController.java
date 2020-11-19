package com.imooc.springboot;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Api
@RestController
public class ParamController {

    @ApiOperation(value = "@RequestBody方式")
    @PostMapping("/requestbody")
    public RanNumService RequestBody(@RequestBody @Valid RanNumService ranNumService){

        return ranNumService;
    }

}
