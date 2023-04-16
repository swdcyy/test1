package ac2.h;
import android.view.View$OnClickListener;
import com.kuaishou.live.core.show.luckystar.currentinfo.c;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarInfo;
import java.lang.Object;
import android.view.View;
import yb2.i;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import p91.m;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarParticipateInfo;
import java.lang.String;
import com.yxcorp.utility.TextUtils;
import com.kuaishou.live.core.show.luckystar.util.LiveLuckyStarLogger;
import java.lang.CharSequence;
import e17.i$b;
import e17.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.ViewGroup;
import zb2.h0;
import com.kuaishou.live.core.show.luckystar.model.LiveLuckyStarInfoResponse$LiveLuckyStarExtraInfo;

public final class h implements View$OnClickListener	// class@0000b2
{
    public final c b;
    public final LiveLuckyStarInfoResponse$LiveLuckyStarInfo c;

    public void h(c p0,LiveLuckyStarInfoResponse$LiveLuckyStarInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void onClick(View p0){
       h tb = this.b;
       h tc = this.c;
       c v = tb.v;
       i j = v.j;
       if (j == null) {
       }else {
          LiveLuckyStarLogger.k(v.a.a(), tb.v.c, tc.mType, TextUtils.k(tc.getUserParticipateInfo().mParticipateStatus));
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
       return;
    }
}
