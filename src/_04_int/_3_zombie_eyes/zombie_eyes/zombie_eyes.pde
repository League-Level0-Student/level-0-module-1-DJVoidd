PImage face;
void setup() {
face = loadImage("face.jpeg");

size(1000,1000);
face.resize(1000,1000);
}
void draw() {
background(face);
fill(mouseX,0,mouseY);
ellipse(420,420,70,159);
ellipse(580,420,70,159);
}
