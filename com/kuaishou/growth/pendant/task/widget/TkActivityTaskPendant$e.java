package com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant$e;
import java.lang.Runnable;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.growth.pendant.task.widget.TkActivityTaskPendant;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import if0.a;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.taskcenter.util.TaskCenterLogUtil;
import android.view.ViewParent;
import android.view.View;
import android.view.ViewGroup;
import wkd.b;
import yf0.b;
import hg0.b;
import hg0.a;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import cg0.a;
import k2b.e0;
import java.lang.CharSequence;
import zsd.u;
import ig0.c;
import android.app.Activity;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import hf0.a;

public final class TkActivityTaskPendant$e implements Runnable	// class@0006e7
{
    public final GifshowActivity b;
    public final TkActivityTaskPendant c;

    public void TkActivityTaskPendant$e(GifshowActivity p0,TkActivityTaskPendant p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, TkActivityTaskPendant$e.class, "1")) {
          return;
       }
       TkActivityTaskPendant$e tb = this.b;
       TkActivityTaskPendant$e tc = this.c;
       if (!PatchProxy.applyVoidTwoRefs(tb, tc, objArray, a.class, "1")) {
          a.p(tb, "activity");
          a.p(tc, "pendantView");
          TaskCenterLogUtil b = TaskCenterLogUtil.b;
          TaskCenterLogUtil.d(b, "SwitchToNativeHelper", "switchToNative", false, 4, null);
          ViewParent parent = tc.getParent();
          if (parent != null) {
             parent.removeView(tc);
             b uob = b.a(0x686d9295).D();
             if (uob instanceof a) {
                uob.h.h(tb);
                int page = tb.getPage();
                String str = tb.o();
                c uoc = (str == null || u.S1(str))? 1: null;
                if (uoc) {
                   ClientEvent$UrlPackage urlPackage = c.a.a(tb);
                   if (urlPackage != null) {
                      page = urlPackage.page;
                      str = urlPackage.page2;
                   }
                }
                TaskCenterLogUtil.d(b, "SwitchToNativeHelper", "switchToNative showPendantIfNeed", false, 4, null);
                b.a(0x7fa4717b).D3(tb, page, str, 0, true);
             }
          }
       }
       PatchProxy.onMethodExit(TkActivityTaskPendant$e.class, "1");
       return;
    }
}
