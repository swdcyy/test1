package androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.h$a;
import androidx.recyclerview.widget.h$h;
import androidx.recyclerview.widget.h$b;
import androidx.recyclerview.widget.h$c;
import androidx.recyclerview.widget.h$i;
import androidx.recyclerview.widget.h$e;
import java.util.ArrayList;
import java.lang.Object;
import androidx.recyclerview.widget.h$d;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;

public class h	// class@000912
{
    public static final Comparator a;

    static {
       h.a = new h$a();
    }
    public static h$i a(h$h p0,h$b p1,h$c p2,h$c p3,int p4){
       int i5;
       int i6;
       h$h oh = p0;
       h$c uoc = p3;
       int i = p4;
       int i1 = (!((p0.b() - p0.a()) % 2))? 1: 0;
       int i2 = p0.b() - p0.a();
       int i3 = - i;
       int i4 = i3;
       while (true) {
          if (i4 > i) {
             return null;
          }
          if (i4 != i3) {
             if (i4 != i) {
                i5 = i4 + 1;
                i6 = i4 - 1;
                if (uoc.b(i5) >= uoc.b(i6)) {
                }
             }else {
             }
          }
          i5 = i4 + 1;
          i5 = uoc.b(i5);
          i6 = i5;
       label_0047 :
          int i7 = oh.b - i6;
          i7 = i7 - i4;
          int i8 = oh.d - i7;
          i7 = (!i || i6 != i5)? i8: i8 + 1;
          while (true) {
             if (i6 > oh.a && i8 > oh.c) {
                int i9 = i6 - 1;
                int i10 = i8 - 1;
                if (p1.b(i9, i10)) {
                   i6 = i9;
                   i8 = i10;
                }else {
                label_0070 :
                   uoc.c(i4, i6);
                   if (i1) {
                      i9 = i2 - i4;
                      if (i9 >= i3 && i9 <= i) {
                         if (p2.b(i9) >= i6) {
                            break ;
                         }else {
                         label_0095 :
                            i4 = i4 + 2;
                         }
                      }
                   }
                   i10 = p2;
                   goto label_0095 ;
                }
             }else {
                int i11 = p1;
                goto label_0070 ;
             }
          }
          h$i oi = new h$i();
          oi.a = i6;
          oi.b = i8;
          oi.c = i5;
          oi.d = i7;
          oi.e = true;
          return oi;
       }
    }
    public static h$e b(h$b p0){
       return h.c(p0, true);
    }
    public static h$e c(h$b p0,boolean p1){
       h$h oh1;
       int i = p0.e();
       int i1 = p0.d();
       ArrayList uArrayList = new ArrayList();
       ArrayList uArrayList1 = new ArrayList();
       uArrayList1.add(new h$h(0, i, 0, i1));
       i = ((((i + i1) + 1) / 2) * 2) + 1;
       h$c uoc = new h$c(i);
       h$c uoc1 = new h$c(i);
       ArrayList uArrayList2 = new ArrayList();
       while (!uArrayList1.isEmpty()) {
          int i2 = uArrayList1.size() - 1;
          h$h oh = uArrayList1.remove(i2);
          h$i oi = h.e(oh, p0, uoc, uoc1);
          if (oi != null) {
             if (oi.a() > 0) {
                uArrayList.add(oi.d());
             }
             if (uArrayList2.isEmpty()) {
                oh1 = new h$h();
             }else {
                int i3 = uArrayList2.size() - 1;
                oh1 = uArrayList2.remove(i3);
             }
             oh1.a = oh.a;
             oh1.c = oh.c;
             oh1.b = oi.a;
             oh1.d = oi.b;
             uArrayList1.add(oh1);
             oh.b = oh.b;
             oh.d = oh.d;
             oh.a = oi.c;
             oh.c = oi.d;
             uArrayList1.add(oh);
          }else {
             uArrayList2.add(oh);
          }
       }
       Collections.sort(uArrayList, h.a);
       h$e uoe = new h$e(p0, uArrayList, uoc.a(), uoc1.a(), p1);
       return uArrayList2;
    }
    public static h$i d(h$h p0,h$b p1,h$c p2,h$c p3,int p4){
       int i4;
       int i5;
       int i6;
       int i7;
       int i = 1;
       if ((Math.abs((p0.b() - p0.a())) % 2) == i) {
       }else {
          i = 0;
       }
       int i1 = p0.b() - p0.a();
       int i2 = - p4;
       int i3 = i2;
       while (true) {
          if (i3 > p4) {
             return null;
          }
          if (i3 != i2) {
             if (i3 != p4) {
                i4 = i3 + 1;
                i5 = i3 - 1;
                if (p2.b(i4) <= p2.b(i5)) {
                }
             }else {
             }
          }
          i4 = i3 + 1;
          i4 = p2.b(i4);
          i5 = i4;
       label_0045 :
          i6 = i5 - p0.a;
          i7 = p0.c + i6;
          i7 = i7 - i3;
          i6 = (!p4 || i5 != i4)? i7: i7 - 1;
          while (i5 < p0.b && (i7 < p0.d && p1.b(i5, i7))) {
             i5 = i5 + 1;
             i7 = i7 + 1;
          }
          p2.c(i3, i5);
          if (i) {
             int i8 = i1 - i3;
             int i9 = i2 + 1;
             if (i8 >= i9) {
                i9 = p4 - 1;
                if (i8 <= i9 && p3.b(i8) <= i5) {
                }
             }
          }
          i3 = i3 + 2;
       }
       h$i oi = new h$i();
       oi.a = i4;
       oi.b = i6;
       oi.c = i5;
       oi.d = i7;
       oi.e = false;
       return oi;
    }
    public static h$i e(h$h p0,h$b p1,h$c p2,h$c p3){
       int i = 1;
       if (p0.b() >= i && p0.a() >= i) {
          int i1 = ((p0.b() + p0.a()) + i) / 2;
          p2.c(i, p0.a);
          p3.c(i, p0.b);
          i = 0;
          while (i < i1) {
             h$i oi = h.d(p0, p1, p2, p3, i);
             if (oi != null) {
                return oi;
             }else {
                oi = h.a(p0, p1, p2, p3, i);
                if (oi != null) {
                   return oi;
                }
             }
             i = i + 1;
          }
       }
       return null;
    }
}
