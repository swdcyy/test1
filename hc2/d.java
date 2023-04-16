package hc2.d;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.v2.currentinfo.b;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import java.lang.Object;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import e17.i$b;
import e17.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import zb2.h0;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarExtraInfo;

public final class d implements View$OnClickListener	// class@002d59
{
    public final b b;
    public final LiveLuckyStarInfoResponse$LiveLuckyStarInfo c;

    public void d(b p0,LiveLuckyStarInfoResponse$LiveLuckyStarInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       d tb = this.b;
       d tc = this.c;
       if (tb.O.isActivated() && !PatchProxy.applyVoidOneRefs(tc, tb, b.class, "19")) {
          b q = tb.Q;
          i j = q.j;
          if (j != null) {
             LiveLuckyStarLogger.k(q.a.a(), tb.Q.c, tc.mType, String.valueOf(tc.getUserParticipateInfo().mRequirementCompleteStatus));
             switch (tc.mType){
                 case 1:
                   j.b(tc.getExtraInfo().mCommentText);
                 case 2:
                 case 3:
                   j.c();
                   break;
                 case 4:
                   j.a();
                   break;
                 case 5:
                   j.f();
                   break;
                 case 6:
                   j.e();
                   break;
                 case 7:
                   j.d(tb.Q.c);
                   break;
                 default:
                   LiveLuckyStarInfoResponse$LiveLuckyStarInfo mNotSupportT = tc.mNotSupportTips;
                   if (!TextUtils.x(mNotSupportT)) {
                      i$b uob = i.m();
                      uob.y(mNotSupportT);
                      uob.n(tb.m8());
                      i.z(uob);
                   }
             }
          }
       }
       return;
    }
}
