package com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog;
import ml8.d;
import lnc.g2$a;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$a;
import com.yxcorp.gifshow.share.screenshot.ScreenShotShareDialog$1;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.share.screenshot.r;
import com.yxcorp.gifshow.share.screenshot.n;
import com.yxcorp.gifshow.share.screenshot.w;
import com.yxcorp.gifshow.share.screenshot.o;
import androidx.fragment.app.KwaiDialogFragment;
import n80.a;
import android.content.SharedPreferences;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Activity;
import java.lang.Integer;
import java.lang.CharSequence;
import e17.i;
import java.lang.System;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.share.screenshot.u;
import android.view.View$OnClickListener;
import uic.l;
import uic.m;
import android.os.Bundle;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.framework.model.feed.BaseFeed;
import android.os.Parcelable;
import android.net.Uri;
import com.kuaishou.android.model.feed.VideoFeed;
import java.lang.Number;
import i2b.a;
import android.view.ViewParent;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.Window;
import com.kwai.sdk.switchconfig.a;
import android.view.WindowManager$LayoutParams;
import lnc.g2;
import java.util.concurrent.TimeUnit;
import brd.t;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.trello.rxlifecycle3.android.FragmentEvent;
import gr8.b;
import gr8.c;
import brd.x;
import uic.n;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.share.screenshot.v;
import android.view.View$OnTouchListener;
import com.yxcorp.gifshow.share.screenshot.s;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.gifshow.share.screenshot.t;
import android.content.DialogInterface$OnShowListener;
import uic.k;
import android.content.DialogInterface$OnDismissListener;

public class ScreenShotShareDialog extends BottomSheetFragment implements d, g2$a	// class@001c4d
{
    public View A;
    public boolean B;
    public final ScreenShotShareDialog$a C;
    public final DefaultLifecycleObserver D;
    public View z;
    public static boolean E;

