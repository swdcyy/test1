package com.kuaishou.live.common.core.component.encouragetreasure.LiveEncourageResultDialogFragment;
import com.kuaishou.live.core.basic.widget.LiveSafeDialogFragment;
import xp5.i;
import k71.f$a;
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
import com.kuaishou.live.common.core.component.encouragetreasure.LiveEncourageResultDialogFragment$a;
import android.content.DialogInterface$OnShowListener;
import android.view.Window;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import i2b.a;
import com.yxcorp.gifshow.widget.cdn.KwaiCDNImageView;
import android.widget.TextView;
import com.yxcorp.widget.selector.view.SelectShapeTextView;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.CharSequence;
import com.kuaishou.live.common.core.component.encouragetreasure.LiveEncourageResultDialogFragment$b;
import android.view.View$OnClickListener;
import com.kuaishou.live.common.core.component.encouragetreasure.LiveEncourageResultDialogFragment$c;
import android.widget.ImageView;
import java.lang.Integer;
import gg1.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import k2b.e0;
import java.util.Objects;
import lnc.i3;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import k2b.u1;
import gg1.c;
import java.util.List;
import com.kuaishou.android.live.log.b;

public final class LiveEncourageResultDialogFragment extends LiveSafeDialogFragment	// class@0010f4
{
    public final i s;
    public final f$a t;
    public final l u;

    public void LiveEncourageResultDialogFragment(i p0,f$a p1,l p2){
       a.p(p0, "liveLogPackageProvider");
       a.p(p1, "dialogParams");
       a.p(p2, "onDismissDialog");
       super();
       this.s = p0;
       this.t = p1;
       this.u = p2;
    }
    public Dialog onCreateDialog(Bundle p0){
       Window obj = PatchProxy.applyOneRefs(p0, this, LiveEncourageResultDialogFragment.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Dialog uDialog = super.onCreateDialog(p0);
       a.o(uDialog, "super.onCreateDialog\(savedInstanceState\)");
       uDialog.setCanceledOnTouchOutside(false);
       uDialog.setCancelable(false);
       uDialog.setOnShowListener(new LiveEncourageResultDialogFragment$a(this));
       obj = uDialog.getWindow();
       if (obj != null) {
          obj.setBackgroundDrawableResource(R.color.arg_RES_7f06202f);
          obj.requestFeature(1);
          obj.setGravity(17);
          obj.setDimAmount(0x3f333333);
       }
       return uDialog;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, LiveEncourageResultDialogFragment.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       a.p(p0, "inflater");
       return a.g(p0, 0x7f0d0ae8, p1, false);
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveEncourageResultDialogFragment.class, "1")) {
          return;
       }
       a.p(p0, "rootView");
       super.onViewCreated(p0, p1);
       TextView textView = p0.findViewById(R.id.dialog_title);
       TextView textView1 = p0.findViewById(R.id.dialog_sub_title);
       SelectShapeTextView selectShapeT = p0.findViewById(R.id.dialog_btn);
       p0.findViewById(R.id.dialog_background).L(this.t.backgroundImage);
       p0.findViewById(R.id.dialog_box_image_view).L(this.t.rewardIcon);
       a.o(textView, "titleTextView");
       textView.setText(this.t.title);
       a.o(textView1, "subTitleTextView");
       textView1.setText(this.t.subTitle);
       a.o(selectShapeT, "guideButtonTextView");
       selectShapeT.setText(this.t.a());
       selectShapeT.setOnClickListener(new LiveEncourageResultDialogFragment$b(this));
       p0.findViewById(R.id.dialog_close_btn).setOnClickListener(new LiveEncourageResultDialogFragment$c(this));
       return;
    }
    public final void wh(int p0){
       String str1;
       i3 oi3;
       ClientEvent$ElementPackage uElementPack;
       ClientContent$ContentPackage uContentPack;
       String str = "4";
       if (PatchProxy.isSupport(LiveEncourageResultDialogFragment.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveEncourageResultDialogFragment.class, str)) {
          return;
       }
       this.dismissAllowingStateLoss();
       this.u.invoke(Integer.valueOf(p0));
       if (!PatchProxy.isSupport(LiveEncourageResultDialogFragment.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, LiveEncourageResultDialogFragment.class, "5")) {
          int i = 2;
          if (p0 != 1) {
             str1 = (p0 != i)? "": "Bottom";
          }else {
             str1 = "CLOSE";
          }
          a a = a.a;
          ClientContent$LiveStreamPackage liveStreamPa = this.s.a();
          a.o(liveStreamPa, "liveLogPackageProvider.liveStreamPackage");
          e0 page = this.s.getPage();
          a.o(page, "liveLogPackageProvider.page");
          String str2 = this.t.a();
          String str3 = this.t.b();
          Objects.requireNonNull(a);
          int i1 = 0;
          if (PatchProxy.isSupport(a.class)) {
             Object[] objArray = new Object[]{liveStreamPa,page,str2,str1,str3};
             if (!PatchProxy.applyVoid(objArray, a, a.class, str)) {
             }
          }else {
          }
       }
    label_00f8 :
       b.P(c.a, "on close button click");
       return;
    }
}
