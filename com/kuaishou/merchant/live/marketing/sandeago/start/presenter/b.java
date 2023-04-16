package com.kuaishou.merchant.live.marketing.sandeago.start.presenter.b;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import q64.c;
import erd.g;
import crd.b;
import brd.t;
import ekd.m1;
import android.widget.TextView;
import com.kuaishou.merchant.live.marketing.sandeago.start.presenter.b$a;
import com.yxcorp.gifshow.widget.m;
import io.reactivex.subjects.PublishSubject;
import com.kuaishou.merchant.live.marketing.sandeago.start.LiveAnchorStartSandeagoFragment;
import com.kuaishou.merchant.live.marketing.sandeago.SandeagoPublish;
import n64.i;

public class b extends PresenterV2	// class@001a72
{
    public PublishSubject p;
    public LiveAnchorStartSandeagoFragment q;
    public SandeagoPublish r;
    public i s;
    public View t;
    public View u;
    public TextView v;

    public void b(){
       super();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.t.setVisibility(8);
       this.u.setVisibility(8);
       this.X7(this.p.subscribe(new c(this)));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a429a);
       this.u = m1.f(p0, 0x7f0a428c);
       this.v = m1.f(p0, 0x7f0a4285);
       m1.b(p0, new b$a(this), R.id.tv_start_sandeago_shot_retry);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.r8("SANDEAGO_AUDIT_FAIL_SUBJECT");
       this.q = this.r8("SANDEABIZ_START_FRAGMENT");
       this.r = this.r8("SANDEABIZ_PUBLISH");
       this.s = this.r8("SANDEABIZ_START_DELEGATE");
       return;
    }
}
