package com.yxcorp.gifshow.im_rtc.core.IMRTCCenter$b;
import fxa.d$g;
import com.yxcorp.gifshow.im_rtc.core.IMRTCCenter;
import java.lang.Object;
import java.lang.String;
import dxa.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;

public class IMRTCCenter$b implements d$g	// class@001923
{
    public final IMRTCCenter a;

    public void IMRTCCenter$b(IMRTCCenter p0){
       this.a = p0;
       super();
    }
    public void a(int p0,String p1,String p2,b p3){
       if (PatchProxy.isSupport(IMRTCCenter$b.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, IMRTCCenter$b.class, "2")) {
          return;
       }
       this.a.onCallStateSwitch(p0, p1, p2, p3);
       return;
    }
    public void b(int p0,String p1,b p2){
       if (PatchProxy.isSupport(IMRTCCenter$b.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, IMRTCCenter$b.class, "1")) {
          return;
       }
       this.a.onCallStateEventChange(p0, p1, p2);
       return;
    }
}
