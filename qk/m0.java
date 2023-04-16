package qk.m0;
import qk.g0;
import java.util.Map;
import java.util.Collection;
import java.util.Set;
import java.lang.Object;
import java.lang.Iterable;

public interface abstract m0 implements g0	// class@002a09
{

    Map asMap();
    Collection entries();
    Set entries();
    boolean equals(Object p0);
    Collection get(Object p0);
    Set get(Object p0);
    Collection removeAll(Object p0);
    Set removeAll(Object p0);
    Collection replaceValues(Object p0,Iterable p1);
    Set replaceValues(Object p0,Iterable p1);
}
