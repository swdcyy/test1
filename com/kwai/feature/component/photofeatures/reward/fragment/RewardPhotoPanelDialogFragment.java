package com.kwai.feature.component.photofeatures.reward.fragment.RewardPhotoPanelDialogFragment;
import com.yxcorp.gifshow.recycler.fragment.BaseDialogFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.w;
import androidx.fragment.app.KwaiDialogFragment;
import android.os.Bundle;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import hz5.a;
import android.content.DialogInterface$OnKeyListener;
import java.lang.Number;
import dz5.p;
import dz5.h;
import ok.x;
import java.lang.Integer;
import java.util.Objects;
import ag6.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import android.view.WindowManager$LayoutParams;
import ekd.f;
import com.kwai.feature.component.photofeatures.reward.fragment.RewardPhotoPanelDialogFragment$a;
import androidx.fragment.app.Fragment;
import android.os.Parcelable;
import org.parceler.b;
import com.kwai.feature.component.photofeatures.reward.model.response.RewardPanelInfoResponse$PanelInfo;
import android.view.ViewStub;
import nz5.y;
import nz5.s;
import com.kwai.feature.component.photofeatures.reward.presenter.c;
import nz5.c0;
import nz5.d0;
import nz5.b0;
import com.kwai.feature.component.photofeatures.reward.presenter.BaseRewardPhotoSelectGiftWithAnimPresenter;
import nz5.f0;
import nz5.g0;
import nz5.e0;
import iz5.a;
import java.lang.Long;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.e0;
import com.kuaishou.client.log.content.packages.nano.ClientContentWrapper$ContentWrapper;
import k2b.u1;

public class RewardPhotoPanelDialogFragment extends BaseDialogFragment	// class@00122b
{
    public PresenterV2 p;
    public RewardPhotoPanelDialogFragment$a q;
    public QPhoto r;
    public RewardPanelInfoResponse$PanelInfo s;
    public String t;
    public static final int u;

