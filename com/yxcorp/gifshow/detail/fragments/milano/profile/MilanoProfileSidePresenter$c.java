package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$c;
import jta.c;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.lang.StringBuilder;
import com.yxcorp.gifshow.entity.QPhoto;
import lw6.a;
import joc.q;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import jta.b;
import java.util.Objects;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import va5.e;

public class MilanoProfileSidePresenter$c implements c	// class@001538
{
    public final MilanoProfileSidePresenter a;

    public void MilanoProfileSidePresenter$c(MilanoProfileSidePresenter p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       MilanoProfileSidePresenter$c uoc = MilanoProfileSidePresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "3")) {
          return;
       }
       a.b("MilanoProfileSideP", "onSwipeFinish\(\) called. mIsAttached="+this.a.S+" photoId="+this.a.C.getPhotoId());
       uoc = this.a;
       if (uoc.S == null) {
          return;
       }
       MilanoProfileSidePresenter h1 = uoc.h1;
       MilanoProfileSidePresenter milanoProfil = 0x3f800000;
       int i = 4;
       if (h1 != null) {
          if (!p0 - milanoProfil) {
             h1.e(i);
          }else {
             h1.a(i);
          }
       }
       h1 = this.a.i1;
       if (h1 != null) {
          if (!p0 - milanoProfil) {
             h1.e(i);
          }else {
             h1.a(i);
          }
       }
       uoc = this.a;
       uoc.R = p0;
       uoc.t9();
       MilanoProfileSidePresenter$c ta = this.a;
       if (!ta.R - milanoProfil) {
          ta.P.s(true);
          ta = this.a;
          ta.g1 = ta.z.getAdapter();
          ta = this.a;
          h1 = ta.g1;
          if (h1 != null) {
             int i1 = h1.Z0(ta.C);
             if (i1 > -1) {
                uoc = this.a;
                milanoProfil = uoc.z;
                uoc.s9(milanoProfil, milanoProfil.getLayoutManager(), i1, false);
                a.b("MilanoProfileSideP", "Scroll to current photo by close sidebar.");
             }
          }
       }
       return;
    }
    public void b(float p0){
       b.a(this, p0);
    }
    public void c(float p0){
       MilanoProfileSidePresenter p;
       MilanoProfileSidePresenter$c uoc = MilanoProfileSidePresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "2")) {
          return;
       }
       uoc = this.a;
       if (uoc.S == null) {
          return;
       }
       uoc.g1 = uoc.z.getAdapter();
       uoc = this.a;
       if (uoc.g1 == null || (uoc.c9() && this.a.b9())) {
          a.b("MilanoProfileSideP", "refresh profile adapter");
          this.a.u9();
       }
       uoc = this.a;
       uoc.R = p0;
       Objects.requireNonNull(uoc);
       MilanoProfileSidePresenter milanoProfil = MilanoProfileSidePresenter.class;
       if (!PatchProxy.isSupport(milanoProfil) || !PatchProxy.applyVoidOneRefs(Float.valueOf(p0), uoc, milanoProfil, "16")) {
          p = uoc.A;
          if (p != null) {
             p.setTranslationX(((float)MilanoProfileSidePresenter.r1 * p0));
          }
       }
       this.a.W8(p0);
       boolean b = true;
       p0 = p0 - 0x3f800000;
       if (!p0) {
          this.a.Z = b;
       }
       p = this.a.P;
       if (p0) {
          b = false;
       }
       p.U1(b);
       return;
    }
    public void d(float p0){
       MilanoProfileSidePresenter$c uoc = MilanoProfileSidePresenter$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       a.b("MilanoProfileSideP", "onSwipeStart\(\) called. mIsAttached="+this.a.S+" photoId="+this.a.C.getPhotoId());
       RxBus.f.b(new e(true));
       if (!this.a.P.r()) {
          if (this.a.Y != null) {
             this.a.u9();
          }
          p0.Y = false;
       }
       return;
    }
}
