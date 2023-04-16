package hf2.e;
import android.view.View$OnClickListener;
import hf2.l;
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
import co2.i0;
import ne2.k;

public final class e implements View$OnClickListener	// class@002d80
{
    public final l b;

    public void e(l p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       e tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, tb, l.class, "27")) {
       }else if(!QCurrentUser.me().isLogined()){
          l f = tb.F;
          y.a(f, f.getUrl(), "live_profile_at", 41, a.a().a().getString(R.string.arg_RES_7f103073), tb.E.getBaseFeed(), null, null, null);
       }else {
          tb.S8();
          if (tb.L != null) {
             tb.L.b("@"+tb.E.getUserProfile().mProfile.mName+" ", tb.E.getUserProfile().mProfile.mId);
          }
          l j = tb.J;
          if (j != null) {
             j.d();
          }
          tb.K.g(tb.G.mId, objArray);
       }
       return;
    }
}
