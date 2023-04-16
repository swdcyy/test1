package gq9.a;
import com.yxcorp.gifshow.corona.common.experiment.b;
import ok.x;
import com.google.common.base.Suppliers;
import com.yxcorp.gifshow.corona.common.experiment.e;
import com.yxcorp.gifshow.corona.common.experiment.c;
import com.yxcorp.gifshow.corona.common.experiment.f;
import com.yxcorp.gifshow.corona.common.experiment.d;
import com.yxcorp.gifshow.corona.common.experiment.g;
import com.yxcorp.gifshow.corona.common.experiment.a;
import com.yxcorp.gifshow.corona.common.experiment.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Integer;
import com.yxcorp.gifshow.corona.common.experiment.CoronaExperimentUtilKt;
import com.yxcorp.gifshow.model.config.InternalNegativeFeedbackConfig;
import com.kwai.sdk.switchconfig.a;
import com.kwai.framework.abtest.f;
import java.lang.Number;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.yxcorp.gifshow.corona.common.model.CoronaCaption;
import jq9.h;
import uq9.f;

public class a	// class@0024dc
{
    public static final x a;
    public static x b;
    public static x c;
    public static final x d;
    public static final x e;
    public static final x f;
    public static final x g;
    public static final x h;

    static {
       a.a = Suppliers.a(b.b);
       a.b = Suppliers.a(e.b);
       a.c = Suppliers.a(c.b);
       a.d = Suppliers.a(f.b);
       a.e = Suppliers.a(d.b);
       a.f = Suppliers.a(g.b);
       a.g = Suppliers.a(a.b);
       a.h = Suppliers.a(h.b);
    }
    public void a(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (a.g.get().intValue() != b) {
          b = false;
       }
       return b;
    }
    public static boolean b(){
       Object obj = PatchProxy.apply(null, null, a.class, "4");
       if (obj == PatchProxyResult.class) {
          obj = a.c.get();
       }
       return obj.booleanValue();
    }
    public static boolean c(){
       Object obj = PatchProxy.apply(null, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return CoronaExperimentUtilKt.A.e();
    }
    public static boolean d(){
       InternalNegativeFeedbackConfig obj = PatchProxy.apply(null, null, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = a.f.get();
       boolean b = false;
       if (obj != null && obj.mFeedBackEnabled == 1) {
          b = true;
       }
       return b;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableEpisodeCollection", false);
    }
    public static boolean f(){
       Object obj = PatchProxy.apply(null, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (f.e("PanoramicSound") != b) {
          b = false;
       }
       return b;
    }
    public static int g(){
       Object obj = PatchProxy.apply(null, null, a.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.t().a("CoronaDetailCreateTimeDisplayRule", 720);
    }
    public static int h(){
       Object obj = PatchProxy.apply(null, null, a.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.h.get().intValue();
    }
    public static String i(){
       InternalNegativeFeedbackConfig obj = PatchProxy.apply(null, null, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = a.f.get();
       if (obj != null && !TextUtils.x(obj.mFeedBackUrl)) {
          return obj.mFeedBackUrl;
       }
       return "https://reco-tag.corp.kuaishou.com/?layoutType=4&&";
    }
    public static boolean j(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (h.a(r1.w0(p0.mEntity)) != null && !f.u(p0))? true: false;
       return b;
    }
}
