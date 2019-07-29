PImage creeper;     //at the top of your program
int x;
int y;
boolean isNear;
int a;
int b;
void setup(){
  size(755,500);
  PImage m = loadImage("minecraft.png");     //in setup method
m.resize(755, 500);          //in setup method
background(m);
creeper=loadImage("creeper.png");//in setup method
creeper.resize(50,100);
}
void draw(){
  

  if(mousePressed){
   x = mouseX;
   y = mouseY;
   image(creeper, x, y);
  }
  //image(creeper, x, y);
  if(mousePressed){
   fill(255,0,0);
   ellipse(x,y,20,20);
  }
 if(isNear(mouseX,x)&& isNear (mouseY,y)){
   println("YOU FOUND THE CREEPER!!!");
   image(creeper,x+=20,y+=20);
 }
}
boolean isNear( int a, int b) {
if (abs(a - b) < 10)
     return true;
else
     return false;
}
