package f19.f;
import xe5.p;
import f19.f$a;
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
import f19.h;
import java.util.Objects;
import java.lang.Number;
import le5.f;
import yx.j0;
import java.lang.Integer;
import com.kuaishou.android.model.mix.PhotoTextLocationInfo;
import java.lang.Math;
import f19.i;
import android.view.View;
import com.yxcorp.utility.SystemUtil;
import java.lang.StringBuilder;

public final class f extends p	// class@002287
{
    public PhotoTextLocationInfo b;
    public View c;
    public View d;
    public View e;
    public float f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public float l;
    public int m;
    public boolean n;
    public static final f$a o;

    static {
       f.o = new f$a(null);
    }
    public void f(){
       super();
       this.l = 0x3f800000;
    }
    public boolean a(b p0){
       int b2;
       Object[] objArray;
       int i;
       r f;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       String obj = PatchProxy.applyOneRefs(p0, this, uof, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       a.p(p0, "textureViewSizeAdapterParam");
       obj = PatchProxy.applyOneRefs(p0, this, uof, "2");
       boolean b = true;
       boolean b1 = false;
       if (obj != patchProxyRe) {
          b2 = obj.booleanValue();
       }else if(!p0 instanceof r){
          r or = p0;
          f = or.F;
          if (f == null || (!(a.g(f, this) ^ b) && or.Q != null)) {
             b2 = true;
          }
       }
       b2 = false;
       if (b2) {
          obj = PatchProxy.applyOneRefs(p0, this, uof, "3");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             obj = "4";
             if (!PatchProxy.applyVoidOneRefs(p0, this, uof, obj)) {
                this.b = p0.t;
                this.c = p0.e;
                this.d = p0.f;
                this.e = p0.u;
                r c = p0.c;
                if (c != null) {
                   this.f = ((float)p0.b * 0x3f800000) / (float)c;
                }
                this.g = p0.h;
                this.h = h.b.a(p0);
                this.j = p0.m;
                this.k = p0.n;
                this.i = p0.j;
                this.l = p0.E;
                this.n = p0.L;
             }
             p0.F = this;
             uof = this.h;
             f tm = this.m;
             if (tm == b || (tm == null && this.d(uof))) {
                objArray = new Object[b1];
                j0.a("AdTextureViewSizeAdapt", "ad adapt with AdPhotoTextSizeAdapter mode A", objArray);
                this.m = b;
                this.e(uof, b1);
             }else {
                tm = this.i;
                h b3 = h.b;
                Objects.requireNonNull(b3);
                f obj1 = PatchProxy.apply(null, b3, h.class, obj);
                if (obj1 != patchProxyRe) {
                   i = obj1.intValue();
                }else if(f.r()){
                   i = 0;
                }else {
                   i = h.a;
                }
                int i1 = uof - (tm + i);
                f tm1 = this.m;
                b2 = 2;
                if (tm1 == b2 || (tm1 == null && this.d(i1))) {
                   objArray = new Object[b1];
                   j0.a("AdTextureViewSizeAdapt", "ad adapt with AdPhotoTextSizeAdapter mode B", objArray);
                   this.m = b2;
                   this.e(i1, this.i);
                }else {
                   tm1 = this.f;
                   i = (!tm1)? 0: (int)((float)this.g / tm1);
                   obj1 = this.m;
                   if (obj1 == 3 || (obj1 == null && (i < i1 && i > (i1 - this.j)))) {
                      objArray = new Object[b1];
                      j0.a("AdTextureViewSizeAdapt", "ad adapt with AdPhotoTextSizeAdapter between B and C", objArray);
                      this.m = 3;
                      this.e(i, ((this.i + i1) - i));
                   }else {
                      i1 = i1 - this.j;
                      if (obj1 == 4 || (obj1 == null && this.d(i1))) {
                         objArray = new Object[b1];
                         j0.a("AdTextureViewSizeAdapt", "ad adapt with AdPhotoTextSizeAdapter mode C", objArray);
                         this.m = 4;
                         this.e(i1, (this.i + this.j));
                      }else {
                         p0.F = null;
                         b = 0;
                      }
                   }
                }
             }
          }
          b1 = b;
       }
       return b1;
    }
    public String b(){
       return "AdWithPhotoTextSizeAdapter";
    }
    public final boolean d(int p0){
       float f;
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(f.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "5");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       f = (float)p0;
       float f1 = this.f * f;
       f tg = this.g;
       boolean b = true;
       if (p0 > tg) {
          f tb = this.b;
          if (tb != null) {
             float f3 = (f1 - (float)tg) / (float)2;
             float f4 = tb.mLeftRatio * f1;
             float f5 = (tb.mWidthRatio * f1) + f4;
             if (f4 - f3 < 0 || (f1 - f5) - f3 < 0) {
                b1 = true;
             label_0049 :
                if (!b1) {
                   if (PatchProxy.isSupport(f.class)) {
                      Object obj1 = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, f.class, "6");
                      if (obj1 != patchProxyRe) {
                         b2 = obj1.booleanValue();
                      }else {
                      label_0064 :
                         f = f * this.f;
                         float f2 = (float)this.g;
                         f2 = (f - f2 <= 0)? 0: (f - f2) / f;
                         if (f2 - 0x3e4ccccd > 0) {
                            b2 = true;
                         }else {
                            b2 = false;
                         }
                      }
                   }else {
                      goto label_0064 ;
                   }
                   if (!b2) {
                   label_0082 :
                      return b;
                   }
                }
                b = false;
                goto label_0082 ;
             }
          }
       }
       b1 = false;
       goto label_0049 ;
    }
    public final void e(int p0,int p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, uof, "7")) {
          return;
       }
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p1), Integer.valueOf(p0), this, uof, "8");
          if (obj != PatchProxyResult.class) {
             p1 = obj.intValue();
          }else if(!p1){
             p1 = 0;
          }else {
             p1 = (int)(((float)p1 * this.l) + (((float)Math.max((this.h - p0), 0) / 2.00f) * ((float)1 - this.l)));
          }
       }else {
          goto label_0039 ;
       }
       int i = (int)((float)p0 * this.f);
       i oi = new i(this.g, this.h, 48, 0, 8, null);
       oi = new i(i, p0, 49, p1);
       i oi1 = new i(i, p0, 49, p1);
       h b = h.b;
       b.b(this.c, v1);
       b.b(this.d, oi);
       b.b(this.e, oi1);
       if (SystemUtil.I()) {
          Object[] objArray = new Object[0];
          j0.a("AdTextureViewSizeAdapt", "frame layoutParam is "+v1+" \n "+"video layoutParam is "+oi+10+"poster layoutParam is "+oi1, objArray);
       }
       return;
    }
}
