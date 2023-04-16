package com.kuaishou.live.redpacket.core.condition.view.container.RedPacketConditionOpenTimeContainer;
import eo3.c;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import java.lang.String;
import java.util.List;
import po3.a;
import androidx.fragment.app.Fragment;
import om3.a;
import uw1.m;
import android.view.View;
import eo3.d;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kuaishou.android.live.log.b;
import u52.y;
import com.kwai.framework.model.user.QCurrentUser;
import wkd.b;
import i62.a;
import androidx.fragment.app.KwaiDialogFragment;
import z12.x;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kuaishou.live.redpacket.core.condition.view.container.RedPacketConditionOpenTimeContainer$b;
import android.view.View$OnTouchListener;
import hn3.a;
import android.content.DialogInterface$OnShowListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import com.kuaishou.live.redpacket.core.condition.view.container.RedPacketConditionOpenTimeContainer$a;
import android.view.View$OnClickListener;
import android.view.ViewParent;
import java.lang.Integer;

public class RedPacketConditionOpenTimeContainer extends LiveSafeDialogFragment implements c	// class@000ed0
{
    public m A;
    public d s;
    public View t;
    public Fragment u;
    public ViewGroup v;
    public int w;
    public String x;
    public String y;
    public a z;
    public static final List B;

    static {
       RedPacketConditionOpenTimeContainer.B = a.a(LiveLogTag.CONDITION_LEEE, "OpenTimeContainer");
    }
    public void RedPacketConditionOpenTimeContainer(Fragment p0,int p1,String p2,String p3,a p4,m p5){
       super();
       this.u = p0;
       this.w = p1;
       this.x = p2;
       this.y = p3;
       this.z = p4;
       this.A = p5;
    }
    public void l5(View p0,d p1){
       boolean b1;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RedPacketConditionOpenTimeContainer.class, "1")) {
          return;
       }
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       RedPacketConditionOpenTimeContainer obj = PatchProxy.apply(null, this, RedPacketConditionOpenTimeContainer.class, "8");
       boolean b = false;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.z.H0()){
          b.P(RedPacketConditionOpenTimeContainer.B, "not show reason: gift send combo");
       }else if(!this.u.isResumed()){
          b.P(RedPacketConditionOpenTimeContainer.B, "not show reason: fragment is null or not resume");
       }else if(this.z.c()){
          obj = PatchProxy.apply(null, this, RedPacketConditionOpenTimeContainer.class, "9");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!y.a()){
             b.P(RedPacketConditionOpenTimeContainer.B, "canShowRedPacketDialogByParticipate remote config is false");
          }else {
             obj = PatchProxy.apply(null, this, RedPacketConditionOpenTimeContainer.class, "12");
             if (obj != patchProxyRe) {
                b1 = obj.booleanValue();
             }else {
                obj = this.y;
                b1 = (obj == null)? false: obj.equals(QCurrentUser.me().getId());
             }
             if (b1) {
                b.P(RedPacketConditionOpenTimeContainer.B, "canShowRedPacketDialogByParticipate isRedPacketSender");
             }else {
                obj = PatchProxy.apply(null, this, RedPacketConditionOpenTimeContainer.class, "11");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else if(this.w != 14){
                   b1 = false;
                }else {
                   b1 = this.z.L0();
                }
                if (b1) {
                   b.P(RedPacketConditionOpenTimeContainer.B, "canShowRedPacketDialogByParticipate jonFansGroup");
                }else {
                   obj = PatchProxy.apply(null, this, RedPacketConditionOpenTimeContainer.class, "13");
                   if (obj != patchProxyRe) {
                      b1 = obj.booleanValue();
                   }else {
                      obj = this.A;
                      b1 = (obj == null)? false: obj.p5();
                   }
                   if (b1) {
                      b.P(RedPacketConditionOpenTimeContainer.B, "canShowRedPacketDialogByParticipate isOpenRedPacketDialogContainer");
                   }else {
                      obj = PatchProxy.apply(null, this, RedPacketConditionOpenTimeContainer.class, "10");
                      boolean b2 = (obj != patchProxyRe)? obj.booleanValue(): b.a(0x4c63d520).b(this.x);
                      if (b2) {
                         b.P(RedPacketConditionOpenTimeContainer.B, "canShowRedPacketDialogByParticipate hasParticipated");
                      }else {
                         b.P(RedPacketConditionOpenTimeContainer.B, "canShowRedPacketDialogByParticipate no participated");
                      }
                   }
                }
             }
          }
          b = true;
       }
       if (!b) {
          if (p1 != null) {
             p1.b();
          }
          return;
       }else {
          this.t = p0;
          this.s = p1;
          RedPacketConditionOpenTimeContainer tA = this.A;
          if (tA != null && tA.p5()) {
             this.A.k("dismiss_from_condition");
          }
          x.F(this, this.u, "RedPacketConditionOpenTimeContainer");
          return;
       }
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RedPacketConditionOpenTimeContainer.class, "3")) {
          return;
       }
       Dialog dialog = this.getDialog();
       super.onActivityCreated(p0);
       Window window = (dialog == null)? null: dialog.getWindow();
       if (window != null) {
          window.setWindowAnimations(R.style.arg_RES_7f11059e);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, RedPacketConditionOpenTimeContainer.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       boolean b = true;
       uDialog.setCanceledOnTouchOutside(b);
       Window window = uDialog.getWindow();
       if (window != null) {
          window.requestFeature(b);
          window.setDimAmount(0.20f);
          window.getDecorView().setOnTouchListener(new RedPacketConditionOpenTimeContainer$b(this));
          this.ph(new a(this));
       }else {
          this.dismissAllowingStateLoss();
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RedPacketConditionOpenTimeContainer.class, "4");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d0ac2, p1, false);
       this.v = view.findViewById(0x7f0a3501);
       view.findViewById(R.id.close_view).setOnClickListener(new RedPacketConditionOpenTimeContainer$a(this));
       ViewParent parent = this.t.getParent();
       if (parent instanceof ViewGroup) {
          parent.removeView(this.t);
       }
       this.v.addView(this.t);
       RedPacketConditionOpenTimeContainer ts = this.s;
       if (ts != null) {
          ts.onShow();
       }
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionOpenTimeContainer.class, "7")) {
          return;
       }
       super.onDestroyView();
       this.v.removeView(this.t);
       this.s = null;
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, RedPacketConditionOpenTimeContainer.class, "6")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          return;
       }
       if (dialog.getWindow() != null) {
          Window window = dialog.getWindow();
          window.setGravity(17);
          window.setBackgroundDrawableResource(0x106000d);
          window.setLayout(-1, -2);
       }
       return;
    }
    public void s3(int p0){
       if (PatchProxy.isSupport(RedPacketConditionOpenTimeContainer.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RedPacketConditionOpenTimeContainer.class, "2")) {
          return;
       }
       RedPacketConditionOpenTimeContainer ts = this.s;
       if (ts != null) {
          ts.a(p0);
       }
       x.E(this);
       return;
    }
}
