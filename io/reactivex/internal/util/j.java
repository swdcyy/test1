package io.reactivex.internal.util.j;
import java.lang.Object;
import io.reactivex.internal.util.k;

public final class j	// class@0014dc
{
    public final float a;
    public int b;
    public int c;
    public int d;
    public Object[] e;

    public void j(){
       super(16, 0x3f400000);
    }
    public void j(int p0){
       super(p0, 0x3f400000);
    }
    public void j(int p0,float p1){
       super();
       this.a = p1;
       p0 = k.a(p0);
       this.b = p0 - 1;
       this.d = (int)(p1 * (float)p0);
       Object[] objArray = new Object[p0];
       this.e = objArray;
    }
    public static int b(int p0){
       p0 = p0 * -1640531527;
       return (p0 ^ (p0 >> 16));
    }
    public boolean a(Object p0){
       j te = this.e;
       j tb = this.b;
       int i = j.b(p0.hashCode()) & tb;
       object oobject = te[i];
       if (oobject != null) {
          boolean b = false;
          if (oobject.equals(p0)) {
             return b;
          }else {
             while (true) {
                i = i + 1;
                i = i & tb;
                oobject = te[i];
                if (oobject != null) {
                   if (oobject.equals(p0)) {
                      return b;
                   }
                   continue ;
                }
             }
          }
       }
       te[i] = p0;
       int i1 = this.c + 1;
       this.c = i1;
       if (i1 >= this.d) {
          te = this.e;
          int len = te.length;
          i = len << 1;
          int i2 = i - 1;
          Object[] objArray = new Object[i];
          int i3 = i1 - 1;
          while (i1) {
             do {
                len = len - 1;
             } while (te[len] == null);
             i1 = j.b(te[len].hashCode()) & i2;
             if (objArray[i1] != null) {
                do {
                   i1 = i1 + 1;
                   i1 = i1 & i2;
                } while (objArray[i1] == null);
             }
             objArray[i1] = te[len];
             i1 = i3;
          }
          this.b = i2;
          this.d = (int)((float)i * this.a);
          this.e = objArray;
       }
       return 1;
    }
    public boolean c(int p0,Object[] p1,int p2){
       int i;
       this.c = this.c - 1;
       while (true) {
          i = p0 + 1;
          break ;
       }
       i = i & p2;
       object oobject = p1[i];
       while (oobject != null) {
          int i1 = j.b(oobject.hashCode()) & p2;
          if (p0 <= i) {
             if (p0 >= i1 || i1 > i) {
             label_0025 :
                p1[p0] = oobject;
                p0 = i;
             }
          }else if(p0 >= i1 && i1 > i){
             goto label_0025 ;
          }
          i = i + 1;
       }
       p1[p0] = null;
       return 1;
    }
}
