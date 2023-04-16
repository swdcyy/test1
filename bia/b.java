package bia.b;
import fv5.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.a;
import kha.a;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import km8.b;
import oe6.g;
import com.kwai.robust.PatchProxyResult;
import bia.b$b;
import java.lang.reflect.Type;
import el.a;
import java.lang.Number;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import com.kwai.sdk.switchconfig.a;
import java.lang.Integer;
import com.yxcorp.gifshow.follow.config.model.FollowNextToastConfig;
import java.lang.Long;
import lnc.a1;
import bia.b$a;
import java.lang.Boolean;

public class b implements a	// class@0003c1
{

    public void b(){
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, b.class, "4")) {
          return;
       }
       this.f(0);
       this.b(new ArrayList());
       this.e(new ArrayList());
       return;
    }
    public void b(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "10")) {
          return;
       }
       a.p(p0, "timeList");
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("followSlideAutoNextGuideShowTimeList", b.e(p0));
       g.a(uEditor);
       return;
    }
    public List c(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, b.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b$b().getType();
       String str = a.a.getString("followSlideAutoNextGuideShowTimeList", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public int d(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, b.class, "11");
       if (obj != patchProxyRe) {
          return obj.intValue();
       }
       obj = PatchProxy.apply(objArray, objArray, FollowConfigUtil.class, "39");
       int i = (obj != patchProxyRe)? obj.intValue(): a.t().a("autoSlideGuideMaxDisplayCount", 1);
       return i;
    }
    public void e(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "12")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putString("nebulaHomeFollowSlideAutoNextGuideShowTimeList", b.e(p0));
       g.a(uEditor);
       return;
    }
    public void f(int p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uob, "2")) {
          return;
       }
       SharedPreferences$Editor uEditor = a.a.edit();
       uEditor.putInt("followSlideGuideStatus", p0);
       g.a(uEditor);
       return;
    }
    public int g(){
       Object obj = PatchProxy.apply(null, this, b.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return a.a.getInt("followSlideGuideStatus", 0);
    }
    public int h(){
       int i;
       FollowNextToastConfig obj = PatchProxy.apply(null, this, b.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = FollowConfigUtil.w();
       obj = (obj != null)? obj.mNotShowDays: -1;
       return obj;
    }
    public Long i(){
       return Long.valueOf(0);
    }
    public String j(){
       Object obj = PatchProxy.apply(null, this, b.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a1.p(0x7f104866);
    }
    public List k(){
       Object[] objArray = null;
       Type obj = PatchProxy.apply(objArray, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new b$a().getType();
       String str = a.a.getString("nebulaHomeFollowSlideAutoNextGuideShowTimeList", "null");
       if (str != null && str != "") {
          objArray = b.a(str, obj);
       }
       return objArray;
    }
    public boolean l(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b = (this.g() == 3)? true: false;
       return b;
    }
    public int m(){
       int i;
       FollowNextToastConfig obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = FollowConfigUtil.w();
       obj = (obj != null)? obj.mMaxToastTimes: 1;
       return obj;
    }
}
