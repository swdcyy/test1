package com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$c;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.NoSuchMethodException;
import java.lang.RuntimeException;
import java.lang.Throwable;
import androidx.recyclerview.widget.RecyclerView$y;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import androidx.recyclerview.widget.RecyclerView$t;
import android.view.View;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;

public class ExposeLinearLayoutManagerEx$c	// class@001a6f
{
    public Method a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public List m;

    public void ExposeLinearLayoutManagerEx$c(){
       super();
       Method method = null;
       this.a = method;
       boolean b = false;
       this.b = b;
       this.c = true;
       this.j = b;
       this.k = b;
       this.l = b;
       try{
          this.m = method;
          Class[] uClassArray = new Class[b];
          method = RecyclerView$ViewHolder.class.getDeclaredMethod("isRemoved", uClassArray);
          this.a = method;
          method.setAccessible(true);
          return;
       }catch(java.lang.NoSuchMethodException e0){
          e0.printStackTrace();
          throw new RuntimeException(e0);
       }
    }
    public boolean a(RecyclerView$y p0){
       ExposeLinearLayoutManagerEx$c obj = PatchProxy.applyOneRefs(p0, this, ExposeLinearLayoutManagerEx$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.f;
       boolean b = (obj >= null && obj < p0.c())? true: false;
       return b;
    }
    public View b(RecyclerView$t p0){
       int b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       ExposeLinearLayoutManagerEx$c uoc = ExposeLinearLayoutManagerEx$c.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, uoc, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (this.m != null) {
          Object[] objArray = null;
          Object obj1 = PatchProxy.apply(objArray, this, uoc, "3");
          if (obj1 != patchProxyRe) {
             objArray = obj1;
          }else {
             int i = this.m.size();
             obj1 = Integer.MAX_VALUE;
             Object[] objArray1 = objArray;
             int i1 = 0;
             while (i1 < i) {
                RecyclerView$ViewHolder viewHolder = this.m.get(i1);
                if (this.l == null) {
                   try{
                      Object[] objArray2 = new Object[0];
                      b = this.a.invoke(viewHolder, objArray2).booleanValue();
                   label_0053 :
                      if (this.l != null || !b) {
                      label_005a :
                         b = viewHolder.getPosition() - this.f;
                         b = b * this.g;
                         if (b >= 0 && b < obj1) {
                            objArray1 = viewHolder;
                            if (!b) {
                               break ;
                            }else {
                               int i2 = b;
                            }
                         }
                      }
                   }catch(java.lang.IllegalAccessException e6){
                      e6.printStackTrace();
                   }catch(java.lang.reflect.InvocationTargetException e6){
                      e6.printStackTrace();
                   }
                   b = false;
                   goto label_0053 ;
                }else {
                   goto label_005a ;
                }
                i1 = i1 + 1;
             }
             if (objArray1 != null) {
                this.f = objArray1.getPosition() + this.g;
                objArray = objArray1.itemView;
             }
          }
          return objArray;
       }else {
          this.f = this.f + this.g;
          return p0.o(this.f);
       }
    }
}
