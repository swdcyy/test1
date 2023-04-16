package com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.a;
import im8.g;
import k51.c;
import p01.q;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.a$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView$b;
import com.kuaishou.live.common.core.component.gift.DrawingGiftEditView;
import mk1.h;
import androidx.fragment.app.Fragment;
import android.view.View;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.LiveAudienceDrawingGiftBoxFragment$a;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.presenter.drawing.LiveAudienceDrawingGiftBoxFragment;
import com.kwai.robust.PatchProxyResult;
import ekd.m1;
import com.kuaishou.live.audience.component.gift.gift.audience.v2.widget.LiveAudienceGiftBoxView;
import com.kuaishou.live.common.core.component.gift.domain.giftbox.view.LiveGiftBoxPopupView;
import pz0.f;
import java.util.Map;
import java.util.HashMap;
import mk1.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import t02.a0;

public class a extends c implements g	// class@000b38
{
    public a p;
    public h q;
    public a0 r;
    public q s;
    public DrawingGiftEditView t;
    public View u;
    public LiveGiftBoxPopupView v;
    public LiveAudienceDrawingGiftBoxFragment w;
    public LiveAudienceGiftBoxView x;
    public final DrawingGiftEditView$b y;
    public final b z;
    public static String sLivePresenterClassName = "LiveAudienceDrawingGiftBoxPresenter";

    public void a(q p0){
       super();
       this.y = new a$a(this);
       this.z = new a$b(this);
       this.s = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.t.a(this.y);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       this.q.L = false;
       this.t.h(this.y);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       if (this.q.m.isDetached()) {
          return;
       }
       if (this.w == null) {
          return;
       }
       this.u.setVisibility(8);
       this.q.m.getChildFragmentManager().beginTransaction().u(this.w).m();
       this.w = null;
       return;
    }
    public void R8(LiveAudienceDrawingGiftBoxFragment$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
          return;
       }
       if (this.q.m.isDetached()) {
          return;
       }
       a tw = this.w;
       if (tw != null && tw.isAdded()) {
          return;
       }
       this.u.setVisibility(0);
       tw = this.q;
       a tr = this.r;
       a ts = this.s;
       LiveAudienceDrawingGiftBoxFragment liveAudience = PatchProxy.applyFourRefs(tw, tr, ts, p0, null, LiveAudienceDrawingGiftBoxFragment.class, "1");
       if (liveAudience != PatchProxyResult.class) {
       }else {
          liveAudience = new LiveAudienceDrawingGiftBoxFragment();
          liveAudience.j = tw;
          liveAudience.k = tr;
          liveAudience.n = ts;
          liveAudience.m = p0;
       }
       this.w = liveAudience;
       e uoe = this.q.m.getChildFragmentManager().beginTransaction();
       uoe.f(R.id.drawing_gift_box_container_fragment_layout, this.w);
       uoe.m();
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a0c4a);
       this.u = m1.f(p0, 0x7f0a0c46);
       this.x = m1.f(p0, 0x7f0a10a2);
       this.v = m1.f(p0, 0x7f0a109c);
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new f();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new f());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a.class);
       this.q = this.q8(h.class);
       this.r = this.q8(a0.class);
       return;
    }
}
