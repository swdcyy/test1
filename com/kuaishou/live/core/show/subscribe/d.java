package com.kuaishou.live.core.show.subscribe.d;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.subscribe.d$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.k1;
import com.kwai.robust.PatchProxyResult;
import ok2.n;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import vq5.d;
import lp3.i;

public class d extends c implements g	// class@0010d9
{
    public LiveStreamFeedWrapper p;
    public d q;
    public i r;
    public d$b s;
    public static String sLivePresenterClassName = "LiveToSubscribePresenter";

    public void d(){
       super();
       this.s = new d$a(this);
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       k1.n(this);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(d.class, new n());
       }else {
          obj.put(d.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.t8("LIVE_PHOTO");
       this.q = this.r8("LIVE_ROUTER_SERVICE");
       this.r = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
