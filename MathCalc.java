public class MathCalc {
        public static void main(String[] args) {
                double radius = 0.0;
                double circleArea = 100.0;
                int feet = 0;
                int inches = 0;
                double diameterOfSun = 865000.0;
                double diameterOfEarth = 7600.0;
                double volumeOfEarth = 0.0;
                double volumeOfSun = 0.0;
                double rationOfSunToEarth = 0.0;

                radius = Math.sqrt(circleArea / Math.PI);
                feet = (int) Math.floor(radius);
                inches = (int) Math.round(12.0 * (radius - feet));

                volumeOfEarth = (4.0 / 3.0) * Math.PI * Math.pow((diameterOfEarth / 2.0), 3.0);
                volumeOfSun = (4.0 / 3.0) * Math.PI * Math.pow((diameterOfSun / 2.0), 3.0);
                rationOfSunToEarth = volumeOfSun / volumeOfEarth;

                System.out.println("The radius of a circle with area" + " square feet is\n " + feet + " feet " + inches
                                + " inches");

                System.out.println("The volume of the Earth is " + volumeOfEarth + " cubic miles, "
                                + "the volume of the Sun is "
                                + volumeOfSun
                                + " cubic miles, and the ratio of the volume of the Sun to the volume of the Earth is "
                                + rationOfSunToEarth);

        }
}