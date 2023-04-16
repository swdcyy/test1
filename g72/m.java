package g72.m;
import erd.g;
import g72.n;
import java.lang.Object;
import android.util.Pair;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse;
import com.kuaishou.live.core.basic.model.LiveUserStatusResponse$ActivityEnterRoomHint;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.model.CDNUrl;
import lnc.e0;
import t02.a0;
import java.util.List;
import hx1.a;
import b61.a;
import com.kuaishou.live.core.show.template.a$e;
import com.kuaishou.live.core.basic.model.LiveTimeConsumingUserStatusResponse;
import com.kuaishou.live.core.show.wealthgrade.http.LiveWealthGradeInfo;
import hm2.i;
import com.kuaishou.protobuf.livestream.nano.LiveAudienceState;
import com.kuaishou.protobuf.livestream.nano.UserStateRichTextSegment;
import com.kuaishou.protobuf.livestream.nano.LiveCommentRichText$CommentIconSegment;
import com.kuaishou.live.core.show.wealthgrade.b$c;

public final class m implements g	// class@002a8b
{
    public final n b;

    public void m(n p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       n on1;
       LiveWealthGradeInfo liveWealthGr;
       m tb = this.b;
       Objects.requireNonNull(tb);
       n on = n.class;
       if (PatchProxy.applyVoidOneRefs(p0, tb, on, "3")) {
       }else {
          Pair first = p0.first;
          if (first != null) {
             LiveUserStatusResponse mActivityEnt = first.mActivityEnterRoomHint;
             if (mActivityEnt != null && mActivityEnt.mDisplayType != null) {
                on1 = 1;
             label_0026 :
                if (on1) {
                   if (!PatchProxy.applyVoidOneRefs(first, tb, on, "4") && tb.L != null) {
                      p0 = first.mActivityEnterRoomHint;
                      p0.mUserInfo = tb.a9(first);
                      p0.mAvatarStaticRingUrls = e0.i(first.mCurrentUserHeadWidget);
                      p0.mAvatarDynamicRingUrls = e0.i(first.mCurrentUserHeadWidgetAnimation);
                      a.f(p0.mUserInfo, tb.K.r2.Bi());
                      tb.L.a(p0, 999);
                   }
                }else {
                   first = p0.second;
                   if (first != null) {
                      LiveTimeConsumingUserStatusResponse mLiveWealthG = first.mLiveWealthGradeInfo;
                      if (mLiveWealthG != null) {
                         liveWealthGr = mLiveWealthG.mEnableMockEnterDisplay;
                      label_0072 :
                         if (liveWealthGr == null || (!PatchProxy.applyVoidOneRefs(p0, tb, on, "5") && tb.M != null)) {
                            i oi = new i();
                            UserInfo userInfo = tb.a9(p0.first);
                            oi.a = userInfo;
                            a.f(userInfo, tb.K.r2.Bi());
                            p0 = p0.second.mLiveWealthGradeInfo;
                            oi.b = p0.mCurrentGrade;
                            oi.d = p0.mEnterDisplayType;
                            p0 = p0.mGradeIconSegment;
                            if (p0 != null) {
                               LiveAudienceState liveAudience = new LiveAudienceState();
                               UserStateRichTextSegment userStateRic = new UserStateRichTextSegment();
                               userStateRic.setIconSegment(p0);
                               p0 = new UserStateRichTextSegment[]{userStateRic};
                               liveAudience.userStateSegment = p0;
                               oi.c = liveAudience;
                            }
                            tb.M.a(oi, 999);
                         }
                      }
                   }
                   liveWealthGr = null;
                   goto label_0072 ;
                }
             }
          }
          on1 = null;
          goto label_0026 ;
       }
    label_00c7 :
       return;
    }
}
