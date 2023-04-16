package oe0.a;
import dd0.l;
import java.lang.Object;
import android.app.Activity;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import qe0.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.CharSequence;
import md0.c;
import java.util.Objects;
import com.kuaishou.growth.pendant.model.EntranceParam;
import android.util.Base64;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import ld0.c;
import fg6.a;
import com.google.gson.Gson;
import java.lang.Throwable;
import re0.a;
import com.kuaishou.growth.pendant.ui.PendantExpHelper;
import au5.a;
import java.util.concurrent.ConcurrentMap;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import crd.b;
import lnc.b9;
import qe0.b;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import java.util.concurrent.Callable;
import brd.m;
import t45.d;
import brd.z;
import io.reactivex.android.schedulers.a;
import qe0.c;
import qe0.d;
import erd.g;
import java.util.Map;
import id0.b;
import ld0.d;
import lnc.i3;

public class a implements l	// class@0034c9
{

    public void a(){
       super();
    }
    public void IM(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.p(p0, "activity");
       g.f.b(p0);
       return;
    }
    public boolean isAvailable(){
       return true;
    }
    public boolean kF(GifshowActivity p0,String p1,String p2){
       int b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = "activity";
       a.p(p0, obj);
       boolean b = false;
       c uoc = (p2 == null || !p2.length())? 1: null;
       if (uoc) {
          return b;
       }else {
          uoc = c.a;
          Objects.requireNonNull(uoc);
          Charset EntranceParam uoc1 = PatchProxy.applyOneRefs(p2, uoc, c.class, "6");
          if (uoc1 != patchProxyRe) {
          }else if(p2 == null || !p2.length()){
             uoc1 = 1;
          }else {
             uoc1 = null;
          }
          if (uoc1) {
             uoc1 = null;
          }else {
             byte[] uobyteArray = Base64.decode(p2, 8);
             a.o(uobyteArray, "Base64.decode\(param, Base64.URL_SAFE\)");
             uoc1 = Charset.forName("utf-8");
             a.o(uoc1, "Charset.forName\(\"utf-8\"\)");
             String str2 = new String(uobyteArray, uoc1);
             c.c("parseEntranceParam, parameter="+str2);
             uoc1 = a.a.h(str2, EntranceParam.class);
          }
          if (uoc1 != null) {
             p2 = PatchProxy.applyOneRefs(uoc1, null, a.class, "4");
             if (p2 != patchProxyRe) {
                b1 = p2.booleanValue();
             }else {
                p2 = uoc1.getMIconUrl();
                p2 = (p2 == null || !p2.length())? 1: null;
                if (!p2) {
                   p2 = uoc1.getMAnimZipUrl();
                   b1 = (p2 == null || !p2.length())? 1: 0;
                   if (!b1) {
                      if (uoc1.getMAnimationFrameMicroseconds() > 0) {
                         b1 = uoc1.getMAnimPrefix();
                         b1 = (b1 == null || !b1.length())? true: false;
                         if (!b1) {
                         label_00f7 :
                            b1 = true;
                         }
                      }
                   }else {
                      goto label_00f7 ;
                   }
                }
             label_00c9 :
                b1 = false;
             }
             if (b1) {
                String str = "entranceParam";
                if (PendantExpHelper.a()) {
                   if (!PatchProxy.applyVoidThreeRefs(p0, p1, uoc1, null, g.class, "1")) {
                      a.p(p0, obj);
                      a.p(uoc1, str);
                      b1 = a.a(p0);
                      if (g.a.get(b1) != null) {
                         b = true;
                      }
                      if (b) {
                         c.c("createEntrancePendantTryInAsync: pendantExist");
                      }else {
                         c.c("createEntrancePendantTryInAsync");
                         ConcurrentMap b2 = g.b;
                         b9.a(b2.get(b1));
                         b2.put(b1, m.r(new b(p0, uoc1)).B(d.c).u(a.c()).y(new c(p0, b1, uoc1, p1), d.b));
                      }
                   }
                }else if(PatchProxy.applyVoidThreeRefs(p0, p1, uoc1, null, g.class, "2")){
                   a.p(p0, obj);
                   a.p(uoc1, str);
                   b1 = a.a(p0);
                   if (g.a.get(b1) != null) {
                      b = true;
                   }
                   if (b) {
                      c.c("createEntrancePendantIfNeedAttached: pendantExist");
                   }else {
                      c.c("createEntrancePendantIfNeedAttached");
                      g.f.c(p0, b1, uoc1, a.a(p0, uoc1));
                      i3 oi3 = i3.f();
                      oi3.d("popup_type", "entrance");
                      oi3.d("isAsync", "FALSE");
                      oi3.d(obj, p0.getClass().getSimpleName());
                      oi3.d("page2", p1);
                      String str1 = oi3.e();
                      a.o(str1, "JsonStringBuilder.newIns¡­y\(\"page2\", page2\).build\(\)");
                      d.b().e(str1);
                   }
                }
                return true;
             }
          }
          return b;
       }
    }
}
