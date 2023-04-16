package com.kwai.live.gzone.accompanyplay.anchor.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.live.gzone.accompanyplay.anchor.t$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import k37.p1;
import mq5.h;
import mq5.b;
import android.widget.PopupWindow;
import ekd.m1;
import h37.t;
import android.view.View$OnClickListener;
import h37.u;
import com.kwai.live.gzone.accompanyplay.model.LiveGzoneAccompanyFleetInfo;
import mrd.a;

public class t extends PresenterV2	// class@000b38
{
    public x p;
    public View q;
    public LiveGzoneAccompanyFleetInfo r;
    public String s;
    public a t;
    public String u;
    public p1 v;
    public h w;

    public void t(){
       super();
       this.w = new t$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, t.class, "3")) {
          return;
       }
       if (this.r == null) {
          this.q.setVisibility(8);
       }else {
          this.q.setVisibility(0);
       }
       this.v.e.Km(this.w);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, t.class, "6")) {
          return;
       }
       t tp = this.p;
       if (tp != null) {
          tp.dismiss();
       }
       this.v.e.le(this.w);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, t.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a006a);
       m1.a(p0, new t(this), R.id.accompany_fleet_more_iv);
       m1.a(p0, new u(this), R.id.accompany_fleet_rule_iv);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, t.class, "1")) {
          return;
       }
       this.r = this.s8(LiveGzoneAccompanyFleetInfo.class);
       this.s = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_ID");
       this.t = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_ENTRANCE_STATE_SUBJECT");
       this.u = this.t8("LIVE_GZONE_ANCHOR_ACCOMPANY_LIVE_STREAM_ID");
       this.v = this.q8(p1.class);
       return;
    }
}
