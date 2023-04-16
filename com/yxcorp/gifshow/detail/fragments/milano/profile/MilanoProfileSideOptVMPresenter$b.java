package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import kotlin.jvm.internal.a;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$b$a;
import android.view.ViewGroup;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f;

public final class MilanoProfileSideOptVMPresenter$b implements Runnable	// class@001532
{
    public final MilanoProfileSideOptVMPresenter b;

    public void MilanoProfileSideOptVMPresenter$b(MilanoProfileSideOptVMPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MilanoProfileSideOptVMPresenter$b.class, "1")) {
          return;
       }
       MilanoProfileSideOptVMPresenter$b tb = this.b;
       if (tb.g1 == null) {
          return;
       }
       tb.m9();
       MilanoProfileSidePresenter z = this.b.z;
       a.o(z, "mProfilePhotosRecyclerView");
       RecyclerView$LayoutManager layoutManage = z.getLayoutManager();
       if (layoutManage instanceof LinearLayoutManager) {
          objArray = layoutManage;
       }
       if (objArray != null) {
          z = this.b.P;
          a.o(z, "mSlidePlayViewModel");
          if (z.F0().indexOf(this.b.C) || objArray.h()) {
             tb = this.b;
             MilanoProfileSidePresenter g1 = tb.g1;
             a.o(g1, "mProfileFeedAdapter");
             tb.s9(tb.z, objArray, g1.Z0(g1.Y0()), false);
          }else {
             this.b.z.post(new MilanoProfileSideOptVMPresenter$b$a(this));
          }
       }
       return;
    }
}
