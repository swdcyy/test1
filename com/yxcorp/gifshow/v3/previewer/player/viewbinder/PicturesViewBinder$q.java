package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$q;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Objects;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;

public final class PicturesViewBinder$q extends RecyclerView$r	// class@0015fe
{
    public final PicturesViewBinder a;

    public void PicturesViewBinder$q(PicturesViewBinder p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(PicturesViewBinder$q.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PicturesViewBinder$q.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (this.a.j.getLayoutManager() instanceof LinearLayoutManager && !this.a.G()) {
          RecyclerView$LayoutManager layoutManage = this.a.j.getLayoutManager();
          Objects.requireNonNull(layoutManage, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
          this.a.J.o0(layoutManage.i0());
       }
       return;
    }
}
