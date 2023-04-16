package androidx.transition.Transition;
import java.lang.Cloneable;
import androidx.transition.Transition$a;
import java.lang.ThreadLocal;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.ArrayList;
import e3.p;
import android.content.Context;
import android.util.AttributeSet;
import androidx.transition.c;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;
import o1.g;
import android.view.animation.Interpolator;
import android.view.animation.AnimationUtils;
import android.animation.TimeInterpolator;
import e3.o;
import java.util.Map;
import java.util.StringTokenizer;
import java.lang.System;
import android.view.InflateException;
import java.lang.StringBuilder;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import android.util.SparseArray;
import a2.i0;
import android.view.ViewParent;
import android.widget.ListView;
import android.widget.ListAdapter;
import androidx.collection.LongSparseArray;
import androidx.collection.ArrayMap;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
import java.lang.Integer;
import e3.d0;
import e3.w;
import androidx.transition.Transition$d;
import android.animation.Animator;
import androidx.transition.a;
import androidx.transition.Transition$f;
import android.view.ViewGroup;
import androidx.transition.Transition$b;
import android.animation.Animator$AnimatorListener;
import androidx.transition.Transition$e;
import java.lang.IllegalArgumentException;
import androidx.transition.PathMotion;
import e3.n;
import androidx.transition.Transition$c;
import android.util.SparseIntArray;
import java.lang.Math;
import android.graphics.Rect;

public abstract class Transition implements Cloneable	// class@0009d6
{
    public boolean A;
    public boolean B;
    public ArrayList C;
    public ArrayList D;
    public n E;
    public Transition$e F;
    public ArrayMap G;
    public PathMotion H;
    public String b;
    public long c;
    public long d;
    public TimeInterpolator e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public ArrayList i;
    public ArrayList j;
    public ArrayList k;
    public ArrayList l;
    public ArrayList m;
    public ArrayList n;
    public ArrayList o;
    public ArrayList p;
    public p q;
    public p r;
    public TransitionSet s;
    public int[] t;
    public ArrayList u;
    public ArrayList v;
    public ViewGroup w;
    public boolean x;
    public ArrayList y;
    public int z;
    public static final int[] I;
    public static final PathMotion J;
    public static ThreadLocal K;

