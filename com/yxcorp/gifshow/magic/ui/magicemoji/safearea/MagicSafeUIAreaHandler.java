package com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler;
import m4b.e;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler$a;
import nsd.u;
import k4b.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.os.Handler;
import android.os.Looper;
import eoc.f$a;
import m4b.d;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import s5b.b;
import q87.c;
import y4b.c;
import android.view.View;
import android.view.ViewGroup;
import y4b.a;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Float;
import com.yxcorp.utility.n;
import y4b.b;
import y4b.f;
import java.lang.StringBuilder;
import com.kwai.video.westeros.models.SafeUIArea$Builder;
import com.kwai.video.westeros.models.SafeUIArea;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite$Builder;
import com.kwai.gifshow.post.api.core.event.PanelShowEvent;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler$doBindView$1;
import y4b.d;
import msd.l;
import erd.g;
import crd.b;
import eoc.f;
import com.kwai.video.westeros.models.EffectDescription;
import com.kwai.video.westeros.models.EffectSlot;
import android.content.Intent;
import com.kwai.video.westeros.models.EffectResource;
import com.yxcorp.gifshow.magic.ui.magicemoji.safearea.MagicSafeUIAreaHandler$onEffectDescriptionUpdated$1;
import y4b.e;
import msd.a;
import java.lang.Runnable;
import com.kwai.video.westeros.models.EffectHint;

public final class MagicSafeUIAreaHandler implements e	// class@001bef
{
    public View b;
    public final Handler c;
    public c d;
    public b e;
    public final f$a f;
    public a g;
    public static final MagicSafeUIAreaHandler$a h;

