package com.yxcorp.gifshow.detail.fragments.milano.profile.o$a;
import jta.d;
import com.yxcorp.gifshow.detail.fragments.milano.profile.o;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import java.util.List;
import rf5.u;
import java.util.Iterator;
import jta.c;
import android.content.Context;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kwai.component.homepage_interface.uxmonitor.AnswerType;
import com.kwai.component.homepage_interface.uxmonitor.InvalidGestureChecker;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.view.View;
import java.lang.Math;

public class o$a implements d	// class@00155d
{
    public final o a;

    public void o$a(o p0){
       this.a = p0;
       super();
    }
    public void a(float p0){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "4")) {
          return;
       }
       uoa = this.a;
       uoa.v = null;
       Iterator iterator = uoa.s.r().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0);
       }
       return;
    }
    public void b(float p0){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "3")) {
          return;
       }
       Iterator iterator = this.a.s.r().iterator();
       while (iterator.hasNext()) {
          iterator.next().d(p0);
       }
       InvalidGestureChecker.a(this.a.getContext(), AnswerType.SIDE_PROFILE);
       return;
    }
    public void c(float p0){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoa, "2")) {
          return;
       }
       Iterator iterator = this.a.s.r().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(p0);
       }
       return;
    }
    public float d(float p0){
       o$a uoa = o$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Float.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       uoa = this.a;
       if (uoa.v == null) {
          uoa.v = Float.valueOf(uoa.u.getTranslationX());
       }
       float f = 0x3f800000;
       float f1 = 0;
       if (!this.a.v.floatValue() - f1) {
          if (p0 - f1 >= 0) {
             f1 = Math.min(f, ((Math.abs(p0) * f) / (float)o.A));
          }
          return f1;
       }else if(p0 - f1 > 0){
          f = Math.max(f1, (f - ((Math.abs(p0) * f) / (float)o.A)));
       }
       return f;
    }
    public void e(float p0){
    }
}
