if (typeof jQuery !== 'undefined') {
	(function($) {
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);
}

jQuery(function ($) {
	// Load dialog on page load
	//$('#basic-modal-content').modal();

	// Load dialog on click
	$("#list").delegate('a', 'click', function(e) {
		e.preventDefault();
		var id = this.id.split("-")[1];
		$("#sid").attr("value", id);
		$("#course").text($("#title-"+id).text());
		$("#register_t").modal({
			opacity:80,
			overlayCss: {backgroundColor:"#000"}
		});
	});
});