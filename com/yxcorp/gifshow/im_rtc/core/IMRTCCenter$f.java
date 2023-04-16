package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$f;
import qo6.k1;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter;
import brd.c0;
import java.lang.Object;
import sq6.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import dc5.c;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.im.exception.KwaiIMException;
import java.lang.Throwable;

public class IMRTCCenter$f extends k1	// class@001927
{
    public final c0 a;
    public final IMRTCCenter b;

    public void IMRTCCenter$f(IMRTCCenter p0,c0 p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void b(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMRTCCenter$f.class, "1")) {
       }else {
          c.g("IMRTCCenter", "interruptRTCCallWithSubscribe onSuccess");
          this.a.onSuccess(Boolean.TRUE);
       }
       return;
    }
    public void onError(int p0,String p1){
       IMRTCCenter$f uof = IMRTCCenter$f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "2")) {
          return;
       }
       c.g("IMRTCCenter", "interruptRTCCallWithSubscribe onError errCode="+p0+" errMsg="+p1);
       this.a.onError(new KwaiIMException(p0, p1));
       return;
    }
}
