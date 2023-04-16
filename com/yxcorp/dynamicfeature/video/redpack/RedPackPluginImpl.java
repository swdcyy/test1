package com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl;
import l9c.a;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$a;
import nsd.u;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import mxc.a;
import com.kwai.sharelib.model.QrCodeResponse;
import java.lang.String;
import com.kwai.framework.model.user.User;
import erd.o;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import com.yxcorp.dynamicfeature.video.redpack.RedPackPluginImpl$c;

public class RedPackPluginImpl implements a	// class@0011d7
{
    public static final p b;
    public static final RedPackPluginImpl$a c;

    static {
       RedPackPluginImpl.c = new RedPackPluginImpl$a(null);
       RedPackPluginImpl.b = s.c(RedPackPluginImpl$Companion$TEMP_OUTPUT_FOLDER$2.INSTANCE);
    }
    public void RedPackPluginImpl(){
       super();
    }
    public boolean isAvailable(){
       return true;
    }
    public o sh(a p0,QrCodeResponse p1,String p2,User p3,boolean p4){
       Object obj;
       RedPackPluginImpl redPackPlugi = RedPackPluginImpl.class;
       if (PatchProxy.isSupport(redPackPlugi)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Boolean.valueOf(p4)};
          obj = PatchProxy.apply(objArray, this, redPackPlugi, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       a.p(p0, "callback");
       a.p(p1, "qrCodeResponse");
       a.p(p2, "videoPath");
       a.p(p3, "user");
       RedPackPluginImpl$c uoc = new RedPackPluginImpl$c(this, p2, p1, p4, p3, p0);
       return obj;
    }
}
