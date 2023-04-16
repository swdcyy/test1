package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.a;
import erd.g;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.e;
import java.lang.Object;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainConfig;
import com.kuaishou.live.core.show.redpacket.redpackrain2.model.LiveRedPackRainResource;
import ekd.j;
import java.lang.Long;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import t02.a0;
import p91.m;
import pm8.a;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.Integer;
import com.kuaishou.android.live.log.c$b;
import com.kuaishou.android.live.log.c;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.yxcorp.gifshow.model.CDNUrl;
import uc.d;
import brd.t;
import com.kuaishou.live.common.core.basic.tools.l;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.d;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.SharedPreferences$Editor;
import oe6.g;

public final class a implements g	// class@000f0d
{
    public final e b;

    public void a(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       boolean b;
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (p0 != null) {
          p0 = p0.mLiveRedPackRainConfig;
          if (p0 != null) {
             e uoe = e.class;
             if (!PatchProxy.applyVoidOneRefs(p0, tb, uoe, "3") && tb.P8()) {
                LiveRedPackRainConfig mRedPackRain = p0.mRedPackRainResource;
                if (mRedPackRain != null && !j.h(mRedPackRain.mEnterPopupImage)) {
                   long l = (long)p0.mDisplayIntervalMillis;
                   if (PatchProxy.isSupport(uoe)) {
                      Object obj = PatchProxy.applyOneRefs(Long.valueOf(l), tb, uoe, "6");
                      if (obj != PatchProxyResult.class) {
                         b = obj.booleanValue();
                      }else if((tb.p.Z2.s() - a.a.getLong(b.d("user")+"live_red_pack_rain_last_notice_show_time_millis", 0)) - l >= 0){
                         b = true;
                      }else {
                         b = false;
                      }
                   }else {
                      goto label_0051 ;
                   }
                   if (!b) {
                      b.a0(LiveLogTag.LIVE_RED_PACK_RAIN, "showEnterNotice: fail. not reached displayIntervalMillis", c.j("mDisplayIntervalMillis", Integer.valueOf(p0.mDisplayIntervalMillis)));
                   }else {
                      tb.X7(l.e(p0.mRedPackRainResource.mEnterPopupImage, null).subscribe(new b(tb, p0), d.b));
                      p0 = a.a.edit();
                      p0.putLong(b.d("user")+"live_red_pack_rain_last_notice_show_time_millis", tb.p.Z2.s());
                      g.a(p0);
                   }
                }
             }
          }
       }
       return;
    }
}
