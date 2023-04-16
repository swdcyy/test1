package com.kuaishou.live.common.core.component.gift.gift.l;
import im8.g;
import k51.c;
import java.util.ArrayList;
import com.kuaishou.live.common.core.component.gift.gift.l$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import p91.m;
import brd.t;
import ry1.b;
import com.kuaishou.live.common.core.component.gift.gift.j;
import erd.r;
import ik1.u;
import erd.g;
import crd.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.feature.api.live.base.service.scenetype.LiveSceneType;
import ry1.a;
import lp3.c;
import lp3.e;
import com.kuaishou.live.common.core.component.gift.gift.k;
import ik1.v;
import java.lang.StringBuilder;
import java.util.Iterator;
import java.util.List;
import com.kuaishou.live.common.core.component.gift.gift.l$b;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Throwable;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.gift.n;
import java.util.Map;
import java.util.HashMap;

public class l extends c implements g	// class@0012ad
{
    public int p;
    public boolean q;
    public final List r;
    public m s;
    public b t;
    public e u;
    public l$c v;
    public static String sLivePresenterClassName = "LiveGiftFeedLogPresenter";

    public void l(){
       super();
       this.p = 100;
       this.r = new ArrayList();
       this.v = new l$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       if (!this.s.e()) {
          l tt = this.t;
          if (tt != null) {
             this.X7(tt.W().filter(j.b).subscribe(new u(this)));
          }
       }
       if (this.s.u5() == LiveSceneType.Anchor) {
          this.X7(this.u.a(a.class).F3().filter(k.b).subscribe(new v(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       this.P8();
       this.q = false;
       return;
    }
    public final void P8(){
       String str = "\n";
       if (PatchProxy.applyVoid(null, this, l.class, "6")) {
          return;
       }
       try{
          StringBuilder str1 = "logGiftFeed:"+str;
          Iterator iterator = this.r.iterator();
          while (iterator.hasNext()) {
             str1 = str1+iterator.next().toString()+str;
          }
          b.Z(LiveLogTag.GIFT, str1);
       }catch(java.lang.Exception e0){
          b.I(LiveLogTag.GIFT, "logGiftFeedError", e0);
       }
       this.r.clear();
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, l.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new n();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, l.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(l.class, new n());
       }else {
          obj.put(l.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_BASIC_CONTEXT");
       this.t = this.t8("LIVE_AUDIENCE_STATUS_OBTAIN_SERVICE");
       this.u = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
