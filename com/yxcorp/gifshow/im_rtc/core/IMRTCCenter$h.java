package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$h;
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
import java.lang.Integer;

public class IMRTCCenter$h extends k1	// class@001929
{
    public final c0 a;
    public final IMRTCCenter b;

    public void IMRTCCenter$h(IMRTCCenter p0,c0 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter$h.class, "1")) {
       }else {
          String str = "IMRTCCenter";
          if (p0 == null) {
             c.c(str, "fetchRTCCall, unexpected null voiceCallDetail");
             this.a.onError(new KwaiIMException(0x7ffffffc, a1.p(R.string.arg_RES_7f101a4a)));
          }else {
             p0 = h.a(p0);
             c.g(str, "fetchRTCCall onSuccess imRtcCallDetail="+p0);
             this.a.onSuccess(p0);
          }
       }
       return;
    }
    public void onError(int p0,String p1){
       IMRTCCenter$h oh = IMRTCCenter$h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oh, "2")) {
          return;
       }
       c.c("IMRTCCenter", "fetchRTCCall onError errCode="+p0+" errMsg="+p1);
       this.a.onError(new KwaiIMException(p0, p1));
       return;
    }
}
