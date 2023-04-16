package com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.a;
import android.view.View$OnClickListener;
import com.kuaishou.live.audience.component.gift.navigationbar.wealthgrade.e;
import java.lang.Object;
import android.view.View;
import t02.a0;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import hm2.a$b;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import hm2.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import android.app.Activity;
import d61.y;
import b11.f;
import java.lang.Runnable;
import e93.f;

public final class a implements View$OnClickListener	// class@000b7c
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       LiveWealthGradeInfo liveWealthGr = tb.b.i2.yb();
       int i = 1;
       if (liveWealthGr != null) {
          liveWealthGr = liveWealthGr.mCurrentGrade;
          ClientContent$LiveStreamPackage liveStreamPa = tb.b.Z2.a();
          k ok = k.class;
          if (!PatchProxy.isSupport(ok) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(liveWealthGr), liveStreamPa, null, ok, "2")) {
             k.e(liveWealthGr, liveStreamPa, "PRIVILEGE_ENTRANCE", i);
          }
       }
       e a = tb.a;
       if (a != null) {
          if (y.d(a)) {
             tb.a.setRequestedOrientation(i);
             f.k("openGradeDetailDialog", new f(tb), tb, 100);
          }else {
             tb.d();
          }
       }
       return;
    }
}
