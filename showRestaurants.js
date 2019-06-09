$(document).ready( function () {
	 var table = $('#dataTable').DataTable({
		 "ajax": {
					 "url": "http://localhost:8087/getfondas",
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
