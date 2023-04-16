package com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter$c;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.homepage.presenter.PhotoSharePresenter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import gzc.a;
import java.util.List;
import g9c.a;
import v8c.a;

public final class PhotoSharePresenter$c extends RecyclerView$r	// class@00179d
{
    public final PhotoSharePresenter a;

    public void PhotoSharePresenter$c(PhotoSharePresenter p0){
       this.a = p0;
       super();
    }
    public void b(RecyclerView p0,int p1,int p2){
       if (PatchProxy.isSupport(PhotoSharePresenter$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, PhotoSharePresenter$c.class, "1")) {
          return;
       }
       a.p(p0, "recyclerView");
       PhotoSharePresenter h = this.a.H;
       a.m(h);
       RecyclerView$LayoutManager layoutManage = h.getLayoutManager();
       PhotoSharePresenter h1 = this.a.H;
       if (h1 == null || (!h1.getVisibility() && layoutManage instanceof LinearLayoutManager)) {
          h1 = layoutManage.i0();
          int i = layoutManage.c();
          PhotoSharePresenter$c uoc = -1;
          if (h1 != uoc && i != uoc) {
             i++;
             while (h1 < i) {
                if (h1 < this.a.Y8().Q0().size()) {
                   uoc = this.a;
                   if (!uoc.X.contains(uoc.Y8().Q0().get(h1).a())) {
                      uoc = this.a;
                      uoc.k9(uoc.Y8().Q0().get(h1).a());
                      uoc = this.a;
                      uoc.X.add(uoc.Y8().Q0().get(h1).a());
                   }
                }
                h1++;
             }
          }
       }
       return;
    }
}
