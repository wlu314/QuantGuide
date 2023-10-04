public class Main {
    public static void main(String args[]) {
        //A 4x4x4 Rubix Cube is composed of 1x1x1 mini cubes. The rubix cube has stickers around it outer layaer
        //how many mini cubes have at least one stickets
        //calculate the inside of a cube
        //ex: 4x4x4 cube has a core of 2x2x2
        //ex: 3x3x3 cube has a core of 1x1x1
        //ex: 9x9x9 cube has a core of 7x7x7
        print(sideOfCubes(4));

    }
    public static int sideOfCubes(int length) {
        int interiorCubeLength = length - 2;
        int bigCube = length * length * length;
        int smallCube = interiorCubeLength * interiorCubeLength * interiorCubeLength;
        int diff = bigCube - smallCube;
        return diff;
    }
}