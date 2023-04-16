package qk.k0;
import com.google.common.collect.Range;
import java.lang.Iterable;
import java.util.Set;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.String;

public interface abstract k0	// class@002a04
{

    void add(Range p0);
    void addAll(Iterable p0);
    void addAll(k0 p0);
    Set asDescendingSetOfRanges();
    Set asRanges();
    void clear();
    k0 complement();
    boolean contains(Comparable p0);
    boolean encloses(Range p0);
    boolean enclosesAll(Iterable p0);
    boolean enclosesAll(k0 p0);
    boolean equals(Object p0);
    int hashCode();
    boolean intersects(Range p0);
    boolean isEmpty();
    Range rangeContaining(Comparable p0);
    void remove(Range p0);
    void removeAll(Iterable p0);
    void removeAll(k0 p0);
    Range span();
    k0 subRangeSet(Range p0);
    String toString();
}
