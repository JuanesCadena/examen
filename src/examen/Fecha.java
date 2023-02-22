package examen;

public class Fecha {
	public static boolean fechaValida;
	public static void main(String[] args) {
		System.out.println(validarFecha(1915,5, 7));
	}
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) { //2 3 4
			if ((mes <= 12) && (dia <= 31)) { //5 // 6
				if (mes == 2) { //7
					fechaValida = dia <= 28; //8
				} else if (mes % 2 == 0) { //9
					fechaValida = dia <= 30; //10
				} else {
					fechaValida = dia <= 31; //11
				}
			}
		}
		return fechaValida;  //12
	}
}