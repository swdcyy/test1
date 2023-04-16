package com.kuaishou.live.core.voiceparty.micseats.invitation.AudienceBeingInvitedBottomPanel;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import vsd.n;
import kotlin.jvm.internal.PropertyReference1Impl;
import java.lang.Class;
import java.lang.String;
import kotlin.jvm.internal.PropertyReference1;
import vsd.p;
import nsd.m0;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$b;
import java.lang.Object;
import kotlin.jvm.internal.a;
import androidx.fragment.app.Fragment;
import rsd.e;
import com.yxcorp.gifshow.util.KotterKnifeKt;
import android.os.Bundle;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.KwaiDialogFragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import d61.y;
import va1.n0;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import ekd.b;
import java.util.HashMap;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import androidx.appcompat.widget.AppCompatImageView;
import ft2.c;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.CharSequence;
import android.widget.TextView;
import lnc.a1;
import nsd.r0;
import java.util.Arrays;
import com.nex3z.flowlayout.FlowContainerView;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import qrd.l1;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;
import ft2.d;
import ft2.a;
import ft2.b;
import android.view.ViewGroup$LayoutParams;

public final class AudienceBeingInvitedBottomPanel extends LiveSafeDialogFragment	// class@0015b4
{
    public x A;
    public final String[] B;
    public final UserInfos$UserInfo C;
    public final long D;
    public final int E;
    public final VoicePartyAudienceInvitationDialog$b F;
    public HashMap G;
    public final String s;
    public final e t;
    public final e u;
    public final e v;
    public final e w;
    public final e x;
    public final e y;
    public final e z;
    public static final n[] H;

