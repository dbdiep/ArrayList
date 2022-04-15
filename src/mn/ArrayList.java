package mn;

public class ArrayList implements List {
	
	int list[] = new int[10];
	int size = 0;
	final int DEFAULT_CAPACITY = 10;

	@Override
	
	
	
	public void add(int n) {
		// TODO Auto-generated method stub
		if(size >= list.length - 1) {
			//Tang kich thuoc mang
			int newArr[] = new int[list.length + DEFAULT_CAPACITY];
			for(int i = 0; i < list.length; i++) {
				newArr[i] = list[i];
			}
			list = newArr;
		}
		list[size] = n;
		size++;
	}

	public int get(int index) {
		// TODO Auto-generated method stub
		if(index <= size -1) {
			return list[index];
		} 
		return 0;
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		for(int i = index; i < list.length - 1; i++) {
			list[i] = list[i+1];
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

}
