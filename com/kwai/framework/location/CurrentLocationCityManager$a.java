package com.kwai.framework.location.CurrentLocationCityManager$a;
import q96.a;
import com.kwai.framework.location.CurrentLocationCityManager;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import s96.a;
import java.lang.System;
import com.kwai.framework.location.k;
import com.kwai.framework.location.util.a;
import wk7.j;
import java.lang.Boolean;

public class CurrentLocationCityManager$a implements a	// class@000b78
{
    public final CurrentLocationCityManager a;

    public void CurrentLocationCityManager$a(CurrentLocationCityManager p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1,String p2,String p3,String p4,int p5){
       CurrentLocationCityManager$a uoa = CurrentLocationCityManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "5")) {
             return;
          }
       }
       a.d(p0, p1, p2, p3, p4, p5);
       return;
    }
    public void b(String p0,String p1,String p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, CurrentLocationCityManager$a.class, "3")) {
          return;
       }
       a.d("Tencent", 1002, 0, System.currentTimeMillis(), p0, p1, p2, 0x2721, k.f());
       j.f("location", p0, p1, p2, true, 0x21ab0, "2", false, false);
       return;
    }
    public void c(String p0,String p1,String p2,String p3,int p4,boolean p5,boolean p6,int p7){
       int i = p7;
       CurrentLocationCityManager$a uoa = CurrentLocationCityManager$a.class;
       int i1 = 2;
       int i2 = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }else {
          int i3 = this;
       }
       if (p4 == 0x21ab5 && (i != i2 && i != i1)) {
          a.b(p0, "CONFIRM", "BUSINESS", p3, p1, p2, p5, p6, p7);
       }
    label_005c :
       return;
    }
    public void d(String p0,String p1,String p2,int p3){
       if (PatchProxy.isSupport(CurrentLocationCityManager$a.class) && PatchProxy.applyVoidFourRefs(p0, p1, p2, Integer.valueOf(p3), this, CurrentLocationCityManager$a.class, "6")) {
          return;
       }
       a.d("Tencent", 1002, 0, System.currentTimeMillis(), p0, p1, p2, p3, k.f());
       return;
    }
    public void e(String p0,String p1,String p2,boolean p3,String p4,int p5){
       CurrentLocationCityManager$a uoa = CurrentLocationCityManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,Boolean.valueOf(p3),p4,Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "4")) {
             return;
          }
       }else {
          int i1 = this;
       }
       String str = (p3)? "CONFIRM": "CANCAL";
       a.b(p0, str, "SYSTEM", p4, p1, p2, p3, k.f(), p5);
       if (!p3) {
          a.d("Tencent", 1002, 0, System.currentTimeMillis(), p0, p1, p2, 0x21ab0, k.f());
       }
       int i = (p3)? 0x21ab3: 0x21ab0;
       j.f("location", p0, p1, p2, true, i, "1", false, p3);
       return;
    }
    public void f(String p0,String p1,String p2,String p3,int p4,boolean p5,boolean p6,int p7){
       CurrentLocationCityManager$a uoa = CurrentLocationCityManager$a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,Integer.valueOf(p4),Boolean.valueOf(p5),Boolean.valueOf(p6),Integer.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }else {
          int i = this;
       }
       if (p4 == 0x21ab1) {
          a.b(p0, "CANCAL", "BUSINESS", p3, p1, p2, p5, p6, p7);
       }
       a.d("Tencent", 1002, 0, System.currentTimeMillis(), p0, p1, p2, p4, k.f());
       return;
    }
    public void g(String p0,boolean p1,String p2,String p3){
    }
}
