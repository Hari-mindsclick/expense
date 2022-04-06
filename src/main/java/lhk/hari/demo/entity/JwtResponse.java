package lhk.hari.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtResponse {
	

     public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String id;
     

	private final String accessToken;


	public String getAccessToken() {
		return accessToken;
	}

	public JwtResponse(String accessToken) {
		this.accessToken = accessToken;
		
		
	}

		
		

}
