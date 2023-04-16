package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMomentCommonView;
import b2b.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.kwai.library.widget.icon.KwaiIconView;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView;
import java.util.Objects;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import qrd.l1;
import com.yxcorp.utility.n;
import b2b.c;
import android.view.View$OnClickListener;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.gifshow.local.sub.entrance.function.model.CardTitle;
import java.lang.CharSequence;
import pb.d;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.kwai.social.startup.local.model.DarkLightModel;
import android.net.Uri;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.AbstractDraweeController;
import ac.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.graphics.Color;
import androidx.core.content.ContextCompat;

public final class NearbyFunctionMomentCommonView extends ConstraintLayout implements a	// class@001ab7
{
    public KwaiImageView B;
    public TextView C;
    public KwaiIconView D;
    public TextView E;
    public KwaiImageView F;
    public HeaderFunctionCard G;
    public NearbyHeaderFunctionEntranceView$a H;
    public int I;
    public int J;
    public int K;

    public void NearbyFunctionMomentCommonView(Context p0,NearbyHeaderFunctionEntranceView$a p1,int p2,int p3,int p4,AttributeSet p5,int p6,u p7){
       NearbyFunctionMomentCommonView tC;
       ViewGroup$LayoutParams layoutParams1;
       NearbyFunctionMomentCommonView tB1;
       ViewGroup$LayoutParams layoutParams2;
       NearbyFunctionMomentCommonView tB2;
       if (p6 & 0x10) {
          p4 = 0;
       }
       a.p(p0, "context");
       p5 = null;
       super(p0, p5);
       this.H = p1;
       this.I = p2;
       this.J = p3;
       this.K = p4;
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d1090, this);
       View view = m1.f(this, R.id.user_avatar);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.user_avatar\)");
       this.B = view;
       view = m1.f(this, R.id.title_tv);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.title_tv\)");
       this.C = view;
       view = m1.f(this, R.id.icon);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.icon\)");
       this.D = view;
       view = m1.f(this, R.id.subtitle_text);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.subtitle_text\)");
       this.E = view;
       view = m1.f(this, R.id.icon_right_V2);
       a.o(view, "ViewBindUtils.bindWidget\(this, R.id.icon_right_V2\)");
       this.F = view;
       if (!PatchProxy.applyVoid(p5, this, NearbyFunctionMomentCommonView.class, "1") && this.K != null) {
          int i = a1.e(74.00f);
          int i1 = a1.e(82.00f);
          p2 = a1.e(88.00f);
          NearbyFunctionMomentCommonView tK = this.K;
          float f = 4.00f;
          if ((i1 + 1) <= tK && p2 > tK) {
             i = a1.e(f);
             i1 = a1.e(14.00f);
             tB1 = this.B;
             layoutParams1 = tB1.getLayoutParams();
             Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams1.width = i1;
             layoutParams1.height = i1;
             layoutParams1.setMarginStart(i);
             tB1.setLayoutParams(layoutParams1);
             tB2 = this.C;
             layoutParams2 = tB2.getLayoutParams();
             Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams2.x = i;
             layoutParams2.y = i;
             layoutParams2.T = true;
             tB2.setLayoutParams(layoutParams2);
             tB2 = this.D;
             layoutParams2 = tB2.getLayoutParams();
             Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams2.setMarginEnd(i);
             tB2.setLayoutParams(layoutParams2);
             tB2 = this.E;
             layoutParams2 = tB2.getLayoutParams();
             Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams2.x = i;
             layoutParams2.setMarginEnd(i);
             tB2.setLayoutParams(layoutParams2);
          }else if((i + 1) <= tK && i1 > tK){
             tK = (tK - a1.e(64.00f)) / 2;
             i = a1.e(14.00f);
             tB2 = this.B;
             layoutParams2 = tB2.getLayoutParams();
             Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams2.width = i;
             layoutParams2.height = i;
             layoutParams2.setMarginStart(tK);
             tB2.setLayoutParams(layoutParams2);
             tC = this.C;
             ViewGroup$LayoutParams layoutParams3 = tC.getLayoutParams();
             Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams3.x = tK;
             layoutParams3.y = tK;
             layoutParams3.T = true;
             tC.setLayoutParams(layoutParams3);
             tC = this.D;
             layoutParams3 = tC.getLayoutParams();
             Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams3.setMarginEnd(tK);
             tC.setLayoutParams(layoutParams3);
             tC = this.E;
             layoutParams3 = tC.getLayoutParams();
             Objects.requireNonNull(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
             layoutParams3.x = tK;
             layoutParams3.setMarginEnd(tK);
             tC.setLayoutParams(layoutParams3);
          }else {
             float f1 = 5.00f;
             if (tK == i) {
                i1 = a1.e(f1);
                f1 = a1.e(f);
                tK = a1.e(14.00f);
                NearbyFunctionMomentCommonView tB = this.B;
                ViewGroup$LayoutParams layoutParams = tB.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                layoutParams.width = tK;
                layoutParams.height = tK;
                layoutParams.setMarginStart(a1.e(6.00f));
                tB.setLayoutParams(layoutParams);
                tC = this.C;
                layoutParams1 = tC.getLayoutParams();
                Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                layoutParams1.x = i1;
                layoutParams1.y = i1;
                tC.setLayoutParams(layoutParams1);
                tC = this.D;
                layoutParams1 = tC.getLayoutParams();
                Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                tB = (this.J == 1)? i1: f1;
                layoutParams1.setMarginEnd(tB);
                tC.setLayoutParams(layoutParams1);
                tC = this.E;
                layoutParams1 = tC.getLayoutParams();
                Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                layoutParams1.x = i1;
                if (this.J != 1) {
                   i1 = f1;
                }
                layoutParams1.setMarginEnd(i1);
                tC.setLayoutParams(layoutParams1);
             }else if(tK == i1){
                i = a1.e(14.00f);
                i1 = a1.e(f1);
                tB1 = this.B;
                layoutParams1 = tB1.getLayoutParams();
                Objects.requireNonNull(layoutParams1, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                layoutParams1.width = i;
                layoutParams1.height = i;
                layoutParams1.setMarginStart(i1);
                tB1.setLayoutParams(layoutParams1);
                tC = this.C;
                layoutParams2 = tC.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                layoutParams2.x = i1;
                layoutParams2.y = i1;
                tC.setLayoutParams(layoutParams2);
                tC = this.D;
                layoutParams2 = tC.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                layoutParams2.setMarginEnd(i1);
                tC.setLayoutParams(layoutParams2);
                tC = this.E;
                layoutParams2 = tC.getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                layoutParams2.x = i1;
                layoutParams2.setMarginEnd(i1);
                tC.setLayoutParams(layoutParams2);
             }
          }
          if (n.z(this.getContext()) <= a1.e(375.00f)) {
             this.C.setTextSize(1, 12.00f);
             this.E.setTextSize(1, 10.00f);
          }else {
             this.C.setTextSize(1, 14.00f);
          }
       }
       this.setOnClickListener(new c(this));
       return;
    }
    public final boolean L(){
       NearbyFunctionMomentCommonView tG = this.G;
       boolean b = true;
       if (tG == null || tG.mMomentType != b) {
          b = false;
       }
       return b;
    }
    public final int getMCardType(){
       return this.J;
    }
    public NearbyHeaderFunctionEntranceView$a getMItemClickListener(){
       return this.H;
    }
    public final int getMParentViewWidth(){
       return this.K;
    }
    public int getMPosition(){
       return this.I;
    }
    public void setData(HeaderFunctionCard p0){
       NearbyFunctionMomentCommonView tE;
       HeaderFunctionCard mSubtitleV2;
       CardTitle mText;
       d obj;
       Context context;
       NearbyFunctionMomentCommonView tG1;
       HeaderFunctionCard mIconV2;
       String mUrl;
       CardTitle mText1;
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyFunctionMomentCommonView.class, "2")) {
          return;
       }
       a.p(p0, "functionCard");
       this.G = p0;
       Object[] objArray = null;
       String str = 8;
       String str1 = "";
       if (!PatchProxy.applyVoid(objArray, this, NearbyFunctionMomentCommonView.class, "3")) {
          if (this.L()) {
             this.D.setVisibility(0);
             this.B.setVisibility(str);
          }else {
             this.D.setVisibility(str);
             this.B.setVisibility(0);
             tE = this.G;
             if (tE != null) {
                tE = tE.mMomentHeadUrls;
                if (tE != null) {
                   this.B.U(tE);
                }
             }
          }
          this.C.setVisibility(0);
          tE = this.C;
          tG1 = this.G;
          if (tG1 != null) {
             mIconV2 = tG1.mTitleV2;
             if (mIconV2 != null) {
                mText1 = mIconV2.mText;
                if (mText1 != null) {
                label_0060 :
                   tE.setText(mText1);
                }
             }
          }
          mText1 = str1;
          goto label_0060 ;
       }
       if (!PatchProxy.applyVoid(objArray, this, NearbyFunctionMomentCommonView.class, "4")) {
          if (this.L()) {
             this.F.setVisibility(0);
             tE = this.F;
             obj = Fresco.newDraweeControllerBuilder();
             tG1 = this.G;
             if (tG1 != null) {
                mIconV2 = tG1.mIconV2;
                if (mIconV2 != null) {
                   mUrl = mIconV2.getMUrl();
                   if (mUrl != null) {
                   label_008f :
                      obj = obj.D(Uri.parse(mUrl));
                      obj.q(true);
                      tE.setController(obj.e());
                   }
                }
             }
             mUrl = str1;
             goto label_008f ;
          }else {
             this.F.setVisibility(str);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, NearbyFunctionMomentCommonView.class, "5")) {
          tE = this.E;
          tE.setVisibility(0);
          NearbyFunctionMomentCommonView tG = this.G;
          if (tG != null) {
             mSubtitleV2 = tG.mSubtitleV2;
             if (mSubtitleV2 != null) {
                mText = mSubtitleV2.mText;
                if (mText != null) {
                   str1 = mText;
                }
             }
          }
          tE.setText(str1);
          tG = this.G;
          if (tG != null) {
             mSubtitleV2 = tG.mSubtitleV2;
             if (mSubtitleV2 != null) {
                mText = mSubtitleV2.mTextColor;
                if (mText != null) {
                   objArray = mText.getMUrl();
                }
             }
          }
          obj = PatchProxy.applyOneRefs(objArray, this, NearbyFunctionMomentCommonView.class, "6");
          int i = (obj != PatchProxyResult.class)? obj.intValue(): Color.parseColor(objArray);
       }
       return;
    }
    public final void setMCardType(int p0){
       this.J = p0;
    }
    public void setMItemClickListener(NearbyHeaderFunctionEntranceView$a p0){
       this.H = p0;
    }
    public final void setMParentViewWidth(int p0){
       this.K = p0;
    }
    public void setMPosition(int p0){
       this.I = p0;
    }
}
