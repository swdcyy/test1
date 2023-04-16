package com.kuaishou.live.common.core.component.fansgroup.joindialog.LiveAudienceJoinFansGroupDialog;
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
import android.widget.LinearLayout;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import android.os.Bundle;
import android.app.Dialog;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import lnc.l1;
import i2b.a;
import androidx.fragment.app.DialogFragment;
import lnc.a1;
import com.kwai.component.fansgroup.utils.FansGroupKswitchUtil;
import l95.b;
import java.util.HashMap;
import java.util.Map;
import l95.c;
import com.kuaishou.live.core.show.gift.LiveGiftResourcePathConstant;
import l12.d;
import va1.f0;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.fansgroup.joindialog.LiveAudienceJoinFansGroupDialog$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.common.core.component.fansgroup.joindialog.LiveAudienceJoinFansGroupDialog$b;
import com.kuaishou.live.common.core.basic.tools.l;
import com.kwai.framework.model.user.User;
import ekd.j;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import com.yxcorp.utility.TextUtils;

public class LiveAudienceJoinFansGroupDialog extends LiveSafeDialogFragment implements d	// class@0010f8
{
    public String A;
    public String B;
    public a C;
    public User D;
    public KwaiImageView s;
    public KwaiImageView t;
    public KwaiImageView u;
    public KwaiImageView v;
    public KwaiImageView w;
    public TextView x;
    public LinearLayout y;
    public PathLoadingView z;
    public static final int E;

    public void LiveAudienceJoinFansGroupDialog(){
       super();
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceJoinFansGroupDialog.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1947);
       this.t = m1.f(p0, 0x7f0a1941);
       this.u = m1.f(p0, 0x7f0a193f);
       this.v = m1.f(p0, 0x7f0a1945);
       this.w = m1.f(p0, 0x7f0a193e);
       this.x = m1.f(p0, 0x7f0a1944);
       this.y = m1.f(p0, 0x7f0a1943);
       this.z = m1.f(p0, 0x7f0a1946);
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LiveAudienceJoinFansGroupDialog.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       boolean b = true;
       uDialog.setCanceledOnTouchOutside(b);
       uDialog.setCancelable(b);
       Window window = uDialog.getWindow();
       if (window != null) {
          window.setBackgroundDrawableResource(R.color.arg_RES_7f06202f);
          window.requestFeature(b);
          window.setGravity(17);
          window.setDimAmount(0x3f000000);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveAudienceJoinFansGroupDialog.class, "3");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       int i = (l1.a())? 0x7f0d0c4f: 0x7f0d0c4e;
       return a.g(p0, i, p1, false);
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LiveAudienceJoinFansGroupDialog.class, "6")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       if (dialog == null) {
          return;
       }
       if (dialog.getWindow() != null) {
          Window window = dialog.getWindow();
          float f = (l1.a())? 224.00f: 280.00f;
          window.setLayout(a1.e(f), -2);
       }
       if (!PatchProxy.applyVoid(objArray, this, LiveAudienceJoinFansGroupDialog.class, "9") && FansGroupKswitchUtil.b()) {
          b uob = new b(true, "JoinDialog", "SHOW");
          uob.g(this.B);
          HashMap hashMap = new HashMap();
          hashMap.put("popupType", "JOIN_POPUP");
          hashMap.put("content", this.A);
          uob.d(hashMap);
          c.a(uob);
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveAudienceJoinFansGroupDialog.class, "4")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.doBindView(p0);
       this.wh();
       f0.a(this.s, LiveGiftResourcePathConstant.LIVE_AUDIENCE_FANS_GROUP_MEDAL_ICON);
       f0.a(this.t, LiveGiftResourcePathConstant.LIVE_AUDIENCE_FANS_GROUP_GIFT_ICON);
       f0.a(this.u, LiveGiftResourcePathConstant.LIVE_AUDIENCE_FANS_GROUP_ENTER_ROOM_EFFECT_ICON);
       this.x.setText(this.A);
       this.x.setVisibility(0);
       this.v.setOnClickListener(new LiveAudienceJoinFansGroupDialog$a(this));
       if (this.D == null) {
          return;
       }
       this.x.setOnClickListener(new LiveAudienceJoinFansGroupDialog$b(this));
       LiveAudienceJoinFansGroupDialog tw = this.w;
       LiveAudienceJoinFansGroupDialog tD = this.D;
       if (!PatchProxy.applyVoidTwoRefs(tw, tD, null, l.class, "3") && tD != null) {
          if (!j.h(tD.mAvatars)) {
             tw.U(tD.mAvatars);
          }else if(!TextUtils.x(tD.mAvatar)){
             tw.L(tD.mAvatar);
          }
       }
       return;
    }
    public void wh(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceJoinFansGroupDialog.class, "8")) {
          return;
       }
       this.z.setVisibility(8);
       this.z.a();
       this.y.setAlpha(0x3f800000);
       this.x.setVisibility(0);
       return;
    }
}
