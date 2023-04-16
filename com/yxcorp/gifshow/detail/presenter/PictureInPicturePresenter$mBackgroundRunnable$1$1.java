package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$mBackgroundRunnable$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$mBackgroundRunnable$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import tkd.b;
import tkd.d;
import fp5.a;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;

public final class PictureInPicturePresenter$mBackgroundRunnable$1$1 extends Lambda implements a	// class@0016be
{
    public final PictureInPicturePresenter$mBackgroundRunnable$1 this$0;

    public void PictureInPicturePresenter$mBackgroundRunnable$1$1(PictureInPicturePresenter$mBackgroundRunnable$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       if (PatchProxy.applyVoid(null, this, PictureInPicturePresenter$mBackgroundRunnable$1$1.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("PictureInPicturePresent", "moveTaskToBack", objArray);
       d.a(0x31a55ac8).Nd(PictureInPicturePresenter.P8(this.this$0.b).getActivity());
       return;
    }
}
