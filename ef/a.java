package ef.a;
import com.facebook.react.uimanager.f;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.l;
import df.c;
import com.facebook.react.uimanager.j;
import yd.e;
import nf.a;
import ze.m;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Boolean;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import ze.x;
import ze.j0;
import com.facebook.yoga.YogaDisplay;
import java.util.Objects;
import ze.n;
import com.facebook.react.uimanager.NativeKind;
import ze.n$a;
import com.facebook.react.uimanager.j$f;
import java.util.ArrayList;
import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.ReadableArray;
import com.kwai.robust.PatchProxyResult;
import com.facebook.react.uimanager.IllegalViewOperationException;
import ze.a1;
import od.a;
import java.util.Comparator;
import java.util.Arrays;
import java.lang.StringBuilder;
import cb.a;

public class a extends f	// class@001f44
{

    public void a(ReactApplicationContext p0,l p1,c p2,int p3){
       a uoa = (e.c)? new a(p1): new m(p1);
       super(p0, p1, new j(p0, uoa, p3), p2);
       return;
    }
    public void D(String p0,int p1,int p2){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, a.class, "5")) {
          return;
       }
       Object[] objArray = new Object[]{"collapsable",Boolean.FALSE};
       this.f(p1, p0, p2, JavaOnlyMap.of(objArray));
       x ox = this.d.a(p1);
       ox.setDisplay(YogaDisplay.NONE);
       ox.setBindingVirtualNode(1);
       return;
    }
    public void E(x p0,x p1,int p2){
       n$a uoa;
       n$a uoa1;
       n a;
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(p2), this, a.class, "9")) {
          return;
       }
       x parent = p0.getParent();
       if (parent == null) {
          return;
       }
       parent.removeChildAt(parent.indexOf(p0));
       p1.addChildAt(p0, p2);
       f tg = this.g;
       int i = p1.indexOf(p0);
       Objects.requireNonNull(tg);
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidThreeRefs(p0, p1, Integer.valueOf(i), tg, n.class, "22")) {
          x nativeParent = p0.getNativeParent();
          if (nativeParent != null) {
             i = p1.getNativeOffsetForChild(p1.getChildAt(i));
             if (p1.getNativeKind() != NativeKind.PARENT) {
                uoa = tg.m(p1, i);
                if (uoa != null) {
                   uoa1 = uoa.b;
                   uoa = uoa.a;
                }
             }
             nativeParent.removeNativeChildAt(nativeParent.indexOfNativeChild(p0));
             uoa.addNativeChildAt(p0, uoa1);
             a = tg.a;
             int reactTag = p0.getReactTag();
             int reactTag1 = uoa.getReactTag();
             Objects.requireNonNull(a);
             if (!PatchProxy.isSupport(j.class) || !PatchProxy.applyVoidThreeRefs(Integer.valueOf(reactTag), Integer.valueOf(reactTag1), Integer.valueOf(uoa1), a, j.class, "27")) {
                a.g.add(new j$f(a, reactTag, reactTag1, uoa1));
             }
          }
       }
       return;
    }
    public void F(x p0,x p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a.class, "6")) {
          return;
       }
       if (p0 != null && !this.G(p0.getReactTag())) {
          this.D(p0.getViewClass(), (- p0.getReactTag()), p0.getRootTag());
          p1.setMovedOutFixedChildTag(p0.getReactTag());
          p0.setOriginalParentTag(p1.getReactTag());
          int rootTag = p0.getRootTag();
          JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
          javaOnlyArra.pushInt(p0.getReactTag());
          JavaOnlyArray javaOnlyArra1 = new JavaOnlyArray();
          javaOnlyArra1.pushInt(this.d.a(rootTag).getChildCount());
          this.n(rootTag, null, null, javaOnlyArra, javaOnlyArra1, null);
       }
       return;
    }
    public boolean G(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "10");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       return this.d.b(p0);
    }
    public final void H(x p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "11")) {
          return;
       }
       JavaOnlyArray movedOutFixe = p0.getMovedOutFixedChildTags();
       if (movedOutFixe == null || movedOutFixe.size() <= 1) {
          p0.resetMovedOutFixedChildTags(null);
          return;
       }else {
          JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
          int i = 0;
          while (i < movedOutFixe.size()) {
             int intx = movedOutFixe.getInt(i);
             if (intx != p1) {
                javaOnlyArra.pushInt(intx);
             }
             i = i + 1;
          }
          if (!javaOnlyArra.size()) {
             p0.resetMovedOutFixedChildTags(null);
          }else {
             p0.resetMovedOutFixedChildTags(javaOnlyArra);
          }
          return;
       }
    }
    public void n(int p0,ReadableArray p1,ReadableArray p2,ReadableArray p3,ReadableArray p4,ReadableArray p5){
       f a;
       int i3;
       int[] ointArray4;
       int reactTag;
       int[] ointArray5;
       int intx;
       Object obj = this;
       int i = p0;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       object oobject3 = p4;
       object oobject4 = p5;
       a uoa = a.class;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,oobject2,oobject3,oobject4};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "1")) {
             return;
          }
       }
       a = obj.a;
       _monitor_enter(a);
       x ox = obj.d.a(i);
       if (ox == null) {
          _monitor_exit(a);
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
             int i7 = i6;
             int[] ointArray1 = new int[i2];
             int[] ointArray2 = new int[i5];
             int i8 = i2;
             int[] ointArray3 = new int[i5];
             if (i3 > 0) {
                a.c(p1);
                a.c(p2);
                ointArray4 = ointArray3;
                i2 = 0;
                while (i2 < i3) {
                   i = oobject.getInt(i2);
                   reactTag = ox.getChildAt(i).getReactTag();
                   uoa1Array[i2] = new a1(reactTag, oobject1.getInt(i2));
                   ointArray[i2] = i;
                   ointArray1[i2] = reactTag;
                   i2 = i2 + 1;
                   ointArray2 = ointArray2;
                   i5 = i5;
                }
                ointArray5 = ointArray2;
             }else {
                ointArray5 = ointArray2;
                ointArray4 = ointArray3;
             }
             int i9 = i5;
             if (i4 > 0) {
                a.c(p3);
                a.c(p4);
                for (i = 0; i < i4; i = i + 1) {
                   reactTag = oobject2.getInt(i);
                   intx = oobject3.getInt(i);
                   x ox1 = obj.d.a(reactTag);
                   if (!obj.G(ox.getReactTag()) && (ox1 != null && ox1.isFixedNode())) {
                      obj.F(obj.d.a(reactTag), ox);
                      reactTag = - reactTag;
                   }
                label_010b :
                   int i10 = i3 + i;
                   uoa1Array[i10] = new a1(reactTag, intx);
                }
             }
             if (i9 > 0) {
                a.c(p5);
                i2 = i9;
                for (i = 0; i < i2; i = i + 1) {
                   intx = p5.getInt(i);
                   int reactTag1 = ox.getChildAt(intx).getReactTag();
                   int i11 = i3 + i;
                   ointArray[i11] = intx;
                   ointArray1[i11] = reactTag1;
                   ointArray5[i] = reactTag1;
                   ointArray4[i] = intx;
                }
             }else {
                i2 = i9;
             }
             Arrays.sort(uoa1Array, a1.c);
             Arrays.sort(ointArray);
             i = i8 - 1;
             reactTag = -1;
             while (true) {
                if (i >= 0) {
                   if (ointArray[i] != reactTag) {
                      ox.removeChildAt(ointArray[i]);
                      reactTag = ointArray[i];
                      i = i - 1;
                   }else {
                      break ;
                   }
                }else {
                   ointArray2 = ointArray5;
                   reactTag = 0;
                   i3 = i7;
                   while (reactTag < i3) {
                      oobject1 = uoa1Array[reactTag];
                      x ox2 = obj.d.a(oobject1.a);
                      if (ox2 == null) {
                         a.g("ReactNative", "Trying to add unknown view tag: "+oobject1.a);
                      }else {
                         ox.addChildAt(ox2, oobject1.b);
                      }
                      reactTag = reactTag + 1;
                      i7 = i3;
                   }
                   obj.g.g(ox, ointArray, ointArray1, uoa1Array, ointArray2, ointArray4);
                   for (reactTag = 0; reactTag < i2; reactTag = reactTag + 1) {
                      obj.v(obj.d.a(ointArray2[reactTag]));
                   }
                   _monitor_exit(a);
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
    public void w(x p0){
       x obj;
       int rootTag;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uoa, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "13")) {
          JavaOnlyArray movedOutFixe = p0.getMovedOutFixedChildTags();
          if (movedOutFixe != null && movedOutFixe.size() > 0) {
             JavaOnlyArray javaOnlyArra1 = null;
             x ox = javaOnlyArra1;
             JavaOnlyArray javaOnlyArra2 = ox;
             int i1 = 0;
             f uof = null;
             while (i1 < movedOutFixe.size()) {
                x ox1 = this.d.a(movedOutFixe.getInt(i1));
                if (ox1 != null) {
                   if (ox == null) {
                      rootTag = ox1.getRootTag();
                      uof = rootTag;
                      ox = this.d.a(rootTag);
                   }
                   if (javaOnlyArra2 == null) {
                      javaOnlyArra2 = new JavaOnlyArray();
                   }
                   javaOnlyArra2.pushInt(ox.indexOf(ox1));
                }
                i1 = i1 + 1;
             }
             if (uof && (javaOnlyArra2 != null && javaOnlyArra2.size() > 0)) {
                p0.resetMovedOutFixedChildTags(javaOnlyArra1);
                this.n(uof, null, null, null, null, javaOnlyArra2);
             }
          }
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, uoa, "12") && p0.getReactTag() <= 0) {
          int reactTag = p0.getReactTag();
          if (PatchProxy.isSupport(uoa)) {
             obj = PatchProxy.applyOneRefs(Integer.valueOf(reactTag), this, uoa, "4");
             if (obj != PatchProxyResult.class) {
                b = obj.booleanValue();
             }else {
             label_00a3 :
                obj = this.d.a(reactTag);
                if (reactTag > 0 || (obj != null && obj.isBindingVirtualNode())) {
                   b = true;
                }
             }
          }else {
             goto label_00a3 ;
          }
          if (b) {
             obj = this.d.a((- p0.getReactTag()));
             if (obj != null) {
                rootTag = p0.getRootTag();
                JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
                javaOnlyArra.pushInt(this.d.a(rootTag).indexOf(obj));
                if (javaOnlyArra.size() > 0) {
                   x parent = p0.getParent();
                   if (parent != null) {
                      this.H(parent, obj.getReactTag());
                   }
                   this.n(rootTag, null, null, null, null, javaOnlyArra);
                }
             }
          }
       }
    label_00f7 :
       n.h(p0);
       this.d.c(p0.getReactTag());
       for (int i = p0.getChildCount() - 1; i >= 0; i = i - 1) {
          this.w(p0.getChildAt(i));
       }
       p0.removeAndDisposeAllChildren();
       return;
    }
    public void z(int p0,ReadableArray p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uoa, "2")) {
          return;
       }
       f ta = this.a;
       _monitor_enter(ta);
       x ox = this.d.a(p0);
       if (ox == null) {
          a.x("ReactNative", "Tried to setChildren non-existent tag: "+p0);
          _monitor_exit(ta);
          return;
       }else {
          JavaOnlyArray javaOnlyArra = new JavaOnlyArray();
          int i = 0;
          while (i < p1.size()) {
             x ox1 = this.d.a(p1.getInt(i));
             if (ox1 == null) {
                a.g("ReactNative", "Trying to add unknown view tag: "+p1.getInt(i));
             }else if(!this.d.b(p0) && ox1.isFixedNode()){
                this.F(ox1, ox);
                int i1 = - p1.getInt(i);
                ox1 = this.d.a(i1);
                i1 = - p1.getInt(i);
                javaOnlyArra.pushInt(i1);
             }else {
                javaOnlyArra.pushInt(p1.getInt(i));
             }
             ox.addChildAt(ox1, i);
             i = i + 1;
          }
          this.g.i(ox, javaOnlyArra);
          _monitor_exit(ta);
          return;
       }
    }
}
