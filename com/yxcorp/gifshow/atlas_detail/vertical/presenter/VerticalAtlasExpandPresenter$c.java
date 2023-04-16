package com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter$c;
import uw9.y;
import com.yxcorp.gifshow.atlas_detail.vertical.presenter.VerticalAtlasExpandPresenter;
import java.lang.Object;
import uw9.x;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.Objects;
import im8.f;
import android.view.ViewGroup;

public final class VerticalAtlasExpandPresenter$c implements y	// class@001bd0
{
    public final VerticalAtlasExpandPresenter a;

    public void VerticalAtlasExpandPresenter$c(VerticalAtlasExpandPresenter p0){
       this.a = p0;
       super();
    }
    public void a(){
       x.a(this);
    }
    public void e(RecyclerView p0,int p1,int p2){
       VerticalAtlasExpandPresenter$c ta;
       VerticalAtlasExpandPresenter u;
       if (PatchProxy.isSupport(VerticalAtlasExpandPresenter$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VerticalAtlasExpandPresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p2) {
          ta = this.a;
          ta.R = ta.R + p2;
       }else {
          int i1 = p0.computeVerticalScrollOffset();
          VerticalAtlasExpandPresenter$c ta1 = this.a;
          if (ta1.R == i1) {
             return;
          }else {
             ta1.R = i1;
          }
       }
       ta = this.a;
       Objects.requireNonNull(ta);
       int i = 1;
       if (!PatchProxy.applyVoid(null, ta, VerticalAtlasExpandPresenter.class, "29")) {
          u = ta.y;
          if (u == null) {
             a.S("mOuterSlideLongAtlasRecyclerView");
          }
          ta.V = u.get().canScrollVertically(-1) ^ i;
       }
       ta = this.a;
       if (ta.W != null) {
          u = ta.U;
          if (u != null && (u + ta.V0) < ta.R) {
             i = 0;
          }
          if (i) {
             ta.e9(p2);
          }
       }
       return;
    }
}
