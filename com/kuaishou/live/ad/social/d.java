package com.kuaishou.live.ad.social.d;
import java.lang.Runnable;
import com.kuaishou.live.ad.social.e;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zl0.a1;
import km9.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail;
import com.kuaishou.live.ad.social.LiveAdConversionTaskDetail$GuidePopMsg;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import xx.a;
import android.content.SharedPreferences;
import ya1.c0;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import kl2.e;
import sr5.a;
import zl0.k;
import zl0.j;

public final class d implements Runnable	// class@000a0c
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void run(){
       boolean b;
       d tb = this.b;
       Objects.requireNonNull(tb);
       e uoe = e.class;
       if (PatchProxy.applyVoid(null, tb, uoe, "7")) {
       }else {
          a1 uoa1 = tb.r.pn();
          if (uoa1 != null && uoa1.k != null) {
             Object obj = PatchProxy.applyOneRefs(uoa1, tb, uoe, "11");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
                b = false;
                if (uoa1.a != null) {
                   a1 k = uoa1.k;
                   if (k != null) {
                      LiveAdConversionTaskDetail mGuideInfo = k.mGuideInfo;
                      if (mGuideInfo != null && !TextUtils.x(mGuideInfo.mTitle)) {
                         b = a.a.getBoolean("hasConversionTaskBubbleShown", b) ^ 0x01;
                      }
                   }
                }
             }
             if (b) {
                c0 uoc0 = new c0(tb.getActivity(), uoa1.k.mGuideInfo.mTitle);
                tb.q.k1().a(uoc0, new k(tb, uoc0, uoa1), new j(tb, uoc0), 5000, 10);
             }
          }
       }
       return;
    }
}
