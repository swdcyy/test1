package com.yxcorp.upgrade.impl.f;
import zjd.f;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.upgrade.impl.e;
import bkd.b;
import com.yxcorp.upgrade.impl.a;
import ckd.c;
import zjd.c;
import com.yxcorp.upgrade.impl.UpgradeLoadingDialog;
import zjd.g;
import bkd.a;
import zjd.a;
import akd.d0;
import zjd.b;
import com.yxcorp.upgrade.impl.g$a;
import com.yxcorp.upgrade.impl.g;
import com.yxcorp.upgrade.impl.UpgradeInstallHintDialog;
import zjd.d;
import akd.p;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.UpgradeSafeDialogFragment;
import zjd.h;
import akd.z;
import akd.o;
import akd.a0;
import java.lang.Long;
import java.lang.Number;
import java.io.File;
import java.lang.System;
import akd.y;
import ckd.d;
import ckd.b;

public class f implements f	// class@000997
{
    public e a;
    public g b;

    public void f(){
       super();
       this.a = null;
    }
    public boolean a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f obj = PatchProxy.apply(null, this, f.class, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       if (obj == null) {
          return true;
       }
       Objects.requireNonNull(obj);
       String str = "5";
       Object obj1 = PatchProxy.apply(null, obj, e.class, str);
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.j == null){
          e c = obj.c;
          if (c != null && c.b != null) {
             b = false;
          }else {
             obj.j = false;
             c = obj.k;
             if (c != null) {
                if (!PatchProxy.applyVoid(null, c, a.class, str)) {
                   c.a = false;
                   c.h();
                   if (c.b == true) {
                      c.h.cancel(c.k);
                      c.b = 0;
                   }
                }
                obj.k = null;
             }
             if (obj.g.f != null) {
                UpgradeLoadingDialog.Vg();
             }
             obj.f();
          }
       }
       b = true;
       if (b) {
          this.a = null;
          f tb = this.b;
          if (tb != null) {
             tb.c(9);
          }
          return true;
       }else {
          return false;
       }
    }
    public void b(a p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "5")) {
          return;
       }
       d0.a(p0, p1);
       return;
    }
    public void c(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "3")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       g$a uoa = g.d();
       if (uoa == null) {
          return;
       }
       if (!PatchProxy.applyVoidTwoRefs(uoa, p0, null, UpgradeInstallHintDialog.class, "1")) {
          UpgradeInstallHintDialog.c = uoa;
          UpgradeInstallHintDialog.e = p0;
          Activity uActivity = p.c().c();
          UpgradeInstallHintDialog.d = uActivity;
          if (uActivity instanceof FragmentActivity && UpgradeInstallHintDialog.Ug(uActivity)) {
             e uoe = UpgradeInstallHintDialog.d.getSupportFragmentManager().beginTransaction();
             Fragment uFragment = UpgradeInstallHintDialog.d.getSupportFragmentManager().findFragmentByTag("UpgradeInstallHintDialog");
             if (uFragment != null) {
                uoe.u(uFragment);
             }
             uoe.j(null);
             new UpgradeInstallHintDialog().show(uoe, "UpgradeInstallHintDialog");
          }
       }
       return;
    }
    public void d(a p0,b p1,c p2,g p3,h p4){
       Object[] objArray;
       f uof = this;
       object oobject = p1;
       object oobject1 = p3;
       f uof1 = f.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       if (PatchProxy.isSupport(uof1)) {
          objArray = new Object[]{p0,oobject,p2,oobject1,p4};
          if (PatchProxy.applyVoid(objArray, this, uof1, "7")) {
             return;
          }
       }
       if (this.j(oobject1)) {
          f a = uof.a;
          z oz = new z(this);
          Objects.requireNonNull(a);
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe)) {
             objArray = new Object[]{p0,oobject,p2,oobject1,p4,oz};
             if (!PatchProxy.applyVoid(objArray, a, uoe, "2")) {
             }
          }else if(!a.d(p2, p0, p3, p4, oz)){
             a.b(p1, 1);
          }
       }
    label_006a :
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       g.f();
       return;
    }
    public void f(a p0,c p1,g p2,h p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, f.class, "8")) {
          return;
       }
       if (this.j(p2)) {
          f ta = this.a;
          a0 uoa0 = new a0(this);
          Objects.requireNonNull(ta);
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe)) {
             Object[] objArray = new Object[]{p0,p1,p2,p3,uoa0};
             if (!PatchProxy.applyVoid(objArray, ta, uoe, "3")) {
             }
          }else if(!ta.d(p1, p0, p2, p3, uoa0)){
             ta.b = p0;
             d0.a(p0, ta);
             if (ta.g.f != null && !PatchProxy.applyVoid(null, null, UpgradeLoadingDialog.class, "1")) {
                Activity uActivity = p.c().c();
                if (uActivity instanceof FragmentActivity && !UpgradeLoadingDialog.Ug(uActivity)) {
                   e uoe1 = uActivity.getSupportFragmentManager().beginTransaction();
                   Fragment uFragment = uActivity.getSupportFragmentManager().findFragmentByTag("UpgradeLoadingDialog");
                   if (uFragment != null) {
                      uoe1.u(uFragment);
                   }
                   uoe1.j(null);
                   new UpgradeLoadingDialog().show(uoe1, "UpgradeLoadingDialog");
                }
             }
          }
       }
    label_00a0 :
       return;
    }
    public void g(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (this.a != null) {
          return;
       }
       UpgradeInstallHintDialog.Vg();
       return;
    }
    public int h(long p0){
       g obj;
       int i;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       f uof = f.class;
       String str = "1";
       if (PatchProxy.isSupport(uof)) {
          obj = PatchProxy.applyOneRefs(Long.valueOf(p0), this, uof, str);
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       obj = g.class;
       if (PatchProxy.isSupport(obj)) {
          Object obj1 = PatchProxy.applyOneRefs(Long.valueOf(p0), null, obj, str);
          if (obj1 != patchProxyRe) {
             i = obj1.intValue();
          }else {
          label_0037 :
             g$a uoa = g.d();
             if (uoa != null) {
                String str1 = g.e();
                if (str1 != null && new File(str1).exists()) {
                   if (!p0 - -1) {
                      i = uoa.e;
                   }else if((System.currentTimeMillis() - uoa.d) - p0 < 0){
                      i = uoa.e;
                   }
                }
             }
             i = -1;
          }
       }else {
          goto label_0037 ;
       }
       return i;
    }
    public void i(a p0,b p1,c p2,g p3,h p4){
       Object[] objArray;
       f uof = this;
       object oobject = p1;
       object oobject1 = p3;
       f uof1 = f.class;
       int i = 4;
       int i1 = 3;
       int i2 = 2;
       if (PatchProxy.isSupport(uof1)) {
          objArray = new Object[]{p0,oobject,p2,oobject1,p4};
          if (PatchProxy.applyVoid(objArray, this, uof1, "6")) {
             return;
          }
       }
       if (this.j(oobject1)) {
          f a = uof.a;
          y oy = new y(this);
          Objects.requireNonNull(a);
          e uoe = e.class;
          if (PatchProxy.isSupport(uoe)) {
             objArray = new Object[]{p0,oobject,p2,oobject1,p4,oy};
             if (!PatchProxy.applyVoid(objArray, a, uoe, "1")) {
             }
          }else if(!a.d(p2, p0, p3, p4, oy)){
             a.b(p1, 0);
          }
       }
    label_006a :
       return;
    }
    public final boolean j(g p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, f.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 != null) {
          p0.h();
       }
       if (this.a != null) {
          if (p0 != null) {
             p0.c(10);
          }
          return false;
       }else if(p.b() == null || p.a() == null){
          if (p0 != null) {
             p0.c(11);
          }
          return false;
       }else {
          this.b = p0;
          this.a = new e();
          return true;
       }
    }
}
