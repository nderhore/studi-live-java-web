package fr.studi.live.security.response;

import lombok.Data;

import java.util.List;


@Data
public class JwtResponse {

    private String accessToken;
    private String type = "Bearer";
    private List<String> roles;



    public JwtResponse(String token, List<String> roles) {
        this.accessToken = token;
        this.roles = roles;
    }
}
