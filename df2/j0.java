package df2.j0;
import android.content.DialogInterface$OnClickListener;
import df2.m0;
import java.lang.Object;
import android.content.DialogInterface;
import java.util.Objects;
import com.kuaishou.live.basic.api.LiveApiParams$AssistantType;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import android.content.Context;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kuaishou.live.core.show.statistics.LivePlayLogger;

public final class j0 implements DialogInterface$OnClickListener	// class@0024f6
{
    public final m0 b;

    public void j0(m0 p0){
       this.b = p0;
    }
    public final void onClick(DialogInterface p0,int p1){
       j0 tb = this.b;
       Objects.requireNonNull(tb);
       m0 om0 = m0.class;
       if (p1 == 0x7f10169b) {
          LiveApiParams$AssistantType tarUserAssTy = tb.x.getTargetUserAssType();
          if (!PatchProxy.applyVoidOneRefs(tarUserAssTy, tb, om0, "17")) {
             if (tarUserAssTy == LiveApiParams$AssistantType.PUSHER) {
                tb.K9();
             }else {
                tb.J9();
             }
          }
       }else if(p1 == 0x7f104f68){
          if (!PatchProxy.applyVoid(null, tb, om0, "16")) {
             if (!QCurrentUser.me().isLogined()) {
                m0 w = tb.w;
                y.a(w, w.getUrl(), "live_profile_feedback_negative", 47, a.a().a().getString(R.string.arg_RES_7f103078), tb.x.getBaseFeed(), null, null, null);
             }else {
                m0 b = tb.B;
                if (b != null) {
                   b.onFeedbackLiveNegativeAtMoreDialog(tb.x.getBaseFeed(), tb.x.getUserProfile().mProfile.mId);
                }
                tb.F9(tb.w);
             }
          }
       }else if(p1 == 0x7f100103){
          tb.Z8();
       }else if(p1 == 0x7f104f05){
          tb.V9();
       }
       return;
    }
}
