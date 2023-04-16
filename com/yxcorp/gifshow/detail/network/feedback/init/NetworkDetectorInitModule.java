package com.yxcorp.gifshow.detail.network.feedback.init.NetworkDetectorInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.String;
import java.nio.charset.Charset;
import b76.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import o56.d;
import wkd.b;
import zb5.i;
import c2a.a;
import j85.e;

public class NetworkDetectorInitModule extends TTIInitModule	// class@0015c3
{
    public static final Charset q;

    static {
       NetworkDetectorInitModule.q = Charset.forName("UTF-8");
    }
    public void NetworkDetectorInitModule(){
       super();
    }
    public int f0(){
       return 5;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkDetectorInitModule.class, "1")) {
          return;
       }
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, NetworkDetectorInitModule.class, "2") && (d.i && !PatchProxy.applyVoid(objArray, this, NetworkDetectorInitModule.class, "3"))) {
          String[] stringArray = new String[]{"Push.Network.Detector"};
          b.a(-1989170423).e(new a(this), stringArray);
       }
    label_003e :
       return;
    }
}
