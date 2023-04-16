package androidx.fragment.app.f;
import k2.e;
import k2.f;
import java.lang.Object;
import androidx.collection.ArrayMap;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.lang.String;
import androidx.collection.SimpleArrayMap;
import android.view.View;
import androidx.fragment.app.FragmentManagerImpl;
import android.util.SparseArray;
import java.lang.Boolean;
import android.content.Context;
import androidx.fragment.app.FragmentHostCallback;
import androidx.fragment.app.f$e;
import java.util.Collection;
import a2.i0;
import androidx.fragment.app.e$a;
import androidx.fragment.app.Fragment;
import k2.a;
import androidx.core.app.g;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.lang.IllegalArgumentException;
import android.view.ViewGroup;
import android.graphics.Rect;
import androidx.fragment.app.f$d;
import java.lang.Runnable;
import a2.c0;
import androidx.fragment.app.f$c;
import androidx.fragment.app.f$a;
import androidx.transition.b;
import java.lang.Class;
import java.lang.reflect.Constructor;
import androidx.fragment.app.f$b;

public class f	// class@0007af
{
    public static final int[] a;
    public static final f b;
    public static final f c;

    static {
       f.a = new int[11]{0,3,0,1,5,4,7,6,9,8,10};
       f.b = new e();
       f.c = f.x();
    }
    public static void A(f p0,Object p1,Object p2,ArrayMap p3,boolean p4,a p5){
       e o = p5.o;
       if (o != null && !o.isEmpty()) {
          String str = (p4)? p5.p.get(0): p5.o.get(0);
          View view = p3.get(str);
          p0.v(p1, view);
          if (p2 != null) {
             p0.v(p2, view);
          }
       }
    label_002c :
       return;
    }
    public static void B(ArrayList p0,int p1){
       if (p0 == null) {
          return;
       }
       for (int i = p0.size() - 1; i >= 0; i = i - 1) {
          p0.get(i).setVisibility(p1);
       }
       return;
    }
    public static void C(FragmentManagerImpl p0,ArrayList p1,ArrayList p2,int p3,int p4,boolean p5){
       if (p0.mCurState < 1) {
          return;
       }
       SparseArray sparseArray = new SparseArray();
       int i = p3;
       while (i < p4) {
          a uoa = p1.get(i);
          if (p2.get(i).booleanValue()) {
             f.e(uoa, sparseArray, p5);
          }else {
             f.c(uoa, sparseArray, p5);
          }
          i = i + 1;
       }
       if (sparseArray.size()) {
          View view = new View(p0.mHost.getContext());
          int i1 = sparseArray.size();
          int i2 = 0;
          while (i2 < i1) {
             int i3 = sparseArray.keyAt(i2);
             ArrayMap uArrayMap = f.d(i3, p1, p2, p3, p4);
             f$e uoe = sparseArray.valueAt(i2);
             if (p5) {
                f.o(p0, i3, uoe, view, uArrayMap);
             }else {
                f.n(p0, i3, uoe, view, uArrayMap);
             }
             i2 = i2 + 1;
          }
       }
       return;
    }
    public static void a(ArrayList p0,ArrayMap p1,Collection p2){
       int i = p1.size() - 1;
       while (i >= 0) {
          View view = p1.valueAt(i);
          if (p2.contains(i0.L(view))) {
             p0.add(view);
          }
          i = i - 1;
       }
       return;
    }
    public static void b(a p0,e$a p1,SparseArray p2,boolean p3,boolean p4){
       Fragment uFragment;
       int i1;
       Fragment mIsNewlyAdde;
       e$a b = p1.b;
       if (b == null) {
          return;
       }
       Fragment mContainerId = b.mContainerId;
       if (mContainerId == null) {
          return;
       }
       int i = (p3)? f.a[p1.a]: p1.a;
       e uoe = 1;
       f$e uoe1 = null;
       if (i != uoe) {
          if (i != 3) {
             if (i != 4) {
                if (i != 5) {
                   if (i != 6) {
                      if (i != 7) {
                         i = 0;
                         uFragment = null;
                      label_008e :
                         uoe1 = i;
                         i = 0;
                         i1 = 0;
                      label_0091 :
                         f$e uoe2 = p2.get(mContainerId);
                         if (uoe1 != null) {
                            uoe2 = f.p(uoe2, p2, mContainerId);
                            uoe2.a = b;
                            uoe2.b = p3;
                            uoe2.c = p0;
                         }
                         f$e uoe3 = uoe2;
                         if (!p4 && uFragment) {
                            if (uoe3 != null && uoe3.d == b) {
                               uoe3.d = null;
                            }
                            a s = p0.s;
                            if (b.mState < uoe && (s.mCurState >= uoe && p0.q == null)) {
                               s.makeActive(b);
                               s.moveToState(b, 1, 0, 0, false);
                            }
                         }
                      label_00cb :
                         if (i1 && (uoe3 == null || uoe3.d == null)) {
                            uoe3 = f.p(uoe3, p2, mContainerId);
                            uoe3.d = b;
                            uoe3.e = p3;
                            uoe3.f = p0;
                         }
                         if (!p4 && (i && (uoe3 != null && uoe3.a == b))) {
                            uoe3.a = null;
                         }
                      label_00e9 :
                         return;
                      }else if(p4){
                         mIsNewlyAdde = b.mIsNewlyAdded;
                      }else if(b.mAdded == null && b.mHidden == null){
                      label_008a :
                         mIsNewlyAdde = 1;
                      }else {
                      label_008c :
                         mIsNewlyAdde = 0;
                      }
                   }else if(p4){
                      if (b.mAdded == null) {
                         mIsNewlyAdde = b.mView;
                         if (mIsNewlyAdde != null && (!mIsNewlyAdde.getVisibility() && b.mPostponedAlpha >= 0)) {
                         label_0076 :
                            mIsNewlyAdde = 1;
                         label_0079 :
                            i1 = mIsNewlyAdde;
                            uFragment = null;
                            goto label_0091 ;
                         }
                      }
                   }else if(b.mAdded != null && b.mHidden == null){
                      goto label_0076 ;
                   }
                }else if(p4){
                   if (b.mHiddenChanged != null && (b.mHidden == null && b.mAdded != null)) {
                      goto label_008a ;
                   }else {
                      goto label_008c ;
                   }
                }else {
                   mIsNewlyAdde = b.mHidden;
                }
             }else if(p4){
                if (b.mHiddenChanged != null && (b.mAdded != null && b.mHidden != null)) {
                   goto label_0076 ;
                }
             }else if(b.mAdded != null && b.mHidden == null){
                goto label_0076 ;
             }
          }else {
             goto label_0056 ;
          }
          mIsNewlyAdde = 0;
          goto label_0079 ;
       }else {
          goto label_007d ;
       }
       uFragment = 1;
       goto label_008e ;
    }
    public static void c(a p0,SparseArray p1,boolean p2){
       int i = p0.a.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          f.b(p0, p0.a.get(i1), p1, false, p2);
       }
       return;
    }
    public static ArrayMap d(int p0,ArrayList p1,ArrayList p2,int p3,int p4){
       e o1;
       e p;
       ArrayMap uArrayMap = new ArrayMap();
       p4--;
       while (p4 >= p3) {
          a uoa = p1.get(p4);
          if (uoa.M(p0)) {
             boolean b = p2.get(p4).booleanValue();
             e o = uoa.o;
             if (o != null) {
                int i = o.size();
                if (b) {
                   o1 = uoa.o;
                   p = uoa.p;
                }else {
                   o1 = uoa.p;
                   p = uoa.o;
                }
                int i1 = 0;
                while (i1 < i) {
                   String str = p.get(i1);
                   String str1 = o1.get(i1);
                   String str2 = uArrayMap.remove(str1);
                   if (str2 != null) {
                      uArrayMap.put(str, str2);
                   }else {
                      uArrayMap.put(str, str1);
                   }
                   i1 = i1 + 1;
                }
             }
          }
          p4--;
       }
       return uArrayMap;
    }
    public static void e(a p0,SparseArray p1,boolean p2){
       if (!p0.s.mContainer.onHasView()) {
          return;
       }
       for (int i = p0.a.size() - 1; i >= 0; i = i - 1) {
          f.b(p0, p0.a.get(i), p1, 1, p2);
       }
       return;
    }
    public static void f(Fragment p0,Fragment p1,boolean p2,ArrayMap p3,boolean p4){
       g enterTransit = (p2)? p1.getEnterTransitionCallback(): p0.getEnterTransitionCallback();
       if (enterTransit != null) {
          ArrayList uArrayList = new ArrayList();
          ArrayList uArrayList1 = new ArrayList();
          int i = 0;
          int i1 = (p3 == null)? 0: p3.size();
          while (i < i1) {
             uArrayList1.add(p3.keyAt(i));
             uArrayList.add(p3.valueAt(i));
             i++;
          }
       }
       return;
    }
    public static boolean g(f p0,List p1){
       int i = p1.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return true;
          }
          if (!p0.e(p1.get(i1))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return false;
    }
    public static ArrayMap h(f p0,ArrayMap p1,Object p2,f$e p3){
       g exitTransiti;
       e o;
       f$e a = p3.a;
       View view = a.getView();
       if (!p1.isEmpty() && (p2 == null || view == null)) {
          p1.clear();
          return null;
       }else {
          p2 = new ArrayMap();
          p0.j(p2, view);
          f$e c = p3.c;
          if (p3.b != null) {
             exitTransiti = a.getExitTransitionCallback();
             o = c.o;
          }else {
             exitTransiti = a.getEnterTransitionCallback();
             o = c.p;
          }
          if (o != null) {
             p2.retainAll(o);
             p2.retainAll(p1.values());
          }
          if (exitTransiti != null) {
             int i = o.size() - 1;
             while (i >= 0) {
                String str = o.get(i);
                view = p2.get(str);
                if (view == null) {
                   str = f.q(p1, str);
                   if (str != null) {
                      p1.remove(str);
                   }
                }else if(!str.equals(i0.L(view))){
                   str = f.q(p1, str);
                   if (str != null) {
                      p1.put(str, i0.L(view));
                   }
                }
                i--;
             }
          }else {
             f.y(p1, p2);
          }
          return p2;
       }
    }
    public static ArrayMap i(f p0,ArrayMap p1,Object p2,f$e p3){
       e p;
       if (p1.isEmpty() || p2 == null) {
          p1.clear();
          return null;
       }else {
          p2 = p3.d;
          ArrayMap uArrayMap = new ArrayMap();
          p0.j(uArrayMap, p2.requireView());
          f$e f = p3.f;
          if (p3.e != null) {
             p2 = p2.getEnterTransitionCallback();
             p = f.p;
          }else {
             p2 = p2.getExitTransitionCallback();
             p = f.o;
          }
          uArrayMap.retainAll(p);
          if (p2 != null) {
             int i = p.size();
             i--;
             while (i >= 0) {
                String str = p.get(i);
                View view = uArrayMap.get(str);
                if (view == null) {
                   p1.remove(str);
                }else if(!str.equals(i0.L(view))){
                   p1.put(i0.L(view), p1.remove(str));
                }
             }
          }else {
             p1.retainAll(uArrayMap.keySet());
          }
          return uArrayMap;
       }
    }
    public static f j(Fragment p0,Fragment p1){
       f exitTransiti;
       ArrayList uArrayList = new ArrayList();
       if (p0 != null) {
          exitTransiti = p0.getExitTransition();
          if (exitTransiti != null) {
             uArrayList.add(exitTransiti);
          }
          exitTransiti = p0.getReturnTransition();
          if (exitTransiti != null) {
             uArrayList.add(exitTransiti);
          }
          p0 = p0.getSharedElementReturnTransition();
          if (p0 != null) {
             uArrayList.add(p0);
          }
       }
       if (p1 != null) {
          p0 = p1.getEnterTransition();
          if (p0 != null) {
             uArrayList.add(p0);
          }
          p0 = p1.getReenterTransition();
          if (p0 != null) {
             uArrayList.add(p0);
          }
          p0 = p1.getSharedElementEnterTransition();
          if (p0 != null) {
             uArrayList.add(p0);
          }
       }
       f uof = null;
       if (uArrayList.isEmpty()) {
          return uof;
       }else {
          f b = f.b;
          if (b != null && f.g(b, uArrayList)) {
             return b;
          }else {
             exitTransiti = f.c;
             if (exitTransiti != null && f.g(exitTransiti, uArrayList)) {
                return exitTransiti;
             }else if(b == null && exitTransiti == null){
                return uof;
             }else {
                throw new IllegalArgumentException("Invalid Transition types");
             }
          }
       }
    }
    public static ArrayList k(f p0,Object p1,Fragment p2,ArrayList p3,View p4){
       ArrayList uArrayList;
       if (p1 != null) {
          uArrayList = new ArrayList();
          View view = p2.getView();
          if (view != null) {
             p0.f(uArrayList, view);
          }
          if (p3 != null) {
             uArrayList.removeAll(p3);
          }
          if (!uArrayList.isEmpty()) {
             uArrayList.add(p4);
             p0.b(p1, uArrayList);
          }
       }else {
          uArrayList = null;
       }
       return uArrayList;
    }
    public static Object l(f p0,ViewGroup p1,View p2,ArrayMap p3,f$e p4,ArrayList p5,ArrayList p6,Object p7,Object p8){
       ArrayMap uArrayMap;
       Object obj2;
       Object obj3;
       Rect rect;
       f uof = p0;
       f$e uoe = p4;
       ArrayList uArrayList = p5;
       Object obj = p7;
       f$e a = uoe.a;
       f$e d = uoe.d;
       f$d obj1 = null;
       if (a == null || d == null) {
          return obj1;
       }
       f$e b = uoe.b;
       if (p3.isEmpty()) {
          uArrayMap = p3;
          obj2 = obj1;
       }else {
          obj2 = f.u(uof, a, d, b);
          uArrayMap = p3;
       }
       ArrayMap uArrayMap1 = f.i(uof, uArrayMap, obj2, uoe);
       if (p3.isEmpty()) {
          obj3 = obj1;
       }else {
          uArrayList.addAll(uArrayMap1.values());
          obj3 = obj2;
       }
       if (!obj && (p8 == null && obj3 == null)) {
          return obj1;
       }else {
          f.f(a, d, b, uArrayMap1, true);
          if (obj3 != null) {
             rect = new Rect();
             uof.y(obj3, p2, uArrayList);
             f.A(p0, obj3, p8, uArrayMap1, uoe.e, uoe.f);
             if (obj) {
                uof.u(obj, rect);
             }
          }else {
             rect = obj1;
          }
          obj1 = v5;
          f$d uod = v5;
          obj1 = new f$d(p0, p3, obj3, p4, p6, p2, a, d, b, p5, p7, rect);
          c0.a(p1, uod);
          return obj3;
       }
    }
    public static Object m(f p0,ViewGroup p1,View p2,ArrayMap p3,f$e p4,ArrayList p5,ArrayList p6,Object p7,Object p8){
       Object obj4;
       Rect rect;
       Rect obj = p2;
       ArrayMap uArrayMap = p3;
       f$e uoe = p4;
       ArrayList uArrayList = p5;
       ArrayList uArrayList1 = p6;
       Object obj1 = p7;
       f$e a = uoe.a;
       f$e d = uoe.d;
       if (a != null) {
          a.requireView().setVisibility(0);
       }
       Object obj2 = null;
       if (a == null || d == null) {
          return obj2;
       }else {
          f$e b = uoe.b;
          View obj3 = (p3.isEmpty())? obj2: f.u(p0, a, d, b);
          ArrayMap uArrayMap1 = f.i(p0, uArrayMap, obj3, uoe);
          ArrayMap uArrayMap2 = f.h(p0, uArrayMap, obj3, uoe);
          if (p3.isEmpty()) {
             if (uArrayMap1 != null) {
                uArrayMap1.clear();
             }
             if (uArrayMap2 != null) {
                uArrayMap2.clear();
             }
             obj4 = obj2;
          }else {
             f.a(uArrayList, uArrayMap1, p3.keySet());
             f.a(uArrayList1, uArrayMap2, p3.values());
             obj4 = obj3;
          }
          if (!obj1 && (p8 == null && obj4 == null)) {
             return obj2;
          }else {
             f.f(a, d, b, uArrayMap1, true);
             if (obj4 != null) {
                uArrayList1.add(obj);
                p0.y(obj4, obj, uArrayList);
                f.A(p0, obj4, p8, uArrayMap1, uoe.e, uoe.f);
                obj = new Rect();
                View view = f.t(uArrayMap2, uoe, obj1, b);
                if (view != null) {
                   p0.u(obj1, obj);
                }
                rect = obj;
                obj3 = view;
             }else {
                obj3 = obj2;
                rect = obj3;
             }
             f$c uoc = new f$c(a, d, b, uArrayMap2, obj3, p0, rect);
             c0.a(p1, obj1);
             return obj4;
          }
       }
    }
    public static void n(FragmentManagerImpl p0,int p1,f$e p2,View p3,ArrayMap p4){
       f obj4;
       FragmentManagerImpl uFragmentMan = p0;
       f$e uoe = p2;
       View view = p3;
       Map map = p4;
       ViewGroup viewGroup = (uFragmentMan.mContainer.onHasView())? uFragmentMan.mContainer.onFindViewById(p1): null;
       if (viewGroup == null) {
          return;
       }else {
          f$e a = uoe.a;
          f$e d = uoe.d;
          f uof = f.j(d, a);
          if (uof == null) {
             return;
          }else {
             Object obj = f.r(uof, a, uoe.b);
             ArrayList uArrayList = new ArrayList();
             ArrayList uArrayList1 = new ArrayList();
             ArrayList uArrayList2 = uArrayList;
             ArrayList obj1 = f.s(uof, d, uoe.e);
             f uof1 = uof;
             Object obj2 = f.l(uof, viewGroup, p3, p4, p2, uArrayList, uArrayList1, obj, obj1);
             Object obj3 = obj;
             if (obj3 == null && obj2 == null) {
                obj4 = obj1;
                if (obj4 == null) {
                   return;
                }
             }else {
                obj4 = obj1;
             }
             ArrayList uArrayList3 = f.k(uof1, obj4, d, uArrayList2, view);
             int i = (uArrayList3 == null || uArrayList3.isEmpty())? 0: obj4;
             uof1.a(obj3, view);
             Object obj5 = f.v(uof1, obj3, i, obj2, a, uoe.b);
             if (obj5 != null) {
                obj1 = new ArrayList();
                obj4 = uof1;
                obj4.t(obj5, obj3, obj1, i, uArrayList3, obj2, uArrayList1);
                f.z(obj4, viewGroup, a, p3, uArrayList1, obj3, obj1, i, uArrayList3);
                ArrayList uArrayList4 = uArrayList1;
                uof1.w(viewGroup, uArrayList4, map);
                uof1.c(viewGroup, obj5);
                uof1.s(viewGroup, uArrayList4, map);
             }
             return;
          }
       }
    }
    public static void o(FragmentManagerImpl p0,int p1,f$e p2,View p3,ArrayMap p4){
       FragmentManagerImpl uFragmentMan = p0;
       f$e uoe = p2;
       View view = p3;
       ViewGroup viewGroup = (uFragmentMan.mContainer.onHasView())? uFragmentMan.mContainer.onFindViewById(p1): null;
       ViewGroup viewGroup1 = viewGroup;
       if (viewGroup1 == null) {
          return;
       }else {
          f$e a = uoe.a;
          f$e d = uoe.d;
          f uof = f.j(d, a);
          if (uof == null) {
             return;
          }else {
             f$e b = uoe.b;
             ArrayList uArrayList = new ArrayList();
             ArrayList uArrayList1 = new ArrayList();
             Object obj = f.r(uof, a, b);
             ArrayList uArrayList2 = uArrayList1;
             p0 = f.s(uof, d, uoe.e);
             ViewGroup viewGroup2 = viewGroup1;
             ArrayList uArrayList3 = uArrayList1;
             Object obj1 = f.m(uof, viewGroup1, p3, p4, p2, uArrayList2, uArrayList, obj, p0);
             Object obj2 = obj;
             if (obj2 == null && obj1 == null) {
                obj = p0;
                if (obj == null) {
                   return;
                }
             }else {
                obj = p0;
             }
             ArrayList uArrayList4 = f.k(uof, obj2, a, uArrayList, view);
             f.B(uArrayList4, 4);
             ArrayList uArrayList5 = f.k(uof, obj, d, uArrayList3, view);
             Object obj3 = f.v(uof, obj2, obj, obj1, a, b);
             if (obj3 != null) {
                f.w(uof, obj, d, uArrayList5);
                uof.t(obj3, obj2, uArrayList4, obj, uArrayList5, obj1, uArrayList);
                viewGroup = viewGroup2;
                uof.c(viewGroup, obj3);
                uof.x(viewGroup, uArrayList3, uArrayList, uof.o(uArrayList), p4);
                f.B(uArrayList4, 0);
                uof.z(obj1, uArrayList3, uArrayList);
             }
             return;
          }
       }
    }
    public static f$e p(f$e p0,SparseArray p1,int p2){
       if (p0 == null) {
          p0 = new f$e();
          p1.put(p2, p0);
       }
       return p0;
    }
    public static String q(ArrayMap p0,String p1){
       int i = p0.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          if (p1.equals(p0.valueAt(i1))) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return p0.keyAt(i1);
    }
    public static Object r(f p0,Fragment p1,boolean p2){
       if (p1 == null) {
          return null;
       }
       p1 = (p2)? p1.getReenterTransition(): p1.getEnterTransition();
       return p0.g(p1);
    }
    public static Object s(f p0,Fragment p1,boolean p2){
       if (p1 == null) {
          return null;
       }
       p1 = (p2)? p1.getReturnTransition(): p1.getExitTransition();
       return p0.g(p1);
    }
    public static View t(ArrayMap p0,f$e p1,Object p2,boolean p3){
       p1 = p1.c;
       if (p2 != null && p0 != null) {
          p2 = p1.o;
          if (p2 != null && !p2.isEmpty()) {
             String str = (p3)? p1.o.get(0): p1.p.get(0);
             return p0.get(str);
          }
       }
       return null;
    }
    public static Object u(f p0,Fragment p1,Fragment p2,boolean p3){
       p1 = (p3)? p2.getSharedElementReturnTransition(): p1.getSharedElementEnterTransition();
       return p0.A(p0.g(p1));
    }
    public static Object v(f p0,Object p1,Object p2,Object p3,Fragment p4,boolean p5){
       boolean allowReturnT;
       if (p1 != null && (p2 != null && p4 != null)) {
          allowReturnT = (p5)? p4.getAllowReturnTransitionOverlap(): p4.getAllowEnterTransitionOverlap();
       }else {
          allowReturnT = true;
       }
       p0 = (allowReturnT)? p0.n(p2, p1, p3): p0.m(p2, p1, p3);
       return p0;
    }
    public static void w(f p0,Object p1,Fragment p2,ArrayList p3){
       if (p2 != null && (p1 != null && (p2.mAdded != null && (p2.mHidden != null && p2.mHiddenChanged != null)))) {
          p2.setHideReplaced(true);
          p0.r(p1, p2.getView(), p3);
          c0.a(p2.mContainer, new f$a(p3));
       }
    label_0025 :
       return;
    }
    public static f x(){
       try{
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          return b.class.getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static void y(ArrayMap p0,ArrayMap p1){
       int i = p0.size();
       i = i - 1;
       while (i >= 0) {
          if (!p1.containsKey(p0.valueAt(i))) {
             p0.removeAt(i);
          }
       }
       return;
    }
    public static void z(f p0,ViewGroup p1,Fragment p2,View p3,ArrayList p4,Object p5,ArrayList p6,Object p7,ArrayList p8){
       f$b uob = new f$b(p5, p0, p3, p2, p4, p6, p8, p7);
       c0.a(p1, v9);
    }
}
