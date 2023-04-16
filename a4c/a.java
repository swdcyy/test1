package a4c.a;
import android.view.View$OnClickListener;
import a4c.h;
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
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.widget.CollectAnimationView;
import com.yxcorp.gifshow.util.rx.RxBus;
import kob.p;
import brd.t;
import com.yxcorp.gifshow.music.utils.f;
import a4c.c;
import a4c.f;
import erd.g;
import a4c.d;
import a4c.g;

public final class a implements View$OnClickListener	// class@00006a
{
    public final h b;

    public void a(h p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       a tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoidOneRefs(p0, tb, h.class, "6")) {
       }else if(!QCurrentUser.ME.isLogined()){
          Activity uActivity = tb.getActivity();
          d.a(-1712118428).ne(uActivity, uActivity.getUrl(), uActivity.getUrl(), 0, "", null, null, null, null).h();
       }else {
          h s = tb.s;
          if (s != null && !s.isDisposed()) {
             tb.s.dispose();
          }
          s = tb.p;
          boolean b = true;
          if (s.isFavorited()) {
             tb.q.k();
             RxBus.f.b(new p(s, false, b));
             tb.s = f.c(s, false, b).subscribe(new c(tb), new f(tb, p0, s));
          }else {
             tb.q.e();
             RxBus.f.b(new p(s, b, b));
             tb.s = f.c(s, b, b).subscribe(new d(tb), new g(tb, p0, s));
          }
       }
       return;
    }
}
