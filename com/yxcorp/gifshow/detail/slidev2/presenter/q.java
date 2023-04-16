package com.yxcorp.gifshow.detail.slidev2.presenter.q;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import b8a.d1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import r7a.g;
import r7a.g$c;
import android.content.Context;
import android.view.View;
import ekd.m1;
import java.util.List;

public class q extends PresenterV2	// class@0019d0
{
    public List p;
    public ScaleHelpView q;
    public g r;
    public final g$c s;

    public void q(){
       super();
       this.s = new d1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, q.class, "4")) {
          return;
       }
       this.r.f(this.q);
       this.r.a(this.s);
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, q.class, "3")) {
          return;
       }
       g og = new g(this.getContext());
       this.r = og;
       og.h(true);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, q.class, "5")) {
          return;
       }
       this.r.i(this.q);
       this.r.g(this.s);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, q.class, "2")) {
          return;
       }
       this.q = m1.f(p0, 0x7f0a2a96);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, q.class, "1")) {
          return;
       }
       this.p = this.r8("DETAIL_TAP_CLICK_ADAPTER");
       return;
    }
}
