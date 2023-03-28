$(document).ready(function(){
    /* alert("Holaaaa") */
    $('#listar').on('click',function(){
        let tabla= document.querySelector('#table')   
        tabla.innerHTML=
        '<thead><th>Codigo</th><th>Curso</th><th>Nombre</th><th>Apellido</th><th>Materias</th><th>Nota</th></thead>';
        $.ajax({
            url:"http://localhost:8080/listar",
            type: "GET",
            dataType: "JSON",
            success:function(respuesta){
                console.log(respuesta);
                for( i=0;i <=respuesta.length;i++){
                    tabla.innerHTML+='<tr><td>'+respuesta[i].codigo+'</td><td>'+
                        respuesta[i].curso+'</td><td>'+    
                        respuesta[i].nombre+'</td><td>'+    
                        respuesta[i].apellido+'</td><td>'+
                        respuesta[i].materias+'</td><td>'+
                        respuesta[i].notas+'</td><tdr>'
                } 
            }
        });     
    });

    $('#enviar').on('click', function() {
        let datos = {
            codigo: parseInt($('#codigo').val()),
            curso: $('#Curso').val(),
            nombre: $('#Nombre').val(),
            apellido: $('#Apellido').val(),
            materias: materias = [$('#Mate1').val(), $('#Mate2').val(), $('#Mate3').val()],
            notas: notas = [parseFloat($('#Nota1').val()), parseFloat($('#Nota2').val()), parseFloat($('#Nota3').val())],
        }
        console.log(datos);
        let datosEnvio = JSON.stringify(datos);
        console.log(datosEnvio);
    
        $.ajax({
            url: "http://localhost:8080/agregar",
            type: "POST",
            data: datosEnvio,
            contentType: "application/JSON",
            dataType: "JSON",
            success: function(respuesta) {
                alert(respuesta);
            }
        });
    });


    $('#buscar').on('click',function(){
        let curso= $('#curso').val();
        console.log(curso)
        $.ajax({
            url:"http://localhost:8080/Buscar/"+curso,
            type: "Get",
            /* dataType: "JSON", */
            success: function(respuesta){
                console.log(respuesta)
            
                for( i=0;i <=respuesta.length;i++){
                    $('#usuario').append(
                        "Usuario</br>Codigo" + respuesta[i].codigo + 
                        "</br>Curso: "+respuesta[i].curso+ 
                        "</br>Nombre: "+respuesta[i].nombre+ 
                        "</br>Apellido: "+respuesta[i].apellido+ 
                        "</br>Materias: "+respuesta[i].materias+ 
                        "</br>Notas: "+respuesta[i].notas)
                }
            }
        });
    });

});