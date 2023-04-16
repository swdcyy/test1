package com.yxcorp.gifshow.camera.record.frame.g;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.camera.record.frame.l;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.camera.record.base.d;
import zb9.p0;
import zb9.p0$a;
import com.yxcorp.gifshow.camera.record.base.b;
import lnc.a1;
import com.yxcorp.gifshow.util.PostExperimentUtils;
import java.lang.CharSequence;
import e17.i;
import k2b.e0;
import com.yxcorp.gifshow.camera.record.CameraLogger;
import com.yxcorp.gifshow.camerasdk.q;
import com.kwai.library.widget.popup.common.c;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.widget.popup.common.c$b;
import android.view.ViewGroup;
import android.app.Activity;
import com.kwai.library.widget.popup.common.PopupInterface$c;
import com.yxcorp.gifshow.camera.record.frame.h;
import com.kwai.library.widget.popup.common.PopupInterface$f;
import com.yxcorp.gifshow.camera.record.frame.j;
import com.kwai.library.widget.popup.common.PopupInterface$h;

public final class g implements View$OnClickListener	// class@000de5
{
    public final l b;

    public void g(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       String str;
       int i;
       g tb = this.b;
       Objects.requireNonNull(tb);
       l ol = l.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, ol, "11")) {
       }else {
          Object[] objArray1 = new Object[0];
          a.D().s("FrameSwitchController", "switchFrameBtnClick :"+tb.v, objArray1);
          l r = tb.r;
          if (r != null && !r.isEnabled()) {
             if (!tb.o2()) {
                objArray = new Object[0];
                a.D().s("FrameSwitchController", "this magic change frame is forbid", objArray);
                p0 op0 = tb.d.d(p0.j.a());
                if (op0.c()) {
                   if (!op0.a()) {
                      str = a1.p(R.string.arg_RES_7f10106c);
                   }else {
                      str = a1.p(R.string.arg_RES_7f10106d);
                   }
                }else if(PostExperimentUtils.p()){
                   i = 0x7f103146;
                }else {
                   i = 0x7f103145;
                }
                str = a1.p(i);
                i.d(R.style.arg_RES_7f11066a, str);
             }
          }else {
             CameraLogger.l("CLICK_FRAME_ENTRANCE", tb.e);
             if (tb.v != null || tb.h.isRecording()) {
                objArray = new Object[0];
                a.D().s("FrameSwitchController", "is click panel outside", objArray);
                tb.v = false;
             }else {
                tb.v = true;
                l t = tb.t;
                if (t != null) {
                   t.q(4);
                }else {
                   c$b uob = PatchProxy.apply(objArray, tb, ol, "21");
                   if (uob != PatchProxyResult.class) {
                   }else {
                      ol = tb.o;
                      if (ol != null) {
                         boolean b = (!ol.getVisibility())? true: false;
                         tb.y = b;
                      }
                      uob = new c$b(tb.e);
                      uob.x(0);
                      uob.W(0);
                      uob.N(tb.g2(0));
                      uob.F(tb.g2(true));
                      uob.P(true);
                      uob.A(true);
                      uob.L(new h(tb));
                   }
                   uob.Y(new j(tb));
                }
             }
          }
       }
       return;
    }
}
