package com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$eventListener$2$a;
import d1c.e;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig$eventListener$2;
import java.lang.Object;
import android.view.View;
import com.kwai.feature.post.api.componet.prettify.filter.model.FilterConfig;
import d1c.d;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.lang.StringBuilder;
import dc5.c;
import com.yxcorp.gifshow.message_camera.effect.prettify.config.IMFilterOptionConfig;
import java.util.Objects;
import com.yxcorp.gifshow.message_camera.effect.prettify.filter.IMFilterController;
import com.yxcorp.gifshow.prettify.filter.data.FilterStateManager;
import android.util.SparseArray;
import o0c.f;
import o1c.x0;
import com.yxcorp.gifshow.prettify.v4.magic.filter.a0;
import java.lang.Integer;
import k2b.e0;

public final class IMFilterOptionConfig$eventListener$2$a implements e	// class@001db7
{
    public final IMFilterOptionConfig$eventListener$2 b;

    public void IMFilterOptionConfig$eventListener$2$a(IMFilterOptionConfig$eventListener$2 p0){
       this.b = p0;
       super();
    }
    public void D0(View p0,int p1,FilterConfig p2){
       d.d(this, p0, p1, p2);
    }
    public void J(){
       d.h(this);
    }
    public void K(FilterConfig p0){
       IMFilterOptionConfig c;
       if (PatchProxy.applyVoidOneRefs(p0, this, IMFilterOptionConfig$eventListener$2$a.class, "2")) {
          return;
       }
       String str = "filterConfig";
       a.p(p0, str);
       if (p0.isEmptyFilter()) {
          c.g("FilterOptionConfig", "this should not happen "+p0);
          return;
       }else {
          c = this.b.this$0.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(p0, c, IMFilterController.class, "8")) {
             a.p(p0, str);
             c.g.k(p0.mIntensity);
          }
          return;
       }
    }
    public void L(SparseArray p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMFilterOptionConfig$eventListener$2$a.class, "4")) {
          return;
       }
       a.p(p0, "items");
       x0.h(p0, null);
       return;
    }
    public void Q0(int p0,FilterConfig p1,a0 p2){
       IMFilterOptionConfig c;
       if (PatchProxy.isSupport(IMFilterOptionConfig$eventListener$2$a.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, p2, this, IMFilterOptionConfig$eventListener$2$a.class, "1")) {
          return;
       }
       String str = "filterConfig";
       a.p(p1, str);
       a.p(p2, "filterSelectSource");
       if (p2.e()) {
          c.g("FilterOptionConfig", "onItemSelect");
          c = this.b.this$0.c;
          Objects.requireNonNull(c);
          if (!PatchProxy.applyVoidOneRefs(p1, c, IMFilterController.class, "7")) {
             a.p(p1, str);
             c.g.l(p1);
          }
       }
       return;
    }
    public void i(){
       d.f(this);
    }
    public void o1(FilterConfig p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IMFilterOptionConfig$eventListener$2$a.class, "3")) {
          return;
       }
       x0.g(p0, null, this.b.$prettifyFragment);
       return;
    }
    public void q(){
       d.g(this);
    }
}
