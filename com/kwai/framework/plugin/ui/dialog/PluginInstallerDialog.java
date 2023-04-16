package com.kwai.framework.plugin.ui.dialog.PluginInstallerDialog;
import vi5.c;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.framework.plugin.ui.dialog.PluginInstallerDialog$a;
import nsd.u;
import java.lang.Object;
import java.lang.ref.WeakReference;
import vi5.a$a;
import vi5.a;
import vi5.c$b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.fragment.ProgressFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.DialogFragment;
import java.lang.CharSequence;
import xd6.e;
import android.content.DialogInterface$OnShowListener;
import androidx.fragment.app.KwaiDialogFragment;
import xd6.f;
import android.content.DialogInterface$OnDismissListener;
import androidx.fragment.app.c;
import kotlin.jvm.internal.a;
import java.util.WeakHashMap;
import java.util.Collection;
import android.content.res.Resources;
import android.app.Activity;
import java.lang.StringBuilder;
import java.lang.Exception;
import e17.i;
import java.util.Objects;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import java.lang.IllegalStateException;
import com.kwai.robust.PatchProxyResult;
import u07.t$a;
import com.kwai.library.widget.popup.common.c$b;
import xd6.a;
import u07.u;
import xd6.b;
import xd6.c;
import u07.f;
import xd6.d;
import com.kwai.library.widget.popup.common.PopupInterface$h;
import com.kwai.library.widget.popup.common.c;
import u07.t;
import androidx.lifecycle.Lifecycle$State;
import com.yxcorp.utility.Log;

public final class PluginInstallerDialog implements c, LifecycleObserver	// class@000cc6
{
    public ProgressFragment b;
    public t c;
    public WeakReference d;
    public a e;
    public c$b f;
    public int g;
    public static final PluginInstallerDialog$a h;

