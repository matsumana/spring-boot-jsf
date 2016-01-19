package de.fred4jupiter.spring.boot.jsf;

import javax.faces.convert.DateTimeConverter;
import javax.faces.convert.FacesConverter;

/**
 * カスタムコンバーター
 * 
 * @author matsumana
 */
@FacesConverter("defaultDateConverter")
public class DefaultDateConverter extends DateTimeConverter {

	public DefaultDateConverter() {
		setPattern("yyyy/MM/dd HH:mm:ss");
	}
}
