package com.yxcorp.gifshow.detail.fragments.milano.profile.m;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import java.lang.Object;
import java.util.List;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import z0a.i0;
import android.view.ViewGroup;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f;

public final class m implements Runnable	// class@00155b
{
    public final MilanoProfileSidePresenter b;
    public final boolean c;

    public void m(MilanoProfileSidePresenter p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void run(){
       m tb = this.b;
       m tc = this.c;
       if (tb.g1 == null) {
       }else {
          boolean b = true;
          if (!tb.P.F0().contains(tb.C) && tc != null) {
             tb.P.K1(b);
             tb.P.u1();
          }else {
             tb.P.L1(b);
             tb.m9();
             tb.t9();
             LinearLayoutManager layoutManage = tb.z.getLayoutManager();
             if (tb.g1 == null || (tb.S != null && layoutManage != null)) {
                if (tb.P.F0().indexOf(tb.C) || layoutManage.h()) {
                   MilanoProfileSidePresenter g1 = tb.g1;
                   tb.s9(tb.z, layoutManage, g1.Z0(g1.Y0()), false);
                }else {
                   tb.z.post(new i0(tb));
                }
             }
          }
       }
       return;
    }
}
