package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$mBackgroundRunnable$1;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import rd5.a;
import android.app.Activity;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import rd5.a$a;
import m3a.q;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import k2b.e0;
import com.kwai.sdk.switchconfig.a;
import android.os.Build$VERSION;
import tkd.b;
import tkd.d;
import fp5.a;
import android.content.Context;
import java.util.Objects;
import android.os.PowerManager;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$mBackgroundRunnable$1$1;
import msd.a;
import com.kwai.performance.monitor.base.Monitor_ThreadKt;

public final class PictureInPicturePresenter$mBackgroundRunnable$1 implements Runnable	// class@0016bf
{
    public final PictureInPicturePresenter b;

    public void PictureInPicturePresenter$mBackgroundRunnable$1(PictureInPicturePresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       q a;
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter$mBackgroundRunnable$1.class, "1")) {
          return;
       }
       PictureInPicturePresenter$mBackgroundRunnable$1 tb = this.b;
       if (tb.E != null) {
          a.c.b(tb.getActivity());
          a = q.a;
          PictureInPicturePresenter x = this.b.x;
          QPhoto currentPhoto = (x != null)? x.getCurrentPhoto(): null;
          a.a(currentPhoto, PictureInPicturePresenter.P8(this.b), "CLOSE");
          if (a.t().d("disablePipScreenReceiver", false)) {
             return;
          }else if(Build$VERSION.SDK_INT == 29 && d.a(0x31a55ac8).s0(this.b.getActivity())){
             Context context = this.b.getContext();
             Object[] systemServic = (context != null)? context.getSystemService("power"): null;
             Objects.requireNonNull(systemServic, "null cannot be cast to non-null type android.os.PowerManager");
             if (!systemServic.isInteractive()) {
                Monitor_ThreadKt.e(0, new PictureInPicturePresenter$mBackgroundRunnable$1$1(this), 1, null);
             }
          }
       }
    label_0085 :
       return;
    }
}
