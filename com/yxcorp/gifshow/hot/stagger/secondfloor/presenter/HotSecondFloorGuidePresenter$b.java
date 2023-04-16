package com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter$b;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.Float;
import pfa.b;

public final class HotSecondFloorGuidePresenter$b implements SlidingPaneLayout$d	// class@0018d4
{
    public final HotSecondFloorGuidePresenter a;

    public void HotSecondFloorGuidePresenter$b(HotSecondFloorGuidePresenter p0){
       this.a = p0;
       super();
    }
    public void a(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSecondFloorGuidePresenter$b.class, "3")) {
          return;
       }
       a.p(p0, "view");
       return;
    }
    public void b(View p0,float p1){
       if (PatchProxy.isSupport(HotSecondFloorGuidePresenter$b.class) && PatchProxy.applyVoidTwoRefs(p0, Float.valueOf(p1), this, HotSecondFloorGuidePresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "view");
       HotSecondFloorGuidePresenter$b ta = this.a;
       ta.v = false;
       if (HotSecondFloorGuidePresenter.R8(ta).b()) {
          this.a.W8();
       }
       return;
    }
    public void c(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSecondFloorGuidePresenter$b.class, "2")) {
          return;
       }
       a.p(p0, "view");
       return;
    }
}
