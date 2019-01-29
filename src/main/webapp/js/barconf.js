function drawBarChart() {
        	
        	
        	
        	
          if ($("#barChart").length) {
            ctxBar = document.getElementById("barChart").getContext("2d");

            optionsBar = {
              responsive: true,
              scales: {
                yAxes: [
                  {
                    barPercentage: 0.2,
                    ticks: {
                      beginAtZero: true
                    },
                    scaleLabel: {
                      display: true,
                      labelString: "Inside Temperature,C"
                    }
                  }
                ]
              }
            };

            optionsBar.maintainAspectRatio =
              $(window).width() < width_threshold ? false : true;

            /**
             * COLOR CODES
             * Red: #F7604D
             * Aqua: #4ED6B8
             * Green: #A8D582
             * Yellow: #D7D768
             * Purple: #9D66CC
             * Orange: #DB9C3F
             * Blue: #3889FC
             */
            
            
            
          

            	   var idSalles = [];

            	   $.getJSON("http://localhost:8080/Project_SOA/webapi/rotan/get", function(data) {
            	       
            	          var tblRow = "<tr>" + "<td>" + data.id + "</td>" +
            	           "<td>" + data.id + "</td>" + "<td>" + data.id + "</td>" + "<td>" + data.id + "</td>" + "</tr>";
            	           $(tblRow).appendTo("#userdata tbody");
            	     

            	   });

            	
            
            
            
             
            
            configBar = {
              type: "horizontalBar",
              data: {
                labels: ["Salle1","Salle2","Salle3"],
                datasets: [
                  {
                    label: "Inside Temperature,C",
                    data: [18,21,23],
                    backgroundColor: [
                      "#F7604D",
                      "#4ED6B8",
                      "#A8D582",
                      "#D7D768",
                      "#9D66CC",
                      "#DB9C3F",
                      "#3889FC"
                    ],
                    borderWidth: 0
                  }
                ]
              },
              options: optionsBar
            };

            barChart = new Chart(ctxBar, configBar);
          }
        }
