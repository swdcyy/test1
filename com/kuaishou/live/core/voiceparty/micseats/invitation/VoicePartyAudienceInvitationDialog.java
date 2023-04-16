package com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.view.View;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import ft2.e;
import android.view.View$OnClickListener;
import ft2.f;
import com.nex3z.flowlayout.FlowContainerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import com.kwai.robust.PatchProxyResult;
import i2b.a;
import androidx.fragment.app.KwaiDialogFragment;
import ekd.b;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import lnc.a1;
import com.kuaishou.socket.nano.UserInfos$UserInfo;
import com.kuaishou.socket.nano.UserInfos$PicUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.StringBuilder;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import cw9.c;
import android.text.TextPaint;
import android.graphics.Paint;
import com.kuaishou.live.core.voiceparty.micseats.invitation.VoicePartyAudienceInvitationDialog$a;
import android.content.Context;
import android.text.SpannableStringBuilder;
import lnc.b3;
import lu7.f;
import android.text.SpannableString;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.ViewGroup$LayoutParams;

public class VoicePartyAudienceInvitationDialog extends LiveSafeDialogFragment implements d	// class@0015b7
{
    public TextView A;
    public FlowContainerView B;
    public UserInfos$UserInfo s;
    public LiveVoicePartyCommonConfig$CountDownAboardConfig t;
    public VoicePartyAudienceInvitationDialog$b u;
    public x v;
    public String[] w;
    public int x;
    public KwaiImageView y;
    public TextView z;
    public static final int C;

