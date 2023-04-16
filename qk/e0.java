package qk.e0;
import qk.g0;
import java.util.Map;
import java.lang.Object;
import java.util.Collection;
import java.util.List;
import java.lang.Iterable;

public interface abstract e0 implements g0	// class@002289
{

    Map asMap();
    boolean equals(Object p0);
    Collection get(Object p0);
    List get(Object p0);
    Collection removeAll(Object p0);
    List removeAll(Object p0);
    Collection replaceValues(Object p0,Iterable p1);
    List replaceValues(Object p0,Iterable p1);
}
