PImage pepperoni;

void setup() {
   noStroke();
  size(1000,1000);   
  fill(#8b5e34);
  ellipse(500,500,600,600);
  pepperoni = loadImage("pepperoni.png");
 
}
void draw() {
  image(pepperoni,300,300); 
}
