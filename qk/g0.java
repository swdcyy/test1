package qk.g0;
import java.util.Map;
import java.lang.Object;
import java.util.Collection;
import java.util.Set;
import com.google.common.collect.k;
import java.lang.Iterable;

public interface abstract g0	// class@00228a
{

    Map asMap();
    void clear();
    boolean containsEntry(Object p0,Object p1);
    boolean containsKey(Object p0);
    boolean containsValue(Object p0);
    Collection entries();
    boolean equals(Object p0);
    Collection get(Object p0);
    int hashCode();
    boolean isEmpty();
    Set keySet();
    k keys();
    boolean put(Object p0,Object p1);
    boolean putAll(Object p0,Iterable p1);
    boolean putAll(g0 p0);
    boolean remove(Object p0,Object p1);
    Collection removeAll(Object p0);
    Collection replaceValues(Object p0,Iterable p1);
    int size();
    Collection values();
}
