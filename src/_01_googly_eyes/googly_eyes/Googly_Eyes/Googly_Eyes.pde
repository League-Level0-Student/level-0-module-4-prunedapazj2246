void setup(){
  PImage face = loadImage("ren.jpg");
   size(800,600);
    face.resize(width,height);
  background(face);
}
void draw(){
 if(mouseX <100& mouseX > 500){
   mouseX = 340;
 }
 
 
else if(mouseY < 75 & mouseY > 85){
   mouseY = 80;
 }
 else{
   mouseX= 340;
   mouseY = 80;
 }
  fill(255,255,255);
  ellipse(340,80,30,30);
  fill(0,0,0);
  ellipse(mouseX,mouseY,15,15);
    fill(255,255,255);
  ellipse(380,80,30,30);
  fill(0,0,0);
  ellipse(mouseX + 40,mouseY  ,15,15);
  
 
  
}
