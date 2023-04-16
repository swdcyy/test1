package com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.b;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.a$a;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.c;
import java.lang.Object;
import com.kuaishou.live.common.core.component.bottombubble.notices.commonnotice.LiveCommonBubbleInfo;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.live.core.show.commentnotice.model.LiveCommentNoticeClickEventInfo;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import com.yxcorp.utility.n;
import n91.h;
import lp3.c;
import lp3.e;
import androidx.fragment.app.KwaiDialogFragment;
import oc1.b;
import android.content.DialogInterface$OnDismissListener;
import nc1.k;
import com.kuaishou.live.common.core.component.bottombubble.notices.common.info.LiveCommentNoticeBaseInfo;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import mc1.a;

public final class b implements a$a	// class@000fab
{
    public final c a;

    public void b(c p0){
       this.a = p0;
    }
    public final void a(LiveCommonBubbleInfo p0){
       boolean b;
       b ta = this.a;
       Objects.requireNonNull(ta);
       LiveCommonBubbleInfo mClickEvent = p0.mClickEvent;
       if (mClickEvent == null) {
       }else {
          Object obj = PatchProxy.applyOneRefs(mClickEvent, ta, c.class, "5");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(TextUtils.isEmpty(mClickEvent.mUrl) || mClickEvent.mFullScreen != null){
             float f = 0x3f000000;
             LiveCommentNoticeClickEventInfo mHeightPerce = mClickEvent.mHeightPercent;
             if (mHeightPerce > 0 && mHeightPerce - 0x3f800000 < 0) {
                f = mHeightPerce;
             }
             KwaiDialogFragment kwaiDialogFr = ta.c.a(h.class).U9(mClickEvent.mUrl, "LiveCommonCommentNoticeComponent", "LiveCommonCommentNoticeComponent", (int)((float)n.v(ta.d) * f), "3", 0, 0, false);
             ta.e = kwaiDialogFr;
             if (kwaiDialogFr != null) {
                kwaiDialogFr.k0(new b(ta));
             }
             if (ta.e != null) {
                b = true;
             }
          }
       label_0071 :
          b = false;
          if (b) {
             ta.c.a(k.class).D6();
          }
          a.b(ta.b, String.valueOf(100), p0.mBizId);
       }
       return;
    }
}
