package dra.c;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import dra.c$a;
import io.reactivex.g;
import com.google.gson.JsonObject;
import tb7.d;
import cra.w;
import java.lang.StringBuilder;
import q87.c;
import dra.a;
import fra.d;
import fra.b;
import dra.c$b;
import erd.a;
import crd.b;
import m56.e;
import android.content.Intent;
import android.app.Activity;
import android.net.Uri;
import java.util.Objects;
import dra.d;
import com.yxcorp.gifshow.growth.vfc.model.GrowthVfcModel;
import java.lang.Runnable;
import ekd.k1;
import lnc.u1;

public final class c	// class@002506
{
    public static GrowthVfcModel a;
    public static String b;
    public static String c;
    public static final c d;

    static {
       c.d = new c();
    }
    public void c(){
       super();
    }
    public static final t a(String p0,String p1,String p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p2, "activityCoupon");
       t ot = t.create(new c$a(p0, p1, p2));
       a.o(ot, "Observable.create { emit¡­lete\(\)\n          }\)\n    }");
       return ot;
    }
    public static final void b(JsonObject p0){
       String obj = null;
       if (PatchProxy.applyVoidOneRefs(p0, obj, c.class, "6")) {
          return;
       }
       a.p(p0, "params");
       int i = 2;
       String str = d.c(p0, "vUserId", obj, i, obj);
       String str1 = "";
       if (str == null) {
          str = str1;
       }
       String str2 = d.c(p0, "subBiz", obj, i, obj);
       if (str2 == null) {
          str2 = str1;
       }
       obj = d.c(p0, "activityCoupon", obj, i, obj);
       if (obj != null) {
          str1 = obj;
       }
       Object[] objArray = new Object[0];
       w.C().t("GrowthModule", "showVfcInviteDialog->"+p0, objArray);
       a uoa = new a(new d());
       uoa.c();
       c.a(str2, str, str1).doFinally(new c$b(uoa)).subscribe();
       return;
    }
    public final void onActivityResume(e p0){
       GrowthVfcModel a;
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoc, "2")) {
          return;
       }
       a.p(p0, "event");
       p0 = p0.a;
       a.o(p0, "event.mActivity");
       Intent intent = p0.getIntent();
       if (intent != null) {
          Uri data = intent.getData();
          if (data != null) {
             if (!a.g(data.getQueryParameter("fromVfcDialog"), "1")) {
                data = null;
             }
             if (data != null) {
                a = c.a;
                if (a != null) {
                   c d = c.d;
                   Objects.requireNonNull(d);
                   if (!PatchProxy.applyVoidOneRefs(a, d, uoc, "3")) {
                      k1.r(new d(a), 500);
                   }
                }
                u1.b(c.d);
             }
          }
       }
       return;
    }
}
