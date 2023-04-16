package ce0.a;
import android.app.Application$ActivityLifecycleCallbacks;
import java.lang.Object;
import ce0.b;
import java.lang.String;
import com.kuaishou.growth.pendant.core.SelectPageHelper;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import ce0.e;
import k2b.s1;
import lnc.u1;
import android.app.Activity;
import android.os.Bundle;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import vt5.a;
import au5.b;
import com.yxcorp.gifshow.activity.GifshowActivity;
import android.content.Intent;
import android.net.Uri;
import vt5.e;
import st5.b$f;
import st5.b;

public class a implements Application$ActivityLifecycleCallbacks	// class@00049c
{

    public void a(){
       super();
       int i = 0;
       Object[] objArray = new Object[i];
       b.C().w("ActivityLifecycleCallbacksAdapter", "init", objArray);
       SelectPageHelper i1 = SelectPageHelper.i;
       Objects.requireNonNull(i1);
       if (PatchProxy.applyVoid(null, i1, SelectPageHelper.class, "2")) {
       }else {
          Object[] objArray1 = new Object[i];
          b.C().D("init", objArray1);
          b.a(0x4b316083).T0(e.b);
          u1.a(i1);
       }
       return;
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "1")) {
          return;
       }
       SelectPageHelper i = SelectPageHelper.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoidOneRefs(p0, i, SelectPageHelper.class, "5")) {
          a.p(p0, "activity");
       }
       return;
    }
    public void onActivityDestroyed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "6")) {
          return;
       }
       SelectPageHelper i = SelectPageHelper.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoidOneRefs(p0, i, SelectPageHelper.class, "11")) {
          a.p(p0, "activity");
          Object[] objArray = new Object[0];
          b.C().D("activity Destroyed activity="+p0.getClass().getSimpleName(), objArray);
          b.a().onActivityDestroyed(p0);
       }
       return;
    }
    public void onActivityPaused(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       SelectPageHelper i = SelectPageHelper.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoidOneRefs(p0, i, SelectPageHelper.class, "9")) {
          a.p(p0, "activity");
       }
       return;
    }
    public void onActivityResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "3")) {
          return;
       }
       SelectPageHelper i = SelectPageHelper.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoidOneRefs(p0, i, SelectPageHelper.class, "8")) {
          a.p(p0, "activity");
          GifshowActivity gifshowActiv = (!p0 instanceof GifshowActivity)? null: p0;
          if (gifshowActiv && SelectPageHelper.d) {
             if (SelectPageHelper.f) {
                i.f(gifshowActiv, SelectPageHelper.c);
             }else {
                i.g(gifshowActiv, SelectPageHelper.c);
             }
          }
          boolean b = false;
          SelectPageHelper.d = b;
          SelectPageHelper.f = b;
          Intent intent = p0.getIntent();
          a.o(intent, "activity.intent");
          Uri data = intent.getData();
          if (data != null) {
             a.o(data, "it");
             if (data.isHierarchical()) {
                boolean booleanQuery = data.getBooleanQueryParameter("hidePendant", b);
                Object[] objArray = new Object[b];
                b.C().w("SelectPageHelper", "needHidePendant ="+booleanQuery, objArray);
                if (booleanQuery) {
                   b.c().ha(p0, b$f.b);
                }else {
                   b.c().fx(p0, b$f.b);
                }
             }
          }
       }
    label_0096 :
       return;
    }
    public void onActivitySaveInstanceState(Activity p0,Bundle p1){
    }
    public void onActivityStarted(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       SelectPageHelper i = SelectPageHelper.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoidOneRefs(p0, i, SelectPageHelper.class, "6")) {
          a.p(p0, "activity");
       }
       return;
    }
    public void onActivityStopped(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "5")) {
          return;
       }
       SelectPageHelper i = SelectPageHelper.i;
       Objects.requireNonNull(i);
       if (!PatchProxy.applyVoidOneRefs(p0, i, SelectPageHelper.class, "10")) {
          a.p(p0, "activity");
       }
       return;
    }
}
