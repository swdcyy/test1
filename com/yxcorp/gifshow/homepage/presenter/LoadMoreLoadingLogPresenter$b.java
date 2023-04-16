package com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter$b;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.homepage.presenter.LoadMoreLoadingLogPresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import lnc.o8$a;
import lnc.o8;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import qvb.n0;
import android.os.SystemClock;

public final class LoadMoreLoadingLogPresenter$b extends RecyclerView$r	// class@001795
{
    public o8$a a;
    public final LoadMoreLoadingLogPresenter b;

    public void LoadMoreLoadingLogPresenter$b(LoadMoreLoadingLogPresenter p0){
       this.b = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       RecyclerView recyclerView;
       if (PatchProxy.isSupport(LoadMoreLoadingLogPresenter$b.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LoadMoreLoadingLogPresenter$b.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       if (p2 > 0) {
          o8$a uoa = o8.a(this.b.P8().h0());
          a.o(uoa, "RecyclerViewItemExposeHe¡­n\(mFragment.recyclerView\)");
          this.a = uoa;
          int i = uoa.b + 1;
          recyclerView = this.b.P8().h0();
          a.o(recyclerView, "mFragment.recyclerView");
          RecyclerView$Adapter adapter = recyclerView.getAdapter();
          if (adapter != null && i == adapter.getItemCount()) {
             LoadMoreLoadingLogPresenter$b tb = this.b;
             if (tb.t == null) {
                Objects.requireNonNull(tb);
                LoadMoreLoadingLogPresenter loadMoreLoad = PatchProxy.apply(null, tb, LoadMoreLoadingLogPresenter.class, "4");
                if (loadMoreLoad != PatchProxyResult.class) {
                }else {
                   loadMoreLoad = tb.q;
                   if (loadMoreLoad == null) {
                      a.S("mPageList");
                   }
                }
                if (loadMoreLoad.isLoading()) {
                   tb.u = SystemClock.elapsedRealtime();
                   tb.t = true;
                }
             }
          }
       }
       return;
    }
}
