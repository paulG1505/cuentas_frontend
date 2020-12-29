
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




