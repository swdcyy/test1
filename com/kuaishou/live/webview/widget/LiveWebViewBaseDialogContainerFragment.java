package com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment;
import gy2.a;
import com.yxcorp.gifshow.fragment.DialogContainerFragment;
import androidx.fragment.app.c;
import java.lang.String;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.webview.widget.LiveWebViewBaseDialogContainerFragment$a;
import gy2.g;
import com.kwai.robust.PatchProxyResult;
import gy2.c;
import gy2.b$a;
import gy2.g$a;
import gy2.e;
import gy2.n;
import com.kwai.sdk.switchconfig.a;
import io7.c;
import gy2.i;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import java.lang.Integer;
import android.app.Activity;
import android.content.res.Configuration;
import tkd.b;
import tkd.d;
import ym5.a;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import java.lang.Boolean;
import k2b.k2;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import k2b.u1;
import wkd.b;
import com.yxcorp.gifshow.log.h;
import q2b.i;
import android.content.DialogInterface;
import com.kuaishou.android.live.log.LiveLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import android.view.Window;
import qka.b;
import android.view.View;
import android.os.Bundle;

public class LiveWebViewBaseDialogContainerFragment extends DialogContainerFragment implements a	// class@001017
{
    public boolean H;
    public k2 I;
    public c J;
    public e K;

    public void LiveWebViewBaseDialogContainerFragment(){
       super();
       this.H = false;
    }
    public static void Nh(LiveWebViewBaseDialogContainerFragment p0,c p1,String p2){
       super.Cb(p1, p2);
    }
    public void Cb(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWebViewBaseDialogContainerFragment.class, "4")) {
          return;
       }
       LiveWebViewBaseDialogContainerFragment$a uoa = new LiveWebViewBaseDialogContainerFragment$a(this, p0, p1);
       c uoc = PatchProxy.applyThreeRefs(this, p0, uoa, null, g.class, "3");
       if (uoc != PatchProxyResult.class) {
       }else {
          uoc = g.a.d(this, p0, uoa);
       }
       this.J = uoc;
       return;
    }
    public e D6(){
       LiveWebViewBaseDialogContainerFragment obj = PatchProxy.apply(null, this, LiveWebViewBaseDialogContainerFragment.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.K;
       if (obj != null) {
          return obj;
       }
       if (this.H != null) {
          return n.d;
       }
       return new i(a.t().u("SOURCE_LIVE").d("enableLiveHalfScreenDialogStackable", false));
    }
    public void jc(){
       if (PatchProxy.applyVoid(null, this, LiveWebViewBaseDialogContainerFragment.class, "8")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       int i = this.D6().a();
       Dialog dialog = this.getDialog();
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(activity, Integer.valueOf(i), dialog, null, g.class, "6")) {
          g.a.c(activity, i, dialog);
       }
       return;
    }
    public void onConfigurationChanged(Configuration p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWebViewBaseDialogContainerFragment.class, "11")) {
          return;
       }
       super.onConfigurationChanged(p0);
       if (d.a(0x4c5dd1b8).f2()) {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void onDestroy(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, LiveWebViewBaseDialogContainerFragment.class, "3")) {
          return;
       }
       super.onDestroy();
       LiveWebViewBaseDialogContainerFragment obj = PatchProxy.apply(null, this, LiveWebViewBaseDialogContainerFragment.class, "6");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          obj = this.I;
          if (obj != null && (obj.c != null || TextUtils.x(obj.d))) {
             obj = this.I;
             if (obj.b != null && !TextUtils.n(obj.d, u1.j().d)) {
                b = true;
             }
          }
          b = false;
       }
       if (b) {
          b.a(0x4b316083).Y0(this.I.d());
       }
       this.I = null;
       return;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, LiveWebViewBaseDialogContainerFragment.class, "10")) {
          return;
       }
       super.onDestroyView();
       return;
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveWebViewBaseDialogContainerFragment.class, "5")) {
          return;
       }
       super.onDismiss(p0);
       LiveWebViewBaseDialogContainerFragment tJ = this.J;
       if (tJ != null) {
          tJ.a(this);
          this.J = null;
       }
       return;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, LiveWebViewBaseDialogContainerFragment.class, "1")) {
          return;
       }
       Dialog dialog = this.getDialog();
       if (this.H != null && dialog != null) {
          b.Z(LiveLogTag.LIVE_WEB_VIEW, "enableFullScreenFit");
          b.a(dialog.getWindow());
       }
       super.onStart();
       return;
    }
    public void onViewCreated(View p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, LiveWebViewBaseDialogContainerFragment.class, "2")) {
          return;
       }
       super.onViewCreated(p0, p1);
       this.I = u1.j();
       return;
    }
    public void xc(e p0){
       this.K = p0;
    }
    public void zc(){
       if (PatchProxy.applyVoid(null, this, LiveWebViewBaseDialogContainerFragment.class, "7")) {
          return;
       }
       FragmentActivity activity = this.getActivity();
       int i = this.D6().a();
       Dialog dialog = this.getDialog();
       if (!PatchProxy.isSupport(g.class) || !PatchProxy.applyVoidThreeRefs(activity, Integer.valueOf(i), dialog, null, g.class, "5")) {
          g.a.e(activity, i, dialog);
       }
       return;
    }
}
