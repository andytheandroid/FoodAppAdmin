$(document).ready( function () {


  $.ajax({
             type: "POST", //rest Type
             dataType: 'json',
             url: "https://loginbackend.herokuapp.com/getfondas",
             async: false,
             contentType: "application/json; charset=utf-8",

             success: function (msg) {
               var obj = JSON.stringify(msg);
                addRestaurantsToComboBox(msg);

             }
  });


  //Dessert
    $.ajax({
               type: "POST", //rest Type
               dataType: 'jsonp',
               url: "https://www.themealdb.com/api/json/v1/1/filter.php?c=dessert",
               async: false,
               headers: {
              "Access-Control-Allow-Origin":"*"
    },
               success: function (msg) {
                 var obj = JSON.stringify(msg);
                  addMainDishToComboBox(msg);

               }
    });

    //Main dish
      $.ajax({
                 type: "POST", //rest Type
                 dataType: 'jsonp',
                 url: "https://www.themealdb.com/api/json/v1/1/filter.php?c=beef",
                 async: false,
                 headers: {
                
                "Access-Control-Allow-Origin":"*"
      },

                 success: function (msg) {
                   var obj = JSON.stringify(msg);
                    addDessertsToComboBox(msg);

                 }
      });


});

function addRestaurantsToComboBox(msg) {
  var restaurants = document.getElementById("Restaurants");

       for (var i = 0; i < msg.length; i++) {
           var restaurant = document.createElement("OPTION");

           restaurant.innerHTML = msg[i].name;

           restaurant.value = msg[i].id;

           restaurants.options.add(restaurant);
       }
   }

   function addDessertsToComboBox(msg) {
     var restaurants = document.getElementById("desserts");

          for (var i = 0; i < msg.length; i++) {
              var restaurant = document.createElement("OPTION");

              restaurant.innerHTML = msg[i].strMeal;

              restaurant.value = msg[i].idMeal;

              restaurants.options.add(restaurant);
          }
      }
      function addMainDishToComboBox(msg) {
        var restaurants = document.getElementById("Maindish");

             for (var i = 0; i < msg.length; i++) {
                 var restaurant = document.createElement("OPTION");

                 restaurant.innerHTML = msg[i].strMeal;

                 restaurant.value = msg[i].idMeal;

                 restaurants.options.add(restaurant);
             }
         }
