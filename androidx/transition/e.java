package androidx.transition.e;
import androidx.transition.AutoTransition;
import java.lang.ThreadLocal;
import java.util.ArrayList;
import java.lang.Object;
import androidx.collection.ArrayMap;
import android.view.ViewGroup;
import androidx.transition.Transition;
import android.view.View;
import a2.i0;
import e3.l;
import androidx.collection.SimpleArrayMap;
import java.util.Collection;
import java.lang.ref.WeakReference;
import androidx.transition.e$a;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Iterator;

public class e	// class@0009f6
{
    public ArrayMap a;
    public ArrayMap b;
    public static Transition c;
    public static ThreadLocal d;
    public static ArrayList e;

    static {
       e.c = new AutoTransition();
       e.d = new ThreadLocal();
       e.e = new ArrayList();
    }
    public void e(){
       super();
       this.a = new ArrayMap();
       this.b = new ArrayMap();
    }
    public static void a(ViewGroup p0){
       e.b(p0, null);
    }
    public static void b(ViewGroup p0,Transition p1){
       if (!e.e.contains(p0) && i0.Y(p0)) {
          e.e.add(p0);
          if (p1 == null) {
             p1 = e.c;
          }
          p1 = p1.m();
          e.h(p0, p1);
          l.g(p0, null);
          e.g(p0, p1);
       }
       return;
    }
    public static void c(l p0,Transition p1){
       ViewGroup viewGroup = p0.e();
       if (!e.e.contains(viewGroup)) {
          l ol = l.c(viewGroup);
          if (p1 == null) {
             if (ol != null) {
                ol.b();
             }
             p0.a();
          }else {
             e.e.add(viewGroup);
             p1 = p1.m();
             p1.f0(viewGroup);
             if (ol != null && ol.f()) {
                p1.Y(true);
             }
             e.h(viewGroup, p1);
             p0.a();
             e.g(viewGroup, p1);
          }
       }
       return;
    }
    public static void d(ViewGroup p0){
       e.e.remove(p0);
       ArrayList uArrayList = e.e().get(p0);
       if (uArrayList != null && !uArrayList.isEmpty()) {
          ArrayList uArrayList1 = new ArrayList(uArrayList);
          for (int i = uArrayList1.size() - 1; i >= 0; i = i - 1) {
             uArrayList1.get(i).q(p0);
          }
       }
       return;
    }
    public static ArrayMap e(){
       ArrayMap uArrayMap;
       WeakReference weakReferenc = e.d.get();
       if (weakReferenc != null) {
          uArrayMap = weakReferenc.get();
          if (uArrayMap != null) {
             return uArrayMap;
          }
       }
       uArrayMap = new ArrayMap();
       e.d.set(new WeakReference(uArrayMap));
       return uArrayMap;
    }
    public static void f(l p0,Transition p1){
       e.c(p0, p1);
    }
    public static void g(ViewGroup p0,Transition p1){
       if (p1 != null) {
          e$a uoa = new e$a(p1, p0);
          p0.addOnAttachStateChangeListener(uoa);
          p0.getViewTreeObserver().addOnPreDrawListener(uoa);
       }
       return;
    }
    public static void h(ViewGroup p0,Transition p1){
       ArrayList uArrayList = e.e().get(p0);
       if (uArrayList != null && uArrayList.size() > 0) {
          Iterator iterator = uArrayList.iterator();
          while (iterator.hasNext()) {
             iterator.next().R(p0);
          }
       }
       if (p1 != null) {
          p1.k(p0, true);
       }
       l ol = l.c(p0);
       if (ol != null) {
          ol.b();
       }
       return;
    }
}
