package com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx$d;
import androidx.collection.SimpleArrayMap;
import com.yxcorp.gifshow.listcomponent.layoutmanager.ExposeLinearLayoutManagerEx;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import i1b.d;
import java.lang.Exception;
import q87.c;
import java.lang.reflect.Method;

public class ExposeLinearLayoutManagerEx$d extends SimpleArrayMap	// class@001a70
{
    public final ExposeLinearLayoutManagerEx a;

    public void ExposeLinearLayoutManagerEx$d(ExposeLinearLayoutManagerEx p0){
       this.a = p0;
       super();
    }
    public Object keyAt(int p0){
       ExposeLinearLayoutManagerEx$d uod = ExposeLinearLayoutManagerEx$d.class;
       if (PatchProxy.isSupport(uod)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "2");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       try{
          return super.keyAt(p0);
       }catch(java.lang.Exception e4){
          Object[] objArray = new Object[]{e4.toString()};
          d.C().w("Expose", "viewInfoStore keyAt failed", objArray);
          return null;
       }
    }
    public Object removeAt(int p0){
       Object[] obj;
       Object obj1;
       Object[] objArray;
       ExposeLinearLayoutManagerEx$d uod = ExposeLinearLayoutManagerEx$d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uod, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       try{
          obj1 = super.removeAt(p0);
          if (obj1 != null) {
             return obj1;
          }
       }catch(java.lang.Exception e7){
          objArray = new Object[1];
          objArray[i] = e7.toString();
          d.C().w("Expose", "viewInfoStore removeAt failed", objArray);
       }
       obj1 = null;
       try{
          Object[] objArray1 = new Object[i];
          d.C().w("Expose", "fix viewInfoStore removeAt null crash", objArray1);
          objArray = new Object[i];
          return this.a.D.invoke(obj1, objArray);
       }catch(java.lang.Exception e3){
          obj = new Object[obj];
          obj[i] = e3.toString();
          d.C().w(v1, "fix viewInfoStore failed", obj);
          return obj1;
       }
    }
}
