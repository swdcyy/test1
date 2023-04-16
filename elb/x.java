package elb.x;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import lq.i;
import kotlin.jvm.internal.a;
import elb.w;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.gifshow.upload.UploadRequest$a;
import lnc.d7;
import com.yxcorp.gifshow.upload.UploadRequest;
import java.lang.Integer;
import q46.d;
import dnc.v1;
import java.lang.NullPointerException;

public final class x	// class@00276e
{
    public static final String a = "PostBenefitGuideUtils";
    public static final x b;

    static {
       x.b = new x();
    }
    public void x(){
       super();
    }
    public static final boolean a(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, ox, "6");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (x.e() || (i.h() && a.g(i.m().z("hasCoinProgress"), Boolean.TRUE))) {
          Object obj1 = PatchProxy.apply(objArray, objArray, ox, "8");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else {
             w ow = i.m().z("postBenefitGuideData");
             if (ow != null) {
                objArray = ow.c();
             }
             b1 = TextUtils.isEmpty(objArray) ^ b;
          }
          if (b1) {
          label_005d :
             return b;
          }
       }
    label_005c :
       b = false;
       goto label_005d ;
    }
    public static final void b(UploadRequest$a p0){
       int i;
       int b;
       Object obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, x.class, "11")) {
          return;
       }
       a.p(p0, "builder");
       if (i.h()) {
          p0.a.mIsGoldTask = d7.a.i();
          obj = i.m().z("customPublishToast");
       }
       i = 0;
       if (!x.e()) {
          w ow = (obj == null || !obj.length())? 1: null;
          if (!ow) {
          label_0044 :
             ow = x.d();
             if (ow != null) {
                w f = ow.f;
                w g = ow.g;
                if (d.d(Integer.valueOf(ow.p))) {
                   String str = ow.f();
                   str = (str == null || !str.length())? 1: null;
                   if (!str) {
                      str = ow.e();
                      v1 ov1 = (str == null || !str.length())? 1: null;
                      if (!ov1) {
                         String str1 = ow.f();
                         String str2 = ow.e();
                         int i1 = ow.b();
                         b = (ow.b() == ow.o)? true: false;
                         p0.n(true);
                         p0.a.mRandomCoinParams = new v1(str1, str2, i1, b);
                      }
                   }
                }
             label_00a3 :
                b = (f == null || !f.length())? 1: 0;
                if (!b) {
                   p0.n(true);
                   p0.F(f);
                }
                if (g == null || !g.length()) {
                   i = 1;
                }
                if (!i) {
                   p0.a.mPublishToastIconUrl = g;
                }
             }
             if (obj != null) {
                p0.n(true);
                p0.F(obj);
             }
          }
       }else {
          goto label_0044 ;
       }
       return;
    }
    public static final String c(){
       Object[] objArray = null;
       w obj = PatchProxy.apply(objArray, objArray, x.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!i.h()) {
          return objArray;
       }
       obj = i.m().z("postBenefitGuideData");
       if (obj != null) {
          objArray = obj.c();
       }
       return objArray;
    }
    public static final Object d(){
       Object[] objArray = null;
       i obj = PatchProxy.apply(objArray, objArray, x.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (x.e()) {
          obj = i.m();
          if (obj != null) {
             return obj.z("postBenefitGuideData");
          }
       }
       return objArray;
    }
    public static final boolean e(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       x ox = x.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, objArray, ox, "4");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!x.h()) {
          try{
             Object obj1 = PatchProxy.apply(objArray, objArray, ox, "1");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else {
                Object obj2 = i.m().z("postBenefitGuideData");
                if (obj2 != null) {
                   b1 = (obj2.d() == 5 && d.c(Integer.valueOf(obj2.g())))? true: false;
                }else {
                   throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.model.PostBenefitGuideData");
                }
             }
          }catch(java.lang.NullPointerException e0){
          }
          if (!b1 && !x.g()) {
          label_0063 :
             return b;
          }
       }
    label_0062 :
       b = true;
       goto label_0063 ;
    }
    public static final boolean f(){
       Object obj = PatchProxy.apply(null, null, x.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (x.g() || x.h())? true: false;
       return b;
    }
    public static final boolean g(){
       Object obj = PatchProxy.apply(null, null, x.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          Object obj1 = i.m().z("postBenefitGuideData");
          if (obj1 == null) {
             throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.model.PostBenefitGuideData");
          }
          if (obj1.d() == 6 && (obj1.g() == 3 || d.b(Integer.valueOf(obj1.g())))) {
             b = true;
          }
          return b;
       }catch(java.lang.NullPointerException e0){
          return e0;
       }
    }
    public static final boolean h(){
       Object obj = PatchProxy.apply(null, null, x.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       try{
          Object obj1 = i.m().z("postBenefitGuideData");
          if (obj1 == null) {
             throw new NullPointerException("null cannot be cast to non-null type com.yxcorp.gifshow.model.PostBenefitGuideData");
          }
          if (obj1.d() == 6) {
             b = true;
          }
          return b;
       }catch(java.lang.NullPointerException e0){
          return e0;
       }
    }
}
