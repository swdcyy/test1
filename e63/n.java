package e63.n;
import android.view.View$OnClickListener;
import com.kuaishou.live.gzone.v2.profile.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.live.core.show.showprofile.LiveProfileParams;
import android.content.Context;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;
import java.lang.StringBuilder;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import wj2.n0;
import tx1.d;
import wj2.r;
import co2.i0;
import ne2.k;

public final class n implements View$OnClickListener	// class@002665
{
    public final e b;

    public void n(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, e.class, "45")) {
       }else if(!QCurrentUser.me().isLogined()){
          e p = tb.p;
          y.a(p, p.getUrl(), "live_profile_at", 41, a.a().a().getString(R.string.arg_RES_7f103073), tb.r.getBaseFeed(), null, null, null);
       }else {
          tb.d9();
          if (tb.v != null) {
             tb.v.b("@"+tb.r.getUserProfile().mProfile.mName+" ", tb.r.getUserProfile().mProfile.mId);
          }
          e w = tb.w;
          if (w != null) {
             w.d();
          }
          r s = tb.s.s;
          if (s != null) {
             s.g(tb.q.mId, objArray);
          }
       }
       return;
    }
}
