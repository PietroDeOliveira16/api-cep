package com.api.cep.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class M_CepJson {
    @JsonProperty("cep")
    private String cep;
    @JsonProperty("address_type")
    private String tipoEndereco;
    @JsonProperty("address_name")
    private String nomeEndereco;
    @JsonProperty("address")
    private String endereco;
    @JsonProperty("district")
    private String bairro;
    @JsonProperty("state")
    private String estado;
    @JsonProperty("city")
    private String cidade;
    @JsonProperty("lat")
    private String latitude;
    @JsonProperty("lng")
    private String longitude;
    @JsonProperty("ddd")
    private String ddd;
    @JsonProperty("city_ibge")
    private String ibgeCidade;

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(String tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getNomeEndereco() {
        return nomeEndereco;
    }

    public void setNomeEndereco(String nomeEndereco) {
        this.nomeEndereco = nomeEndereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getIbgeCidade() {
        return ibgeCidade;
    }

    public void setIbgeCidade(String ibgeCidade) {
        this.ibgeCidade = ibgeCidade;
    }
}
