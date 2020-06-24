class Circle {

    double radius;

    // write methods here
    double getLength() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.pow(radius, 2) * Math.PI;
    }
}