    public void RewardPhotoPanelDialogFragment(){
       super();
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, RewardPhotoPanelDialogFragment.class, "13")) {
          return;
       }
       if (w.w0(this.r.getPhotoMeta())) {
          return;
       }
       super.dismiss();
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardPhotoPanelDialogFragment.class, "4")) {
          return;
       }
       super.onActivityCreated(p0);
       this.getDialog().getWindow().setWindowAnimations(R.style.arg_RES_7f1103de);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RewardPhotoPanelDialogFragment.class, "1")) {
          return;
       }
       super.onCreate(p0);
       this.setStyle(1, R.style.arg_RES_7f110362);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, RewardPhotoPanelDialogFragment.class, "2");
       if (p2 != patchProxyRe) {
          return p2;
       }
       this.getDialog().setOnKeyListener(new a(this));
       p2 = PatchProxy.apply(null, this, RewardPhotoPanelDialogFragment.class, "5");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else {
          int i1 = h.a.get().intValue();
          Objects.requireNonNull(p.a);
          if (i1 != 2) {
             i = (i1 == 3 || i1 != 4)? 0x7f0d0893: 0x7f0d0894;
          }else {
             i = 0x7f0d0892;
          }
       }
       return a.c(p0, i, p1, false);
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, RewardPhotoPanelDialogFragment.class, "11")) {
          return;
       }
       super.onDestroyView();
       this.p.destroy();
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RewardPhotoPanelDialogFragment.class, "10")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, RewardPhotoPanelDialogFragment.class, "12")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             dialog.setCancelable(true);
             dialog.setCanceledOnTouchOutside(true);
             WindowManager$LayoutParams attributes = dialog.getWindow().getAttributes();
             attributes.gravity = 80;
             attributes.width = -1;
             attributes.height = -2;
             dialog.getWindow().setAttributes(attributes);
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       ClientEvent$ElementPackage uElementPack;
       x a;
       c0 uoc0;
       f0 uof0;
       c0 uoc01;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, RewardPhotoPanelDialogFragment.class, "3")) {
          return;
       }
       super.onViewCreated(p0, p1);
       f.f(p0);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, RewardPhotoPanelDialogFragment.class, "9")) {
          this.getDialog().getWindow().setSoftInputMode(34);
       }
       RewardPhotoPanelDialogFragment$a uoa = PatchProxy.apply(objArray, this, RewardPhotoPanelDialogFragment.class, "8");
       if (uoa != patchProxyRe) {
       }else {
          this.r = b.a(this.getArguments().getParcelable("photo"));
          this.s = b.a(this.getArguments().getParcelable("reward_panel_info"));
          this.t = this.getArguments().getString("reward_dialog_source");
          uoa = new RewardPhotoPanelDialogFragment$a();
          this.q = uoa;
          uoa.b = this.r;
          uoa.c = this.s;
          uoa.d = this;
          uoa.f = this.t;
       }
       this.q = uoa;
       if (!PatchProxy.applyVoidOneRefs(p0, this, RewardPhotoPanelDialogFragment.class, "6")) {
          ViewStub viewStub = p0.findViewById(R.id.reward_panel_bottom_stub);
          if (viewStub != null) {
             int i3 = (p.a(this.s))? 0x7f0d088d: 0x7f0d088c;
             viewStub.setLayoutResource(i3);
             viewStub.inflate();
          }
       }
       p op = p.class;
       String str = "7";
       PresenterV2 presenterV2 = PatchProxy.applyOneRefsWithListener(p0, this, RewardPhotoPanelDialogFragment.class, str);
       if (presenterV2 != patchProxyRe) {
       }else {
          presenterV2 = new PresenterV2();
          a = h.a;
          int i = 4;
          uElementPack = 3;
          if (a.get().intValue() == uElementPack || a.get().intValue() == i) {
             presenterV2.U7(new y());
          }
          if (p.a(this.s)) {
             presenterV2.U7(new s());
          }
          p a1 = p.a;
          int i1 = a.get().intValue();
          Objects.requireNonNull(a1);
          if (PatchProxy.isSupport(op)) {
             uoc0 = PatchProxy.applyOneRefs(Integer.valueOf(i1), a1, op, "1");
             if (uoc0 != patchProxyRe) {
             label_0138 :
                presenterV2.U7(uoc0);
                int i2 = a.get().intValue();
                if (PatchProxy.isSupport(op)) {
                   uof0 = PatchProxy.applyOneRefs(Integer.valueOf(i2), a1, op, "2");
                   if (uof0 != patchProxyRe) {
                   }else if(i2 != 2){
                      if (i2 != uElementPack) {
                         uof0 = (i2 != i)? new f0(): new g0();
                      }else {
                         uof0 = new f0();
                      }
                   }else {
                      uof0 = new e0();
                   }
                }else {
                   goto label_015a ;
                }
                presenterV2.U7(uof0);
                presenterV2.f(p0);
                PatchProxy.onMethodExit(RewardPhotoPanelDialogFragment.class, str);
             }
          }
          if (i1 != 2) {
             if (i1 != uElementPack) {
                uoc01 = (i1 != i)? new c0(): new d0();
             }else {
                uoc01 = new c0();
             }
          }else {
             uoc01 = new b0();
          }
          uoc0 = uoc01;
          goto label_0138 ;
       }
       this.p = presenterV2;
       Object[] objArray1 = new Object[]{this.q};
       presenterV2.i(objArray1);
       RewardPhotoPanelDialogFragment tr = this.r;
       RewardPanelInfoResponse$PanelInfo mKsCoinBalan = this.s.mKsCoinBalance;
       RewardPhotoPanelDialogFragment tt = this.t;
       if (!PatchProxy.isSupport(a.class) || !PatchProxy.applyVoidFourRefs(tr, this, Long.valueOf(mKsCoinBalan), tt, null, a.class, "1")) {
          uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "FAVOR_AUTHOR_DIALOG";
          JsonObject jsonObject = new JsonObject();
          jsonObject.a0("balance_cnt", Long.valueOf(mKsCoinBalan));
          jsonObject.c0("dialog_source", tt);
          uElementPack.params = jsonObject.toString();
          u1.D0("2305010", this, 4, uElementPack, a.a(tr), null);
       }
       return;
    }
}
