package Modelos;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document()

public class Permiso {
	 @Id
	 private String _id;
	 private String url;
	 private String metodo;
	/**
	 * @param _id
	 * @param url
	 * @param metodo
	 */
	public Permiso(String _id, String url, String metodo) {
		super();
		this._id = _id;
		this.url = url;
		this.metodo = metodo;
	}
	/**
	 * @return the _id
	 */
	public String get_id() {
		return _id;
	}
	/**
	 * @param _id the _id to set
	 */
	public void set_id(String _id) {
		this._id = _id;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * @return the metodo
	 */
	public String getMetodo() {
		return metodo;
	}
	/**
	 * @param metodo the metodo to set
	 */
	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}
}
