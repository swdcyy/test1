package hy0.k;
import u07.u;
import hy0.p;
import com.kuaishou.live.core.basic.model.LiveSendBulletCommentResultResponse;
import java.lang.String;
import com.kuaishou.live.core.basic.model.LiveSendBulletPopUpInfo;
import java.lang.Object;
import u07.t;
import android.view.View;
import fq5.b;
import t02.a0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import com.kuaishou.live.core.basic.model.LivePayBulletResponse;
import hy0.v;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import vq5.d;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.content.Context;

public final class k implements u	// class@0027ab
{
    public final p b;
    public final LiveSendBulletCommentResultResponse c;
    public final String d;
    public final LiveSendBulletPopUpInfo e;

    public void k(p p0,LiveSendBulletCommentResultResponse p1,String p2,LiveSendBulletPopUpInfo p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void a(t p0,View p1){
       k tb = this.b;
       k tc = this.c;
       k td = this.d;
       k te = this.e;
       v.c(tb.p.b().a(), tc.getShotCode(), tb.w.getPrice(), true);
       if (tc.getShotCode() == -4) {
          p w = tb.w;
          if (w != null) {
             tb.P8(td, w.getPrice());
          }
       }else {
          String confirmLink = te.getConfirmLink();
          if (!TextUtils.x(confirmLink) && tb.p.p2.P0(confirmLink)) {
             tb.p.p2.r4(confirmLink, tb.getActivity());
          }
       }
       return;
    }
}