    public void ScreenShotShareDialog(){
       super();
       this.B = false;
       this.C = new ScreenShotShareDialog$a();
       this.D = new ScreenShotShareDialog$1(this);
    }
    public PresenterV2 B2(){
       PresenterV2 obj = PatchProxy.applyWithListener(null, this, ScreenShotShareDialog.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new PresenterV2();
       if (this.Jh()) {
          obj.U7(new r());
          obj.U7(new n());
       }else {
          obj.U7(new w());
          obj.U7(new o());
       }
       PatchProxy.onMethodExit(ScreenShotShareDialog.class, "8");
       return obj;
    }
    public final void Ih(){
       if (PatchProxy.applyVoid(null, this, ScreenShotShareDialog.class, "16")) {
          return;
       }
       boolean b = true;
       this.B = b;
       this.dismissAllowingStateLoss();
       if (!a.f()) {
          return;
       }
       int i = a.a.getInt("screenShotCloseTimes", 0) + b;
       a.k(i);
       if (i >= a.f()) {
          Object[] objArray = new Object[b];
          objArray[0] = Integer.toString(a.d());
          i.d(R.style.arg_RES_7f110668, String.format(this.getActivity().getString(R.string.arg_RES_7f10445f), objArray));
          a.l(System.currentTimeMillis());
          a.k(0);
       }
       return;
    }
    public final boolean Jh(){
       boolean b = (this.C.b != null)? true: false;
       return b;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreenShotShareDialog.class, "1")) {
          return;
       }
       this.z = m1.f(p0, 0x7f0a0785);
       m1.a(p0, u.b, R.id.screen_shot_preview);
       m1.a(p0, u.b, R.id.share_bottom_content);
       m1.a(p0, new l(this), R.id.close_btn);
       m1.a(p0, new m(this), R.id.screen_shot_container);
       return;
    }
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ScreenShotShareDialog.class, "15")) {
          return;
       }
       this.Ah(false);
       this.zh(true);
       super.onActivityCreated(p0);
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ScreenShotShareDialog.class, "4");
       if (p2 != patchProxyRe) {
          return p2;
       }
       if (!PatchProxy.applyVoid(null, this, ScreenShotShareDialog.class, "12")) {
          p2 = this.getArguments();
          if (p2 != null) {
             this.C.d = p2.getInt("SCREEN_SHOT_CHANNEL", 22);
             Serializable serializable = SerializableHook.getSerializable(p2, "SCREEN_SHOT_FEED");
             if (serializable instanceof BaseFeed) {
                this.C.b = serializable;
             }
             this.C.h = p2.getString("SCREEN_SHOT_CONTENT_ID", "");
             this.C.e = p2.getParcelable("SCREEN_SHOT_URL");
             this.C.i = p2.getString("SCREEN_SHOT_AUTHOR_ID", "");
             this.C.l = p2.getString("SCREEN_SHOT_EXP_TAG", "");
             ScreenShotShareDialog tC = this.C;
             ScreenShotShareDialog$a d = tC.d;
             ScreenShotShareDialog$a uoa = 34;
             if (uoa == d) {
                tC.g = "photo";
             }else if(36 == d || 35 == d){
                tC.g = "livestream";
             }
             if (uoa == d) {
                tC.j = "PHOTO_DETAIL";
             }else if(36 == d){
                tC.j = "LIVE_AUDIENCE";
             }else if(35 == d){
                tC.j = "LIVE_ANCHOR";
             }
             if (uoa == d) {
                uoa = tC.b;
                if (uoa != null) {
                   tC.k = (uoa instanceof VideoFeed)? "VIDEO": "IMAGE";
                }else if(36 == d || 35 == d){
                   tC.k = "LIVE_STREAM";
                }else {
                   tC.k = "SCREENSHOT";
                }
             }else {
                goto label_00af ;
             }
             tC.c = this;
          }
       }
       p2 = PatchProxy.apply(null, this, ScreenShotShareDialog.class, "5");
       if (p2 != patchProxyRe) {
          i = p2.intValue();
       }else if(this.Jh()){
          i = 0x7f0d133e;
       }else {
          i = 0x7f0d133c;
       }
       ScreenShotShareDialog tA = this.A;
       if (tA == null) {
          View view = a.g(p0, i, p1, false);
          this.A = view;
          this.doBindView(view);
       }else if(tA.getParent() != null){
          this.A.getParent().removeView(this.A);
       }
       return this.A;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, ScreenShotShareDialog.class, "10")) {
          return;
       }
       super.onDestroyView();
       this.getActivity().getLifecycle().removeObserver(this.D);
       return;
    }
    public void onStart(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ScreenShotShareDialog.class, "9")) {
          return;
       }
       super.onStart();
       if (!PatchProxy.applyVoid(objArray, this, ScreenShotShareDialog.class, "11")) {
          Dialog dialog = this.getDialog();
          if (dialog != null) {
             Window window = dialog.getWindow();
             if (window != null) {
                if (a.t().d("disableScreenShotBackgroundColor", false)) {
                   WindowManager$LayoutParams attributes = window.getAttributes();
                   attributes.dimAmount = 0;
                   attributes.flags = attributes.flags | 0x02;
                   window.setAttributes(attributes);
                }else {
                   window.setDimAmount(0x3f4ccccd);
                }
             }
          }
       }
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, ScreenShotShareDialog.class, "6")) {
          return;
       }
       super.onViewCreated(p0, p1);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ScreenShotShareDialog.class, "7")) {
          new g2(this, this).b(this.C);
       }
       if (!PatchProxy.applyVoid(objArray, this, ScreenShotShareDialog.class, "14") && (a.e() > 0 && !this.Jh())) {
          t.interval((long)a.e(), TimeUnit.SECONDS).compose(c.c(this.m(), FragmentEvent.DESTROY)).subscribe(new n(this));
       }
    label_005c :
       if (!PatchProxy.applyVoid(objArray, this, ScreenShotShareDialog.class, "13")) {
          this.z.setOnTouchListener(v.b);
          this.oh(s.b);
          this.ph(t.b);
          this.k0(new k(this));
       }
       this.getActivity().getLifecycle().addObserver(this.D);
       a.l(0);
       return;
    }
}
