package trd.r;
import java.util.Iterator;
import osd.a;
import java.lang.Object;
import java.lang.Character;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class r implements Iterator, a	// class@0026a5
{

    public void r(){
       super();
    }
    public final Character a(){
       return Character.valueOf(this.b());
    }
    public abstract char b();
    public Object next(){
       return this.a();
    }
    public void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
