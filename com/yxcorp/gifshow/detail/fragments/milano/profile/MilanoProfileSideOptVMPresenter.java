package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter;
import zy6.e;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ef5.a;
import java.util.List;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$b;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$d;
import java.lang.Throwable;
import java.lang.Boolean;
import g9c.a;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSideOptVMPresenter$c;
import java.lang.Integer;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f;
import com.yxcorp.gifshow.entity.QPhoto;
import androidx.recyclerview.widget.RecyclerView$Adapter;

public final class MilanoProfileSideOptVMPresenter extends MilanoProfileSidePresenter implements e	// class@001535
{
    public final String w1;
    public final b x1;

    public void MilanoProfileSideOptVMPresenter(){
       super();
       this.w1 = "MilanoProfileSideOptVMP";
       this.x1 = new MilanoProfileSideOptVMPresenter$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MilanoProfileSideOptVMPresenter.class, "1")) {
          return;
       }
       super.E8();
       a.c(this.U0, this.x1, false, 2, null);
       return;
    }
    public void L4(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSideOptVMPresenter.class, "2")) {
          return;
       }
       a.p(p0, "photos");
       MilanoProfileSidePresenter tz = this.z;
       if (tz != null) {
          tz.post(new MilanoProfileSideOptVMPresenter$b(this));
       }
       return;
    }
    public void U2(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSideOptVMPresenter.class, "3")) {
          return;
       }
       a.p(p0, "photos");
       if (this.g1 != null && !p0.isEmpty()) {
          this.y9(0, p0);
          MilanoProfileSidePresenter tP = this.P;
          a.o(tP, "mSlidePlayViewModel");
          if (tP.C()) {
             return;
          }else {
             tP = this.z;
             if (tP != null) {
                tP.post(new MilanoProfileSideOptVMPresenter$d(this));
             }
          }
       }
       return;
    }
    public void n2(boolean p0,Throwable p1){
       MilanoProfileSideOptVMPresenter milanoProfil = MilanoProfileSideOptVMPresenter.class;
       if (PatchProxy.isSupport(milanoProfil) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, milanoProfil, "5")) {
          return;
       }
       if (!p0) {
          MilanoProfileSidePresenter tP = this.P;
          String str = "mSlidePlayViewModel";
          a.o(tP, str);
          if (tP.E0() == 1) {
             tP = this.P;
             a.o(tP, str);
             if (tP.F0().contains(this.C)) {
             label_0036 :
                this.Y = true;
             }
          }
       }else {
          goto label_0036 ;
       }
       return;
    }
    public void p5(List p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSideOptVMPresenter.class, "4")) {
          return;
       }
       a.p(p0, "photos");
       if (this.g1 != null && !p0.isEmpty()) {
          MilanoProfileSidePresenter tg1 = this.g1;
          a.o(tg1, "mProfileFeedAdapter");
          this.y9(tg1.getItemCount(), p0);
          MilanoProfileSidePresenter tP = this.P;
          a.o(tP, "mSlidePlayViewModel");
          if (tP.C()) {
             return;
          }else {
             tP = this.z;
             if (tP != null) {
                tP.post(new MilanoProfileSideOptVMPresenter$c(this));
             }
          }
       }
       return;
    }
    public void v2(boolean p0,boolean p1){
       MilanoProfileSideOptVMPresenter milanoProfil = MilanoProfileSideOptVMPresenter.class;
       if (PatchProxy.isSupport(milanoProfil) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, milanoProfil, "6")) {
          return;
       }
       if (!this.R - 0x3f800000) {
          this.I = true;
       }
       this.P.s(true);
       return;
    }
    public final void y9(int p0,List p1){
       MilanoProfileSidePresenter tP1;
       QPhoto qPhoto;
       MilanoProfileSideOptVMPresenter milanoProfil = MilanoProfileSideOptVMPresenter.class;
       if (PatchProxy.isSupport(milanoProfil) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, milanoProfil, "7")) {
          return;
       }
       MilanoProfileSidePresenter tg1 = this.g1;
       String str = "mProfileFeedAdapter";
       a.o(tg1, str);
       MilanoProfileSidePresenter tP = this.P;
       a.o(tP, "mSlidePlayViewModel");
       int i = 0;
       tg1 = ((tg1.Q0().size() + p1.size()) == tP.E0())? 1: null;
       if (!tg1) {
          MilanoProfileSidePresenter tg11 = this.g1;
          a.o(tg11, str);
          tP1 = this.P;
          a.o(tP1, "mSlidePlayViewModel");
          Object[] objArray = new Object[i];
          o.C().w("ThanosVMProfileSideOpt", "do notifyItemRangeInserted, but size not match , adapterSize = "+tg11.Q0().size()+" , positionStart = "+p0+" , pageListSize = "+tP1.E0()+" , newPhotoSize = "+p1.size(), objArray);
       }
       tP = this.P;
       a.o(tP, "mSlidePlayViewModel");
       this.g1.W0(tP.F0());
       tP1 = this.g1;
       tP = (this.W0 != null)? this.C: null;
       tP1.g1(tP);
       if (tg1) {
          this.g1.r0(p0, p1.size());
       }else {
          this.n9();
       }
       return;
    }
}
