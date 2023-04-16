package com.kuaishou.live.gzone.barrage.o;
import erd.g;
import com.kuaishou.live.gzone.barrage.p;
import java.lang.Object;
import com.kuaishou.live.gzone.barrage.LiveGzoneColorBarrageResponse;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import pm8.a;
import t02.a0;
import com.kuaishou.live.core.show.fansgroup.http.LiveFansGroupIntimacyInfo;
import kg1.g;
import java.lang.StringBuilder;
import km8.b;
import android.content.SharedPreferences;
import b53.k0;
import java.lang.Runnable;
import ekd.k1;
import jv1.b;

public final class o implements g	// class@001c42
{
    public final p b;

    public void o(p p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       o tb = this.b;
       tb.t = p0;
       if (p0.mHasColorBarrage != null && (!PatchProxy.applyVoid(null, tb, p.class, "5") && !a.p())) {
          boolean b = false;
          String str = "user";
          StringBuilder str1 = 1;
          if (tb.s.r1.Qi().mStatus == str1) {
             if (!a.a.getBoolean(b.d(str)+"is_live_gzone_color_barrage_portrait_tip_displayed", b)) {
                k1.s(new k0(tb), tb, 0x2710);
             }
          }else if(tb.s.r1.Qi().mStatus == 3 || (tb.s.r1.Qi().mStatus != 2 || a.a.getBoolean(b.d(str)+"is_live_gzone_color_barrage_landscape_tip_displayed", b))){
             if (tb.s.x.H2()) {
                tb.S8();
             }else {
                tb.z = str1;
             }
          }
       }
       return;
    }
}
