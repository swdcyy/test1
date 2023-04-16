package com.kuaishou.live.audience.component.topbar.a;
import k51.c;
import g31.b;
import com.kuaishou.live.audience.component.topbar.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import t02.a0;
import xq5.c;
import com.kwai.feature.api.live.base.service.slideplay.LiveSlidePlayService;
import m91.b;
import aq5.a;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.b;
import android.widget.TextView;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import java.lang.System;
import ay1.a;
import hf3.a;
import com.kuaishou.livestream.message.nano.LiveBeautyMessages$SCLiveBeautyLabel;
import g31.a;
import lf3.g;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import android.view.View;
import ekd.m1;
import com.kuaishou.live.common.core.basic.widget.LiveUserView;
import com.smile.gifmaker.mvps.presenter.PresenterV2;

public class a extends c	// class@000be4
{
    public TextView p;
    public LiveUserView q;
    public int r;
    public long s;
    public a0 t;
    public final b u;
    public final c v;
    public static String sLivePresenterClassName = "LiveAudienceNaturalLookPresenter";

    public void a(){
       super();
       this.r = 0;
       this.u = new b(this);
       this.v = new a$a(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (this.t.h != null) {
          if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
             uoa = this.t;
             if (uoa.h != null) {
                uoa.y2.P4(this.v);
             }
          }
       }else {
          this.R8();
       }
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.t.N().u5(this.u, uoaArray);
       return;
    }
    public void J8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
          return;
       }
       if (this.t.h != null && !PatchProxy.applyVoid(objArray, this, uoa, "11")) {
          uoa = this.t;
          if (uoa.h != null) {
             uoa.y2.d5(this.v);
          }
       }
       a[] uoaArray = new a[]{AudienceBizRelation.VOICE_PARTY};
       this.t.N().G5(this.u, uoaArray);
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, a.class, "7")) {
          return;
       }
       int i = 8;
       if (this.p.getVisibility() == i) {
          return;
       }
       this.p.setVisibility(i);
       this.t.N().yj(AudienceBizRelation.NATURE_LOOK);
       a.a(this.t.Z2.a(), (System.currentTimeMillis() - this.s), this.r);
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "5")) {
          return;
       }
       this.r = 0;
       this.t.Z2.u().u0(747, LiveBeautyMessages$SCLiveBeautyLabel.class, new a(this));
       return;
    }
    public final boolean S8(int p0){
       int i = 1;
       if (p0 != i && p0 != 2) {
          i = false;
       }
       return i;
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, a.class, "8")) {
          return;
       }
       AudienceBizRelation nATURE_LOOK = AudienceBizRelation.NATURE_LOOK;
       if (this.t.N().ck(nATURE_LOOK) && this.S8(this.r)) {
          this.p.setVisibility(0);
          this.t.N().Pj(nATURE_LOOK);
          a.c(this.t.Z2.a(), this.r, this.t.c.mEntity);
          this.s = System.currentTimeMillis();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a189c);
       this.p = m1.f(p0, 0x7f0a21f8);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.t = this.q8(a0.class);
       return;
    }
}
