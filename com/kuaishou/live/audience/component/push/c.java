package com.kuaishou.live.audience.component.push.c;
import im8.g;
import k51.c;
import com.kuaishou.live.audience.component.push.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.audience.component.push.b;
import java.lang.Runnable;
import e93.f;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.audience.component.push.e;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import sr5.a;

public class c extends c implements g	// class@000bce
{
    public File p;
    public c$b q;
    public a r;
    public static String sLivePresenterClassName = "LiveAudienceAutoPushDefaultCoverFilePresenter";

    public void c(){
       super();
       this.q = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       f.i("getDefaultCover", new b(this), this);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       f.g(this);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new e();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new e());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.r = this.r8("LIVE_PLAY_CALLER_CONTEXT");
       return;
    }
}
