/*
 * Archivo: Q_CLIENETT_YU32_QueryEvent.java
 * Fecha: 28/12/2020 11:55:11
 *
 * Esta aplicacion es parte de los paquetes bancarios propiedad de COBISCORP.
 * Su uso no autorizado queda expresamente prohibido asi como cualquier
 * alteracion o agregado hecho por alguno de sus usuarios sin el debido
 * consentimiento por escrito de COBISCORP.
 * Este programa esta protegido por la ley de derechos de autor y por las
 * convenciones internacionales de propiedad intelectual. Su uso no
 * autorizado dara derecho a COBISCORP para obtener ordenes de secuestro
 * o retencion y para perseguir penalmente a los autores de cualquier infraccion.
 */

package com.cobiscorp.cobis.cntas.customevents.query;

import java.util.List;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.ReferencePolicy;
import org.apache.felix.scr.annotations.Service;

import com.cobiscorp.cobis.commons.domains.log.ILogger;
import com.cobiscorp.cobis.commons.log.LogFactory;
import com.cobiscorp.designer.api.DataEntity;
import com.cobiscorp.designer.api.DynamicRequest;
import com.cobiscorp.designer.api.builder.QueryEventBuilder;
import com.cobiscorp.designer.api.customization.*;
import com.cobiscorp.designer.api.customization.arguments.*;
import com.cobiscorp.designer.api.managers.DesignerManagerException;

/**
 * Personalizacion de Eventos del Query
 *
 * Q_CLIENETT_YU32_QueryEvent - ClienteQuery
 *
 */
@Component
@Service({QueryEventBuilder.class})
@Properties(value={
		@Property(name = "query.id", value = "Q_CLIENETT_YU32"),
		@Property(name = "query.version", value = "1.0.0")
})
public class Q_CLIENETT_YU32_QueryEvent extends QueryEventBuilder
 implements IExecuteQuery
{

	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(Q_CLIENETT_YU32_QueryEvent.class);
	
	@Reference(name="iExecuteQueryQ_CLIENETT_YU32",referenceInterface =IExecuteQuery.class,bind = "setiExecuteQueryQ_CLIENETT_YU32",unbind = "unsetiExecuteQueryQ_CLIENETT_YU32",cardinality = ReferenceCardinality.MANDATORY_UNARY,policy=ReferencePolicy.DYNAMIC,target="(&(query.version=1.0.0)(query.id=Q_CLIENETT_YU32))")
	private IExecuteQuery iExecuteQueryQ_CLIENETT_YU32;

	public void setiExecuteQueryQ_CLIENETT_YU32(IExecuteQuery iExecuteQueryQ_CLIENETT_YU32) {
		this.iExecuteQueryQ_CLIENETT_YU32 = iExecuteQueryQ_CLIENETT_YU32;
	}

	public void unsetiExecuteQueryQ_CLIENETT_YU32(IExecuteQuery iExecuteQueryQ_CLIENETT_YU32) {
		this.iExecuteQueryQ_CLIENETT_YU32 = iExecuteQueryQ_CLIENETT_YU32;
	}

	@Override
	public List<?> executeDataEvent(DynamicRequest arg0, IExecuteQueryEventArgs arg1) {
		List<?> lst = null;
		try {
			lst = iExecuteQueryQ_CLIENETT_YU32.executeDataEvent(arg0, arg1);
		} catch (Exception ex) {
			arg1.setSuccess(false);
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
		return lst;
	}


	@Override
	public void configure() {
	    this.addQueryEvent("Q_CLIENETT_YU32", this);
	}

}

