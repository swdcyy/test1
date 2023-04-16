package ze.m;
import ze.f;
import com.facebook.react.uimanager.l;
import com.facebook.react.uimanager.RootViewManager;
import java.lang.Object;
import we.a;
import ff.c;
import android.util.SparseArray;
import android.graphics.RectF;
import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import ze.a1;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;
import android.view.View;
import android.graphics.Matrix;
import android.view.ViewParent;
import java.lang.Math;
import com.facebook.react.bridge.UiThreadUtil;
import yd.e;
import com.facebook.react.uimanager.ViewManager;
import cb.a;
import android.util.SparseIntArray;
import java.lang.Integer;
import ze.n0;
import android.content.Context;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import java.lang.Number;
import java.util.List;
import java.util.Arrays;
import com.facebook.react.uimanager.IllegalViewOperationException;
import java.lang.Long;
import ze.z;
import java.lang.Boolean;
import java.lang.Throwable;
import com.facebook.react.bridge.SoftAssertions;
import hg.b$b;
import hg.b;
import ze.m0;
import hg.a;
import com.facebook.react.bridge.ReadableArray;
import ze.m$a;
import ff.d;
import android.view.View$MeasureSpec;
import ze.h0;
import ze.g;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import android.view.Menu;
import java.lang.CharSequence;
import android.view.MenuItem;
import ze.m$b;
import android.widget.PopupMenu$OnMenuItemClickListener;
import android.widget.PopupMenu$OnDismissListener;
import com.facebook.react.bridge.ReadableMap;
import ze.i0;
import com.facebook.react.uimanager.NoSuchNativeViewException;
import android.content.res.Resources;
import java.lang.Float;
import ze.o0;

public class m implements f	// class@003208
{
    public final SparseArray a;
    public final SparseArray b;
    public final SparseBooleanArray c;
    public final l d;
    public final a e;
    public final RootViewManager f;
    public final c g;
    public final SparseArray h;
    public final int[] i;
    public final RectF j;
    public boolean k;
    public PopupMenu l;
    public int m;
    public static final String n = "m";

