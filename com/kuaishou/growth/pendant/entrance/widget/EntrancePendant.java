package com.kuaishou.growth.pendant.entrance.widget.EntrancePendant;
import com.kuaishou.growth.pendant.coin.core.KemPendantV2;
import com.kuaishou.growth.pendant.entrance.widget.EntrancePendant$a;
import nsd.u;
import qf0.b;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.growth.pendant.entrance.widget.EntrancePendant$b;
import com.kuaishou.growth.pendant.entrance.widget.EntrancePendant$c;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import ekd.m1;
import com.kuaishou.growth.pendant.ui.widget.PendantAnimImageView;
import com.yxcorp.gifshow.image.KwaiImageView;
import android.widget.TextView;
import gd0.b;
import com.kuaishou.growth.pendant.model.EntranceParam;
import pf0.a;
import qf0.f;
import com.yxcorp.image.fresco.wrapper.ImageCallback;
import com.yxcorp.image.fresco.wrapper.a;
import crd.b;
import lnc.b9;
import android.view.View$OnClickListener;
import android.widget.FrameLayout;
import com.kwai.robust.PatchProxyResult;
import ld0.c;
import re0.a;
import com.kuaishou.growth.pendant.model.PendantExpandButtonConfig;
import java.util.Map;
import com.kuaishou.growth.pendant.model.PendantExpandButtonTextConfig;
import java.lang.Integer;
import brd.t;
import qf0.e;
import java.util.concurrent.Callable;
import java.util.Objects;
import java.util.List;
import java.lang.StringBuilder;
import qf0.c;
import qf0.d;
import t45.d;
import brd.z;
import se0.a;
import se0.b;
import erd.g;

public final class EntrancePendant extends KemPendantV2	// class@00065f
{
    public PendantAnimImageView o;
    public View p;
    public KwaiImageView q;
    public TextView r;
    public b s;
    public final m t;
    public final EntrancePendant$c u;
    public static final int v;
    public static final int w;
    public static final EntrancePendant$a x;

