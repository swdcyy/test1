package com.kwai.framework.plugin.ui.page.PluginInstallerPage;
import vi5.c;
import androidx.lifecycle.LifecycleObserver;
import com.kwai.framework.plugin.ui.page.PluginInstallerPage$a;
import nsd.u;
import java.lang.Object;
import vi5.a$a;
import vi5.a;
import java.lang.ref.WeakReference;
import vi5.c$b;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.framework.plugin.ui.page.InstallerPageFragment;
import android.widget.TextView;
import com.kwai.framework.plugin.ui.page.PluginInstallerPage$b;
import java.lang.Runnable;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kwai.framework.plugin.ui.page.PluginInstallerPage$c;
import kotlin.jvm.internal.a;
import android.content.Context;
import java.lang.CharSequence;
import android.widget.Toast;
import com.kwai.robust.PatchProxyResult;
import androidx.fragment.app.FragmentActivity;
import java.util.Objects;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import android.app.Application;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import qj7.d;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import android.view.LayoutInflater;
import ag6.a;
import androidx.fragment.app.e;
import android.view.View$OnClickListener;
import yd6.a;
import yd6.b;
import com.yxcorp.utility.Log;
import java.lang.Boolean;

public final class PluginInstallerPage implements c, LifecycleObserver	// class@000ccb
{
    public a b;
    public WeakReference c;
    public int d;
    public Context e;
    public InstallerPageFragment f;
    public c$b g;
    public final Handler h;
    public static final PluginInstallerPage$a i;

