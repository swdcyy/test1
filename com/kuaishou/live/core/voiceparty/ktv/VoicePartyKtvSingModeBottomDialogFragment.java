package com.kuaishou.live.core.voiceparty.ktv.VoicePartyKtvSingModeBottomDialogFragment;
import com.kuaishou.live.basic.dialog.LiveDialogContainerFragment;
import u71.a;
import u71.c;
import com.kuaishou.live.core.voiceparty.ktv.KtvSingMode;
import fs2.e;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import java.util.HashMap;
import android.content.DialogInterface;
import java.lang.Boolean;
import w71.a;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.live.camerahost.view.LiveCameraView;
import d61.c0;
import com.facebook.drawee.view.SimpleDraweeView;
import fs2.s;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import fs2.t;
import fs2.u;
import android.widget.Button;
import fs2.v;
import java.lang.Double;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import fs2.q;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import yx2.d;
import yx2.h;
import com.kuaishou.live.core.voiceparty.util.HandyLogEvent;
import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.util.PermissionUtils;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import brd.t;
import com.kwai.framework.ui.popupmanager.dialog.a;
import fs2.r;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import tkd.b;
import tkd.d;
import h02.b;

public final class VoicePartyKtvSingModeBottomDialogFragment extends LiveDialogContainerFragment	// class@001524
{
    public a A;
    public KwaiImageView B;
    public KwaiImageView C;
    public View D;
    public View E;
    public final a F;
    public final c G;
    public final KtvSingMode H;
    public final boolean I;
    public final double J;
    public final e K;
    public final l L;
    public final l M;
    public HashMap N;
    public LiveCameraView y;
    public boolean z;

