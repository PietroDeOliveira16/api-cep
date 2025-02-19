package com.api.cep.service;

import com.api.cep.model.M_Cep;
import com.api.cep.model.M_CepJson;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class S_Cep {
    private RestTemplate rt = new RestTemplate();

    public M_Cep getDadosCep(String cep) throws JsonProcessingException {
        M_CepJson dadosCep = rt.getForObject("https://cep.awesomeapi.com.br/json/" + cep, M_CepJson.class);

        M_Cep m_cep = new M_Cep();

        m_cep.setCep(dadosCep.getCep());
        m_cep.setBairro(dadosCep.getBairro());
        m_cep.setCidade(dadosCep.getCidade());
        m_cep.setEndereco(dadosCep.getEndereco());
        m_cep.setEstado(dadosCep.getEstado());
        return m_cep;
    }
}
