package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$c;
import java.lang.Runnable;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import kotlin.jvm.internal.a;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.StringBuilder;
import lw6.a;
import com.yxcorp.gifshow.entity.QPhoto;
import f6a.c;
import java.lang.Integer;
import im8.f;

public final class MilanoProfileSideOptVMPresenter$c implements Runnable	// class@001533
{
    public final MilanoProfileSideOptVMPresenter b;

    public void MilanoProfileSideOptVMPresenter$c(MilanoProfileSideOptVMPresenter p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, MilanoProfileSideOptVMPresenter$c.class, "1")) {
          return;
       }
       MilanoProfileSidePresenter p = this.b.P;
       String str = "mSlidePlayViewModel";
       a.o(p, str);
       if (p.C()) {
          return;
       }
       MilanoProfileSidePresenter p1 = this.b.P;
       a.o(p1, str);
       a.b(this.b.w1, "onLoadNextPageSuccess, sourceType = "+p1.a());
       MilanoProfileSideOptVMPresenter$c tb = this.b;
       int i = c.c(tb.P, tb.C);
       this.b.F.set(Integer.valueOf(i));
       this.b.P.a2(i, this.b.w1+"_loadNext");
       tb = this.b;
       tb.P.Y1(tb.C, 1, this.b.w1+"_loadNext");
       return;
    }
}
