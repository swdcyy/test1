package bra.h;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.growth.unmute.UnmuteTipView$c;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.Integer;
import cra.w;
import q87.c;
import java.lang.System;
import bra.i;
import java.lang.Runnable;
import ekd.k1;

public final class h implements View$OnClickListener	// class@000433
{
    public final UnmuteTipView b;

    public void h(UnmuteTipView p0){
       this.b = p0;
       super();
    }
    public final void onClick(View p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, h.class, "1")) {
          return;
       }
       UnmuteTipView$c mOnVolListen = this.b.getMOnVolListener();
       if (mOnVolListen != null) {
          mOnVolListen.a();
       }
       h tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       int i = 1;
       if (!PatchProxy.applyVoid(objArray, tb, UnmuteTipView.class, "10")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "OPEN_VOLUME_NOTICE_BUBBLE";
          u1.L("", objArray, i, uElementPack, objArray);
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.isSupport(UnmuteTipView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), tb, UnmuteTipView.class, "5")) {
          if (tb.K != i) {
             Object[] objArray1 = new Object[0];
             w.C().w("VolumeTipView", "Current status is\'t sad,so can\'t start changing anim, return", objArray1);
          }else {
             long l = (long)1400 - (System.currentTimeMillis() - tb.N);
             i oi = null;
             if (l - oi < 0) {
                l = oi;
             }
             k1.r(new i(tb, i), l);
          }
       }
       PatchProxy.onMethodExit(h.class, "1");
       return;
    }
}
