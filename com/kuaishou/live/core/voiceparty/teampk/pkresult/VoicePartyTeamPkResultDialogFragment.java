package com.kuaishou.live.core.voiceparty.teampk.pkresult.VoicePartyTeamPkResultDialogFragment;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import android.os.Handler;
import android.os.Looper;
import com.kuaishou.live.core.voiceparty.teampk.VoicePartyTeamPkResult;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import android.content.DialogInterface;
import com.kuaishou.live.dialog.base.LiveBaseDialogFragment;
import com.kuaishou.live.common.core.component.pk.b;
import com.kuaishou.live.common.core.component.pk.LivePkResource$PkSkinResource;
import com.kuaishou.live.core.voiceparty.teampk.pkresult.VoicePartyTeamPkResultDialogFragment$a;
import java.lang.Enum;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.widget.ImageView;
import com.kuaishou.live.core.voiceparty.micseats.mode.VoicePartyMicSeatData;
import pt2.b;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.kwai.framework.model.user.UserInfo;
import wb5.g;
import yv2.a;
import java.lang.Runnable;

public class VoicePartyTeamPkResultDialogFragment extends LiveSafeDialogFragment implements d	// class@00192f
{
    public List A;
    public final Handler B;
    public LinearLayout s;
    public TextView t;
    public KwaiImageView u;
    public KwaiImageView v;
    public KwaiImageView w;
    public KwaiImageView x;
    public LottieAnimationView y;
    public VoicePartyTeamPkResult z;

    public void VoicePartyTeamPkResultDialogFragment(){
       super();
       this.B = new Handler(Looper.getMainLooper());
    }
    public static VoicePartyTeamPkResultDialogFragment wh(VoicePartyTeamPkResult p0,List p1){
       VoicePartyTeamPkResultDialogFragment obj = PatchProxy.applyTwoRefs(p0, p1, null, VoicePartyTeamPkResultDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new VoicePartyTeamPkResultDialogFragment();
       obj.z = p0;
       obj.A = p1;
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkResultDialogFragment.class, "7")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a27cd);
       this.t = m1.f(p0, 0x7f0a27ce);
       this.u = m1.f(p0, 0x7f0a27c9);
       this.v = m1.f(p0, 0x7f0a27ca);
       this.w = m1.f(p0, 0x7f0a27cb);
       this.x = m1.f(p0, 0x7f0a27cc);
       this.y = m1.f(p0, 0x7f0a27c8);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, VoicePartyTeamPkResultDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       uDialog.setCanceledOnTouchOutside(false);
       uDialog.getWindow().requestFeature(1);
       uDialog.getWindow().setDimAmount(0x3f400000);
       uDialog.getWindow().setGravity(17);
       uDialog.getWindow().setBackgroundDrawable(new ColorDrawable(false));
       uDialog.getWindow().setWindowAnimations(R.style.arg_RES_7f110697);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyTeamPkResultDialogFragment.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       return a.g(p0, 0x7f0d16de, p1, false);
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkResultDialogFragment.class, "5")) {
          return;
       }
       super.onDismiss(p0);
       this.B.removeCallbacksAndMessages(null);
       VoicePartyTeamPkResultDialogFragment ty = this.y;
       if (ty != null && (PatchProxy.applyVoidOneRefs(ty, null, b.class, "10") || (ty != null && ty.p()))) {
          ty.f();
          ty.setImageDrawable(null);
       }
    label_0032 :
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTeamPkResultDialogFragment.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       if (!PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTeamPkResultDialogFragment.class, "6")) {
          this.doBindView(p0);
          Object[] objArray = null;
          int i = 2;
          int i1 = 1;
          if (PatchProxy.applyVoid(objArray, this, VoicePartyTeamPkResultDialogFragment.class, "8") || (this.t != null && this.s != null)) {
             LivePkResource$PkSkinResource vOICE_PARTY_ = LivePkResource$PkSkinResource.VOICE_PARTY_PK_RESOURCE_FINAL_WIN;
             int i3 = VoicePartyTeamPkResultDialogFragment$a.a[this.z.ordinal()];
             if (i3 != i1) {
                int i4 = 0x7f082514;
                int i5 = 0x7f060234;
                if (i3 != i) {
                   this.t.setText(R.string.arg_RES_7f105123);
                   this.t.setTextColor(a.a().a().getResources().getColor(i5));
                   vOICE_PARTY_ = LivePkResource$PkSkinResource.VOICE_PARTY_PK_RESOURCE_FINAL_TIE;
                   this.s.setBackgroundResource(i4);
                }else {
                   this.t.setText(R.string.arg_RES_7f10511b);
                   this.t.setTextColor(a.a().a().getResources().getColor(i5));
                   this.s.setBackgroundResource(i4);
                }
             }else {
                this.t.setText(R.string.arg_RES_7f10511c);
                this.t.setTextColor(a.a().a().getResources().getColor(R.color.arg_RES_7f06035b));
                this.s.setBackgroundResource(R.drawable.arg_RES_7f082515);
             }
             b.c(this.y, vOICE_PARTY_);
          }
       label_00c1 :
          if (!PatchProxy.applyVoid(objArray, this, VoicePartyTeamPkResultDialogFragment.class, "9") && this.z != VoicePartyTeamPkResult.DRAW) {
             VoicePartyTeamPkResultDialogFragment tA = this.A;
             if (tA != null && tA.size()) {
                int i2 = 4;
                KwaiImageView[] kwaiImageVie = new KwaiImageView[i2];
                kwaiImageVie[0] = this.u;
                kwaiImageVie[i1] = this.v;
                kwaiImageVie[i] = this.w;
                kwaiImageVie[3] = this.x;
                i = 0;
                while (i < i2) {
                   object oobject = kwaiImageVie[i];
                   if (i < this.A.size()) {
                      oobject.setVisibility(0);
                      VoicePartyMicSeatData mMicUser = this.A.get(i).mMicUser;
                      if (mMicUser != null) {
                         g.d(oobject, mMicUser.a, HeadImageSize.MIDDLE);
                      }
                   }else {
                      oobject.setVisibility(8);
                   }
                   i = i + 1;
                }
             }
          }
       }
    label_011f :
       this.B.postDelayed(new a(this), 5000);
       return;
    }
}
