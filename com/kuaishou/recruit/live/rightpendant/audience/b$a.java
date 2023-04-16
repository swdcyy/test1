package com.kuaishou.recruit.live.rightpendant.audience.b$a;
import yt4.a;
import com.kuaishou.recruit.live.rightpendant.audience.b;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$LivePlusRecruitAudienceWidget;
import com.kuaishou.livestream.message.nano.LivePlusRecruitMessages$RecruitWidgetButtonInfo;
import com.kuaishou.commercial.reporter.data.CommercialRecruitLiveShowClickReportMessageData;
import fq5.b;
import sr5.a;
import yt4.b;
import oy.a;
import java.lang.System;
import com.kuaishou.commercial.reporter.data.SignalMessageData;
import com.kuaishou.commercial.reporter.data.ApiResponseMessageData;
import java.lang.Boolean;

public class b$a extends a	// class@000ed4
{
    public final b h;

    public void b$a(b p0){
       this.h = p0;
       super();
    }
    public View H(){
       return this.h.L;
    }
    public int g(){
       return this.h.Y;
    }
    public void n(){
       String str;
       if (PatchProxy.applyVoid(null, this, b$a.class, "1")) {
          return;
       }
       b$a th = this.h;
       b v = th.V;
       if (v == null) {
          return;
       }
       int i = 7;
       b$a uoa = 5;
       if (th.Y8(v)) {
          i = 9;
          str = "MORE_POST";
       }else {
          LivePlusRecruitMessages$LivePlusRecruitAudienceWidget button = this.h.V.button;
          if (button != null && button.type == uoa) {
             str = "CHAT";
             i = 5;
          }else {
             str = "BUTTON";
          }
       }
       uoa = this.h;
       uoa.K.mWidgetButtonType = i;
       b$a th1 = this.h;
       b.b(uoa.v.b(), str, th1.N, th1.R8(), this.h.a9());
       this.h.j9(757, 3);
       th = this.h;
       if (th.F == null) {
          th.z.V();
          uoa = this.h;
          this.h.B.mRecruitCompleteActionTimePeriodMs = System.currentTimeMillis() - uoa.C;
          uoa = this.h;
          uoa.A.mRecruitHttpCompleteActionTimePeriodMs = System.currentTimeMillis() - uoa.C;
          uoa.F = true;
       }
       th = this.h;
       v = th.K;
       v.mActionType = 1;
       th.J.x(v);
       return;
    }
    public void o(boolean p0){
       if (PatchProxy.isSupport(b$a.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, b$a.class, "3")) {
          return;
       }
       p0.O = false;
       return;
    }
    public void onShow(){
       if (PatchProxy.applyVoid(null, this, b$a.class, "2")) {
          return;
       }
       this.h.O = true;
       return;
    }
}
