package com.yxcorp.gifshow.init.module.BlockHiddenApiWarningInitModule;
import com.kwai.framework.init.a;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.lang.reflect.Constructor;
import java.lang.Exception;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

public class BlockHiddenApiWarningInitModule extends a	// class@001965
{

    public void BlockHiddenApiWarningInitModule(){
       super();
    }
    public boolean C(){
       return true;
    }
    public int f0(){
       return 19;
    }
    public List g(){
       Class[] obj = PatchProxy.applyWithListener(null, this, BlockHiddenApiWarningInitModule.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       PatchProxy.onMethodExit(BlockHiddenApiWarningInitModule.class, "2");
       return Lists.e(obj);
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, BlockHiddenApiWarningInitModule.class, "1")) {
          return;
       }
       int i = 0;
       int i1 = 1;
       try{
          Class[] uClassArray = new Class[i1];
          uClassArray[i] = String.class;
          Class.forName("android.content.pm.PackageParser$Package").getDeclaredConstructor(uClassArray).setAccessible(i1);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       try{
          Class uClass = Class.forName("android.app.ActivityThread");
          Class[] uClassArray1 = new Class[i];
          Method declaredMeth = uClass.getDeclaredMethod("currentActivityThread", uClassArray1);
          declaredMeth.setAccessible(i1);
          Object[] objArray1 = new Object[i];
          Field declaredFiel = uClass.getDeclaredField("mHiddenApiWarningShown");
          declaredFiel.setAccessible(i1);
          declaredFiel.setBoolean(declaredMeth.invoke(objArray, objArray1), i1);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
       }
       PatchProxy.onMethodExit(BlockHiddenApiWarningInitModule.class, "1");
       return;
    }
}
