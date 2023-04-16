package f5a.a;
import java.lang.Object;
import w85.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import z85.a;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import com.kwai.component.detail.launcher.api.model.detail.DetailParamCreator;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import kp.r1;
import fm5.a;

public final class a	// class@0022c2
{
    public static final a a;

    static {
       a.a = new a();
    }
    public void a(){
       super();
    }
    public final boolean a(a p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "12");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          p0 = p0.i();
          if (p0 != null) {
             Object obj1 = PatchProxy.apply(null, p0, a.class, "3");
             if (obj1 != patchProxyRe) {
                b1 = obj1.booleanValue();
             }else if(p0.k != null){
                p0 = p0.c;
             }else {
                b1 = DetailParamCreator.e(p0.m, p0.n);
             }
             if (b1 == b) {
             label_0041 :
                return b;
             }
          }
       }
       b = false;
       goto label_0041 ;
    }
    public final boolean b(NasaBizParam p0){
       NasaSlideParam nasaSlidePar;
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          nasaSlidePar = p0.getNasaSlideParam();
          if (nasaSlidePar != null) {
             nasaSlidePar = nasaSlidePar.mSourcePage;
          label_001f :
             return a.g("profile", nasaSlidePar);
          }
       }
       nasaSlidePar = null;
       goto label_001f ;
    }
    public final boolean c(QPhoto p0,a p1){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, a.class, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (r1.A2(p0) && p1 != null) {
          a uoa = p1.i();
          if (uoa != null) {
             p1 = PatchProxy.apply(null, uoa, a.class, "2");
             if (p1 != patchProxyRe) {
                b1 = p1.booleanValue();
             }else if(uoa.k != null){
                b1 = uoa.b;
             }else if(uoa.m.getSource() != 90 && (uoa.m.getSource() == 8 || uoa.m.getSource() == 82)){
                b1 = 1;
             }else {
                b1 = null;
             }
             if (b1 == 1) {
                b = true;
             }
          }
       }
       return b;
    }
    public final boolean d(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.A(p0);
    }
}
