//Evento initData : Inicialización de datos del formulario, después de este evento se realiza el seguimiento de cambios en los datos
//ViewContainer: formRetiros
task.initData.VC_RETIROSIQQ_246328 = function (entities, initDataEventArgs) {

    initDataEventArgs.commons.execServer = false;
    initDataEventArgs.commons.api.viewState.disable('VA_CODCLIENTERHHLB_952860');
    initDataEventArgs.commons.api.viewState.disable('VA_NOMBRECLIENTEEE_614860');
    initDataEventArgs.commons.api.viewState.disable('VA_APELLIDOCLIENEE_564860');
    initDataEventArgs.commons.api.viewState.disable('VA_CEDULACLIENTEEE_675860');
    initDataEventArgs.commons.api.viewState.disable('VA_TIPOCUENTAMMNWY_930860');
    initDataEventArgs.commons.api.viewState.disable('VA_SALDOKDFKDYTGUJ_536860');
    entities.BusquedaCliente.numeroCuenta = '';
    entities.BusquedaCliente.saldoNuevo = 0;
    entities.BusquedaCliente.sald = 0;


};