package dad.javafx.geofx.ui;

import java.io.IOException;
import java.net.URL;

import java.util.ResourceBundle;


import dad.javafx.geofx.clases.Raiz;
import dad.javafx.geofx.services.GeofxException;
import dad.javafx.geofx.services.GeofxServicios;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class GeoFXController  implements Initializable{

	private GeoFXModel model = new GeoFXModel();
	private GeofxServicios services = new GeofxServicios();
	private Raiz list;
	private Task<Void> tarea;
  
    @FXML
    private BorderPane view;

    @FXML
    private TabPane tabPaneIp;

    @FXML
    private Tab locationIp;

    @FXML
    private GridPane locationGrid;

    @FXML
    private VBox vboxLatitude;

    @FXML
    private Label latitudeLabel;

    @FXML
    private Label latitudeLabelData;

    @FXML
    private VBox vboxLongitude;

    @FXML
    private Label longitudeLabel;

    @FXML
    private Label longitudeLabelData;

    @FXML
    private HBox hboxPais;

    @FXML
    private ImageView ImagenPais;

    @FXML
    private Label ipLocationLabel;

    @FXML
    private Label ipLocationLabelData;

    @FXML
    private VBox vboxCity;

    @FXML
    private Label cityLabel;

    @FXML
    private Label cityLabelData;

    @FXML
    private VBox vboxLanguage;

    @FXML
    private Label languageLabel;

    @FXML
    private Label languagueLabelData;

    @FXML
    private VBox vboxCode;

    @FXML
    private Label codeLabel;

    @FXML
    private Label codeLabelText;

    @FXML
    private VBox vboxZipCode;

    @FXML
    private Label zipCodeLabel;

    @FXML
    private Label zipCodeLabelData;

    @FXML
    private VBox vboxTimeZone;

    @FXML
    private Label timeZoneLabel;

    @FXML
    private Label timeZoneLabelData;

    @FXML
    private VBox vboxCurrency;

    @FXML
    private Label currencyLabel;

    @FXML
    private Label currencyLabelData;

    @FXML
    private Tab connectionIp;

    @FXML
    private GridPane connectionGrid;

    @FXML
    private VBox vboxIpAddress;

    @FXML
    private Label ipAddressLabel;

    @FXML
    private Label ipAddressLabelData;

    @FXML
    private HBox hboxIsp;

    @FXML
    private ImageView imagenIsp;

    @FXML
    private Label ispLabel;

    @FXML
    private Label ispLabelData;

    @FXML
    private VBox vboxType;

    @FXML
    private Label typeLabel;

    @FXML
    private Label typeLabelData;

    @FXML
    private VBox vboxAsn;

    @FXML
    private Label asnLabel;

    @FXML
    private Label asnLabelData;

    @FXML
    private VBox vboxHostname;

    @FXML
    private Label hostnameLabel;

    @FXML
    private Label hostnameLabelData;

    @FXML
    private Tab securityIp;

    @FXML
    private GridPane securityGrid;

    @FXML
    private HBox hboxSecurity;

    @FXML
    private ImageView securityImage;

    @FXML
    private Label securityLabelText;

    @FXML
    private VBox vboxProxy;

    @FXML
    private Label proxyLabel;

    @FXML
    private CheckBox proxyCheckBox;

    @FXML
    private VBox vboxTor;

    @FXML
    private Label torLabel;

    @FXML
    private CheckBox torCheckBox;

    @FXML
    private VBox vboxCrawler;

    @FXML
    private Label crawlerLabel;

    @FXML
    private CheckBox crawlerCheckBox;

    @FXML
    private VBox vboxThreat;

    @FXML
    private Label threatLabel;

    @FXML
    private Label threatLabelData;

    @FXML
    private VBox vboxPotentialThreat;

    @FXML
    private Label potentialThreatLabel;

    @FXML
    private Label potentialThreatLabelData;

    @FXML
    private HBox hboxIp;

    @FXML
    private TextField ipText;

    @FXML
    private Button checkIpBoton;
    @FXML
    void onCheckIpAction(ActionEvent event) {
    	actualizarDatosGeofx(model.getIp());
    }
    public GeoFXController() throws IOException {
	FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/GeoViewFXML.fxml"));
	loader.setController(this);
	loader.load();
}
    //2ff8a5c95be98ae09554d8957ac774a5
	@Override
	public void initialize  (URL location, ResourceBundle resources) {
		model.ipProperty().bindBidirectional(ipText.textProperty());
		latitudeLabelData.textProperty().bind(model.latitudeProperty());
		longitudeLabelData.textProperty().bind(model.longitudeProperty());
		ipLocationLabelData.textProperty().bind(model.paisProperty());
		cityLabelData.textProperty().bind(model.cityProperty());
		zipCodeLabelData.textProperty().bind(model.zipProperty());
		languagueLabelData.textProperty().bind(model.languageProperty());
		timeZoneLabelData.textProperty().bind(model.timeProperty());
		codeLabelText.textProperty().bind(model.callingProperty());
		currencyLabelData.textProperty().bind(model.currencyProperty());
		ipAddressLabelData.textProperty().bind(model.ipAdressProperty());
		ispLabelData.textProperty().bind(model.ispProperty());
		typeLabelData.textProperty().bind(model.typeProperty());
		asnLabelData.textProperty().bind(model.asnProperty());	
		hostnameLabelData.textProperty().bind(model.hostnameProperty());
		securityLabelText.textProperty().bind(model.securityProperty());
		proxyCheckBox.selectedProperty().bind(model.proxyProperty());
		torCheckBox.selectedProperty().bind(model.torProperty());
		crawlerCheckBox.selectedProperty().bind(model.crawleryProperty());
		threatLabelData.textProperty().bind(model.threatProperty());
		potentialThreatLabelData.textProperty().bind(model.potentialProperty());
		actualizarDatosGeofx("check");
		
	}
	
	private void actualizarDatosGeofx(String ip) {

		tarea = new Task<Void>() {

			@Override
			protected Void call() throws Exception {
				list=services.listLocation(ip);
				return null;
			}
			
			
		};
		tarea.setOnFailed(e -> {
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("No se ha podido conectar con el servicio");
			alert.setContentText(e.getSource().getException().getMessage()); //optenemos el mensaje de la exepcion del task
			alert.showAndWait();
		});
		tarea.setOnSucceeded(e -> {
			try {
				Image imagen = new Image("https://raw.githubusercontent.com/dam-dad/Flags/master/48/"+list.getCountryCode()+".png");
				model.setIp(list.getIp());
				model.setLatitude(list.getLatitude().toString());
				model.setLongitude(list.getLongitude().toString());
				model.setPais(list.getCountryName() + " ("+ list.getCountryCode() +")");
				model.setCity(list.getCity() +"("+list.getRegionName()+")");
				ImagenPais.setImage(imagen);
				model.setZip(list.getZip());		
				model.setLanguage(list.getLocation().getLanguages().get(0).getName() +" ("+list.getLocation().getLanguages().get(0).getCode().toUpperCase()+")" );
				model.setCalling("+"+list.getLocation().getCallingCode());
				model.setType(list.getType());
				model.setTime(list.getTimeZone().toString());
				model.setCurrency(list.getCurrency().toString());
				model.setIpAdress(list.getIp());
				model.setIsp(list.getConnection().getIsp());
				model.setAsn(list.getConnection().getAsn().toString());
				model.setHostname(list.getHostname());
				model.setProxy(list.getSecurity().getIsProxy());
				model.setTor(list.getSecurity().getIsTor());
				model.setCrawlery(list.getSecurity().getIsCrawler());
				model.setThreat(list.getSecurity().getThreatLevel());
				model.setPotential(list.getSecurity().getThreatLevel());
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				//e1.printStackTrace();
			}
			
		});
	
	
			
		new Thread(tarea).start();
		
		
		
	}
	public BorderPane getView() {
		return view;
	}
}
