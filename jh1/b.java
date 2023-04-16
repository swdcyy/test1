package jh1.b;
import nh1.b;
import jh1.c;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.yxcorp.gifshow.models.Gift;
import com.kuaishou.client.log.content.packages.nano.ClientContent$GiftPackage;
import kh1.a;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import java.util.List;
import com.kuaishou.android.live.log.b;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import ug1.u;
import java.util.Objects;
import pa1.o;
import android.content.Context;
import s51.c;
import java.lang.Boolean;
import android.net.Uri;
import ekd.x0;
import d61.v;
import java.lang.Float;
import java.lang.reflect.Type;
import android.app.Activity;
import d61.y;
import va1.n0;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import lp3.e;
import kq3.a;
import va1.o0;
import com.kuaishou.live.webview.context.LiveWebViewParam;
import com.kuaishou.live.webview.a;
import androidx.fragment.app.KwaiDialogFragment;
import lh1.a;
import e17.i;

public class b implements b	// class@002ba6
{
    public final c a;

    public void b(c p0){
       this.a = p0;
       super();
    }
    public void a(String p0){
       c uoc = c.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
          return;
       }
       ClientContent$LiveStreamPackage liveStreamPa = this.a.d.a();
       ClientContent$GiftPackage giftPackage = a.a(this.a.h);
       String str = "2";
       if (!PatchProxy.applyVoidTwoRefs(liveStreamPa, giftPackage, null, a.class, str)) {
          a.p(liveStreamPa, "liveStreamPackage");
          a.p(giftPackage, "giftPackage");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GIFT_PANEL_BANNER";
          ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
          uContentPack.liveStreamPackage = liveStreamPa;
          uContentPack.giftPackage = giftPackage;
          u1.u(true, uElementPack, uContentPack);
       }
       if (TextUtils.x(p0)) {
          return;
       }else {
          b ta = this.a;
          if (ta.c != null && ta.b != null) {
             List i = c.i;
             b.S(i, "click right-top banner", "url", p0);
             String str1 = "SOURCE_LIVE";
             if (a.t().u(str1).d("enableGiftDetailBannerH5HideGiftPanel", false)) {
                this.a.e.a();
             }
             b ta1 = this.a;
             Objects.requireNonNull(ta1);
             if (!PatchProxy.applyVoidOneRefs(p0, ta1, uoc, str)) {
                if (o.a(p0)) {
                   if (!PatchProxy.applyVoidOneRefs(p0, ta1, uoc, "4")) {
                      c f = ta1.f;
                      if (f == null) {
                         b.r(i, "[startRouter] fail router, mLiveRouterServiceProxy is null");
                      }else {
                         b.S(i, "[startRouter]", "isRouterSuccess", Boolean.valueOf(f.r4(p0, ta1.c)));
                      }
                   }
                }else if(PatchProxy.applyVoidOneRefs(p0, ta1, uoc, "5")){
                   String str2 = x0.a(Uri.parse(p0), "heightratio");
                   float f1 = 0x3f266666;
                   float f2 = (!TextUtils.x(str2))? v.d(str2, f1): a.t().u(str1).getValue("giftHintViewJumpH5Height", Float.TYPE, Float.valueOf(f1)).floatValue();
                   if (f2 - 0x3f800000 <= 0 && f2 - 0x3dcccccd >= 0) {
                      f1 = f2;
                   }
                   int i1 = (y.d(ta1.c))? n0.e(): n0.f();
                   a uoa = o0.a(ta1.c, ta1.d.b().getChildFragmentManager(), ta1.d.t5());
                   uoa.f(ta1.d.b().getTag());
                   uoa.b.setPortraitHeightRatio(f1).setLandscapeWidthPixel(i1).setLayoutType("3");
                   a.c().h(p0, uoa);
                }
             }
             b ta2 = this.a;
             Objects.requireNonNull(ta2);
             if (!PatchProxy.applyVoid(null, ta2, uoc, "3")) {
                c g = ta2.g;
                if (g != null) {
                   a l = g.l;
                   if (!TextUtils.x(l)) {
                      i.f(R.style.arg_RES_7f11066a, l, true);
                   }
                }
             }
          }
       label_016f :
          return;
       }
    }
}
