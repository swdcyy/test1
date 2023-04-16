package qk.c;
import qk.k0;
import java.lang.Object;
import com.google.common.collect.Range;
import java.lang.UnsupportedOperationException;
import java.lang.Iterable;
import java.util.Iterator;
import java.util.Set;
import java.lang.Comparable;
import java.lang.String;

public abstract class c implements k0	// class@0029f3
{

    public void c(){
       super();
    }
    public void add(Range p0){
       throw new UnsupportedOperationException();
    }
    public void addAll(Iterable p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.add(iterator.next());
       }
       return;
    }
    public void addAll(k0 p0){
       this.addAll(p0.asRanges());
    }
    public void clear(){
       this.remove(Range.all());
    }
    public boolean contains(Comparable p0){
       boolean b = (this.rangeContaining(p0) != null)? true: false;
       return b;
    }
    public abstract boolean encloses(Range p0);
    public boolean enclosesAll(Iterable p0){
       Iterator iterator = p0.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return true;
          }
          if (!this.encloses(iterator.next())) {
             break ;
          }
       }
       return false;
    }
    public boolean enclosesAll(k0 p0){
       return this.enclosesAll(p0.asRanges());
    }
    public boolean equals(Object p0){
       if (p0 == this) {
          return true;
       }
       if (p0 instanceof k0) {
          return this.asRanges().equals(p0.asRanges());
       }
       return false;
    }
    public final int hashCode(){
       return this.asRanges().hashCode();
    }
    public boolean isEmpty(){
       return this.asRanges().isEmpty();
    }
    public abstract Range rangeContaining(Comparable p0);
    public void remove(Range p0){
       throw new UnsupportedOperationException();
    }
    public void removeAll(Iterable p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          this.remove(iterator.next());
       }
       return;
    }
    public void removeAll(k0 p0){
       this.removeAll(p0.asRanges());
    }
    public final String toString(){
       return this.asRanges().toString();
    }
}
