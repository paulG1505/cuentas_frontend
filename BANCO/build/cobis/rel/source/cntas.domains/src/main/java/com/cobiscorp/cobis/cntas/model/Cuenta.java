package com.cobiscorp.cobis.cntas.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class Cuenta {

	public static final String EN_CUENTAEUK_224 = "EN_CUENTAEUK_224";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "Cuenta";
	
	
	public static final Property<Double> SALDO = new Property<Double>("saldo", Double.class, false);
	
	public static final Property<String> CLIENTE = new Property<String>("cliente", String.class, false);
	
	public static final Property<String> TIPO = new Property<String>("tipo", String.class, false);
	
	public static final Property<Date> FECHAMODIFICACION = new Property<Date>("fechaModificacion", Date.class, false);
	
	public static final Property<Date> FECHACREACION = new Property<Date>("fechaCreacion", Date.class, false);
	
	public static final Property<Integer> NUMEROCUENTA = new Property<Integer>("numeroCuenta", Integer.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
