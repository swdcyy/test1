package com.kuaishou.live.lite.watchingcount.b;
import msd.a;
import com.kuaishou.live.lite.watchingcount.LiveLiteWatchingCountPresenter;
import java.lang.Object;
import java.util.Objects;
import xd3.p;
import com.kuaishou.android.model.feed.LiveStreamFeedWrapper;
import or5.b;
import xd3.e;
import java.lang.String;
import xp5.g;
import androidx.lifecycle.LifecycleOwner;
import o63.a;
import xp5.i;
import com.kuaishou.live.lite.framework.basicservice.LiveLiteScatterLoadManager;
import wy1.v;
import eq3.d;
import b93.d;
import xd3.b;
import com.kuaishou.live.lite.anchorinfo.LiveLiteAnchorInfoAreaService;
import com.kuaishou.live.viewcontroller.ViewController;
import qrd.l1;

public final class b implements a	// class@000bb2
{
    public final LiveLiteWatchingCountPresenter b;
    public final boolean c;

    public void b(LiveLiteWatchingCountPresenter p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object invoke(){
       b tb = this.b;
       Objects.requireNonNull(tb);
       if (this.c != null) {
          p op = new p(tb.v.r5(), tb, tb.I, new e(tb), tb.M, tb.K, tb.x.d(), tb.J);
          tb.M.n = v10.e;
          tb.P8().xg(new b(tb.G, v10));
       }
       return l1.a;
    }
}
