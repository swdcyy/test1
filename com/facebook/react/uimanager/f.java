package com.facebook.react.uimanager.f;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.l;
import com.facebook.react.uimanager.j;
import df.c;
import java.lang.Object;
import ze.j0;
import ze.n;
import com.facebook.react.uimanager.e;
import com.facebook.react.uimanager.f$a;
import ze.z;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.facebook.react.bridge.UiThreadUtil;
import ze.m;
import android.view.View;
import yd.e;
import com.kwai.robust.PatchProxyResult;
import hg.a;
import java.util.Objects;
import java.lang.Number;
import vd.f;
import android.util.SparseBooleanArray;
import ze.x;
import java.lang.StringBuilder;
import cb.a;
import hg.b$b;
import hg.b;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import com.facebook.react.uimanager.f$b;
import com.facebook.react.uimanager.j$m;
import com.facebook.react.uimanager.j$a;
import java.util.ArrayList;
import java.lang.Float;
import java.lang.Iterable;
import ze.o;
import df.b;
import com.facebook.react.uimanager.ViewManager;
import od.a;
import ze.g;
import com.facebook.react.uimanager.IllegalViewOperationException;
import android.os.SystemClock;
import android.view.View$MeasureSpec;
import com.facebook.react.bridge.ReadableMap;
import ze.n0;
import android.util.SparseArray;
import com.facebook.react.uimanager.NativeKind;
import com.facebook.react.bridge.ReadableArray;
import ze.a1;
import java.util.Comparator;
import java.util.Arrays;
import java.lang.Math;
import java.lang.Boolean;
import ze.y;
import ze.k0;
import com.facebook.react.uimanager.j$q;
import java.util.Map;

public class f	// class@001347
{
    public Object a;
    public final c b;
    public final ReactApplicationContext c;
    public final j0 d;
    public final l e;
    public final j f;
    public final n g;
    public final int[] h;
    public long i;
    public f$a j;
    public CopyOnWriteArraySet k;
    public final e l;
    public boolean m;

