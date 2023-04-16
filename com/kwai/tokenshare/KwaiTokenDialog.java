package com.kwai.tokenshare.KwaiTokenDialog;
import bu7.m;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenInfo;
import com.kwai.feature.api.social.kwaitoken.model.ShareTokenDialogInfo;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import android.net.Uri;
import ekd.w0;
import wkd.b;
import nf6.i;
import android.content.Intent;
import oe6.b;
import androidx.fragment.app.KwaiDialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import org.greenrobot.eventbus.a;
import o56.a;
import com.yxcorp.utility.n;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import com.kwai.tokenshare.presenter.n;
import com.kwai.tokenshare.presenter.d;
import com.kwai.tokenshare.presenter.i;
import com.kwai.tokenshare.presenter.r;
import com.kwai.tokenshare.presenter.q;
import com.kwai.tokenshare.presenter.o;
import com.kwai.tokenshare.presenter.u;
import com.kwai.tokenshare.presenter.m;
import com.kwai.tokenshare.presenter.l;
import com.kwai.tokenshare.presenter.t;
import com.kwai.tokenshare.presenter.p;
import i2b.a;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.fragment.app.DialogFragment;
import android.app.Dialog;
import bu7.o;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;

public class KwaiTokenDialog extends ContainerFragment implements m	// class@001913
{
    public ShareTokenInfo x;
    public PresenterV2 y;
    public m z;
    public static final int A;

    public void KwaiTokenDialog(){
       super();
    }
    public final void Ch(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenDialog.class, "7")) {
          return;
       }
       if (this.getContext() == null) {
          return;
       }
       if (!TextUtils.x(this.x.mTokenDialog.mActionUri)) {
          Uri uri = w0.f(this.x.mTokenDialog.mActionUri);
          Intent intent = b.a(0x66dce92a).c(this.getContext(), uri, true, false);
          if (intent != null) {
             if (!TextUtils.x(w0.a(uri, "tab"))) {
                intent.putExtra("profile_tab", true);
             }
             intent.putExtra("from_share", true);
          }
          this.getContext().startActivity(intent);
       }
       if (!b.w()) {
          this.dismissAllowingStateLoss();
       }
       return;
    }
    public void Gf(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenDialog.class, "6")) {
          return;
       }
       this.Ch();
       KwaiTokenDialog tz = this.z;
       if (tz != null) {
          tz.Gf();
       }
       return;
    }
    public void H1(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenDialog.class, "9")) {
          return;
       }
       if (this.getContext() == null) {
          return;
       }
       if (!TextUtils.x(this.x.mTokenDialog.mAvatarTargetUrl)) {
          this.getContext().startActivity(b.a(0x66dce92a).c(this.getContext(), w0.f(this.x.mTokenDialog.mAvatarTargetUrl), true, false));
          if (!b.w()) {
             this.dismissAllowingStateLoss();
          }
          KwaiTokenDialog tz = this.z;
          if (tz != null) {
             tz.H1();
          }
       }
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenDialog.class, "8")) {
          return;
       }
       if (this.getContext() == null) {
          return;
       }
       if (!TextUtils.x(this.x.mTokenDialog.mSourceUri)) {
          this.getContext().startActivity(b.a(0x66dce92a).c(this.getContext(), w0.f(this.x.mTokenDialog.mSourceUri), true, false));
       }
       if (!b.w()) {
          this.dismissAllowingStateLoss();
       }
       KwaiTokenDialog tz = this.z;
       if (tz != null) {
          tz.V8();
       }
       return;
    }
    public void Zc(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenDialog.class, "5")) {
          return;
       }
       this.Ch();
       KwaiTokenDialog tz = this.z;
       if (tz != null) {
          tz.Zc();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenDialog.class, "4")) {
          return;
       }
       this.dismissAllowingStateLoss();
       KwaiTokenDialog tz = this.z;
       if (tz != null) {
          tz.e();
       }
       return;
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, KwaiTokenDialog.class, "2");
       if (p2 != PatchProxyResult.class) {
          return p2;
       }
       if (!a.d().i(this)) {
          a.d().p(this);
       }
       this.yh(n.c(a.B, 270.00f));
       this.zh(true);
       ShareTokenInfo serializable = SerializableHook.getSerializable(this.getArguments(), "data_kwai_token_token_info");
       this.x = serializable;
       int i = 0x7f0d0761;
       switch (serializable.mTokenDialog.mType){
           case 2:
             i = 0x7f0d0762;
             this.y = new p();
             break;
           case 3:
             i = 0x7f0d076b;
             this.y = new t();
             break;
           case 4:
           case 17:
             i = 0x7f0d075d;
             this.y = new l();
             break;
           case 5:
             i = 0x7f0d075e;
             this.y = new m();
             break;
           case 6:
             i = 0x7f0d075f;
             this.y = new m();
             break;
           case 7:
             i = 0x7f0d076c;
             this.y = new u();
             break;
           case 8:
             this.y = new o();
             break;
           case 11:
           case 13:
           case 14:
           case 15:
             i = 0x7f0d0764;
             this.y = new q();
             break;
           case 12:
             i = 0x7f0d0763;
             this.y = new r();
             break;
           case 18:
             i = 0x7f0d075b;
             this.y = new i();
             break;
           case 19:
             this.y = new d();
             break;
           default:
          label_004b :
             i = 0x7f0d0760;
             this.y = new n();
       }
       View view = a.g(p0, i, p1, false);
       this.y.f(view);
       Object[] objArray = new Object[]{this.x,this};
       this.y.i(objArray);
       this.setCancelable(true);
       this.getDialog().setCanceledOnTouchOutside(false);
       return view;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, KwaiTokenDialog.class, "3")) {
          return;
       }
       super.onDestroyView();
       KwaiTokenDialog ty = this.y;
       if (ty != null) {
          ty.destroy();
       }
       a.d().t(this);
       return;
    }
    public void onEventMainThread(o p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KwaiTokenDialog.class, "10")) {
          return;
       }
       if (p0.a != this && (this.isAdded() && (this.getActivity() != null && !this.getActivity().isFinishing()))) {
          this.dismissAllowingStateLoss();
       }
    label_0028 :
       return;
    }
}
