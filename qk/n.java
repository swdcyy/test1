package qk.n;
import qk.m;
import java.lang.Iterable;
import java.util.Iterator;
import qk.n$a;
import com.google.common.collect.Iterators;

public final class n extends m	// class@002a0d
{
    public final Iterable[] c;

    public void n(Iterable[] p0){
       this.c = p0;
       super();
    }
    public Iterator iterator(){
       return Iterators.e(new n$a(this, this.c.length));
    }
}
