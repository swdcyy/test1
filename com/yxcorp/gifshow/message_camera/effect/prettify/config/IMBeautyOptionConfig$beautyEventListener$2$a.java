package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$beautyEventListener$2$a;
import s0c.d;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig$beautyEventListener$2;
import java.lang.Object;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautifyConfig;
import com.kwai.feature.post.api.componet.prettify.beauty.BeautyFilterItem;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import dc5.c;
import cib.a;
import o0c.f;
import com.yxcorp.gifshow.prettify.beauty.h;
import s0c.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMBeautyOptionConfig;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.beauty.IMBeautyController;
import crd.b;
import lnc.b9;
import r0c.h;
import xi9.b;
import k2b.e0;

public final class IMBeautyOptionConfig$beautyEventListener$2$a implements d	// class@001db1
{
    public final IMBeautyOptionConfig$beautyEventListener$2 b;

    public void IMBeautyOptionConfig$beautyEventListener$2$a(IMBeautyOptionConfig$beautyEventListener$2 p0){
       this.b = p0;
       super();
    }
    public void B0(BeautifyConfig p0,BeautyFilterItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "3")) {
          return;
       }
       a.p(p0, "beautifyConfig");
       a.p(p1, "item");
       if (p1.getItemId() == -1 || p1.getItemId() == -2) {
          c.g("IMBeautyOptionConfig", "onItemSelect apply beautifyConfig "+p0.mId);
          this.a(p0);
       }
       h.q(p0, p1, a.b(), null);
       String loggerName = p1.getLoggerName();
       a.o(loggerName, "item.loggerName");
       this.b(loggerName);
       return;
    }
    public void F(BeautifyConfig p0,BeautyFilterItem p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "4")) {
          return;
       }
       a.p(p0, "beautifyConfig");
       a.p(p1, "item");
       c.e(this, p0, p1);
       c.g("IMBeautyOptionConfig", "onItemReSelect beautifyConfig "+p0.mId);
       String loggerName = p1.getLoggerName();
       a.o(loggerName, "item.loggerName");
       this.b(loggerName);
       return;
    }
    public void J(){
    }
    public void Z0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "beautifyConfig");
       c.g("IMBeautyOptionConfig", "onCategorySelect beautifyConfig "+p0.mId);
       this.a(p0);
       if (p0.mId == null) {
          p0 = null;
       }
       h.t(p0, false, a.b(), null);
       return;
    }
    public final void a(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "8")) {
          return;
       }
       c.g("IMBeautyOptionConfig", "applyBeautyEffect "+p0);
       IMBeautyOptionConfig d = this.b.this$0.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(p0, d, IMBeautyController.class, "6")) {
          a.p(p0, "beautifyConfig");
          b9.a(d.b);
          c.g("IMBeautyController", "updateBeauty");
          d.k.e(p0);
       }
       return;
    }
    public final void b(String p0){
       IMBeautyController a;
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "9")) {
          return;
       }
       IMBeautyOptionConfig d = this.b.this$0.d;
       Objects.requireNonNull(d);
       if (!PatchProxy.applyVoidOneRefs(p0, d, IMBeautyController.class, "7")) {
          a.p(p0, "animType");
          a = d.a;
          if (a != null) {
             a.Y(p0);
          }
       }
       return;
    }
    public void b1(BeautifyConfig p0,boolean p1){
       c.g(this, p0, p1);
    }
    public void p0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "6")) {
          return;
       }
       a.p(p0, "beautifyConfig");
       this.a(p0);
       return;
    }
    public void q0(BeautifyConfig p0,BeautifyConfig p1,BeautyFilterItem p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "7")) {
          return;
       }
       a.p(p0, "config");
       a.p(p1, "referConfig");
       a.p(p2, "item");
       h.r(p0, p1, p2, this.b.$prettifyFragment);
       return;
    }
    public void w0(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "beautifyConfig");
       c.g("IMBeautyOptionConfig", "onCategoryReSelect beautifyConfig "+p0.mId);
       if (p0.mId == null) {
          p0 = null;
       }
       h.t(p0, false, a.b(), null);
       this.b.this$0.d.h(false);
       return;
    }
    public void x1(BeautifyConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMBeautyOptionConfig$beautyEventListener$2$a.class, "5")) {
          return;
       }
       a.p(p0, "beautifyConfig");
       h.o(p0, null);
       this.b.this$0.d.h(true);
       return;
    }
}
