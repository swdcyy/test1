package xb1.b;
import k51.c;
import xb1.b$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.View;
import i2b.a;
import android.widget.RelativeLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.view.View$OnClickListener;
import ekd.m1;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import o63.d;
import ks5.m;
import com.kwai.feature.api.live.merchant.top.LiveTopPendantTempPlayService;
import com.kwai.robust.PatchProxyResult;
import xb1.b$b;
import k2b.e0;
import xp5.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import vb1.c;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ShowMetaData;
import k2b.u1;
import lp3.i;
import lp3.c;

public abstract class b extends c	// class@004697
{
    public LiveTopPendantTempPlayService p;
    public i q;
    public m r;
    public View s;
    public KwaiCDNImageView t;
    public i u;
    public d v;
    public final m w;
    public static String sLivePresenterClassName = "LiveBlindPendantBasePresenter";

    public void b(){
       super();
       this.v = null;
       this.w = new b$a(this);
    }
    public void E8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "2")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, uob, "4")) {
          if (this.s == null) {
             this.s = a.a(this.getContext(), this.R8());
          }
          if (this.s != null) {
             this.s.setLayoutParams(new RelativeLayout$LayoutParams(a1.d(R.dimen.arg_RES_7f07097c), a1.d(R.dimen.arg_RES_7f07097b)));
             this.s.setOnClickListener(this.w);
             this.t = m1.f(this.s, 0x7f0a1a8b);
             this.S8();
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, b.class, "3")) {
          return;
       }
       this.P8();
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, b.class, "8")) {
          return;
       }
       b tv = this.v;
       if (tv != null) {
          tv.L();
          this.v = null;
       }
       return;
    }
    public abstract int R8();
    public abstract void S8();
    public void V8(){
       if (PatchProxy.applyVoid(null, this, b.class, "6")) {
          return;
       }
       b tp = this.p;
       if (tp != null) {
          b tr = this.r;
          if (tr != null) {
             tp.c(tr);
             this.r = null;
          }
       }
       return;
    }
    public d W8(){
       Object obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.P8();
       return null;
    }
    public void X8(){
       b uob = b.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uob, "5")) {
          return;
       }
       if (this.r == null && this.p != null) {
          b$b uob1 = new b$b(this);
          this.r = uob1;
          this.p.b(uob1);
          String str = "9";
          if (!PatchProxy.applyVoid(objArray, this, uob, str)) {
             uob = this.u;
             if (uob != null) {
                e0 page = uob.getPage();
                ClientContent$LiveStreamPackage liveStreamPa = this.u.a();
                if (!PatchProxy.applyVoidTwoRefs(page, liveStreamPa, objArray, c.class, str)) {
                   a.p(page, "logPage");
                   a.p(liveStreamPa, "liveStreamPackage");
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "BLIND_DATE_LIVE_RIGHT_PENDANT";
                   u1.B0(new ShowMetaData().setLogPage(page).setType(9).setElementPackage(uElementPack).setContentPackage(c.a(liveStreamPa)));
                }
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.p = this.s8(LiveTopPendantTempPlayService.class);
       i oi = this.r8("LIVE_SERVICE_MANAGER");
       this.q = oi;
       this.u = oi.a(i.class);
       return;
    }
}
