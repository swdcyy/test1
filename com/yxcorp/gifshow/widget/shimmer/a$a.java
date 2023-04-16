package com.yxcorp.gifshow.widget.shimmer.a$a;
import java.lang.Object;
import com.yxcorp.gifshow.widget.shimmer.a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.Objects;
import java.lang.Math;
import android.content.res.TypedArray;
import java.lang.Float;
import android.animation.ArgbEvaluator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public class a$a	// class@0019c5
{
    public final a a;

    public void a$a(){
       super();
       this.a = new a();
    }
    public a a(){
       a a;
       Object[] objArray = null;
       a$a obj = PatchProxy.apply(objArray, this, a$a.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.a;
       a b = obj.b;
       a e = obj.e;
       b[0] = e;
       b[1] = obj.d;
       b[2] = e;
       Objects.requireNonNull(obj);
       if (!PatchProxy.applyVoid(objArray, obj, a.class, "3")) {
          obj.a[0] = Math.max(((0x3f800000 - obj.j) / 2.00f), 0);
          a = obj.a;
          a[1] = 0x3f000000;
          a[2] = Math.min(((obj.j + 0x3f800000) / 2.00f), 0x3f800000);
       }
       return this.a;
    }
    public a$a b(TypedArray p0){
       long l;
       float floatx1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a$a uoa = a$a.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoa, "1");
       if (obj != patchProxyRe) {
          return obj;
       }
       int i = 2;
       if (p0.hasValue(i)) {
          this.a.l = p0.getBoolean(i, this.a.l);
       }
       int i1 = 0;
       if (p0.hasValue(i1)) {
          this.a.m = p0.getBoolean(i1, this.a.m);
       }
       int i2 = 1;
       if (p0.hasValue(i2)) {
          this.a.e = p0.getColor(i2, this.a.e);
       }
       int i3 = 10;
       if (p0.hasValue(i3)) {
          this.a.d = p0.getColor(i3, this.a.d);
       }
       i3 = 9;
       if (p0.hasValue(i3)) {
          float floatx = p0.getFloat(i3, 0x3f800000);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Float.valueOf(floatx), this, uoa, "7") != patchProxyRe) {
          }else {
             this.a.d = new ArgbEvaluator().evaluate(floatx, Integer.valueOf(this.a.e), Integer.valueOf(this.a.d)).intValue();
          }
       }
       i3 = 5;
       a$a uoa1 = null;
       if (p0.hasValue(i3)) {
          l = (long)p0.getInt(i3, (int)this.a.p);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Long.valueOf(l), this, uoa, "10") != patchProxyRe) {
          }else if(l - uoa1 >= 0){
             this.a.p = l;
          }else {
             throw new IllegalArgumentException("Given a negative duration: "+l);
          }
       }
       i3 = 11;
       if (p0.hasValue(i3)) {
          this.a.n = p0.getInt(i3, this.a.n);
       }
       i3 = 12;
       if (p0.hasValue(i3)) {
          l = (long)p0.getInt(i3, (int)this.a.q);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Long.valueOf(l), this, uoa, "8") != patchProxyRe) {
          }else if(l - uoa1 >= 0){
             this.a.q = l;
          }else {
             throw new IllegalArgumentException("Given a negative repeat delay: "+l);
          }
       }
       i3 = 13;
       if (p0.hasValue(i3)) {
          this.a.o = p0.getInt(i3, this.a.o);
       }
       i3 = 14;
       if (p0.hasValue(i3)) {
          l = (long)p0.getInt(i3, (int)this.a.r);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Long.valueOf(l), this, uoa, "9") != patchProxyRe) {
          }else if(l - uoa1 >= 0){
             this.a.r = l;
          }else {
             throw new IllegalArgumentException("Given a negative start delay: "+l);
          }
       }
       i3 = 3;
       if (p0.hasValue(i3)) {
          int intx = p0.getInt(i3, this.a.c);
          if (intx != i2) {
             if (intx != i) {
                if (intx != i3) {
                   this.c(i1);
                }else {
                   this.c(i3);
                }
             }else {
                this.c(i);
             }
          }else {
             this.c(i2);
          }
       }
       i = 4;
       if (p0.hasValue(i)) {
          floatx1 = p0.getFloat(i, this.a.j);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Float.valueOf(floatx1), this, uoa, "6") != patchProxyRe) {
          }else if(floatx1 >= 0){
             this.a.j = floatx1;
          }else {
             throw new IllegalArgumentException("Given invalid dropoff value: "+floatx1);
          }
       }
       i = 7;
       if (p0.hasValue(i)) {
          i = p0.getDimensionPixelSize(i, this.a.f);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Integer.valueOf(i), this, uoa, "2") != patchProxyRe) {
          }else if(i >= 0){
             this.a.f = i;
          }else {
             throw new IllegalArgumentException("Given invalid width: "+i);
          }
       }
       i = 6;
       if (p0.hasValue(i)) {
          i = p0.getDimensionPixelSize(i, this.a.g);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Integer.valueOf(i), this, uoa, "3") != patchProxyRe) {
          }else if(i >= 0){
             this.a.g = i;
          }else {
             throw new IllegalArgumentException("Given invalid height: "+i);
          }
       }
       i = 16;
       if (p0.hasValue(i)) {
          floatx1 = p0.getFloat(i, this.a.h);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Float.valueOf(floatx1), this, uoa, "4") != patchProxyRe) {
          }else if(floatx1 >= 0){
             this.a.h = floatx1;
          }else {
             throw new IllegalArgumentException("Given invalid width ratio: "+floatx1);
          }
       }
       i = 8;
       if (p0.hasValue(i)) {
          floatx1 = p0.getFloat(i, this.a.i);
          if (PatchProxy.isSupport(uoa) && PatchProxy.applyOneRefs(Float.valueOf(floatx1), this, uoa, "5") != patchProxyRe) {
          }else if(floatx1 >= 0){
             this.a.i = floatx1;
          }else {
             throw new IllegalArgumentException("Given invalid height ratio: "+floatx1);
          }
       }
       int i4 = 15;
       if (p0.hasValue(i4)) {
          this.a.k = p0.getFloat(i4, this.a.k);
       }
       return this;
    }
    public a$a c(int p0){
       this.a.c = p0;
       return this;
    }
}
