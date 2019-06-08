$(document).ready( function () {
	 var table = $('#dataTable').DataTable({
		 "ajax": {
					 "url": "https://loginbackend.herokuapp.com/getfondas",
					 "type": "POST"
			 },
			"sAjaxDataProp": "",
			"order": [[ 0, "asc" ]],
			"aoColumns": [
			    { "mData": "id"},
		      { "mData": "name" },
				  { "mData": "address" },
					{ "mData": "description" },
				  { "mData": "coordlatitude" },
				  { "mData": "coordAltitude" },
				  { "mData": "businessHours" },
          { "mData": "neigborhood" },
          { "mData": "backgroundimageurl" },
          { "mData": "priceLevel" },
          { "mData": "thumbnail" }


			]
	 })
});