    static {
       n[] onArray = new n[]{m0.r(new PropertyReference1Impl(AudienceBeingInvitedBottomPanel.class, "avatarView", "getAvatarView\(\)Lcom/yxcorp/gifshow/image/KwaiImageView;", 0)),m0.r(new PropertyReference1Impl(AudienceBeingInvitedBottomPanel.class, "closeView", "getCloseView\(\)Landroidx/appcompat/widget/AppCompatImageView;", 0)),m0.r(new PropertyReference1Impl(AudienceBeingInvitedBottomPanel.class, "nameView", "getNameView\(\)Landroidx/appcompat/widget/AppCompatTextView;", 0)),m0.r(new PropertyReference1Impl(AudienceBeingInvitedBottomPanel.class, "hintSuffixView", "getHintSuffixView\(\)Landroidx/appcompat/widget/AppCompatTextView;", 0)),m0.r(new PropertyReference1Impl(AudienceBeingInvitedBottomPanel.class, "tagContainer", "getTagContainer\(\)Lcom/nex3z/flowlayout/FlowContainerView;", 0)),m0.r(new PropertyReference1Impl(AudienceBeingInvitedBottomPanel.class, "refuseButton", "getRefuseButton\(\)Landroidx/appcompat/widget/AppCompatTextView;", 0)),m0.r(new PropertyReference1Impl(AudienceBeingInvitedBottomPanel.class, "acceptButton", "getAcceptButton\(\)Landroidx/appcompat/widget/AppCompatTextView;", 0))};
       AudienceBeingInvitedBottomPanel.H = onArray;
    }
    public void AudienceBeingInvitedBottomPanel(String[] p0,UserInfos$UserInfo p1,long p2,int p3,VoicePartyAudienceInvitationDialog$b p4){
       a.p(p4, "listener");
       super();
       this.B = p0;
       this.C = p1;
       this.D = p2;
       this.E = p3;
       this.F = p4;
       this.s = "AudienceBeingInvitedBottomPanel";
       this.t = KotterKnifeKt.b(this, 0x7f0a2727);
       this.u = KotterKnifeKt.b(this, 0x7f0a2729);
       this.v = KotterKnifeKt.b(this, 0x7f0a272c);
       this.w = KotterKnifeKt.b(this, 0x7f0a272b);
       this.x = KotterKnifeKt.b(this, 0x7f0a272e);
       this.y = KotterKnifeKt.b(this, 0x7f0a272d);
       this.z = KotterKnifeKt.b(this, 0x7f0a2726);
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AudienceBeingInvitedBottomPanel.class, "11")) {
          return;
       }
       super.onActivityCreated(p0);
       if (!PatchProxy.applyVoid(null, this, AudienceBeingInvitedBottomPanel.class, "13")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                if (y.d(this.getActivity())) {
                   window.setLayout(Math.min(n0.f(), n0.e()), -1);
                }else {
                   window.setLayout(-1, -2);
                }
             }
          }
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, AudienceBeingInvitedBottomPanel.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       uDialog.setCanceledOnTouchOutside(false);
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(0x106000d);
          obj.requestFeature(1);
          obj.setDimAmount(0);
          if (y.d(this.getActivity())) {
             obj.setWindowAnimations(R.style.arg_RES_7f1103e0);
             obj.setGravity(5);
          }else {
             obj.setWindowAnimations(R.style.arg_RES_7f1103d9);
             obj.setGravity(80);
          }
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, AudienceBeingInvitedBottomPanel.class, "8");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0e34, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, AudienceBeingInvitedBottomPanel.class, "12")) {
          return;
       }
       super.onDestroyView();
       AudienceBeingInvitedBottomPanel tA = this.A;
       if (tA != null) {
          tA.stop();
       }
       if (!PatchProxy.applyVoid(null, this, AudienceBeingInvitedBottomPanel.class, "25")) {
          tA = this.G;
          if (tA != null) {
             tA.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       AudienceBeingInvitedBottomPanel tB;
       int len;
       int i;
       UserInfos$UserInfo userGender;
       String str6;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, AudienceBeingInvitedBottomPanel.class, "9")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       String str = null;
       AudienceBeingInvitedBottomPanel uAudienceBei = 1;
       if (!PatchProxy.applyVoid(objArray, this, AudienceBeingInvitedBottomPanel.class, "15")) {
          tB = this.C;
          UserInfos$UserInfo headUrls = (tB != null)? tB.headUrls: objArray;
          if (headUrls != null) {
             userGender = tB.headUrls;
             a.o(userGender, "inviterInfo.headUrls");
             len = (!userGender.length)? 1: 0;
             if (len ^ uAudienceBei) {
                KwaiImageView kwaiImageVie = PatchProxy.apply(objArray, this, AudienceBeingInvitedBottomPanel.class, "1");
                if (kwaiImageVie == patchProxyRe) {
                   kwaiImageVie = this.t.a(this, AudienceBeingInvitedBottomPanel.H[str]);
                }
                kwaiImageVie.L(this.C.headUrls[str].url);
             }
          }
       }
    label_005f :
       if (!PatchProxy.applyVoid(objArray, this, AudienceBeingInvitedBottomPanel.class, "16")) {
          AppCompatImageView uAppCompatIm = PatchProxy.apply(objArray, this, AudienceBeingInvitedBottomPanel.class, "2");
          if (uAppCompatIm == patchProxyRe) {
             uAppCompatIm = this.u.a(this, AudienceBeingInvitedBottomPanel.H[uAudienceBei]);
          }
          uAppCompatIm.setOnClickListener(new c(this));
       }
       String str1 = 2;
       if (!PatchProxy.applyVoid(objArray, this, AudienceBeingInvitedBottomPanel.class, "17")) {
          tB = this.C;
          if (tB != null) {
             AppCompatTextView uAppCompatTe1 = PatchProxy.apply(objArray, this, AudienceBeingInvitedBottomPanel.class, "3");
             if (uAppCompatTe1 == patchProxyRe) {
                uAppCompatTe1 = this.v.a(this, AudienceBeingInvitedBottomPanel.H[str1]);
             }
             uAppCompatTe1.setText(tB.userName);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, AudienceBeingInvitedBottomPanel.class, "18")) {
          tB = this.E;
          String str3 = "java.lang.String.format\(format, *args\)";
          String str4 = "";
          String str5 = "CommonUtil.string\(R.stri¡­team_pk_inviting_message\)";
          int i1 = 0x7f102e67;
          if (tB != uAudienceBei) {
             if (tB != str1) {
                this.xh().setText(a1.p(R.string.arg_RES_7f102de5));
             }else {
                str6 = a1.p(i1);
                a.o(str6, str5);
                objArray1 = new Object[str1];
                objArray1[str] = str4;
                objArray1[uAudienceBei] = a1.p(0x7f102ded);
                str1 = String.format(str6, Arrays.copyOf(objArray1, str1));
                a.o(str1, str3);
                this.xh().setText(str1);
             }
          }else {
             str6 = a1.p(i1);
             a.o(str6, str5);
             objArray1 = new Object[str1];
             objArray1[str] = str4;
             objArray1[uAudienceBei] = a1.p(0x7f102e77);
             str1 = String.format(str6, Arrays.copyOf(objArray1, str1));
             a.o(str1, str3);
             this.xh().setText(str1);
          }
       }
       if (!PatchProxy.applyVoid(objArray, this, AudienceBeingInvitedBottomPanel.class, "19")) {
          tB = this.B;
          if (tB != null) {
             if (tB.length) {
                uAudienceBei = null;
             }
             if (!uAudienceBei) {
                this.yh().removeAllViews();
                this.yh().setVisibility(str);
                TextView textView = PatchProxy.apply(objArray, this, AudienceBeingInvitedBottomPanel.class, "20");
                float f = 4.00f;
                if (textView != patchProxyRe) {
                }else if(this.getContext() != null){
                   tB = this.C;
                   if (tB != null) {
                      userGender = tB.userGender;
                      if (userGender != null) {
                         i = userGender.hashCode();
                         if (i != 70) {
                            if (i == 77 && userGender.equals("M")) {
                               len = 0x7f0814f3;
                               i = 0x7f103196;
                            }else {
                            label_01a0 :
                               len = 0x7f0814f1;
                               i = 0x7f10471f;
                            }
                         }else if(userGender.equals("F")){
                            len = 0x7f0814f2;
                            i = 0x7f100f40;
                         }else {
                            goto label_01a0 ;
                         }
                         TextView textView2 = this.zh();
                         textView2.setPadding(a1.e(2.00f), str, a1.e(f), str);
                         textView2.setCompoundDrawablePadding(a1.e(2.00f));
                         textView2.setCompoundDrawablesWithIntrinsicBounds(a1.f(len), objArray, objArray, objArray);
                         textView2.setText(a1.p(i));
                         textView = textView2;
                      }
                   }
                }
                textView = objArray;
                if (textView != null) {
                   this.yh().addView(textView);
                }
                len = this.B.length;
                i = 0;
                while (i < len) {
                   if (!TextUtils.isEmpty(this.B[i])) {
                      TextView textView1 = this.zh();
                      textView1.setText(this.B[i]);
                      textView1.setPadding(a1.e(f), str, a1.e(f), str);
                      this.yh().addView(textView1);
                   }
                   i = i + 1;
                }
             }
          }
          b.Z(LiveVoicePartyLogTag.AUDIENCE, this.s+" processInviterTags empty tags");
          this.yh().setVisibility(8);
       }
       if (!PatchProxy.applyVoid(objArray, this, AudienceBeingInvitedBottomPanel.class, "22")) {
          AppCompatTextView uAppCompatTe = PatchProxy.apply(objArray, this, AudienceBeingInvitedBottomPanel.class, "6");
          if (uAppCompatTe == patchProxyRe) {
             uAppCompatTe = this.y.a(this, AudienceBeingInvitedBottomPanel.H[5]);
          }
          uAppCompatTe.setOnClickListener(new d(this));
       }
       if (!PatchProxy.applyVoid(objArray, this, AudienceBeingInvitedBottomPanel.class, "23")) {
          this.wh().setOnClickListener(new a(this));
          String str2 = a1.p(R.string.arg_RES_7f102dd7);
          if (this.D <= 0) {
             this.wh().setText(str2);
          }else {
             b uob = new b(this, str2, 1000);
             this.A = uob;
             a.m(uob);
             uob.start();
          }
       }
       return;
    }
    public final AppCompatTextView wh(){
       Object obj = PatchProxy.apply(null, this, AudienceBeingInvitedBottomPanel.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.z.a(this, AudienceBeingInvitedBottomPanel.H[6]);
    }
    public final AppCompatTextView xh(){
       Object obj = PatchProxy.apply(null, this, AudienceBeingInvitedBottomPanel.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.a(this, AudienceBeingInvitedBottomPanel.H[3]);
    }
    public final FlowContainerView yh(){
       Object obj = PatchProxy.apply(null, this, AudienceBeingInvitedBottomPanel.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.x.a(this, AudienceBeingInvitedBottomPanel.H[4]);
    }
    public final TextView zh(){
       TextView obj = PatchProxy.apply(null, this, AudienceBeingInvitedBottomPanel.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextView(this.getContext());
       obj.setLayoutParams(new ViewGroup$LayoutParams(-2, a1.e(24.00f)));
       obj.setGravity(17);
       obj.setTextColor(a1.a(R.color.arg_RES_7f0607cf));
       obj.setTextSize(1, 12.00f);
       obj.setBackgroundResource(R.drawable.arg_RES_7f0814f0);
       return obj;
    }
}
