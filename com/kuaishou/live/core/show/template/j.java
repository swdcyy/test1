package com.kuaishou.live.core.show.template.j;
import c12.f;
import hl2.l;
import hl2.o;
import com.kuaishou.live.core.show.template.j$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import t02.a0;
import mq5.h;
import mq5.b;
import lf3.g;
import hf3.a;
import ekd.k1;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import com.kwai.framework.model.user.UserInfo;
import android.graphics.drawable.Drawable;
import com.kuaishou.livestream.message.nano.LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo;
import java.lang.Long;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import com.kuaishou.live.core.show.template.LiveGuestActivityGuestInfoPopupDialog;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.live.core.show.template.g;
import android.content.DialogInterface$OnDismissListener;
import com.kuaishou.live.core.basic.activity.x;
import androidx.fragment.app.c;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.lang.Runnable;
import hl2.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.core.show.template.h;
import com.kuaishou.livestream.message.nano.SCActionSignal;

public class j extends f	// class@001189
{
    public a0 K;
    public a L;
    public g M;
    public LiveGuestActivityGuestInfoPopupDialog N;
    public long O;
    public final h P;
    public Runnable Q;
    public j R;
    public static String sLivePresenterClassName = "LiveGuestActivityGuestInfoPopupDialogPresenter";

    public void j(){
       super();
       this.O = 0x2710;
       this.P = new l(this);
       this.Q = new o(this);
       this.R = new j$a(this);
    }
    public void Q(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "3")) {
          return;
       }
       this.K.D2.le(this.P);
       this.L.o(510, this.M);
       k1.n(this);
       this.a9();
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, j.class, "8")) {
          return;
       }
       x.E(this.N);
       this.N = null;
       return;
    }
    public final void b9(String p0,UserInfo p1,boolean p2,long p3,Drawable p4,LiveCommonNoticeMessages$LiveActivityPopAnimationPicInfo p5){
       LiveGuestActivityGuestInfoPopupDialog liveGuestAct1;
       LiveGuestActivityGuestInfoPopupDialog liveGuestAct = this;
       object oobject = p0;
       object oobject1 = p1;
       object oobject2 = p4;
       object oobject3 = p5;
       j oj = j.class;
       int i = 6;
       int i1 = 0;
       int i2 = 5;
       int i3 = 4;
       if (PatchProxy.isSupport(oj)) {
          Object[] objArray = new Object[i];
          objArray[i1] = oobject;
          objArray[1] = oobject1;
          objArray[2] = Boolean.valueOf(p2);
          objArray[3] = Long.valueOf(p3);
          objArray[i3] = oobject2;
          objArray[i2] = oobject3;
          if (PatchProxy.applyVoid(objArray, liveGuestAct, oj, "7")) {
             return;
          }
       }
       k1.n(this);
       this.a9();
       oj = liveGuestAct.R;
       object oobject4 = (oobject3 == null)? null: e0.i(oobject3.webpUrl);
       int i4 = (oobject3 == null)? 0: oobject3.translateX;
       int i5 = (oobject3 == null)? 0: oobject3.translateY;
       int i6 = (oobject3 == null)? 0: oobject3.loopCount;
       if (PatchProxy.isSupport(LiveGuestActivityGuestInfoPopupDialog.class)) {
          Object[] objArray1 = new Object[9];
          objArray1[i1] = oj;
          objArray1[1] = oobject;
          objArray1[2] = oobject1;
          objArray1[3] = Boolean.valueOf(p2);
          objArray1[i3] = oobject2;
          objArray1[i2] = oobject4;
          objArray1[6] = Integer.valueOf(i4);
          objArray1[7] = Integer.valueOf(i5);
          objArray1[8] = Integer.valueOf(i6);
          liveGuestAct1 = PatchProxy.apply(objArray1, null, LiveGuestActivityGuestInfoPopupDialog.class, "5");
          if (liveGuestAct1 != PatchProxyResult.class) {
          label_00b9 :
             liveGuestAct.N = liveGuestAct1;
             liveGuestAct1.k0(g.b);
             liveGuestAct.N.Cb(liveGuestAct.K.R().getChildFragmentManager(), "LiveGuestActivityPopupDialog");
             b.Z(LiveLogTag.LIVE_GUEST_ACTIVITY, "show guest activity dialog");
             k1.s(liveGuestAct.Q, liveGuestAct, p3);
             liveGuestAct.N.k0(new k(liveGuestAct));
             return;
          }
       }
       liveGuestAct1 = new LiveGuestActivityGuestInfoPopupDialog();
       liveGuestAct1.A = oj;
       liveGuestAct1.w = oobject1;
       liveGuestAct1.x = oobject;
       liveGuestAct1.y = p2;
       liveGuestAct1.z = oobject2;
       liveGuestAct1.B = oobject4;
       liveGuestAct1.D = i4;
       liveGuestAct1.E = i5;
       liveGuestAct1.F = i6;
       goto label_00b9 ;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, j.class, "1")) {
          return;
       }
       super.j8();
       this.K = this.q8(a0.class);
       this.L = this.r8("LIVE_LONG_CONNECTION");
       return;
    }
    public void x(boolean p0){
       j oj = j.class;
       if (PatchProxy.isSupport(oj) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oj, "2")) {
          return;
       }
       this.K.D2.Km(this.P);
       if (!PatchProxy.applyVoid(null, this, oj, "4")) {
          h oh = new h(this);
          this.M = oh;
          this.L.u0(510, SCActionSignal.class, oh);
       }
       return;
    }
}
