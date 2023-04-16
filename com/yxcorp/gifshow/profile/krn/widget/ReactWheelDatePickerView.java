package com.yxcorp.gifshow.profile.krn.widget.ReactWheelDatePickerView;
import android.widget.FrameLayout;
import com.facebook.react.bridge.ReactContext;
import android.content.Context;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import ca.a;
import java.util.Calendar;
import java.lang.System;
import android.content.res.Resources;
import android.content.ContextWrapper;
import zf6.l;
import ekd.k1;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.LinearLayout;
import ga.d0;
import r3c.a;
import ea.b;

public class ReactWheelDatePickerView extends FrameLayout	// class@001377
{
    public a b;
    public d0 c;
    public final ReactContext d;
    public static final int e;

    public void ReactWheelDatePickerView(ReactContext p0){
       ReactWheelDatePickerView tb;
       super(p0);
       this.d = p0;
       if (PatchProxy.applyVoid(null, this, ReactWheelDatePickerView.class, "1")) {
       }else if(p0 != null){
          this.b = new a(2);
          Calendar instance = Calendar.getInstance();
          instance.setTimeInMillis(System.currentTimeMillis());
          tb = this.b;
          tb.x = instance;
          tb.d0 = 20;
          tb.A = true;
          tb.h0 = p0.getResources().getColor(0x7f0607de);
          this.b.g0 = p0.getResources().getColor(0x7f0607de);
          this.b.i0 = l.m(0x14ffffff, -3355444);
          this.b.D = p0.getString(0x7f104fd5);
          this.b.E = p0.getString(0x7f104fd3);
          this.b.F = p0.getString(0x7f104fd2);
          ReactWheelDatePickerView tb2 = this.b;
          String str = "";
          String str1 = (k1.h())? p0.getString(R.string.arg_RES_7f101562): str;
          tb2.G = str1;
          tb2 = this.b;
          if (k1.h()) {
             str = p0.getString(R.string.arg_RES_7f103631);
          }
          tb2.H = str;
          this.b.k0 = 2.60f;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, ReactWheelDatePickerView.class, "2")) {
          LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d12ba, this);
          LinearLayout linearLayout = this.findViewById(R.id.timepicker);
          if (!PatchProxy.applyVoidOneRefs(linearLayout, this, ReactWheelDatePickerView.class, "3")) {
             tb = this.b;
             d0 uod0 = new d0(linearLayout, tb.u, tb.R, tb.d0);
             this.c = uod0;
             uod0.g(0);
             this.c.n(new a(this));
             this.c.j(this.b.B);
             this.b();
             this.a();
             ReactWheelDatePickerView tb1 = this.b;
             this.c.h(tb1.D, tb1.E, tb1.F, tb1.G, tb1.H, tb1.I);
             this.c.e(this.b.A);
             this.c.f(this.b.i0);
             this.c.p(this.b.g0);
             this.c.o(this.b.h0);
             this.c.b(this.b.o0);
             this.c.i(this.b.k0);
          }
       }
       return;
    }
    public final void a(){
       int i5;
       int i6;
       if (PatchProxy.applyVoid(null, this, ReactWheelDatePickerView.class, "9")) {
          return;
       }
       Calendar instance = Calendar.getInstance();
       a v = this.b.v;
       int i = 12;
       int i1 = 11;
       int i2 = 5;
       int i3 = 2;
       int i4 = 1;
       if (v == null) {
          instance.setTimeInMillis(System.currentTimeMillis());
          i5 = instance.get(i4);
          i3 = instance.get(i3);
          i2 = instance.get(i2);
          i1 = instance.get(i1);
          i = instance.get(i);
          i6 = instance.get(13);
       }else {
          i5 = v.get(i4);
          i3 = this.b.v.get(i3);
          i2 = this.b.v.get(i2);
          i1 = this.b.v.get(i1);
          i = this.b.v.get(i);
          i6 = this.b.v.get(13);
       }
       this.c.k(i5, i3, i2, i1, i, i6);
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ReactWheelDatePickerView.class, "7")) {
          return;
       }
       ReactWheelDatePickerView tb = this.b;
       this.c.l(tb.w, tb.x);
       if (!PatchProxy.applyVoid(objArray, this, ReactWheelDatePickerView.class, "8")) {
          ReactWheelDatePickerView tb1 = this.b;
          a w = tb1.w;
          if (w != null && tb1.x != null) {
             a v = tb1.v;
             if (v != null && (v.getTimeInMillis() - this.b.w.getTimeInMillis() < 0 || this.b.v.getTimeInMillis() - this.b.x.getTimeInMillis() > 0)) {
                tb1 = this.b;
                tb1.v = tb1.w;
             }
          }else if(w != null){
             tb1.v = w;
          }else {
             w = tb1.x;
             if (w != null) {
                tb1.v = w;
             }
          }
       }
       return;
    }
    public void setDate(Calendar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactWheelDatePickerView.class, "4")) {
          return;
       }
       this.b.v = p0;
       this.a();
       return;
    }
    public void setEndDate(Calendar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactWheelDatePickerView.class, "6")) {
          return;
       }
       this.b.x = p0;
       this.b();
       return;
    }
    public void setStartDate(Calendar p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ReactWheelDatePickerView.class, "5")) {
          return;
       }
       this.b.w = p0;
       this.b();
       return;
    }
}
