<%@ include file="./WEB-INF/header.jspf" %>
  <div id="configYourNetwork">
			<h3><span>Configuring Your Network</span></h3>
			<p class="p1"><span>In order to support Odin and Sleipnir running on your network you must allow <acronym title="Hypertext Transfer Protocol">HTTP</acronym>, <acronym title="File Transfer Protocol">FTP</acronym> and <acronym title="Transmission Control Protocol">TCP</acronym> network traffic.</span></p>
			<p class="p2"><span>HTTP and FTP are used to transfer the Sleipnir 
			application to a client PC. Updates to Sleipnir can also be distributed using these protocols. It is also used to display the web-pages which you are currently viewing.
			These protocols are used in conjunction with the <acronym title="Java Network Launch Platform">JNLP</acronym> protocol which is part of Java Web Start.</span></p>
			<p class="p2"><span>Sleipnir uses TCP port 13440 to communicate with Odin servers. This port must be enabled through any network resources which traffic would flow through to reach the local Odin server.</span></p>
			<p class="p2"><span>Odin uses TCP port 10584 to communicate with other Odin servers and share information between them.</span></p>
			<p class="p2"><span>You may need to open extra ports in some cases. Please refer to the Java and Apache websites for more information.</span></p>
		</div>
	</div>
	<div id="supportingText">
		<div id="setupOdin">
			<h3><span>Setting Up Your Own Server</span></h3>
			<p class="p1"><span>Odin is open source and as such is available free of charge. To obtain a copy please email the author who will send you a copy of the software electronically. You will also be placed on a list to receive updates of the application as and when they become available.</span></p>
			<p class="p2"><span>Both clients and servers should be running Oracle's <acronym title="Java Runtime Edition">JRE</acronym> version 1.6 or higher. Should you need to download it thee is a link to the download page listed in the "Resources" (right).</span></p>
			<p class="p2"><span>To obtain your copy of Odin, please email the following address (the formatting prevents automated agents from reading it): a l e x a n d e r (dot) h a r r i s (at) k c l (dot) a c (dot) u k</span></p>
	  </div>
<%@ include file="./WEB-INF/footer.jspf" %>