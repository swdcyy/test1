package fia.r;
import erd.g;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import bia.h;
import g9c.a;
import java.util.List;
import java.lang.Iterable;
import wsd.m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideInternalPymiListPresenter$bindFollowStateObservable$3$infoList$1;
import msd.l;
import kotlin.sequences.SequencesKt___SequencesKt;
import xl8.b;
import com.yxcorp.gifshow.follow.common.data.PymiTipsShowResponse;
import android.view.View;
import com.yxcorp.utility.n;

public final class r implements g	// class@002934
{
    public final FollowSlideInternalPymiListPresenter b;

    public void r(FollowSlideInternalPymiListPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, r.class, "1")) {
       }else {
          int i = 1;
          r or = (p0 == null || !p0.length())? 1: null;
          if (!or && !this.b.V8().R0()) {
             List list = this.b.V8().Q0();
             if (list != null) {
                m om = CollectionsKt___CollectionsKt.l1(list);
                if (om != null) {
                   p0 = SequencesKt___SequencesKt.i0(om, new FollowSlideInternalPymiListPresenter$bindFollowStateObservable$3$infoList$1(p0));
                   if (p0 != null) {
                      p0 = SequencesKt___SequencesKt.V2(p0);
                   label_004d :
                      this.b.P8(p0);
                      if (this.b.V8().R0()) {
                         this.b.S8().d(new PymiTipsShowResponse());
                         View[] viewArray = new View[i];
                         viewArray[0] = this.b.t;
                         n.Z(8, viewArray);
                      }
                   }
                }
             }
             p0 = null;
             goto label_004d ;
          }
       }
    label_0079 :
       return;
    }
}
