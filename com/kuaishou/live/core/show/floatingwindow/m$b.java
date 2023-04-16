package com.kuaishou.live.core.show.floatingwindow.m$b;
import com.yxcorp.gifshow.osbug.a;
import com.kuaishou.live.core.show.floatingwindow.m;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.basic.activity.LivePlayActivity;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.core.basic.utils.e;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import wp5.c;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.show.floatingwindow.LiveFloatingWindowCloseType;
import android.os.Handler;
import pm8.a;
import com.kuaishou.live.core.show.floatingwindow.m$d;
import android.view.Window;
import o07.d$a;
import o07.d;
import com.yxcorp.gifshow.webview.KwaiYodaWebViewActivity;
import com.yxcorp.gifshow.webview.KwaiWebViewActivity;
import android.os.Bundle;

public class m$b extends a	// class@000b8c
{
    public final m c;

    public void m$b(m p0){
       this.c = p0;
       super();
    }
    public void b(Activity p0){
       boolean b;
       m om = m.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, m$b.class, "2")) {
          return;
       }
       m$b tc = this.c;
       Objects.requireNonNull(tc);
       c obj = PatchProxy.applyOneRefs(p0, tc, om, "10");
       int i = 0;
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(p0 instanceof LivePlayActivity){
          QPhoto qPhoto = e.h(p0);
          if (qPhoto == null || !qPhoto.isLiveStream()) {
             b = false;
          }
       }
       b = true;
       if (b) {
          m$b tc1 = this.c;
          tc1.c.unregisterActivityLifecycleCallbacks(tc1.s);
          return;
       }else {
          obj = this.c.c(p0);
          if (obj == null) {
             if (this.c.e != null) {
                b.Z(LiveLogTag.FLOATING_WINDOW, "close because of jump to other page");
                this.c.a(LiveFloatingWindowCloseType.ENTER_OTHER_PAGE_TEMP_CLOSE, true);
             }
          }else {
             m$b tc2 = this.c;
             if (tc2.e != null) {
                tc2.r.removeMessages(i);
             }else if(tc2.b(obj) == -3 && (this.c.n == null && a.n0())){
                this.c.g(p0, obj);
                this.c.n = true;
             }
             tc = this.c;
             Objects.requireNonNull(tc);
             if (!PatchProxy.applyVoidOneRefs(p0, tc, om, "13")) {
                tc.h();
                m$d uod = new m$d(tc, p0.getWindow());
                tc.o = uod;
                if (!PatchProxy.applyVoid(null, uod, m$d.class, "3")) {
                   d.b(uod.b, uod);
                }
             }
             if (p0 instanceof KwaiYodaWebViewActivity || p0 instanceof KwaiWebViewActivity) {
                this.c.p = p0;
             }
          }
          return;
       }
    }
    public void onActivityCreated(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m$b.class, "1")) {
          return;
       }
       m$b tc = this.c;
       if (tc.e != null && tc.c(p0) == null) {
          b.Z(LiveLogTag.FLOATING_WINDOW, "close because of jump to other page");
          this.c.a(LiveFloatingWindowCloseType.ENTER_OTHER_PAGE_TEMP_CLOSE, true);
       }
       return;
    }
}
