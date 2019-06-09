$(document).ready(function(){
         $("#addrestaurantbutton").click( function()
           {
             var obj = $('form').serializeJSON();
             var formData = JSON.stringify(obj);

            alert(formData);

            $.ajax({
        type: 'POST',
        url: 'https://loginbackend.herokuapp.com/addfondas',
        dataType: 'json',
        data: formData,
        contentType : 'application/json',
        success: function(data) {
            alert(data)
        }
    });
           });
    });
