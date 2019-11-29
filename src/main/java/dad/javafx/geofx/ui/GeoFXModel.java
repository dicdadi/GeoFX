package dad.javafx.geofx.ui;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class GeoFXModel {
private StringProperty ip = new SimpleStringProperty();
private StringProperty latitude= new SimpleStringProperty();
private StringProperty longitude = new SimpleStringProperty();
private StringProperty pais = new SimpleStringProperty();
private StringProperty city = new SimpleStringProperty();
private StringProperty zip = new SimpleStringProperty();
private StringProperty language = new SimpleStringProperty();
private StringProperty time= new SimpleStringProperty();
private StringProperty calling = new SimpleStringProperty();
private StringProperty currency= new SimpleStringProperty();
private StringProperty ipAdress = new SimpleStringProperty();
private StringProperty isp= new SimpleStringProperty();
private StringProperty type = new SimpleStringProperty();
private StringProperty asn = new SimpleStringProperty();
private StringProperty hostname = new SimpleStringProperty();
private StringProperty security = new SimpleStringProperty();
private StringProperty potential = new SimpleStringProperty();
private BooleanProperty proxy = new SimpleBooleanProperty();
private BooleanProperty tor = new SimpleBooleanProperty();
private BooleanProperty crawlery = new SimpleBooleanProperty();
private StringProperty threat=new SimpleStringProperty();

public final StringProperty ipProperty() {
	return this.ip;
}

public final String getIp() {
	return this.ipProperty().get();
}

public final void setIp(final String ip) {
	this.ipProperty().set(ip);
}

public final StringProperty latitudeProperty() {
	return this.latitude;
}

public final String getLatitude() {
	return this.latitudeProperty().get();
}

public final void setLatitude(final String latitude) {
	this.latitudeProperty().set(latitude);
}

public final StringProperty longitudeProperty() {
	return this.longitude;
}

public final String getLongitude() {
	return this.longitudeProperty().get();
}

public final void setLongitude(final String longitude) {
	this.longitudeProperty().set(longitude);
}

public final StringProperty paisProperty() {
	return this.pais;
}

public final String getPais() {
	return this.paisProperty().get();
}

public final void setPais(final String pais) {
	this.paisProperty().set(pais);
}

public final StringProperty cityProperty() {
	return this.city;
}

public final String getCity() {
	return this.cityProperty().get();
}

public final void setCity(final String city) {
	this.cityProperty().set(city);
}

public final StringProperty zipProperty() {
	return this.zip;
}

public final String getZip() {
	return this.zipProperty().get();
}

public final void setZip(final String zip) {
	this.zipProperty().set(zip);
}

public final StringProperty languageProperty() {
	return this.language;
}

public final String getLanguage() {
	return this.languageProperty().get();
}

public final void setLanguage(final String language) {
	this.languageProperty().set(language);
}

public final StringProperty timeProperty() {
	return this.time;
}

public final String getTime() {
	return this.timeProperty().get();
}

public final void setTime(final String time) {
	this.timeProperty().set(time);
}

public final StringProperty callingProperty() {
	return this.calling;
}

public final String getCalling() {
	return this.callingProperty().get();
}

public final void setCalling(final String calling) {
	this.callingProperty().set(calling);
}

public final StringProperty currencyProperty() {
	return this.currency;
}

public final String getCurrency() {
	return this.currencyProperty().get();
}

public final void setCurrency(final String currency) {
	this.currencyProperty().set(currency);
}

public final StringProperty ipAdressProperty() {
	return this.ipAdress;
}

public final String getIpAdress() {
	return this.ipAdressProperty().get();
}

public final void setIpAdress(final String ipAdress) {
	this.ipAdressProperty().set(ipAdress);
}

public final StringProperty ispProperty() {
	return this.isp;
}

public final String getIsp() {
	return this.ispProperty().get();
}

public final void setIsp(final String isp) {
	this.ispProperty().set(isp);
}

public final StringProperty typeProperty() {
	return this.type;
}

public final String getType() {
	return this.typeProperty().get();
}

public final void setType(final String type) {
	this.typeProperty().set(type);
}

public final StringProperty asnProperty() {
	return this.asn;
}

public final String getAsn() {
	return this.asnProperty().get();
}

public final void setAsn(final String asn) {
	this.asnProperty().set(asn);
}

public final StringProperty hostnameProperty() {
	return this.hostname;
}

public final String getHostname() {
	return this.hostnameProperty().get();
}

public final void setHostname(final String hostname) {
	this.hostnameProperty().set(hostname);
}

public final StringProperty securityProperty() {
	return this.security;
}

public final String getSecurity() {
	return this.securityProperty().get();
}

public final void setSecurity(final String security) {
	this.securityProperty().set(security);
}

public final StringProperty potentialProperty() {
	return this.potential;
}

public final String getPotential() {
	return this.potentialProperty().get();
}

public final void setPotential(final String potential) {
	this.potentialProperty().set(potential);
}

public final BooleanProperty proxyProperty() {
	return this.proxy;
}

public final boolean isProxy() {
	return this.proxyProperty().get();
}

public final void setProxy(final boolean proxy) {
	this.proxyProperty().set(proxy);
}

public final BooleanProperty torProperty() {
	return this.tor;
}

public final boolean isTor() {
	return this.torProperty().get();
}

public final void setTor(final boolean tor) {
	this.torProperty().set(tor);
}

public final BooleanProperty crawleryProperty() {
	return this.crawlery;
}

public final boolean isCrawlery() {
	return this.crawleryProperty().get();
}

public final void setCrawlery(final boolean crawlery) {
	this.crawleryProperty().set(crawlery);
}

public final StringProperty threatProperty() {
	return this.threat;
}


public final String getThreat() {
	return this.threatProperty().get();
}


public final void setThreat(final String threat) {
	this.threatProperty().set(threat);
}




}
