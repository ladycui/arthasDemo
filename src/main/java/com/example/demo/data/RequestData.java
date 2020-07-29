package com.example.demo.data;

public enum RequestData {

    request_id_1( 404),
    request_id_2( 400),
    ;


    private final int status;

    private RequestData( int status) {
       this.status = status;
    }

    public int status() {
        return this.status;
    }
}
