package kotlin.Pair;
import java.io.Serializable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class Pair implements Serializable	// class@001c39
{
    public final Object first;
    public final Object second;

    public void Pair(Object p0,Object p1){
       super();
       this.first = p0;
       this.second = p1;
    }
    public static Pair copy$default(Pair p0,Object p1,Object p2,int p3,Object p4){
       if (p3 & 0x01) {
          p1 = p0.first;
       }
       if (p3 & 0x02) {
          p2 = p0.second;
       }
       return p0.copy(p1, p2);
    }
    public final Object component1(){
       return this.first;
    }
    public final Object component2(){
       return this.second;
    }
    public final Pair copy(Object p0,Object p1){
       return new Pair(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof Pair && (a.g(this.first, p0.first) && a.g(this.second, p0.second)))) {
          return true;
       }
       return false;
    }
    public final Object getFirst(){
       return this.first;
    }
    public final Object getSecond(){
       return this.second;
    }
    public int hashCode(){
       Pair tfirst = this.first;
       int i = 0;
       int i1 = (tfirst != null)? tfirst.hashCode(): 0;
       i1 = i1 * 31;
       Pair tsecond = this.second;
       if (tsecond != null) {
          i = tsecond.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return '('+this.first+", "+this.second+')';
    }
}