    public void VoicePartyKtvSingModeBottomDialogFragment(a p0,c p1,KtvSingMode p2,boolean p3,double p4,e p5,l p6,l p7){
       a.p(p2, "currentSingMode");
       a.p(p5, "logger");
       a.p(p6, "changeModeAction");
       a.p(p7, "dismissAction");
       super();
       this.F = p0;
       this.G = p1;
       this.H = p2;
       this.I = p3;
       this.J = p4;
       this.K = p5;
       this.L = p6;
       this.M = p7;
       this.uh(-1, -2);
    }
    public int getLayoutResId(){
       return 0x7f0d0e57;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyKtvSingModeBottomDialogFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0e57, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvSingModeBottomDialogFragment.class, "15")) {
       }else {
          VoicePartyKtvSingModeBottomDialogFragment tN = this.N;
          if (tN != null) {
             tN.clear();
          }
       }
       return;
    }
    public void onDismiss(DialogInterface p0){
       Boolean uBoolean;
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyKtvSingModeBottomDialogFragment.class, "3")) {
          return;
       }
       a.p(p0, "dialog");
       super.onDismiss(p0);
       VoicePartyKtvSingModeBottomDialogFragment tF = this.F;
       Object[] objArray = null;
       if (tF == null) {
          tF = this.A;
          if (tF == null) {
             uBoolean = objArray;
          label_0027 :
             this.M.invoke(uBoolean);
             if (!PatchProxy.applyVoid(objArray, this, VoicePartyKtvSingModeBottomDialogFragment.class, "13") && this.z != null) {
                tF = this.F;
                if (tF != null) {
                   tF.g();
                   VoicePartyKtvSingModeBottomDialogFragment ty = this.y;
                   if (ty == null) {
                      a.S("smallCameraView");
                   }
                   tF.F(ty);
                   this.z = false;
                }else {
                   tF = this.A;
                   if (tF != null) {
                      tF.l2();
                      this.z = false;
                   }
                }
             }
             return;
          }
       }
       uBoolean = Boolean.valueOf(tF.I());
       goto label_0027 ;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       c0 a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyKtvSingModeBottomDialogFragment.class, "2")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       VoicePartyKtvSingModeBottomDialogFragment tH = this.H;
       if (!PatchProxy.applyVoidTwoRefs(p0, tH, this, VoicePartyKtvSingModeBottomDialogFragment.class, "4")) {
          view = p0.findViewById(R.id.btn_switch_camera);
          a.o(view, "view.findViewById\(R.id.btn_switch_camera\)");
          this.E = view;
          view = p0.findViewById(R.id.iv_sing_mode_video);
          a.o(view, "view.findViewById\(R.id.iv_sing_mode_video\)");
          this.C = view;
          view = p0.findViewById(R.id.camera_preview);
          a.o(view, "view.findViewById\(R.id.camera_preview\)");
          this.y = view;
          view = p0.findViewById(R.id.iv_sign_mode_mv);
          a.o(view, "view.findViewById\(R.id.iv_sign_mode_mv\)");
          this.B = view;
          view = p0.findViewById(R.id.iv_sing_mode_video_select);
          a.o(view, "view.findViewById\(R.id.iv_sing_mode_video_select\)");
          this.D = view;
          VoicePartyKtvSingModeBottomDialogFragment tB = this.B;
          String str = "mvView";
          if (tB == null) {
             a.S(str);
          }
          a = c0.a;
          tB.setImageURI(a.b("udata/pkg/LIVE-CDN/live_background_voice.webp"));
          tB = this.C;
          String str1 = "videoView";
          if (tB == null) {
             a.S(str1);
          }
          tB.setImageURI(a.b("udata/pkg/LIVE-CDN/live_background_video.webp"));
          tB = this.B;
          if (tB == null) {
             a.S(str);
          }
          tB.setOnClickListener(new s(this));
          tB = this.C;
          if (tB == null) {
             a.S(str1);
          }
          tB.setOnClickListener(new t(this));
          tB = this.E;
          if (tB == null) {
             a.S("switchCameraView");
          }
          tB.setOnClickListener(new u(this));
          p0.findViewById(R.id.btn_confirm).setOnClickListener(new v(this));
          if (tH == KtvSingMode.MV) {
             this.wh();
          }else if(this.I == null){
             this.xh();
          }else {
             VoicePartyKtvSingModeBottomDialogFragment ty = this.y;
             if (ty == null) {
                a.S("smallCameraView");
             }
             tB = this.J;
             if (!PatchProxy.isSupport(VoicePartyKtvSingModeBottomDialogFragment.class) || !PatchProxy.applyVoidTwoRefs(ty, Double.valueOf(tB), this, VoicePartyKtvSingModeBottomDialogFragment.class, "11")) {
                ty.getViewTreeObserver().addOnGlobalLayoutListener(new q(this, ty, tB));
             }
          }
          this.K.e("VOICE_PARTY_KTV_ANCHOR_SING_MODE_VOICE").g();
          this.K.f(HandyLogEvent.SHOW);
       }
       return;
    }
    public final void wh(){
       if (PatchProxy.applyVoid(null, this, VoicePartyKtvSingModeBottomDialogFragment.class, "5")) {
          return;
       }
       VoicePartyKtvSingModeBottomDialogFragment tB = this.B;
       if (tB == null) {
          a.S("mvView");
       }
       tB.setSelected(true);
       tB = this.D;
       if (tB == null) {
          a.S("videoSelectView");
       }
       tB.setSelected(false);
       return;
    }
    public final void xh(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvSingModeBottomDialogFragment.class, "6")) {
          return;
       }
       VoicePartyKtvSingModeBottomDialogFragment tD = this.D;
       if (tD == null) {
          a.S("videoSelectView");
       }
       tD.setSelected(true);
       tD = this.B;
       if (tD == null) {
          a.S("mvView");
       }
       boolean b = false;
       tD.setSelected(b);
       tD = this.E;
       String str = "switchCameraView";
       if (tD == null) {
          a.S(str);
       }
       if (tD.getVisibility()) {
          tD = this.E;
          if (tD == null) {
             a.S(str);
          }
          tD.setVisibility(b);
          this.K.g(HandyLogEvent.SHOW);
       }
       if (this.I != null) {
          tD = this.C;
          if (tD == null) {
             a.S("videoView");
          }
          tD.setImageDrawable(objArray);
          tD = this.y;
          if (tD == null) {
             a.S("smallCameraView");
          }
          tD.setVisibility(b);
          if (!PatchProxy.applyVoid(objArray, this, VoicePartyKtvSingModeBottomDialogFragment.class, "7")) {
             String str1 = "android.permission.CAMERA";
             if (PermissionUtils.a(this.getContext(), str1)) {
                this.yh();
             }else if(this.getActivity() != null){
                a.e(this.getActivity(), R.string.arg_RES_7f101efd, 0x7f101efc, str1).subscribe(new r(this), Functions.d());
             }
          }
       }
    label_009d :
       return;
    }
    public final void yh(){
       VoicePartyKtvSingModeBottomDialogFragment tF;
       VoicePartyKtvSingModeBottomDialogFragment ty;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvSingModeBottomDialogFragment.class, "12")) {
          return;
       }
       if (this.z != null) {
          return;
       }
       String str = "smallCameraView";
       if (PatchProxy.applyVoid(objArray, this, VoicePartyKtvSingModeBottomDialogFragment.class, "9") || (this.F == null && this.A == null)) {
          tF = this.G;
          if (tF != null) {
             b uob = d.a(-204054297);
             ty = this.y;
             if (ty == null) {
                a.S(str);
             }
             this.A = uob.Yj(tF, ty);
          }
       }
       tF = this.F;
       if (tF != null) {
          ty = this.y;
          if (ty == null) {
             a.S(str);
          }
          if (tF.V(ty)) {
             this.z = true;
             tF.f();
          }
       }else {
          tF = this.A;
          if (tF != null) {
             this.z = true;
             tF.y();
          }
       }
       return;
    }
}
