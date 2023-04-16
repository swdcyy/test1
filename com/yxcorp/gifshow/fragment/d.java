package com.yxcorp.gifshow.fragment.d;
import android.content.DialogInterface$OnCancelListener;
import com.yxcorp.utility.AsyncTask;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.DialogFragment;
import gka.q;
import android.content.DialogInterface$OnDismissListener;
import java.lang.CharSequence;
import androidx.fragment.app.c;
import androidx.fragment.app.KwaiDialogFragment;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.Integer;
import android.content.DialogInterface;
import k2b.u1;
import android.content.Context;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import com.kwai.robust.PatchProxyResult;

public abstract class d extends AsyncTask implements DialogInterface$OnCancelListener	// class@001275
{
    public FragmentActivity p;
    public ProgressFragment q;
    public CharSequence r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public DialogInterface$OnDismissListener w;
    public boolean x;

    public void d(FragmentActivity p0){
       super(p0, true);
    }
    public void d(FragmentActivity p0,boolean p1){
       super();
       this.t = true;
       this.p = p0;
       this.r = p0.getString(0x7f103667);
       this.s = true;
       this.t = p1;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, d.class, "6")) {
          return;
       }
       this.p();
       return;
    }
    public void j(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "5")) {
          return;
       }
       this.p();
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, d.class, "8")) {
          return;
       }
       if (this.t == null) {
          return;
       }
       ProgressFragment progressFrag = new ProgressFragment();
       this.q = progressFrag;
       progressFrag.setCancelable(this.s);
       if (this.s != null) {
          this.q.oh(this);
       }
       this.q.zh(this.x);
       this.q.k0(new q(this));
       d tr = this.r;
       if (tr != null) {
          this.q.Jh(tr);
       }
       tr = this.v;
       if (tr > null) {
          this.q.Eh(this.u, tr);
       }
       tr = this.q;
       try{
          this.r(tr);
          this.q.show(this.p.getSupportFragmentManager(), "runner");
       }catch(java.lang.Exception e0){
          Log.e("ProgressDialogAsyncTask", "Show dialog exceptions : ", e0);
          this.q = null;
       }
       return;
    }
    public void l(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "7")) {
       }else {
          d tq = this.q;
          if (tq != null && (p0 != null && p0.length > 1)) {
             tq.Oh(p0[0].intValue(), p0[1].intValue());
          }
       }
       return;
    }
    public void onCancel(DialogInterface p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "4")) {
          return;
       }
       this.a(true);
       return;
    }
    public final void p(){
       if (PatchProxy.applyVoid(null, this, d.class, "9")) {
          return;
       }
       d tq = this.q;
       if (tq != null) {
          try{
             tq.dismiss();
          }catch(java.lang.IllegalArgumentException e0){
          }catch(java.lang.Exception e0){
             Log.e("ProgressDialogAsyncTask", "Dismiss dialog fragment exception: ", e0);
             u1.Q("Box.Dismiss.Exceptions", Log.f(e0));
          }
          this.q = null;
       }
    }
    public void q(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "11")) {
          return;
       }
       ExceptionHandler.handleException(this.p, p0);
       return;
    }
    public void r(ProgressFragment p0){
    }
    public d s(boolean p0){
       this.s = p0;
       return this;
    }
    public d t(int p0){
       if (PatchProxy.isSupport(d.class)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, d.class, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.r = this.p.getString(p0);
       return this;
    }
    public d u(int p0,int p1){
       Integer[] obj;
       if (PatchProxy.isSupport(d.class)) {
          obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, d.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       this.u = p0;
       this.v = p1;
       if (this.q != null) {
          obj = new Integer[]{Integer.valueOf(p0),Integer.valueOf(p1)};
          this.o(obj);
       }
       return this;
    }
}
