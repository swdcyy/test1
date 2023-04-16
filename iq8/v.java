package iq8.v;
import java.lang.Object;
import java.util.Arrays;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.lang.Boolean;
import iq8.t;

public class v	// class@002723
{
    public final float[] a;
    public int b;
    public final float c;
    public boolean d;
    public static final int[] e;
    public static float f;

    static {
       v.e = new int[9]{1,2,4,8,16,32,'@',128,256};
       v.f = 1000000020040877300000.00f;
    }
    public void v(){
       super(0);
    }
    public void v(float p0){
       float f;
       super();
       this.b = 0;
       this.c = p0;
       float[] uofloatArray = new float[]{f,f,f,f,f,f,f,f,f};
       f = v.f;
       this.a = uofloatArray;
    }
    public void v(v p0){
       super();
       this.b = 0;
       this.c = p0.c;
       v a = p0.a;
       this.a = Arrays.copyOf(a, a.length);
       this.b = p0.b;
       this.d = p0.d;
    }
    public float a(int p0){
       float f = (p0 == 4 || p0 == 5)? v.f: this.c;
       v tb = this.b;
       if (tb == null) {
          return f;
       }else {
          int[] e = v.e;
          if (e[p0] & tb) {
             return this.a[p0];
          }else if(this.d != null){
             p0 = (p0 == 1 || p0 == 3)? 7: 6;
             if (e[p0] & tb) {
                return this.a[p0];
             }else {
                p0 = 8;
                if (tb & e[p0]) {
                   return this.a[p0];
                }
             }
          }
          return f;
       }
    }
    public float b(int p0){
       return this.a[p0];
    }
    public boolean c(int p0,float p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       v ov = v.class;
       if (PatchProxy.isSupport(ov)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Float.valueOf(p1), this, ov, "2");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!t.a(this.a[p0], p1)) {
          this.a[p0] = p1;
          if (PatchProxy.isSupport(ov)) {
             Object obj1 = PatchProxy.applyOneRefs(Float.valueOf(p1), null, ov, "1");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(!Float.compare(p1, v.f)){
                b1 = true;
             }else {
                b1 = false;
             }
          }else {
             goto label_004b ;
          }
          this.b = (b1)? (~ v.e[p0]) & this.b: v.e[p0] | this.b;
          v tb = this.b;
          int[] e = v.e;
          if (!(e[8] & tb) && ((e[7] & tb) || (tb & e[6]))) {
             b = true;
          }
          this.d = b;
          return true;
       }else {
          return b;
       }
    }
}
