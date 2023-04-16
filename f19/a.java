package f19.a;
import xe5.p;
import xe5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import xe5.r;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import yx.j0;
import f19.i;
import nsd.u;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;
import f19.h;
import android.view.View;

public final class a extends p	// class@00227d
{

    public void a(){
       super();
    }
    public boolean a(b p0){
       boolean b1;
       int i2;
       Object obj = this;
       Object obj1 = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String obj2 = PatchProxy.applyOneRefs(obj1, obj, uoa, "1");
       if (obj2 != patchProxyRe) {
          return obj2.booleanValue();
       }
       a.p(obj1, "textureViewSizeAdapterParam");
       obj2 = PatchProxy.applyOneRefs(obj1, obj, uoa, "2");
       int i = 1;
       boolean b = false;
       if (obj2 != patchProxyRe) {
          b1 = obj2.booleanValue();
       }else if(!obj1 instanceof r){
          Object obj3 = obj1;
          r f = obj3.F;
          if (f == null || (!(a.g(f, obj) ^ i) && obj3.Q != null)) {
             b1 = r1.h2(obj3.a);
          }
       }
       b1 = false;
       if (!b1) {
          return b;
       }else {
          Object[] objArray = new Object[b];
          obj2 = "AdTextureViewSizeAdapt";
          j0.a(obj2, "ad adapt with AdBlack3SectionSizeAdapter", objArray);
          if (!PatchProxy.applyVoidOneRefs(obj1, obj, uoa, "3")) {
             r h = obj1.h;
             r i1 = obj1.i;
             r b2 = obj1.b;
             if (b2 != null) {
                r c = obj1.c;
                if (c != null) {
                   i2 = (int)((float)h / (((float)b2 * 0x3f800000) / (float)c));
                label_007d :
                   r or = h;
                   i oi = new i(or, i1, 48, 0, 8, null);
                   oi = v13;
                   int i3 = i2;
                   i oi1 = v13;
                   oi = new i(or, i3, 17, 0, 8, 0);
                   oi = v13;
                   i oi2 = v13;
                   oi = new i(or, i3, 17, 0, 8, 0);
                   if (SystemUtil.I()) {
                      Object[] objArray1 = new Object[b];
                      j0.a(obj2, "frame layoutParam is "+v14+" \n "+"video layoutParam is "+oi1+10+"poster layoutParam is "+oi2, objArray1);
                   }
                   h b3 = h.b;
                   b3.b(obj1.e, v14);
                   b3.b(obj1.f, oi1);
                   b3.b(obj1.u, oi2);
                   obj1.F = obj;
                }
             }
             i2 = false;
             goto label_007d ;
          }
          return true;
       }
    }
    public String b(){
       return "AdBlack3SectionSizeAdapter";
    }
}
