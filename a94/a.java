package a94.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import a94.a$a;
import a94.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.merchant.api.core.LiveMerchantBaseContext;
import ks3.h;
import u84.b;
import ks3.l$a;
import ks3.l;
import ts3.b$b;
import java.lang.Integer;
import java.lang.Boolean;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import ks3.a0;
import u84.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import android.content.Context;
import android.view.ViewGroup;
import android.view.View;
import xm4.a;
import a94.b;
import android.view.View$OnClickListener;
import ks3.c;

public class a extends PresenterV2	// class@000044
{
    public View p;
    public int q;
    public String r;
    public h s;
    public c t;
    public l u;
    public a0 v;
    public final l$a w;
    public final b$b x;

    public void a(){
       super();
       this.q = -1;
       this.w = new a$a(this);
       this.x = new a$b(this);
    }
    public void E8(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
          return;
       }
       String str = PatchProxy.apply(objArray, this, uoa, "15");
       if (str != PatchProxyResult.class) {
       }else {
          str = this.s.a().getLiveStreamId();
       }
       this.r = str;
       if (b.k().d(this.r)) {
          this.P8(0);
       }
       this.u.a(this.w);
       b.k().b(this.r, this.x);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.u.b(this.w);
       b.k().j(this.r, this.x);
       b.k().f = null;
       return;
    }
    public final void P8(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "8")) {
          return;
       }
       this.q = p0;
       this.S8(true);
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, a.class, "14")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       this.s.h();
       this.s.f();
       return;
    }
    public void S8(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "9")) {
          return;
       }
       if (p0) {
          a tq = this.q;
          if (tq == null || tq == -1) {
             Object[] objArray = null;
             if (!PatchProxy.applyVoid(objArray, this, uoa, "10") && this.p == null) {
                ClientContent$LiveStreamPackage liveStreamPa = this.v.a();
                if (!PatchProxy.applyVoidOneRefs(liveStreamPa, objArray, a.class, "4")) {
                   ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
                   uElementPack.action2 = "ADD_AUCTION";
                   ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                   uContentPack.liveStreamPackage = liveStreamPa;
                   u1.u0(3, uElementPack, uContentPack);
                }
                View view = a.b(this.getContext(), R.layout.arg_RES_7f0d1108, objArray);
                this.p = view;
                view.setOnClickListener(new b(this));
             }
             if (!PatchProxy.applyVoid(objArray, this, uoa, "13")) {
                tq = this.p;
                if (tq != null) {
                   this.s.e(tq);
                   this.s.f();
                }
             }
          }else {
             this.R8();
          }
       }else {
          this.R8();
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.s = this.r8("LIVE_MERCHANT_ANCHOR_SANDEABIZ_SERVICE");
       this.t = this.r8("LIVE_MERCHANT_AUCTION_SERVICE");
       this.u = this.r8("LIVE_MERCHANT_AUCTION_STATE_SERVICE");
       this.v = this.r8("LIVE_MERCHANT_CALLER_CONTEXT_SERVICE");
       return;
    }
}
