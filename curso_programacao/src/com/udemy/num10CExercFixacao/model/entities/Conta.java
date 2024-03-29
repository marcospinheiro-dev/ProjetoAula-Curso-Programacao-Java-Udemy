package com.udemy.num10CExercFixacao.model.entities;

import com.udemy.num10CExercFixacao.model.exception.ContaException;

public class Conta {

    private Integer numConta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numConta, String titular, Double saldo, Double limiteSaque) {
        this.numConta = numConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double montante) {
        saldo += montante;
    }

    public void saque(double montante) {
        validarSaque(montante);
        saldo -= montante;
    }

    public void validarSaque(double montante) {
        if (montante > getLimiteSaque()) {
            throw new ContaException( "Erro de saque: O valor excedeu o limite de saque");
        }
        if (montante > getSaldo()) {
            throw new ContaException("Erro de saque: Saldo insuficiente");
        }

    }
}