    static {
       Transition.I = new int[4]{2,1,3,4};
       Transition.J = new Transition$a();
       Transition.K = new ThreadLocal();
    }
    public void Transition(){
       super();
       this.b = this.getClass().getName();
       this.c = -1;
       this.d = -1;
       this.e = null;
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = null;
       this.i = null;
       this.j = null;
       this.k = null;
       this.l = null;
       this.m = null;
       this.n = null;
       this.o = null;
       this.p = null;
       this.q = new p();
       this.r = new p();
       this.s = null;
       this.t = Transition.I;
       this.w = null;
       this.x = false;
       this.y = new ArrayList();
       this.z = 0;
       this.A = false;
       this.B = false;
       this.C = null;
       this.D = new ArrayList();
       this.H = Transition.J;
    }
    public void Transition(Context p0,AttributeSet p1){
       super();
       this.b = this.getClass().getName();
       this.c = -1;
       this.d = -1;
       this.e = null;
       this.f = new ArrayList();
       this.g = new ArrayList();
       this.h = null;
       this.i = null;
       this.j = null;
       this.k = null;
       this.l = null;
       this.m = null;
       this.n = null;
       this.o = null;
       this.p = null;
       this.q = new p();
       this.r = new p();
       this.s = null;
       this.t = Transition.I;
       this.w = null;
       int b = false;
       this.x = b;
       this.y = new ArrayList();
       this.z = b;
       this.A = b;
       this.B = b;
       this.C = null;
       this.D = new ArrayList();
       this.H = Transition.J;
       XmlResourceParser xmlResourceP = p0.obtainStyledAttributes(p1, c.c);
       int i = -1;
       long l = (long)g.g(xmlResourceP, p1, "duration", 1, i);
       if (l >= 0) {
          this.Z(l);
       }
       l = (long)g.g(xmlResourceP, p1, "startDelay", 2, i);
       if (l > 0) {
          this.g0(l);
       }
       b = g.h(xmlResourceP, p1, "interpolator", b, b);
       if (b > 0) {
          this.b0(AnimationUtils.loadInterpolator(p0, b));
       }
       String str = g.i(xmlResourceP, p1, "matchOrder", 3);
       if (str != null) {
          this.c0(Transition.Q(str));
       }
       xmlResourceP.recycle();
       return;
    }
    public static boolean I(int p0){
       int i = 1;
       if (p0 < i || p0 > 4) {
          i = false;
       }
       return i;
    }
    public static boolean K(o p0,o p1,String p2){
       p0 = p0.a.get(p2);
       p1 = p1.a.get(p2);
       boolean b = true;
       if (p0 == null && p1 == null) {
          b = false;
       }else if(p0 == null || p1 == null){
          b = b ^ p0.equals(p1);
       }
       return b;
    }
    public static int[] Q(String p0){
       String str;
       StringTokenizer stringTokeni = new StringTokenizer(p0, ",");
       int[] ointArray = new int[stringTokeni.countTokens()];
       int i = 0;
       int i1 = 0;
       while (true) {
          if (!stringTokeni.hasMoreTokens()) {
             return ointArray;
          }
          str = (stringTokeni.nextToken()).trim();
          if (("id").equalsIgnoreCase(str)) {
             ointArray[i1] = 3;
          }else if(("instance").equalsIgnoreCase(str)){
             ointArray[i1] = 1;
          }else if(("name").equalsIgnoreCase(str)){
             ointArray[i1] = 2;
          }else if(("itemId").equalsIgnoreCase(str)){
             ointArray[i1] = 4;
          }else if(str.isEmpty()){
             int i2 = ointArray.length - 1;
             int[] ointArray1 = new int[i2];
             System.arraycopy(ointArray, i, ointArray1, i, i1);
             i1 = i1 - 1;
             ointArray = ointArray1;
          }else {
             break ;
          }
          i1 = i1 + 1;
       }
       throw new InflateException("Unknown match type in matchOrder: \'"+str+"\'");
    }
    public static void d(p p0,View p1,o p2){
       p0.a.put(p1, p2);
       int id = p1.getId();
       if (id >= 0) {
          if (p0.b.indexOfKey(id) >= 0) {
             p0.b.put(id, null);
          }else {
             p0.b.put(id, p1);
          }
       }
       String str = i0.L(p1);
       if (str != null) {
          if (p0.d.containsKey(str)) {
             p0.d.put(str, null);
          }else {
             p0.d.put(str, p1);
          }
       }
       if (p1.getParent() instanceof ListView) {
          ListView parent = p1.getParent();
          if (parent.getAdapter().hasStableIds()) {
             long itemIdAtPosi = parent.getItemIdAtPosition(parent.getPositionForView(p1));
             if (p0.c.indexOfKey(itemIdAtPosi) >= 0) {
                p1 = p0.c.get(itemIdAtPosi);
                if (p1 != null) {
                   i0.C0(p1, false);
                   p0.c.put(itemIdAtPosi, null);
                }
             }else {
                i0.C0(p1, true);
                p0.c.put(itemIdAtPosi, p1);
             }
          }
       }
       return;
    }
    public static boolean e(int[] p0,int p1){
       int i = p0[p1];
       int i1 = 0;
       while (true) {
          if (i1 >= p1) {
             return false;
          }
          if (p0[i1] == i) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return true;
    }
    public static ArrayMap z(){
       ArrayMap uArrayMap = Transition.K.get();
       if (uArrayMap == null) {
          uArrayMap = new ArrayMap();
          Transition.K.set(uArrayMap);
       }
       return uArrayMap;
    }
    public long A(){
       return this.c;
    }
    public List B(){
       return this.f;
    }
    public List C(){
       return this.h;
    }
    public List D(){
       return this.i;
    }
    public List E(){
       return this.g;
    }
    public String[] F(){
       return null;
    }
    public o G(View p0,boolean p1){
       Transition ts = this.s;
       if (ts != null) {
          return ts.G(p0, p1);
       }
       Transition tq = (p1)? this.q: this.r;
       return tq.a.get(p0);
    }
    public boolean H(o p0,o p1){
       boolean b = false;
       if (p0 != null && p1 != null) {
          String[] stringArray = this.F();
          if (stringArray != null) {
             int len = stringArray.length;
             int i = 0;
             while (i < len) {
                if (!Transition.K(p0, p1, stringArray[i])) {
                   i = i + 1;
                }
             }
          }else {
             Iterator iterator = p0.a.keySet().iterator();
             while (iterator.hasNext()) {
                if (!Transition.K(p0, p1, iterator.next())) {
                }
             }
          }
          b = true;
       }
       return b;
    }
    public boolean J(View p0){
       int id = p0.getId();
       Transition tj = this.j;
       if (tj != null && tj.contains(Integer.valueOf(id))) {
          return false;
       }
       tj = this.k;
       if (tj != null && tj.contains(p0)) {
          return false;
       }
       tj = this.l;
       if (tj != null) {
          int i = tj.size();
          int i1 = 0;
          while (true) {
             if (i1 < i) {
                if (this.l.get(i1).isInstance(p0)) {
                   return false;
                }else {
                   i1 = i1 + 1;
                }
             }
          }
       }
       if (this.m != null && (i0.L(p0) != null && this.m.contains(i0.L(p0)))) {
          return false;
       }else if(!this.f.size() && !this.g.size()){
          tj = this.i;
          if (tj == null || tj.isEmpty()) {
             tj = this.h;
             if (tj == null || tj.isEmpty()) {
                return true;
             }
          }
       }
       if (this.f.contains(Integer.valueOf(id)) || this.g.contains(p0)) {
          return true;
       }else {
          Transition th = this.h;
          if (th != null && th.contains(i0.L(p0))) {
             return true;
          }else if(this.i != null){
             id = 0;
             while (id < this.i.size()) {
                if (this.i.get(id).isInstance(p0)) {
                   return true;
                }
                id = id + 1;
             }
          }
          return false;
       }
    }
    public final void L(ArrayMap p0,ArrayMap p1,SparseArray p2,SparseArray p3){
       int i = p2.size();
       int i1 = 0;
       while (i1 < i) {
          View view = p2.valueAt(i1);
          if (view != null && this.J(view)) {
             View view1 = p3.get(p2.keyAt(i1));
             if (view1 != null && this.J(view1)) {
                o oo = p0.get(view);
                o oo1 = p1.get(view1);
                if (oo != null && oo1 != null) {
                   this.u.add(oo);
                   this.v.add(oo1);
                   p0.remove(view);
                   p1.remove(view1);
                }
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void M(ArrayMap p0,ArrayMap p1){
       int i = p0.size();
       i = i - 1;
       while (i >= 0) {
          View view = p0.keyAt(i);
          if (view != null && this.J(view)) {
             o oo = p1.remove(view);
             if (oo != null && this.J(oo.b)) {
                this.u.add(p0.removeAt(i));
                this.v.add(oo);
             }
          }
       }
       return;
    }
    public final void N(ArrayMap p0,ArrayMap p1,LongSparseArray p2,LongSparseArray p3){
       int i = p2.size();
       int i1 = 0;
       while (i1 < i) {
          View view = p2.valueAt(i1);
          if (view != null && this.J(view)) {
             View view1 = p3.get(p2.keyAt(i1));
             if (view1 != null && this.J(view1)) {
                o oo = p0.get(view);
                o oo1 = p1.get(view1);
                if (oo != null && oo1 != null) {
                   this.u.add(oo);
                   this.v.add(oo1);
                   p0.remove(view);
                   p1.remove(view1);
                }
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void O(ArrayMap p0,ArrayMap p1,ArrayMap p2,ArrayMap p3){
       int i = p2.size();
       int i1 = 0;
       while (i1 < i) {
          View view = p2.valueAt(i1);
          if (view != null && this.J(view)) {
             View view1 = p3.get(p2.keyAt(i1));
             if (view1 != null && this.J(view1)) {
                o oo = p0.get(view);
                o oo1 = p1.get(view1);
                if (oo != null && oo1 != null) {
                   this.u.add(oo);
                   this.v.add(oo1);
                   p0.remove(view);
                   p1.remove(view1);
                }
             }
          }
          i1 = i1 + 1;
       }
       return;
    }
    public final void P(p p0,p p1){
       ArrayMap uArrayMap = new ArrayMap(p0.a);
       ArrayMap uArrayMap1 = new ArrayMap(p1.a);
       int i = 0;
       Transition tt = this.t;
       while (i < tt.length) {
          int i1 = tt[i];
          if (i1 != 1) {
             if (i1 != 2) {
                if (i1 != 3) {
                   if (i1 == 4) {
                      this.N(uArrayMap, uArrayMap1, p0.c, p1.c);
                   }
                }else {
                   this.L(uArrayMap, uArrayMap1, p0.b, p1.b);
                }
             }else {
                this.O(uArrayMap, uArrayMap1, p0.d, p1.d);
             }
          }else {
             this.M(uArrayMap, uArrayMap1);
          }
          i = i + 1;
       }
       this.c(uArrayMap, uArrayMap1);
       return;
    }
    public void R(View p0){
       if (this.B == null) {
          ArrayMap uArrayMap = Transition.z();
          d0 uod0 = w.e(p0);
          int i = uArrayMap.size() - 1;
          while (i >= 0) {
             Transition$d uod = uArrayMap.valueAt(i);
             if (uod.a != null && uod0.equals(uod.d)) {
                a.b(uArrayMap.keyAt(i));
             }
             i = i - 1;
          }
          Transition tC = this.C;
          if (tC != null && tC.size() > 0) {
             ArrayList uArrayList = this.C.clone();
             int i1 = uArrayList.size();
             for (i = 0; i < i1; i = i + 1) {
                uArrayList.get(i).e(this);
             }
          }
          this.A = true;
       }
       return;
    }
    public void S(ViewGroup p0){
       this.u = new ArrayList();
       this.v = new ArrayList();
       this.P(this.q, this.r);
       ArrayMap uArrayMap = Transition.z();
       d0 uod0 = w.e(p0);
       int i = uArrayMap.size() - 1;
       while (i >= 0) {
          Animator uAnimator = uArrayMap.keyAt(i);
          if (uAnimator != null) {
             Transition$d uod = uArrayMap.get(uAnimator);
             if (uod != null && (uod.a != null && uod0.equals(uod.d))) {
                Transition$d c = uod.c;
                Transition$d a = uod.a;
                o oo = this.G(a, 1);
                o oo1 = this.v(a, 1);
                if (oo == null && oo1 == null) {
                   oo1 = this.r.a.get(a);
                }
                boolean b = (oo != null || (oo1 != null && uod.e.H(c, oo1)))? true: false;
                if (b) {
                   if (uAnimator.isRunning() || uAnimator.isStarted()) {
                      uAnimator.cancel();
                   }else {
                      uArrayMap.remove(uAnimator);
                   }
                }
             }
          }
       label_0081 :
          i = i - 1;
       }
       this.o(p0, this.q, this.r, this.u, this.v);
       this.X();
       return;
    }
    public Transition T(Transition$f p0){
       Transition tC = this.C;
       if (tC == null) {
          return this;
       }
       tC.remove(p0);
       if (!this.C.size()) {
          this.C = null;
       }
       return this;
    }
    public Transition U(View p0){
       this.g.remove(p0);
       return this;
    }
    public void V(View p0){
       if (this.A != null) {
          if (this.B == null) {
             ArrayMap uArrayMap = Transition.z();
             d0 uod0 = w.e(p0);
             int i = uArrayMap.size() - 1;
             while (i >= 0) {
                Transition$d uod = uArrayMap.valueAt(i);
                if (uod.a != null && uod0.equals(uod.d)) {
                   a.c(uArrayMap.keyAt(i));
                }
                i = i - 1;
             }
             Transition tC = this.C;
             if (tC != null && tC.size() > 0) {
                ArrayList uArrayList = this.C.clone();
                int i1 = uArrayList.size();
                for (i = 0; i < i1; i = i + 1) {
                   uArrayList.get(i).d(this);
                }
             }
          }
          this.A = false;
       }
       return;
    }
    public final void W(Animator p0,ArrayMap p1){
       if (p0 != null) {
          p0.addListener(new Transition$b(this, p1));
          this.f(p0);
       }
       return;
    }
    public void X(){
       this.h0();
       ArrayMap uArrayMap = Transition.z();
       Iterator iterator = this.D.iterator();
       while (iterator.hasNext()) {
          Animator uAnimator = iterator.next();
          if (uArrayMap.containsKey(uAnimator)) {
             this.h0();
             this.W(uAnimator, uArrayMap);
          }
       }
       this.D.clear();
       this.p();
       return;
    }
    public void Y(boolean p0){
       this.x = p0;
    }
    public Transition Z(long p0){
       this.d = p0;
       return this;
    }
    public Transition a(Transition$f p0){
       if (this.C == null) {
          this.C = new ArrayList();
       }
       this.C.add(p0);
       return this;
    }
    public void a0(Transition$e p0){
       this.F = p0;
    }
    public Transition b(View p0){
       this.g.add(p0);
       return this;
    }
    public Transition b0(TimeInterpolator p0){
       this.e = p0;
       return this;
    }
    public final void c(ArrayMap p0,ArrayMap p1){
       int i = 0;
       int i1 = 0;
       while (i1 < p0.size()) {
          o oo = p0.valueAt(i1);
          if (this.J(oo.b)) {
             this.u.add(oo);
             this.v.add(null);
          }
          i1 = i1 + 1;
       }
       while (i < p1.size()) {
          o oo1 = p1.valueAt(i);
          if (this.J(oo1.b)) {
             this.v.add(oo1);
             this.u.add(null);
          }
          i = i + 1;
       }
       return;
    }
    public void c0(int[] p0){
       if (!p0.length) {
          this.t = Transition.I;
       }else {
          int i = 0;
          while (true) {
             if (i < p0.length) {
                if (Transition.I(p0[i])) {
                   if (!Transition.e(p0, i)) {
                      i = i + 1;
                   }else {
                      throw new IllegalArgumentException("matches contains a duplicate value");
                   }
                }else {
                   throw new IllegalArgumentException("matches contains invalid value");
                }
             }else {
                this.t = p0.clone();
                break ;
             }
          }
       }
       return;
    }
    public void cancel(){
       for (int i = this.y.size() - 1; i >= 0; i = i - 1) {
          this.y.get(i).cancel();
       }
       Transition tC = this.C;
       if (tC != null && tC.size() > 0) {
          ArrayList uArrayList = this.C.clone();
          int i1 = uArrayList.size();
          for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
             uArrayList.get(i2).c(this);
          }
       }
       return;
    }
    public Object clone(){
       return this.m();
    }
    public void d0(PathMotion p0){
       this.H = (p0 == null)? Transition.J: p0;
       return;
    }
    public void e0(n p0){
       this.E = p0;
    }
    public void f(Animator p0){
       long l = 0;
       if (this.r() - l >= 0) {
          p0.setDuration(this.r());
       }
       if (this.A() - l >= 0) {
          p0.setStartDelay((this.A() + p0.getStartDelay()));
       }
       if (this.u() != null) {
          p0.setInterpolator(this.u());
       }
       p0.addListener(new Transition$c(this));
       p0.start();
       return;
    }
    public Transition f0(ViewGroup p0){
       this.w = p0;
       return this;
    }
    public abstract void g(o p0);
    public Transition g0(long p0){
       this.c = p0;
       return this;
    }
    public final void h(View p0,boolean p1){
       int i1;
       if (p0 == null) {
          return;
       }
       int id = p0.getId();
       Transition tj = this.j;
       if (tj != null && tj.contains(Integer.valueOf(id))) {
          return;
       }
       tj = this.k;
       if (tj != null && tj.contains(p0)) {
          return;
       }
       tj = this.l;
       int i = 0;
       if (tj != null) {
          i1 = tj.size();
          int i2 = 0;
          while (true) {
             if (i2 < i1) {
                if (this.l.get(i2).isInstance(p0)) {
                   return;
                }else {
                   i2 = i2 + 1;
                }
             }
          }
       }
       if (p0.getParent() instanceof ViewGroup) {
          o oo = new o(p0);
          if (p1) {
             this.j(oo);
          }else {
             this.g(oo);
          }
          oo.c.add(this);
          this.i(oo);
          if (p1) {
             Transition.d(this.q, p0, oo);
          }else {
             Transition.d(this.r, p0, oo);
          }
       }
       if (p0 instanceof ViewGroup) {
          tj = this.n;
          if (tj != null && tj.contains(Integer.valueOf(id))) {
             return;
          }else {
             Transition to = this.o;
             if (to != null && to.contains(p0)) {
                return;
             }else {
                to = this.p;
                if (to != null) {
                   id = to.size();
                   i1 = 0;
                   while (true) {
                      if (i1 < id) {
                         if (this.p.get(i1).isInstance(p0)) {
                            return;
                         }else {
                            i1 = i1 + 1;
                         }
                      }
                   }
                }
                for (; i < p0.getChildCount(); i = i + 1) {
                   this.h(p0.getChildAt(i), p1);
                }
             }
          }
       }
       return;
    }
    public void h0(){
       if (this.z == null) {
          Transition tC = this.C;
          if (tC != null && tC.size() > 0) {
             ArrayList uArrayList = this.C.clone();
             int i = uArrayList.size();
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                uArrayList.get(i1).a(this);
             }
          }
          this.B = false;
       }
       this.z = this.z + 1;
       return;
    }
    public void i(o p0){
       if (this.E != null && !p0.a.isEmpty()) {
          String[] stringArray = this.E.b();
          if (stringArray == null) {
             return;
          }else {
             int i = 0;
             int i1 = 0;
             while (true) {
                if (i1 < stringArray.length) {
                   if (!p0.a.containsKey(stringArray[i1])) {
                   label_0029 :
                      if (!i) {
                         this.E.a(p0);
                         break ;
                      }
                   }else {
                      i1 = i1 + 1;
                   }
                }else {
                   i = 1;
                   goto label_0029 ;
                }
             }
          }
       }
       return;
    }
    public String i0(String p0){
       p0 = p0+this.getClass().getSimpleName()+"@"+Integer.toHexString(this.hashCode())+": ";
       int i = -1;
       if (this.d - i) {
          p0 = p0+"dur\("+this.d+"\) ";
       }
       if (this.c - i) {
          p0 = p0+"dly\("+this.c+"\) ";
       }
       if (this.e != null) {
          p0 = p0+"interp\("+this.e+"\) ";
       }
       if (this.f.size() > 0 || this.g.size() > 0) {
          p0 = p0+"tgts\(";
          i = 0;
          if (this.f.size() > 0) {
             for (int i1 = 0; i1 < this.f.size(); i1 = i1 + 1) {
                if (i1 > 0) {
                   p0 = p0+", ";
                }
                p0 = p0+this.f.get(i1);
             }
          }
          if (this.g.size() > 0) {
             for (; i < this.g.size(); i = i + 1) {
                if (i > 0) {
                   p0 = p0+", ";
                }
                p0 = p0+this.g.get(i);
             }
          }
          p0 = p0+"\)";
       }
       return p0;
    }
    public abstract void j(o p0);
    public void k(ViewGroup p0,boolean p1){
       View view1;
       this.l(p1);
       int i = 0;
       if (this.f.size() > 0 || this.g.size() > 0) {
          Transition th = this.h;
          if (th == null || th.isEmpty()) {
             th = this.i;
             if (th == null || th.isEmpty()) {
                int i1 = 0;
                while (i1 < this.f.size()) {
                   View view = p0.findViewById(this.f.get(i1).intValue());
                   if (view != null) {
                      o oo = new o(view);
                      if (p1) {
                         this.j(oo);
                      }else {
                         this.g(oo);
                      }
                      oo.c.add(this);
                      this.i(oo);
                      if (p1) {
                         Transition.d(this.q, view, oo);
                      }else {
                         Transition.d(this.r, view, oo);
                      }
                   }
                   i1 = i1 + 1;
                }
                int i2 = 0;
                while (i2 < this.g.size()) {
                   view1 = this.g.get(i2);
                   o oo1 = new o(view1);
                   if (p1) {
                      this.j(oo1);
                   }else {
                      this.g(oo1);
                   }
                   oo1.c.add(this);
                   this.i(oo1);
                   if (p1) {
                      Transition.d(this.q, view1, oo1);
                   }else {
                      Transition.d(this.r, view1, oo1);
                   }
                   i2++;
                }
                if (!p1) {
                   Transition tG = this.G;
                   if (tG != null) {
                      i2 = tG.size();
                      ArrayList uArrayList = new ArrayList(i2);
                      for (i1 = 0; i1 < i2; i1 = i1 + 1) {
                         uArrayList.add(this.q.d.remove(this.G.keyAt(i1)));
                      }
                      while (i < i2) {
                         view1 = uArrayList.get(i);
                         if (view1 != null) {
                            this.q.d.put(this.G.valueAt(i), view1);
                         }
                         i = i + 1;
                      }
                   }
                }
                return;
             }
          }
       }
       this.h(p0, p1);
       goto label_00a6 ;
    }
    public void l(boolean p0){
       if (p0) {
          this.q.a.clear();
          this.q.b.clear();
          this.q.c.clear();
       }else {
          this.r.a.clear();
          this.r.b.clear();
          this.r.c.clear();
       }
       return;
    }
    public Transition m(){
       ArrayList uArrayList = null;
       try{
          Transition transition = super.clone();
          transition.D = new ArrayList();
          transition.q = new p();
          transition.r = new p();
          transition.u = uArrayList;
          transition.v = uArrayList;
          return transition;
       }catch(java.lang.CloneNotSupportedException e0){
          return e0;
       }
    }
    public Animator n(ViewGroup p0,o p1,o p2){
       return null;
    }
    public void o(ViewGroup p0,p p1,p p2,ArrayList p3,ArrayList p4){
       int i2;
       int i3;
       o b;
       o oo2;
       o oo3;
       Transition transition;
       Animator uAnimator2;
       Object obj = this;
       ViewGroup viewGroup = p0;
       ArrayMap uArrayMap = Transition.z();
       SparseIntArray sparseIntArr = new SparseIntArray();
       int i = p3.size();
       long l = Long.MAX_VALUE;
       for (int i1 = 0; i1 < i; i = i2) {
          o oo = p3.get(i1);
          o oo1 = p4.get(i1);
          if (oo != null && !oo.c.contains(obj)) {
             oo = null;
          }
          if (oo1 != null && !oo1.c.contains(obj)) {
             oo1 = null;
          }
          if (oo != null || oo1 != null) {
             Animator uAnimator = (oo != null && (oo1 == null || obj.H(oo, oo1)))? 1: null;
             if (uAnimator) {
                uAnimator = obj.n(viewGroup, oo, oo1);
                if (uAnimator != null) {
                   if (oo1 != null) {
                      b = oo1.b;
                      String[] stringArray = this.F();
                      if (stringArray != null && stringArray.length > 0) {
                         oo2 = new o(b);
                         Animator uAnimator1 = uAnimator;
                         i2 = i;
                         oo3 = p2.a.get(b);
                         if (oo3 != null) {
                            i = 0;
                            while (i < stringArray.length) {
                               oo2.a.put(stringArray[i], oo3.a.get(stringArray[i]));
                               i = i + 1;
                               i1 = i1;
                               oo3 = oo3;
                            }
                         }
                         i3 = i1;
                         int i4 = uArrayMap.size();
                         int i5 = 0;
                         while (true) {
                            if (i5 < i4) {
                               Transition$d uod = uArrayMap.get(uArrayMap.keyAt(i5));
                               if (uod.c != null && (uod.a == b && ((uod.b).equals(this.w()) && uod.c.equals(oo2)))) {
                                  transition = null;
                               }else {
                                  i5 = i5 + 1;
                               }
                            }else {
                               transition = uAnimator1;
                            }
                         }
                      }else {
                         i2 = i;
                         i3 = i1;
                         transition = uAnimator;
                         oo2 = 0;
                      }
                      uAnimator2 = transition;
                      oo3 = oo2;
                   }else {
                      i2 = i;
                      i3 = i1;
                      b = oo.b;
                      uAnimator2 = uAnimator;
                      oo3 = null;
                   }
                   if (uAnimator2 != null) {
                      transition = obj.E;
                      if (transition != null) {
                         long l1 = transition.c(viewGroup, obj, oo, oo1);
                         sparseIntArr.put(obj.D.size(), (int)l1);
                         l = Math.min(l1, l);
                      }
                      Transition$d uod1 = new Transition$d(b, this.w(), this, w.e(p0), oo3);
                      uArrayMap.put(uAnimator2, v13);
                      obj.D.add(uAnimator2);
                      l = l;
                   label_0125 :
                      i1 = i3 + 1;
                   }
                }
             }
          }
       label_0043 :
          i2 = i;
          i3 = i1;
          goto label_0125 ;
       }
       if (sparseIntArr.size()) {
          for (int i6 = 0; i6 < sparseIntArr.size(); i6 = i6 + 1) {
             Animator uAnimator3 = obj.D.get(sparseIntArr.keyAt(i6));
             long l2 = (long)sparseIntArr.valueAt(i6) - l;
             l2 = l2 + uAnimator3.getStartDelay();
             uAnimator3.setStartDelay(l2);
          }
       }
       return;
    }
    public void p(){
       View view;
       int i = this.z - 1;
       this.z = i;
       if (!i) {
          Transition tC = this.C;
          if (tC != null && tC.size() > 0) {
             ArrayList uArrayList = this.C.clone();
             int i1 = uArrayList.size();
             for (int i2 = 0; i2 < i1; i2 = i2 + 1) {
                uArrayList.get(i2).b(this);
             }
          }
          i = 0;
          while (i < this.q.c.size()) {
             view = this.q.c.valueAt(i);
             if (view != null) {
                i0.C0(view, false);
             }
             i = i + 1;
          }
          i = 0;
          while (i < this.r.c.size()) {
             view = this.r.c.valueAt(i);
             if (view != null) {
                i0.C0(view, false);
             }
             i = i + 1;
          }
          this.B = true;
       }
       return;
    }
    public void q(ViewGroup p0){
       ArrayMap uArrayMap = Transition.z();
       int i = uArrayMap.size();
       if (p0 != null && i) {
          d0 uod0 = w.e(p0);
          ArrayMap uArrayMap1 = new ArrayMap(uArrayMap);
          uArrayMap.clear();
          i = i - 1;
          while (i >= 0) {
             Transition$d uod = uArrayMap1.valueAt(i);
             if (uod.a != null && uod0.equals(uod.d)) {
                uArrayMap1.keyAt(i).end();
             }
             i = i - 1;
          }
       }
       return;
    }
    public long r(){
       return this.d;
    }
    public Rect s(){
       Transition tF = this.F;
       if (tF == null) {
          return null;
       }
       return tF.a(this);
    }
    public Transition$e t(){
       return this.F;
    }
    public String toString(){
       return this.i0("");
    }
    public TimeInterpolator u(){
       return this.e;
    }
    public o v(View p0,boolean p1){
       Transition ts = this.s;
       if (ts != null) {
          return ts.v(p0, p1);
       }
       ts = (p1)? this.u: this.v;
       o oo = null;
       if (ts == null) {
          return oo;
       }else {
          int i = ts.size();
          int i1 = -1;
          int i2 = 0;
          while (true) {
             if (i2 < i) {
                o oo1 = ts.get(i2);
                if (oo1 == null) {
                   return oo;
                }else if(oo1.b == p0){
                   i1 = i2;
                label_002e :
                   if (i1 >= 0) {
                      Transition tv = (p1)? this.v: this.u;
                      oo = tv.get(i1);
                      break ;
                   }
                   break ;
                }else {
                   i2 = i2 + 1;
                }
             }else {
                goto label_002e ;
             }
          }
          return oo;
       }
    }
    public String w(){
       return this.b;
    }
    public PathMotion x(){
       return this.H;
    }
    public n y(){
       return this.E;
    }
}
