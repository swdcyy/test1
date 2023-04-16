package com.kuaishou.live.viewcontroller.dialog.DialogViewController;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.lifecycle.Lifecycle;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController$1;
import androidx.lifecycle.LifecycleObserver;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import kotlin.jvm.internal.a;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController$a;
import android.content.DialogInterface$OnCancelListener;
import com.kuaishou.live.viewcontroller.dialog.DialogViewController$b;
import android.content.DialogInterface$OnDismissListener;
import android.app.Activity;
import java.lang.Integer;
import android.widget.FrameLayout;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import ag6.a;
import android.view.ViewGroup$LayoutParams;
import com.kwai.robust.PatchProxyResult;
import eq3.d;

public class DialogViewController extends ViewController	// class@000ff0
{
    public Dialog j;
    public boolean k;

    public void DialogViewController(){
       super();
       this.getLifecycle().addObserver(new DialogViewController$1(this));
    }
    public void F2(){
       if (PatchProxy.applyVoid(null, this, DialogViewController.class, "7")) {
          return;
       }
       Dialog uDialog = this.W2();
       this.j = uDialog;
       String str = "dialog";
       if (uDialog == null) {
          a.S(str);
       }
       uDialog.setOnCancelListener(new DialogViewController$a(this));
       DialogViewController tj = this.j;
       if (tj == null) {
          a.S(str);
       }
       tj.setOnDismissListener(new DialogViewController$b(this));
       tj = this.j;
       if (tj == null) {
          a.S(str);
       }
       tj.setOwnerActivity(this.B2());
       return;
    }
    public void J2(){
       if (PatchProxy.applyVoid(null, this, DialogViewController.class, "10")) {
          return;
       }
       this.k = true;
       DialogViewController tj = this.j;
       if (tj == null) {
          a.S("dialog");
       }
       tj.setOnCancelListener(null);
       tj = this.j;
       if (tj == null) {
          a.S("dialog");
       }
       tj.setOnDismissListener(null);
       tj = this.j;
       if (tj == null) {
          a.S("dialog");
       }
       tj.dismiss();
       return;
    }
    public void M2(){
       if (PatchProxy.applyVoid(null, this, DialogViewController.class, "8")) {
          return;
       }
       DialogViewController tj = this.j;
       if (tj == null) {
          a.S("dialog");
       }
       tj.show();
       return;
    }
    public void N2(){
       if (PatchProxy.applyVoid(null, this, DialogViewController.class, "9")) {
          return;
       }
       DialogViewController tj = this.j;
       if (tj == null) {
          a.S("dialog");
       }
       tj.hide();
       return;
    }
    public void Q2(int p0){
       DialogViewController uDialogViewC = DialogViewController.class;
       if (PatchProxy.isSupport(uDialogViewC) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uDialogViewC, "4")) {
          return;
       }
       DialogViewController tj = this.j;
       if (tj == null) {
          a.S("dialog");
       }
       FrameLayout uFrameLayout = new FrameLayout(tj.getContext());
       tj = this.j;
       if (tj == null) {
          a.S("dialog");
       }
       this.T2(a.c(tj.getLayoutInflater(), p0, uFrameLayout, false));
       View view = this.C2();
       if (view != null) {
          uDialogViewC = this.j;
          if (uDialogViewC == null) {
             a.S("dialog");
          }
          uDialogViewC.setContentView(view, view.getLayoutParams());
       }
       return;
    }
    public void R2(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogViewController.class, "3")) {
          return;
       }
       a.p(p0, "view");
       this.T2(p0);
       DialogViewController tj = this.j;
       if (tj == null) {
          a.S("dialog");
       }
       ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
       if (layoutParams == null) {
          layoutParams = new ViewGroup$LayoutParams(-1, -1);
       }
       tj.setContentView(p0, layoutParams);
       return;
    }
    public final void V2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, DialogViewController.class, "6")) {
          return;
       }
       if (this.k == null) {
          this.k = true;
          ViewController viewControll = PatchProxy.apply(objArray, this, ViewController.class, "3");
          if (viewControll != PatchProxyResult.class) {
          }else {
             viewControll = this.f;
             if (viewControll == null) {
                a.S("controllerManager");
             }
          }
          viewControll.o1(this);
       }
       return;
    }
    public Dialog W2(){
       Object obj = PatchProxy.apply(null, this, DialogViewController.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Dialog(this.D2());
    }
    public void X2(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, DialogViewController.class, "2")) {
          return;
       }
       a.p(p0, "dialog");
       return;
    }
}
