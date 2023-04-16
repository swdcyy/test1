package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$a;
import df5.b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import java.util.Objects;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import fx6.b;
import yw6.g;
import yw6.c;
import gx6.b;
import zy6.e;
import yw6.f;

public final class MilanoProfileSideOptVMPresenter$a implements b	// class@001530
{
    public final MilanoProfileSideOptVMPresenter a;

    public void MilanoProfileSideOptVMPresenter$a(MilanoProfileSideOptVMPresenter p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSideOptVMPresenter$a.class, "1")) {
          return;
       }
       MilanoProfileSideOptVMPresenter$a ta = this.a;
       MilanoProfileSidePresenter p = ta.P;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(ta, p, SlidePlayViewModel.class, "146")) {
          b uob = p.Q0("kwai_data_source_service");
          if (uob != null) {
             g og = uob.c();
             if (og != null && og.I()) {
                og.T0(ta);
             }
          }
       }
       ta.Q = true;
       return;
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSideOptVMPresenter$a.class, "2")) {
          return;
       }
       MilanoProfileSideOptVMPresenter$a ta = this.a;
       MilanoProfileSidePresenter p = ta.P;
       Objects.requireNonNull(p);
       if (!PatchProxy.applyVoidOneRefs(ta, p, SlidePlayViewModel.class, "147")) {
          b uob = p.Q0("kwai_data_source_service");
          if (uob != null) {
             g og = uob.c();
             if (og != null && og.I()) {
                og.U0(ta);
             }
          }
       }
       return;
    }
}
