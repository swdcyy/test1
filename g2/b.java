package g2.b;
import android.graphics.Rect;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;
import g2.b$b;
import g2.b$a;
import java.util.ArrayList;
import g2.b$c;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.lang.Math;

public class b	// class@002039
{

    public static boolean a(int p0,Rect p1,Rect p2,Rect p3){
       boolean b = b.b(p0, p1, p2);
       boolean b1 = false;
       if (b.b(p0, p1, p3) || !b) {
          return b1;
       }
       if (!b.j(p0, p1, p3)) {
          return true;
       }
       if (p0 == 17 || p0 == 66) {
          return true;
       }
       if (b.k(p0, p1, p2) < b.m(p0, p1, p3)) {
          b1 = true;
       }
       return b1;
    }
    public static boolean b(int p0,Rect p1,Rect p2){
       boolean b = true;
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 != 130) {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }
          }
          if (p2.right < p1.left || p2.left > p1.right) {
             b = false;
          }
          return b;
       }
       if (p2.bottom < p1.top || p2.top > p1.bottom) {
          b = false;
       }
       return b;
    }
    public static Object c(Object p0,b$b p1,b$a p2,Object p3,Rect p4,int p5){
       Rect rect = new Rect(p4);
       int i = 0;
       if (p5 != 17) {
          if (p5 != 33) {
             if (p5 != 66) {
                if (p5 == 130) {
                   rect.offset(i, (- (p4.height() + 1)));
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else {
                rect.offset((- (p4.width() + 1)), i);
             }
          }else {
             rect.offset(i, (p4.height() + 1));
          }
       }else {
          rect.offset((p4.width() + 1), i);
       }
       Object obj = null;
       int i1 = p1.a(p0);
       Rect rect1 = new Rect();
       while (i < i1) {
          Object obj1 = p1.b(p0, i);
          if (obj1 != p3) {
             p2.a(obj1, rect1);
             if (b.h(p5, p4, rect1, rect)) {
                rect.set(rect1);
                obj = obj1;
             }
          }
          i = i + 1;
       }
       return obj;
    }
    public static Object d(Object p0,b$b p1,b$a p2,Object p3,int p4,boolean p5,boolean p6){
       int i = p1.a(p0);
       ArrayList uArrayList = new ArrayList(i);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          uArrayList.add(p1.b(p0, i1));
       }
       Collections.sort(uArrayList, new b$c(p5, p2));
       if (p4 == 1) {
          return b.f(p3, uArrayList, p6);
       }
       if (p4 == 2) {
          return b.e(p3, uArrayList, p6);
       }
       throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }
    public static Object e(Object p0,ArrayList p1,boolean p2){
       int i = p1.size();
       int i1 = (p0 == null)? -1: p1.lastIndexOf(p0);
       i1++;
       if (i1 < i) {
          return p1.get(i1);
       }else if(p2 && i > 0){
          return p1.get(0);
       }else {
          return null;
       }
    }
    public static Object f(Object p0,ArrayList p1,boolean p2){
       int i = p1.size();
       int i1 = (p0 == null)? i: p1.indexOf(p0);
       i1--;
       if (i1 >= 0) {
          return p1.get(i1);
       }else if(p2 && i > 0){
          return p1.get((i - 1));
       }else {
          return null;
       }
    }
    public static int g(int p0,int p1){
       return (((p0 * 13) * p0) + (p1 * p1));
    }
    public static boolean h(int p0,Rect p1,Rect p2,Rect p3){
       boolean b = false;
       if (!b.i(p1, p2, p0)) {
          return b;
       }
       if (!b.i(p1, p3, p0)) {
          return true;
       }
       if (b.a(p0, p1, p2, p3)) {
          return true;
       }
       if (b.a(p0, p1, p3, p2)) {
          return b;
       }
       if (b.g(b.k(p0, p1, p2), b.o(p0, p1, p2)) < b.g(b.k(p0, p1, p3), b.o(p0, p1, p3))) {
          b = true;
       }
       return b;
    }
    public static boolean i(Rect p0,Rect p1,int p2){
       Rect top;
       boolean b = true;
       if (p2 != 17) {
          if (p2 != 33) {
             if (p2 != 66) {
                if (p2 == 130) {
                   top = p1.top;
                   if (p0.top >= top && (p0.bottom > top || p0.bottom >= p1.bottom)) {
                      b = false;
                   }
                   return b;
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else {
                top = p1.left;
                if (p0.left >= top && (p0.right > top || p0.right >= p1.right)) {
                   b = false;
                }
                return b;
             }
          }else {
             top = p1.bottom;
             if (p0.bottom <= top && (p0.top < top || p0.top <= p1.top)) {
                b = false;
             }
             return b;
          }
       }else {
          top = p1.right;
          if (p0.right <= top && (p0.left < top || p0.left <= p1.left)) {
             b = false;
          }
          return b;
       }
    }
    public static boolean j(int p0,Rect p1,Rect p2){
       boolean b = false;
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 == 130) {
                   if (p1.bottom <= p2.top) {
                      b = true;
                   }
                   return b;
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else if(p1.right <= p2.left){
                b = true;
             }
             return b;
          }else if(p1.top >= p2.bottom){
             b = true;
          }
          return b;
       }else if(p1.left >= p2.right){
          b = true;
       }
       return b;
    }
    public static int k(int p0,Rect p1,Rect p2){
       return Math.max(0, b.l(p0, p1, p2));
    }
    public static int l(int p0,Rect p1,Rect p2){
       Rect top;
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 == 130) {
                   top = p2.top;
                   p1 = p1.bottom;
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else {
                top = p2.left;
                p1 = p1.right;
             }
          }else {
             top = p1.top;
             p1 = p2.bottom;
          }
       }else {
          top = p1.left;
          p1 = p2.right;
       }
       return (top - p1);
    }
    public static int m(int p0,Rect p1,Rect p2){
       return Math.max(1, b.n(p0, p1, p2));
    }
    public static int n(int p0,Rect p1,Rect p2){
       Rect bottom;
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 == 130) {
                   bottom = p2.bottom;
                   p1 = p1.bottom;
                }else {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }else {
                bottom = p2.right;
                p1 = p1.right;
             }
          }else {
             bottom = p1.top;
             p1 = p2.top;
          }
       }else {
          bottom = p1.left;
          p1 = p2.left;
       }
       return (bottom - p1);
    }
    public static int o(int p0,Rect p1,Rect p2){
       if (p0 != 17) {
          if (p0 != 33) {
             if (p0 != 66) {
                if (p0 != 130) {
                   throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
             }
          }
          return Math.abs(((p1.left + (p1.width() / 2)) - (p2.left + (p2.width() / 2))));
       }
       return Math.abs(((p1.top + (p1.height() / 2)) - (p2.top + (p2.height() / 2))));
    }
}
