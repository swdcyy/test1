package com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$b;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.ref.WeakReference;
import java.util.List;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$c;
import com.kwai.robust.PatchProxyResult;
import java.util.Iterator;
import com.yxcorp.gifshow.relation.explore.carousellayoutmanager.CarouselLayoutManager$a;

public class CarouselLayoutManager$b	// class@0017f1
{
    public int a;
    public int b;
    public CarouselLayoutManager$c[] c;
    public final List d;

    public void CarouselLayoutManager$b(int p0){
       super();
       this.d = new ArrayList();
       this.a = p0;
    }
    public static int a(CarouselLayoutManager$b p0,int p1){
       int i = p0.b + p1;
       p0.b = i;
       return i;
    }
    public static int b(CarouselLayoutManager$b p0,int p1){
       int i = p0.b - p1;
       p0.b = i;
       return i;
    }
    public void c(int p0){
       if (PatchProxy.isSupport(CarouselLayoutManager$b.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, CarouselLayoutManager$b.class, "1")) {
          return;
       }
       CarouselLayoutManager$b tc = this.c;
       if (tc == null || tc.length != p0) {
          int i = 0;
          if (tc != null && !PatchProxy.applyVoidOneRefs(tc, this, CarouselLayoutManager$b.class, "2")) {
             int len1 = tc.length;
             for (int i1 = 0; i1 < len1; i1 = i1 + 1) {
                this.d.add(new WeakReference(tc[i1]));
             }
          }
          CarouselLayoutManager$c[] uocArray = new CarouselLayoutManager$c[p0];
          this.c = uocArray;
          if (!PatchProxy.applyVoid(null, this, CarouselLayoutManager$b.class, "3")) {
             int len = this.c.length;
             while (i < len) {
                CarouselLayoutManager$b tc1 = this.c;
                if (tc1[i] == null) {
                   CarouselLayoutManager$c uoc = PatchProxy.apply(null, this, CarouselLayoutManager$b.class, "4");
                   if (uoc != PatchProxyResult.class) {
                   }else {
                      Iterator iterator = this.d.iterator();
                      while (true) {
                         if (iterator.hasNext()) {
                            CarouselLayoutManager$c uoc1 = iterator.next().get();
                            iterator.remove();
                            if (uoc1 != null) {
                               uoc = uoc1;
                            }
                         }else {
                            uoc = new CarouselLayoutManager$c(null);
                         }
                      }
                   }
                   tc1[i] = uoc;
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public void d(int p0,int p1,float p2){
       object oobject = this.c[p0];
       oobject.a = p1;
       oobject.b = p2;
    }
}