    public void m(l p0){
       super(p0, new RootViewManager());
    }
    public void m(l p0,RootViewManager p1){
       super();
       this.e = new a();
       this.g = new c();
       this.h = new SparseArray();
       int[] ointArray = new int[100];
       this.i = ointArray;
       this.j = new RectF();
       this.m = 0;
       this.d = p0;
       this.a = new SparseArray();
       this.b = new SparseArray();
       this.c = new SparseBooleanArray();
       this.f = p1;
    }
    public static String D(ViewGroup p0,ViewGroupManager p1,int[] p2,a1[] p3,int[] p4){
       StringBuilder obj;
       int i;
       int i3;
       int i4;
       int i5;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          obj = PatchProxy.apply(objArray, null, om, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = "";
       if (p0 != null) {
          obj = obj+"View tag:"+p0.getId()+"\n"+"  children\("+p1.getChildCount(p0)+"\): [\n";
          for (i = 0; i < p1.getChildCount(p0); i = i + 16) {
             int i1 = 0;
             int i2 = i + i1;
             while (i2 < p1.getChildCount(p0) && i1 < 16) {
                obj = obj+p1.getChildAt(p0, i2).getId()+",";
                i1 = i1 + 1;
             }
             obj = obj+"\n";
          }
          obj = obj+" ],\n";
       }
       if (p2 != null) {
          obj = obj+"  indicesToRemove\("+p2.length+"\): [\n";
          for (i3 = 0; i3 < p2.length; i3 = i3 + 16) {
             i4 = 0;
             i = i3 + i4;
             while (i < p2.length && i4 < 16) {
                obj = obj+p2[i]+",";
                i4++;
             }
             obj = obj+"\n";
          }
          obj = obj+" ],\n";
       }
       if (p3 != null) {
          obj = obj+"  viewsToAdd\("+p3.length+"\): [\n";
          for (i3 = 0; i3 < p3.length; i3 = i3 + 16) {
             i4 = 0;
             i5 = i3 + i4;
             while (i5 < p3.length && i4 < 16) {
                obj = obj+"["+p3[i5].b+","+p3[i5].a+"],";
                i4++;
             }
             obj = obj+"\n";
          }
          obj = obj+" ],\n";
       }
       if (p4 != null) {
          obj = obj+"  tagsToDelete\("+p4.length+"\): [\n";
          for (i3 = 0; i3 < p4.length; i3 = i3 + 16) {
             i4 = 0;
             i5 = i3 + i4;
             while (i5 < p4.length && i4 < 16) {
                obj = obj+p4[i5]+",";
                i4++;
             }
             obj = obj+"\n";
          }
          obj = obj+" ]\n";
       }
       return obj;
    }
    public boolean A(int[] p0,int p1){
       if (p0 == null) {
          return false;
       }
       int len = p0.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return false;
          }
          if (p0[i] == p1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return true;
    }
    public void B(int p0){
       m tm = this.m;
       this.i[tm] = p0;
       this.m = (tm + 1) % 100;
    }
    public final void C(View p0,int[] p1){
       m om = m.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, om, "25")) {
          return;
       }
       this.j.set(0, 0, (float)p0.getWidth(), (float)p0.getHeight());
       m tj = this.j;
       if (!PatchProxy.applyVoidTwoRefs(p0, tj, this, om, "26")) {
          Matrix matrix = p0.getMatrix();
          if (!matrix.isIdentity()) {
             matrix.mapRect(tj);
          }
          tj.offset((float)p0.getLeft(), (float)p0.getTop());
          ViewParent parent = p0.getParent();
          while (parent instanceof View) {
             int i = - parent.getScrollX();
             int i1 = - parent.getScrollY();
             tj.offset((float)i, (float)i1);
             matrix = parent.getMatrix();
             if (!matrix.isIdentity()) {
                matrix.mapRect(tj);
             }
             tj.offset((float)parent.getLeft(), (float)parent.getTop());
             parent = parent.getParent();
          }
       }
       p1[0] = Math.round(this.j.left);
       p1[1] = Math.round(this.j.top);
       om = this.j;
       p1[2] = Math.round((om.right - om.left));
       om = this.j;
       p1[3] = Math.round((om.bottom - om.top));
       return;
    }
    public synchronized void E(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, m.class, "22")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       if (p0 == null) {
          return;
       }
       if (e.E) {
          this.B(p0.getId());
       }
       if (this.b.get(p0.getId()) == null) {
          return;
       }else if(!this.c.get(p0.getId())){
          this.I(p0.getId()).onDropViewInstance(p0);
       }
       ViewManager viewManager = this.b.get(p0.getId());
       if (p0 instanceof ViewGroup && viewManager instanceof ViewGroupManager) {
          ViewGroup viewGroup = p0;
          int i = viewManager.getChildCount(viewGroup) - 1;
          while (i >= 0) {
             View childAt = viewManager.getChildAt(viewGroup, i);
             if (childAt == null) {
                a.g(m.n, "Unable to drop null child view");
             }else if(this.a.get(childAt.getId()) != null){
                this.E(childAt);
             }
             i = i - 1;
          }
          viewManager.removeAllViews(viewGroup);
       }
       this.h.remove(p0.getId());
       this.a.remove(p0.getId());
       this.b.remove(p0.getId());
       return;
    }
    public SparseIntArray F(int p0){
       SparseIntArray obj;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "16");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.h.get(p0);
       if (obj == null) {
          obj = new SparseIntArray();
          this.h.put(p0, obj);
       }
       return obj;
    }
    public final n0 G(int p0){
       View obj;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "36");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.get(p0);
       if (obj != null) {
          return obj.getContext();
       }else {
          throw new JSApplicationIllegalArgumentException("Could not find view with tag "+p0);
       }
    }
    public int H(int p0,SparseIntArray p1){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, om, "15");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       int i1 = p0;
       for (int i = 0; i <= p0; i = i + 1) {
          i1 = i1 + p1.get(i);
       }
       return i1;
    }
    public synchronized final ViewManager I(int p0){
       ViewManager obj;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "3");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.b.get(p0);
       if (obj != null) {
          return obj;
       }else {
          int[][] ointArray = new int[][1]{this.i};
          throw new IllegalViewOperationException("ViewManager for tag "+p0+" could not be found.\n View already dropped? "+Arrays.asList(ointArray).contains(Integer.valueOf(p0))+".\nLast index "+this.m+" in last 100 views"+this.i.toString());
       }
    }
    public final void J(View p0,long p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(p0, Long.valueOf(p1), this, om, "9")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       p0.setTag(R.id.view_tag_instance_handle, Long.valueOf(p1));
       return;
    }
    public final void K(View p0,int p1,int p2,int p3,int p4){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, om, "11")) {
             return;
          }
       }
       if (this.k != null && this.g.g(p0)) {
          this.g.a(p0, p1, p2, p3, p4);
       }else {
          p0.layout(p1, p2, (p3 + p1), (p4 + p2));
       }
       return;
    }
    public synchronized void L(int p0,z p1,boolean p2){
       View view;
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), p1, Boolean.valueOf(p2), this, m.class, "6")) {
          return;
       }
       try{
          UiThreadUtil.assertOnUiThread();
          ViewManager viewManager = this.I(p0);
          view = this.p(p0);
          if (viewManager == null || view == null) {
             return;
          }else if(p1 != null){
             viewManager.updateProperties(view, p1, p2);
          }
       }catch(com.facebook.react.uimanager.IllegalViewOperationException e9){
          a.h(m.n, "Unable to update properties for view tag "+p0, e9);
       }
       return;
    }
    public synchronized void a(int p0,int p1,boolean p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Boolean.valueOf(p2), this, m.class, "29")) {
          return;
       }
       if (!p2) {
          this.e.d(p1, null);
          return;
       }else {
          View view = this.a.get(p0);
          if (view == null) {
             a.g(m.n, "Could not find view with tag "+p0+" in setJSResponder");
             return;
          }else if(p1 != p0 && view instanceof ViewParent){
             this.e.d(p1, view);
             return;
          }else if(this.c.get(p0)){
             SoftAssertions.assertUnreachable("Cannot block native responder on "+p0+" that is a root view");
          }
          this.e.d(p1, view.getParent());
          return;
       }
    }
    public synchronized void b(int p0,int p1,int p2){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, m.class, "13")) {
          return;
       }
       View view = this.a.get(p0);
       ViewGroup viewGroup = this.a.get(p1);
       if (view == null || viewGroup == null) {
          return;
       }
       ViewGroup parent = view.getParent();
       if (parent == null) {
          return;
       }
       parent.removeViewAt(parent.indexOfChild(view));
       viewGroup.addView(view, p2);
       return;
    }
    public synchronized void c(n0 p0,int p1,String p2,z p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), p2, p3, this, m.class, "12")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       b.a(0, "NativeViewHierarchyManager_createView").b("tag", p1).d("className", p2).e();
       ViewManager viewManager = this.d.a(p2);
       View view = viewManager.createView(p0, null, null, this.e);
       this.a.put(p1, view);
       this.b.put(p1, viewManager);
       view.setId(p1);
       if (p3 != null) {
          viewManager.updateProperties(view, p3);
       }
       a.c(0, "NativeViewHierarchyManager_createView");
       return;
    }
    public synchronized void d(int p0,ReadableArray p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "19")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       View view = this.a.get(p0);
       if (view == null) {
          return;
       }
       ViewGroupManager viewGroupMan = this.I(p0);
       int i = 0;
       while (i < p1.size()) {
          View view1 = this.a.get(p1.getInt(i));
          if (view1 == null) {
             String n = m.n;
             StringBuilder str = "Trying to add unknown view tag: "+p1.getInt(i)+"\n detail: ";
             String str1 = PatchProxy.applyThreeRefs(view, viewGroupMan, p1, null, m.class, "18");
             if (str1 != PatchProxyResult.class) {
             }else {
                a1[] uoa1Array = new a1[p1.size()];
                for (int i1 = 0; i1 < p1.size(); i1 = i1 + 1) {
                   uoa1Array[i1] = new a1(p1.getInt(i1), i1);
                }
                str1 = m.D(view, viewGroupMan, null, uoa1Array, null);
             }
             a.g(n, str+str1);
          }else {
             viewGroupMan.addView(view, view1, i);
          }
          i = i + 1;
       }
       return;
    }
    public synchronized void e(int p0,int[] p1,a1[] p2,int[] p3,int[] p4){
       SparseIntArray sparseIntArr1;
       ViewManager viewManager1;
       View view;
       SparseIntArray sparseIntArr2;
       Object obj = this;
       int i = p0;
       object oobject = p1;
       object oobject1 = p2;
       object oobject2 = p3;
       m om = m.class;
       int i1 = 0;
       int i2 = 1;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,oobject2,p4};
          if (PatchProxy.applyVoid(objArray, obj, om, "17")) {
             return;
          }
       }
       UiThreadUtil.assertOnUiThread();
       SparseIntArray sparseIntArr = this.F(p0);
       Object obj1 = obj.a.get(i);
       ViewManager viewManager = this.I(p0);
       if (obj1 == null) {
          a.g(m.n, "Trying to manageChildren view with tag "+i+" which doesn\'t exist\n detail: "+m.D(obj1, viewManager, oobject, oobject1, oobject2));
          return;
       }else {
          int childCount = viewManager.getChildCount(obj1);
          if (oobject != null) {
             int i3 = oobject.length - i2;
             while (true) {
                if (i3 >= 0) {
                   int i4 = oobject[i3];
                   if (i4 >= 0) {
                      if (i4 >= viewManager.getChildCount(obj1)) {
                         if (obj.c.get(i) && !viewManager.getChildCount(obj1)) {
                            return;
                         }else {
                            throw new IllegalViewOperationException("Trying to remove a view index above child count "+i4+" view tag: "+i+"\n detail: "+m.D(obj1, viewManager, oobject, oobject1, oobject2));
                         }
                      }else if(i4 < childCount){
                         childCount = obj.H(i4, sparseIntArr);
                         View childAt = viewManager.getChildAt(obj1, childCount);
                         if (obj.k == null || (!obj.g.g(childAt) || !obj.A(oobject2, childAt.getId()))) {
                            viewManager.removeViewAt(obj1, childCount);
                         }
                         i3 = i3 - 1;
                         childCount = i4;
                      }else {
                         throw new IllegalViewOperationException("Trying to remove an out of order view index:"+i4+" view tag: "+i+"\n detail: "+m.D(obj1, viewManager, oobject, oobject1, oobject2));
                      }
                   }else {
                      throw new IllegalViewOperationException("Trying to remove a negative view index:"+i4+" view tag: "+i+"\n detail: "+m.D(obj1, viewManager, oobject, oobject1, oobject2));
                   }
                }
             }
          }
          if (oobject2 != null) {
             i = 0;
             while (i < oobject2.length) {
                childCount = oobject2[i];
                int i5 = p4[i];
                Object obj2 = obj.a.get(childCount);
                if (obj2 == null) {
                   a.g(m.n, "Trying to destroy unknown view tag: "+childCount+"\n detail: "+m.D(obj1, viewManager, oobject, oobject1, oobject2));
                   sparseIntArr1 = sparseIntArr;
                   viewManager1 = viewManager;
                }else if(obj.k != null && obj.g.g(obj2)){
                   childCount = sparseIntArr.get(i5, i1) + i2;
                   sparseIntArr.put(i5, childCount);
                   m$a uoa = v3;
                   m$a uoa1 = v3;
                   sparseIntArr1 = sparseIntArr;
                   viewManager1 = viewManager;
                   uoa = new m$a(this, viewManager, obj1, obj2, sparseIntArr, i5);
                   obj.g.b(obj2, uoa1);
                }else {
                   sparseIntArr1 = sparseIntArr;
                   viewManager1 = viewManager;
                   obj.E(obj2);
                }
                i = i + 1;
                viewManager = viewManager1;
                sparseIntArr = sparseIntArr1;
                i1 = 0;
                i2 = 1;
             }
          }
          sparseIntArr1 = sparseIntArr;
          viewManager1 = viewManager;
          if (oobject1 != null) {
             i1 = 0;
             while (i1 < oobject1.length) {
                object oobject3 = oobject1[i1];
                view = obj.a.get(oobject3.a);
                if (view == null) {
                   a.g(m.n, "Trying to add unknown view tag: "+oobject3.a+"\n detail: "+m.D(obj1, viewManager1, oobject, oobject1, oobject2));
                   sparseIntArr2 = sparseIntArr1;
                }else {
                   sparseIntArr2 = sparseIntArr1;
                   viewManager1.addView(obj1, view, obj.H(oobject3.b, sparseIntArr2));
                }
                i1 = i1 + 1;
                sparseIntArr1 = sparseIntArr2;
             }
          }
          return;
       }
    }
    public synchronized void f(int p0,int p1,int p2,int p3,int p4,int p5){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, om, "8")) {
             return;
          }
       }
       UiThreadUtil.assertOnUiThread();
       b.a(0, "NativeViewHierarchyManager_updateLayout").b("parentTag", p0).b("tag", p1).e();
       View view = this.p(p1);
       view.measure(View$MeasureSpec.makeMeasureSpec(p4, 0x40000000), View$MeasureSpec.makeMeasureSpec(p5, 0x40000000));
       ViewParent parent = view.getParent();
       if (parent instanceof h0) {
          parent.requestLayout();
       }
       if (!this.c.get(p0)) {
          ViewManager viewManager = this.b.get(p0);
          if (viewManager instanceof g) {
             if (viewManager != null && !viewManager.needsCustomLayoutForChildren()) {
                this.K(view, p2, p3, p4, p5);
             }
          }else {
             throw new IllegalViewOperationException("Trying to use view with tag "+p0+" as a parent, but its Manager doesn\'t implement IViewManagerWithChildren");
          }
       }else {
          this.K(view, p2, p3, p4, p5);
       }
       a.c(0, "NativeViewHierarchyManager_updateLayout");
       return;
    }
    public synchronized final boolean g(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "1");
          if (obj != PatchProxyResult.class) {
             return obj.booleanValue();
          }
       }
       boolean b = false;
       if (!this.c.get(p0)) {
          ViewManager viewManager = this.b.get(p0);
          if (viewManager instanceof g) {
             if (viewManager.needsCustomLayoutForChildren() || (viewManager.getName()).equals("RCTRefreshView")) {
                b = true;
             }
             return b;
          }else {
             return b;
          }
       }else {
          return b;
       }
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, m.class, "30")) {
          return;
       }
       this.e.b();
       return;
    }
    public void i(){
       if (PatchProxy.applyVoid(null, this, m.class, "32")) {
          return;
       }
       this.g.e();
       return;
    }
    public synchronized void j(int p0,String p1,String p2,ReadableArray p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, m.class, "33")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       View view = this.a.get(p0);
       if (view == null) {
          a.g(m.n, "Trying to send command to a non-existing view with tag "+p0);
          this.d.a(p2).receiveCommandButViewNotExist(p0, p1, p3);
          return;
       }else {
          this.I(p0).receiveCommand(view, p1, p3);
          return;
       }
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, m.class, "35")) {
          return;
       }
       m tl = this.l;
       if (tl != null) {
          tl.dismiss();
       }
       return;
    }
    public synchronized void l(int p0,ReadableArray p1,Callback p2,Callback p3){
       if (PatchProxy.isSupport(m.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), p1, p2, p3, this, m.class, "34")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       View view = this.a.get(p0);
       if (view == null) {
          a.g(m.n, "Can\'t display popup. Could not find view with tag "+p0);
          return;
       }else {
          PopupMenu popupMenu = new PopupMenu(this.G(p0), view);
          this.l = popupMenu;
          Menu menu = popupMenu.getMenu();
          for (int i = 0; i < p1.size(); i = i + 1) {
             menu.add(0, 0, i, p1.getString(i));
          }
          m$b uob = new m$b(p2);
          this.l.setOnMenuItemClickListener(uob);
          this.l.setOnDismissListener(uob);
          this.l.show();
          return;
       }
    }
    public synchronized void m(int p0,z p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "5")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.L(p0, p1, false);
       return;
    }
    public void n(ReadableMap p0,Callback p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, m.class, "31")) {
          return;
       }
       this.g.d(p0, p1);
       return;
    }
    public synchronized void o(int p0,int[] p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "24")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       View view = this.a.get(p0);
       if (view == null) {
          a.g(m.n, "No native view for "+p0+" currently exists");
          return;
       }else {
          View view1 = i0.a(view);
          if (view1 == null) {
             throw new NoSuchNativeViewException("Native view "+p0+" is no longer on screen");
          }
          this.C(view1, p1);
          this.C(view, p1);
          p1[0] = p1[0] - p1[0];
          p1[1] = p1[1] - p1[1];
          return;
       }
    }
    public synchronized final View p(int p0){
       View obj;
       m om = m.class;
       if (PatchProxy.isSupport(om)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, om, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = this.a.get(p0);
       if (obj == null) {
          a.g(m.n, "Trying to resolve view with tag "+p0+" which doesn\'t exist");
       }
       return obj;
    }
    public synchronized void q(int p0,int p1,String p2,ReadableArray p3){
       UiThreadUtil.assertOnUiThread();
       View view = this.a.get(p0);
       if (view == null) {
          a.g(m.n, "Trying to send command to a non-existing view with tag "+p0);
          this.d.a(p2).receiveCommandButViewNotExist(p0, p1, p3);
          return;
       }else {
          this.I(p0).receiveCommand(view, p1, p3);
          return;
       }
    }
    public m r(){
       return this;
    }
    public synchronized void s(int p0,Object p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "7")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       this.I(p0).updateExtraData(this.p(p0), p1);
       return;
    }
    public void sendAccessibilityEvent(int p0,int p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, om, "37")) {
          return;
       }
       View view = this.a.get(p0);
       if (view == null) {
          a.g(m.n, "sendAccessibilityEvent::Could not find view with tag "+p0);
          return;
       }else {
          view.sendAccessibilityEvent(p1);
          return;
       }
    }
    public void t(boolean p0){
       this.k = p0;
    }
    public synchronized void u(int p0,int[] p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "27")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       View view = this.a.get(p0);
       if (view == null) {
          a.g(m.n, "No native view for "+p0+" currently exists");
          return;
       }else {
          view.getLocationOnScreen(p1);
          Resources resources = view.getContext().getResources();
          int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
          if (identifier > 0) {
             identifier = 1;
             p1[identifier] = p1[identifier] - (int)resources.getDimension(identifier);
          }
          p1[2] = view.getWidth();
          p1[3] = view.getHeight();
          return;
       }
    }
    public synchronized void v(int p0,View p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "20")) {
          return;
       }
       this.z(p0, p1);
       return;
    }
    public synchronized void w(int p0,long p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Long.valueOf(p1), this, om, "4")) {
          return;
       }
       try{
          UiThreadUtil.assertOnUiThread();
          this.J(this.p(p0), p1);
       }catch(com.facebook.react.uimanager.IllegalViewOperationException e6){
          a.h(m.n, "Unable to update properties for view tag "+p0, e6);
       }
       return;
    }
    public synchronized void x(int p0){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, om, "23")) {
          return;
       }
       UiThreadUtil.assertOnUiThread();
       a.x("ReactNativeDestroy", "NativeViewHierarchyManager::removeRootView "+p0+":"+this.c.get(p0));
       if (!this.c.get(p0)) {
          if (e.y) {
             return;
          }else {
             SoftAssertions.assertUnreachable("View with tag "+p0+" is not registered as a root view");
          }
       }
       this.E(this.a.get(p0));
       a.x("ReactNativeDestroy", "NativeViewHierarchyManager::after removeRootView "+p0+":"+this.a);
       this.c.delete(p0);
       return;
    }
    public synchronized int y(int p0,float p1,float p2){
       View obj;
       View view;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(m.class)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p0), Float.valueOf(p1), Float.valueOf(p2), this, m.class, "28");
          if (obj != patchProxyRe) {
             return obj.intValue();
          }
       }
       UiThreadUtil.assertOnUiThread();
       obj = this.a.get(p0);
       if (obj == null) {
          a.g(m.n, "Could not find view with tag "+p0);
          return 0;
       }else {
          view = obj;
          if (PatchProxy.isSupport(o0.class)) {
             Object obj1 = PatchProxy.applyThreeRefs(Float.valueOf(p1), Float.valueOf(p2), view, null, o0.class, "1");
             if (obj1 != patchProxyRe) {
                view = obj1.intValue();
             label_007f :
                return view;
             }
          }
          view = o0.a(p1, p2, view, o0.a, null);
          goto label_007f ;
       }
    }
    public synchronized final void z(int p0,View p1){
       m om = m.class;
       if (PatchProxy.isSupport(om) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, om, "21")) {
          return;
       }
       if (p1.getId() != -1) {
          a.g(m.n, "Trying to add a root view with an explicit id \("+p1.getId()+"\) already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
       }
       this.a.put(p0, p1);
       this.b.put(p0, this.f);
       this.c.put(p0, true);
       p1.setId(p0);
       return;
    }
}
