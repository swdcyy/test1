package df2.f;
import android.view.View$OnClickListener;
import df2.m0;
import java.lang.Object;
import android.view.View;
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
import hy2.c;
import java.util.ArrayList;
import mz6.b$d;
import com.kuaishou.live.common.core.component.follow.cache.c;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import java.util.Collection;
import mz6.b;
import df2.j0;
import android.content.DialogInterface$OnClickListener;
import android.app.Dialog;

public final class f implements View$OnClickListener	// class@0024ef
{
    public final m0 b;

    public void f(m0 p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       f tb = this.b;
       if (tb.x.getTargetUserAssType() == LiveApiParams$AssistantType.PUSHER) {
          if (!PatchProxy.applyVoid(null, tb, m0.class, "14")) {
             if (!QCurrentUser.me().isLogined()) {
                m0 w = tb.w;
                y.a(w, w.getUrl(), "live_profile_report", 48, a.a().a().getString(R.string.arg_RES_7f103078), tb.x.getBaseFeed(), null, null, null);
             }else {
                c uoc = new c(tb.w);
                ArrayList uArrayList = new ArrayList();
                uArrayList.add(tb.j9(R.string.arg_RES_7f10169b));
                int liveSourceTy = tb.x.getLiveSourceType();
                int i = 0;
                if (liveSourceTy != 4 && liveSourceTy != 97) {
                   int i1 = (liveSourceTy == 278)? 1: 0;
                   liveSourceTy = (liveSourceTy == 301)? 1: 0;
                   if (!(liveSourceTy | i1)) {
                   label_0081 :
                      liveSourceTy = 0x7f104f68;
                      if (i) {
                         uArrayList.add(tb.l9(liveSourceTy));
                         if (c.b().c(tb.x.getUserProfile().mProfile.mId)) {
                            uArrayList.add(tb.j9(R.string.arg_RES_7f104f05));
                         }
                      }else {
                         uArrayList.add(tb.l9(liveSourceTy));
                         uArrayList.add(tb.j9(R.string.arg_RES_7f100103));
                      }
                      uoc.b(uArrayList);
                      uoc.l(new j0(tb));
                      uoc.q();
                   }
                }
             label_0080 :
                i = 1;
                goto label_0081 ;
             }
          }
       }else {
          tb.J9();
       }
       return;
    }
}
