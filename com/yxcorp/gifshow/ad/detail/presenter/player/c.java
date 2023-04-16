package com.yxcorp.gifshow.ad.detail.presenter.player.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.detail.presenter.player.c$a;
import tc6.a;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import brd.t;
import d19.c;
import erd.g;
import crd.b;
import android.view.View;
import ekd.m1;
import com.kwai.framework.player.ui.impl.KwaiContentFrame;
import de5.a;
import io.reactivex.subjects.PublishSubject;
import sc6.c;

public class c extends PresenterV2	// class@001677
{
    public KwaiContentFrame p;
    public a q;
    public PublishSubject r;
    public c s;
    public boolean t;
    public b u;

    public void c(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       this.t = false;
       this.s.e(new c$a(this));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, c.class, "3")) {
          return;
       }
       this.u = this.getActivity().m().subscribe(new c(this));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, c.class, "5")) {
          return;
       }
       c tu = this.u;
       if (tu != null) {
          tu.dispose();
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a3120);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.q8(a.class);
       this.r = this.r8("DETAIL_POSTER_EVENT");
       this.s = this.r8("DETAIL_SURFACE_LISTENERS");
       return;
    }
}
