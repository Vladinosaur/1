package Lab11;
import Lab11.Note;

public class Spisok {

	Note head;
	Note tail; 
	// �����������
	public Spisok() {
		head = new Note("", null, null);
		tail = new Note("", head, head);
			head.Next = tail;
			head.Prev = tail;
	}
	// ���������� �������� � ����� ������
	public void addToSpisok (String data) {
		Note p = new Note(data, tail, tail.Prev);
		tail.Prev.Next = p;
		tail.Prev = p;
	}
	
	// ����� ������
	public String outSpisok () {
		String str = "";
		Note p = head.Next; 
		while (p != tail) {
			str += p.data + " ";
			p = p.Next;
		}
		return str;
	}
	
	// ����� �������� �� �������
	public String getByIndex(int i) {
		Note p = head.Next;
		int k = 0;
		while(k < i) {
			p = p.Next;
			k++;
		}
		return p.data;	
	}
	
	// ����� ������� �� ��������
	public int getIndexForElement(String str) {
		Note p = head.Next;
		int k = 0;
		if (str.equals("") == true)
			return k;
		else { 
			k++;
			while(str.equals(p.data) == false) {
			p = p.Next;
			k++;
		}}
		return k;	
	}
	
	// ��������� ������������� �������
	public int getMaxIndex() {
		Note p = head.Next;
		int k = 0;
		while(p != tail) {
			p = p.Next;
			k++;
		}
		return k;	
	}
	
	// ����� �������� �� ��������
	public boolean search(String str) {
		Note p = head.Next; 
		while(p != tail) {
			if (str.equals(p.data)) {
				return true;
			}
			p = p.Next;
		}
		return false;	
	}
	
	// ��������� �������
	public String getElementNext(int i){
		int str = getMaxIndex();
		String t = "";
		if(i < str) {
			i++;
			t = getByIndex(i);
		}else{
			Note p = head.Next;
			t = p.data;
		}
		return t;	
	}	
	
	// �������� ��������
	public void deletElement (String str) {
		Note p = head.Next;
		while (p != tail) {
			if (str.equals(p.data)) {
				p.Prev.Next = p.Next;
				p.Next.Prev = p.Prev;
				break;
			}
			p = p.Next;
		}
	}
	
	// ����� ������
		public String outSpisoktail() {
			String str = "";
			Note p = tail.Prev; 
			while (p != head) {
				str += p.data + " ";
				p = p.Prev;
			}
			return str;
		}
}