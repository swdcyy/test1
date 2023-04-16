package com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter$d;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.detail.slideplay.presenter.SlidePlayAtlasBaseTouchPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;

public final class SlidePlayAtlasBaseTouchPresenter$d extends RecyclerView$r	// class@001837
{
    public final SlidePlayAtlasBaseTouchPresenter a;

    public void SlidePlayAtlasBaseTouchPresenter$d(SlidePlayAtlasBaseTouchPresenter p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       SlidePlayAtlasBaseTouchPresenter$d uod = SlidePlayAtlasBaseTouchPresenter$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uod, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p1) {
          if (p1 != 1) {
             this.a.R8();
          }else {
             SlidePlayAtlasBaseTouchPresenter$d ta = this.a;
             Objects.requireNonNull(ta);
             if (!PatchProxy.applyVoid(null, ta, SlidePlayAtlasBaseTouchPresenter.class, "21")) {
                ta.R8();
             }
          }
       }else {
          this.a.j9();
       }
       return;
    }
}
