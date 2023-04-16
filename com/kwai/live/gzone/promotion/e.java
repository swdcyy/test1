package com.kwai.live.gzone.promotion.e;
import erd.g;
import com.kwai.live.gzone.promotion.f;
import com.kwai.live.gzone.promotion.bean.LiveGzonePromotionGameListResponse$GzonePromotionGameNotice;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Queue;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import aq5.d;
import fq5.b;
import com.kwai.feature.api.live.base.service.bizrelation.AudienceBizRelation;
import aq5.a;
import x61.c;
import lp3.c;
import lp3.i;
import com.kuaishou.livestream.message.nano.LiveStreamMessages$GzoneVirtualTradeBubble;
import java.util.List;
import ekd.q;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import lnc.e0;
import m67.b;
import com.kwai.library.widget.popup.common.c$b;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import s67.f0;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import s67.z;
import android.view.View$OnClickListener;
import com.kwai.library.widget.popup.common.c;

public final class e implements g	// class@000dbf
{
    public final f b;
    public final LiveGzonePromotionGameListResponse$GzonePromotionGameNotice c;

    public void e(f p0,LiveGzonePromotionGameListResponse$GzonePromotionGameNotice p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void accept(Object p0){
       e tb = this.b;
       e tc = this.c;
       tb.z.clear();
       if (tb.W8() && tb.B == null) {
          p0 = tc.mBubblePics;
          LiveGzonePromotionGameListResponse$GzonePromotionGameNotice mIconBubbleT = tc.mIconBubbleText;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.applyVoidTwoRefs(p0, mIconBubbleT, tb, f.class, "15") && (!tb.J.A0().r2(AudienceBizRelation.BOTTOM_BAR_TIP) && tb.W8())) {
             int[] ointArray = tb.K.a(c.class).T0(4002, 2);
             if (ointArray != null) {
                LiveStreamMessages$GzoneVirtualTradeBubble gzoneVirtual = PatchProxy.applyTwoRefs(p0, mIconBubbleT, tb, f.class, "16");
                if (gzoneVirtual != patchProxyRe) {
                }else {
                   gzoneVirtual = new LiveStreamMessages$GzoneVirtualTradeBubble();
                   if (p0 != null) {
                      gzoneVirtual.backgroundPicUrl = e0.j(q.a(p0));
                   }
                   gzoneVirtual.displaySeconds = 5;
                   gzoneVirtual.gameName = tb.V8();
                   gzoneVirtual.text = mIconBubbleT;
                }
                p0 = PatchProxy.applyTwoRefs(gzoneVirtual, ointArray, tb, f.class, "17");
                if (p0 != patchProxyRe) {
                }else {
                   c$b uob = new c$b(tb.getActivity());
                   uob.M(new f0(tb));
                   p0 = new b(uob, ointArray, gzoneVirtual, new z(tb));
                }
                tb.x = p0;
                p0.t = true;
                p0.Z();
             }
          }
       }
       return;
    }
}
