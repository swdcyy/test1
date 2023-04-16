package com.yxcorp.gifshow.homepage.presenter.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.feedstaggercard.model.CardStyle;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yta.e0;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import ekd.m1;
import android.view.ViewStub;
import com.kwai.framework.model.user.User;
import io.reactivex.subjects.PublishSubject;

public class h extends PresenterV2	// class@0017ca
{
    public ViewStub p;
    public User q;
    public PublishSubject r;
    public View s;
    public CardStyle t;

    public void h(CardStyle p0){
       super();
       this.t = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, h.class, "3")) {
          return;
       }
       this.P8();
       this.X7(this.r.subscribe(new e0(this)));
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       h ts = this.s;
       if (ts == null) {
          return;
       }
       ts.setVisibility(8);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "2")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a0f2c);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.q = this.q8(User.class);
       this.r = this.r8("FLOW_FEEDBACK");
       return;
    }
}
