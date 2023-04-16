package com.loc.ct;
import java.lang.Object;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import com.loc.dy;
import java.lang.Integer;
import java.util.Collection;
import com.loc.dx;
import com.loc.dw;
import java.util.Iterator;
import java.lang.Long;
import com.loc.ct$1;
import java.util.Comparator;
import java.util.Collections;

public final class ct	// class@0013cc
{
    public List a;
    public dx b;
    public ArrayList c;

    public void ct(){
       super();
       this.a = new ArrayList();
       this.c = new ArrayList();
    }
    public static List a(List p0){
       ArrayList uArrayList = new ArrayList();
       HashMap hashMap = new HashMap();
       for (int i = 0; i < p0.size(); i = i + 1) {
          dy uody = p0.get(i);
          hashMap.put(Integer.valueOf(uody.c), uody);
       }
       uArrayList.addAll(hashMap.values());
       return uArrayList;
    }
    public static boolean a(dx p0,long p1,long p2){
       int i = (p0.g - 0x41200000 >= 0)? 2000: 3500;
       boolean b = false;
       if (p1 > 0 && (p2 - p1) - (long)i < 0) {
          b = true;
       }
       return b;
    }
    public static boolean a(List p0,List p1){
       if (p0 != null && p1 != null) {
          int i = p0.size();
          int i1 = p1.size();
          int i2 = i + i1;
          if (i <= i1) {
             p1 = p0;
             p0 = p1;
          }
          HashMap hashMap = new HashMap(p0.size());
          Iterator iterator = p0.iterator();
          int i3 = 1;
          while (iterator.hasNext()) {
             hashMap.put(Long.valueOf(iterator.next().a), Integer.valueOf(i3));
          }
          iterator = p1.iterator();
          int i4 = 0;
          while (iterator.hasNext()) {
             if (hashMap.get(Long.valueOf(iterator.next().a)) != null) {
                i4++;
             }
          }
          if (((double)i4 * 2.00f) - ((double)i2 * 0x3fe0000000000000) >= 0) {
             return i3;
          }
       }
    label_006f :
       return false;
    }
    public final List a(dx p0,List p1,boolean p2,long p3,long p4){
       if (!this.b(p0, p1, p2, p3, p4)) {
          return null;
       }
       this.b(this.c, p1);
       this.a.clear();
       this.a.addAll(p1);
       this.b = p0;
       return this.c;
    }
    public final boolean a(dx p0){
       dw g = p0.g;
       float f = 10.00f;
       if (g - f > 0) {
          f = 200.00f;
       }else if(g - -5949180130995625000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.00f > 0){
          f = 50.00f;
       }
       if (p0.a(this.b) - (double)f > 0) {
          return true;
       }else {
          return false;
       }
    }
    public final List b(List p0){
       Collections.sort(p0, new ct$1(this));
       return p0;
    }
    public final void b(List p0,List p1){
       p0.clear();
       if (p1 != null) {
          p1 = this.b(ct.a(p1));
          int i = p1.size();
          if (i > 40) {
             i = 40;
          }
          for (int i1 = 0; i1 < i; i1 = i1 + 1) {
             p0.add(p1.get(i1));
          }
       }
       return;
    }
    public final boolean b(dx p0,List p1,boolean p2,long p3,long p4){
       boolean b = false;
       if (!p2) {
          return b;
       }
       if (ct.a(p0, p3, p4) && (p1 != null && p1.size() > 0)) {
          if (this.b != null) {
             b = this.a(p0);
             if (!b) {
                b = ct.a(p1, this.a) ^ 0x01;
             }
          }else {
             b = true;
          }
       }
       return b;
    }
}
