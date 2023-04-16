package com.yxcorp.upgrade.impl.a;
import zjd.h$a;
import java.lang.Object;
import java.util.ArrayList;
import com.yxcorp.upgrade.impl.a$c;
import android.os.Handler;
import android.os.Looper;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import bkd.b;
import zjd.d;
import akd.p;
import android.app.Application;
import akd.v;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.app.Activity;
import android.content.Intent;
import java.lang.StringBuilder;
import android.net.Uri;
import zjd.g;
import java.util.Collection;
import java.util.Iterator;
import zjd.h$b;
import java.util.List;
import com.yxcorp.upgrade.impl.g;
import zjd.c;
import android.app.Application$ActivityLifecycleCallbacks;
import akd.b;
import java.lang.Runnable;
import com.yxcorp.upgrade.impl.UpgradeDialogUI;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.UpgradeSafeDialogFragment;
import java.lang.Integer;
import akd.c;
import com.yxcorp.upgrade.impl.a$a;
import androidx.fragment.app.e;
import com.yxcorp.upgrade.impl.g$a;
import java.lang.System;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.yxcorp.upgrade.impl.a$b;
import ckd.e;
import ckd.c;

public class a implements h$a	// class@00098e
{
    public boolean a;
    public int b;
    public b c;
    public h d;
    public g e;
    public o f;
    public c g;
    public c h;
    public List i;
    public Handler j;
    public int k;
    public Application$ActivityLifecycleCallbacks l;
    public boolean m;
    public UpgradeDialogUI$a n;
    public Activity o;

    public void a(){
       super();
       this.i = new ArrayList();
       this.n = new a$c(this);
       this.j = new Handler(Looper.getMainLooper());
       this.b = 0;
       this.k = -1;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, a.class, "11")) {
          return;
       }
       if (this.c.b != null) {
          return;
       }
       this.h();
       this.j(5);
       return;
    }
    public void b(){
    }
    public void c(){
       boolean b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "10")) {
          return;
       }
       if (this.c.c != null) {
          String packageName = p.c().getApplication().getPackageName();
          Activity obj = PatchProxy.applyOneRefs(packageName, objArray, v.class, "1");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else {
             try{
                obj = p.c().c();
                if (obj != null && v.a(obj, packageName)) {
                   Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id="+packageName));
                   intent.addFlags(0x10000000);
                   obj.startActivity(intent);
                   b = true;
                }else {
                   b = false;
                }
             }catch(java.lang.Exception e0){
             }
          }
       }
       if (this.b == 1) {
          return;
       }else {
          a te = this.e;
          if (te != null) {
             te.a();
          }
          Iterator iterator = new ArrayList(this.i).iterator();
          while (iterator.hasNext()) {
             iterator.next().b();
          }
          this.b = 1;
          if (this.c.b != null) {
             this.m(false);
          }else {
             this.m(1);
          }
          if (this.c.b == null) {
             this.h();
          }
          return;
       }
    }
    public void d(h$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "8")) {
          return;
       }
       this.i.add(p0);
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, a.class, "12")) {
          return;
       }
       v.b(g.c(this.c.k));
       return;
    }
    public void f(h$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "9")) {
          return;
       }
       this.i.remove(p0);
       return;
    }
    public void g(){
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "14")) {
          return;
       }
       c g = this.g.g;
       if (g != null && g.size() > 0) {
          Activity uActivity = p.c().c();
          if (uActivity == null) {
             this.k();
             return;
          }else {
             String name = uActivity.getClass().getName();
             Iterator iterator = this.g.g.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if ((iterator.next()).equals(name)) {
                      this.k();
                      return;
                   }
                }else if(!PatchProxy.applyVoid(objArray, this, uoa, "16") && this.l != null){
                   p.c().getApplication().unregisterActivityLifecycleCallbacks(this.l);
                   this.l = objArray;
                   break ;
                }
             }
          }
       }
       this.j.post(new b(this));
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       if (this.l != null) {
          p.c().getApplication().unregisterActivityLifecycleCallbacks(this.l);
          this.l = null;
       }
       this.i();
       return;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "7")) {
          return;
       }
       if (this.m != null) {
          this.m = false;
          this.o = objArray;
          if (!PatchProxy.applyVoid(objArray, objArray, UpgradeDialogUI.class, "3")) {
             Activity uActivity = p.c().c();
             if (uActivity != null && uActivity instanceof FragmentActivity) {
                Fragment uFragment = uActivity.getSupportFragmentManager().findFragmentByTag("UpgradeDialog");
                if (uFragment instanceof UpgradeSafeDialogFragment) {
                   uFragment.dismiss();
                }
             }
          }
       }
       return;
    }
    public void j(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoa, "19")) {
          return;
       }
       if (this.a == null) {
          return;
       }
       this.a = false;
       uoa = this.e;
       if (uoa != null) {
          uoa.c(p0);
       }
       if (this.f != null) {
          this.j.post(new c(this));
       }
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, a.class, "15")) {
          return;
       }
       if (this.l == null) {
          this.l = new a$a(this);
          p.c().getApplication().registerActivityLifecycleCallbacks(this.l);
       }
       return;
    }
    public void l(){
       boolean b1;
       a uoa = a.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoa, "3")) {
          return;
       }
       if (this.m == null) {
          Activity obj = PatchProxy.apply(objArray, this, uoa, "4");
          boolean b = true;
          if (obj != PatchProxyResult.class) {
             b1 = obj.booleanValue();
          }else {
             c d = this.g.d;
             if (d != null && d.size()) {
                if (p.c().c() != null) {
                   String name = p.c().c().getClass().getName();
                   Iterator iterator = this.g.d.iterator();
                   while (true) {
                      if (iterator.hasNext()) {
                         if (!(iterator.next()).equals(name)) {
                            continue ;
                         }
                      }
                   }
                }
                b1 = false;
             }
          label_0067 :
             b1 = true;
          }
          if (!b1) {
             return;
          }else {
             this.m = b;
             this.o = p.c().c();
             uoa = this.n;
             c h = this.g.h;
             if (!PatchProxy.isSupport(UpgradeDialogUI.class) || !PatchProxy.applyVoidTwoRefs(uoa, Boolean.valueOf(h), objArray, UpgradeDialogUI.class, "1")) {
                UpgradeDialogUI.b = uoa;
                UpgradeDialogUI.c = h;
                obj = p.c().c();
                if (obj instanceof FragmentActivity && !UpgradeDialogUI.Ug(obj)) {
                   e uoe = obj.getSupportFragmentManager().beginTransaction();
                   Fragment uFragment = obj.getSupportFragmentManager().findFragmentByTag("UpgradeDialog");
                   if (uFragment != null) {
                      uoe.u(uFragment);
                   }
                   uoe.j(objArray);
                   new UpgradeDialogUI().show(uoe, "UpgradeDialog");
                }
             }
             a tc = this.c;
             g$a uoa1 = new g$a(tc.d, tc.e, tc.k, System.currentTimeMillis(), -1);
             g.g(uoa);
          }
       }
       return;
    }
    public final void m(boolean p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoa, "17")) {
          return;
       }
       a th = this.h;
       b uob = PatchProxy.apply(null, this, uoa, "18");
       if (uob != PatchProxyResult.class) {
       }else if(this.g.j != null && !TextUtils.isEmpty(this.c.j)){
          uob = this.c.j;
       }else {
          uob = this.c.i;
       }
       Object obj = uob;
       this.k = th.a(obj, g.a(), g.b(this.c.k), p0, false, new a$b(this));
       return;
    }
}
