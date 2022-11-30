
void setup() {
 
  // set the size of your sketch
  size(600,600);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 0; i < 10; i++) {
  ellipse(300,300,500 - i * 50,500 - i * 50);
  
  //Use an if statement and remainder to alternate the color of your rings.
 if (i % 2 == 0) {
 fill(#FFFFFF);
 }
 else {
   fill(#5800FF);
 }
    }      
}
