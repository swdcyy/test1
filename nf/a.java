package nf.a;
import ze.m;
import com.facebook.react.uimanager.l;
import com.facebook.react.uimanager.RootViewManager;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import ff.c;
import yd.e;
import com.facebook.react.views.deractors.BackgroundDecorView;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.ViewGroupManager;
import cb.a;
import ze.a1;
import android.util.SparseIntArray;
import java.lang.StringBuilder;
import com.facebook.react.uimanager.IllegalViewOperationException;
import nf.a$a;
import ff.d;
import hg.b$b;
import hg.b;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import ze.h0;
import ze.g;
import hg.a;

public class a extends m	// class@002700
{

    public void a(l p0){
       super(p0, new RootViewManager());
    }
    private void K(View p0,int p1,int p2,int p3,int p4){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{p0,Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "2")) {
             return;
          }
       }
       if (this.k != null && this.g.g(p0)) {
          this.g.a(p0, p1, p2, p3, p4);
       }else if(e.c && BackgroundDecorView.i(p0) != null){
          BackgroundDecorView.i(p0).layout(p1, p2, (p3 + p1), (p4 + p2));
       }else {
          p0.layout(p1, p2, (p3 + p1), (p4 + p2));
       }
       return;
    }
    public synchronized void E(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "4")) {
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
                a.g("KdsNativeViewHierarchyManager", "Unable to drop null child view");
             }else if(this.a.get(childAt.getId()) != null){
                this.E(childAt);
             }else if(e.c && childAt instanceof BackgroundDecorView){
                this.E(childAt.getOriginView());
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
       a uoa = a.class;
       int i1 = 0;
       int i2 = 1;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),oobject,oobject1,oobject2,p4};
          if (PatchProxy.applyVoid(objArray, obj, uoa, "3")) {
             return;
          }
       }
       UiThreadUtil.assertOnUiThread();
       SparseIntArray sparseIntArr = this.F(p0);
       Object obj1 = obj.a.get(i);
       ViewManager viewManager = this.I(p0);
       if (obj1 == null) {
          a.g("KdsNativeViewHierarchyManager", "Trying to manageChildren view with tag "+i+" which doesn\'t exist\n detail: "+m.D(obj1, viewManager, oobject, oobject1, oobject2));
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
                   a.g("KdsNativeViewHierarchyManager", "Trying to destroy unknown view tag: "+childCount+"\n detail: "+m.D(obj1, viewManager, oobject, oobject1, oobject2));
                   sparseIntArr1 = sparseIntArr;
                   viewManager1 = viewManager;
                }else if(obj.k != null && obj.g.g(obj2)){
                   childCount = sparseIntArr.get(i5, i1) + i2;
                   sparseIntArr.put(i5, childCount);
                   a$a uoa1 = v3;
                   a$a uoa2 = v3;
                   sparseIntArr1 = sparseIntArr;
                   viewManager1 = viewManager;
                   uoa1 = new a$a(this, viewManager, obj1, obj2, sparseIntArr, i5);
                   obj.g.b(obj2, uoa2);
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
                   a.g("KdsNativeViewHierarchyManager", "Trying to add unknown view tag: "+oobject3.a+"\n detail: "+m.D(obj1, viewManager1, oobject, oobject1, oobject2));
                   sparseIntArr2 = sparseIntArr1;
                }else {
                   sparseIntArr2 = sparseIntArr1;
                   i = obj.H(oobject3.b, sparseIntArr2);
                   if (e.c && BackgroundDecorView.i(view) != null) {
                      view = BackgroundDecorView.i(view);
                   }
                   viewManager1.addView(obj1, view, i);
                }
                i1 = i1 + 1;
                sparseIntArr1 = sparseIntArr2;
             }
          }
          return;
       }
    }
    public synchronized void f(int p0,int p1,int p2,int p3,int p4,int p5){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4),Integer.valueOf(p5)};
          if (PatchProxy.applyVoid(objArray, this, uoa, "1")) {
             return;
          }
       }
       UiThreadUtil.assertOnUiThread();
       b.a(0, "NativeViewHierarchyManager_updateLayout").b("parentTag", p0).b("tag", p1).e();
       View view = this.p(p1);
       view.measure(View$MeasureSpec.makeMeasureSpec(p4, 0x40000000), View$MeasureSpec.makeMeasureSpec(p5, 0x40000000));
       ViewParent parent = view.getParent();
       if (e.c && BackgroundDecorView.i(view) != null) {
          parent = BackgroundDecorView.i(view).getParent();
       }
       if (parent instanceof h0) {
          parent.requestLayout();
       }
       if (!this.c.get(p0)) {
          ViewManager viewManager = this.b.get(p0);
          ViewManager viewManager1 = null;
          if (viewManager instanceof g) {
             viewManager1 = viewManager;
          }else if(e.r){
             throw new IllegalViewOperationException("Trying to use view with tag "+p0+" as a parent, but its Manager doesn\'t implement IViewManagerWithChildren");
          }
          if (viewManager1 != null && !viewManager1.needsCustomLayoutForChildren()) {
             this.K(view, p2, p3, p4, p5);
          }
       }else {
          this.K(view, p2, p3, p4, p5);
       }
       a.c(0, "NativeViewHierarchyManager_updateLayout");
       return;
    }
}
