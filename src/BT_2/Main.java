package BT_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point_2d = new Point2D(1,3);
        System.out.println(point_2d);
        point_2d.setXY(1,2);
        System.out.println(Arrays.toString(point_2d.getXY()));
        System.out.println("----------------------------------------------");
        Point3D point_3d = new Point3D();
        System.out.println(point_3d);
        point_3d.setXYZ(1,2,3);
        point_3d.getXYZ();
        System.out.println(point_3d);
        System.out.println("----------------------------------------------------------------------------");
        // ép kiểu từ con lên cha
        Point2D pro = new Point3D();
        // ép kểu của cha xuống con
        Point3D sida = (Point3D) pro;

    }
}
