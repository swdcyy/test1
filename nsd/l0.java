package nsd.l0;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.System;

public abstract class l0	// class@001ece
{
    public int a;
    public final Object[] b;
    public final int c;

    public void l0(int p0){
       super();
       this.c = p0;
       Object[] objArray = new Object[p0];
       this.b = objArray;
    }
    public static void d(){
    }
    public final void a(Object p0){
       a.p(p0, "spreadArgument");
       l0 ta = this.a;
       this.a = ta + 1;
       this.b[ta] = p0;
    }
    public final int b(){
       return this.a;
    }
    public abstract int c(Object p0);
    public final void e(int p0){
       this.a = p0;
    }
    public final int f(){
       int i3;
       int i = this.c - 1;
       int i1 = 0;
       if (i >= 0) {
          int i2 = 0;
          while (true) {
             object oobject = this.b[i2];
             if (oobject != null) {
                i3 = this.c(oobject);
             label_0014 :
                i1 = i1 + i3;
                if (i2 != i) {
                   i2 = i2 + 1;
                }
             }else {
                i3 = 1;
                goto label_0014 ;
             }
          }
       }
       return i1;
    }
    public final Object g(Object p0,Object p1){
       int i4;
       a.p(p0, "values");
       a.p(p1, "result");
       int i = this.c - 1;
       int i1 = 0;
       if (i >= 0) {
          int i2 = 0;
          int i3 = 0;
          i4 = 0;
          object oobject = this.b[i2];
          while (oobject != null) {
             if (i3 < i2) {
                int i5 = i2 - i3;
                System.arraycopy(p0, i3, p1, i4, i5);
                i4 = i4 + i5;
             }
             i3 = this.c(oobject);
             System.arraycopy(oobject, i1, p1, i4, i3);
             i4 = i4 + i3;
             i3 = i2 + 1;
             break ;
             i2 = i2 + 1;
          }
          if (i2 != i) {
             goto label_002e ;
          }else {
             i1 = i3;
          }
       }else {
          i4 = 0;
       }
       l0 tc = this.c;
       if (i1 < tc) {
          System.arraycopy(p0, i1, p1, i4, (tc - i1));
       }
       return p1;
    }
}
