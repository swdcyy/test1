package kl9.a;
import jl9.d;
import kl9.a$a;
import java.lang.Object;
import il9.e;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Float;
import java.lang.String;
import java.util.Random;
import java.lang.Math;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;

public class a implements d	// class@002cb3
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;

    public void a(float p0,float p1,a$a p2){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(int p0,int p1,float p2,float p3,e p4){
       float f;
       int i = this;
       int i1 = p0;
       int i2 = p1;
       object oobject = p4;
       a uoa = a.class;
       int i3 = 2;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Float.valueOf(p2),Float.valueOf(p3),oobject};
          if (PatchProxy.applyVoid(objArray, i, uoa, "1")) {
             return;
          }
       }
       i.i = p4.c();
       i.g = p2;
       i.h = p3;
       i.a = (oobject.d(i1) * i.a) / (float)p4.c();
       i.b = (oobject.d(i1) * i.b) / (float)p4.c();
       double d = 180.00f;
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), oobject, i, uoa, "2")) {
          f = i.b - i.a;
          float f2 = (p4.e().nextFloat() * f) + i.a;
          if ((i2 - p4.b()) < 30) {
             float f3 = 2.00f;
             f2 = (((p4.e().nextFloat() * f) / f3) + i.a) + (f / f3);
          }
          double d3 = (double)f2;
          double d4 = (double)(float)(((double)i2 * 0x400921fb54442d18) / d);
          i.c = (float)(Math.cos(d4) * d3);
          i.d = (float)(d3 * Math.sin(d4));
       }
       if (!PatchProxy.isSupport(uoa) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p1), oobject, i, uoa, "3")) {
          if (PatchProxy.isSupport(uoa)) {
             Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p1), oobject, i, uoa, "4");
             if (obj != PatchProxyResult.class) {
                f = obj.floatValue();
             }else {
             label_00fc :
                i1 = p4.a() - 270;
                if (i1 < 0) {
                   i1 = p4.a() - 180;
                }
                if (i1 < 0) {
                   i1 = p4.a() - 90;
                }
                if (i1 < 0) {
                   i1 = p4.a();
                }
                if (i1 > (p4.a() - p4.b())) {
                   i1 = p4.b() + ((p4.a() - p4.b()) / i3);
                }
                int i4 = p4.a() - (i1 * 2);
                if (i2 < i4) {
                   while (true) {
                      if (i4 > 0) {
                         i4 = i4 - i1;
                         if (i2 < i4) {
                            continue ;
                         }
                      }else {
                         f = 0;
                         break ;
                      }
                   }
                }
                f = (float)((i4 + i1) - 180);
             }
          }else {
             goto label_00fc ;
          }
          float f1 = i.a / 1000.00f;
          double d1 = (double)((p4.e().nextFloat() * (f1 - f1)) + f1);
          double d2 = (double)(float)(((double)f * 0x400921fb54442d18) / 180.00f);
          i.e = (float)(Math.cos(d2) * d1);
          i.f = (float)(d1 * Math.sin(d2));
       }
       return;
    }
    public float b(float p0){
       float f = (float)(long)(int)(p0 * (float)this.i);
       return ((this.h + (this.d * f)) + ((this.f * f) * f));
    }
    public float c(float p0){
       float f = (float)(long)(int)(p0 * (float)this.i);
       return ((this.g + (this.c * f)) + ((this.e * f) * f));
    }
}
