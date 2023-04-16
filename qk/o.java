package qk.o;
import qk.m;
import java.lang.Iterable;
import java.util.Iterator;
import qk.x;
import ok.h;
import com.google.common.collect.Iterators;

public final class o extends m	// class@002a0f
{
    public final Iterable c;

    public void o(Iterable p0){
       this.c = p0;
       super();
    }
    public Iterator iterator(){
       return Iterators.e(Iterators.s(this.c.iterator(), new x()));
    }
}
