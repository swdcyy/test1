package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$g;
import qo6.k1;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter;
import java.lang.Object;
import sq6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import dxa.b;
import dxa.h;
import java.lang.StringBuilder;
import java.lang.Integer;

public class IMRTCCenter$g extends k1	// class@001928
{
    public final IMRTCCenter a;

    public void IMRTCCenter$g(IMRTCCenter p0){
       this.a = p0;
       super();
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter$g.class, "1")) {
       }else if(p0 == null){
          c.c("IMRTCCenter", "realCloseRTCCall onSuccess, unexpected null voiceCallDetail");
       }else {
          c.g("IMRTCCenter", "realCloseRTCCall onSuccess imRtcCallDetail="+h.a(p0));
       }
       return;
    }
    public void onError(int p0,String p1){
       IMRTCCenter$g og = IMRTCCenter$g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, og, "2")) {
          return;
       }
       c.c("IMRTCCenter", "realCloseRTCCall onError errCode="+p0+" errMsg="+p1);
       return;
    }
}
