package Laba11;
import Laba11.Note;

public class Note {
	String data;
	Note Next;
	Note Prev;
	
	public Note (String data, Note Next, Note Prev) {
		this.data = data;
		this.Next = Next;
		this.Prev = Prev;
	}
}