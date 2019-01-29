package fr.insa.soa.Project_SOA;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET; 
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
* Root resource (exposed at "myresource" path)
*/
@Path("rotan")
public class MyResource {

private static ArrayList<Salle> salles = new ArrayList<Salle>();
/**
* Method handling HTTP GET requests. The returned object will be sent
* to the client as "text/plain" media type.
*
* @return String that will be returned as a text/plain response.
*/
@GET
@Produces(MediaType.TEXT_PLAIN)
public String getIt() {
return "BVlala";
}

@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/{idSalle}")
public String addNewSalle(@PathParam("idSalle") int id){
Salle salle = new Salle(id, 0,0, false,false,false,false,false);
salles.add(salle);

return "Salle " + String.valueOf(id) + "added";
}
@GET
@Produces(MediaType.TEXT_PLAIN)
@Path("/temp/{idSalle}")
public String getTemp(@PathParam("idSalle") int id){

Salle salle = null;
for (Salle s : salles){
if(s.getId()==id){
salle = s;
}
}

return "La temperature en salle " + String.valueOf(id) + " est : "+ salle.getTemperature_in();
}

@GET
@Path("/{idSalle}/{temperatureIn}")
@Produces(MediaType.TEXT_PLAIN)
public String newSalle (@PathParam("idSalle") int id, @PathParam("temperatureIn") int temp_in) {


Salle salle = new Salle(id, temp_in,0, false,false,false,false,false);
salles.add(salle);

return "Salle " + String.valueOf(id) + "added avec temp " + String.valueOf(temp_in);
}

@GET
@Path("/{idSalle}/{temperatureIn}/{temperatureOut}")
@Produces(MediaType.TEXT_PLAIN)
public String newSalle (@PathParam("idSalle") int id, @PathParam("temperatureIn") int temp_in, @PathParam("temperatureOut") int temp_out) {


Salle salle = new Salle(id, temp_in, temp_out, false,false,false,false,false);
salles.add(salle);

return "Salle " + String.valueOf(id) + "added avec salle temp " + String.valueOf(temp_in) + " temp exterieur : "+ String.valueOf(temp_out);
}

@GET
@Path("newSalle")
@Produces(MediaType.TEXT_PLAIN)
public void newSalleQuery (@QueryParam("idSalle") int id, @QueryParam("itemp") int temp_in, @QueryParam("etemp") int temp_out) {


Salle salle = new Salle(id, temp_in, temp_out, false,false,false,false,false);
salles.add(salle);

System.out.println("Salle " + salle.getId() + "added avec salle temp " + salle.getTemperature_in() + " temp exterieur : "+ salle.getTemperature_out());
}

@GET
@Path("chauffage/{idSalle}")
@Produces(MediaType.TEXT_PLAIN)
public String chauffage(@PathParam("idSalle") int id){
String a;
String z;
Salle salle = null;
for (Salle s : salles){
if(s.getId()==id){
salle = s;
}
}
a = "Id salle : " + salle.getId() + "\n";
a += "Temp interieur : " + salle.getTemperature_in() + "\n";
a += "Temp exterieur : " + salle.getTemperature_out() + "\n";
a += "Chauffage : ";
if(salle.isChauffage())
a += "on";
else
a += "off";
a += "\n";
a += "Fenetre : ";
if(salle.isFenetre())
a += "ouvert";
else
a += "ferme";
a += "\n";


if(salle.getTemperature_out()>18 && salle.getTemperature_out()<27){
if(salle.getTemperature_out()<salle.getTemperature_in() && !salle.isFenetre()){
salle.setFenetre(true);
}
else
salle.setFenetre(false);
} else if (salle.getTemperature_out()<18){
if(salle.getTemperature_in()<19 && !salle.isChauffage()){
salle.setChauffage(true);
}else if(salle.getTemperature_in()>22 && salle.isChauffage()){
salle.setChauffage(false);
}
} else {
if(salle.getTemperature_in()<18 && !salle.isFenetre()){
salle.setFenetre(true);
}else if(salle.getTemperature_in()>22 && salle.isFenetre()){
salle.setFenetre(false);
}
}

z = "Id salle : " + salle.getId() + "\n";
z += "Temp interieur : " + salle.getTemperature_in() + "\n";
z += "Temp exterieur : " + salle.getTemperature_out() + "\n";
z += "Chauffage : ";
if(salle.isChauffage())
z += "on";
else
z += "off";
z += "\n";
z += "Fenetre : ";
if(salle.isFenetre())
z += "ouvert";
else
z += "ferme";
z += "\n";

String r = "Etat de la salle avant l'appel du chauffage : \n";
r += a;
r += "\n";
r += "Etat de la salle apres : ";
r += z;


return r;
}

@Path("/get/{idSalle}")
@GET

@Produces(MediaType.APPLICATION_JSON)
public Salle get(@PathParam("idSalle") int id){
Salle salle = null;
for (Salle s : salles){
if(s.getId() == id)
salle = s;
}
return salle;
}

@GET
@Path("get")
@Produces(MediaType.APPLICATION_JSON)
public ArrayList<Salle> getTotal(){
return salles;
}

//time hhmm
@GET
@Path("gestion_acces/{getTime}")
@Produces(MediaType.TEXT_PLAIN)
public void acces(@PathParam("getTime") double time){
if(time > 2200 || time < 700){
for (Salle salle : salles){
if(!salle.isPorte())
salle.setPorte(false);
if(!salle.isFenetre())
salle.setFenetre(false);
}
}

if (time > 700 && time < 2200){
for (Salle salle : salles){
if(salle.isPorte())
salle.setPorte(true);
}
}

}


//time hhmm
@GET
@Path("gestion_lumiere/{getTime}")
@Produces(MediaType.TEXT_PLAIN)
public void presence(@PathParam("getTime") double time){

for(Salle salle : salles){
if(salle.isPresence()){
if(time > 700 && time < 2200)
salle.setLumiere(true);
}
if(!salle.isPresence()){
salle.setLumiere(false);
}
}
}

@GET
@Path("gestion_alarm/{getTime}")
@Produces(MediaType.TEXT_PLAIN)
public void alarm(@PathParam("getTime") double time){
if(time > 700 && time < 2200){
for(Salle salle : salles){
/*if(salle.isPresence())
salle.onAlarm();*/
}
}
}


@GET
@Path("chauffage/batiment")
@Produces(MediaType.TEXT_PLAIN)
public String chauffage(){
String a;
String z;
String r = "";
for (Salle salle : salles){

a = "Id salle : " + salle.getId() + "\n";
a += "Temp interieur : " + salle.getTemperature_in() + "\n";
a += "Temp exterieur : " + salle.getTemperature_out() + "\n";
a += "Chauffage : ";
if(salle.isChauffage())
a += "on";
else
a += "off";
a += "\n";
a += "Fenetre : ";
if(salle.isFenetre())
a += "ouvert";
else
a += "ferme";
a += "\n";


if(salle.getTemperature_out()>18 && salle.getTemperature_out()<27){
if(salle.getTemperature_out()<salle.getTemperature_in() && !salle.isFenetre()){
salle.setFenetre(true);
}
else
salle.setFenetre(false);
} else if (salle.getTemperature_out()<18){
if(salle.getTemperature_in()<19 && !salle.isChauffage()){
salle.setChauffage(true);
salle.setFenetre(false);
}else if(salle.getTemperature_in()>22 && salle.isChauffage()){
salle.setChauffage(false);
salle.setFenetre(true);
}
} else {	
if(salle.getTemperature_in()<18 && !salle.isFenetre()){
salle.setFenetre(true);
}else if(salle.getTemperature_in()>22 && salle.isFenetre()){
salle.setFenetre(false);
}
}

z = "Id salle : " + salle.getId() + "\n";
z += "Temp interieur : " + salle.getTemperature_in() + "\n";
z += "Temp exterieur : " + salle.getTemperature_out() + "\n";
z += "Chauffage : ";
if(salle.isChauffage())
z += "on";
else
z += "off";
z += "\n";
z += "Fenetre : ";
if(salle.isFenetre())
z += "ouvert";
else
z += "ferme";
z += "\n";

r = "Etat de la salle avant l'appel du chauffage : \n";
r += a;
r += "\n";
r += "Etat de la salle apres : ";
r += z;
System.out.println(r); 
}

return "gestion chauffage fait.";

}





}
 
