package com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$e;
import androidx.recyclerview.widget.RecyclerView$ViewHolder;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Integer;
import java.lang.NoSuchMethodException;
import java.lang.Object;
import com.kwai.robust.PatchProxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.IllegalAccessException;

public class ExposeLinearLayoutManagerEx$e	// class@001a71
{
    public final RecyclerView$ViewHolder a;
    public static Method b;
    public static Method c;
    public static Method d;
    public static Method e;
    public static Method f;

    static {
       Class tYPE;
       RecyclerView$ViewHolder viewHolder = RecyclerView$ViewHolder.class;
       try{
          Class[] uClassArray = new Class[0];
          Method declaredMeth = viewHolder.getDeclaredMethod("shouldIgnore", uClassArray);
          ExposeLinearLayoutManagerEx$e.b = declaredMeth;
          declaredMeth.setAccessible(true);
          Class[] uClassArray1 = new Class[0];
          declaredMeth = viewHolder.getDeclaredMethod("isInvalid", uClassArray1);
          ExposeLinearLayoutManagerEx$e.c = declaredMeth;
          declaredMeth.setAccessible(true);
          uClassArray1 = new Class[0];
          declaredMeth = viewHolder.getDeclaredMethod("isRemoved", uClassArray1);
          ExposeLinearLayoutManagerEx$e.d = declaredMeth;
          declaredMeth.setAccessible(true);
          uClassArray1 = new Class[]{tYPE,tYPE};
          tYPE = Integer.TYPE;
          declaredMeth = viewHolder.getDeclaredMethod("setFlags", uClassArray1);
          ExposeLinearLayoutManagerEx$e.f = declaredMeth;
          try{
             declaredMeth.setAccessible(true);
             uClassArray1 = new Class[0];
             ExposeLinearLayoutManagerEx$e.e = viewHolder.getDeclaredMethod("isChanged", uClassArray1);
          }catch(java.lang.NoSuchMethodException e0){
             Class[] uClassArray2 = new Class[0];
             ExposeLinearLayoutManagerEx$e.e = e0.getDeclaredMethod("isUpdated", uClassArray2);
          }
          ExposeLinearLayoutManagerEx$e.e.setAccessible(true);
       }catch(java.lang.NoSuchMethodException e0){
          e0.printStackTrace();
       }
    }
    public void ExposeLinearLayoutManagerEx$e(RecyclerView$ViewHolder p0){
       super();
       this.a = p0;
    }
    public static void a(RecyclerView$ViewHolder p0,int p1,int p2){
       if (PatchProxy.isSupport(ExposeLinearLayoutManagerEx$e.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), null, ExposeLinearLayoutManagerEx$e.class, "1")) {
          return;
       }
       try{
          Object[] objArray = new Object[]{Integer.valueOf(p1),Integer.valueOf(p2)};
          ExposeLinearLayoutManagerEx$e.f.invoke(p0, objArray);
       }catch(java.lang.IllegalAccessException e7){
          e7.printStackTrace();
       }catch(java.lang.reflect.InvocationTargetException e7){
          e7.printStackTrace();
       }
       return;
    }
}
