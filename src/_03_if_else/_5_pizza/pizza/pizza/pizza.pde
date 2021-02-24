
void setup() {
    size(500, 500);
pepperoni = loadImage("pepperoni.png");
fill(#ADA375);
 ellipse (250, 250, 210, 210);
  fill(#DE2222);
  ellipse (250, 250, 200, 200)  ; 
  fill(#EADD61);
   ellipse (250, 250, 190, 190)  ; 
}
void draw() {

  
  
 
 pepperoni.resize(30, 30);
 if(mousePressed){
image(pepperoni,mouseX,mouseY);
}
}

PImage pepperoni; 

  
  
