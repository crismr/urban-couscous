package cristina.ejemplo1;

public class Prueba1 {

	public static void main(String[] args) {
		//int [] arr = new int[];
		//arr[1] = 5;
		
		Punto p = new Punto(3,4); 						//p guarda la DIRECCION de memoria donde se guarda
		
		System.out.println(p);							//System.out.println(p.toString()); lo mismo que arriba
		
		//Punto pt2 = p; 								// Punto pt2 = new Punto(3,4); 	
		Punto pt2 = (Punto) p.clone();
		
		p.setX(100);									//Solo hay un NEW, x lo que hay 2 objetos que hacen referencia al mismo
			
		System.out.println(p.equals(pt2));				//= System.out.println(p == pt2);
		
		System.out.println(p); 							//.hashCode()
		System.out.println(pt2); 						//.hashCode()

		Object o = p; 									//cualquier punto es hijo de object
		//Punto pt2 = o; 
		//^ daría error ya que no se puede heredar hacia abajo, particularizar, hay objects que pueden no ser punto
		Punto pt1 = (Punto) o; 							//Aqui salvo el momento de compilacion, no da error
		System.out.println(pt1);
		
		int i = 5;
		Object o2 = i; 									//Integer es una clase que equivale al tipo primitivo int
				//= new Integer(i); 
		System.out.println(o2);
		
	}

}
