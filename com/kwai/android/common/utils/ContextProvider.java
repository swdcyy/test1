package com.kwai.android.common.utils.ContextProvider;
import java.lang.Object;
import android.content.Context;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Method;
import android.app.Application;

public class ContextProvider	// class@00099b
{
    public static Context _Context;

    public void ContextProvider(){
       super();
    }
    public static Context getContext(){
       Context _Context = ContextProvider._Context;
       if (_Context != null) {
          return _Context.getApplicationContext();
       }
       Class uClass = Class.forName("android.app.ActivityThread");
       Class[] uClassArray = new Class[0];
       Method declaredMeth = uClass.getDeclaredMethod("currentActivityThread", uClassArray);
       declaredMeth.setAccessible(true);
       Object[] objArray = new Object[0];
       Class[] uClassArray1 = new Class[0];
       Method declaredMeth1 = uClass.getDeclaredMethod("getApplication", uClassArray1);
       declaredMeth1.setAccessible(true);
       Object[] objArray1 = new Object[0];
       Context applicationC = declaredMeth1.invoke(declaredMeth.invoke(null, objArray), objArray1).getApplicationContext();
       ContextProvider._Context = applicationC;
       return applicationC.getApplicationContext();
    }
    public static void init(Context p0){
       ContextProvider._Context = p0;
    }
}
