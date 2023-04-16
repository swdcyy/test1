package com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter$d;
import df5.b;
import com.yxcorp.gifshow.detail.fragments.milano.profile.MilanoProfileSidePresenter;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import df5.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lw6.a;
import java.lang.StringBuilder;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.kuaishou.android.model.mix.CommonMeta;
import im8.f;
import java.lang.Integer;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import c95.c;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.detail.fragments.milano.profile.f;
import z0a.u0;
import android.view.View$OnClickListener;
import z0a.v0;
import java.lang.Runnable;
import android.view.ViewGroup;
import com.kwai.library.slide.base.pagelist.a;
import qvb.n0;

public class MilanoProfileSidePresenter$d implements b	// class@001539
{
    public final MilanoProfileSidePresenter a;

    public void MilanoProfileSidePresenter$d(MilanoProfileSidePresenter p0){
       this.a = p0;
       super();
    }
    public void a(QPhoto p0){
       a.a(this, p0);
    }
    public void b(QPhoto p0){
       CommonMeta mHotSpotDoub;
       MilanoProfileSidePresenter$d ta4;
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSidePresenter$d.class, "1")) {
          return;
       }
       String str = "MilanoProfileSideP";
       if (p0 == null) {
          a.b(str, "becomesAttached\(\) called. mIsAttached = true attachPhotoId=null");
          return;
       }else {
          a.b(str, "becomesAttached\(\) called. mIsAttached = true attachPhotoId="+p0.getPhotoId());
          MilanoProfileSidePresenter$d ta = this.a;
          boolean b = true;
          ta.S = b;
          boolean b1 = false;
          ta.W0 = b1;
          ta.X0 = b1;
          ta.Y0 = null;
          if (ta.P.r()) {
             MilanoProfileSidePresenter c = this.a.C;
             if (c != null && c.getCommonMeta() != null) {
                mHotSpotDoub = this.a.C.getCommonMeta().mHotSpotDoubleCoverPhotoId;
             label_005a :
                MilanoProfileSidePresenter$d ta1 = this.a;
                ta1.C = p0;
                ta1.Z = b;
                boolean b2 = ta1.P.r();
                if (b2) {
                   Integer integer = this.a.F.get();
                   if (integer.intValue() >= 0 && this.a.a9()) {
                      if (!this.a.P.q1() && (integer.intValue() >= 0 && this.a.P.Y0() > integer.intValue())) {
                         if (!TextUtils.x(mHotSpotDoub) && (this.a.C.getCommonMeta() != null && !TextUtils.n(this.a.C.getCommonMeta().mHotSpotDoubleCoverPhotoId, mHotSpotDoub))) {
                            this.a.C.getCommonMeta().mHotSpotDoubleCoverPhotoId = mHotSpotDoub;
                         }
                      label_00c8 :
                         MilanoProfileSidePresenter$d ta2 = this.a;
                         this.a.P.H1(integer.intValue(), ta2.C, ta2.E.h, str);
                      }
                   label_00db :
                      ta = this.a;
                      ta.P.I1(ta.C, integer.intValue(), str);
                   }
                }
                this.a.P.K1(b1);
                this.a.P.L1(b1);
                MilanoProfileSidePresenter$d ta3 = this.a;
                ta3.g1 = ta3.z.getAdapter();
                ta3 = this.a;
                c = ta3.g1;
                if (c != null) {
                   QPhoto qPhoto = c.Y0();
                   ta = this.a;
                   MilanoProfileSidePresenter g1 = ta.g1;
                   g1.h1(ta.C);
                   g1.f1(new u0(this));
                   if (qPhoto != null) {
                      this.a.g1.g1(null);
                      this.a.g1.m0(this.a.g1.Z0(qPhoto), "");
                   }
                   ta3 = this.a;
                   int i = ta3.g1.Z0(ta3.C);
                   this.a.g1.g1(null);
                   this.a.g1.m0(i, "");
                   if (i > -1) {
                      this.a.z.post(new v0(this, b2));
                   }
                }else if(!ta3.a9()){
                   this.a.u9();
                }
                if (b2) {
                   ta4 = this.a;
                   ta4.K.set(ta4.C.getKsOrderId());
                }else {
                   ta4 = this.a;
                   ta4.J.set(ta4.C.getKsOrderId());
                   this.a.K.set("");
                }
                return;
             }
          }
          mHotSpotDoub = null;
          goto label_005a ;
       }
    }
    public void c(QPhoto p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MilanoProfileSidePresenter$d.class, "2")) {
          return;
       }
       String str = "MilanoProfileSideP";
       if (p0 == null) {
          a.b(str, "becomesDetached\(\) called. mIsAttached = false detachPhotoId=null");
          return;
       }else {
          a.b(str, "becomesDetached\(\) called. mIsAttached = false detachPhotoId="+p0.getPhotoId());
          MilanoProfileSidePresenter$d ta = this.a;
          ta.S = false;
          if (ta.P.C() && this.a.a9()) {
             if (this.a.z.getAdapter() != null) {
                this.a.z.setAdapter(null);
             }
             ta.g1 = null;
          }
          this.a.P.M1(false);
          if (this.a.P.H0() != null) {
             this.a.P.H0().release();
          }
          return;
       }
    }
}
