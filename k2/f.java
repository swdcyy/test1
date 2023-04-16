package k2.f;
import java.lang.Object;
import java.util.List;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import java.lang.String;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.ArrayList;
import a2.k0;
import a2.i0;
import android.graphics.Rect;
import k2.f$c;
import java.lang.Runnable;
import a2.c0;
import k2.f$b;
import k2.f$a;

public abstract class f	// class@002463
{

    public void f(){
       super();
    }
    public static void d(List p0,View p1){
       int i = p0.size();
       if (f.h(p0, p1, i)) {
          return;
       }
       p0.add(p1);
       int i1 = i;
       while (i1 < p0.size()) {
          View view = p0.get(i1);
          if (view instanceof ViewGroup) {
             int childCount = view.getChildCount();
             int i2 = 0;
             while (i2 < childCount) {
                View childAt = view.getChildAt(i2);
                if (!f.h(p0, childAt, i)) {
                   p0.add(childAt);
                }
                i2 = i2 + 1;
             }
          }
          i1++;
       }
       return;
    }
    public static boolean h(List p0,View p1,int p2){
       int i = 0;
       while (true) {
          if (i >= p2) {
             return false;
          }
          if (p0.get(i) == p1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public static String i(Map p0,String p1){
       Map$Entry uEntry;
       Iterator iterator = p0.entrySet().iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return null;
          }
          uEntry = iterator.next();
          if (p1.equals(uEntry.getValue())) {
             break ;
          }
       }
       return uEntry.getKey();
    }
    public static boolean l(List p0){
       boolean b = (p0 == null || p0.isEmpty())? true: false;
       return b;
    }
    public abstract Object A(Object p0);
    public abstract void a(Object p0,View p1);
    public abstract void b(Object p0,ArrayList p1);
    public abstract void c(ViewGroup p0,Object p1);
    public abstract boolean e(Object p0);
    public void f(ArrayList p0,View p1){
       if (!p1.getVisibility()) {
          if (p1 instanceof ViewGroup) {
             if (k0.a(p1)) {
                p0.add(p1);
             }else {
                int childCount = p1.getChildCount();
                for (int i = 0; i < childCount; i = i + 1) {
                   this.f(p0, p1.getChildAt(i));
                }
             }
          }else {
             p0.add(p1);
          }
       }
       return;
    }
    public abstract Object g(Object p0);
    public void j(Map p0,View p1){
       if (!p1.getVisibility()) {
          String str = i0.L(p1);
          if (str != null) {
             p0.put(str, p1);
          }
          if (p1 instanceof ViewGroup) {
             int childCount = p1.getChildCount();
             for (int i = 0; i < childCount; i = i + 1) {
                this.j(p0, p1.getChildAt(i));
             }
          }
       }
       return;
    }
    public void k(View p0,Rect p1){
       int[] ointArray = new int[2];
       p0.getLocationOnScreen(ointArray);
       p1.set(ointArray[0], ointArray[1], (ointArray[0] + p0.getWidth()), (ointArray[1] + p0.getHeight()));
    }
    public abstract Object m(Object p0,Object p1,Object p2);
    public abstract Object n(Object p0,Object p1,Object p2);
    public ArrayList o(ArrayList p0){
       ArrayList uArrayList = new ArrayList();
       int i = p0.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          View view = p0.get(i1);
          uArrayList.add(i0.L(view));
          i0.N0(view, null);
       }
       return uArrayList;
    }
    public abstract void p(Object p0,View p1);
    public abstract void q(Object p0,ArrayList p1,ArrayList p2);
    public abstract void r(Object p0,View p1,ArrayList p2);
    public void s(ViewGroup p0,ArrayList p1,Map p2){
       c0.a(p0, new f$c(this, p1, p2));
    }
    public abstract void t(Object p0,Object p1,ArrayList p2,Object p3,ArrayList p4,Object p5,ArrayList p6);
    public abstract void u(Object p0,Rect p1);
    public abstract void v(Object p0,View p1);
    public void w(View p0,ArrayList p1,Map p2){
       c0.a(p0, new f$b(this, p1, p2));
    }
    public void x(View p0,ArrayList p1,ArrayList p2,ArrayList p3,Map p4){
       int i = p2.size();
       ArrayList uArrayList = new ArrayList();
       int i1 = 0;
       while (i1 < i) {
          View view = p1.get(i1);
          String str = i0.L(view);
          uArrayList.add(str);
          if (str != null) {
             i0.N0(view, null);
             String str1 = p4.get(str);
             int i2 = 0;
             while (i2 < i) {
                if (str1.equals(p3.get(i2))) {
                   i0.N0(p2.get(i2), str);
                   break ;
                }
                i2 = i2 + 1;
             }
          }
          i1 = i1 + 1;
       }
       f$a uoa = new f$a(this, i, p2, p3, p1, uArrayList);
       c0.a(p0, p4);
       return;
    }
    public abstract void y(Object p0,View p1,ArrayList p2);
    public abstract void z(Object p0,ArrayList p1,ArrayList p2);
}
