
         $("#newRestaurantForm").submit(function( event )
           {
             var obj = $('form').serializeJSON();
             var formData = JSON.stringify(obj);
             console.log(formData);

            $.ajax({
        type: 'POST',
        url: 'https://loginbackend.herokuapp.com/addfondas',
        dataType: 'text',
        data: formData,
        contentType : 'application/json',
        success: function(data) {
            alert("Registered sucessfully");
            window.location.replace("dashboard.html");

        }
    });

    event.preventDefault();

           });
