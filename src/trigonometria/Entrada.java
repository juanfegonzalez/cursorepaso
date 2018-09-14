package trigonometria;

import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner sc;
        int opcionG, opcionP;
        Menus menus = new Menus();
        String mArea = "El área del %s es: %f";
        String mPer = "El perímetro del %s es: %f";


        do {
            opcionG =0;opcionP=0;
            System.out.println(menus.menuGenerico());
            sc = new Scanner(System.in);
            opcionG = sc.nextInt();
            switch (opcionG) {
                case 1:
                    do {
                        System.out.println(menus.menuCirculo());
                        Circulo c;
                        opcionP = sc.nextInt();
                        switch (opcionP) {
                            case 1:
                                c = new Circulo();
                                System.out.println(String.format(mArea, c.getClass().getName(), c.calcularArea()));
                                break;
                            case 2:
                                c = new Circulo();
                                System.out.println(String.format(mPer, c.getClass().getName(), c.calcularDiametro()));
                                break;

                            default:
                                System.out.println("Opción incorrecta");
                                break;
                        }
                        c = null;
                    } while (opcionP != 4);
                    break;
                case 2:
                    do {
                        System.out.println(menus.menuRectangulo());
                        opcionP = sc.nextInt();
                        Rectangulo r;
                        switch (opcionP) {
                            case 1:
                                r = new Rectangulo();
                                System.out.println(String.format(mArea, r.getClass().getName(), (float)r.calcularArea()));
                                break;
                            case 2:
                                r = new Rectangulo();
                                System.out.println(String.format(mPer, r.getClass().getName(), (float)r.calcularPerimetro()));
                                break;

                            default:
                                System.out.println("Opción incorrecta");
                                break;
                        }
                        r = null;
                    }while(opcionP!=3);
                    break;
                case 3:
                    do {
                        System.out.println(menus.menuTriangulo());
                        opcionP = sc.nextInt();
                        Triangulo t;
                        switch (opcionP) {
                            case 1:
                                t = new Triangulo();
                                System.out.println(String.format(mArea, t.getClass().getName(), (float)t.calcularArea()));
                                break;
                            default:
                                System.out.println("Opción incorrecta");
                                break;
                        }
                        t = null;
                    }while(opcionP!=2);
                    break;
                default:
                    break;
            }
        } while (opcionG != 4);

        System.exit(0);

    }
}
