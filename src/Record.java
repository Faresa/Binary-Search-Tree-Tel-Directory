      /*


*/


public class Record implements Comparable<Record>

{
	public String key ;public String value ;
	public Record (String k , String v)
	{
		key = k  ; value = v ;
	}

	public int compareTo (Record entry)
	{
	return this.key.compareTo(entry.key);

	}
	public String toString(){
	return this.value;
	}

}
