package com.kwai.live.gzone.accompanyplay.anchor.m;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import com.kwai.live.gzone.accompanyplay.anchor.m$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.live.gzone.accompanyplay.anchor.o;
import java.util.Map;
import java.util.HashMap;
import g37.d;

public class m extends PresenterV2 implements g	// class@000b27
{
    public c p;
    public d q;
    public m$a r;

    public void m(){
       super();
       this.p = PublishSubject.g();
       this.r = new m$b(this);
    }
    public void E8(){
       PatchProxy.applyVoid(null, this, m.class, "2");
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new o();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, m.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(m.class, new o());
       }else {
          obj.put(m.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.q = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_SDK_SERVICE");
       return;
    }
}
