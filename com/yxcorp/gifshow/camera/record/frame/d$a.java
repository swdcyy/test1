package com.yxcorp.gifshow.camera.record.frame.d$a;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.yxcorp.gifshow.camera.record.frame.d;
import com.yxcorp.gifshow.bubble.PostBubbleManager$c;
import com.yxcorp.gifshow.bubble.a;
import java.lang.Object;
import com.kwai.library.widget.popup.common.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import kd9.c0;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import kd9.u;
import com.yxcorp.gifshow.camera.record.base.b;
import oc9.w;
import com.yxcorp.gifshow.camera.bubble.c;
import com.yxcorp.gifshow.camera.bubble.RecordBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.camera.record.frame.e;
import o07.o;

public class d$a implements PopupInterface$h	// class@000ddf
{
    public final PostBubbleManager$c b;
    public final a c;
    public final d d;

    public void d$a(d p0,PostBubbleManager$c p1,a p2){
       this.d = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void B(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FrameGuideController", "FrameGuideDialog show", objArray);
       d$a tb = this.b;
       if (tb != null) {
          tb.b(this.c, p0);
       }
       d e = this.d.b.e;
       if (e != null && !PatchProxy.applyVoidOneRefs(e, null, c0.class, "2")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FRAME_STYLE_POPUP";
          u1.C0("", e, 4, uElementPack, null);
       }
       return;
    }
    public void H(c p0,int p1){
       d e;
       d$a uoa = d$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("FrameGuideController", "FrameGuideDialog dismiss", objArray);
       uoa = this.b;
       if (uoa != null) {
          uoa.a(this.c, p0, p1);
       }
       if (p1 == 2) {
          e = this.d.b.e;
          if (e != null) {
             c0.a(e, "outside_to_close");
             if (PostExperimentUtils.h1()) {
                this.d.b.d.m(new u());
             }
          }
       }
       this.d.b.d.b().V7().u(RecordBubbleItem.FRAME_GUIDE);
       e.o = null;
       return;
    }
    public void J(c p0){
       o.a(this, p0);
    }
    public void S(c p0,int p1){
       o.c(this, p0, p1);
    }
    public void W(c p0){
       o.f(this, p0);
    }
    public void p(c p0){
       o.d(this, p0);
    }
}
