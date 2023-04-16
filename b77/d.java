package b77.d;
import android.view.View$OnClickListener;
import b77.e;
import java.lang.Object;
import android.view.View;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import crd.b;
import lnc.b9;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import b77.f;
import erd.g;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import tkd.b;
import tkd.d;
import ou5.b;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import fq5.b;
import va1.d0;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.entity.QPreInfo;
import n3d.a;
import n3d.d;
import f37.o0;

public final class d implements View$OnClickListener	// class@0003d1
{
    public final e b;

    public void d(e p0){
       this.b = p0;
    }
    public final void onClick(View p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       if (PatchProxy.applyVoid(null, tb, e.class, "8")) {
       }else {
          b9.a(tb.E);
          tb.E = RxBus.f.g(l.class, RxBus$ThreadMode.MAIN).subscribe(new f(tb));
       }
       o0.k(tb.getContext(), d.a(-1712118428).ne(tb.getContext(), d0.a(tb.p.r5()), "live_sport_medal", 158, null, tb.p.r5().mEntity, null, null, null));
       return;
    }
}
