package com.yxcorp.gifshow.util.ViewPreDrawMonitor;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewTreeObserver$OnDrawListener;
import com.yxcorp.gifshow.util.v0;
import ok.x;
import com.google.common.base.Suppliers;
import java.lang.Object;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Field;
import com.yxcorp.utility.Log;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.lang.StringBuilder;
import java.lang.reflect.Method;
import android.view.Surface;
import java.io.PrintWriter;
import lnc.xa;
import java.io.Writer;
import java.io.FileDescriptor;
import android.app.Activity;
import java.lang.Exception;
import java.lang.Throwable;
import hn5.i0;
import com.yxcorp.gifshow.util.ViewPreDrawMonitor$PreDrawErrorException;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;

public class ViewPreDrawMonitor implements ViewTreeObserver$OnPreDrawListener, ViewTreeObserver$OnDrawListener	// class@001f35
{
    public int b;
    public int c;
    public View d;
    public b e;
    public boolean f;
    public boolean g;
    public Activity h;
    public static final x i;

    static {
       ViewPreDrawMonitor.i = Suppliers.a(v0.b);
    }
    public void ViewPreDrawMonitor(){
       super();
       this.f = true;
    }
    public void onDraw(){
       if (this.f != null && !this.d.getVisibility()) {
          this.b = this.b - 1;
       }
       return;
    }
    public boolean onPreDraw(){
       if (this.f == null || this.d.getVisibility()) {
          this.b = 0;
          return true;
       }else {
          ViewPreDrawMonitor tb = this.b;
          Class uClass = 5;
          if (tb > uClass && this.c < uClass) {
             try{
                ViewTreeObserver viewTreeObse = this.d.getViewTreeObserver();
                Field declaredFiel = viewTreeObse.getClass().getDeclaredField("mOnPreDrawListeners");
                declaredFiel.setAccessible(true);
                List obj = declaredFiel.get(viewTreeObse);
                if (obj == null) {
                   Log.d("ViewPreDrawMonitor", "dump fail! 反射获取 onPreDrawListeners 失败！");
                }else {
                   Field declaredFiel1 = obj.getClass().getDeclaredField("mData");
                   declaredFiel1.setAccessible(true);
                   obj = declaredFiel1.get(obj);
                   if (obj == null) {
                      Log.d("ViewPreDrawMonitor", "dump fail! 反射获取 mData 失败！");
                   }else {
                      ArrayList uArrayList = new ArrayList(obj);
                      StringBuilder str = "";
                      int i = 0;
                      StringBuilder str1 = null;
                      String str2 = ",";
                      while (i < uArrayList.size()) {
                         ViewTreeObserver$OnPreDrawListener onPreDrawLis = uArrayList.get(i);
                         if (onPreDrawLis != this && !onPreDrawLis.onPreDraw()) {
                            Log.d("ViewPreDrawMonitor", "dump success!  发现onPreDraw返回false的监听:"+onPreDrawLis.getClass());
                            str = str+"["+"listener"+i+str2+onPreDrawLis.getClass()+"]";
                            viewTreeObse.removeOnPreDrawListener(onPreDrawLis);
                            str1 = 1;
                         }else {
                            Log.d("ViewPreDrawMonitor", "dump success!  发现onPreDraw返回true的监听:"+onPreDrawLis.getClass());
                         }
                         i = i + 1;
                      }
                      if (str1 == null) {
                         Log.d("ViewPreDrawMonitor", "dump fail!  没有发现onPreDraw返回false的监听");
                         str = str+"other reason:";
                         Class[] uClassArray = new Class[0];
                         Method declaredMeth = View.class.getDeclaredMethod("getViewRootImpl", uClassArray);
                         declaredMeth.setAccessible(true);
                         Object[] objArray = new Object[0];
                         Object obj1 = declaredMeth.invoke(this.d, objArray);
                         if (obj1 != null) {
                            Class[] uClassArray1 = new Class[0];
                            Method declaredMeth1 = obj1.getClass().getDeclaredMethod("getHostVisibility", uClassArray1);
                            declaredMeth1.setAccessible(true);
                            objArray = new Object[0];
                            declaredFiel1 = obj1.getClass().getDeclaredField("mReportNextDraw");
                            declaredFiel1.setAccessible(true);
                            str = str+"visible:"+declaredMeth1.invoke(obj1, objArray)+str2+"reportNextDraw:"+declaredFiel1.get(obj1)+str2;
                            declaredFiel1 = obj1.getClass().getDeclaredField("mAttachInfo");
                            declaredFiel1.setAccessible(true);
                            Surface obj2 = declaredFiel1.get(obj1);
                            if (obj2 != null) {
                               Field declaredFiel2 = obj2.getClass().getDeclaredField("mDisplayState");
                               declaredFiel2.setAccessible(true);
                               obj2 = declaredFiel2.get(obj2);
                               str = str+"displayState:"+obj2+str2;
                            }
                            declaredFiel1 = obj1.getClass().getDeclaredField("mView");
                            declaredFiel1.setAccessible(true);
                            str = str+"view:"+declaredFiel1.get(obj1)+str2;
                            declaredFiel1 = obj1.getClass().getDeclaredField("mSurface");
                            declaredFiel1.setAccessible(true);
                            obj2 = declaredFiel1.get(obj1);
                            if (obj2 != null) {
                               str = str+"surfaceV:"+obj2.isValid()+str2;
                            }
                            declaredFiel1 = obj1.getClass().getDeclaredField("mSurfaceHolder");
                            declaredFiel1.setAccessible(true);
                            obj1 = declaredFiel1.get(obj1);
                            str = str+"surfaceHolder:"+obj1+str2;
                            this.h.dump(str2, null, new PrintWriter(new xa(this, str)), null);
                         }
                      }
                      Log.e("ViewPreDrawMonitor", "error:", new Exception(str));
                      i0.b("ViewPreDrawMonitor", str);
                      ExceptionHandler.handleCaughtException(new ViewPreDrawMonitor$PreDrawErrorException(str));
                   }
                }
             }catch(java.lang.Exception e0){
                e0.printStackTrace();
             }
             this.c = this.c + true;
             this.b = 0;
             return true;
          }else {
             this.b = tb + true;
             return true;
          }
       }
    }
}
