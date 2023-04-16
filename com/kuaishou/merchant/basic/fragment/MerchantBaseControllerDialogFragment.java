package com.kuaishou.merchant.basic.fragment.MerchantBaseControllerDialogFragment;
import com.kuaishou.merchant.popupController.api.IMerchantPopupManagerInterface;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import androidx.fragment.app.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import com.kuaishou.merchant.popupController.api.models.DialogConfig;
import ma4.b;
import android.os.Bundle;
import android.app.Dialog;
import android.content.DialogInterface;
import tkd.b;
import tkd.d;
import ma4.e;
import ma4.c;
import ma4.a;

public class MerchantBaseControllerDialogFragment extends KwaiDialogFragment implements IMerchantPopupManagerInterface, DialogInterface$OnShowListener	// class@0015b4
{
    public WeakReference p;
    public String q;
    public DialogInterface$OnShowListener r;
    public boolean s;

    public void MerchantBaseControllerDialogFragment(){
       super();
       this.s = true;
    }
    public final void Cb(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantBaseControllerDialogFragment.class, "4")) {
          return;
       }
       this.s = true;
       this.sh(p0, p1);
       return;
    }
    public c T2(){
       MerchantBaseControllerDialogFragment obj = PatchProxy.apply(null, this, MerchantBaseControllerDialogFragment.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       if (obj != null) {
          return obj.get();
       }
       return null;
    }
    public final String Y8(){
       return this.q;
    }
    public void g4(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantBaseControllerDialogFragment.class, "9")) {
          return;
       }
       if (this.s != null) {
          super.Cb(p0, p1);
       }else {
          super.show(p0, p1);
       }
       return;
    }
    public DialogConfig getConfig(){
       return null;
    }
    public KwaiDialogFragment getInstance(){
       return this;
    }
    public boolean l6(){
       return b.e(this);
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, MerchantBaseControllerDialogFragment.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       super.ph(this);
       return super.onCreateDialog(p0);
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantBaseControllerDialogFragment.class, "7")) {
          return;
       }
       super.onDismiss(p0);
       e uoe = d.a(-1103669376);
       if (uoe != null && (uoe.k60() != null && this.getConfig() != null)) {
          uoe.k60().f(this.getConfig().mDialogName);
       }
    label_0032 :
       MerchantBaseControllerDialogFragment tp = this.p;
       if (tp != null) {
          tp.clear();
          this.p = null;
       }
       return;
    }
    public void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MerchantBaseControllerDialogFragment.class, "2")) {
          return;
       }
       MerchantBaseControllerDialogFragment tr = this.r;
       if (tr != null) {
          tr.onShow(p0);
       }
       e uoe = d.a(-1103669376);
       if (uoe != null && (uoe.k60() != null && this.getConfig() != null)) {
          uoe.k60().b(this.getConfig().mDialogName);
       }
    label_0036 :
       return;
    }
    public void ph(DialogInterface$OnShowListener p0){
       this.r = p0;
    }
    public final void sh(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantBaseControllerDialogFragment.class, "5")) {
          return;
       }
       this.p = new WeakReference(p0);
       this.q = p1;
       if (this.l6()) {
          if (!PatchProxy.applyVoid(null, this, MerchantBaseControllerDialogFragment.class, "6")) {
             a uoa = d.a(-1103669376).FU();
             if (uoa == null) {
                this.g4(this.p.get(), this.q);
             }else {
                uoa.O3(this);
             }
          }
       }else {
          this.g4(this.p.get(), this.q);
       }
       return;
    }
    public final void show(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MerchantBaseControllerDialogFragment.class, "3")) {
          return;
       }
       this.s = false;
       this.sh(p0, p1);
       return;
    }
}
