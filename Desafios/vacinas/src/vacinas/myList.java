package vacinas;

import java.util.Arrays;


public class myList<E> {
	
	public Object array[];
	public int tamanho = 0;
	
	public myList() {
		array = new Object[25];
	}
	
	public void add(Object e) {
		if(tamanho == array.length) {
			duplicar();
		}
		array[tamanho++] = e;
	}
	
	private void duplicar() {
        int newSize = array.length * 2;
        array = Arrays.copyOf(array, newSize);
    }
	
	public void remove (Integer e) {
		array[(int) e] = null;
	}

	
}
