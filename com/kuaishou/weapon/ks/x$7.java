package com.kuaishou.weapon.ks.x$7;
import java.util.Comparator;
import com.kuaishou.weapon.ks.x;
import java.util.List;
import java.lang.Object;
import com.kuaishou.weapon.ks.aa;
import java.lang.Integer;

public class x$7 implements Comparator	// class@001237
{
    public final List a;
    public final x b;

    public void x$7(x p0,List p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public int a(aa p0,aa p1){
       aa y = p0.y;
       if (y == -1 && p1.y != -1) {
          return 1;
       }
       if (y != -1 && p1.y == -1) {
          return -1;
       }
       aa y1 = p1.y;
       if (y < y1) {
          return -1;
       }
       if (y > y1) {
          return 1;
       }
       x$7 ta = this.a;
       int i = (ta != null && ta.contains(Integer.valueOf(p0.a)))? this.a.indexOf(Integer.valueOf(p0.a)): -1;
       ta = this.a;
       int i1 = (ta != null && ta.contains(Integer.valueOf(p1.a)))? this.a.indexOf(Integer.valueOf(p1.a)): -1;
       if (i != -1 && i1 == -1) {
          return -1;
       }else if(i == -1 && i1 != -1){
          return 1;
       }else if(i > i1){
          return 1;
       }else if(i < i1){
          return -1;
       }else {
          return 0;
       }
    }
    public int compare(Object p0,Object p1){
       return this.a(p0, p1);
    }
}
