package com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter$a;
import qw6.a;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qh.e;
import com.kwai.framework.model.feed.BaseFeed;
import com.gifshow.kuaishou.thanos.milano.MilanoAttachCallbackPresenter$ContainerPhotoState;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import ef5.c;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.slide.milano.listener.sticky.ContainerPhotoState;
import ef5.a;
import java.util.Iterator;
import java.lang.Iterable;
import df5.b;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache;
import java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock;
import java.util.Map;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache$a;
import com.yxcorp.gifshow.util.LatestBrowsedFeedCache$Operation;
import mrd.a;

public class MilanoAttachCallbackPresenter$a implements a	// class@0015d2
{
    public final MilanoAttachCallbackPresenter b;

    public void MilanoAttachCallbackPresenter$a(MilanoAttachCallbackPresenter p0){
       this.b = p0;
       super();
    }
    public void H2(){
       if (PatchProxy.applyVoid(null, this, MilanoAttachCallbackPresenter$a.class, "2")) {
          return;
       }
       this.b.P8();
       return;
    }
    public void N2(){
    }
    public void Q0(){
       if (PatchProxy.applyVoid(null, this, MilanoAttachCallbackPresenter$a.class, "3")) {
          return;
       }
       this.b.R8();
       return;
    }
    public void Q1(){
       ReentrantReadWriteLock$WriteLock c;
       MilanoAttachCallbackPresenter milanoAttach = MilanoAttachCallbackPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MilanoAttachCallbackPresenter$a.class, "1")) {
          return;
       }
       this.b.R8();
       MilanoAttachCallbackPresenter$a tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(objArray, tb, milanoAttach, "4")) {
          QPhoto currentPhoto = tb.r.getCurrentPhoto();
          tb.q = currentPhoto;
          if (currentPhoto == null) {
             tb.t.b();
             MilanoAttachCallbackPresenter r = tb.r;
             currentPhoto = r.n(r.a0());
             if (currentPhoto != null && currentPhoto.getEntity() != null) {
                tb.q = currentPhoto;
             }else {
                tb.t.b();
             }
          }
       }
       tb = this.b;
       Objects.requireNonNull(tb);
       String str = "5";
       if (!PatchProxy.applyVoid(objArray, tb, milanoAttach, str)) {
          milanoAttach = tb.q;
          if (tb.v == MilanoAttachCallbackPresenter$ContainerPhotoState.NO_PHOTO_ATTACH && milanoAttach != null) {
             MilanoAttachCallbackPresenter t = tb.t;
             Objects.requireNonNull(t);
             if (!PatchProxy.applyVoidOneRefs(milanoAttach, t, e.class, str)) {
                Log.g("MilanoContainer", "pageSessionId="+t.b+": BecomesAttached photoId="+milanoAttach.getPhotoId());
             }
             t = tb.s;
             Objects.requireNonNull(t);
             if (!PatchProxy.applyVoidOneRefs(milanoAttach, t, c.class, "2")) {
                a.p(milanoAttach, "photo");
                t.c = ContainerPhotoState.BECAME_ATTACH;
                t.b = milanoAttach;
                Iterator iterator = t.a.iterator();
                while (iterator.hasNext()) {
                   iterator.next().b(milanoAttach);
                }
             }
             Objects.requireNonNull(LatestBrowsedFeedCache.h);
             QPhoto mEntity = milanoAttach.mEntity;
             if (mEntity != null) {
                String id = mEntity.getId();
                if (id != null) {
                   a.o(id, "photo?.mEntity?.id ?: return");
                   c = LatestBrowsedFeedCache.c;
                   c.lock();
                   LatestBrowsedFeedCache.d.put(id, milanoAttach);
                   LatestBrowsedFeedCache.e = milanoAttach;
                   LatestBrowsedFeedCache.f = true;
                   LatestBrowsedFeedCache.g.onNext(new LatestBrowsedFeedCache$a(milanoAttach, LatestBrowsedFeedCache$Operation.ACTIVE));
                   c.unlock();
                }
             }
             tb.v = MilanoAttachCallbackPresenter$ContainerPhotoState.BECAME_ATTACH;
          }else {
             Log.g("MilanoAttachP", "callBecomeAttached\(\) failed : mCurrentState ="+tb.v.toString()+" photo=["+milanoAttach+"]");
          }
       }
       return;
    }
}
