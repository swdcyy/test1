package com.kuaishou.live.lite.recommendsidebar.panel.l;
import k51.c;
import com.kuaishou.live.lite.recommendsidebar.panel.l$a;
import com.kuaishou.live.lite.recommendsidebar.panel.l$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import androidx.recyclerview.widget.RecyclerView$r;
import y8c.g;
import androidx.recyclerview.widget.RecyclerView$i;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import qvb.i;
import java.util.List;
import java.util.Collection;
import ekd.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.Math;
import g9c.d;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.live.lite.recommendsidebar.panel.LiveLiteRecommendPanelFragment;
import com.kuaishou.live.lite.recommendsidebar.panel.j;
import yc3.x;
import xc3.a;
import wkd.b;
import com.yxcorp.gifshow.log.g;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ExpTagTransList;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import yc3.r;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kp.r1;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import k2b.u1;
import com.yxcorp.gifshow.log.d0;
import com.yxcorp.gifshow.log.c0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class l extends c	// class@000b03
{
    public LiveLiteRecommendPanelFragment p;
    public int q;
    public final RecyclerView$r r;
    public final RecyclerView$i s;

    public void l(){
       super();
       this.q = -1;
       this.r = new l$a(this);
       this.s = new l$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, l.class, "2")) {
          return;
       }
       if (this.p.h0() != null) {
          this.p.h0().addOnScrollListener(this.r);
       }
       if (this.p.g7() != null) {
          this.p.g7().F0(this.s);
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, l.class, "3")) {
          return;
       }
       if (this.p.h0() != null) {
          this.p.h0().removeOnScrollListener(this.r);
       }
       if (this.p.g7() != null) {
          this.p.g7().I0(this.s);
       }
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, l.class, "4")) {
          return;
       }
       if (this.p.g7() == null || (this.p.h0() == null || (this.p.h0().getLayoutManager() == null || (this.p.q() != null && !q.f(this.p.q().getItems()))))) {
          LinearLayoutManager layoutManage = this.p.h0().getLayoutManager();
          int i = layoutManage.i0();
          l tq = this.q;
          this.q = (tq != -1)? Math.min(tq, i): i;
          int i1 = layoutManage.c();
          int i2 = this.p.ia().b1();
          l tq1 = this.q;
          while (tq1 <= i1) {
             int i3 = tq1 - i2;
             if (i3 >= 0 && i3 < this.p.q().getItems().size()) {
                QPhoto item = this.p.q().getItem(i3);
                if (!item.isShowed()) {
                   item.setShowed(true);
                   String str = a.a(x.a(this.p.I, i3));
                   ClientEvent$ExpTagTransList uExpTagTrans = b.a(0xe0ff4fb).c(this.p);
                   LiveStreamFeed entity = item.getEntity();
                   if (!PatchProxy.applyVoidThreeRefs(entity, uExpTagTrans, str, null, r.class, "1")) {
                      ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                      uElementPack.action2 = "LIVE_CARD_SHOW";
                      JsonObject jsonObject = new JsonObject();
                      jsonObject.c0("biz_type", str);
                      uElementPack.params = jsonObject.toString();
                      ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                      uContentPack.liveStreamPackage = r.a(entity, r1.y1(entity));
                      u1.C0("", null, 9, uElementPack, uContentPack);
                      if (!PatchProxy.applyVoidTwoRefs(entity, uExpTagTrans, null, r.class, "5")) {
                         d0 uod0 = d0.i(entity, entity.getId(), r1.y1(entity), 4, "FEATURED_PAGE", uExpTagTrans);
                         uod0.j = 3;
                         c0.q().n(uod0);
                      }
                   }
                }
             }
             tq1 = tq1 + 1;
          }
          this.q = i;
       }
    label_0128 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, l.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
