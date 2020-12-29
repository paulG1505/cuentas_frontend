/* variables locales de T_CNTASJJPLZAZE_834*/

(function (root, factory) {
    factory();
} (this, function() {

    "use strict";

    /*global designerEvents, console */

        //*********** COMENTARIOS DE AYUDA **************
        //  Para imprimir mensajes en consola
        //  console.log("executeCommand");

        //  Para enviar mensaje use
        //  eventArgs.commons.messageHandler.showMessagesInformation('Ejecutando comando personalizado');

        //  Para evitar que se continue con la validación a nivel de servidor
        //  eventArgs.commons.execServer = false;

        //**********************************************************
        //  Eventos de VISUAL ATTRIBUTES
        //**********************************************************

    
        var task = designerEvents.api.formcliente;
    

    //"TaskId": "T_CNTASJJPLZAZE_834"


    	

//Entity: FiltroCliente
//FiltroCliente. (ImageButton) View: FormCliente
//Evento ExecuteCommand: Permite personalizar la acción a ejecutar de un command o de un ActionControl.
task.executeCommand.VA_VAIMAGEBUTTONNN_242977 = function(  entities, executeCommandEventArgs ) {

    executeCommandEventArgs.commons.execServer = true;
    //executeCommandEventArgs.commons.serverParameters.FiltroCliente = true;

};

	
//ClienteQuery Entity: Cliente
task.executeQuery.Q_CLIENETT_YU32 = function(executeQueryEventArgs){
    executeQueryEventArgs.commons.execServer = true;
    //executeQueryEventArgs.commons.serverParameters.Cliente = true;
};

	
//gridRowSelecting QueryView: QV_BV32_OZJ75
//Se ejecuta antes de que los datos modificados en una grilla sean comprometidos.
task.gridRowSelecting.QV_BV32_OZJ75 = function (entities,gridRowSelectingEventArgs) {
        
      gridRowSelectingEventArgs.commons.execServer = false;




//Open Modal
var nav = gridRowSelectingEventArgs.modelRow.gr

    nav.label = 'Crear Cuenta';
nav.address = {
moduleId: 'CNTAS',
subModuleId: 'ADMIN',
taskId: 'T_CNTASHLWLUDIX_727',
taskVersion: '1.0.0',
viewContainerId: 'VC_CREATEACNT_470727'
};

    nav.queryParameters = {
    mode: 2
    };
    nav.modalProperties = {
    size: 'md',
    callFromGrid: false
    };

    nav.customDialogParameters = {
    variable: entities.Cliente
    };

//Si la llamada es desde un evento de un control perteneciente a la cabecera de la página
//nav.openModalWindow(args.commons.controlId, null);
//Si la llamada es desde un evento de un control perteneciente a una grilla de la página

    nav.openModalWindow('VC_CREATEACNT_470727', gridRowSelectingEventArgs.modelRow.gr);

};








}));
