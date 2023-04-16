package com.yxcorp.gifshow.hot.stagger.http.HotPreFetchFeedProcessor;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.hot.stagger.http.HotPreFetchFeedProcessor$a;
import com.yxcorp.gifshow.hot.stagger.http.HotPreFetchFeedProcessor$mLiveStatusQueryHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import tc5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;

public final class HotPreFetchFeedProcessor	// class@0018a6
{
    public HomeFeedResponse a;
    public final Handler b;
    public long c;
    public CopyOnWriteArrayList d;
    public final f e;
    public final p f;

    public void HotPreFetchFeedProcessor(){
       super();
       this.b = new Handler(Looper.getMainLooper());
       this.e = new HotPreFetchFeedProcessor$a(this);
       this.f = s.c(new HotPreFetchFeedProcessor$mLiveStatusQueryHelper$2(this));
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, HotPreFetchFeedProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.f.getValue();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, HotPreFetchFeedProcessor.class, "4")) {
          return;
       }
       this.a().release();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, HotPreFetchFeedProcessor.class, "3")) {
          return;
       }
       this.a().a(this.d);
       return;
    }
}
