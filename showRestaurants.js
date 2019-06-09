$(document).ready( function () {
	 var table = $('#dataTable').DataTable({
		 "ajax": {
					 "url": "https://loginbackend.herokuapp.com/getfondas",
					 "type": "POST"
			 },
			"sAjaxDataProp": "",
      "crossDomain": true,
			"order": [[ 0, "asc" ]],
			"aoColumns": [
		      { "mData": "name" },
				  { "mData": "address" },
				  { "mData": "coordlatitude" },
				  { "mData": "coordAltitude" },
				  { "mData": "businessHours" },
          { "mData": "neigborhood" },
          { "mData": "priceLevel" }


			]
	 })
});
