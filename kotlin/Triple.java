package kotlin.Triple;
import java.io.Serializable;
import java.lang.Object;
import kotlin.jvm.internal.a;
import java.lang.String;
import java.lang.StringBuilder;

public final class Triple implements Serializable	// class@00181b
{
    public final Object first;
    public final Object second;
    public final Object third;

    public void Triple(Object p0,Object p1,Object p2){
       super();
       this.first = p0;
       this.second = p1;
       this.third = p2;
    }
    public static Triple copy$default(Triple p0,Object p1,Object p2,Object p3,int p4,Object p5){
       if (p4 & 0x01) {
          p1 = p0.first;
       }
       if (p4 & 0x02) {
          p2 = p0.second;
       }
       if (p4 & 0x04) {
          p3 = p0.third;
       }
       return p0.copy(p1, p2, p3);
    }
    public final Object component1(){
       return this.first;
    }
    public final Object component2(){
       return this.second;
    }
    public final Object component3(){
       return this.third;
    }
    public final Triple copy(Object p0,Object p1,Object p2){
       return new Triple(p0, p1, p2);
    }
    public boolean equals(Object p0){
       if (this == p0 || (p0 instanceof Triple && (a.g(this.first, p0.first) && (a.g(this.second, p0.second) && a.g(this.third, p0.third))))) {
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
    public final Object getThird(){
       return this.third;
    }
    public int hashCode(){
       Triple tfirst = this.first;
       int i = 0;
       int i1 = (tfirst != null)? tfirst.hashCode(): 0;
       i1 = i1 * 31;
       Triple tsecond = this.second;
       int i2 = (tsecond != null)? tsecond.hashCode(): 0;
       i1 = (i1 + i2) * 31;
       tsecond = this.third;
       if (tsecond != null) {
          i = tsecond.hashCode();
       }
       return (i1 + i);
    }
    public String toString(){
       return '('+this.first+", "+this.second+", "+this.third+')';
    }
}
