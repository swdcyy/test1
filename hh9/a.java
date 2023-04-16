package hh9.a;
import ok.o;
import java.util.HashSet;
import java.lang.Object;
import java.lang.String;

public final class a implements o	// class@002687
{
    public final HashSet b;

    public void a(HashSet p0){
       this.b = p0;
    }
    public final boolean apply(Object p0){
       return this.b.contains(p0);
    }
}
