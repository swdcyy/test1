package com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter$k;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.detail.presenter.PictureInPicturePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.BitSet;
import java.lang.Float;

public final class PictureInPicturePresenter$k implements SlidingPaneLayout$d	// class@0016bc
{
    public final PictureInPicturePresenter a;

    public void PictureInPicturePresenter$k(PictureInPicturePresenter p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter$k.class, "3")) {
          return;
       }
       a.p(p0, "panel");
       this.a.B.clear(2);
       return;
    }
    public void b(View p0,float p1){
       if (PatchProxy.isSupport(PictureInPicturePresenter$k.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, PictureInPicturePresenter$k.class, "1")) {
          return;
       }
       a.p(p0, "panel");
       this.a.B.set(2);
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PictureInPicturePresenter$k.class, "2")) {
          return;
       }
       a.p(p0, "panel");
       return;
    }
}
