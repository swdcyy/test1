package qb6.b;
import yk.b;
import java.nio.ByteBuffer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.nio.ByteOrder;
import java.lang.Integer;
import qb6.c;
import qb6.a;

public final class b extends b	// class@00225c
{
    public static final int g;

    public void b(){
       super();
    }
    public static b i(ByteBuffer p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b obj = null;
       b obj1 = PatchProxy.applyOneRefs(p0, obj, b.class, "1");
       if (obj1 != patchProxyRe) {
          return obj1;
       }
       obj1 = new b();
       obj = PatchProxy.applyTwoRefs(p0, obj1, obj, b.class, "2");
       if (obj != patchProxyRe) {
       }else {
          p0.order(ByteOrder.LITTLE_ENDIAN);
          int i = p0.getInt(p0.position()) + p0.position();
          if (PatchProxy.isSupport(b.class)) {
             Object obj2 = PatchProxy.applyTwoRefs(Integer.valueOf(i), p0, obj1, b.class, "4");
             if (obj2 != patchProxyRe) {
                obj1 = obj2;
             }else if(PatchProxy.isSupport(b.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), p0, obj1, b.class, "3")){
                obj1.a = i;
                obj1.b = p0;
                i = i - p0.getInt(i);
                obj1.c = i;
                obj1.d = obj1.b.getShort(i);
             }
          }else {
             goto label_0048 ;
          }
          obj = obj1;
       }
       return obj;
    }
    public c g(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       Object[] objArray = null;
       c obj = PatchProxy.apply(objArray, this, uob, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = new c();
       Object[] objArray1 = PatchProxy.applyOneRefs(obj, this, uob, "7");
       if (objArray1 != patchProxyRe) {
       }else {
          int i = this.b(6);
          if (i) {
             i = this.a((i + this.a));
             b tb = this.b;
             if (PatchProxy.isSupport(c.class)) {
                Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(i), tb, obj, c.class, "4");
                if (obj1 != patchProxyRe) {
                   objArray = obj1;
                }
             }
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(i), tb, obj, c.class, "3")) {
                obj.a = i;
                obj.b = tb;
                i = i - tb.getInt(i);
                obj.c = i;
                obj.d = obj.b.getShort(i);
             }
             objArray = obj;
          }
          objArray1 = objArray;
       }
       return objArray1;
    }
    public a h(int p0){
       a obj;
       a uoa;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       b uob = b.class;
       if (PatchProxy.isSupport(uob)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uob, "17");
          if (obj != patchProxyRe) {
             return obj;
          }
       }
       obj = new a();
       if (PatchProxy.isSupport(uob)) {
          uoa = PatchProxy.applyTwoRefs(obj, Integer.valueOf(p0), this, uob, "18");
          if (uoa != patchProxyRe) {
          label_0089 :
             return uoa;
          }
       }
       int i = this.b(22);
       if (i) {
          p0 = this.a((this.d(i) + (p0 * 4)));
          uob = this.b;
          if (PatchProxy.isSupport(a.class)) {
             Object obj1 = PatchProxy.applyTwoRefs(Integer.valueOf(p0), uob, obj, a.class, "4");
             if (obj1 != patchProxyRe) {
                obj = obj1;
             }
          }
          if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), uob, obj, a.class, "3")) {
             obj.a = p0;
             obj.b = uob;
             p0 = p0 - uob.getInt(p0);
             obj.c = p0;
             obj.d = obj.b.getShort(p0);
          }
       }else {
          obj = 0;
       }
       uoa = obj;
       goto label_0089 ;
    }
}
