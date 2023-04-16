package com.kuaishou.live.rerank.f$d;
import bp3.c;
import com.kuaishou.live.rerank.f;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Number;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Boolean;
import java.util.Set;
import java.util.Objects;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle$State;
import rf5.u;
import com.kuaishou.live.rerank.LiveRerankLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Iterator;
import com.kuaishou.live.rerank.LiveRerankFeedItem;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import yp.x;
import java.lang.Integer;

public class f$d implements c	// class@000f6b
{
    public final f a;

    public void f$d(f p0){
       this.a = p0;
       super();
    }
    public List e0(){
       Object obj = PatchProxy.apply(null, this, f$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.r.i0();
    }
    public int f(){
       Object obj = PatchProxy.apply(null, this, f$d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.a.p.f();
    }
    public boolean f0(QPhoto p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.a.t.contains(p0.getLiveStreamId());
    }
    public boolean g0(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       f$d obj = PatchProxy.apply(objArray, this, f$d.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, f.class, "11");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.p.Vg().c() && obj.p.getLifecycle().getCurrentState() == Lifecycle$State.RESUMED){
          b = true;
       }else {
          b = false;
       }
       return b;
    }
    public QPhoto getCurrentPhoto(){
       Object obj = PatchProxy.apply(null, this, f$d.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.a.r.getCurrentPhoto();
    }
    public void h0(List p0){
       Object obj = this;
       Iterator obj1 = p0;
       if (PatchProxy.applyVoidOneRefs(obj1, obj, f$d.class, "4")) {
          return;
       }
       f$d a = obj.a;
       Objects.requireNonNull(a);
       if (!PatchProxy.applyVoidOneRefs(obj1, a, f.class, "10")) {
          if (a.q.w()) {
             b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "replace feed failed, side bar is expanded");
          }else {
             obj1 = p0.iterator();
             while (obj1.hasNext()) {
                LiveRerankFeedItem liveRerankFe = obj1.next();
                if (liveRerankFe.mLiveStreamFeed == null || TextUtils.x(liveRerankFe.mLiveStreamId)) {
                }else {
                   int i = TextUtils.n(liveRerankFe.mLiveStreamId, r1.n1(liveRerankFe.mLiveStreamFeed)) ^ 1;
                   int i1 = 0;
                   int i2 = -1;
                   QPhoto qPhoto = null;
                   Iterator iterator = a.r.i0().iterator();
                   while (iterator.hasNext()) {
                      QPhoto qPhoto1 = iterator.next();
                      if (!qPhoto1.isLiveStream()) {
                         continue ;
                      }else if(TextUtils.n(qPhoto1.getLiveStreamId(), liveRerankFe.mLiveStreamId)){
                         if (a.t.contains(qPhoto1.getLiveStreamId())) {
                            x.z(qPhoto1.mEntity, 3);
                            b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "replace feed failed because origin feed has been exposed");
                         }else {
                            i2 = a.r.R0(qPhoto1);
                            qPhoto = qPhoto1;
                         }
                      }
                      if (i && TextUtils.n(qPhoto1.getLiveStreamId(), r1.n1(liveRerankFe.mLiveStreamFeed))) {
                         i1 = 1;
                      }else {
                         continue ;
                      }
                   }
                   if (qPhoto != null && (i2 >= 0 && i2 < a.r.Y0())) {
                      if (i1) {
                         x.z(qPhoto.mEntity, 7);
                         b.P(LiveRerankLogTag.LIVE_RERANK.appendTag("LiveRerankPresenter"), "replace feed failed because pageList has duplicate feed");
                      }else {
                         x.z(qPhoto.mEntity, 6);
                         x.z(liveRerankFe.mLiveStreamFeed, 100);
                         a.r.H1(i2, new QPhoto(liveRerankFe.mLiveStreamFeed), 1, "LiveRerankPresenter");
                         LiveRerankLogTag lIVE_RERANK = LiveRerankLogTag.LIVE_RERANK;
                         lIVE_RERANK.appendTag("LiveRerankPresenter");
                         b.U(lIVE_RERANK, "replace feed", "origin liveStreamId", qPhoto.getLiveStreamId(), "origin feed index", Integer.valueOf(i2), "new liveStreamId", r1.n1(liveRerankFe.mLiveStreamFeed));
                      }
                   }
                }
             }
          }
       }
       return;
    }
}
