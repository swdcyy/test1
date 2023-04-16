package mz0.a;
import k51.c;
import p01.q;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import mk1.b;
import com.kuaishou.live.common.core.component.gift.gift.p;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import m91.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import java.util.Map;
import rw1.b;
import mz0.a$a;
import android.view.View$OnClickListener;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import w91.a;
import java.util.Objects;
import p01.q$b;
import lnc.a1;
import kotlin.jvm.internal.a;
import ekd.m1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mk1.h;
import tz0.a;
import bl1.a;
import lp3.c;
import lp3.e;

public class a extends c	// class@003254
{
    public a0 p;
    public a q;
    public a r;
    public b s;
    public View t;
    public String u;
    public h v;
    public a w;
    public q x;
    public static String sLivePresenterClassName = "LiveAudienceGiftBoxRechargePresenter";
    public static String y = "LiveAudienceGiftBoxRechargePresenter";

    public void a(q p0){
       super();
       this.x = p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, a.class, "3")) {
          return;
       }
       this.u = p.j(this.s, false);
       b.d(this.p.Z2.a(), this.u, this.p.N().r2(AudienceBizRelation.ALIPAY_RECHARGE_ACTIVITY), this.P8());
       this.t.setOnClickListener(new a$a(this));
       return;
    }
    public final Map P8(){
       String str1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       Map obj = PatchProxy.apply(objArray, this, a.class, "5");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.w.d6();
       a tx = this.x;
       Objects.requireNonNull(tx);
       String str = PatchProxy.apply(objArray, tx, q.class, "6");
       if (str != patchProxyRe) {
       }else {
          q d = tx.d;
          if (d != null) {
             str1 = d.d();
             if (str1 != null) {
             label_003f :
                str = str1;
             }
          }
          str1 = a1.p(R.string.arg_RES_7f104114);
          a.o(str1, "CommonUtil.string\(R.string.recharge\)");
          goto label_003f ;
       }
       obj.put("icon_text", str);
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.t = m1.f(p0, 0x7f0a343d);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.p = this.q8(a0.class);
       this.v = this.q8(h.class);
       this.q = this.s8(a.class);
       this.r = this.s8(a.class);
       this.s = this.q8(b.class);
       this.w = this.v.n.a(a.class);
       return;
    }
}
