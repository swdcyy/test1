package com.kuaishou.live.core.show.redpacket.newpendant.a;
import im8.g;
import k51.c;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.String;
import java.util.List;
import pp.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import com.kuaishou.live.core.show.redpacket.newpendant.a$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Map;
import java.util.Set;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import com.kuaishou.live.core.show.redpacket.newpendant.LiveRedPacketPendantContainerView;
import com.kwai.robust.PatchProxyResult;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import dh2.a;
import z1.a;
import java.lang.Boolean;
import java.util.Collection;
import ekd.q;
import com.kuaishou.android.live.log.b;
import ng2.r;
import java.util.Iterator;
import zw1.a;
import android.view.View;
import java.util.Collections;
import dh2.e;
import java.lang.Integer;
import zw1.b;
import xw1.a;
import java.lang.Long;
import java.lang.Iterable;
import qk.m;
import dh2.b;
import ok.o;
import com.google.common.base.Optional;
import dh2.h;
import lp3.i;

public class a extends c implements g	// class@000eeb
{
    public boolean p;
    public boolean q;
    public final List r;
    public Map s;
    public Set t;
    public m u;
    public LiveRedPacketPendantContainerView v;
    public i w;
    public LiveTopPendantTempPlayService x;
    public long y;
    public s z;
    public static final List A;
    public static String sLivePresenterClassName;

    static {
       a.A = LiveLogTag.LIVE_LEEE.appendTag("LiveRedPacketNewPendantPresenter");
    }
    public void a(){
       super();
       this.r = new ArrayList();
       this.s = new HashMap();
       this.t = new HashSet();
       this.z = new a$a(this);
    }
    public void E8(){
       this.q = true;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "2")) {
          return;
       }
       this.q = false;
       this.r.clear();
       this.s.clear();
       this.t.clear();
       a tu = this.u;
       if (tu != null) {
          this.x.c(tu);
          this.u = null;
       }
       this.y = 0;
       return;
    }
    public LiveRedPacketPendantContainerView P8(){
       LiveRedPacketPendantContainerView obj = PatchProxy.apply(null, this, a.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.v == null) {
          obj = new LiveRedPacketPendantContainerView(this.getContext());
          this.v = obj;
          obj.setLiveTopPendantEnterAnimationService(new a(this));
          this.v.setShouldDisableEnterAnimation(this.p);
       }
       return this.v;
    }
    public final void R8(boolean p0){
       Iterator tag;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "9")) {
          return;
       }
       m om = null;
       if (q.f(this.r)) {
          this.P8().h(this.r, p0);
          a tu = this.u;
          if (tu != null) {
             this.x.c(tu);
          }
          this.u = om;
          b.P(a.A, "mRedPacketPendantList is empty");
       }else if(PatchProxy.applyVoid(om, this, uoa, "14") || q.f(this.r)){
          a tr = this.r;
          r or = tr.get((tr.size() - 1));
          Iterator iterator = this.t.iterator();
          while (iterator.hasNext()) {
             a uoa1 = iterator.next();
             m om1 = (or == null)? om: or.f();
             int i = this.r.size() - 1;
             uoa1.a(om1, i);
          }
       }
       Collections.sort(this.r);
       if (!PatchProxy.applyVoid(om, this, uoa, "11") && this.u == null) {
          e uoe = new e(this);
          this.u = uoe;
          this.x.b(uoe);
       }
       b.T(a.A, "notifyDataSetChangedAfterSort", "redPacketCount", Integer.valueOf(this.r.size()), "redPacketPendantList", this.r);
       this.P8().h(this.r, p0);
       if (!PatchProxy.applyVoid(om, this, uoa, "13")) {
          tag = this.s.values().iterator();
          while (tag.hasNext()) {
             tag.next().a();
          }
       }
       if (!PatchProxy.applyVoid(om, this, uoa, "10")) {
          View topView = this.P8().getTopView();
          if (topView != null && this.y - (long)topView.hashCode()) {
             this.y = (long)topView.hashCode();
             tag = topView.getTag(R.id.live_red_packet_pendant_view_tag);
             if (tag instanceof a) {
                tag.onShow();
             }
          }
       }
       return;
    }
    public void S8(View p0,long p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Long.valueOf(p1), Integer.valueOf(p2), this, a.class, "4")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       r or = m.s(this.r).r(new b(p0)).orNull();
       boolean b = false;
       if (or != null) {
          or.h(p1);
          or.d = p2;
       }else {
          this.r.add(new r(p0, p1, p2));
          b = true;
       }
       this.R8(b);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new h());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.x = this.q8(LiveTopPendantTempPlayService.class);
       this.w = this.r8("LIVE_SERVICE_MANAGER");
       return;
    }
}
