package i31.d;
import u07.u;
import i31.f;
import com.kuaishou.livestream.message.nano.LiveTopUserForbidden$SCTopUserForbiddenDialog;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import gx5.c;
import com.kwai.framework.model.user.QCurrentUser;
import com.kwai.framework.model.user.UserProfile;
import lu7.f;
import android.content.Context;
import com.kwai.library.widget.popup.common.c;
import z12.x;

public final class d implements u	// class@00281b
{
    public final f b;
    public final LiveTopUserForbidden$SCTopUserForbiddenDialog c;

    public void d(f p0,LiveTopUserForbidden$SCTopUserForbiddenDialog p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (this.c.actionType == 1) {
          if (!PatchProxy.applyVoid(null, tb, f.class, "5")) {
             Activity activity = tb.getActivity();
             if (activity instanceof GifshowActivity) {
                d.a(0x763547f8).pc(activity, f.n(QCurrentUser.me()));
             }
          }
       }else {
          x.f(p0);
       }
       return;
    }
}
