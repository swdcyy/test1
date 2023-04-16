package com.kuaishou.live.core.voiceparty.video.audience.VoicePartyOpenVideoInvitationDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import com.kuaishou.live.core.voiceparty.video.audience.VoicePartyOpenVideoInvitationDialogFragment$a;
import nsd.u;
import com.kwai.framework.model.user.UserInfo;
import msd.l;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Bundle;
import android.app.Dialog;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import java.util.HashMap;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import com.yxcorp.gifshow.image.tools.HeadImageSize;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import wb5.g;
import java.lang.CharSequence;
import by2.a;
import android.view.View$OnClickListener;
import by2.b;
import lnc.a1;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import by2.c;
import erd.r;
import t45.d;
import brd.z;
import by2.d;
import erd.g;
import crd.b;
import qrd.l1;

public final class VoicePartyOpenVideoInvitationDialogFragment extends LiveSafeDialogFragment	// class@001ada
{
    public KwaiImageView s;
    public TextView t;
    public TextView u;
    public final UserInfo v;
    public final l w;
    public final l x;
    public HashMap y;
    public static final VoicePartyOpenVideoInvitationDialogFragment$a z;

    static {
       VoicePartyOpenVideoInvitationDialogFragment.z = new VoicePartyOpenVideoInvitationDialogFragment$a(null);
    }
    public void VoicePartyOpenVideoInvitationDialogFragment(UserInfo p0,l p1,l p2){
       a.p(p0, "inviter");
       a.p(p1, "onAccept");
       a.p(p2, "onDeny");
       super();
       this.v = p0;
       this.w = p1;
       this.x = p2;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, VoicePartyOpenVideoInvitationDialogFragment.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawable(new ColorDrawable(0));
       }
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setDimAmount(0x3f400000);
       }
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.requestFeature(1);
       }
       uDialog.setCanceledOnTouchOutside(0);
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, VoicePartyOpenVideoInvitationDialogFragment.class, "1");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0e6c, p1, false);
    }
    public void onDestroyView(){
       super.onDestroyView();
       if (PatchProxy.applyVoid(null, this, VoicePartyOpenVideoInvitationDialogFragment.class, "9")) {
       }else {
          VoicePartyOpenVideoInvitationDialogFragment ty = this.y;
          if (ty != null) {
             ty.clear();
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       View view;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyOpenVideoInvitationDialogFragment.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.onViewCreated(p0, p1);
       int i = 0x7f0a18b3;
       if (!PatchProxy.applyVoidOneRefs(p0, this, VoicePartyOpenVideoInvitationDialogFragment.class, "4")) {
          view = m1.f(p0, R.id.live_anchor_avatar_icon);
          a.o(view, "ViewBindUtils.bindWidget¡­.live_anchor_avatar_icon\)");
          this.s = view;
          view = m1.f(p0, R.id.live_anchor_user_name);
          a.o(view, "ViewBindUtils.bindWidget¡­id.live_anchor_user_name\)");
          this.t = view;
          view = m1.f(p0, i);
          a.o(view, "ViewBindUtils.bindWidget¡­nchor_invitation_decline\)");
          this.u = view;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, VoicePartyOpenVideoInvitationDialogFragment.class, "5")) {
          VoicePartyOpenVideoInvitationDialogFragment ts = this.s;
          if (ts == null) {
             a.S("mAvatarImageView");
          }
          g.d(ts, this.v, HeadImageSize.BIG);
          ts = this.t;
          if (ts == null) {
             a.S("mUserNameTextView");
          }
          ts.setText(this.v.mName);
          m1.a(p0, new a(this), R.id.live_anchor_invitation_accept);
          m1.a(p0, new b(this), i);
          t.interval(0, 1, TimeUnit.SECONDS).compose(c.c(this.m(), FragmentEvent.DESTROY)).takeUntil(c.b).observeOn(d.a).subscribe(new d(this, a1.p(R.string.arg_RES_7f102e24)));
       }
       return;
    }
    public final void wh(){
       if (PatchProxy.applyVoid(null, this, VoicePartyOpenVideoInvitationDialogFragment.class, "6")) {
          return;
       }
       this.x.invoke(l1.a);
       this.dismissAllowingStateLoss();
       return;
    }
}
