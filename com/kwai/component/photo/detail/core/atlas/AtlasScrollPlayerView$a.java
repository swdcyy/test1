package com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView$a;
import androidx.recyclerview.widget.RecyclerView$r;
import com.kwai.component.photo.detail.core.atlas.AtlasScrollPlayerView;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import android.view.ViewGroup;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.util.Objects;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Collection;
import jd5.g;

public class AtlasScrollPlayerView$a extends RecyclerView$r	// class@000a10
{
    public final AtlasScrollPlayerView a;

    public void AtlasScrollPlayerView$a(AtlasScrollPlayerView p0){
       this.a = p0;
       super();
    }
    public void a(RecyclerView p0,int p1){
       if (PatchProxy.isSupport(AtlasScrollPlayerView$a.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, AtlasScrollPlayerView$a.class, "1")) {
          return;
       }
       if (p1) {
          return;
       }
       AtlasScrollPlayerView$a ta = this.a;
       Objects.requireNonNull(this.a.b);
       if (this.a.c.getPosition(ta.getChildAt((ta.getChildCount() - 1))) == 0x7ffffffd) {
          ta = this.a;
          if (ta.d != null) {
             ta.y();
          }
       }
       return;
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(AtlasScrollPlayerView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, AtlasScrollPlayerView$a.class, "2")) {
          return;
       }
       p1 = this.a.c.i0();
       View childAt = p0.getChildAt(0);
       if (childAt == null) {
          return;
       }
       int top = childAt.getTop();
       AtlasScrollPlayerView$a ta = this.a;
       if (ta.h == null) {
          g.o(ta.j, p1, top, ta.d);
       }
       return;
    }
}
