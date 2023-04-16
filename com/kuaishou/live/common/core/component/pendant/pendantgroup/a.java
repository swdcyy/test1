package com.kuaishou.live.common.core.component.pendant.pendantgroup.a;
import com.kuaishou.live.common.core.component.pendant.pendantgroup.g;
import p91.m;
import cw1.d0;
import cw1.b;
import cw1.a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aq5.d;
import fq5.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AnchorBizRelation;
import aq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import ty1.c;
import ty1.b;
import cw1.l0;
import java.util.Iterator;
import java.util.List;
import com.kwai.feature.api.live.base.service.pendant.pendantgroup.LivePendantContainerScene;

public class a extends g	// class@001714
{
    public final m i;
    public final b j;
    public final b k;

    public void a(m p0,d0 p1){
       super(p1);
       this.j = new b(this);
       this.k = new a(this);
       this.i = p0;
    }
    public void A(){
       if (PatchProxy.applyVoid(null, this, a.class, "10")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.LIVE_MULTI_PK};
       this.i.A0().G5(this.g, uoaArray);
       return;
    }
    public void B(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       a[] uoaArray = new a[]{AudienceBizRelation.PK};
       this.i.A0().G5(this.c, uoaArray);
       return;
    }
    public void C(){
    }
    public void E(){
       if (PatchProxy.applyVoid(null, this, a.class, "16")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.RECRUIT_EXPLAIN_PANEL};
       this.i.A0().G5(this.d, uoaArray);
       return;
    }
    public void F(){
    }
    public void G(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       if (this.i.w() == null) {
          return;
       }
       this.i.w().a(this.h);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, a.class, "13")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.MERCHANT_AUCTION_BUBBLE};
       this.i.A0().u5(this.k, uoaArray);
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.CHAT_CENTER_VIEW,AnchorBizRelation.CHAT_BETWEEN_ANCHORS,AnchorBizRelation.CHAT_WITH_GUEST};
       this.i.A0().u5(this.j, uoaArray);
       return;
    }
    public void j(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.LIVE_LINE};
       this.i.A0().u5(this.e, uoaArray);
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "4")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.LIVE_MULTI_LINE};
       this.i.A0().u5(this.f, uoaArray);
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.LIVE_MULTI_PK};
       this.i.A0().u5(this.g, uoaArray);
       return;
    }
    public void m(){
    }
    public void n(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.PK};
       this.i.A0().u5(this.c, uoaArray);
       return;
    }
    public void o(){
    }
    public void q(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.RECRUIT_EXPLAIN_PANEL};
       this.i.A0().u5(this.d, uoaArray);
       return;
    }
    public void r(){
    }
    public void s(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       if (this.i.w() == null) {
          Iterator iterator = l0.a.iterator();
          while (iterator.hasNext()) {
             this.a.remove(iterator.next());
          }
          return;
       }else {
          this.i.w().b(this.h);
          return;
       }
    }
    public void u(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.MERCHANT_AUCTION_BUBBLE};
       this.i.A0().G5(this.k, uoaArray);
       return;
    }
    public void v(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.CHAT_BETWEEN_ANCHORS,AnchorBizRelation.CHAT_WITH_GUEST};
       this.i.A0().G5(this.j, uoaArray);
       return;
    }
    public void y(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.LIVE_LINE};
       this.i.A0().G5(this.e, uoaArray);
       return;
    }
    public void z(){
       if (PatchProxy.applyVoid(null, this, a.class, "9")) {
          return;
       }
       a[] uoaArray = new a[]{AnchorBizRelation.LIVE_MULTI_LINE};
       this.i.A0().G5(this.f, uoaArray);
       return;
    }
}
