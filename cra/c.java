package cra.c;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import qk.h;
import java.lang.CharSequence;
import android.text.TextUtils;
import lnc.o5;
import java.lang.Integer;
import z1.h;
import java.lang.StringBuilder;

public class c implements Comparable	// class@00237b
{
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public void c(int p0,int p1,int p2,int p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public static int a(c p0,c p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, c.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return h.j().c(p0.b, p1.b).c(p0.c, p1.c).c(p0.d, p1.d).c(p0.e, p1.e).i();
    }
    public static c b(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       c obj = null;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, c.class, "3");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       if (TextUtils.isEmpty(p0)) {
          return obj;
       }
       String[] stringArray = p0.split("\\.");
       int i = 2;
       if (stringArray.length < i) {
          return obj;
       }
       int i1 = 0;
       int i2 = o5.b(stringArray[i1], i1);
       int i3 = o5.b(stringArray[1], i1);
       int i4 = 3;
       i = (stringArray.length >= i4)? o5.b(stringArray[i], i1): 0;
       int i5 = (stringArray.length >= 4)? o5.b(stringArray[i4], i1): 0;
       if (PatchProxy.isSupport(c.class)) {
          Object obj2 = PatchProxy.applyFourRefs(Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i), Integer.valueOf(i5), null, c.class, "1");
          if (obj2 != patchProxyRe) {
             obj = obj2;
          label_0093 :
             return obj;
          }
       }
       boolean b = (i2 >= 0)? true: false;
       h.a(b);
       b = (i3 >= 0)? true: false;
       h.a(b);
       b = (i >= 0)? true: false;
       h.a(b);
       if (i5 >= 0) {
          i1 = true;
       }
       h.a(i1);
       obj = new c(i2, i3, i, i5);
       goto label_0093 ;
    }
    public int compareTo(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       int i = (obj != PatchProxyResult.class)? obj.intValue(): c.a(this, p0);
       return i;
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (!p0 instanceof c) {
          return false;
       }
       if (this.d != p0.d) {
          return false;
       }
       if (this.e != p0.e) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       return (((((((this.d + 31) * 31) + this.e) * 31) + this.b) * 31) + this.c);
    }
    public String toString(){
       char c;
       StringBuilder obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       c = '.';
       obj = this.b+c+this.c+c+this.d;
       if (this.e > null) {
          obj = obj+c+this.e;
       }
       return obj;
    }
}
