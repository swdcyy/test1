package com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment;
import android.text.TextWatcher;
import com.yxcorp.gifshow.fragment.BottomSheetFragment;
import lnc.ea;
import java.lang.Class;
import android.content.Context;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.DialogFragment;
import zf6.l;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$b;
import com.yxcorp.gifshow.widget.EmojiEditText;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$c;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$d;
import android.view.View;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$e;
import android.graphics.drawable.Drawable;
import android.app.Dialog;
import android.view.Window;
import com.yxcorp.utility.n;
import java.lang.Boolean;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$h;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$Arguments;
import android.text.Editable;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$n;
import java.lang.CharSequence;
import java.lang.Runnable;
import android.view.View$OnClickListener;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$j;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Exception;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.os.Build$VERSION;
import java.lang.reflect.Field;
import com.yxcorp.gifshow.fragment.ContainerFragment;
import androidx.fragment.app.FragmentActivity;
import android.app.Activity;
import jz6.a;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$a;
import android.content.DialogInterface$OnKeyListener;
import com.yxcorp.gifshow.util.rx.RxBus;
import ky5.d;
import brd.t;
import t45.d;
import brd.z;
import ky5.a;
import erd.g;
import crd.b;
import com.trello.rxlifecycle3.components.support.RxDialogFragment;
import com.kwai.feature.component.commonfragment.baseeditor.BaseEditorFragment$m;

public abstract class BaseEditorFragment extends BottomSheetFragment implements TextWatcher	// class@0011f3
{
    public BaseEditorFragment$d A;
    public BaseEditorFragment$e B;
    public BaseEditorFragment$n C;
    public BaseEditorFragment$f D;
    public View$OnClickListener E;
    public BaseEditorFragment$l F;
    public BaseEditorFragment$k G;
    public Runnable H;
    public BaseEditorFragment$b I;
    public ImageButton J;
    public Drawable K;
    public View$OnClickListener L;
    public BaseEditorFragment$Arguments M;
    public CharSequence N;
    public int O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public String V;
    public int W;
    public BaseEditorFragment$i X;
    public BaseEditorFragment$j Y;
    public b Z;
    public BaseEditorFragment$c z;
    public static int U0;

