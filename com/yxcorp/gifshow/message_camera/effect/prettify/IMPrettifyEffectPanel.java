package com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel;
import lw5.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$a;
import nsd.u;
import lw5.d;
import n0c.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import com.yxcorp.gifshow.message_camera.effect.prettify.makeup.IMMakeupController;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$b;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$onPanelShowListeners$2;
import msd.a;
import qrd.p;
import qrd.s;
import lw5.c$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.concurrent.CopyOnWriteArrayList;
import androidx.fragment.app.c;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import com.trello.rxlifecycle3.components.support.RxFragmentActivity;
import androidx.fragment.app.FragmentActivity;
import crd.b;
import lnc.b9;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import android.view.View;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$showFragment$2;
import java.lang.Boolean;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$d;
import android.animation.Animator$AnimatorListener;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$hideFragment$1;
import java.util.Iterator;
import java.lang.Iterable;
import dc5.c;
import com.yxcorp.utility.SystemUtil;
import java.lang.RuntimeException;
import brd.t;
import fib.b;
import erd.r;
import fib.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import p0c.h$a;
import k1c.c;
import k1c.c$a;
import k1c.c$b;
import p0c.h;
import k1c.a;
import r0c.h;
import r0c.f;
import k1c.b;
import h1c.c;
import h1c.a;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import hib.a;
import o0c.a;
import p0c.d;
import android.os.Bundle;
import com.kwai.gifshow.post.api.feature.camera.model.CameraPageType;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import l0c.f0;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig;
import p0c.a;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMMakeupOptionConfig;
import p0c.f;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig;
import p0c.c;
import java.lang.Integer;
import com.yxcorp.gifshow.message_camera.effect.prettify.IMPrettifyEffectPanel$c;
import java.lang.Runnable;

public final class IMPrettifyEffectPanel implements c	// class@001da2
{
    public final IMPrettifyEffectPanel$b a;
    public BaseFragment b;
    public final p c;
    public View d;
    public b e;
    public final d f;
    public final a g;
    public final IMBeautyController h;
    public final IMMakeupController i;
    public final IMFilterController j;
    public static final IMPrettifyEffectPanel$a k;

