public class Distances {
    public static void main(String[] args) {
        double[][] points = {{2,4}, {1,2}, {3,1}, {5,9}, {7,7}};
        
        printDistances(points);
    }

    public static double dist(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) + Math.pow(point1[1] - point2[1], 2));
    }

    public static double[][] getDistances(double[][] points) {
        double[][] distances = new double[points.length][points.length];

        for (int i=0; i < points.length; i++) {
            for (int j=0; j < points.length; j++) {
                distances[i][j] = dist(points[i], points[j]);
            }
        }

        return distances;
    }

    public static void printDistances(double[][] points) {
        double[][] distances = getDistances(points);
        for (int i=0; i < points.length; i++) {
            for (int j=0; j < points.length; j++) {
                System.out.printf("%.2f ", distances[i][j]);
            }
            System.out.println();
        }
    }
}