    public void VoicePartyAudienceInvitationDialog(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyAudienceInvitationDialog.class, "4")) {
          return;
       }
       this.y = m1.f(p0, 0x7f0a44b6);
       this.z = m1.f(p0, 0x7f0a44b7);
       this.A = m1.f(p0, 0x7f0a44b5);
       m1.a(p0, new e(this), R.id.voice_party_invite_dialog_accept);
       m1.a(p0, new f(this), R.id.voice_party_invite_dialog_reject);
       this.B = m1.f(p0, 0x7f0a44b9);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyAudienceInvitationDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d16a0, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, VoicePartyAudienceInvitationDialog.class, "13")) {
          return;
       }
       super.onDestroyView();
       VoicePartyAudienceInvitationDialog tv = this.v;
       if (tv != null) {
          tv.stop();
       }
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, VoicePartyAudienceInvitationDialog.class, "5")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyAudienceInvitationDialog.class, "6")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             boolean b = false;
             dialog.setCanceledOnTouchOutside(b);
             Window window = dialog.getWindow();
             if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(b));
                window.setLayout(a1.d(R.dimen.arg_RES_7f070251), -2);
                window.setGravity(17);
                window.setDimAmount(0x3f000000);
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       String str;
       float f;
       Object[] objArray1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyAudienceInvitationDialog.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       UserInfos$UserInfo headUrls = this.s.headUrls;
       int i = 0;
       if (headUrls != null && headUrls.length > 0) {
          this.y.L(headUrls[i].url);
       }
       VoicePartyAudienceInvitationDialog tz = this.z;
       UserInfos$UserInfo userName = this.s.userName;
       String obj = PatchProxy.applyOneRefs(userName, this, VoicePartyAudienceInvitationDialog.class, "7");
       Object[] objArray = null;
       if (obj != patchProxyRe) {
       }else {
          obj = PatchProxy.apply(objArray, this, VoicePartyAudienceInvitationDialog.class, "12");
          int i1 = 1;
          int i2 = 2;
          if (obj != patchProxyRe) {
          }else {
             VoicePartyAudienceInvitationDialog tx = this.x;
             str = "";
             VoicePartyAudienceInvitationDialog voicePartyAu = 0x7f102e67;
             if (tx != i1) {
                if (tx != i2) {
                   obj = a1.p(R.string.arg_RES_7f102de5);
                }else {
                   objArray1 = new Object[i2];
                   objArray1[i] = str;
                   objArray1[i1] = a1.p(0x7f102ded);
                   obj = String.format(a1.p(voicePartyAu), objArray1);
                }
             }else {
                objArray1 = new Object[i2];
                objArray1[i] = str;
                objArray1[i1] = a1.p(0x7f102e77);
                obj = String.format(a1.p(voicePartyAu), objArray1);
             }
          }
          if (!TextUtils.isEmpty(userName)) {
             str = userName+" "+obj;
             int[] ointArray = PatchProxy.apply(objArray, this, VoicePartyAudienceInvitationDialog.class, "8");
             if (ointArray != patchProxyRe) {
             }else if(this.getDialog() != null && (this.getDialog().getWindow() == null || this.getDialog().getWindow().getDecorView() == null)){
                ointArray = new int[i2]{0,0};
             }else {
                View decorView = this.getDialog().getWindow().getDecorView();
                int[] ointArray1 = new int[i2];
                ointArray1[i] = decorView.getPaddingLeft();
                ointArray1[i1] = decorView.getPaddingRight();
                ointArray = ointArray1;
             }
             int i3 = c.b(this.getResources(), 0x7f0702cc) * 2;
             int i4 = c.b(this.getResources(), 0x7f070251) - i3;
             i4 = i4 - ointArray[i];
             i4 = i4 - ointArray[i1];
             f = (float)i4;
             TextPaint paint = this.z.getPaint();
             if (paint.measureText(str) - f <= 0) {
                obj = str;
             }else {
                obj = "... "+obj;
                f = f - paint.measureText(obj);
                i1 = paint.breakText(userName, i1, f, objArray);
                if (i1 >= userName.length()) {
                   obj = userName+obj;
                }else {
                   obj = userName.substring(i, i1)+obj;
                }
             }
          }
       }
       tz.setText(obj);
       if (this.t != null) {
          VoicePartyAudienceInvitationDialog$a uoa = new VoicePartyAudienceInvitationDialog$a(this, 1000);
          this.v = uoa;
          uoa.start();
       }else {
          this.A.setText(R.string.arg_RES_7f102dd7);
       }
       if (!PatchProxy.applyVoid(objArray, this, VoicePartyAudienceInvitationDialog.class, "9")) {
          tz = this.w;
          if (tz == null || !tz.length) {
             b.Z(LiveVoicePartyLogTag.OTHER, "processInviterTags empty tags");
             this.B.setVisibility(8);
          }else {
             this.B.removeAllViews();
             this.B.setVisibility(i);
             tz = PatchProxy.apply(objArray, this, VoicePartyAudienceInvitationDialog.class, "10");
             if (tz != patchProxyRe) {
                objArray = tz;
             }else if(this.getContext() != null){
                tz = this.s;
                if (tz != null && tz.userGender != null) {
                   b3 uob3 = new b3(this.getContext(), f.g(this.s.userGender));
                   uob3.b(i);
                   SpannableStringBuilder spannableStr = new SpannableStringBuilder().append(uob3.a());
                   spannableStr.append(" ");
                   objArray = spannableStr;
                   headUrls = this.s.userGender;
                   Objects.requireNonNull(headUrls);
                   if (!headUrls.equals("F")) {
                      if (!headUrls.equals("M")) {
                         objArray.append(a1.p(R.string.arg_RES_7f10471f));
                      }else {
                         objArray.append(a1.p(R.string.arg_RES_7f103196));
                      }
                   }else {
                      objArray.append(a1.p(R.string.arg_RES_7f100f40));
                   }
                }
             }
             if (objArray != null) {
                this.B.addView(this.wh(objArray));
             }
             tz = this.w;
             while (i < tz.length) {
                if (!TextUtils.isEmpty(tz[i])) {
                   this.B.addView(this.wh(this.w[i]));
                }
                i++;
             }
          }
       }
       return;
    }
    public final TextView wh(CharSequence p0){
       TextView obj = PatchProxy.applyOneRefs(p0, this, VoicePartyAudienceInvitationDialog.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new TextView(this.getContext());
       obj.setPadding(a1.e(8.00f), a1.e(2.00f), a1.e(8.00f), a1.e(2.00f));
       obj.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
       obj.setText(p0);
       obj.setTextColor(a1.a(R.color.arg_RES_7f0607cf));
       obj.setTextSize(0, (float)a1.d(R.dimen.arg_RES_7f070f6e));
       obj.setBackgroundResource(R.drawable.arg_RES_7f081501);
       return obj;
    }
}
