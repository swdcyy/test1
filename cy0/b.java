package cy0.b;
import erd.g;
import cy0.e;
import java.lang.Object;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig;
import java.util.Objects;
import com.kuaishou.merchant.api.core.model.MerchantLivePlayConfig$ABConfig;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import d61.y;
import fy0.b$b;
import fy0.j$a;
import java.lang.String;
import lnc.a1;
import fy0.j;
import com.kwai.feature.api.live.service.show.comments.sendcomment.CustomerServiceCommentInfo;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import by0.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.merchant.LiveMerchantLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.widget.ImageButton;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import pm8.a;
import android.content.SharedPreferences;
import xf3.c;
import java.lang.Long;
import java.util.Calendar;
import android.view.View;
import java.lang.Runnable;

public final class b implements g	// class@001ea0
{
    public final e b;

    public void b(e p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       int i;
       boolean b;
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (p0.getAbConfig().mEnableAskCommentNewStyle != null && (!y.e(tb.getActivity()) && tb.q.d())) {
          p0 = tb.q;
          i = 3;
          j$a uoa = p0.b(i, i);
          uoa.c(a1.p(R.string.arg_RES_7f103238));
          uoa.b(R.drawable.arg_RES_7f08170a);
          p0.e(uoa.a());
          p0 = tb.y;
          if (tb.q.i(2)) {
             i = 2;
          }
          p0.setStyle(i);
          a.c(tb.p.Z2.a(), tb.y.mStyle);
       }else {
          p0 = e.class;
          Object[] objArray = null;
          if (!PatchProxy.applyVoid(objArray, tb, p0, "6")) {
             b.P(LiveMerchantLogTag.CUSTOMER_SERVICE.appendTag("LiveAudienceMerchantCSFloatEditorPresenter"), "showCustomerServiceOldStyle");
             int i1 = 1;
             tb.y.setStyle(i1);
             e t = tb.t;
             if (t != null) {
                t.setImageResource(R.drawable.arg_RES_7f080ebe);
                tb.t.setVisibility(0);
                a.c(tb.p.Z2.a(), tb.y.mStyle);
                PatchProxyResult patchProxyRe = PatchProxyResult.class;
                p0 = PatchProxy.apply(objArray, tb, p0, "12");
                if (p0 != patchProxyRe) {
                   i1 = p0.booleanValue();
                }else {
                   long l = 0;
                   long longx = a.a.getLong("live_audience_merchant_cs_guide_time", l);
                   if (!a.x()) {
                      if (longx - l) {
                         p0 = c.class;
                         if (PatchProxy.isSupport(p0)) {
                            p0 = PatchProxy.applyOneRefs(Long.valueOf(longx), objArray, p0, "1");
                            if (p0 != patchProxyRe) {
                               b = p0.booleanValue();
                            }else {
                            label_00de :
                               p0 = Calendar.getInstance();
                               p0.setTimeInMillis(longx);
                               i = 6;
                               int i2 = p0.get(i);
                               p0.setTimeInMillis(c.a());
                               if (p0.get(i1) == p0.get(i1)) {
                                  i2 = i2 - p0.get(i);
                                  if (i2 > 0 && !(i2 % 7)) {
                                     b = true;
                                  }
                               }
                               b = false;
                            }
                         }else {
                            goto label_00de ;
                         }
                         if (!b) {
                         label_010c :
                            i1 = false;
                         }
                      }
                   }else {
                      goto label_010c ;
                   }
                }
                if (i1) {
                   tb.m8().postDelayed(tb.x, 1000);
                }
             }
          }
       }
       return;
    }
}
