package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$d;
import qo6.k1;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter;
import java.lang.String;
import brd.c0;
import java.lang.Object;
import sq6.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dxa.b;
import dxa.h;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.lang.StringBuilder;
import dc5.c;
import fxa.a;
import fxa.d;
import com.yxcorp.gifshow.im.exception.KwaiIMException;
import lnc.a1;
import java.lang.Throwable;
import java.lang.Integer;

public class IMRTCCenter$d extends k1	// class@001925
{
    public final String a;
    public final c0 b;
    public final IMRTCCenter c;

    public void IMRTCCenter$d(IMRTCCenter p0,String p1,c0 p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter$d.class, "1")) {
       }else if(p0 == null){
          p0 = this.c.getCurRTCCallDetail();
       }else {
          p0 = h.a(p0);
       }
       String str = "IMRTCCenter";
       if (p0 == null || !TextUtils.n(this.a, p0.f())) {
          c.c(str, "realAcceptRTCCall onSuccess, unexpected null voiceCallDetail");
          this.c.interruptRTCCall(this.a);
          this.b.onError(new KwaiIMException(0x7ffffffc, a1.p(R.string.arg_RES_7f1018f2)));
       }else {
          c.g(str, "realAcceptRTCCall onSuccess imRtcCallDetail="+p0);
          if (!this.c.isIMRTCCallBusy()) {
             this.c.mStateMachine.d(new a(2, null, p0, true));
          }
          this.c.mStateMachine.d(new a(3, p0));
          this.b.onSuccess(p0);
       }
       return;
    }
    public void onError(int p0,String p1){
       IMRTCCenter$d uod = IMRTCCenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "2")) {
          return;
       }
       c.c("IMRTCCenter", "realAcceptRTCCall onError errCode="+p0+" errMsg="+p1);
       if (p0 >= 0xa028 && p0 < 0xa410) {
          this.c.interruptRTCCall(this.a);
       }
       this.b.onError(new KwaiIMException(p0, p1));
       return;
    }
}
