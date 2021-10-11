$(Iniciar);

function Iniciar(){
  $.ajax({
    url: 'mapa.html',
    cache: false,
    success: function(datosMap){ //si responde 200
      $('#mapa').html(datosMap)
    }
  });
}
