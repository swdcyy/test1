package com.kuaishou.live.core.show.redpacket.redpackrain2.notify.e;
import im8.g;
import k51.c;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.e$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import brd.t;
import ry1.b;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.a;
import com.kuaishou.live.core.show.redpacket.redpackrain2.notify.c;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import d61.y;
import lh2.i;
import com.kuaishou.live.core.show.redpacket.redpackrain2.game.d;
import com.kuaishou.live.core.show.redpacket.redpackrain2.snatch.a$b;
import qh2.c;
import java.util.Map;
import java.util.HashMap;

public class e extends c implements g	// class@000f13
{
    public a0 p;
    public i q;
    public e$b r;
    public d s;
    public a$b t;
    public long u;
    public LiveRedPackRainNotifyDialogFragment v;
    public static String sLivePresenterClassName = "LiveAudienceRedPackRainNotifyPresenter";

    public void e(){
       super();
       this.r = new e$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, e.class, "2")) {
          return;
       }
       this.X7(this.p.b3.T3().subscribe(new a(this), c.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, e.class, "5")) {
          return;
       }
       e tv = this.v;
       if (tv != null) {
          tv.dismissAllowingStateLoss();
          this.v = null;
       }
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, e.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (y.d(this.getActivity()) || (!this.q.a() && (this.s.c() || this.t.m0()))) {
          return false;
       }
       return true;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, e.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new c();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, e.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(e.class, new c());
       }else {
          obj.put(e.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, e.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.q = this.r8("LIVE_RED_PACK_RAIN_FORBIDDEN_SERVICE");
       this.s = this.r8("LIVE_RED_PACK_RAIN_GAME_SERVICE");
       this.t = this.r8("LIVE_RED_PACK_RAIN_SNATCH_DIALOG_SERVICE");
       return;
    }
}
