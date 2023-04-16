package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.j;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import q64.i;
import erd.g;
import crd.b;
import brd.t;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import n64.d0;
import io.reactivex.subjects.PublishSubject;

public class j extends PresenterV2	// class@001a7d
{
    public PublishSubject p;
    public TextView q;
    public View r;

    public void j(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, j.class, "3")) {
          return;
       }
       this.X7(this.p.subscribe(new i(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, j.class, "1")) {
          return;
       }
       this.r = m1.f(p0, 0x7f0a16f4);
       this.q = m1.f(p0, 0x7f0a428d);
       d0.a(m1.f(p0, R.id.tv_start_sandeago_delivery_title));
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "2")) {
          return;
       }
       this.p = this.r8("SANDEAGO_CATEGORY_CHANGED_SUBJECT");
       return;
    }
}
