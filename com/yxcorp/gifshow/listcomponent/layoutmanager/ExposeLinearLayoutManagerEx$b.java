package com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$b;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx;
import androidx.recyclerview.widget.RecyclerView$LayoutManager;
import java.lang.Object;
import java.lang.String;
import java.lang.reflect.Field;
import java.lang.Class;
import i1b.d;
import java.lang.Exception;
import q87.c;
import com.kwai.robust.PatchProxy;
import android.view.View;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.util.List;

public class ExposeLinearLayoutManagerEx$b	// class@001a6e
{
    public Object a;
    public Method b;
    public Method c;
    public Method d;
    public Method e;
    public Field f;
    public Object g;
    public Method h;
    public Method i;
    public Field j;
    public List k;
    public final RecyclerView$LayoutManager l;
    public final Object[] m;
    public final ExposeLinearLayoutManagerEx n;

    public void ExposeLinearLayoutManagerEx$b(ExposeLinearLayoutManagerEx p0,RecyclerView$LayoutManager p1){
       this.n = p0;
       super();
       Object[] objArray = new Object[1];
       this.m = objArray;
       try{
          this.l = p1;
          Field declaredFiel = RecyclerView$LayoutManager.class.getDeclaredField("mChildHelper");
          this.j = declaredFiel;
          declaredFiel.setAccessible(1);
          this.a();
       }catch(java.lang.Exception e4){
          Object[] objArray1 = new Object[]{e4.getMessage()};
          d.C().t("Expose", "ChildHelperWrapper get null", objArray1);
       }
       return;
    }
    public void a(){
       Object[] objArray1;
       Class[] uClassArray;
       Method declaredMeth;
       Class[] uClassArray2;
       Field declaredFiel1;
       String str = "findHiddenNonRemovedView";
       if (PatchProxy.applyVoid(null, this, ExposeLinearLayoutManagerEx$b.class, "1")) {
          return;
       }
       int i = 1;
       try{
          if (this.a == null) {
             Class obj = this.j.get(this.l);
             this.a = obj;
             if (obj == null) {
                objArray1 = new Object[0];
                d.C().t("Expose", "mInnerChildHelper is null", objArray1);
                return;
             }else {
                obj = obj.getClass();
                try{
                   objArray1 = 2;
                   uClassArray = new Class[i];
                   uClassArray[0] = View.class;
                   declaredMeth = obj.getDeclaredMethod("hide", uClassArray);
                   this.b = declaredMeth;
                   declaredMeth.setAccessible(i);
                }catch(java.lang.Exception e6){
                   Object[] objArray2 = new Object[objArray1];
                   objArray2[0] = e6.getMessage();
                   objArray2[i] = obj.getName();
                   d.C().t("Expose", "mHideMethod is null", objArray2);
                }
                Field declaredFiel = obj.getDeclaredField("mBucket");
                declaredFiel.setAccessible(i);
                Object obj1 = declaredFiel.get(this.a);
                this.g = obj1;
                Class[] uClassArray1 = new Class[i];
                Class tYPE = Integer.TYPE;
                uClassArray1[0] = tYPE;
                declaredMeth = obj1.getClass().getDeclaredMethod("clear", uClassArray1);
                this.h = declaredMeth;
                declaredMeth.setAccessible(i);
                uClassArray = new Class[0];
                declaredMeth = obj.getDeclaredMethod("removeAllViewsUnfiltered", uClassArray);
                this.i = declaredMeth;
                try{
                   declaredMeth.setAccessible(i);
                   uClassArray2 = new Class[objArray1];
                   uClassArray2[0] = tYPE;
                   uClassArray2[i] = tYPE;
                   Method declaredMeth1 = obj.getDeclaredMethod(str, uClassArray2);
                   this.c = declaredMeth1;
                   declaredMeth1.setAccessible(i);
                }catch(java.lang.NoSuchMethodException e0){
                   uClassArray2 = new Class[i];
                   uClassArray2[0] = Integer.TYPE;
                   Method declaredMeth2 = obj.getDeclaredMethod(e0, uClassArray2);
                   this.d = declaredMeth2;
                   declaredMeth2.setAccessible(i);
                }catch(java.lang.Exception e0){
                   Object[] objArray = new Object[i];
                   objArray[0] = e0.toString();
                   d.C().t("Expose", "ensureChildHelper", objArray);
                }
             }
          }
       }catch(java.lang.Exception e0){
       }
       return;
    }
    public void b(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ExposeLinearLayoutManagerEx$b.class, "2")) {
          return;
       }
       try{
          this.a();
          if (this.k.indexOf(p0) < 0) {
             ExposeLinearLayoutManagerEx$b tm = this.m;
             tm[0] = p0;
             this.b.invoke(this.a, tm);
          }
       }catch(java.lang.Exception e3){
          e3.printStackTrace();
       }
       return;
    }
}
