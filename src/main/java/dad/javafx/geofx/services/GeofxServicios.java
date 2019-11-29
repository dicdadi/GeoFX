package dad.javafx.geofx.services;

import java.util.List;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import dad.javafx.geofx.clases.Raiz;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;




public class GeofxServicios {

		public GeofxServicios() {
			Unirest.setObjectMapper(new UnirestObjectMapper());
		}
		public Raiz listLocation() throws GeofxException {

			try {
				Raiz raizLocation = Unirest
						.get("http://api.ipapi.com/check?access_key=2ff8a5c95be98ae09554d8957ac774a5&format=1")// lo que quiero obtener
						.asObject(Raiz.class)// como quiero que me lo muestre
						.getBody();
				// System.out.println(breeds.toString());
				
				return raizLocation;
			} catch (UnirestException e) {
			
				throw new GeofxException();
			}

		}
		public Raiz listLocation(String id)  throws GeofxException {

			try {
				Raiz raizLocation = Unirest
						.get("http://api.ipapi.com/"+id+"?access_key=2ff8a5c95be98ae09554d8957ac774a5&format=1")// lo que quiero obtener
						.asObject(Raiz.class)// como quiero que me lo muestre
						.getBody();
				// System.out.println(breeds.toString());
				
				return raizLocation;
			} catch (UnirestException e) {
				
				throw new GeofxException();
			}

		}
	
}