    static {
       EntrancePendant.x = new EntrancePendant$a(null);
       EntrancePendant.v = b.c(90.00f);
       EntrancePendant.w = b.c(90.00f);
    }
    public void EntrancePendant(Context p0){
       a.p(p0, "context");
       super(p0);
       this.t = new EntrancePendant$b(this);
       this.u = new EntrancePendant$c(this);
    }
    public void EntrancePendant(Context p0,AttributeSet p1){
       a.p(p0, "context");
       super(p0, p1);
       this.t = new EntrancePendant$b(this);
       this.u = new EntrancePendant$c(this);
    }
    public void EntrancePendant(Context p0,AttributeSet p1,int p2){
       a.p(p0, "context");
       super(p0, p1, p2);
       this.t = new EntrancePendant$b(this);
       this.u = new EntrancePendant$c(this);
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EntrancePendant.class, "3")) {
          return;
       }
       a.p(p0, "view");
       super.doBindView(p0);
       this.o = m1.f(p0, 0x7f0a2fc5);
       this.p = m1.f(p0, 0x7f0a0db0);
       this.q = m1.f(p0, 0x7f0a0db1);
       this.r = m1.f(p0, 0x7f0a0db2);
       return;
    }
    public final View getMExpandBtnContainer$pendant_entrance_release(){
       return this.p;
    }
    public final KwaiImageView getMPendantExpandBtnBg$pendant_entrance_release(){
       return this.q;
    }
    public final TextView getMPendantExpandBtnText$pendant_entrance_release(){
       return this.r;
    }
    public void o(Context p0){
       b uob = b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, EntrancePendant.class, "1")) {
          return;
       }
       a.p(p0, "context");
       super.o(p0);
       this.f(this.u);
       String mAnimZipUrl = this.getMParams().getMAnimZipUrl();
       int i = 0;
       if (!PatchProxy.applyVoidOneRefs(mAnimZipUrl, null, uob, "18")) {
          String str = (mAnimZipUrl == null || !mAnimZipUrl.length())? 1: null;
          if (!str) {
             a.h.d(mAnimZipUrl);
          }
       }
       mAnimZipUrl = this.getMParams().getMIconUrl();
       if (!PatchProxy.applyVoidOneRefs(mAnimZipUrl, null, uob, "21")) {
          if (mAnimZipUrl == null || !mAnimZipUrl.length()) {
             i = 1;
          }
          if (!i) {
             a.e(mAnimZipUrl, new f());
          }
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, EntrancePendant.class, "6")) {
          return;
       }
       super.onDetachedFromWindow();
       b9.a(this.s);
       this.k(this.u);
       return;
    }
    public void p(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, EntrancePendant.class, "2")) {
          return;
       }
       a.p(p0, "context");
       super.p(p0);
       if (b.j()) {
          this.v();
       }
       return;
    }
    public final void setMExpandBtnContainer$pendant_entrance_release(View p0){
       this.p = p0;
    }
    public final void setMPendantExpandBtnBg$pendant_entrance_release(KwaiImageView p0){
       this.q = p0;
    }
    public final void setMPendantExpandBtnText$pendant_entrance_release(TextView p0){
       this.r = p0;
    }
    public final void v(){
       t ot;
       EntranceParam obj;
       t ot1;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EntrancePendant.class, "4")) {
          return;
       }
       this.setOnClickListener(this.t);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "5";
       if (!PatchProxy.applyVoid(objArray, this, EntrancePendant.class, str)) {
          c.c("initUi");
          EntrancePendant to = this.o;
          int i = 0;
          if (to != null) {
             b.a(to, this.getMParams().getMIconUrl(), i);
          }
          a uoa = a.class;
          if (!PatchProxy.applyVoidOneRefs(this, objArray, uoa, "6")) {
             a.p(this, "$this$initUiExpandButton");
             PendantExpandButtonConfig mExpandButto = this.getMParams().getMExpandButtonConfig();
             if (mExpandButto != null) {
                obj = this.getMParams();
                PendantExpandButtonTextConfig pendantExpan = PatchProxy.applyOneRefs(obj, objArray, uoa, str);
                if (pendantExpan == patchProxyRe) {
                   if (obj != null) {
                      PendantExpandButtonConfig mExpandButto1 = obj.getMExpandButtonConfig();
                      if (mExpandButto1 != null) {
                         Map textConfigMa = mExpandButto1.getTextConfigMap();
                         if (textConfigMa != null) {
                            pendantExpan = textConfigMa.get("COMMON_TEXT");
                         }
                      }
                   }
                   pendantExpan = objArray;
                label_0077 :
                   b.g(this.getMExpandBtnContainer$pendant_entrance_release(), mExpandButto);
                   b.h(this.getMPendantExpandBtnText$pendant_entrance_release(), pendantExpan, i, 2, objArray);
                   b.f(this.getMPendantExpandBtnBg$pendant_entrance_release(), mExpandButto, pendantExpan);
                }
                goto label_0077 ;
             }
          }
          String mAnimPrefix = this.getMParams().getMAnimPrefix();
          if (mAnimPrefix != null) {
             str = this.getMParams().getMAnimZipUrl();
             int v = EntrancePendant.v;
             int w = EntrancePendant.w;
             if (PatchProxy.isSupport(b.class)) {
                ot = PatchProxy.applyFourRefs(str, mAnimPrefix, Integer.valueOf(v), Integer.valueOf(w), null, b.class, "17");
                if (ot != patchProxyRe) {
                }else {
                label_00c8 :
                   String str1 = "key";
                   a.p(mAnimPrefix, str1);
                   if (str == null || !str.length()) {
                      i = 1;
                   }
                   if (i) {
                      ot = t.fromCallable(e.b);
                      a.o(ot, "Observable.fromCallable { emptyList\(\) }");
                   }else {
                      a h = a.h;
                      Objects.requireNonNull(h);
                      obj = PatchProxy.applyTwoRefs(str, mAnimPrefix, h, a.class, "10");
                      if (obj != patchProxyRe) {
                         objArray = obj;
                      }else {
                         a.p(str, "resourceUrl");
                         a.p(mAnimPrefix, str1);
                         String str2 = h.i(str);
                         Map g = a.g;
                         if (g.containsKey(str2+mAnimPrefix)) {
                            b.k("FloatWidget1 prepared loadAnimBitmaps process by memory cache");
                            objArray = g.get(str2+mAnimPrefix);
                         }else {
                            b.k("FloatWidget1 prepared loadAnimBitmaps process cache return null");
                         }
                      }
                      if (objArray != null) {
                         ot1 = t.fromCallable(new c(objArray));
                         if (ot1 != null) {
                         label_0164 :
                            ot = ot1;
                         }
                      }
                      ot1 = t.fromCallable(new d(str, mAnimPrefix, v, w)).subscribeOn(d.c).observeOn(d.a);
                      a.o(ot1, "let {\n    Observable.fro¡­\(KwaiSchedulers.MAIN\)\n  }");
                      goto label_0164 ;
                   }
                }
             }else {
                goto label_00c8 ;
             }
             this.s = ot.subscribe(new a(this), b.b);
          }
       }
       return;
    }
}
