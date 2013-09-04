/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mis.flightschedulescraper;

/**
 *
 * @author jwalton
 */
public class FlightSchedule {
    private String origin;
    private String destination;
    private Long departureTime;
    private Long arrivalTime;
    private String aircraftType;
    
    public FlightSchedule(String origin, String destination, Long departureTime, Long arrivalTime){
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Long getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Long departureTime) {
        this.departureTime = departureTime;
    }

    public Long getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Long arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }
    
    
    
}
