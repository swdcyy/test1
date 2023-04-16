package ltd.l;
import java.lang.Object;
import nsd.u;
import kotlin.jvm.internal.a;
import msd.l;
import java.util.ArrayList;
import java.lang.String;
import java.lang.StringBuilder;

public final class l	// class@001cd1
{
    public final Object a;

    public void l(Object p0){
       super();
       this.a = p0;
    }
    public static final l a(Object p0){
       return new l(p0);
    }
    public static Object b(Object p0){
       return p0;
    }
    public static Object c(Object p0,int p1,u p2){
       if (p1 & 0x01) {
          p0 = null;
       }
       return l.b(p0);
    }
    public static boolean d(Object p0,Object p1){
       if (p1 instanceof l && a.g(p0, p1.j())) {
          return true;
       }
       return false;
    }
    public static final boolean e(Object p0,Object p1){
       return a.g(p0, p1);
    }
    public static final void f(Object p0,l p1){
       if (p0 == null) {
          return;
       }
       if (!p0 instanceof ArrayList) {
          p1.invoke(p0);
       }else {
          for (int i = p0.size() - 1; i >= 0; i = i - 1) {
             p1.invoke(p0.get(i));
          }
       }
       return;
    }
    public static int g(Object p0){
       int i = (p0 != null)? p0.hashCode(): 0;
       return i;
    }
    public static final Object h(Object p0,Object p1){
       if (p0 == null) {
          p0 = l.b(p1);
       }else if(p0 instanceof ArrayList){
          p0.add(p1);
          p0 = l.b(p0);
       }else {
          ArrayList uArrayList = new ArrayList(4);
          uArrayList.add(p0);
          uArrayList.add(p1);
          p0 = l.b(uArrayList);
       }
       return p0;
    }
    public static String i(Object p0){
       return "InlineList\(holder="+p0+"\)";
    }
    public boolean equals(Object p0){
       return l.d(this.a, p0);
    }
    public int hashCode(){
       return l.g(this.a);
    }
    public final Object j(){
       return this.a;
    }
    public String toString(){
       return l.i(this.a);
    }
}
