package com.api.cep.controller;

import com.api.cep.model.M_Cep;
import com.api.cep.service.S_Cep;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class C_Cep {
    private final S_Cep s_cep;

    public C_Cep(S_Cep s_cep) {
        this.s_cep = s_cep;
    }

    @PostMapping("/getDadosCep")
    @ResponseBody
    public M_Cep postDadosCep(@RequestParam("cep") String cep) throws JsonProcessingException {
        return s_cep.getDadosCep(cep);
    }
}
