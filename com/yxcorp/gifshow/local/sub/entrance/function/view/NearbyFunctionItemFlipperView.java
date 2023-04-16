package com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionItemFlipperView;
import com.yxcorp.widget.selector.view.SelectShapeConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import nsd.u;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFlipperView;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import lnc.a1;
import android.view.ViewGroup$LayoutParams;
import android.widget.ViewFlipper;
import qrd.l1;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionItemFlipperView$a;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.local.sub.entrance.function.model.HeaderFunctionCard;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import w1b.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyHeaderFunctionEntranceView$a;
import java.lang.Integer;
import java.util.List;
import java.util.Iterator;
import java.lang.Iterable;
import kotlin.collections.CollectionsKt__CollectionsKt;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMomentCommonView;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionMatchView;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.yxcorp.gifshow.local.sub.entrance.function.view.NearbyFunctionItemFlipperView$b;
import java.lang.Runnable;

public final class NearbyFunctionItemFlipperView extends SelectShapeConstraintLayout	// class@001aae
{
    public final int C;
    public final int D;
    public final int E;
    public boolean F;
    public int G;
    public NearbyFlipperView H;
    public NearbyHeaderFunctionEntranceView$a I;
    public List J;

    public void NearbyFunctionItemFlipperView(Context p0){
       super(p0, null, 0, 6, null);
    }
    public void NearbyFunctionItemFlipperView(Context p0,AttributeSet p1){
       super(p0, p1, 0, 4, null);
    }
    public void NearbyFunctionItemFlipperView(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.C = 7000;
       this.D = 5000;
       this.E = 3000;
       NearbyFlipperView nearbyFlippe = new NearbyFlipperView(p0, null, 2, null);
       nearbyFlippe.setLayoutParams(new ConstraintLayout$LayoutParams(-1, a1.e(52.00f)));
       this.H = nearbyFlippe;
       this.addView(nearbyFlippe);
       this.H.setInAnimation(AnimationUtils.loadAnimation(p0, R.anim.arg_RES_7f010105));
       this.H.setOutAnimation(AnimationUtils.loadAnimation(p0, R.anim.arg_RES_7f010115));
       this.H.getInAnimation().setAnimationListener(new NearbyFunctionItemFlipperView$a(this));
    }
    public void NearbyFunctionItemFlipperView(Context p0,AttributeSet p1,int p2,int p3,u p4){
       if (p3 & 0x02) {
          p1 = null;
       }
       if (p3 & 0x04) {
          p2 = 0;
       }
       super(p0, p1, p2);
       return;
    }
    public final void M(HeaderFunctionCard p0){
       Object obj = p0;
       if (PatchProxy.applyVoidOneRefs(obj, this, NearbyFunctionItemFlipperView.class, "5")) {
          return;
       }
       if (obj.mIsFromCache == null && obj.mIsLogShow == null) {
          String str = String.valueOf(obj.mMomentType);
          String str1 = String.valueOf(obj.mType);
          HeaderFunctionCard mMomentUserI = obj.mMomentUserId;
          if (!PatchProxy.applyVoidThreeRefs(str, str1, mMomentUserI, null, a.class, "3")) {
             ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
             uElementPack.action2 = "TOP_FUNC_ENT_BTN_INNER_STATUS";
             i3 oi3 = i3.f();
             oi3.d("btn_style", str);
             oi3.d("btn_type", str1);
             oi3.d("passive_user_id", mMomentUserI);
             uElementPack.params = oi3.e();
             u1.D0("4064628", null, 0, uElementPack, null, null);
          }
          obj.mIsLogShow = true;
       }
       return;
    }
    public final NearbyHeaderFunctionEntranceView$a getItemClickListener(){
       return this.I;
    }
    public final int getMItemWidth(){
       return this.G;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, NearbyFunctionItemFlipperView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.H.stopFlipping();
       this.H.clearAnimation();
       return;
    }
    public void onVisibilityChanged(View p0,int p1){
       if (PatchProxy.isSupport(NearbyFunctionItemFlipperView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, NearbyFunctionItemFlipperView.class, "3")) {
          return;
       }
       a.p(p0, "changedView");
       super.onVisibilityChanged(p0, p1);
       if (p1 == 8) {
          this.H.stopFlipping();
          this.H.clearAnimation();
       }
       return;
    }
    public final void setData(List p0){
       NearbyFunctionItemFlipperView obj;
       Context context;
       if (PatchProxy.applyVoidOneRefs(p0, this, NearbyFunctionItemFlipperView.class, "2")) {
          return;
       }
       a.p(p0, "headerFunctionCards");
       if (p0.isEmpty()) {
          return;
       }
       this.J = p0;
       this.H.stopFlipping();
       this.H.removeAllViews();
       this.H.setAnimateFirstView(false);
       Iterator iterator = p0.iterator();
       int i = 0;
       NearbyFunctionItemFlipperView nearbyFuncti = 2;
       while (iterator.hasNext()) {
          obj = iterator.next();
          int i1 = i + 1;
          if (i < 0) {
             CollectionsKt__CollectionsKt.W();
          }
          String str = "context";
          if (obj.mMomentType != nearbyFuncti) {
             context = this.getContext();
             a.o(context, str);
             NearbyFunctionMomentCommonView nearbyFuncti1 = new NearbyFunctionMomentCommonView(context, this.I, i, obj.mMomentType, this.G, null, 32, null);
             v13.setData(obj);
             this.H.addView(v13, -1, -1);
          }else {
             context = this.getContext();
             a.o(context, str);
             NearbyFunctionMatchView nearbyFuncti2 = new NearbyFunctionMatchView(context, this.I, i, null, 8, null);
             v9.setData(obj);
             this.H.addView(v9, -1, -1);
          }
          i = i1;
       }
       HeaderFunctionCard headerFuncti = CollectionsKt___CollectionsKt.m2(p0);
       obj = this.H;
       HeaderFunctionCard mDisplaySeco = headerFuncti.mDisplaySeconds;
       if (mDisplaySeco == null) {
          mDisplaySeco = headerFuncti.mMomentType;
          if (mDisplaySeco != 1) {
             nearbyFuncti = (mDisplaySeco != nearbyFuncti)? this.E: this.D;
          }else {
             nearbyFuncti = this.C;
          }
       }else {
          int i2 = mDisplaySeco * 1000;
       }
       obj.setFlipInterval(nearbyFuncti);
       if (p0.size() > 1) {
          this.H.startFlipping();
       }
       View currentView = this.H.getCurrentView();
       if (currentView instanceof NearbyFunctionMatchView) {
          currentView.post(new NearbyFunctionItemFlipperView$b(currentView));
       }
       this.M(headerFuncti);
       return;
    }
    public final void setItemClickListener(NearbyHeaderFunctionEntranceView$a p0){
       this.I = p0;
    }
    public final void setMItemWidth(int p0){
       this.G = p0;
    }
}
