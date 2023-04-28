    PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
   noStroke();
  size(1000,1000);   
  fill(#8b5e34);
  ellipse(500,500,1000,1000);
  fill(#A30E00);
  ellipse(500,500,700,700);
  fill(#FFC15E);
  ellipse(500,500,600,600);
  pepperoni = loadImage("pepperoni.png");
 olive = loadImage("olive.png");
 mushroom = loadImage("mushroom.png");
}
void draw() {
  image(pepperoni,300,300); 
   image(pepperoni,400,600); 
    image(pepperoni,550,200); 
     image(pepperoni,950,300); 
      image(pepperoni,600,300); 
       image(pepperoni,450,350); 
        image(pepperoni,350,400); 
         image(pepperoni,500,500); 
          image(pepperoni,300,600); 
           image(pepperoni,500,600); 
            image(pepperoni,650,300); 
             image(pepperoni,700,200); 
              image(pepperoni,560,300); 
               image(pepperoni,240,300);  
               image(pepperoni,300,300); 
   image(olive,600,400); 
    image(olive,200,550); 
     image(olive,300,950); 
      image(olive,600,300); 
       image(olive,450,350); 
        image(olive,350,400); 
          image(mushroom,700,300); 
             image(mushroom,560,200); 
              image(mushroom,240,300); 
               image(mushroom,300,300);  
               image(mushroom,200,300); 
}