    static {
       MagicSafeUIAreaHandler.h = new MagicSafeUIAreaHandler$a(null);
    }
    public void MagicSafeUIAreaHandler(a p0){
       a.p(p0, "safeUIArealistener");
       super();
       this.g = p0;
       this.c = new Handler(Looper.getMainLooper());
       this.f = new f$a();
    }
    public void G(){
       d.e(this);
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, MagicSafeUIAreaHandler.class, "12")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicSafeUIAreaHandler", "disposeSafeUIAreaCalculator", objArray);
       MagicSafeUIAreaHandler td = this.d;
       if (td == null) {
          a.S("safeUIAreaCalculator");
       }
       td.c();
       return;
    }
    public final void b(View p0,ViewGroup p1,View p2,a p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, MagicSafeUIAreaHandler.class, "10")) {
          return;
       }
       a.p(p3, "magicSafeUIArea");
       c uoc = new c(p3);
       this.d = uoc;
       a.m(p0);
       if (!PatchProxy.applyVoidThreeRefs(p0, p1, p2, uoc, c.class, "1")) {
          a.p(p0, "fragmentView");
          Object[] objArray = new Object[0];
          b.D().w("MagicSafeUIAreaCalculator", "init", objArray);
          uoc.i = p2;
          uoc.j.g(p0, p1);
       }
       this.e = null;
       return;
    }
    public final void c(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, MagicSafeUIAreaHandler.class, "11")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       b.D().w("MagicSafeUIAreaHandler", "prepareSafeUIAreaCalculator", objArray1);
       MagicSafeUIAreaHandler td = this.d;
       if (td == null) {
          a.S("safeUIAreaCalculator");
       }
       Objects.requireNonNull(td);
       if (!PatchProxy.applyVoid(objArray, td, c.class, "2")) {
          Object[] objArray2 = new Object[i];
          b.D().w("MagicSafeUIAreaCalculator", "prepare", objArray2);
          td.j.e();
       }
       return;
    }
    public final void d(){
       String str2;
       String str3;
       c a;
       float f;
       float f1;
       float f10;
       float f14;
       c obj2;
       float f17;
       b uob2;
       c f18;
       int i1;
       b uob = this;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, uob, MagicSafeUIAreaHandler.class, "13")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       String str = "MagicSafeUIAreaHandler";
       b.D().w(str, "setSafeUIArea", objArray1);
       if (!uob.g.r()) {
          objArray = new Object[i];
          b.D().w(str, "magic face is not loaded, can\'t setSafeUIArea", objArray);
          return;
       }else {
          MagicSafeUIAreaHandler d = uob.d;
          String str1 = "safeUIAreaCalculator";
          if (d == null) {
             a.S(str1);
          }
          Objects.requireNonNull(d);
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          c uoc = c.class;
          if (PatchProxy.applyVoid(objArray, d, uoc, "6")) {
             str2 = str1;
             str3 = str;
          }else {
             Object[] objArray2 = new Object[i];
             b.D().w("MagicSafeUIAreaCalculator", "compute", objArray2);
             c obj = PatchProxy.apply(objArray, d, uoc, "10");
             if (obj != patchProxyRe) {
                f = obj.floatValue();
             }else if(d.c != null && d.d == null){
                f = d.f - d.e;
             }else {
                obj = d.i;
                a.m(obj);
                f = (float)obj.getWidth();
             }
             c obj1 = PatchProxy.apply(objArray, d, uoc, "11");
             if (obj1 != patchProxyRe) {
                f1 = obj1.floatValue();
             }else if(d.c != null && d.d == null){
                f1 = d.h - d.g;
             }else {
                obj1 = d.i;
                a.m(obj1);
                f1 = (float)obj1.getHeight();
             }
             float f2 = d.a(d.j.c());
             float l = c.l;
             float f3 = l / f;
             float f4 = f2 / f1;
             float f5 = 2.00f;
             float f6 = l * f5;
             float f7 = (f - f6) / f;
             float f8 = (f1 - (f2 + d.b(0))) / f1;
             float f9 = 0x3f100000;
             v9 = (f / f1) - f9;
             if (f2 < 0) {
                f7 = f1 * f9;
                f10 = (f7 - f) / f5;
                f10 = ((f7 - (f10 * f5)) - f6) / f7;
                f6 = (f10 + l) / f7;
             }else {
                f10 = f7;
                f6 = f3;
             }
             f7 = d.a(d.j.a());
             f5 = d.b(d.j.b());
             float f11 = f7 / f1;
             float f12 = d.j.d();
             float f13 = d.j.f();
             if (PatchProxy.isSupport(uoc)) {
                f14 = f3;
                str3 = str;
                str2 = str1;
                obj2 = PatchProxy.applyTwoRefs(Float.valueOf(f12), Float.valueOf(f13), d, uoc, "9");
                if (obj2 != patchProxyRe) {
                   f13 = obj2.floatValue();
                }else {
                label_0136 :
                   obj2 = d.i;
                   a.m(obj2);
                   int[] ointArray = n.p(obj2);
                   if (d.c != null && d.d == null) {
                      f18 = d.f;
                      i1 = ointArray[0];
                   }else {
                      f18 = d.i;
                      a.m(f18);
                      f17 = (float)f18.getWidth();
                      i1 = ointArray[0];
                   }
                   f17 = f18 + (float)i1;
                   if (d.c != null && ((d.g + (float)ointArray[1]) - f13 <= 0 && (f12 > 0 && f17 - f12 >= 0))) {
                      f13 = c.k + (f17 - f12);
                   }else {
                      f13 = l;
                   }
                }
             }else {
                str2 = str1;
                str3 = str;
                f14 = f3;
                goto label_0136 ;
             }
             f13 = f13 + l;
             float f15 = (f - f13) / f;
             float f16 = (f1 - (f7 + f5)) / f1;
             if (f2 < 0) {
                f9 = f9 * f1;
                f17 = 2.00f;
                f15 = (f9 - f) / f17;
                f15 = ((f9 - (f15 * f17)) - f13) / f9;
                f14 = (l + f15) / f9;
             }
             b uob1 = new b(f6, f4, f10, f8, f14, f11, f15, f16);
             d.a = f13;
             obj2 = d.b;
             if (obj2 != null) {
                uob2 = obj2.a(f13, f, f1);
                if (uob2 != null) {
                label_01b6 :
                   d.a = uob2;
                   objArray1 = new Object[0];
                   b.D().s("MagicSafeUIAreaCalculator", "compute...displayWidth:"+f+", displayHeight"+f1+", safeUIArea:"+d.a, objArray1);
                }
             }
             uob2 = d.a;
             goto label_01b6 ;
          }
          d = uob.d;
          if (d == null) {
             a.S(str2);
          }
          a = d.a;
          if (a.g(a, uob.e)) {
             objArray = new Object[0];
             b.D().w(str3, "SafeUIArea isn\'t changed, can\'t setSafeUIArea", objArray);
             return;
          }else {
             uob.e = a;
             uob.g.x(SafeUIArea.newBuilder().setWeakLeftBottomX(a.a).setWeakLeftBottomY(a.d()).setWeakAreaWidth(a.c).setWeakAreaHeight(a.c()).setStrongLeftBottomX(a.e).setStrongLeftBottomY(a.b()).setStrongAreaWidth(a.g).setStrongAreaHeight(a.a()).build());
             return;
          }
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, MagicSafeUIAreaHandler.class, "1")) {
          return;
       }
       this.b = p0;
       this.f.a(f.a(PanelShowEvent.class, new d(new MagicSafeUIAreaHandler$doBindView$1(this))));
       return;
    }
    public void e1(int p0){
       d.l(this, p0);
    }
    public void h(EffectDescription p0,EffectSlot p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, MagicSafeUIAreaHandler.class, "15")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicSafeUIAreaHandler", "afterEffectRestore", objArray);
       this.e = null;
       this.d();
       return;
    }
    public void onActivityCallback(int p0,int p1,Intent p2){
       d.d(this, p0, p1, p2);
    }
    public void onDestroy(){
       d.i(this);
    }
    public void onEffectDescriptionUpdated(EffectDescription p0,EffectSlot p1,EffectResource p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, MagicSafeUIAreaHandler.class, "14")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicSafeUIAreaHandler", "onEffectDescriptionUpdated", objArray);
       this.e = null;
       this.c.postDelayed(new e(new MagicSafeUIAreaHandler$onEffectDescriptionUpdated$1(this)), 100);
       return;
    }
    public void onEffectHintUpdated(EffectHint p0){
       d.k(this, p0);
    }
    public void onResume(){
       if (PatchProxy.applyVoid(null, this, MagicSafeUIAreaHandler.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicSafeUIAreaHandler", "onResume", objArray);
       this.d();
       return;
    }
    public void unbind(){
       if (PatchProxy.applyVoid(null, this, MagicSafeUIAreaHandler.class, "3")) {
          return;
       }
       MagicSafeUIAreaHandler td = this.d;
       if (td == null) {
          a.S("safeUIAreaCalculator");
       }
       td.c();
       this.f.b();
       return;
    }
    public void w(){
       d.f(this);
    }
    public void w1(Intent p0){
       d.h(this, p0);
    }
    public void x1(){
       d.g(this);
    }
    public void y1(){
       if (PatchProxy.applyVoid(null, this, MagicSafeUIAreaHandler.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.D().w("MagicSafeUIAreaHandler", "initAfterResume", objArray);
       this.c();
       this.d();
       return;
    }
}