    static {
       PluginInstallerDialog.h = new PluginInstallerDialog$a(null);
    }
    public void PluginInstallerDialog(){
       super();
       this.d = new WeakReference(null);
       this.e = new a$a().a();
       this.f = c$b.a;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerDialog.class, "4")) {
          return;
       }
       this.m();
       return;
    }
    public void b(int p0){
       PluginInstallerDialog pluginInstal = PluginInstallerDialog.class;
       if (PatchProxy.isSupport(pluginInstal) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, pluginInstal, "7")) {
          return;
       }
       pluginInstal = this.b;
       if (pluginInstal != null && !pluginInstal.isDetached()) {
          pluginInstal.Fh(p0, 100, true);
       }
       return;
    }
    public void c(){
       PluginInstallerDialog pluginInstal = PluginInstallerDialog.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pluginInstal, "6")) {
          return;
       }
       this.m();
       if (!PatchProxy.applyVoid(objArray, this, pluginInstal, "14")) {
          this.k("show new loading dialog.");
          FragmentActivity uFragmentAct = this.j();
          if (uFragmentAct != null) {
             try{
                PluginInstallerDialog tb = this.b;
                if (tb == null || (!tb.isVisible() || tb.isRemoving())) {
                   this.n();
                   ProgressFragment progressFrag = new ProgressFragment();
                   int i = 0;
                   boolean b = (this.e.c() && this.e.b())? true: false;
                   progressFrag.setCancelable(b);
                   progressFrag.Jh(this.e.d());
                   progressFrag.Eh(i, 100);
                   progressFrag.ph(new e(progressFrag, this));
                   f uof = new f(this);
                   progressFrag.k0(uof);
                   c supportFragm = uFragmentAct.getSupportFragmentManager();
                   a.o(supportFragm, "activity.supportFragmentManager");
                   Collection uCollection = KwaiDialogFragment.o.get(supportFragm);
                   if (uCollection == null || uCollection.isEmpty()) {
                      i = 1;
                   }
                   if (i) {
                      progressFrag.show(supportFragm, "plugin-installer-dialog");
                   }else {
                      progressFrag.Cb(supportFragm, "plugin-installer-dialog");
                   }
                   this.b = progressFrag;
                   this.g = 1;
                   this.k("show new loading dialog, success");
                }
             }catch(java.lang.Exception e1){
                String str = uFragmentAct.getResources().getString(R.string.arg_RES_7f102f5d);
                a.o(str, "activity.resources.getSt¡­\(R.string.loading_failed\)");
                this.f(str);
                this.l("plugin loading dialog error: "+e1.getMessage());
             }
          }
       }
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerDialog.class, "3")) {
          return;
       }
       this.n();
       return;
    }
    public void e(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerDialog.class, "2")) {
          return;
       }
       a.p(p0, "callback");
       this.f = p0;
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerDialog.class, "8")) {
          return;
       }
       a.p(p0, "msg");
       i.e(R.style.arg_RES_7f11066a, p0, 0);
       return;
    }
    public void g(WeakReference p0,a p1){
       FragmentActivity uFragmentAct;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PluginInstallerDialog.class, "1")) {
          return;
       }
       a.p(p0, "activityRef");
       a.p(p1, "configInfo");
       if (!p0.get() instanceof FragmentActivity) {
          throw new IllegalStateException("PluginInstallerDialog depends on FragmentActivity.");
       }
       p0 = p0.get();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       WeakReference weakReferenc = new WeakReference(p0);
       if (!PatchProxy.applyVoidOneRefs(weakReferenc, this, PluginInstallerDialog.class, "10")) {
          uFragmentAct = this.d.get();
          if (uFragmentAct != null) {
             a.o(uFragmentAct, "it");
             uFragmentAct.getLifecycle().removeObserver(this);
             if (a.g(uFragmentAct, weakReferenc.get()) ^ 0x01) {
                this.onDestroy();
             }
          }
       }
       this.d = weakReferenc;
       this.e = p1;
       if (!PatchProxy.applyVoid(null, this, PluginInstallerDialog.class, "11")) {
          uFragmentAct = this.d.get();
          if (uFragmentAct != null) {
             a.o(uFragmentAct, "it");
             uFragmentAct.getLifecycle().addObserver(this);
          }
       }
       return;
    }
    public void h(){
       String str1;
       PluginInstallerDialog pluginInstal = PluginInstallerDialog.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pluginInstal, "5")) {
          return;
       }
       this.n();
       if (!PatchProxy.applyVoid(objArray, this, pluginInstal, "15")) {
          this.k("show new fail dialog.");
          FragmentActivity uFragmentAct = this.j();
          if (uFragmentAct != null) {
             this.m();
             PluginInstallerDialog te = this.e;
             t$a uoa = PatchProxy.applyTwoRefs(uFragmentAct, te, this, pluginInstal, "16");
             if (uoa != PatchProxyResult.class) {
             }else {
                uoa = new t$a(uFragmentAct);
                uoa.z0(te.a());
                uoa.z(te.d);
                uoa.B(false);
                if (te.f()) {
                   str1 = uFragmentAct.getResources().getString(R.string.cancel);
                   a.o(str1, "activity.resources.getString\(R.string.cancel\)");
                   String str2 = uFragmentAct.getResources().getString(R.string.arg_RES_7f1042cc);
                   a.o(str2, "activity.resources.getString\(R.string.retry\)");
                   uoa.R0(str1);
                   uoa.T0(str2);
                   uoa.t0(new a(this));
                   uoa.u0(new b(this));
                }else {
                   str1 = uFragmentAct.getResources().getString(R.string.arg_RES_7f103a83);
                   a.o(str1, "activity.resources.getString\(R.string.ok\)");
                   uoa.T0(str1);
                   uoa.u0(new c(this));
                }
                a.o(uoa, "builder");
             }
             uoa = f.e(uoa);
             a.o(uoa, "DialogBuilderFactory\n   ¡­r\(activity, mConfigInfo\)\)");
             try{
                d uod = new d(this);
                this.c = uoa.Y(uod);
                this.g = 2;
                this.k("show new fail dialog, success");
             }catch(java.lang.Exception e0){
                String str = uFragmentAct.getResources().getString(R.string.arg_RES_7f102f5d);
                a.o(str, "activity.resources.getSt¡­\(R.string.loading_failed\)");
                this.f(str);
                this.l("plugin fail dialog error: "+e0.getMessage());
             }
          }
       }
    }
    public int i(){
       return this.g;
    }
    public final FragmentActivity j(){
       Object[] objArray = null;
       FragmentActivity obj = PatchProxy.apply(objArray, this, PluginInstallerDialog.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.d.get();
       if (obj != null) {
          a.o(obj, "it");
          Lifecycle lifecycle = obj.getLifecycle();
          a.o(lifecycle, "it.lifecycle");
          if (lifecycle.getCurrentState().isAtLeast(Lifecycle$State.INITIALIZED)) {
             objArray = obj;
          }
       }
       return objArray;
    }
    public final void k(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerDialog.class, "18")) {
          return;
       }
       Log.b("Dva_Qigsaw_dialog", p0);
       return;
    }
    public final void l(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerDialog.class, "19")) {
          return;
       }
       Log.n("Dva_Qigsaw_dialog", p0);
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerDialog.class, "13")) {
          return;
       }
       this.k("try dismiss fail dialog.");
       PluginInstallerDialog tc = this.c;
       if (tc != null && tc.K()) {
          this.k("try dismiss failDialog, success");
          tc.o();
       }
       return;
    }
    public final void n(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerDialog.class, "12")) {
          return;
       }
       this.k("try dismiss loading dialog.");
       PluginInstallerDialog tb = this.b;
       if (tb != null && !tb.isDetached()) {
          this.k("try dismiss loading dialog, success");
          tb.dismiss();
       }
       this.b = null;
       return;
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerDialog.class, "9")) {
          return;
       }
       this.m();
       this.n();
       return;
    }
}
