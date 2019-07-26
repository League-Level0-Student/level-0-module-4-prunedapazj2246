import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch

PImage d;
PImage t;
int x;
int y ;
boolean hasWon = false;
void setup() {
  d = loadImage("donkey.jpg");      //change the file name if you need to
  t = loadImage("ta.png");
  Minim minim = new Minim(this);     //In the setup method
  woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to


  size(262, 193);
  t.resize(50, 45);
}
void draw() {
  println("X: " + mouseX + " Y: " + mouseY); 
  if (hasWon == true) {
    background(d);
  } else {
    background(0, 0, 0);
  }
  image(t, mouseX, mouseY); 

  if (dist(0, 0, mouseX, mouseY) < 30) {
    background(d);
  } 
  if (mousePressed) {
    x=mouseX;
    y=mouseY;
  }
  image(t, x, y);
  if (x>=200 && x<=220 && y>=50 && y<=70) {
    if (playSound) {
      woohooSound.trigger();
      playSound = false;
    }
    hasWon=true;
  }
}
