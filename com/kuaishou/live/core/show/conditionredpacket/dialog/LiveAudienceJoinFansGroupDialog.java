package com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog;
import ml8.d;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import x52.a;
import com.kwai.framework.model.user.User;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import android.widget.LinearLayout;
import com.kwai.library.widget.refresh.path.PathLoadingView;
import android.os.Bundle;
import android.app.Dialog;
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
import com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog$a;
import android.view.View$OnClickListener;
import android.widget.ImageView;
import com.kuaishou.live.core.show.conditionredpacket.dialog.LiveAudienceJoinFansGroupDialog$b;
import z12.x;

public class LiveAudienceJoinFansGroupDialog extends LiveSafeDialogFragment implements d	// class@000a6e
{
    public a A;
    public User B;
    public KwaiImageView s;
    public KwaiImageView t;
    public KwaiImageView u;
    public TextView v;
    public LinearLayout w;
    public PathLoadingView x;
    public String y;
    public String z;

    public void LiveAudienceJoinFansGroupDialog(){
       super();
    }
    public static LiveAudienceJoinFansGroupDialog xh(a p0,User p1,String p2,String p3){
       LiveAudienceJoinFansGroupDialog obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, LiveAudienceJoinFansGroupDialog.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new LiveAudienceJoinFansGroupDialog();
       obj.A = p0;
       obj.B = p1;
       obj.y = p2;
       obj.z = p3;
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveAudienceJoinFansGroupDialog.class, "2")) {
          return;
       }
       this.s = m1.f(p0, 0x7f0a1941);
       this.t = m1.f(p0, 0x7f0a1945);
       this.u = m1.f(p0, 0x7f0a193e);
       this.v = m1.f(p0, 0x7f0a1944);
       this.w = m1.f(p0, 0x7f0a1943);
       this.x = m1.f(p0, 0x7f0a1946);
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
       int i = (l1.a())? 0x7f0d0a19: 0x7f0d0a18;
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
          b uob = new b(false, "JoinDialog", "SHOW");
          HashMap hashMap = new HashMap();
          hashMap.put("popupType", "JOIN_POPUP");
          hashMap.put("content", this.y);
          hashMap.put("source", this.z);
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
       f0.a(this.s, LiveGiftResourcePathConstant.LIVE_AUDIENCE_FANS_GROUP_GIFT_ICON);
       this.v.setText(this.y);
       this.v.setVisibility(0);
       this.t.setOnClickListener(new LiveAudienceJoinFansGroupDialog$a(this));
       if (this.B == null) {
          return;
       }
       this.v.setOnClickListener(new LiveAudienceJoinFansGroupDialog$b(this));
       x.c(this.u, this.B);
       return;
    }
    public void wh(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceJoinFansGroupDialog.class, "8")) {
          return;
       }
       this.x.setVisibility(8);
       this.x.a();
       this.w.setAlpha(0x3f800000);
       this.v.setVisibility(0);
       return;
    }
    public void yh(){
       if (PatchProxy.applyVoid(null, this, LiveAudienceJoinFansGroupDialog.class, "7")) {
          return;
       }
       this.x.setVisibility(0);
       this.x.k();
       this.w.setAlpha(0x3f000000);
       this.v.setVisibility(8);
       return;
    }
}
