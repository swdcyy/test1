package isd.n$a;
import java.util.Iterator;
import osd.a;
import isd.n;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.NoSuchElementException;
import java.io.BufferedReader;
import java.lang.UnsupportedOperationException;

public final class n$a implements Iterator, a	// class@001511
{
    public String b;
    public boolean c;
    public final n d;

    public void n$a(n p0){
       this.d = p0;
       super();
    }
    public String a(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       n$a tb = this.b;
       this.b = null;
       a.m(tb);
       return tb;
    }
    public boolean hasNext(){
       boolean b = true;
       if (this.b == null && this.c == null) {
          String str = this.d.a.readLine();
          this.b = str;
          if (str == null) {
             this.c = b;
          }
       }
       if (this.b == null) {
          b = false;
       }
       return b;
    }
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
