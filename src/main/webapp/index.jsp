
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="icon" href="img/LogoISS.png">
    <title>Admin - Dashboard GEI Building</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,700">
    <!-- https://fonts.google.com/specimen/Roboto -->
    <link rel="stylesheet" href="css/fontawesome.min.css">
    <!-- https://fontawesome.com/ -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!-- https://getbootstrap.com/ -->
    <link rel="stylesheet" href="css/templatemo-style.css">
   
</head>

<body id="reportsPage">
    <div class="" id="home">
        <nav class="navbar navbar-expand-xl">
            <div class="container h-100">
                <a class="navbar-brand" href="index.html">
                    <h1 class="tm-site-title mb-0">GEI Building Management System</h1>
                </a>
                <button class="navbar-toggler ml-auto mr-0" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <i class="fas fa-bars tm-nav-icon"></i>
                </button>

                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav mx-auto h-100">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">
                                <i class="fas fa-tachometer-alt"></i>
                                Dashboard
                                <span class="sr-only">(current)</span>
                            </a>
                        </li>
                        
                    </ul>
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link d-block" href="login.jsp">
                                Admin, <b>Logout</b>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>

        </nav>
        <div class="container">
            <div class="row">
                <div class="col">
                    <p class="text-white mt-5 mb-5">Welcome back, <b>Admin</b></p>
                </div>
            </div>
            <!-- row -->
            <div class="row tm-content-row">
                
                
                
                <div class="col-sm-20 col-md-20 col-lg-10 col-xl-6 tm-block-col">
                   <div class="tm-bg-primary-dark tm-block"> 
                     <!--  <h2 class="tm-block-title">Setup page</h2> -->
                     
                     
              <form  method="get" action ="http://localhost:8080/Project_SOA/webapi/rotan/newSalle">
                    
                <div class="form-group">
                    <label for="idSalle">Room Id</label>
                    <input
                      name="idSalle"
                      type="text"
                      class="form-control validate"
                      id="idSalle"
                      value=""
                      required
                    />
                  </div>
                  <div class="form-group mt-3">
                    <label for="itemp">Inside Temperature</label>
                    <input
                      name="itemp"
                      type="text"
                      class="form-control validate"
                      id="itemp"
                      value=""
                      required
                    />
                  </div>
                  <div class="form-group mt-3">
                    <label for="etemp">Outside Temperature</label>
                    <input
                      name="etemp"
                      type="text"
                      class="form-control validate"
                      id="etemp"
                      value=""
                      required
                    />
                  </div>
                  
                  
                  <div class="form-group mt-4">
                    <button
                      type="submit"
                      class="btn btn-primary btn-block text-uppercase"
                    >
                      Send data
                    </button>
                
                </form>
                </div>
                </div>
                    
                 
                    
                </div>
                <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col">
                    <div class="tm-bg-primary-dark tm-block">
                        <h2 class="tm-block-title">Monitoring</h2>
                        <canvas id="barChart"></canvas>
                        
                     	
  						</div>
  						
                        
                    </div>
                </div>
                
                                  
                
                
                           
                           <div class="col-sm-12 col-md-12 col-lg-6 col-xl-6 tm-block-col">           
                              <form action="http://localhost:8080/Project_SOA/webapi/rotan/chauffage/batiment" id="get">
  						<div class="form-group mt-3">
                    	
                     						
  						<output form="get" for ="chauffage">  </output>
  						
  						<button
                      type="submit"
                      class="btn btn-primary btn-block text-uppercase"
                    	>
                      Get data
                    	</button>
  						</form>   
  						
                            </div>        
                
               
        
    </div>

    <script src="js/jquery-3.3.1.min.js"></script>
    <!-- https://jquery.com/download/ -->
    <script src="js/moment.min.js"></script>
    <!-- https://momentjs.com/ -->
    <script src="js/Chart.min.js"></script>
    <!-- http://www.chartjs.org/docs/latest/ -->
    <script src="js/bootstrap.min.js"></script>
    <!-- https://getbootstrap.com/ -->
    <script src="js/tooplate-scripts.js"></script>
    <script src="js/barconf.js"></script>
    
    <script>
        Chart.defaults.global.defaultFontColor = 'white';
        let ctxLine,
            ctxBar,
            optionsLine,
            optionsBar,
            configLine,
            configBar,
          
            lineChart;
       		 barChart;
       
        
        
        
        
        
        
        
        // DOM is ready
        $(function () {
        	//Client client = clientBuilder.newClient();
        //	Response response = client.target("http://localhost:8080/Project_SOA/webapi/rotan/salles").request().get();
			     	
            drawLineChart(); // Line Chart
            drawBarChart();
            
            drawPieChart();  // Pie Chart

            $(window).resize(function () {
                updateLineChart();
                updateBarChart();                
            });
        })
    
        
        
        
        
        
        
        
        
        
        
    
  

    </script>
</body>

</html>