package com.cobiscorp.cobis.cntas.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class FiltroCliente {

	public static final String EN_FILTROCNI_431 = "EN_FILTROCNI_431";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "FiltroCliente";
	
	
	public static final Property<String> CEDULA = new Property<String>("cedula", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
