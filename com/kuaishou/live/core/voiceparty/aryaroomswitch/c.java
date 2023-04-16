package com.kuaishou.live.core.voiceparty.aryaroomswitch.c;
import im8.g;
import k51.c;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.aryaroomswitch.VoicePartyAryaRoomSwitchController;
import com.kuaishou.live.core.voiceparty.a;
import com.kwai.robust.PatchProxyResult;
import fo2.g;
import java.util.Map;
import java.util.HashMap;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class c extends c implements g	// class@001336
{
    public a p;
    public VoicePartyAryaRoomSwitchController q;
    public final d r;
    public static String sLivePresenterClassName = "VoicePartyAudienceAryaRoomSwitchPresenter";

    public void c(){
       super();
       this.r = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       this.q = new VoicePartyAryaRoomSwitchController(this.p);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.q.d();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new g();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new g());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       return;
    }
}
