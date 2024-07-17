package SobreCarga1;
import java.util.Scanner;
/*
 * Autor: Marcos Guarachi Mamani
 * Ej. Sobre carga 1
 */
public class SobreCarga1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Calculadora de Áreas:");
		System.out.println("1. Rectángulo");
		System.out.println("2. Círculo");
		System.out.println("3. Triángulo Rectángulo");
		System.out.print("Seleccione una opción (1/2/3): ");
		int opcion = input.nextInt();

		switch (opcion) {
		case 1:
			System.out.print("Ingrese la base del rectángulo: ");
			double baseRectangulo = input.nextDouble();
			System.out.print("Ingrese la altura del rectángulo: ");
			double alturaRectangulo = input.nextDouble();
			double areaRectangulo = calcularArea(baseRectangulo, alturaRectangulo);
			System.out.println("El área del rectángulo es: " + areaRectangulo);
			break;
		case 2:
			System.out.print("Ingrese el radio del círculo: ");
			double radioCirculo = input.nextDouble();
			double areaCirculo = calcularArea(radioCirculo);
			System.out.println("El área del círculo es: " + areaCirculo);
			break;
		case 3:
			System.out.print("Ingrese la base del triángulo rectángulo: ");
			double baseTriangulo = input.nextDouble();
			System.out.print("Ingrese la altura del triángulo rectángulo: ");
			double alturaTriangulo = input.nextDouble();
			double areaTriangulo = calcularArea(baseTriangulo, alturaTriangulo, "triangulo");
			System.out.println("El área del triángulo rectángulo es: " + areaTriangulo);
			break;
		default:
			System.out.println("Opción no válida.");
		}

		input.close();
	}

	// Función para calcular el área de un rectángulo
	public static double calcularArea(double base, double altura) {
		return base * altura;
	}

	// Función para calcular el área de un círculo
	public static double calcularArea(double radio) {
		return Math.PI * radio * radio;
	}

	// Función para calcular el área de un triángulo rectángulo
	public static double calcularArea(double base, double altura, String tipo) {
		if (tipo.equals("triangulo")) {
			return 0.5 * base * altura;
		} else {
			return 0.0;
		}
	}
}

