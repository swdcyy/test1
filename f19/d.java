package f19.d;
import xe5.p;
import f19.d$a;
import nsd.u;
import xe5.b;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import xe5.r;
import yx.j0;
import f19.h;
import java.lang.Integer;
import f19.i;
import android.view.View;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;

public final class d extends p	// class@002284
{
    public View b;
    public View c;
    public View d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public float j;
    public int k;
    public static final d$a l;

    static {
       d.l = new d$a(null);
    }
    public void d(){
       super();
       this.j = 0x3f800000;
    }
    public boolean a(b p0){
       boolean b1;
       int i2;
       r c;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       d uod = d.class;
       r obj = PatchProxy.applyOneRefs(p0, this, uod, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "textureViewSizeAdapterParam");
       obj = PatchProxy.applyOneRefs(p0, this, uod, "2");
       boolean b = true;
       if (obj != patchProxyRe) {
          b1 = obj.booleanValue();
       }else if(!p0 instanceof r){
          c = p0;
          obj = c.F;
          if (obj == null || (!(a.g(obj, this) ^ b) && c.Q != null)) {
             b1 = true;
          }
       }
       b1 = false;
       if (b1) {
          Object[] objArray = new Object[0];
          j0.a("AdTextureViewSizeAdapt", "ad adapt with AdCommonSizeAdapter", objArray);
          if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "3")) {
             d uod1 = 0x3f800000;
             if (!PatchProxy.applyVoidOneRefs(p0, this, uod, "4")) {
                this.b = p0.e;
                this.c = p0.f;
                this.d = p0.u;
                c = p0.c;
                if (c != null) {
                   this.e = ((float)p0.b * uod1) / (float)c;
                }
                this.f = p0.h;
                this.g = h.b.a(p0);
                this.h = p0.m + p0.j;
                this.i = p0.n;
                this.j = p0.E;
             }
             d tf = this.f;
             d te = this.e;
             int i = (te)? (int)((float)tf / te): 0;
             int i1 = this.g - i;
             d tk = this.k;
             if (tk != null) {
                d tj = this.j;
                if (tj - uod1) {
                   i2 = (int)(((float)tk * tj) + ((float)(i1 / 2) * ((float)b - tj)));
                label_00ce :
                   p0.F = this;
                   if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(tf), Integer.valueOf(i), Integer.valueOf(i2), this, d.class, "5")) {
                      i oi = new i(this.f, this.g, 48, 0, 8, null);
                      i oi1 = new i(tf, i, 49, i2);
                      i oi2 = new i(tf, i, 49, i2);
                      h b2 = h.b;
                      b2.b(this.b, PatchProxy.applyVoidThreeRefs(Integer.valueOf(tf), Integer.valueOf(i), Integer.valueOf(i2), this, d.class, "5"));
                      b2.b(this.c, oi1);
                      b2.b(this.d, oi2);
                      if (SystemUtil.I()) {
                         objArray = new Object[0];
                         j0.a("AdTextureViewSizeAdapt", "frame layoutParam is "+PatchProxy.applyVoidThreeRefs(Integer.valueOf(tf), Integer.valueOf(i), Integer.valueOf(i2), this, d.class, "5")+" \n "+"video layoutParam is "+oi1+10+"poster layoutParam is "+oi2, objArray);
                      }
                   }
                }
             }
             i2 = this.h;
             if (i1 >= (i2 * 2)) {
                i2 = i1 / 2;
             }
             this.k = i2;
             goto label_00ce ;
          }
       }else {
          b = false;
       }
       return b;
    }
    public String b(){
       return "AdCommonSizeAdapter";
    }
}
