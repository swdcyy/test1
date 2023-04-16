package com.yxcorp.gifshow.ad.detail.presenter.download.DownloadToastPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.ad.detail.presenter.download.DownloadToastPresenter$mDownloadListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.yxcorp.gifshow.ad.detail.presenter.download.DownloadToastPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import tw.j;
import com.yxcorp.gifshow.photoad.model.PhotoAdDataWrapper;
import com.kwai.framework.model.feed.BaseFeed;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import nxb.j;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public final class DownloadToastPresenter extends PresenterV2	// class@001652
{
    public QPhoto p;
    public BaseFragment q;
    public List r;
    public String s;
    public final p t;
    public final a u;

    public void DownloadToastPresenter(){
       super();
       this.t = s.c(new DownloadToastPresenter$mDownloadListener$2(this));
       this.u = new DownloadToastPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, DownloadToastPresenter.class, "3")) {
          return;
       }
       DownloadToastPresenter tp = this.p;
       String str = "mPhoto";
       if (tp == null) {
          a.S(str);
       }
       if (!j.D(tp)) {
          return;
       }else {
          DownloadToastPresenter tp1 = this.p;
          if (tp1 == null) {
             a.S(str);
          }
          this.s = new PhotoAdDataWrapper(tp1.mEntity).getUrl();
          tp = this.q;
          str = "mFragment";
          if (tp == null) {
             a.S(str);
          }
          SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(tp.getParentFragment());
          if (slidePlayVie != null) {
             tp1 = this.q;
             if (tp1 == null) {
                a.S(str);
             }
             slidePlayVie.P(tp1, this.u);
          }else {
             tp = this.r;
             if (tp == null) {
                a.S("mAttachListeners");
             }
             tp.add(this.u);
          }
          return;
       }
    }
    public final j P8(){
       Object obj = PatchProxy.apply(null, this, DownloadToastPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.t.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, DownloadToastPresenter.class, "2")) {
          return;
       }
       Object obj = this.q8(QPhoto.class);
       a.o(obj, "inject\(QPhoto::class.java\)");
       this.p = obj;
       obj = this.r8("DETAIL_FRAGMENT");
       a.o(obj, "inject\(AccessIds.DETAIL_FRAGMENT\)");
       this.q = obj;
       obj = this.r8("DETAIL_ATTACH_LISTENERS");
       a.o(obj, "inject\(AccessIds.DETAIL_ATTACH_LISTENERS\)");
       this.r = obj;
       return;
    }
}
