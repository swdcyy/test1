package com.yxcorp.gifshow.childlock.fragment.ChildLockDialog;
import ml8.d;
import androidx.fragment.app.KwaiDialogFragment;
import com.yxcorp.gifshow.activity.GifshowActivity;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.c;
import androidx.fragment.app.FragmentActivity;
import android.view.View;
import ekd.m1;
import android.widget.TextView;
import com.yxcorp.gifshow.childlock.fragment.a;
import android.view.View$OnClickListener;
import com.kwai.component.uiconfig.childlock.model.TeenageModeConfig;
import wh5.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$UrlPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ShowEvent;
import k2b.u1;
import android.app.Dialog;
import androidx.fragment.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import i2b.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.text.TextPaint;
import java.util.Objects;
import android.view.Window;

public class ChildLockDialog extends KwaiDialogFragment implements d	// class@00107d
{
    public TextView p;
    public TextView q;
    public boolean r;
    public TeenageModeConfig s;
    public static final int t;

    public void ChildLockDialog(){
       super();
    }
    public static ChildLockDialog sh(GifshowActivity p0,boolean p1){
       ChildLockDialog obj;
       if (PatchProxy.isSupport(ChildLockDialog.class)) {
          obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), null, ChildLockDialog.class, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = new ChildLockDialog();
       Bundle uBundle = new Bundle();
       uBundle.putBoolean("key_dialog_type", p1);
       obj.setArguments(uBundle);
       obj.Cb(p0.getSupportFragmentManager(), "child_lock_disable");
       return obj;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockDialog.class, "1")) {
          return;
       }
       this.p = m1.f(p0, 0x7f0a06df);
       this.q = m1.f(p0, 0x7f0a06e0);
       m1.a(p0, new a(this), R.id.child_lock_enter_pwd);
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ChildLockDialog.class, "3")) {
          return;
       }
       super.onCreate(p0);
       if (this.getArguments() != null) {
          this.r = this.getArguments().getBoolean("key_dialog_type");
       }
       this.s = a.c();
       if (!PatchProxy.applyVoid(null, this, ChildLockDialog.class, "11")) {
          ClientEvent$UrlPackage urlPackage = new ClientEvent$UrlPackage();
          urlPackage.page = 89;
          urlPackage.category = 1;
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          ClientEvent$ShowEvent showEvent = new ClientEvent$ShowEvent();
          ChildLockDialog ts = this.s;
          if (ts.mMode == null) {
             uElementPack.action = 1103;
          }else if(this.r == null){
             uElementPack.action = (ts.mCanVerifyIdCard != null)? 0x7812: 0x77fa;
          }else if(ts.mCanVerifyIdCard != null){
             uElementPack.action = 0x77fb;
          }else {
             uElementPack.action = 0x77fc;
          }
          showEvent.elementPackage = uElementPack;
          u1.z0(urlPackage, showEvent);
       }
       return;
    }
    public Dialog onCreateDialog(Bundle p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ChildLockDialog.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.setCancelable(false);
       this.setStyle(1, R.style.arg_RES_7f110362);
       return super.onCreateDialog(p0);
    }
    public View onCreateView(LayoutInflater p0,ViewGroup p1,Bundle p2){
       TeenageModeConfig teenageModeC;
       ChildLockDialog ts;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       p2 = PatchProxy.applyThreeRefs(p0, p1, p2, this, ChildLockDialog.class, "5");
       if (p2 != patchProxyRe) {
          return p2;
       }
       View view = a.g(p0, R.layout.arg_RES_7f0d01a7, p1, false);
       this.doBindView(view);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ChildLockDialog.class, "7")) {
          ChildLockDialog tp = this.p;
          if (this.r != null) {
             teenageModeC = PatchProxy.apply(objArray, this, ChildLockDialog.class, "12");
             if (teenageModeC != patchProxyRe) {
             }else {
                ts = this.s;
                teenageModeC = (ts.mMode == null && !TextUtils.isEmpty(ts.mOptionalCurfewText))? this.s.mOptionalCurfewText: this.s.mCurfewText;
             }
          }else {
             teenageModeC = PatchProxy.apply(objArray, this, ChildLockDialog.class, "13");
             if (teenageModeC != patchProxyRe) {
             }else {
                ts = this.s;
                teenageModeC = (ts.mMode == null && !TextUtils.isEmpty(ts.mOptionalOverTimeText))? this.s.mOptionalOverTimeText: this.s.mOverTimeText;
             }
          }
          tp.setText(teenageModeC);
          this.q.getPaint().setFakeBoldText(true);
          tp = this.s;
          if (tp.mMode == null) {
             this.q.setText(R.string.arg_RES_7f100542);
          }else if(tp.mCanVerifyIdCard != null){
             this.q.setText(R.string.arg_RES_7f105017);
          }else {
             this.q.setText(R.string.arg_RES_7f10053a);
          }
       }
       return view;
    }
    public void onStart(){
       if (PatchProxy.applyVoid(null, this, ChildLockDialog.class, "6")) {
          return;
       }
       super.onStart();
       Dialog dialog = this.getDialog();
       Objects.requireNonNull(dialog);
       Window window = dialog.getWindow();
       window.setLayout(-1, -2);
       window.setGravity(81);
       window.setWindowAnimations(R.style.arg_RES_7f1103bf);
       window.setDimAmount(0.30f);
       return;
    }
}
