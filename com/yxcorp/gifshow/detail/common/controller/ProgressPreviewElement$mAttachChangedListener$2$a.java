package com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$mAttachChangedListener$2$a;
import qp7.y0;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement$mAttachChangedListener$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.detail.common.controller.ProgressPreviewElement;
import java.util.Objects;
import tkd.b;
import tkd.d;
import wjc.l;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import qp7.x0;
import qp7.b;
import iq7.j;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;
import pp7.b;

public final class ProgressPreviewElement$mAttachChangedListener$2$a extends y0	// class@0013bf
{
    public final ProgressPreviewElement$mAttachChangedListener$2 a;

    public void ProgressPreviewElement$mAttachChangedListener$2$a(ProgressPreviewElement$mAttachChangedListener$2 p0){
       this.a = p0;
       super();
    }
    public void e(boolean p0){
       ProgressPreviewElement$mAttachChangedListener$2$a omAttachChan = ProgressPreviewElement$mAttachChangedListener$2$a.class;
       if (PatchProxy.isSupport(omAttachChan) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omAttachChan, "2")) {
          return;
       }
       ProgressPreviewElement$mAttachChangedListener$2 this$0 = this.a.this$0;
       this$0.t = false;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(null, this$0, ProgressPreviewElement.class, "4")) {
          l ol = d.a(0x46ffacbc);
          ProgressPreviewElement z = this$0.z;
          if (z == null) {
             a.S("mPhoto");
          }
          ol.P5(z.getPhotoId());
          this$0.E().g(true);
          this$0.p0();
          Object[] objArray = new Object[false];
          o.C().w("ProgressPreviewElement", "tryHide onElementDetached "+this$0.s(), objArray);
          this$0.b0();
          this$0.x = false;
       }
       return;
    }
    public void f(boolean p0){
       ProgressPreviewElement$mAttachChangedListener$2$a omAttachChan = ProgressPreviewElement$mAttachChangedListener$2$a.class;
       if (PatchProxy.isSupport(omAttachChan) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, omAttachChan, "1")) {
          return;
       }
       ProgressPreviewElement$mAttachChangedListener$2 this$0 = this.a.this$0;
       this$0.t = true;
       boolean b = false;
       this$0.v = b;
       this$0.u = b;
       Objects.requireNonNull(this$0);
       String str = "3";
       if (!PatchProxy.applyVoid(null, this$0, ProgressPreviewElement.class, str)) {
          ProgressPreviewElement a = this$0.A;
          if (a == null) {
             a.S("mPlayModule");
          }
          e player = a.getPlayer();
          a.o(player, "mPlayModule.player");
          this$0.w = player.getDuration();
          this$0.E().j(this$0.w);
          j oj = this$0.E();
          boolean b1 = this$0.o0();
          Objects.requireNonNull(oj);
          if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(b1), oj, j.class, str)) {
             oj.e.f(Boolean.valueOf(b1));
          }
          this$0.E().g(b);
          Object[] objArray = new Object[b];
          o.C().w("ProgressPreviewElement", "tryHide onElementAttached "+this$0.s(), objArray);
          this$0.b0();
       }
       return;
    }
}
