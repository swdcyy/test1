package qk.d0;
import qk.e0;
import java.lang.Object;
import java.util.Collection;
import java.util.List;
import java.lang.Iterable;

public final class d0	// class@0029f4
{

    public static Collection a(e0 p0,Object p1){
       return p0.get(p1);
    }
    public static Collection b(e0 p0,Object p1){
       return p0.removeAll(p1);
    }
    public static Collection c(e0 p0,Object p1,Iterable p2){
       return p0.replaceValues(p1, p2);
    }
}
