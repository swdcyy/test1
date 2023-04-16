package jwd.g;
import jwd.c;
import java.lang.Object;
import java.util.TreeMap;
import java.lang.String;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.Collections;

public class g implements c	// class@001751
{
    public byte[] a;
    public TreeMap b;

    public void g(){
       super();
       this.b = new TreeMap(String.CASE_INSENSITIVE_ORDER);
    }
    public byte[] getContent(){
       return this.a;
    }
    public String getFieldValue(String p0){
       p0 = this.b.get(p0);
       if (p0 == null) {
          p0 = "";
       }
       return p0;
    }
    public boolean hasFieldValue(String p0){
       return this.b.containsKey(p0);
    }
    public Iterator iterateHttpFields(){
       return Collections.unmodifiableSet(this.b.keySet()).iterator();
    }
    public void put(String p0,String p1){
       this.b.put(p0, p1);
    }
    public void setContent(byte[] p0){
       this.a = p0;
    }
}
