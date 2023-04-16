package etb.a0;
import android.view.View$OnClickListener;
import etb.d0;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.notice.box.detail.data.model.NoticeBoxTextOnlyItem;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import ctb.a;
import dtb.c;
import java.lang.Integer;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.h;
import com.yxcorp.gifshow.notice.box.data.NoticeBoxPlateSetting;
import k2b.e0;
import android.net.Uri;
import ekd.x0;
import wkd.b;
import nf6.i;
import android.content.Context;
import android.content.Intent;

public final class a0 implements View$OnClickListener	// class@0027e6
{
    public final d0 b;

    public void a0(d0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a0 tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, d0.class, "4")) {
       }else {
          d0 q = tb.q;
          if (q.mUnread != null) {
             q.mUnread = false;
             tb.P8();
          }
          Activity activity = tb.getActivity();
          if (activity != null) {
             d0 r = tb.r;
             d0 q1 = tb.q;
             d0 p = tb.p;
             a c = p.c;
             int i = p.e + 1;
             if (!PatchProxy.isSupport(c.class) || !PatchProxy.applyVoidFourRefs(r, q1, c, Integer.valueOf(i), null, c.class, "2")) {
                h oh = h.m("3155615", "NOTIFICATION_CARD");
                oh.c(c.b(q1, i));
                oh.n(c.f("card", c));
                oh.i(r);
             }
             Intent intent = b.a(0x66dce92a).c(activity, x0.f(tb.q.mLinkUrl), true, true);
             if (intent != null) {
                activity.startActivity(intent);
             }
          }
       }
       return;
    }
}
