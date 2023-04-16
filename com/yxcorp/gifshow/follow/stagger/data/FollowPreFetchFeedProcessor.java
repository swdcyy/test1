package com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor;
import com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor$a;
import nsd.u;
import java.lang.Object;
import android.os.Handler;
import android.os.Looper;
import com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor$b;
import com.yxcorp.gifshow.follow.stagger.data.FollowPreFetchFeedProcessor$mLiveStatusQueryHelper$2;
import msd.a;
import qrd.p;
import qrd.s;
import tc5.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import lnc.b9;
import java.util.List;
import wca.n;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.Iterator;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;

public final class FollowPreFetchFeedProcessor	// class@00116e
{
    public HomeFeedResponse a;
    public final Handler b;
    public long c;
    public CopyOnWriteArrayList d;
    public b e;
    public b f;
    public final f g;
    public final p h;
    public static final FollowPreFetchFeedProcessor$a i;

    static {
       FollowPreFetchFeedProcessor.i = new FollowPreFetchFeedProcessor$a(null);
    }
    public void FollowPreFetchFeedProcessor(){
       super();
       this.b = new Handler(Looper.getMainLooper());
       this.g = new FollowPreFetchFeedProcessor$b(this);
       this.h = s.c(new FollowPreFetchFeedProcessor$mLiveStatusQueryHelper$2(this));
    }
    public final b a(){
       Object obj = PatchProxy.apply(null, this, FollowPreFetchFeedProcessor.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.h.getValue();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, FollowPreFetchFeedProcessor.class, "5")) {
          return;
       }
       b9.a(this.e);
       b9.a(this.f);
       this.a().release();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, FollowPreFetchFeedProcessor.class, "4")) {
          return;
       }
       this.a().a(this.d);
       return;
    }
    public final void onFollowUpdateEvent(n p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowPreFetchFeedProcessor.class, "3")) {
          return;
       }
       if (p0.d != null) {
          return;
       }
       if (p0.c == null) {
          FollowPreFetchFeedProcessor ta = this.a;
          a.m(ta);
          Iterator iterator = ta.mQPhotos.iterator();
          while (iterator.hasNext()) {
             QPhoto qPhoto = iterator.next();
             a.o(qPhoto, "qPhoto");
             if (TextUtils.n(p0.b, qPhoto.getUserId())) {
                FollowPreFetchFeedProcessor ta1 = this.a;
                a.m(ta1);
                ta1.mQPhotos.remove(qPhoto);
             }
          }
       }
       return;
    }
}
