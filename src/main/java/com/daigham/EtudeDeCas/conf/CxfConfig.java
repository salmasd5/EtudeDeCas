package com.daigham.EtudeDeCas.conf;

import com.daigham.EtudeDeCas.service.ReservationSOAPService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfConfig {

    private ReservationSOAPService reservationSOAPService;
    private Bus bus;

    public CxfConfig(ReservationSOAPService reservationSOAPService, Bus bus) {
        this.reservationSOAPService = reservationSOAPService;
        this.bus = bus;
    }

    @Bean
    public EndpointImpl endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, reservationSOAPService);
        endpoint.publish("/ws");
        return endpoint;
    }
}
