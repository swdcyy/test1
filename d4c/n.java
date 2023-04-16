package d4c.n;
import android.view.View$OnClickListener;
import d4c.v;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.model.user.QCurrentUser;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.activity.GifshowActivity;
import tkd.b;
import tkd.d;
import ou5.b;
import android.content.Context;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import crd.b;
import lnc.b9;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import com.yxcorp.gifshow.util.rx.RxBus;
import kob.p;
import brd.t;
import com.yxcorp.gifshow.music.utils.f;
import d4c.h;
import d4c.f;
import erd.g;
import d4c.i;
import d4c.g;

public final class n implements View$OnClickListener	// class@0020d7
{
    public final v b;

    public void n(v p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       n tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, v.class, "14")) {
       }else if(!QCurrentUser.ME.isLogined()){
          Activity uActivity = tb.getActivity();
          d.a(-1712118428).ne(uActivity, uActivity.getUrl(), uActivity.getUrl(), 0, "", null, null, null, null).h();
       }else {
          b9.a(tb.H);
          v f = tb.F;
          boolean b = true;
          if (f.isFavorited()) {
             tb.t.k();
             RxBus.f.b(new p(f, false, b));
             tb.H = f.a(f).subscribe(new h(tb, f), new f(tb, p0, f));
          }else {
             tb.t.e();
             RxBus.f.b(new p(f, b, b));
             tb.H = f.b(f).subscribe(new i(tb, f), new g(tb, p0, f));
          }
       }
       return;
    }
}
