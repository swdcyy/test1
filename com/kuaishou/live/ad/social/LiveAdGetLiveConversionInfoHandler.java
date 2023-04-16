package com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler;
import zl9.b;
import com.kuaishou.live.ad.social.t;
import java.lang.Object;
import java.lang.String;
import zl9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler$UserData;
import com.kwai.framework.model.user.QCurrentUser;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler$ConversionTask;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler$LiveInfo;
import com.kuaishou.live.ad.social.LiveAdGetLiveConversionInfoHandler$a;
import zl9.a;

public class LiveAdGetLiveConversionInfoHandler implements b	// class@000a03
{
    public final t a;

    public void LiveAdGetLiveConversionInfoHandler(t p0){
       super();
       this.a = p0;
    }
    public void e(String p0,e p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAdGetLiveConversionInfoHandler.class, "1")) {
          return;
       }
       LiveAdGetLiveConversionInfoHandler ta = this.a;
       LiveAdGetLiveConversionInfoHandler$ConversionTask uConversionT = new LiveAdGetLiveConversionInfoHandler$ConversionTask(ta.a, ta.e, ta.f);
       LiveAdGetLiveConversionInfoHandler$a uoa = new LiveAdGetLiveConversionInfoHandler$a(new LiveAdGetLiveConversionInfoHandler$UserData(QCurrentUser.ME.getId()), QCurrentUser.ME.getId(), new LiveAdGetLiveConversionInfoHandler$LiveInfo(ta.c, ta.d), ta.b, ta.g);
       p1.onSuccess(v6);
       return;
    }
    public Object f(String p0,Class p1,e p2){
       return a.b(this, p0, p1, p2);
    }
    public String getKey(){
       return "getLiveConversionInfo";
    }
    public void onDestroy(){
       a.a(this);
    }
}