    static {
       ea.b().c(BaseEditorFragment.class);
    }
    public void BaseEditorFragment(){
       super();
       this.O = BaseEditorFragment.U0;
    }
    public Context Ih(Context p0,int p1){
       if (PatchProxy.isSupport(BaseEditorFragment.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), this, BaseEditorFragment.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return l.d(p0, p1, this.getTheme());
    }
    public BaseEditorFragment$b Jh(){
       return this.I;
    }
    public abstract EmojiEditText Kh();
    public BaseEditorFragment$c Lh(){
       return this.z;
    }
    public BaseEditorFragment$d Mh(){
       return this.A;
    }
    public View Nh(){
       return null;
    }
    public BaseEditorFragment$e Oh(){
       return this.B;
    }
    public Drawable Ph(){
       return this.K;
    }
    public void Qh(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "9")) {
          return;
       }
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          n.F(this.getDialog().getWindow());
       }
       return;
    }
    public boolean Rh(){
       return false;
    }
    public boolean Sh(){
       return false;
    }
    public boolean Th(){
       return false;
    }
    public void Uh(){
    }
    public void Vh(int[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "15")) {
          return;
       }
       this.Wh(p0, false);
       return;
    }
    public void Wh(int[] p0,boolean p1){
       if (PatchProxy.isSupport(BaseEditorFragment.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, BaseEditorFragment.class, "16")) {
          return;
       }
       if (this.Lh() != null) {
          int i = 1;
          if (this.T != p0[i] || this.U != this.O) {
             this.T = p0[i];
             this.U = this.O;
             this.Lh().c(new BaseEditorFragment$h(p0[i], this.O, p1));
          }
       }
       return;
    }
    public void Xh(boolean p0){
       BaseEditorFragment tM = this.M;
       if (tM != null) {
          tM.mCancelWhenKeyboardHidden = p0;
       }
       return;
    }
    public void Yh(int p0){
       this.W = p0;
    }
    public void Zh(String p0){
       this.V = p0;
    }
    public void afterTextChanged(Editable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "7")) {
          return;
       }
       BaseEditorFragment tC = this.C;
       if (tC != null && tC.a(p0)) {
          this.Uh();
       }
       return;
    }
    public BaseEditorFragment ai(BaseEditorFragment$c p0){
       this.z = p0;
       return this;
    }
    public void beforeTextChanged(CharSequence p0,int p1,int p2,int p3){
    }
    public BaseEditorFragment bi(Runnable p0){
       this.H = p0;
       return this;
    }
    public abstract void cancel();
    public BaseEditorFragment ci(View$OnClickListener p0){
       this.E = p0;
       return this;
    }
    public void di(BaseEditorFragment$j p0){
       this.Y = p0;
    }
    public void dismiss(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "11")) {
          return;
       }
       try{
          this.Qh();
          BaseEditorFragment tM = this.M;
          if (tM == null || tM.mAllowingStateLoss == null) {
             super.dismiss();
          }else {
             super.dismissAllowingStateLoss();
          }
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       return;
    }
    public void dismissAllowingStateLoss(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "12")) {
          return;
       }
       this.Qh();
       super.dismissAllowingStateLoss();
       return;
    }
    public BaseEditorFragment ei(BaseEditorFragment$n p0){
       this.C = p0;
       return this;
    }
    public boolean fh(){
       return false;
    }
    public void fi(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "10")) {
          return;
       }
       if (this.getDialog() != null && this.getDialog().getWindow() != null) {
          n.b0(this.getContext(), this.Kh(), false);
       }
       return;
    }
    public void gi(){
    }
    public abstract void hi(CharSequence p0);
    public void onActivityCreated(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseEditorFragment.class, "3")) {
          return;
       }
       Window window = this.getDialog().getWindow();
       super.onActivityCreated(p0);
       int i = (this.M.mShowKeyBoardFirst != null)? 20: 18;
       try{
          window.setSoftInputMode(i);
          i = Build$VERSION.SDK_INT;
          if (i < 29) {
             window.addFlags(Integer.MIN_VALUE);
             window.addFlags(0x4000000);
             window.setStatusBarColor(0);
             if (i >= 24) {
                Field declaredFiel = Class.forName("com.android.internal.policy.DecorView").getDeclaredField("mSemiTransparentStatusBarColor");
                declaredFiel.setAccessible(true);
                declaredFiel.setInt(window.getDecorView(), 0);
             }
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public Dialog onCreateDialog(Bundle p0){
       p0 = PatchProxy.applyOneRefs(p0, this, BaseEditorFragment.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       boolean b = true;
       this.setCancelable(b);
       BaseEditorFragment$Arguments uArguments = BaseEditorFragment$Arguments.fromBundle(this.getArguments());
       this.M = uArguments;
       this.N = uArguments.mText;
       BaseEditorFragment$Arguments mTheme = uArguments.mTheme;
       if (mTheme == null) {
          mTheme = 0x7f11013f;
       }
       uArguments.mTheme = mTheme;
       this.setStyle(2, mTheme);
       this.uh(this.M.mTheme);
       int sDK_INT = Build$VERSION.SDK_INT;
       int i = 0;
       if (sDK_INT >= 24) {
          this.zh(this.getActivity().isInMultiWindowMode());
       }else {
          this.zh(i);
       }
       a uoa = new a(this.getActivity(), this.getTheme());
       if (sDK_INT >= 29) {
          uoa.getWindow().getDecorView().setSystemUiVisibility(1280);
          uoa.getWindow().setStatusBarColor(i);
       }else if(this.M.mShowTransparentStatus != null){
          uoa.getWindow().addFlags(0x4000000);
       }
       uoa.setCanceledOnTouchOutside(b);
       uoa.setOnKeyListener(new BaseEditorFragment$a(this));
       return uoa;
    }
    public void onDestroyView(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "13")) {
          return;
       }
       super.onDestroyView();
       if (this.Lh() != null) {
          this.Lh().c(new BaseEditorFragment$h(-1, this.O, true));
       }
       BaseEditorFragment.U0 = this.O;
       if (this.Oh() != null) {
          this.Oh().a(-1, 0);
       }
       return;
    }
    public void onPause(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "8")) {
          return;
       }
       this.Qh();
       super.onPause();
       return;
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "4")) {
          return;
       }
       super.onResume();
       this.Z = RxBus.f.f(d.class).observeOn(d.a).subscribe(new a(this));
       return;
    }
    public void onStop(){
       if (PatchProxy.applyVoid(null, this, BaseEditorFragment.class, "5")) {
          return;
       }
       super.onStop();
       BaseEditorFragment tZ = this.Z;
       if (tZ != null) {
          tZ.dispose();
       }
       return;
    }
    public void onTextChanged(CharSequence p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(BaseEditorFragment.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, BaseEditorFragment.class, "6")) {
          return;
       }
       if (this.M.mMonitorTextChanged != null) {
          BaseEditorFragment$m om = new BaseEditorFragment$m();
          String str = (p0 != null)? p0.toString(): "";
          om.a = str;
          om.b = p1;
          om.c = p3;
          om.d = p2;
          om.e = this.M.mMonitorId;
          if (this.Lh() != null) {
             this.Lh().d(om);
          }
       }
       return;
    }
}
