package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$onBind$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import ada.a;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.android.model.mix.PhotoMeta;
import kp.r1;
import com.yxcorp.gifshow.postwork.PostStatus;
import android.view.View;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import io.reactivex.subjects.PublishSubject;

public final class PhotoSharePresenter$onBind$1 extends FunctionReferenceImpl implements l	// class@0017ac
{

    public void PhotoSharePresenter$onBind$1(PhotoSharePresenter p0){
       super(1, p0, PhotoSharePresenter.class, "onPhotoClick", "onPhotoClick\(Lcom/yxcorp/gifshow/event/detail/PhotoDetailClick;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(a p0){
       PostStatus postStatus;
       if (PatchProxy.applyVoidOneRefs(p0, this, PhotoSharePresenter$onBind$1.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, PhotoSharePresenter.class, "21")) {
          a a = (p0 != null)? p0.a: null;
          if (a != null) {
             p0 = p0.a;
             a.m(p0);
             PhotoMeta photoMeta = r1.u1(p0);
             PostStatus uPLOAD_COMPL = PostStatus.UPLOAD_COMPLETE;
             photoMeta = (photoMeta != null)? photoMeta.mPostWorkStatus: null;
             if (uPLOAD_COMPL == photoMeta) {
                View[] viewArray = new View[]{treceiver.C,treceiver.B,treceiver.D};
                n.Z(8, viewArray);
                Boolean fALSE = Boolean.FALSE;
                treceiver.y.onNext(fALSE);
                treceiver.A.onNext(fALSE);
                PhotoSharePresenter b = treceiver.B;
                if (b != null) {
                   b.invalidate();
                }
                b = treceiver.p;
                if (b == null) {
                   a.S("mPhotoMeta");
                }
                b.mPostWorkStatus = null;
             }
          }
       }
    label_006e :
       return;
    }
}
