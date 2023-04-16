package com.facebook.react.modules.permissions.PermissionsModule;
import je.e;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import android.util.SparseArray;
import java.lang.String;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build$VERSION;
import android.os.Process;
import java.lang.Boolean;
import je.d;
import com.kwai.robust.PatchProxyResult;
import android.app.Activity;
import java.lang.IllegalStateException;
import java.lang.Integer;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.ArrayList;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.permissions.PermissionsModule$b;
import java.lang.Throwable;
import com.facebook.react.modules.permissions.PermissionsModule$a;

public class PermissionsModule extends ReactContextBaseJavaModule implements e	// class@0012dd
{
    public final String DENIED;
    public final String GRANTED;
    public final String NEVER_ASK_AGAIN;
    public final SparseArray mCallbacks;
    public int mRequestCode;

    public void PermissionsModule(ReactApplicationContext p0){
       super(p0);
       this.mRequestCode = 0;
       this.GRANTED = "granted";
       this.DENIED = "denied";
       this.NEVER_ASK_AGAIN = "never_ask_again";
       this.mCallbacks = new SparseArray();
    }
    public void checkPermission(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PermissionsModule.class, "1")) {
          return;
       }
       Context baseContext = this.getReactApplicationContext().getBaseContext();
       boolean b = true;
       if (Build$VERSION.SDK_INT < 23) {
          if (baseContext.checkPermission(p0, Process.myPid(), Process.myUid())) {
             b = false;
          }
          p1.resolve(Boolean.valueOf(b));
          return;
       }else if(!baseContext.checkSelfPermission(p0)){
          b = false;
       }
       p1.resolve(Boolean.valueOf(b));
       return;
    }
    public String getName(){
       return "PermissionsAndroid";
    }
    public final d getPermissionAwareActivity(){
       Activity obj = PatchProxy.apply(null, this, PermissionsModule.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.getCurrentActivity();
       if (obj == null) {
          throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
       }
       if (obj instanceof d) {
          return obj;
       }
       throw new IllegalStateException("Tried to use permissions API but the host Activity doesn\'t implement PermissionAwareActivity.");
    }
    public boolean onRequestPermissionsResult(int p0,String[] p1,int[] p2){
       if (PatchProxy.isSupport(PermissionsModule.class)) {
          p1 = PatchProxy.applyThreeRefs(Integer.valueOf(p0), p1, p2, this, PermissionsModule.class, "5");
          if (p1 != PatchProxyResult.class) {
             return p1.booleanValue();
          }
       }
       Object[] objArray = new Object[]{p2,this.getPermissionAwareActivity()};
       int i = 0;
       this.mCallbacks.get(p0).invoke(objArray);
       this.mCallbacks.remove(p0);
       if (!this.mCallbacks.size()) {
          i = true;
       }
       return i;
    }
    public void requestMultiplePermissions(ReadableArray p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PermissionsModule.class, "4")) {
          return;
       }
       WritableNativeMap writableNati = new WritableNativeMap();
       ArrayList uArrayList = new ArrayList();
       Context baseContext = this.getReactApplicationContext().getBaseContext();
       int i = 0;
       int i1 = 0;
       while (i < p0.size()) {
          String str = p0.getString(i);
          String str1 = "granted";
          if (Build$VERSION.SDK_INT < 23) {
             if (baseContext.checkPermission(str, Process.myPid(), Process.myUid())) {
                str1 = "denied";
             }
             writableNati.putString(str, str1);
          }else if(!baseContext.checkSelfPermission(str)){
             writableNati.putString(str, str1);
          }else {
             uArrayList.add(str);
          label_0056 :
             i = i + 1;
          }
          i1 = i1 + 1;
          goto label_0056 ;
       }
       if (p0.size() == i1) {
          p1.resolve(writableNati);
          return;
       }else {
          try{
             this.mCallbacks.put(this.mRequestCode, new PermissionsModule$b(this, uArrayList, writableNati, p1));
             String[] stringArray = new String[0];
             this.getPermissionAwareActivity().N7(uArrayList.toArray(stringArray), this.mRequestCode, this);
             this.mRequestCode = this.mRequestCode + 1;
          }catch(java.lang.IllegalStateException e11){
             p1.reject("E_INVALID_ACTIVITY", e11);
          }
          return;
       }
    }
    public void requestPermission(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PermissionsModule.class, "3")) {
          return;
       }
       Context baseContext = this.getReactApplicationContext().getBaseContext();
       String str = "granted";
       if (Build$VERSION.SDK_INT < 23) {
          if (baseContext.checkPermission(p0, Process.myPid(), Process.myUid())) {
             str = "denied";
          }
          p1.resolve(str);
          return;
       }else if(!baseContext.checkSelfPermission(p0)){
          p1.resolve(str);
          return;
       }else {
          try{
             this.mCallbacks.put(this.mRequestCode, new PermissionsModule$a(this, p1, p0));
             String[] stringArray = new String[]{p0};
             this.getPermissionAwareActivity().N7(stringArray, this.mRequestCode, this);
             this.mRequestCode = this.mRequestCode + 1;
          }catch(java.lang.IllegalStateException e5){
             p1.reject("E_INVALID_ACTIVITY", e5);
          }
          return;
       }
    }
    public void shouldShowRequestPermissionRationale(String p0,Promise p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PermissionsModule.class, "2")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 23) {
          p1.resolve(Boolean.FALSE);
          return;
       }else {
          try{
             p1.resolve(Boolean.valueOf(this.getPermissionAwareActivity().shouldShowRequestPermissionRationale(p0)));
          }catch(java.lang.IllegalStateException e3){
             p1.reject("E_INVALID_ACTIVITY", e3);
          }
          return;
       }
    }
}
