package com.vivo.push.util.ContextDelegate;
import java.lang.Object;
import android.content.Context;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import java.lang.Exception;
import com.vivo.push.util.ContextDelegate$a;
import com.vivo.push.util.j;
import java.lang.Boolean;
import java.lang.StringBuilder;
import com.vivo.push.util.p;

public class ContextDelegate	// class@0010ab
{
    public static Context mContext;
    public static Method mCreateCredentialProtectedStorageContext;
    public static Method mCreateDeviceProtectedStorageContext;
    public static boolean mDelegateEnable;
    public static Boolean mIsFbeProject;

    public void ContextDelegate(){
       super();
    }
    public static Context createCredentialProtectedStorageContext(Context p0){
       try{
          int i = 0;
          if (ContextDelegate.mCreateCredentialProtectedStorageContext == null) {
             Class[] uClassArray = new Class[i];
             ContextDelegate.mCreateCredentialProtectedStorageContext = Context.class.getMethod("createCredentialProtectedStorageContext", uClassArray);
          }
          Object[] objArray = new Object[i];
          return ContextDelegate.mCreateCredentialProtectedStorageContext.invoke(p0, objArray);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return p0;
       }
    }
    public static Context createDeviceProtectedStorageContext(Context p0){
       try{
          int i = 0;
          if (ContextDelegate.mCreateDeviceProtectedStorageContext == null) {
             Class[] uClassArray = new Class[i];
             ContextDelegate.mCreateDeviceProtectedStorageContext = Context.class.getMethod("createDeviceProtectedStorageContext", uClassArray);
          }
          Object[] objArray = new Object[i];
          return ContextDelegate.mCreateDeviceProtectedStorageContext.invoke(p0, objArray);
       }catch(java.lang.Exception e0){
          e0.printStackTrace();
          return p0;
       }
    }
    public static Context getContext(Context p0){
       if (ContextDelegate.isFBEProject() && p0 != null) {
          Context mContext = ContextDelegate.mContext;
          if (mContext != null) {
             return mContext;
          }else {
             ContextDelegate.setContext(p0);
             p0 = ContextDelegate.mContext;
          }
       }
       return p0;
    }
    public static ContextDelegate getInstance(){
       return ContextDelegate$a.a();
    }
    public static boolean isFBEProject(){
       Boolean mIsFbeProjec;
       String str = "mIsFbeProject = ";
       if (ContextDelegate.mIsFbeProject == null) {
          try{
             boolean b = (("file").equals(j.a("ro.crypto.type", "unknow")))? true: false;
             ContextDelegate.mIsFbeProject = Boolean.valueOf(b);
             p.b("ContextDelegate", str+ContextDelegate.mIsFbeProject.toString());
          }catch(java.lang.Exception e2){
             p.a("ContextDelegate", str+e2.getMessage());
          }
       }
    }
    public static void setAppContext(){
       Context mContext = ContextDelegate.mContext;
       if (mContext == null) {
          return;
       }
       ContextDelegate.setContext(mContext);
       return;
    }
    public static void setContext(Context p0){
       if (!ContextDelegate.mDelegateEnable) {
          ContextDelegate.mContext = ContextDelegate.createCredentialProtectedStorageContext(p0);
          return;
       }else {
          ContextDelegate.mContext = ContextDelegate.createDeviceProtectedStorageContext(p0);
          return;
       }
    }
    public static void setEnable(boolean p0){
       ContextDelegate.mDelegateEnable = p0;
       ContextDelegate.setAppContext();
    }
}
