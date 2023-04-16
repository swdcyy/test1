package bdc.h;
import bdc.c;
import java.lang.String;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import crd.a;
import bdc.h$a;
import qvb.q;
import qvb.j;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import crd.b;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.events.realaction.RealAction;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import bdc.d;
import erd.r;
import bdc.f;
import qvb.i;
import bdc.g;
import erd.g;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import com.kwai.framework.model.user.User;
import bdc.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.CommonMeta;
import kp.r1;
import com.kuaishou.android.model.mix.FeedFriendInfo;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import bdc.b;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.reminder.friend.data.FriendSlidePlayFeedResponse;
import java.util.Collections;
import la6.b;

public final class h extends c	// class@000459
{
    public a h;
    public q i;
    public boolean j;
    public QPhoto k;

    public void h(){
       super(1, "friend_tab_cache", 0, true, true, 4, null);
    }
    public void c(){
       h oh = h.class;
       if (PatchProxy.applyVoid(null, this, oh, "1")) {
          return;
       }
       super.c();
       this.j = true;
       this.h = new a();
       h$a uoa = new h$a(this);
       c ta = this.a;
       if (ta != null) {
          ta.h(uoa);
       }
       this.i = uoa;
       c ta1 = this.a;
       if (ta1 != null) {
          if (PatchProxy.applyOneRefs(ta1, this, oh, "3") != PatchProxyResult.class) {
          }else {
             b uob = RxBus.f.g(RealAction.class, RxBus$ThreadMode.MAIN).filter(new d(this)).subscribe(new f(this, ta1), new g(this));
             h th = this.h;
             if (th != null) {
                th.c(uob);
             }
          }
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       super.e();
       h th = this.h;
       if (th != null) {
          th.dispose();
       }
       this.h = null;
       th = this.i;
       if (th != null) {
          c ta = this.a;
          if (ta != null) {
             ta.f(th);
          }
          this.i = null;
       }
       this.k = null;
       return;
    }
    public final boolean i(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (p0 != null) {
          User user = p0.getUser();
          if (user != null && (user.isFollowingOrFollowRequesting() == b && a.b(p0))) {
          label_002a :
             return b;
          }
       }
       b = false;
       goto label_002a ;
    }
    public final boolean j(BaseFeed p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, h.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       CommonMeta mFeedFriendI = r1.w0(p0).mFeedFriendInfo;
       boolean b = true;
       if (mFeedFriendI == null || mFeedFriendI.mHasRead != b) {
          b = false;
       }
       return b;
    }
    public final boolean k(List p0){
       l1 ol1;
       l1 obj = PatchProxy.applyOneRefs(p0, this, h.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = null;
       if (p0 != null) {
          Iterator iterator = p0.iterator();
          while (true) {
             if (iterator.hasNext()) {
                ol1 = iterator.next();
                if (!this.i(ol1)) {
                   continue ;
                }
             }else {
                ol1 = obj;
             }
             if (ol1 != null) {
                this.l(ol1);
                obj = l1.a;
             }
          }
       }
       boolean b = (obj != null)? true: false;
       return b;
    }
    public final void l(QPhoto p0){
       String str;
       String str1;
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "6")) {
          return;
       }
       if (this.k == p0) {
          Object[] objArray = new Object[]{str,str1};
          h tk = this.k;
          a.m(tk);
          str = r1.t1(tk.mEntity);
          a.o(str, "FeedExt.getPhotoId\(lastCachePhoto!!.mEntity\)");
          str1 = r1.t1(p0.mEntity);
          a.o(str1, "FeedExt.getPhotoId\(photo.mEntity\)");
          this.h().j("Save to cache discard as same photo[%1$s] - [%2$s]", objArray);
          return;
       }else {
          this.k = p0;
          FriendSlidePlayFeedResponse uFriendSlide = new FriendSlidePlayFeedResponse();
          uFriendSlide.mPhotos = Collections.singletonList(p0);
          this.h().k(uFriendSlide, FriendSlidePlayFeedResponse.class);
          return;
       }
    }
}
