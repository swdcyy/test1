package com.sina.weibo.sdk.share.BaseActivity;
import android.app.Activity;
import java.lang.String;
import java.lang.Class;
import java.lang.reflect.Field;
import java.lang.Object;
import android.content.res.TypedArray;
import android.content.pm.ActivityInfo;
import java.lang.reflect.Method;
import java.lang.Boolean;
import java.lang.Exception;
import android.os.Bundle;
import android.os.Build$VERSION;

public class BaseActivity extends Activity	// class@000bcd
{

    public void BaseActivity(){
       super();
    }
    public final boolean h(){
       boolean b;
       Exception uException;
       int i = 0;
       try{
          Class[] uClassArray = new Class[]{TypedArray.class};
          Method method = ActivityInfo.class.getMethod("isTranslucentOrFloating", uClassArray);
          method.setAccessible(1);
          Object[] objArray = new Object[]{this.obtainStyledAttributes(Class.forName("com.android.internal.R$styleable").getField("Window").get(null))};
          b = method.invoke(null, objArray).booleanValue();
          try{
             method.setAccessible(i);
          label_0044 :
             return b;
          }catch(java.lang.Exception e0){
          }
          uException.printStackTrace();
          goto label_0044 ;
       }catch(java.lang.Exception e1){
          uException = e1;
          b = false;
          goto label_0041 ;
       }
    }
    public final boolean i(){
       boolean b = false;
       try{
          Field declaredFiel = Activity.class.getDeclaredField("mActivityInfo");
          declaredFiel.setAccessible(true);
          declaredFiel.get(this).screenOrientation = -1;
          declaredFiel.setAccessible(b);
          return true;
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
          return b;
       }
    }
    public void onCreate(Bundle p0){
       if (Build$VERSION.SDK_INT == 26 && this.h()) {
          this.i();
       }
       super.onCreate(p0);
       return;
    }
    public void setRequestedOrientation(int p0){
       if (Build$VERSION.SDK_INT == 26 && this.h()) {
          return;
       }
       super.setRequestedOrientation(p0);
       return;
    }
}
