package nk.b;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.StringBuilder;

public class b implements Comparable	// class@00271f
{
    public final long b;
    public final long c;
    public final Object d;

    public void b(long p0,long p1,Object p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public long a(){
       return this.c;
    }
    public Object b(){
       return this.d;
    }
    public long c(){
       return this.b;
    }
    public int compareTo(Object p0){
       int i;
       if (this.c() - p0.c() < 0) {
          i = -1;
       }else if(this.c() - p0.c() > 0){
          i = 1;
       }else {
          i = 0;
       }
       return i;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (p0 == null) {
          return false;
       }
       if (b.class != p0.getClass()) {
          return false;
       }
       if (this.c - p0.c) {
          return false;
       }
       b td = this.d;
       if (td == null) {
          if (p0.d != null) {
             return false;
          }
       }else if(!td.equals(p0.d)){
          return false;
       }
       if (this.b - p0.b) {
          return false;
       }else {
          return true;
       }
    }
    public int hashCode(){
       b tc = this.c;
       long l = 32;
       int i = ((int)(tc ^ (tc >> l)) + 31) * 31;
       b td = this.d;
       int i1 = (td == null)? 0: td.hashCode();
       td = this.b;
       return (((i + i1) * 31) + (int)(td ^ (td >> l)));
    }
    public String toString(){
       return "offset "+this.b+", length "+this.c+", metadata "+this.d;
    }
}