    static {
       PluginInstallerPage.i = new PluginInstallerPage$a(null);
    }
    public void PluginInstallerPage(){
       super();
       this.b = new a$a().a();
       this.c = new WeakReference(null);
       this.g = c$b.a;
       this.h = new Handler(Looper.getMainLooper());
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PluginInstallerPage.class, "4")) {
          return;
       }
       PluginInstallerPage tf = this.f;
       if (tf != null && this.d == 2) {
          this.d = 0;
          if (!PatchProxy.applyVoid(objArray, tf, InstallerPageFragment.class, "7")) {
             InstallerPageFragment l = tf.l;
             if (l != null) {
                l.setVisibility(4);
             }
          }
          this.k(new PluginInstallerPage$b(this));
       }
       return;
    }
    public void b(int p0){
       PluginInstallerPage pluginInstal = PluginInstallerPage.class;
       if (PatchProxy.isSupport(pluginInstal) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, pluginInstal, "7")) {
          return;
       }
       pluginInstal = this.f;
       if (pluginInstal != null && this.d == 1) {
          pluginInstal.ch(this.b.d()+' '+p0+'%');
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerPage.class, "6")) {
          return;
       }
       this.j("page show loading dialog");
       PluginInstallerPage tf = this.f;
       if (tf != null) {
          this.j("page show loading dialog, success.");
          this.d = 1;
          tf.ch(this.b.d()+" 0%");
       }
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerPage.class, "3")) {
          return;
       }
       this.j("page cancel loading dialog");
       if (this.f != null && this.d == 1) {
          this.j("page cancel loading dialog, success");
          this.d = 0;
          this.k(new PluginInstallerPage$c(this));
       }
       return;
    }
    public void e(c$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerPage.class, "2")) {
          return;
       }
       a.p(p0, "eventCallback");
       this.g = p0;
       return;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerPage.class, "8")) {
          return;
       }
       a.p(p0, "msg");
       Toast.makeText(this.e, p0, 0).show();
       return;
    }
    public void g(WeakReference p0,a p1){
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PluginInstallerPage pluginInstal = PluginInstallerPage.class;
       String str = "1";
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, pluginInstal, str)) {
          return;
       }
       a.p(p0, "weakReference");
       a.p(p1, "configInfo");
       this.j("page init Info");
       if (!p0.get() instanceof FragmentActivity) {
          throw new IllegalStateException("PluginInstallerPage depends on FragmentActivity.");
       }
       p0 = p0.get();
       Objects.requireNonNull(p0, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
       this.b = p1;
       this.c = new WeakReference(p0);
       Object[] objArray = null;
       FragmentActivity uFragmentAct = PatchProxy.apply(objArray, this, pluginInstal, "10");
       if (uFragmentAct != patchProxyRe) {
       }else {
          uFragmentAct = this.c.get();
          if (uFragmentAct != null) {
             a.o(uFragmentAct, "it");
             Lifecycle lifecycle = uFragmentAct.getLifecycle();
             a.o(lifecycle, "it.lifecycle");
             if (!lifecycle.getCurrentState().isAtLeast(Lifecycle$State.INITIALIZED)) {
             }
          }else {
          }
       }
       if (uFragmentAct != null && uFragmentAct.getSupportFragmentManager().findFragmentByTag("plugin_installer_page") == null) {
          this.e = uFragmentAct.getApplication();
          if (!PatchProxy.applyVoidOneRefs(uFragmentAct, this, pluginInstal, "11")) {
             this.j("page init fragment");
             int i = 0x1020002;
             ViewGroup viewGroup = uFragmentAct.findViewById(i);
             if (viewGroup == null) {
                if (!PatchProxy.applyVoidOneRefs(uFragmentAct, this, pluginInstal, "16")) {
                   IllegalStateException illegalState = new IllegalStateException("DvaLoggerImpl android.R.id.content:16908290 view is null");
                   d.b("onContentViewNotFound", illegalState);
                   ExceptionHandler.handleCaughtException(illegalState);
                   uFragmentAct.finish();
                }
             }else {
                view = a.c(LayoutInflater.from(uFragmentAct), R.layout.arg_RES_7f0d04d0, viewGroup, false);
                a.o(view, "LayoutInflater.from\(acti¡­er_page, rootView, false\)");
                InstallerPageFragment installerPag = new InstallerPageFragment();
                if (!PatchProxy.applyVoidOneRefs(view, installerPag, InstallerPageFragment.class, str)) {
                   a.p(view, "view");
                   installerPag.m = view;
                   installerPag.j = view.findViewById(0x7f0a052b);
                   installerPag.k = view.findViewById(0x7f0a4128);
                   installerPag.l = view.findViewById(0x7f0a423f);
                }
                e uoe = uFragmentAct.getSupportFragmentManager().beginTransaction();
                uoe.g(i, installerPag, "plugin_installer_page");
                uoe.m();
                installerPag.getLifecycle().addObserver(this);
                this.f = installerPag;
             }
          }
          PluginInstallerPage tf = this.f;
          if (tf != null) {
             a uoa = PatchProxy.apply(objArray, this, pluginInstal, "14");
             if (uoa != patchProxyRe) {
             }else {
                uoa = new a(this);
             }
             if (!PatchProxy.applyVoidOneRefs(uoa, tf, InstallerPageFragment.class, "3")) {
                InstallerPageFragment j = tf.j;
                if (j != null) {
                   j.setOnClickListener(uoa);
                }
             }
             tf.ch(p1.d());
          }
       }
    label_013d :
       return;
    }
    public void h(){
       PluginInstallerPage pluginInstal = PluginInstallerPage.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pluginInstal, "5")) {
          return;
       }
       this.j("page show fail dialog");
       PluginInstallerPage tf = this.f;
       if (tf != null) {
          this.j("page show fail dialog, success");
          this.d = 2;
          if (this.b.f()) {
             if (!PatchProxy.applyVoid(objArray, tf, InstallerPageFragment.class, "6")) {
                InstallerPageFragment l1 = tf.l;
                if (l1 != null) {
                   l1.setVisibility(0);
                }
             }
             tf.ch(this.b.a());
             b uob = PatchProxy.apply(objArray, this, pluginInstal, "13");
             if (uob != PatchProxyResult.class) {
             }else {
                uob = new b(this);
             }
             if (!PatchProxy.applyVoidOneRefs(uob, tf, InstallerPageFragment.class, "4")) {
                InstallerPageFragment l = tf.l;
                if (l != null) {
                   l.setOnClickListener(uob);
                }
             }
          }
       }
       return;
    }
    public int i(){
       return this.d;
    }
    public final void j(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerPage.class, "15")) {
          return;
       }
       Log.b("Dva_Qigsaw_page", p0);
       return;
    }
    public final boolean k(Runnable p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PluginInstallerPage.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.h.post(p0);
    }
    public final void onDestroy(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerPage.class, "9")) {
          return;
       }
       this.j("page onDestroy");
       if (this.d == 2) {
          this.g.b();
       }
       if (this.d == 1) {
          this.g.e();
       }
       this.f = null;
       this.d = 0;
       return;
    }
}