    static {
       IMPrettifyEffectPanel.k = new IMPrettifyEffectPanel$a(null);
    }
    public void IMPrettifyEffectPanel(d p0,a p1,IMBeautyController p2,IMMakeupController p3,IMFilterController p4){
       a.p(p0, "panelConfig");
       a.p(p1, "effectStateManager");
       a.p(p2, "beautyController");
       a.p(p3, "makeupController");
       a.p(p4, "filterController");
       super();
       this.f = p0;
       this.g = p1;
       this.h = p2;
       this.i = p3;
       this.j = p4;
       this.a = new IMPrettifyEffectPanel$b(this);
       this.c = s.c(IMPrettifyEffectPanel$onPanelShowListeners$2.INSTANCE);
    }
    public void a(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMPrettifyEffectPanel.class, "6")) {
          return;
       }
       a.p(p0, "listener");
       if (this.d().contains(p0)) {
          this.d().remove(p0);
       }
       return;
    }
    public void b(c$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMPrettifyEffectPanel.class, "5")) {
          return;
       }
       a.p(p0, "listener");
       if (!this.d().contains(p0)) {
          this.d().add(p0);
       }
       return;
    }
    public final c c(){
       Object[] objArray1;
       Object[] objArray = null;
       Activity obj = PatchProxy.apply(objArray, this, IMPrettifyEffectPanel.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.f.a();
       if (!obj instanceof RxFragmentActivity) {
          objArray1 = objArray;
       }
       if (objArray1 != null) {
          objArray = objArray1.getSupportFragmentManager();
       }
       return objArray;
    }
    public final CopyOnWriteArrayList d(){
       Object obj = PatchProxy.apply(null, this, IMPrettifyEffectPanel.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.c.getValue();
    }
    public void destroy(){
       if (PatchProxy.applyVoid(null, this, IMPrettifyEffectPanel.class, "2")) {
          return;
       }
       b9.a(this.e);
       this.d().clear();
       this.e();
       this.b = null;
       return;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, IMPrettifyEffectPanel.class, "12")) {
          return;
       }
       c uoc = this.c();
       if (uoc != null) {
          Fragment uFragment = uoc.findFragmentByTag("IMPrettifyEffectPanel");
          if (uFragment != null) {
             uoc.beginTransaction().u(uFragment).m();
          }
       }
       return;
    }
    public final void f(){
       if (PatchProxy.applyVoid(null, this, IMPrettifyEffectPanel.class, "8")) {
          return;
       }
       IMPrettifyEffectPanel td = this.d;
       a.m(td);
       IMPrettifyEffectPanel td1 = this.d;
       a.m(td1);
       td.setTranslationY((float)td1.getHeight());
       c uoc = this.c();
       if (uoc != null) {
          e uoe = uoc.beginTransaction();
          if (uoe != null) {
             IMPrettifyEffectPanel tb = this.b;
             a.m(tb);
             uoe.g(this.f.b(), tb, "IMPrettifyEffectPanel");
             uoe.m();
          }
       }
       this.g(true, new IMPrettifyEffectPanel$showFragment$2(this));
       return;
    }
    public final void g(boolean p0,a p1){
       IMPrettifyEffectPanel iMPrettifyEf = IMPrettifyEffectPanel.class;
       if (PatchProxy.isSupport(iMPrettifyEf) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, iMPrettifyEf, "16")) {
          return;
       }
       iMPrettifyEf = this.d;
       a.m(iMPrettifyEf);
       int i = 0;
       float translationY = (p0)? iMPrettifyEf.getTranslationY(): 0;
       if (!p0) {
          i = (float)iMPrettifyEf.getHeight();
       }
       float[] uofloatArray = new float[]{translationY,i};
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(iMPrettifyEf, View.TRANSLATION_Y, uofloatArray);
       Interpolator interpolator = (p0)? a.b(0x3f251eb8, 0.05f, 0x3eb5c28f, 0x3f800000): new LinearInterpolator();
       objectAnimat.setInterpolator(interpolator);
       objectAnimat.setDuration(280);
       objectAnimat.addListener(new IMPrettifyEffectPanel$d(p0, p1));
       objectAnimat.start();
       return;
    }
    public void hide(){
       IMPrettifyEffectPanel iMPrettifyEf = IMPrettifyEffectPanel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, iMPrettifyEf, "4")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, iMPrettifyEf, "11")) {
          this.g(false, new IMPrettifyEffectPanel$hideFragment$1(this));
       }
       Iterator iterator = this.d().iterator();
       while (iterator.hasNext()) {
          iterator.next().a();
       }
       return;
    }
    public void show(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       IMPrettifyEffectPanel iMPrettifyEf = IMPrettifyEffectPanel.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, iMPrettifyEf, "3")) {
          return;
       }
       String str = "IMPrettifyEffectPanel";
       if (!PatchProxy.applyVoid(objArray, this, iMPrettifyEf, "7") && this.d == null) {
          View view = this.f.a().findViewById(this.f.b());
          this.d = view;
          if (view == null) {
             c.g(str, "init containerView is null");
             if (!SystemUtil.K()) {
                this.destroy();
             }else {
                throw new RuntimeException("IMPrettifyEffectPanel containerView is null");
             }
          }else {
             b9.a(this.e);
             Activity uActivity = this.f.a();
             if (!uActivity instanceof RxFragmentActivity) {
                uActivity = objArray;
             }
             if (uActivity != null) {
                this.e = uActivity.m().filter(b.b).subscribe(new a(this), Functions.d());
             }
          }
       }
       h obj = PatchProxy.apply(objArray, this, iMPrettifyEf, "13");
       int i = 1;
       if (obj != patchProxyRe) {
          b = obj.booleanValue();
       }else if(this.f.a().isDestroyed()){
          c.g(str, "checkActivity isDestroyed");
          this.destroy();
          b = true;
       }else {
          b = false;
       }
       if (b) {
          return;
       }else {
          this.e();
          int i1 = 4;
          obj = new h$a().c(c.c.a().a()).b(i1).a();
          if (!PatchProxy.applyVoidOneRefs(obj, this, iMPrettifyEf, "9")) {
             c uoc = obj.f();
             if (uoc != null) {
                uoc.b(i, new a(this.g.b().b().c(), this.g.b().b().d()));
             }
             c uoc1 = obj.f();
             if (uoc1 != null) {
                uoc1.a(2, this.g.e().d().b());
             }
             uoc1 = obj.f();
             if (uoc1 != null) {
                uoc1.a(i1, this.g.c().g());
             }
          }
          BaseFragment uBaseFragmen = PatchProxy.applyOneRefs(obj, this, iMPrettifyEf, "15");
          if (uBaseFragmen != patchProxyRe) {
          }else {
             new a(this.a).b(obj.g());
             Bundle uBundle = new Bundle();
             SerializableHook.putSerializable(uBundle, "page_key", CameraPageType.IM_CHAT);
             uBaseFragmen = f0.a(obj, uBundle);
             new IMBeautyOptionConfig(this.h, uBaseFragmen).b(obj.a());
             new IMMakeupOptionConfig(this.i, uBaseFragmen).b(obj.i());
             new IMFilterOptionConfig(this.j, uBaseFragmen).b(obj.e());
          }
          this.b = uBaseFragmen;
          IMPrettifyEffectPanel td = this.d;
          if (td != null) {
             objArray = Integer.valueOf(td.getHeight());
          }
          if (objArray != null && !objArray.intValue()) {
             td = this.d;
             if (td != null) {
                td.post(new IMPrettifyEffectPanel$c(this));
             }
          }else {
             this.f();
          }
          return;
       }
    }
}
