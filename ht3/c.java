package ht3.c;
import com.kuaishou.merchant.popupController.api.IMerchantPopupManagerInterface;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnShowListener;
import jz6.a;
import android.content.Context;
import androidx.fragment.app.c;
import ma4.b;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.app.Dialog;
import android.app.Activity;
import com.kuaishou.merchant.log.biz.MerchantCommonLogBiz;
import com.kuaishou.merchant.popupController.api.models.DialogConfig;
import p74.a;
import o74.a;
import java.lang.Exception;
import androidx.fragment.app.KwaiDialogFragment;
import android.content.DialogInterface;
import tkd.b;
import tkd.d;
import ma4.e;
import ma4.c;
import ma4.a;

public abstract class c extends a implements IMerchantPopupManagerInterface, DialogInterface$OnDismissListener, DialogInterface$OnShowListener	// class@002c17
{
    public String b;
    public DialogInterface$OnDismissListener c;
    public DialogInterface$OnShowListener d;

    public void c(Context p0){
       super(p0);
       this.b = "MerchantBaseControllerKwaiDialog";
       this.d();
    }
    public void c(Context p0,int p1){
       super(p0, p1);
       this.b = "MerchantBaseControllerKwaiDialog";
       this.d();
    }
    public c T2(){
       return b.b(this);
    }
    public String Y8(){
       return b.c(this);
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       super.setOnDismissListener(this);
       super.setOnShowListener(this);
       return;
    }
    public void g4(c p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, c.class, "5")) {
          return;
       }
       if (this.getContext() instanceof Activity && (this.getContext().isFinishing() || this.getContext().isDestroyed())) {
          MerchantCommonLogBiz dIALOG = MerchantCommonLogBiz.DIALOG;
          c tb = this.b;
          DialogConfig mDialogName = (this.getConfig() != null)? this.getConfig().mDialogName: "";
          a.t(dIALOG, tb, "activity已销毁，不再展示弹窗!", "dialogName", mDialogName);
          return;
       }else {
          try{
             super.show();
          }catch(java.lang.Exception e4){
             a.A(MerchantCommonLogBiz.DIALOG, this.b, e4.getLocalizedMessage());
          }
          return;
       }
    }
    public KwaiDialogFragment getInstance(){
       return b.a(this);
    }
    public boolean l6(){
       return b.e(this);
    }
    public void onDismiss(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "3")) {
          return;
       }
       c tc = this.c;
       if (tc != null) {
          tc.onDismiss(p0);
       }
       e uoe = d.a(-1103669376);
       if (uoe != null && (uoe.k60() != null && this.getConfig() != null)) {
          uoe.k60().f(this.getConfig().mDialogName);
       }
    label_0036 :
       return;
    }
    public void onShow(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "4")) {
          return;
       }
       c td = this.d;
       if (td != null) {
          td.onShow(p0);
       }
       e uoe = d.a(-1103669376);
       if (uoe != null && (uoe.k60() != null && this.getConfig() != null)) {
          uoe.k60().b(this.getConfig().mDialogName);
       }
    label_0036 :
       return;
    }
    public void setOnDismissListener(DialogInterface$OnDismissListener p0){
       this.c = p0;
    }
    public void setOnShowListener(DialogInterface$OnShowListener p0){
       this.d = p0;
    }
    public void show(){
       if (PatchProxy.applyVoid(null, this, c.class, "2")) {
          return;
       }
       e uoe = d.a(-1103669376);
       if (uoe != null && (uoe.FU() != null && this.l6())) {
          uoe.FU().O3(this);
       }else {
          this.g4(null, null);
       }
       return;
    }
}
