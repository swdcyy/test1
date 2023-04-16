package com.kwai.video.stannis.observers.ReflecterHelper;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import android.view.View;
import android.app.Dialog;
import android.os.Message;
import java.lang.IllegalAccessException;
import java.lang.IllegalArgumentException;
import java.lang.NoSuchFieldException;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.SecurityException;
import java.lang.Number;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.ClassNotFoundException;
import java.lang.Exception;

public final class ReflecterHelper	// class@000c65
{
    public static Class mCurrentClass;

    public void ReflecterHelper(){
       super();
    }
    public static void fixInputMethodManagerLeak(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReflecterHelper.class, "19")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       InputMethodManager systemServic = p0.getSystemService("input_method");
       if (systemServic == null) {
          return;
       }
       String[] stringArray = new String[]{"mCurRootView","mServedView","mNextServedView"};
       int i = 0;
       while (i < 3) {
          Field declaredFiel = systemServic.getClass().getDeclaredField(stringArray[i]);
          if (!declaredFiel.isAccessible()) {
             declaredFiel.setAccessible(true);
          }
          Object obj = declaredFiel.get(systemServic);
          if (obj != null && obj instanceof View) {
             if (obj.getContext() == p0) {
                declaredFiel.set(systemServic, null);
             }else {
                break ;
             }
          }
          i = i + 1;
       }
       return;
    }
    public static void fixMesssageLeak(Dialog p0){
       if (PatchProxy.applyVoidOneRefs(p0, null, ReflecterHelper.class, "20")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       String[] stringArray = new String[]{"mDismissMessage","mCancelMessage","mShowMessage"};
       int i = 0;
       while (i < 3) {
          object oobject = stringArray[i];
          try{
             Field declaredFiel = Dialog.class.getDeclaredField(oobject);
             if (declaredFiel != null) {
                if (!declaredFiel.isAccessible()) {
                   declaredFiel.setAccessible(true);
                }
                Object obj = declaredFiel.get(p0);
                if (obj instanceof Message && obj.obj != null) {
                   obj.obj = null;
                   obj.what = 0;
                }
             }
          }catch(java.lang.NoSuchFieldException e5){
             e5.printStackTrace();
          }catch(java.lang.IllegalArgumentException e5){
             e5.printStackTrace();
          }catch(java.lang.IllegalAccessException e5){
             e5.printStackTrace();
          }
          i = i + 1;
       }
       return;
    }
    public static Class[] getArgsClasses(Object[] p0){
       Class[] uClassArray = null;
       Object obj = PatchProxy.applyOneRefs(p0, uClassArray, ReflecterHelper.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 != null) {
          uClassArray = new Class[p0.length];
          int i = 0;
          int len = p0.length;
          while (i < len) {
             uClassArray[i] = (p0[i] != null)? p0[i].getClass(): String.class;
             if (uClassArray[i] == Integer.class) {
                uClassArray[i] = Integer.TYPE;
             }else if(uClassArray[i] == Boolean.class){
                uClassArray[i] = Boolean.TYPE;
             }
             i = i + 1;
          }
       }
       return uClassArray;
    }
    public static final Field getField(String p0){
       Field declaredFiel;
       Object obj = PatchProxy.applyOneRefs(p0, null, ReflecterHelper.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          declaredFiel = ReflecterHelper.mCurrentClass.getDeclaredField(p0);
          declaredFiel.setAccessible(true);
       }catch(java.lang.SecurityException e3){
          e3.printStackTrace();
       }catch(java.lang.NoSuchFieldException e3){
          e3.printStackTrace();
       }
       return declaredFiel;
    }
    public static final int getIntValue(Object p0,String p1,int p2){
       if (PatchProxy.isSupport(ReflecterHelper.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, p1, Integer.valueOf(p2), null, ReflecterHelper.class, "3");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       ReflecterHelper.setClass(p0.getClass().getName());
       Field field = ReflecterHelper.getField(p1);
       if (field != null) {
          try{
             p2 = field.getInt(p0);
          }catch(java.lang.IllegalArgumentException e7){
             e7.printStackTrace();
          }catch(java.lang.IllegalAccessException e7){
             e7.printStackTrace();
          }
       }
    }
    public static Object getProperty(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ReflecterHelper.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return p0.getClass().getField(p1).get(p0);
    }
    public static final int getStaticIntValue(String p0,int p1){
       ReflecterHelper reflecterHel = ReflecterHelper.class;
       if (PatchProxy.isSupport(reflecterHel)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, reflecterHel, "2");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       Field field = ReflecterHelper.getField(p0);
       if (field != null) {
          try{
             p1 = field.getInt(null);
          }catch(java.lang.IllegalArgumentException e4){
             e4.printStackTrace();
          }catch(java.lang.IllegalAccessException e4){
             e4.printStackTrace();
          }
       }
    }
    public static Object getStaticProperty(String p0,String p1){
       Object obj = null;
       Object obj1 = PatchProxy.applyTwoRefs(p0, p1, obj, ReflecterHelper.class, "5");
       if (obj1 != PatchProxyResult.class) {
          return obj1;
       }
       ReflecterHelper.setClass(p0);
       Field field = ReflecterHelper.getField(p1);
       if (field != null) {
          try{
             obj = field.get(obj);
          }catch(java.lang.IllegalArgumentException e3){
             e3.printStackTrace();
          }catch(java.lang.IllegalAccessException e3){
             e3.printStackTrace();
          }
       }
    }
    public static Object invokeMethod(Object p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ReflecterHelper.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReflecterHelper.invokeMethod(p0, p1, null);
    }
    public static Object invokeMethod(Object p0,String p1,Class[] p2,Object[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, ReflecterHelper.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Method method = p0.getClass().getMethod(p1, p2);
       method.setAccessible(true);
       return method.invoke(p0, p3);
    }
    public static Object invokeMethod(Object p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ReflecterHelper.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReflecterHelper.invokeMethod(p0, p1, ReflecterHelper.getArgsClasses(p2), p2);
    }
    public static Object invokeStaticMethod(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ReflecterHelper.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReflecterHelper.invokeStaticMethod(p0, p1, null);
    }
    public static Object invokeStaticMethod(String p0,String p1,Object[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ReflecterHelper.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReflecterHelper.invokeStaticMethod(p0, p1, p2, ReflecterHelper.getArgsClasses(p2));
    }
    public static Object invokeStaticMethod(String p0,String p1,Object[] p2,Class[] p3){
       Object obj = PatchProxy.applyFourRefs(p0, p1, p2, p3, null, ReflecterHelper.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Class uClass = Class.forName(p0);
       return uClass.getDeclaredMethod(p1, p3).invoke(uClass, p2);
    }
    public static Object newInstance(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, ReflecterHelper.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return ReflecterHelper.newInstance(p0, null);
    }
    public static Object newInstance(String p0,Object[] p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, null, ReflecterHelper.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Class.forName(p0).getConstructor(ReflecterHelper.getArgsClasses(p1)).newInstance(p1);
    }
    public static Object newInstance(String p0,Object[] p1,Class[] p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, ReflecterHelper.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Class.forName(p0).getConstructor(p2).newInstance(p1);
    }
    public static final boolean setClass(String p0){
       Class uClass;
       Object obj = PatchProxy.applyOneRefs(p0, null, ReflecterHelper.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       try{
          uClass = Class.forName(p0);
       }catch(java.lang.ClassNotFoundException e3){
          e3.printStackTrace();
       }
       ReflecterHelper.mCurrentClass = uClass;
       boolean b = (uClass != null)? true: false;
       return b;
    }
    public static void setProperty(Object p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ReflecterHelper.class, "13")) {
          return;
       }
       Field field = p0.getClass().getField(p1);
       field.setAccessible(true);
       field.set(p0, p2);
       return;
    }
    public static void setStaticProperty(String p0,String p1,Object p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, null, ReflecterHelper.class, "6")) {
          return;
       }
       ReflecterHelper.setClass(p0);
       Field field = ReflecterHelper.getField(p1);
       if (field != null) {
          boolean b = true;
          try{
             field.setAccessible(b);
             field.set(null, p2);
          }catch(java.lang.IllegalArgumentException e6){
             e6.printStackTrace();
          }catch(java.lang.IllegalAccessException e6){
             e6.printStackTrace();
          }catch(java.lang.Exception e6){
             e6.printStackTrace();
          }
       }
    }
}