    public void f(ReactApplicationContext p0,l p1,j p2,c p3){
       super();
       this.a = new Object();
       j0 oj0 = new j0();
       this.d = oj0;
       int[] ointArray = new int[4];
       this.h = ointArray;
       this.i = 0;
       this.m = false;
       this.c = p0;
       this.e = p1;
       this.f = p2;
       this.g = new n(p2, oj0);
       this.b = p3;
       this.l = new e(this);
    }
    public void A(f$a p0){
       this.j = p0;
    }
    public void B(int p0,z p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "17")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (this.m != null && this.f.m().p(p0) == null) {
          return;
       }
       if (e.r) {
          this.f.j(p0, "", p1);
       }else {
          this.f.m().m(p0, p1);
       }
       return;
    }
    public void C(){
       int i1;
       f tf;
       if (PatchProxy.applyVoid(null, this, f.class, "31")) {
          return;
       }
       a.a(0, "UIImplementation.updateViewHierarchy");
       int i = 0;
       while (true) {
          f td = this.d;
          Objects.requireNonNull(td);
          x obj = PatchProxy.apply(null, td, j0.class, "8");
          if (obj != PatchProxyResult.class) {
             i1 = obj.intValue();
          label_003f :
             if (i < i1) {
                td = this.d;
                Objects.requireNonNull(td);
                if (PatchProxy.isSupport(j0.class)) {
                   obj = PatchProxy.applyOneRefs(Integer.valueOf(i), td, j0.class, "9");
                   if (obj != PatchProxyResult.class) {
                      i1 = obj.intValue();
                   label_006c :
                      obj = this.d.a(i1);
                      if (obj == null) {
                         a.x("ReactNative", "Tried to updateViewHierarchy non-existent root tag: "+i1);
                      }else if(obj.getWidthMeasureSpec() != null && obj.getHeightMeasureSpec() != null){
                         b.a(0, "UIImplementation.notifyOnBeforeLayoutRecursive").b("rootTag", obj.getReactTag()).e();
                         if (!PatchProxy.applyVoidOneRefs(obj, this, f.class, "60")) {
                            td = this.k;
                            if (td != null) {
                               Iterator iterator1 = td.iterator();
                               while (iterator1.hasNext()) {
                                  iterator1.next().c(obj);
                               }
                            }
                         }
                         this.s(obj);
                         a.c(0, "UIImplementation.notifyOnBeforeLayoutRecursive");
                         this.e(obj);
                         b.a(0, "UIImplementation.applyUpdatesRecursive").b("rootTag", obj.getReactTag()).e();
                         i1 = this.b(obj, 0, 0, 1);
                         if (!PatchProxy.isSupport(f.class) || !PatchProxy.applyVoidTwoRefs(obj, Integer.valueOf(i1), this, f.class, "61")) {
                            tf = this.k;
                            if (tf != null) {
                               Iterator iterator = tf.iterator();
                               while (iterator.hasNext()) {
                                  iterator.next().b(obj, i1);
                               }
                            }
                         }
                         a.c(0, "UIImplementation.applyUpdatesRecursive");
                         td = this.j;
                         if (td != null) {
                            tf = this.f;
                            Objects.requireNonNull(tf);
                            if (!PatchProxy.applyVoidTwoRefs(obj, td, tf, j.class, "34")) {
                               tf.g.add(new j$m(tf, obj, td, null));
                            }
                         }
                      }
                      i = i + 1;
                   }
                }
                td.c.a("getRootTag");
                i1 = td.b.keyAt(i);
                goto label_006c ;
             }else {
                break ;
             }
          }else {
             td.c.a("getRootNodeCount");
             i1 = td.b.size();
             goto label_003f ;
          }
       }
       a.c(0, "UIImplementation.applyUpdatesRecursive");
       return;
    }
    public void a(f$b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "57")) {
          return;
       }
       this.m();
       this.k.add(p0);
       return;
    }
    public int b(x p0,float p1,float p2,int p3){
       Iterable obj;
       float f;
       int this;
       if (PatchProxy.isSupport(f.class)) {
          obj = PatchProxy.applyFourRefs(p0, Float.valueOf(p1), Float.valueOf(p2), Integer.valueOf(p3), this, f.class, "53");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       if (!p0.hasUpdates()) {
          this.r(p0, false);
          return p3;
       }else {
          obj = p0.calculateLayoutOnChildren();
          if (obj != null) {
             Iterator iterator = obj.iterator();
             int i = p3;
             while (iterator.hasNext()) {
                f = p0.getLayoutX() + p1;
                float f1 = p0.getLayoutY() + p2;
                this = p3 + 1;
                int i1 = this.b(iterator.next(), f, f1, this);
                if (i < i1) {
                   i = i1;
                }
             }
             p3 = i;
          }
          int reactTag = p0.getReactTag();
          if (!this.d.b(reactTag)) {
             boolean b = p0.dispatchUpdates(p1, p2, this.f, this.g);
             if (b && p0.shouldNotifyOnLayout()) {
                this.b.c(o.k(reactTag, p0.getScreenX(), p0.getScreenY(), p0.getScreenWidth(), p0.getScreenHeight()));
             }
             this.r(p0, b);
          }
          p0.markUpdateSeen();
          if (e.a) {
             f tg = this.g;
             Objects.requireNonNull(tg);
             if (!PatchProxy.applyVoid(null, tg, n.class, "20")) {
                tg.c.clear();
             }
          }
          return p3;
       }
    }
    public final void c(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "50")) {
          return;
       }
       ViewManager viewManager = this.e.a(p0.getViewClass());
       a.c(viewManager);
       if (!viewManager instanceof g) {
          throw new IllegalViewOperationException("Trying to use view "+p0.getViewClass()+" as a parent, but its Manager doesn\'t extends ViewGroupManager");
       }
       if (!viewManager.needsCustomLayoutForChildren()) {
          return;
       }
       throw new IllegalViewOperationException("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it\'s children \("+p0.getViewClass()+"\). Use measure instead.");
    }
    public final void d(int p0,String p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "49")) {
          return;
       }
       if (this.d.a(p0) == null) {
          a.g("ReactNative", "Unable to execute operation "+p1+" on view with tag: "+p0+", since the view does not exists");
       }
       return;
    }
    public void e(x p0){
       float f;
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "52")) {
          return;
       }
       long l = 0;
       b.a(l, "cssRoot.calculateLayout").b("rootTag", p0.getReactTag()).e();
       long l1 = SystemClock.uptimeMillis();
       int i = p0.getWidthMeasureSpec().intValue();
       int i1 = p0.getHeightMeasureSpec().intValue();
       f = Float.NaN;
       float f1 = (!View$MeasureSpec.getMode(i))? Float.NaN: (float)View$MeasureSpec.getSize(i);
       if (View$MeasureSpec.getMode(i1)) {
          f = (float)View$MeasureSpec.getSize(i1);
       }
       p0.calculateLayout(f1, f);
       a.c(l, "cssRoot.calculateLayout");
       this.i = SystemClock.uptimeMillis() - l1;
       return;
    }
    public void f(int p0,String p1,int p2,ReadableMap p3){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, Integer.valueOf(p2), p3, this, f.class, "14")) {
          return;
       }
       f ta = this.a;
       _monitor_enter(ta);
       x ox = PatchProxy.applyOneRefs(p1, this, uof, "2");
       if (ox != PatchProxyResult.class) {
       }else {
          ox = this.e.a(p1).createShadowNodeInstance(this.c);
       }
       x ox1 = this.d.a(p2);
       if (ox1 == null) {
          a.x("ReactNative", "Tried to createView non-existent root tag: "+p2);
          _monitor_exit(ta);
          return;
       }else {
          a.d(ox1, "Root node with tag "+p2+" doesn\'t exist");
          ox.setReactTag(p0);
          ox.setViewClassName(p1);
          ox.setRootTag(ox1.getReactTag());
          ox.setThemedContext(ox1.getThemedContext());
          f td = this.d;
          Objects.requireNonNull(td);
          if (!PatchProxy.applyVoidOneRefs(ox, td, j0.class, "4")) {
             td.c.a("addNode");
             td.a.put(ox.getReactTag(), ox);
          }
          z oz = null;
          if (p3 != null) {
             oz = new z(p3);
             ox.updateProperties(oz);
          }
          this.l(ox, p2, oz);
          if (ox.isDataViewShadowNode()) {
             this.m = true;
             ox.setSyncRenderDataTag(p0);
             f tf = this.f;
             tf.E = this.m;
             tf.D = this;
          }
          _monitor_exit(ta);
          return;
       }
    }
    public void g(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "29")) {
          return;
       }
       b.a(0, "UIImplementation.dispatchViewUpdates").b("batchId", p0).e();
       long l = SystemClock.uptimeMillis();
       this.C();
       f tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(null, tg, n.class, "10")) {
          tg.c.clear();
       }
       this.f.d(p0, l, this.i);
       a.c(0, "UIImplementation.dispatchViewUpdates");
       return;
    }
    public final void h(){
       if (PatchProxy.applyVoid(null, this, f.class, "30")) {
          return;
       }
       if (this.f.q()) {
          this.g(-1);
       }
       return;
    }
    public x i(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "63");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.a(p0);
    }
    public e j(){
       return this.l;
    }
    public j k(){
       return this.f;
    }
    public void l(x p0,int p1,z p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, f.class, "15")) {
          return;
       }
       if (!p0.isVirtual()) {
          f tg = this.g;
          n0 themedContex = p0.getThemedContext();
          Objects.requireNonNull(tg);
          if (!PatchProxy.applyVoidThreeRefs(p0, themedContex, p2, tg, n.class, "2")) {
             boolean b = ((p0.getViewClass()).equals("RCTView") && n.j(p2))? true: false;
             p0.setIsLayoutOnly(b);
             if (p0.getNativeKind() != NativeKind.NONE) {
                tg.a.f(themedContex, p0.getReactTag(), p0.getViewClass(), p2);
             }
          }
       }
       return;
    }
    public final void m(){
       if (PatchProxy.applyVoid(null, this, f.class, "62")) {
          return;
       }
       if (this.k == null) {
          this.k = new CopyOnWriteArraySet();
       }
       return;
    }
    public void n(int p0,ReadableArray p1,ReadableArray p2,ReadableArray p3,ReadableArray p4,ReadableArray p5){
       int i3;
       int i8;
       int reactTag;
       int[] ointArray3;
       x ox2;
       int[] obj = this;
       int i = p0;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       f uof = f.class;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(uof)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, obj, uof, "19")) {
             return;
          }
       }
       uof = obj.a;
       _monitor_enter(uof);
       x ox = obj.d.a(i);
       if (ox == null) {
          _monitor_exit(uof);
          return;
       }else if(oobject == null){
          i3 = 0;
       }else {
          i3 = p1.size();
       }
       int i4 = (oobject2 == null)? 0: p3.size();
       int i5 = (oobject4 == null)? 0: p5.size();
       if (!i3 || (oobject1 != null && i3 == p2.size())) {
          if (!i4 || (oobject3 != null && i4 == p4.size())) {
             int i6 = i3 + i4;
             a1[] uoa1Array = new a1[i6];
             i2 = i3 + i5;
             int[] ointArray = new int[i2];
             obj = new int[i2];
             int i7 = i6;
             int[] ointArray1 = new int[i5];
             int[] ointArray2 = new int[i5];
             if (i3 > 0) {
                a.c(p1);
                a.c(p2);
                i8 = i2;
                i2 = 0;
                while (i2 < i3) {
                   i = oobject.getInt(i2);
                   reactTag = ox.getChildAt(i).getReactTag();
                   uoa1Array[i2] = new a1(reactTag, oobject1.getInt(i2));
                   ointArray[i2] = i;
                   obj[i2] = reactTag;
                   i2 = i2 + 1;
                   ointArray2 = ointArray2;
                   ointArray1 = ointArray1;
                   ox = ox;
                }
                ointArray3 = ointArray2;
             }else {
                ointArray3 = ointArray2;
                i8 = i2;
             }
             x ox1 = ox;
             int[] ointArray4 = ointArray1;
             if (i4 > 0) {
                a.c(p3);
                a.c(p4);
                for (i = 0; i < i4; i = i + 1) {
                   i2 = i3 + i;
                   uoa1Array[i2] = new a1(oobject2.getInt(i), oobject3.getInt(i));
                }
             }
             if (i5 > 0) {
                a.c(p5);
                i = 0;
                while (i < i5) {
                   reactTag = oobject4.getInt(i);
                   ox2 = ox1;
                   int reactTag1 = ox2.getChildAt(reactTag).getReactTag();
                   int i9 = i3 + i;
                   ointArray[i9] = reactTag;
                   obj[i9] = reactTag1;
                   ointArray4[i] = reactTag1;
                   ointArray3[i] = reactTag;
                   i = i + 1;
                   ox1 = ox2;
                }
             }
             ox2 = ox1;
             Arrays.sort(uoa1Array, a1.c);
             Arrays.sort(ointArray);
             i2 = i8 - 1;
             i = -1;
             while (true) {
                if (i2 >= 0) {
                   if (ointArray[i2] != i) {
                      ox2.removeChildAt(ointArray[i2]);
                      i = ointArray[i2];
                      i2 = i2 - 1;
                   }else {
                      break ;
                   }
                }else {
                   ointArray2 = ointArray3;
                   reactTag = 0;
                   i3 = i7;
                   while (reactTag < i3) {
                      oobject2 = uoa1Array[reactTag];
                      int[] ointArray5 = obj;
                      x ox3 = this.d.a(oobject2.a);
                      if (ox3 == null) {
                         a.g("ReactNative", "Trying to add unknown view tag: "+oobject2.a);
                      }else {
                         ox2.addChildAt(ox3, oobject2.b);
                      }
                      reactTag = reactTag + 1;
                      obj = ointArray5;
                      i7 = i3;
                   }
                   f uof1 = this;
                   int[] ointArray6 = ointArray4;
                   i2 = i5;
                   uof1.g.g(ox2, ointArray, obj, uoa1Array, ointArray6, ointArray2);
                   for (i = 0; i < i2; i = i + 1) {
                      uof1.v(uof1.d.a(ointArray6[i]));
                   }
                   _monitor_exit(uof);
                   return;
                }
             }
             throw new IllegalViewOperationException("Repeated indices in Removal list for view tag: "+p0);
          }else {
             throw new IllegalViewOperationException("Size of addChildTags != size of addAtIndices!");
          }
       }else {
          throw new IllegalViewOperationException("Size of moveFrom != size of moveTo!");
       }
    }
    public final void o(int p0,int p1,int[] p2){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, f.class, "46")) {
          return;
       }
       x ox = this.d.a(p0);
       x ox1 = this.d.a(p1);
       if (ox == null || ox1 == null) {
          StringBuilder str = "Tag ";
          if (ox != null) {
             p0 = p1;
          }
          a.g("ReactNative", str+p0+" does not exist");
          return;
       }else if(ox != ox1){
          for (x parent = ox.getParent(); parent != ox1; parent = parent.getParent()) {
             if (parent != null) {
             }else {
                throw new IllegalViewOperationException("Tag "+p1+" is not an ancestor of tag "+p0);
             }
          }
       }
       this.q(ox, ox1, p2);
       return;
    }
    public final void p(int p0,int[] p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "47")) {
          return;
       }
       x ox = this.d.a(p0);
       if (ox == null) {
          a.g("ReactNative", "No native view for tag "+p0+" exists!");
          return;
       }else {
          x parent = ox.getParent();
          if (parent == null) {
             throw new IllegalViewOperationException("View with tag "+p0+" doesn\'t have a parent!");
          }
          this.q(ox, parent, p1);
          return;
       }
    }
    public final void q(x p0,x p1,int[] p2){
       int i1;
       int i2;
       x this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "48")) {
          return;
       }
       int i = 0;
       if (p0 != p1) {
          i1 = Math.round(p0.getLayoutX());
          i2 = Math.round(p0.getLayoutY());
          for (this = p0.getParent(); this != p1; this = this.getParent()) {
             a.c(this);
             this.c(this);
             i1 = i1 + Math.round(this.getLayoutX());
             i2 = i2 + Math.round(this.getLayoutY());
          }
          this.c(p1);
       }else {
          i1 = 0;
          i2 = 0;
       }
       p2[i] = i1;
       p2[1] = i2;
       p2[2] = p0.getScreenWidth();
       p2[3] = p0.getScreenHeight();
       return;
    }
    public final void r(x p0,boolean p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, uof, "59")) {
          return;
       }
       uof = this.k;
       if (uof == null) {
          return;
       }
       Iterator iterator = uof.iterator();
       while (iterator.hasNext()) {
          iterator.next().a(p0, p1);
       }
       return;
    }
    public final void s(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "51")) {
          return;
       }
       if (p0.getReactTag() == p0.getSyncRenderDataTag()) {
          y oy = new y(p0);
          k0 ok0 = new k0();
          ok0.a(oy);
          this.t(p0, oy, ok0);
          p0.setSnapShotShadowTree(oy, ok0);
          return;
       }else if(!p0.hasUpdates()){
          return;
       }else {
          for (int i = 0; i < p0.getChildCount(); i = i + 1) {
             this.s(p0.getChildAt(i));
          }
          p0.onBeforeLayout(this.g);
          return;
       }
    }
    public final void t(x p0,y p1,k0 p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, f.class, "65")) {
          return;
       }
       for (int i = 0; i < p0.getChildCount(); i = i + 1) {
          x childAt = p0.getChildAt(i);
          if (p0.getReactTag() == p0.getSyncRenderDataTag()) {
             childAt.setSyncRenderDataCellRootTag(childAt.getReactTag());
          }else {
             childAt.setSyncRenderDataCellRootTag(p0.getSyncRenderDataCellRootTag());
          }
          childAt.setSyncRenderDataTag(p0.getSyncRenderDataTag());
          y oy = new y(childAt);
          p2.a(oy);
          p1.a(oy, i);
          this.t(childAt, oy, p2);
       }
       if (!p0.hasUpdates()) {
          return;
       }
       p0.onBeforeLayout(this.g);
       return;
    }
    public void u(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "8")) {
          return;
       }
       if (!PatchProxy.isSupport(uof) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uof, "9")) {
          uof = this.a;
          _monitor_enter(uof);
          this.d.d(p0);
          _monitor_exit(uof);
       }
       uof = this.f;
       Objects.requireNonNull(uof);
       j oj = j.class;
       if (!PatchProxy.isSupport(oj) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), uof, oj, "13")) {
          uof.g.add(new j$q(uof, p0));
       }
       return;
    }
    public final void v(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "44")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       this.w(p0);
       p0.dispose();
       return;
    }
    public void w(x p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f.class, "45")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       n.h(p0);
       this.d.c(p0.getReactTag());
       for (int i = p0.getChildCount() - 1; i >= 0; i = i - 1) {
          this.w(p0.getChildAt(i));
       }
       p0.removeAndDisposeAllChildren();
       return;
    }
    public final x x(int p0){
       f uof = f.class;
       if (PatchProxy.isSupport(uof)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uof, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.a(p0);
    }
    public final ViewManager y(String p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String str = "4";
       f obj = PatchProxy.applyOneRefs(p0, this, f.class, str);
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.e;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, l.class, str);
       if (obj1 != patchProxyRe) {
       }else {
          obj1 = obj.a.get(p0);
          if (obj1 == null) {
             obj1 = (obj.b != null)? obj.b(p0): null;
          }
       }
       return obj1;
    }
    public void z(int p0,ReadableArray p1){
       f uof = f.class;
       if (PatchProxy.isSupport(uof) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uof, "20")) {
          return;
       }
       uof = this.a;
       _monitor_enter(uof);
       x ox = this.d.a(p0);
       if (ox == null) {
          a.x("ReactNative", "Tried to setChildren non-existent tag: "+p0);
          _monitor_exit(uof);
          return;
       }else {
          p0 = 0;
          while (p0 < p1.size()) {
             x ox1 = this.d.a(p1.getInt(p0));
             if (ox1 == null) {
                a.g("ReactNative", "Trying to add unknown view tag: "+p1.getInt(p0));
             }else {
                ox.addChildAt(ox1, p0);
             }
             p0++;
          }
          this.g.i(ox, p1);
          _monitor_exit(uof);
          return;
       }
    }
}
