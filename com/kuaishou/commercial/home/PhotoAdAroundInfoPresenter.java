package com.kuaishou.commercial.home.PhotoAdAroundInfoPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import com.kuaishou.commercial.home.PhotoAdAroundInfoPresenter$mAroundInfoListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Objects;
import qvb.i;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.g;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.commercial.home.PhotoAdAroundInfoPresenter$mAroundInfoListener$2$a;
import java.util.Map;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class PhotoAdAroundInfoPresenter extends PresenterV2	// class@0014cd
{
    public BaseFragment p;
    public QPhoto q;
    public final int r;
    public i s;
    public final p t;

    public void PhotoAdAroundInfoPresenter(){
       super();
       this.r = a1.g() / 3;
       this.t = s.c(new PhotoAdAroundInfoPresenter$mAroundInfoListener$2(this));
    }
    public void E8(){
       Map a;
       PhotoAdAroundInfoPresenter photoAdAroun = PhotoAdAroundInfoPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, photoAdAroun, "7")) {
          return;
       }
       PhotoAdAroundInfoPresenter tp = this.p;
       String str = "mFragment";
       if (tp == null) {
          a.S(str);
       }
       if (tp instanceof RecyclerFragment) {
          tp = this.p;
          if (tp == null) {
             a.S(str);
          }
          Objects.requireNonNull(tp, "null cannot be cast to non-null type com.yxcorp.gifshow.recycler.fragment.RecyclerFragment<com.yxcorp.gifshow.entity.QPhoto>");
          this.s = tp.q();
       }
       tp = this.q;
       str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       if (tp.isAd()) {
          a = g.a;
          PhotoAdAroundInfoPresenter tq = this.q;
          if (tq == null) {
             a.S(str);
          }
          str = tq.getPhotoId();
          PhotoAdAroundInfoPresenter$mAroundInfoListener$2$a omAroundInfo = PatchProxy.apply(objArray, this, photoAdAroun, "6");
          if (omAroundInfo == PatchProxyResult.class) {
             omAroundInfo = this.t.getValue();
          }
          a.put(str, omAroundInfo);
       }
       return;
    }
    public void J8(){
       Map a;
       if (PatchProxy.applyVoid(null, this, PhotoAdAroundInfoPresenter.class, "8")) {
          return;
       }
       PhotoAdAroundInfoPresenter tq = this.q;
       String str = "mPhoto";
       if (tq == null) {
          a.S(str);
       }
       if (tq.isAd()) {
          a = g.a;
          PhotoAdAroundInfoPresenter tq1 = this.q;
          if (tq1 == null) {
             a.S(str);
          }
          a.remove(tq1.getPhotoId());
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, PhotoAdAroundInfoPresenter.class, "1")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(FRAGMENT\)");
       this.p = obj;
       obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.q = obj;
       return;
    }
}
