//Entity: BusquedaCliente
//BusquedaCliente. (Button) View: formRetiros
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VABUTTONCBQVSQM_606860 = function (entities, executeCommandEventArgs) {


    //executeCommandEventArgs.commons.serverParameters.BusquedaCliente = true;

    if (entities.BusquedaCliente.numeroCuenta === '' || entities.BusquedaCliente.numeroCuenta === undefined || entities.BusquedaCliente.numeroCuenta === null) {

        executeCommandEventArgs.commons.messageHandler.showMessagesError("Debe ingresar un Numero de Cuenta", false, null, 5000);

    } else {

        executeCommandEventArgs.commons.execServer = true;
    }

};