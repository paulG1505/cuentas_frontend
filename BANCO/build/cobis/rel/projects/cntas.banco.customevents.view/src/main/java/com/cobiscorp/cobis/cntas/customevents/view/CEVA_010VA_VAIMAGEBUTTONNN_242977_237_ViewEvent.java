/*
 * Archivo: VW_CLIENTEGQT_977_ViewEvent.java
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

package com.cobiscorp.cobis.cntas.customevents.view;

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
import com.cobiscorp.designer.api.builder.ViewEventBuilder;
import com.cobiscorp.designer.api.customization.*;
import com.cobiscorp.designer.api.customization.arguments.*;
import com.cobiscorp.designer.api.managers.DesignerManagerException;

/**
 * Personalizacion de Eventos del Formulario
 *
 * VW_CLIENTEGQT_977_ViewEvent - View of FormCliente
 *
 */
@Component
@Service({ViewEventBuilder.class})
@Properties(value={
		@Property(name = "view.id", value = "VW_CLIENTEGQT_977"),
		@Property(name = "view.version", value = "1.0.0")
})
public class CEVA_010VA_VAIMAGEBUTTONNN_242977_237_ViewEvent extends ViewEventBuilder
 implements IExecuteCommand
{
	/**
	 * Instancia de Logger
	 */
	private static final ILogger logger = LogFactory.getLogger(CEVA_010VA_VAIMAGEBUTTONNN_242977_237_ViewEvent.class);
    
	@Reference(name="iExecuteCommandVA_VAIMAGEBUTTONNN_242977",referenceInterface =IExecuteCommand.class,bind = "setiExecuteCommandVA_VAIMAGEBUTTONNN_242977",unbind = "unsetiExecuteCommandVA_VAIMAGEBUTTONNN_242977",cardinality = ReferenceCardinality.MANDATORY_UNARY,policy=ReferencePolicy.DYNAMIC,target="(&(view.id=VW_CLIENTEGQT_977)(view.version=1.0.0)(view.controlId=VA_VAIMAGEBUTTONNN_242977))")
	private IExecuteCommand iExecuteCommandVA_VAIMAGEBUTTONNN_242977;

	public void setiExecuteCommandVA_VAIMAGEBUTTONNN_242977(IExecuteCommand iExecuteCommandVA_VAIMAGEBUTTONNN_242977) {
		this.iExecuteCommandVA_VAIMAGEBUTTONNN_242977 = iExecuteCommandVA_VAIMAGEBUTTONNN_242977;
	}

	public void unsetiExecuteCommandVA_VAIMAGEBUTTONNN_242977(IExecuteCommand iExecuteCommandVA_VAIMAGEBUTTONNN_242977) {
		this.iExecuteCommandVA_VAIMAGEBUTTONNN_242977 = iExecuteCommandVA_VAIMAGEBUTTONNN_242977;
	}

	@Reference(bind = "setBLI6988_bli_consulta_cliente", unbind = "unsetBLI6988_bli_consulta_cliente", cardinality = ReferenceCardinality.MANDATORY_UNARY,target="(bli.id=BLI6988_bli_consulta_cliente)")
	private com.cobiscorp.designer.bli.api.IBLIExecutor bLI6988_bli_consulta_cliente;
	public void setBLI6988_bli_consulta_cliente(com.cobiscorp.designer.bli.api.IBLIExecutor bLI6988_bli_consulta_cliente) {
		this.bLI6988_bli_consulta_cliente = bLI6988_bli_consulta_cliente;
	}
	public void unsetBLI6988_bli_consulta_cliente(com.cobiscorp.designer.bli.api.IBLIExecutor bLI6988_bli_consulta_cliente) {
		this.bLI6988_bli_consulta_cliente = null;
	}
	@Override
	public void executeCommand(DynamicRequest arg0, IExecuteCommandEventArgs arg1) {
		try {
			iExecuteCommandVA_VAIMAGEBUTTONNN_242977.executeCommand(arg0, arg1);
			bLI6988_bli_consulta_cliente.execute(arg0);
		} catch (Exception ex) {
			arg1.setSuccess(false);
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
	}


	@Override
	public void configure() {
        this.addExecuteCommandEvent("VA_VAIMAGEBUTTONNN_242977", this);
	}

}

