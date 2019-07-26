PImage creeper;     //at the top of your program
int x;
int y;
void setup(){
  size(755,500);
  PImage minecraft = loadImage("blue.jpg");     //in setup method
minecraft.resize(755, 500);          //in setup method
background(minecraft);
creeper=loadImage("creeper.jpg");//in setup method
creeper.resize(50,100);
}
void loop(){
  if(mousePressed){
   x = mouseX;
   y = mouseY;
   
  }
  image(creeper, x, y);
  if(mousePressed){
   fill(255,0,0);
   ellipse(20,20,20,20);
  }
}
