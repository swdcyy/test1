package com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter$g;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.SlideVerticalAtlasExpandPresenter;
import java.lang.Object;
import d0a.p;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;

public final class SlideVerticalAtlasExpandPresenter$g implements g	// class@001930
{
    public final SlideVerticalAtlasExpandPresenter b;

    public void SlideVerticalAtlasExpandPresenter$g(SlideVerticalAtlasExpandPresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlideVerticalAtlasExpandPresenter$g.class, "1")) {
       }else {
          a.p(p0, "event");
          SlideVerticalAtlasExpandPresenter u = this.b.u;
          if (u != null) {
             RecyclerView$LayoutManager layoutManage = u.getLayoutManager();
             if (layoutManage instanceof LinearLayoutManager) {
                layoutManage.scrollToPositionWithOffset(p0.a, p0.b);
             }
          }
       }
       return;
    }
}
