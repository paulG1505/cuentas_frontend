/*
 * Archivo: Guardar_CM_TCNTASHL_UHH.java
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

package com.cobiscorp.cobis.cntas.customevents.impl.form.executecommand;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.apache.felix.scr.annotations.Service;

import com.cobiscorp.cobis.cntas.model.Cuenta;
import com.cobiscorp.cobis.commons.domains.log.ILogger;
import com.cobiscorp.cobis.commons.log.LogFactory;
import com.cobiscorp.designer.api.DataEntity;
import com.cobiscorp.designer.api.DynamicRequest;
import com.cobiscorp.designer.api.customization.IExecuteCommand;
import com.cobiscorp.designer.api.customization.arguments.IExecuteCommandEventArgs;
import com.cobiscorp.designer.api.managers.DesignerManagerException;
import com.cobiscorp.designer.bli.api.IBLIExecutor;

@Component
@Service({ IExecuteCommand.class })
@Properties({ @Property(name = "task.module", value = "CNTAS"),
             @Property(name = "task.submodule", value = "ADMIN"),
             @Property(name = "task.id", value = "T_CNTASHLWLUDIX_727"),
             @Property(name = "task.version", value = "1.0.0"),
             @Property(name = "task.controlId", value = "CM_TCNTASHL_UHH")})

public class Guardar_CM_TCNTASHL_UHH implements IExecuteCommand {
	/**
	 * Instancia de Logger
	 */
	
	@Reference(bind = "setBLI8533_bli_insertar_c_ahorros", unbind = "unsetBLI8533_bli_insertar_c_ahorros", cardinality = ReferenceCardinality.MANDATORY_UNARY, target = "(bli.id=BLI8533_bli_insertar_c_ahorros)")
	private IBLIExecutor bLI8533_bli_insertar_c_ahorros;
	 public void setBLI8533_bli_insertar_c_ahorros(IBLIExecutor bLI8533_bli_insertar_c_ahorros) {
		    this.bLI8533_bli_insertar_c_ahorros = bLI8533_bli_insertar_c_ahorros;
		  }
		  
		  public void unsetBLI8533_bli_insertar_c_ahorros(IBLIExecutor bLI8533_bli_insertar_c_ahorros) {
		    this.bLI8533_bli_insertar_c_ahorros = null;
		  }
		  
		  @Reference(bind = "setBLI7721_bli_insertar_c_corriente", unbind = "unsetBLI7721_bli_insertar_c_corriente", cardinality = ReferenceCardinality.MANDATORY_UNARY, target = "(bli.id=BLI7721_bli_insertar_c_corriente)")
			private IBLIExecutor bLI7721_bli_insertar_c_corriente;
		  public void setBLI7721_bli_insertar_c_corriente(IBLIExecutor bLI7721_bli_insertar_c_corriente) {
			    this.bLI7721_bli_insertar_c_corriente = bLI7721_bli_insertar_c_corriente;
			  }
			  
			  public void unsetBLI7721_bli_insertar_c_corriente(IBLIExecutor bLI7721_bli_insertar_c_corriente) {
			    this.bLI7721_bli_insertar_c_corriente = null;
			  }
			  
		
	private static final ILogger logger = LogFactory.getLogger(Guardar_CM_TCNTASHL_UHH.class);

	@Override
	public void executeCommand(DynamicRequest arg0, IExecuteCommandEventArgs arg1) {
		// TODO Auto-generated method stub
		try {
			if (logger.isDebugEnabled()) {
				logger.logDebug("Start executeCommand in Guardar_CM_TCNTASHL_UHH");
			}
			 DataEntity entity = arg0.getEntity("Cuenta");
		      String tipo = (String)entity.get(Cuenta.TIPO);
		      if (tipo.equals("001")) {
		        this.bLI7721_bli_insertar_c_corriente.execute(arg0);
		      } else if (tipo.equals("002")) {
		        this.bLI8533_bli_insertar_c_ahorros.execute(arg0);
		      } 
		} catch (Exception ex) {
			DesignerManagerException.handleException(arg1.getMessageManager(), ex, logger);
		}
	}

}

