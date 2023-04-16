package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$c;
import qo6.k1;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter;
import brd.c0;
import java.lang.Object;
import sq6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import com.yxcorp.gifshow.im.exception.KwaiIMException;
import lnc.a1;
import java.lang.Throwable;
import dxa.b;
import dxa.h;
import java.lang.StringBuilder;
import fxa.a;
import fxa.d;
import java.lang.Integer;

public class IMRTCCenter$c extends k1	// class@001924
{
    public final c0 a;
    public final IMRTCCenter b;

    public void IMRTCCenter$c(IMRTCCenter p0,c0 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter$c.class, "1")) {
       }else {
          String str = "IMRTCCenter";
          if (p0 == null) {
             c.c(str, "realCreateRTCCall onSuccess, unexpected null voiceCallDetail");
             this.a.onError(new KwaiIMException(0x7ffffffc, a1.p(R.string.arg_RES_7f1018f2)));
          }else {
             p0 = h.a(p0);
             c.g(str, "realCreateRTCCall onSuccess imRtcCallDetail="+p0);
             this.b.mStateMachine.d(new a(1, p0));
             this.a.onSuccess(p0);
          }
       }
       return;
    }
    public void onError(int p0,String p1){
       IMRTCCenter$c uoc = IMRTCCenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoc, "2")) {
          return;
       }
       c.c("IMRTCCenter", "realCreateRTCCall onError errCode="+p0+" errMsg="+p1);
       this.a.onError(new KwaiIMException(p0, p1));
       return;
    }
}
