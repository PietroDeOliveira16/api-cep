$('#inputCep').on('input', function () {
    buscarCep($(this));
});

function buscarCep(inputElement){
    var cep = inputElement.val().replace(/\D/g, '');

    if(cep.length === 8){
        $.ajax({
            url: 'https://cep.awesomeapi.com.br/json/' + cep,
            method: 'GET',
            success: function(dataJson){
                    $("#inputEndereco").val(dataJson.address);
                    $("#inputBairro").val(dataJson.district);
                    $("#inputCidade").val(dataJson.city);
                    $("#inputEstado").val(dataJson.state);
            },
            error: function(){}
        });
    }
}