package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$e;
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

public class IMRTCCenter$e extends k1	// class@001926
{
    public final IMRTCCenter a;

    public void IMRTCCenter$e(IMRTCCenter p0){
       this.a = p0;
       super();
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter$e.class, "1")) {
       }else if(p0 == null){
          c.c("IMRTCCenter", "rejectRTCCall onSuccess, unexpected null voiceCallDetail");
       }else {
          c.g("IMRTCCenter", "rejectRTCCall onSuccess imRtcCallDetail="+h.a(p0));
       }
       return;
    }
    public void onError(int p0,String p1){
       IMRTCCenter$e uoe = IMRTCCenter$e.class;
       if (PatchProxy.isSupport(uoe) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoe, "2")) {
          return;
       }
       c.c("IMRTCCenter", "rejectRTCCall onError errCode="+p0+" errMsg="+p1);
       return;
    }
}
