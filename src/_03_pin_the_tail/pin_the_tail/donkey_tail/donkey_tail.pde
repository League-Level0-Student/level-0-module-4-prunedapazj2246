PImage d;
PImage t;
int x;
int y;
void setup(){
  d = loadImage("donkey.jpg");      //change the file name if you need to
t = loadImage("tail.png");
 x = mouseX;
 y = mouseY;
size(262,193);
t.resize(50,45);
}
void draw(){
   println("X: " + mouseX + " Y: " + mouseY); 
 
image(t, mouseX, mouseY); 
rect(0, 0, 30, 30);
rect(200,42,30,30);
if(dist(0, 0, mouseX, mouseY) < 30){
 background(d); 
}
else{
 background(0,0,0); 
}
if(mousePressed){
  x
}
}
