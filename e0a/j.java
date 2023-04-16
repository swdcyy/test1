package e0a.j;
import e0a.a;
import ok.x;
import com.google.common.base.Suppliers;
import e0a.b;
import e0a.c;
import e0a.d;
import e0a.e;
import e0a.f;
import e0a.g;
import e0a.h;
import e0a.i;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import o56.c;
import o56.a;
import xf6.g;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.entity.QPhoto;
import wh5.c;
import xf6.d;
import xf6.l;
import xf6.i;
import com.kwai.corona.CoronaApiExperimentUtil;
import com.kwai.framework.abtest.f;
import lnc.j2;
import java.lang.Number;
import le5.f;
import lnc.a1;
import java.lang.Integer;
import x1a.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fg6.a;
import com.google.gson.Gson;
import java.lang.RuntimeException;
import java.lang.Throwable;
import com.yxcorp.gifshow.util.PostUtils;

public class j	// class@002036
{
    public static c a;
    public static final x b;
    public static final x c;
    public static final x d;
    public static final x e;
    public static final x f;
    public static final x g;
    public static final x h;
    public static final x i;
    public static final x j;
    public static final Boolean k;

    static {
       j.b = Suppliers.a(a.b);
       j.c = Suppliers.a(b.b);
       j.d = Suppliers.a(c.b);
       j.e = Suppliers.a(d.b);
       j.f = Suppliers.a(e.b);
       j.g = Suppliers.a(f.b);
       j.h = Suppliers.a(g.b);
       j.i = Suppliers.a(h.b);
       j.j = Suppliers.a(i.b);
       j.k = Boolean.valueOf(a.t().d("enableDisappearInitLoggerDelay", false));
    }
    public void j(){
       super();
    }
    public static boolean a(){
       Object obj = PatchProxy.apply(null, null, j.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (j.f.get().booleanValue() ^ 0x01);
    }
    public static boolean b(){
       Object[] objArray;
       Object obj = PatchProxy.apply(null, null, j.class, "30");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       int i = 0;
       if (a.a().c()) {
          if (!g.n() || (g.n() == 3 && !j.l())) {
             b = false;
          }
          objArray = new Object[i];
          o.C().w("DetailExperimentUtils", "enableCopyText getCopyTextStyle:"+g.n(), objArray);
       }else if(j.l()){
          b = false;
       }
       objArray = new Object[i];
       o.C().w("DetailExperimentUtils", "enableCopyText getCopyTextExperimentValuePublishButton:"+j.l(), objArray);
       Object[] objArray1 = new Object[i];
       o.C().w("DetailExperimentUtils", "enableCopyText result:"+b, objArray1);
       return b;
    }
    public static boolean c(QPhoto p0){
       p0 = PatchProxy.applyOneRefs(p0, null, j.class, "4");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       return (c.b() ^ 0x01);
    }
    public static boolean d(){
       Object obj = PatchProxy.apply(null, null, j.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (a.t().d("coronaSpriteSwitch", b)) {
          b = true;
       }
       return b;
    }
    public static boolean e(){
       Object obj = PatchProxy.apply(null, null, j.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (l.c("KEY_FEEDBACK_PANEL_INTEREST_MANAGE_V1", b) || a.t().a("feedbackPanelInterestManagement", b) == 1) {
          b = true;
       }
       return b;
    }
    public static boolean f(){
       CoronaApiExperimentUtil obj = PatchProxy.apply(null, null, j.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (!i.c("KEY_TEST_ENABLE_OPTIMIZE_PANEL")) {
          obj = CoronaApiExperimentUtil.d;
          if (obj.b() != b && obj.b() != 2) {
             b = false;
          }
       }
       return b;
    }
    public static boolean g(){
       Object obj = PatchProxy.apply(null, null, j.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return f.a("Unified_Entrance");
    }
    public static boolean h(){
       Object obj = PatchProxy.apply(null, null, j.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableEpisodeCollection", false);
    }
    public static boolean i(){
       Object obj = PatchProxy.apply(null, null, j.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (j2.a() ^ 0x01);
    }
    public static boolean j(){
       Object obj = PatchProxy.apply(null, null, j.class, "16");
       if (obj == PatchProxyResult.class) {
          obj = j.e.get();
       }
       return obj.booleanValue();
    }
    public static int k(){
       Object obj = PatchProxy.apply(null, null, j.class, "32");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("jump_path");
    }
    public static int l(){
       Object obj = PatchProxy.apply(null, null, j.class, "33");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.e("publish_button");
    }
    public static int m(){
       Object obj = PatchProxy.apply(null, null, j.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return f.f("frequency", 0);
    }
    public static int n(){
       Object obj = PatchProxy.apply(null, null, j.class, "39");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (f.o()) {
          return a1.d(0x7f070ee6);
       }
       return a1.d(0x7f070ee5);
    }
    public static int o(){
       Object obj = PatchProxy.apply(null, null, j.class, "31");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (a.a().c()) {
          int i = l.e("KEY_MUSIC_WHELL_FREQUENCY", -1);
          if (i != -1) {
             return i;
          }
       }
       return f.e("exposureControl");
    }
    public static int p(){
       Object obj = PatchProxy.apply(null, null, j.class, "40");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (f.o()) {
          return a1.d(0x7f070fdf);
       }
       return a1.d(0x7f070ee7);
    }
    public static int q(){
       Object obj = PatchProxy.apply(null, null, j.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return j.d.get().intValue();
    }
    public static c r(){
       String obj = PatchProxy.apply(null, null, j.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          if (j.a == null) {
             obj = a.t().c("viewPagerAminConfig", "");
             if (!TextUtils.x(obj)) {
                j.a = a.a.h(obj, c.class);
             }
          }
          return j.a;
       }catch(java.lang.Exception e0){
       }
    }
    public static boolean s(){
       Object obj = PatchProxy.apply(null, null, j.class, "36");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       o.C().w("DetailExperimentUtils", "isCopyTextDialogStyle isTestChannel:"+a.a().c()+",getCopyTextStyle:"+g.n(), objArray);
       if (!a.a().c()) {
          return j.t();
       }
       int i = g.n();
       if (i) {
          boolean b = true;
          if (i != b) {
             if (i != 2) {
                if (i != 3) {
                   PostUtils.D("DetailExperimentUtils", "isCopyTextDialogStyle", new RuntimeException("不允许有这种参数"));
                   return 0;
                }else {
                   return j.t();
                }
             }else {
                return b;
             }
          }
       }
       return 0;
    }
    public static boolean t(){
       Object obj = PatchProxy.apply(null, null, j.class, "37");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       o.C().w("DetailExperimentUtils", "isCopyTextDialogStyleOnline getCopyTextExperimentValue:"+j.l(), objArray);
       int i = j.l();
       if (i) {
          String str = 1;
          if (i != str) {
             if (i != 2) {
                PostUtils.D("DetailExperimentUtils", "isCopyTextDialogStyle", new RuntimeException("线上不允许下发这种参数"));
                return 0;
             }else {
                return str;
             }
          }
       }
       return 0;
    }
    public static boolean u(){
       Object obj = PatchProxy.apply(null, null, j.class, "38");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       o.C().w("DetailExperimentUtils", "isCopyTextMoodType isTestChannel:"+a.a().c()+",getCopyTextType:"+g.o(), objArray);
       if (a.a().c()) {
          int i1 = g.o();
          if (i1 != 2) {
             if (i1 != 3) {
                return i;
             }else if(j.k() == 2){
                i = true;
             }
             return i;
          }else {
             return true;
          }
       }else if(j.k() == 2){
          i = true;
       }
       return i;
    }
}
