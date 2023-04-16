package com.yxcorp.gifshow.activity.share.presenter.r0;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import im8.f;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import f66.i;
import jq.a;
import q87.c;
import cx8.h;
import cx8.g;
import com.yxcorp.gifshow.activity.share.presenter.q0;
import erd.o;
import com.yxcorp.gifshow.activity.share.presenter.p0;
import t45.d;
import brd.z;
import zw8.o1;
import com.yxcorp.gifshow.activity.share.presenter.o0;
import erd.g;
import crd.b;

public class r0 extends PresenterV2	// class@001428
{
    public f p;
    public f q;

    public void r0(){
       super();
    }
    public void E8(){
       r0 or0 = r0.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, or0, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, or0, "3") && !this.q.get().booleanValue()) {
          t ot = PatchProxy.apply(objArray, objArray, or0, "4");
          if (ot != PatchProxyResult.class) {
          }else {
             objArray = new Object[0];
             a.b().w("FlowFeedbackPresenter", "getFlowFeedbackResult\(\) called", objArray);
             ot = g.a().a().map(q0.b).map(p0.b);
          }
          this.X7(ot.observeOn(d.a).subscribe(new o1(this), o0.b));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, r0.class, "1")) {
          return;
       }
       this.p = this.x8("PUBLISH_FLOW_FEEDBACK");
       this.q = this.x8("ALREADY_REQUESTED_FEEDBACK");
       return;
    }
}
