package com.kuaishou.live.common.core.component.newpendant.top.activity.c;
import im8.g;
import a51.c;
import com.kuaishou.live.basic.tk.LiveTkItemManager;
import java.util.HashMap;
import com.kuaishou.live.common.core.component.newpendant.top.activity.c$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import com.kuaishou.android.live.log.LiveLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import android.view.ViewGroup;
import android.view.View;
import ks5.e;
import com.kuaishou.live.common.core.component.newpendant.top.activity.LiveTopActivityTkPendantContainer;
import android.view.ViewParent;
import android.widget.FrameLayout;
import z51.c;
import com.kwai.robust.PatchProxyResult;
import wu1.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lp3.e;

public class c extends c implements g	// class@0016bb
{
    public LiveTopPendantTempPlayService v;
    public e w;
    public final LiveTkItemManager x;
    public Map y;
    public g z;
    public static String sLivePresenterClassName = "LiveTopActivityTkPendantPresenter";

    public void c(){
       super();
       this.x = new LiveTkItemManager();
       this.y = new HashMap();
       this.z = new c$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       super.E8();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       super.J8();
       Iterator iterator = new HashSet(this.y.keySet()).iterator();
       while (iterator.hasNext()) {
          this.S8(iterator.next());
       }
       return;
    }
    public void S8(String p0){
       LiveTopActivityTkPendantContainer c;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "8")) {
          return;
       }
       b.S(LiveLogTag.LIVE_TOP_PENDANT.appendTag("LiveTopActivityTkPendantPresenter"), "removeTopActivityTkPendant", "id", p0);
       m om = this.y.get(p0);
       this.y.remove(p0);
       if (om != null) {
          this.v.c(om);
          ViewGroup viewGroup = null;
          LiveTopActivityTkPendantContainer liveTopActiv = om.b(viewGroup);
          if (liveTopActiv != null) {
             if (liveTopActiv.getParent() != null) {
                liveTopActiv.getParent().removeView(liveTopActiv);
             }
             if (!PatchProxy.applyVoid(viewGroup, liveTopActiv, LiveTopActivityTkPendantContainer.class, "2")) {
                c = liveTopActiv.c;
                if (c != null) {
                   c.b();
                }
                liveTopActiv.removeAllViews();
             }
          }
       }
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, c.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, c.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(c.class, new f());
       }else {
          obj.put(c.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.v = this.q8(LiveTopPendantTempPlayService.class);
       this.w = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
