package qk.m$a;
import qk.m;
import java.lang.Iterable;
import java.util.Iterator;

public final class m$a extends m	// class@002a08
{
    public final Iterable c;

    public void m$a(Iterable p0,Iterable p1){
       this.c = p1;
       super(p0);
    }
    public Iterator iterator(){
       return this.c.iterator();
    }
}
