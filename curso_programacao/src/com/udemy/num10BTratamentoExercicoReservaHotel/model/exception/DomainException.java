package com.udemy.num10BTratamentoExercicoReservaHotel.model.exception;

public class DomainException extends RuntimeException {
//    private static final long serialVersionUID = 1L;

    public DomainException(String msg) { // Permite instanciar a classe passando uma mensagem.
        super(msg);
    }
}
