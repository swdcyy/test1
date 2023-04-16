package com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.k;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.slideplay.nasa.vm.presenter.NasaSidebarFeedPresenter;
import java.lang.Object;
import java.util.List;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.StringBuilder;
import java.lang.String;
import com.yxcorp.gifshow.entity.QPhoto;
import k2b.u1;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import y6a.n0;
import android.view.ViewGroup;
import me5.a;

public final class k implements Runnable	// class@001822
{
    public final NasaSidebarFeedPresenter b;
    public final boolean c;

    public void k(NasaSidebarFeedPresenter p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       k tb = this.b;
       k tc = this.c;
       if (tb.p1 == null) {
       }else {
          boolean b = true;
          String str = "NasaSidebarFeedPresenter";
          if (!tb.w1.F0().contains(tb.T) && tc != null) {
             tb.w1.K1(b);
             tb.w1.u1();
             u1.Q(str, "第一屏没有当前作品，再加载一屏"+tb.T.getPhotoId());
          }else {
             u1.Q(str, "第一屏有当前作品，notifySetDataChange"+tb.T.getPhotoId());
             tb.w1.L1(b);
             tb.c9();
             tb.l9();
             LinearLayoutManager layoutManage = tb.M.getLayoutManager();
             if (tb.p1 == null || (tb.k1 != null && layoutManage != null)) {
                if (tb.w1.F0().indexOf(tb.T) || layoutManage.h()) {
                   NasaSidebarFeedPresenter p1 = tb.p1;
                   tb.e9(tb.M, layoutManage, p1.s1(p1.r1()), false);
                }else {
                   tb.M.post(new n0(tb));
                }
             }
          }
       }
       return;
    }
}
