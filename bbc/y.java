package bbc.y;
import com.yxcorp.gifshow.widget.h$a;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import tyc.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.activitycontext.ActivityContext;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import cbc.b;
import k2b.f3;
import k2b.e0;
import java.lang.StringBuilder;
import android.content.Context;
import xh7.b;
import qh7.b;
import qh7.a;
import k2b.h;
import e17.i;

public class y implements h$a	// class@00043f
{
    public final String a;

    public void y(String p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       t.b(this, p0);
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "1")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       if (uActivity instanceof GifshowActivity && !PatchProxy.applyVoidOneRefs(uActivity, null, b.class, "41")) {
          f3.j("INVITE_TOAST").h(uActivity);
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, y.class, "2")) {
          return;
       }
       Activity uActivity = ActivityContext.g().e();
       if (uActivity instanceof GifshowActivity) {
          a.b(b.j(ActivityContext.g().e(), "kwai://chat/session?sessionId="+this.a+"&pageStyle=1&msgActionType=1"), null);
          if (!PatchProxy.applyVoidOneRefs(uActivity, null, b.class, "42")) {
             h.k("INVITE_TOAST").i(uActivity);
          }
       }
       i oi = i.l();
       if (oi != null && oi.s()) {
          oi.h();
       }
       return;
    }
}
