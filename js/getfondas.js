$(document).ready( function () {


  $.ajax({
             type: "POST", //rest Type
             dataType: 'json',
             url: "https://loginbackend.herokuapp.com/getRestaurants",
             async: false,
             contentType: "application/json; charset=utf-8",
             success: function (msg) {
               var obj = JSON.stringify(msg);
                drawTable(msg);

             }
  });


});

function drawTable(data) {
    for (var i = 0; i < data.length; i++) {
        drawRow(data[i]);
    }
}

function drawRow(rowData) {
    var row = $("<tr />")
    $("#dataTable").append(row);
    row.append($("<td>" + rowData.name + "</td>"));
    row.append($("<td>" + rowData.address + "</td>"));
    row.append($("<td>" + rowData.description + "</td>"));
    row.append($("<td>" + rowData.priceLevel + "</td>"));
    row.append($("<td>" + rowData.coordlatitude + "</td>"));
    row.append($("<td>" + rowData.coordAltitude + "</td>"));
    row.append($("<td>" + rowData.neigborhood+ "</td>"));






}
