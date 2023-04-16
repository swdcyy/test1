package qk.l0;
import qk.m0;
import java.util.Collection;
import java.util.Set;
import java.lang.Object;
import java.lang.Iterable;

public final class l0	// class@002a06
{

    public static Collection a(m0 p0){
       return p0.entries();
    }
    public static Collection b(m0 p0,Object p1){
       return p0.get(p1);
    }
    public static Collection c(m0 p0,Object p1){
       return p0.removeAll(p1);
    }
    public static Collection d(m0 p0,Object p1,Iterable p2){
       return p0.replaceValues(p1, p2);
    }
}
