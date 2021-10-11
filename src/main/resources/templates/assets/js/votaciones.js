var voto = new Array(7);
voto[0] = 0;
voto[1] = 0;
voto[2] = 0;
voto[3] = 0;
voto[4] = 0;
voto[5] = 0;
voto[6] = 0;
voto[7] = 0;

function votar(opcion)
{
    switch (opcion)
    {
        case 0:
        {
            let total = voto[0]+voto[1]+voto[2]+voto[3]+voto[4]+voto[5]+voto[6];
            estCand1 = (voto[0]/total)*100;
            estCand2 = (voto[1]/total)*100;
            estCand3 = (voto[2]/total)*100;
            estCand4 = (voto[3]/total)*100;
            estCand5 = (voto[4]/total)*100;
            estCand6 = (voto[5]/total)*100;
            /* alert("El candidato 1 obtuvo "+voto[0]+"("+estCand1.toFixed(2)+"%) votos\nEl candidato 2 obtuvo "+voto[1]+"("+estCand2.toFixed(2)+"%) votos\nEl candidato 3 obtuvo "+voto[2]+"("+estCand3.toFixed(2)+"%) votos\nEl candidato 4 obtuvo "+voto[3]+"("+estCand4.toFixed(2)+"%) votos\nEl candidato 5 obtuvo "+voto[4]+"("+estCand5.toFixed(2)+"%) votos\nEl candidato 6 obtuvo "+voto[5]+"("+estCand6.toFixed(2)+"%) votos"); */
            swal("¡Votación finalizada!", "¡Tu votación se ha registrado correctamente!", "success");

            document.getElementById('lbResultado1').innerHTML = (estCand1.toFixed(2))+" %";
            document.getElementById('lbResultado2').innerHTML = (estCand2.toFixed(2))+" %";
            document.getElementById('lbResultado3').innerHTML = (estCand3.toFixed(2))+" %";
            document.getElementById('lbResultado4').innerHTML = (estCand4.toFixed(2))+" %";
            document.getElementById('lbResultado5').innerHTML = (estCand5.toFixed(2))+" %";
            document.getElementById('lbResultado6').innerHTML = (estCand6.toFixed(2))+" %";
            $('#bar0').css('width', estCand1.toFixed(2) + '%');
            $('#bar1').css('width', estCand2.toFixed(2) + '%');
            $('#bar2').css('width', estCand3.toFixed(2) + '%');
            $('#bar3').css('width', estCand4.toFixed(2) + '%');
            $('#bar4').css('width', estCand5.toFixed(2) + '%');
            $('#bar5').css('width', estCand6.toFixed(2) + '%');

            break;
        }
        case 1:
        {
            voto[0] = voto[0] + 1;
            break;
        }
        case 2:
        {
            voto[1] = voto[1] + 1;
            break;
        }
        case 3:
        {
            voto[2] = voto[2] + 1;
            break;
        }
        case 4:
        {
            voto[3] = voto[3] + 1;
            break;
        }  
        case 5:
        {
            voto[4] = voto[4] + 1;
            break;
        }
        case 6:
        {
            voto[5] = voto[5] + 1;
            break;
        } 
        case 7:
        {
            voto[6] = voto[6] + 1;
            break;
        }      
        case 8:
        {
            voto[0] = 0;
            voto[1] = 0;
            voto[2] = 0;
            voto[3] = 0;
            voto[4] = 0;
            voto[5] = 0;
            voto[6] = 0;
            voto[7] = 0;

            $('#bar0').css('width', 0);
            $('#bar1').css('width', 0);
            $('#bar2').css('width', 0);
            $('#bar3').css('width', 0);
            $('#bar4').css('width', 0);
            $('#bar5').css('width', 0);     

            break;
            
        }                       
    }
}
