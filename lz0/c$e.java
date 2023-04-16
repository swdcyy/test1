package lz0.c$e;
import android.view.View$OnClickListener;
import lz0.c;
import java.lang.String;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import mk1.h;
import or5.d;
import lp3.c;
import lp3.e;
import com.kuaishou.android.model.feed.LiveStreamFeed;
import or5.b;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import va1.y;

public class c$e implements View$OnClickListener	// class@003084
{
    public final String b;
    public final c c;

    public void c$e(c p0,String p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$e.class, "1")) {
          return;
       }
       if (!QCurrentUser.me().isLogined()) {
          y.a(this.c.getContext(), this.c.getActivity().getUrl(), this.b, 43, a.a().a().getString(R.string.arg_RES_7f103081), this.c.v.n.a(d.class).j0(), null, null, null);
       }
       return;
    }
}
