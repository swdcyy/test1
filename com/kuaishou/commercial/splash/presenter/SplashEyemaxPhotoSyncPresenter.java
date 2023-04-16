package com.kuaishou.commercial.splash.presenter.SplashEyemaxPhotoSyncPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.commercial.splash.presenter.SplashEyemaxPhotoSyncPresenter$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import bz.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import com.kuaishou.commercial.splash.presenter.SplashEyemaxPhotoSyncPresenter$onBind$1;
import gz.e2;
import msd.l;
import erd.g;
import crd.b;
import yx.j0;
import com.yxcorp.gifshow.entity.QPhoto;
import n49.s;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.kwai.framework.model.user.User;

public final class SplashEyemaxPhotoSyncPresenter extends PresenterV2	// class@0015cf
{
    public QPhoto p;
    public static final SplashEyemaxPhotoSyncPresenter$a q;

    static {
       SplashEyemaxPhotoSyncPresenter.q = new SplashEyemaxPhotoSyncPresenter$a(null);
    }
    public void SplashEyemaxPhotoSyncPresenter(){
       super();
    }
    public void E8(){
       SplashEyemaxPhotoSyncPresenter splashEyemax = SplashEyemaxPhotoSyncPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, splashEyemax, "2")) {
          return;
       }
       this.X7(RxBus.f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new e2(new SplashEyemaxPhotoSyncPresenter$onBind$1(this))));
       if (!PatchProxy.applyVoid(objArray, this, splashEyemax, "4")) {
          Object[] objArray1 = new Object[0];
          j0.f("SplashPhotoSyncPresenter", "sync photo with updated photo", objArray1);
          splashEyemax = this.p;
          if (splashEyemax != null) {
             objArray = splashEyemax.getPhotoId();
          }
          this.P8(s.o(objArray));
       }
       return;
    }
    public final void P8(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SplashEyemaxPhotoSyncPresenter.class, "5")) {
          return;
       }
       SplashEyemaxPhotoSyncPresenter tp = this.p;
       if (tp != null) {
          if (p0 != null) {
             PhotoMeta photoMeta = p0.getPhotoMeta();
             if (photoMeta != null) {
                PhotoMeta photoMeta1 = tp.getPhotoMeta();
                if (photoMeta1 != null) {
                   photoMeta1.sync(photoMeta);
                }
             }
          }
          if (p0 != null) {
             User user = p0.getUser();
             if (user != null) {
                User user1 = tp.getUser();
                if (user1 != null) {
                   user1.sync(user);
                }
             }
          }
       }
    label_0031 :
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, SplashEyemaxPhotoSyncPresenter.class, "1")) {
          return;
       }
       this.p = this.s8(QPhoto.class);
       return;
    }
}
