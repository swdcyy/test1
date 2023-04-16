package com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelVC;
import com.kuaishou.live.viewcontroller.ViewController;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig;
import ih1.f;
import z1.k;
import java.lang.String;
import java.util.Map;
import java.lang.Object;
import kotlin.jvm.internal.a;
import wl1.j;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelVC$tabListModel$1;
import msd.a;
import wl1.h;
import ah1.c;
import nsd.u;
import com.kuaishou.live.common.core.component.gift.giftpanel.LiveGiftPanelEventHub;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftPanelConfig;
import java.util.List;
import androidx.lifecycle.LifecycleOwner;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.giftpanel.tablist.LiveGiftPanelTabListVC;
import com.kuaishou.live.common.core.component.gift.giftpanel.pagerlist.LiveGiftPanelPagerListVC;
import com.kuaishou.live.common.core.component.gift.giftpanel.model.SelectGiftModelWrapper;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.config.LiveGiftBoxConfig$ScrollMode;
import wl1.c;
import ul1.a;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.common.core.component.gift.base.model.Model;
import ul1.d;
import ch1.d;
import java.lang.CharSequence;
import wl1.g;
import java.lang.Boolean;
import lnc.l1;
import tl1.a;
import xg1.a;

public final class LiveGiftPanelVC extends ViewController	// class@0012cf
{
    public final j j;
    public final h k;
    public final c l;
    public final c m;
    public final c n;
    public final c o;
    public final LiveGiftPanelEventHub p;
    public ViewController q;
    public ViewController r;
    public final LiveGiftBoxConfig s;
    public final f t;
    public final k u;
    public final String v;
    public final int w;

    public void LiveGiftPanelVC(LiveGiftBoxConfig p0,f p1,k p2,k p3,k p4,String p5,int p6,Map p7){
       int i = this;
       Object obj = p1;
       j obj1 = p4;
       Object obj2 = p5;
       a.p(p0, "giftBoxConfig");
       a.p(obj, "giftBoxRepo");
       a.p(p2, "liveStreamId");
       a.p(p3, "giftApiRequestPathSuffix");
       a.p(obj1, "currentUser");
       a.p(obj2, "defaultSelectTabId");
       super();
       i.s = p0;
       i.t = obj;
       i.u = obj1;
       i.v = obj2;
       i.w = p6;
       obj1 = new j(p0, obj, p2, p3, p7, new LiveGiftPanelVC$tabListModel$1(this));
       i.j = v9;
       h oh = new h();
       i.k = oh;
       c uoc = new c("showTabModel", null, 0, 0, 14, 0);
       i.l = obj2;
       uoc = new c("showGiftModel", null, 0, 0, 14, 0);
       i.m = obj;
       uoc = new c("showPagerItemModel", null, 0, 0, 14, 0);
       i.n = v4;
       uoc = new c("refreshTrigger", 0, 0, 1, 6, 0);
       i.o = v5;
       LiveGiftPanelEventHub liveGiftPane = new LiveGiftPanelEventHub(this, p0.c().g(), v9, oh, obj2, obj, v4);
       i.p = v5;
    }
    public void F2(){
       LiveGiftPanelVC liveGiftPane = LiveGiftPanelVC.class;
       if (PatchProxy.applyVoid(null, this, liveGiftPane, "1")) {
          return;
       }
       this.Q2(R.layout.arg_RES_7f0d0b24);
       LiveGiftPanelConfig liveGiftPane1 = this.s.c();
       if (!PatchProxy.applyVoidOneRefs(liveGiftPane1, this, liveGiftPane, "9")) {
          LiveGiftPanelTabListVC liveGiftPane2 = new LiveGiftPanelTabListVC(liveGiftPane1, this.j, this.k, this.l);
          this.q = liveGiftPane2;
          this.x2(R.id.fl_tab_container, liveGiftPane2);
          LiveGiftPanelVC tj = this.j;
          LiveGiftPanelPagerListVC liveGiftPane3 = new LiveGiftPanelPagerListVC(liveGiftPane1, tj, this.k, tj.h(), this.j.k, this.m, this.n, this.o, this.v, this.w, this.u, this.s.d(this.X2()));
          this.r = liveGiftPane2;
          this.x2(R.id.fl_pager_container, liveGiftPane2);
       }
       return;
    }
    public final a V2(){
       String str;
       Object[] objArray = null;
       d obj = PatchProxy.apply(objArray, this, LiveGiftPanelVC.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.k.a();
       if (obj != null) {
          obj = obj.b();
          if (obj != null) {
             str = obj.a();
          label_0026 :
             LiveGiftPanelVC liveGiftPane = (str == null || !str.length())? 1: null;
             if (liveGiftPane) {
                return objArray;
             }else {
                g og = this.j.g(str);
                if (og != null) {
                   objArray = og.a();
                }
                return objArray;
             }
          }
       }
       str = objArray;
       goto label_0026 ;
    }
    public final d W2(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelVC.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.k.a();
    }
    public final boolean X2(){
       Object obj = PatchProxy.apply(null, this, LiveGiftPanelVC.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return l1.a();
    }
    public final void Y2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelVC.class, "2")) {
          return;
       }
       a.p(p0, "listener");
       this.p.b(p0);
       return;
    }
    public final void Z2(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveGiftPanelVC.class, "3")) {
          return;
       }
       a.p(p0, "listener");
       this.p.c(p0);
       return;
    }
}
