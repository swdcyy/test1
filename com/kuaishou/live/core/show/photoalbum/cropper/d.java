package com.kuaishou.live.core.show.photoalbum.cropper.d;
import java.lang.Object;
import android.graphics.RectF;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Math;
import java.lang.Number;

public final class d	// class@000d6f
{
    public final RectF a;
    public final RectF b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;

    public void d(){
       super();
       this.a = new RectF();
       this.b = new RectF();
       this.k = 0x3f800000;
       this.l = 0x3f800000;
    }
    public static boolean i(float p0,float p1,float p2,float p3,float p4,float p5){
       boolean b = (p0 - p2 > 0 && (p0 - p4 < 0 && (p1 - p3 > 0 && p1 - p5 < 0)))? true: false;
       return b;
    }
    public static boolean j(float p0,float p1,float p2,float p3,float p4){
       d uod = d.class;
       int i = 1;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4)};
          Object obj = PatchProxy.apply(objArray, null, uod, "11");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (Math.abs((p0 - p2)) - p4 > 0 || Math.abs((p1 - p3)) - p4 > 0) {
          i = false;
       }
       return i;
    }
    public static boolean k(float p0,float p1,float p2,float p3,float p4,float p5){
       d uod = d.class;
       int i = 1;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, uod, "12");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (p0 - p2 <= 0 || (p0 - p3 >= 0 || Math.abs((p1 - p4)) - p5 > 0)) {
          i = false;
       }
       return i;
    }
    public static boolean l(float p0,float p1,float p2,float p3,float p4,float p5){
       d uod = d.class;
       int i = 1;
       if (PatchProxy.isSupport(uod)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),Float.valueOf(p4),Float.valueOf(p5)};
          Object obj = PatchProxy.apply(objArray, null, uod, "13");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       if (Math.abs((p0 - p2)) - p5 > 0 || (p1 - p3 <= 0 || p1 - p4 >= 0)) {
          i = false;
       }
       return i;
    }
    public final boolean a(){
       Object obj = PatchProxy.apply(null, this, d.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (this.n() ^ 0x01);
    }
    public float b(){
       Object obj = PatchProxy.apply(null, this, d.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.min(this.f, (this.j / this.l));
    }
    public float c(){
       Object obj = PatchProxy.apply(null, this, d.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.min(this.e, (this.i / this.k));
    }
    public float d(){
       Object obj = PatchProxy.apply(null, this, d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.max(this.d, (this.h / this.l));
    }
    public float e(){
       Object obj = PatchProxy.apply(null, this, d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return Math.max(this.c, (this.g / this.k));
    }
    public RectF f(){
       Object obj = PatchProxy.apply(null, this, d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       this.b.set(this.a);
       return this.b;
    }
    public float g(){
       return this.l;
    }
    public float h(){
       return this.k;
    }
    public void m(RectF p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "6")) {
          return;
       }
       this.a.set(p0);
       return;
    }
    public boolean n(){
       Object obj = PatchProxy.apply(null, this, d.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.a.width() - 0x42c80000 >= 0 && this.a.height() - 0x42c80000 >= 0)? true: false;
       return b;
    }
}
