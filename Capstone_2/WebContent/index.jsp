<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>



<!DOCTYPE html>
<html>
<head>

<style type="text/css">
p.double {
	border-style: double;
}

<!-- Insert cream background color -->

p.body {

background-color: ;

}
</style>



<title>The Music Preserve</title>


<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<meta charset="UTF-8">

</head>
<body>

	<%@ include file="navbar.jsp"%>


	<%@ include file="Header.jsp"%>

	<br>
	<br>






	<br>
	<br>

	<div class="row">
		<div class="col-md-6">

			<p class="double lead text-center">
				With Trebles and Clefs, your future bandmates are just a click away!
				By using our service, you will automatically gain access to our
				database of musicians and like minded individuals that want what you
				want: to <u>rock!</u>
			</p>

		</div>

		<div class="row">
			<div class="col-md-6">
				<p>
					<a class="twitter-timeline"
						href="https://twitter.com/TreblesAndClefs"
						data-widget-id="608113494907482112">Tweets by @TreblesAndClefs</a>
					<script>
						!function(d, s, id) {
							var js, fjs = d.getElementsByTagName(s)[0], p = /^http:/
									.test(d.location) ? 'http' : 'https';
							if (!d.getElementById(id)) {
								js = d.createElement(s);
								js.id = id;
								js.src = p
										+ "://platform.twitter.com/widgets.js";
								fjs.parentNode.insertBefore(js, fjs);
							}
						}(document, "script", "twitter-wjs");
					</script>
				</p>
			</div>
		</div>
	</div>

	<div class="container"></div>
</body>
</html>