package com.yxcorp.gifshow.detail.fragments.milano.profile.h;
import z0a.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bf5.q;
import z0a.q;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import z0a.r;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import android.content.Context;
import o56.f;
import le5.f;
import lnc.a1;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Integer;
import brd.y;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import c95.c;

public class h extends t	// class@00154e
{
    public y w;
    public View x;

    public void h(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       super.E8();
       g e = Functions.e;
       this.X7(this.u.r.subscribe(new q(this), e));
       this.X7(this.u.o.subscribe(new r(this), e));
       return;
    }
    public void P8(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "4")) {
          return;
       }
       ViewStub viewStub = m1.f(p0, R.id.slide_profile_feed_layout_stub);
       viewStub.setLayoutResource(R.layout.arg_RES_7f0d153c);
       this.v = viewStub.inflate();
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       float f = 0;
       if (!f.b(this.getContext()) || !f.b()) {
          t tu = this.u;
          if (tu.b != null && tu.a != null) {
             tu = this.u;
             float f1 = ((float)tu.d * 0x3f800000) / (float)tu.b;
             f = (float)tu.c - ((float)(tu.a - a1.d(0x7f070bf1)) * f1);
             StringBuilder str = "wScale "+f1;
             Object[] objArray = new Object[0];
             o.C().w("MilanoProfileFeedOptPresenter", str+", minBlackHeight "+f, objArray);
          }
       }
       this.w.onNext(Integer.valueOf((int)f));
       ViewGroup$MarginLayoutParams layoutParams = this.x.getLayoutParams();
       t tu1 = this.u;
       layoutParams.height = (int)((float)tu1.c - f);
       layoutParams.topMargin = tu1.e;
       this.x.setLayoutParams(layoutParams);
       t tu2 = this.u;
       int i = (tu2.a - tu2.e) - this.x.getLayoutParams().height;
       tu2 = this.u;
       tu2.i = i;
       tu2.C.onNext(Integer.valueOf(i));
       View view = this.v.findViewById(R.id.global_mine_photos_wrapper);
       if (this.t.j != null) {
          view.setVisibility(8);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "1")) {
          return;
       }
       super.doBindView(p0);
       this.x = p0.findViewById(0x7f0a32c0);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       super.j8();
       this.w = this.r8("PROFILE_SIDE_BOTTOM_BLACK_HEIGHT_OBSERVER");
       return;
    }
}
