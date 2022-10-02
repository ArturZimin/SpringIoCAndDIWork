package entity;

import org.springframework.stereotype.Component;

@Component("rockMusic")
public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Rock music playing";
    }
}
