
void setup() {
PImage face = loadImage("Zombie picture.png.png");
size(700, 700);
face.resize(700, 700);
image(face, 0, 0);

}
void draw() {
fill(250, 0, 0);

  ellipse(230, 340, 70, 100);
ellipse(330, 340, 90, 100);
fill(mouseX, mouseY, mouseX-mouseY);
ellipse(330, 340, 10, 10);
 ellipse(230, 340, 10, 10);
}
