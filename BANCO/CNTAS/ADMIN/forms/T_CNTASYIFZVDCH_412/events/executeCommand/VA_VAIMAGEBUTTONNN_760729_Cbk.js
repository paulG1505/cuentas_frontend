
//Start signature to Callback event to VA_VAIMAGEBUTTONNN_760729
task.executeCommandCallback.VA_VAIMAGEBUTTONNN_760729 = function(entities, executeCommandCallbackEventArgs) {
     //here your code
    entities.Transferencia.cuentaO=entities.BusquedaCliente.numeroCuenta
    entities.Transferencia.tipoO=entities.BusquedaCliente.tipoCuenta
};
