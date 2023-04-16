package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$i;
import qo6.k1;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter;
import brd.c0;
import java.lang.String;
import java.lang.Object;
import com.kwai.middleware.azeroth.network.EmptyResponse;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dc5.c;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.im.exception.KwaiIMException;
import java.lang.Throwable;

public class IMRTCCenter$i extends k1	// class@00192a
{
    public final c0 a;
    public final String b;
    public final IMRTCCenter c;

    public void IMRTCCenter$i(IMRTCCenter p0,c0 p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter$i.class, "1")) {
       }else {
          c.g("IMRTCCenter", "updateRTCCallDetail onSuccess");
          this.a.onSuccess(this.b);
       }
       return;
    }
    public void onError(int p0,String p1){
       IMRTCCenter$i oi = IMRTCCenter$i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, oi, "2")) {
          return;
       }
       c.c("IMRTCCenter", "updateRTCCallDetail onError errorCode="+p0+" errorMsg="+p1);
       this.a.onError(new KwaiIMException(p0, p1));
       return;
    }
}
