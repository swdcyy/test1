package usd.i;
import java.lang.Iterable;
import osd.a;
import usd.i$a;
import nsd.u;
import java.lang.Object;
import fsd.m;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.util.Iterator;
import trd.l0;
import usd.j;
import java.lang.StringBuilder;

public class i implements Iterable, a	// class@002617
{
    public final int b;
    public final int c;
    public final int d;
    public static final i$a e;

    static {
       i.e = new i$a(null);
    }
    public void i(int p0,int p1,int p2){
       super();
       if (!p2) {
          throw new IllegalArgumentException("Step must be non-zero.");
       }
       if (p2 == Integer.MIN_VALUE) {
          throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
       }
       this.b = p0;
       this.c = m.c(p0, p1, p2);
       this.d = p2;
       return;
    }
    public boolean equals(Object p0){
       boolean b = (p0 instanceof i && (!this.isEmpty() || (p0.isEmpty() || (this.b == p0.b && (this.c == p0.c && this.d == p0.d)))))? true: false;
       return b;
    }
    public int hashCode(){
       int i = (this.isEmpty())? -1: (((this.b * 31) + this.c) * 31) + this.d;
       return i;
    }
    public boolean isEmpty(){
       boolean b = true;
       if (this.d > null) {
          if (this.b <= this.c) {
          label_0014 :
             b = false;
          }
       }else if(this.b < this.c){
       }
       return b;
    }
    public Iterator iterator(){
       return this.p();
    }
    public final int l(){
       return this.b;
    }
    public final int m(){
       return this.c;
    }
    public final int n(){
       return this.d;
    }
    public l0 p(){
       return new j(this.b, this.c, this.d);
    }
    public String toString(){
       StringBuilder str1;
       i td;
       String str = " step ";
       if (this.d > null) {
          str1 = this.b+".."+this.c+str;
          td = this.d;
       }else {
          str1 = this.b+" downTo "+this.c+str;
          td = - this.d;
       }
       return str1+td;
    }
}
