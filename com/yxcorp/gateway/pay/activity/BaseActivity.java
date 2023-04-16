package com.yxcorp.gateway.pay.activity.BaseActivity;
import lv8.f;
import androidx.fragment.app.FragmentActivity;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.reflect.Field;
import android.content.res.TypedArray;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import ukd.a;
import java.lang.Exception;
import lv8.e;
import android.content.Intent;
import java.lang.Integer;
import fv8.a;
import androidx.fragment.app.c;
import java.util.List;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import lv8.g;
import android.content.res.Resources$Theme;
import lv8.k;
import android.content.pm.ApplicationInfo;
import android.os.Build$VERSION;

public abstract class BaseActivity extends FragmentActivity implements f	// class@0011fd
{
    public a mActivityCallback;
    public int mActivityRequestCode;
    public int mCurrentRequestedOrientation;
    public ActivityInfo mHookedActivityInfo;

    public void BaseActivity(){
       this.mCurrentRequestedOrientation = -9999;
    }
    public String getPageParams(){
       return null;
    }
    public int getStatusColor(){
       return -1;
    }
    public boolean isCustomImmersiveMode(){
       return false;
    }
    public boolean isDarkImmersiveMode(){
       return true;
    }
    public final boolean isTranslucentOrFloating(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, BaseActivity.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = 0;
       try{
          TypedArray typedArray = this.obtainStyledAttributes(Class.forName("com.android.internal.R$styleable").getField("Window").get(objArray));
          Object[] objArray1 = new Object[]{typedArray};
          i = a.b(ActivityInfo.class.getCanonicalName(), "isTranslucentOrFloating", objArray1).booleanValue();
          typedArray.recycle();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return i;
    }
    public boolean needUploadPV(){
       return e.a(this);
    }
    public void onActivityResult(int p0,int p1,Intent p2){
       if (PatchProxy.isSupport(BaseActivity.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, BaseActivity.class, "5")) {
          return;
       }
       super.onActivityResult(p0, p1, p2);
       int i = 0;
       if (p0 == this.mActivityRequestCode) {
          BaseActivity tmActivityCa = this.mActivityCallback;
          this.mActivityCallback = null;
          this.mActivityRequestCode = i;
          if (tmActivityCa != null) {
             tmActivityCa.onActivityCallback(p0, p1, p2);
          }
       }else if(this.getSupportFragmentManager() != null){
          List fragments = this.getSupportFragmentManager().getFragments();
          if (fragments != null) {
             int i1 = fragments.size();
             Fragment[] uFragmentArr = new Fragment[i1];
             fragments.toArray(uFragmentArr);
             while (i < i1) {
                object oobject = uFragmentArr[i];
                if (oobject != null) {
                   oobject.onActivityResult(p0, p1, p2);
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BaseActivity.class, "1")) {
          return;
       }
       this.unSetScreenOrientation();
       super.onCreate(p0);
       this.resetScreenOrientation();
       this.startImmersiveMode();
       if (this.needUploadPV()) {
          g.f(this.getPageName(), this.getPageType(), this.getPageParams());
       }
       return;
    }
    public void onDestroy(){
       if (PatchProxy.applyVoid(null, this, BaseActivity.class, "2")) {
          return;
       }
       super.onDestroy();
       this.mActivityRequestCode = 0;
       this.mActivityCallback = null;
       return;
    }
    public final void resetScreenOrientation(){
       if (PatchProxy.applyVoid(null, this, BaseActivity.class, "9")) {
          return;
       }
       BaseActivity tmCurrentReq = this.mCurrentRequestedOrientation;
       if (-9999 != tmCurrentReq) {
          this.setValue(tmCurrentReq);
       }
       return;
    }
    public final void setValue(int p0){
       BaseActivity uBaseActivit = BaseActivity.class;
       if (PatchProxy.isSupport(uBaseActivit) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uBaseActivit, "8")) {
          return;
       }
       try{
          if (this.mHookedActivityInfo == null) {
             this.mHookedActivityInfo = a.d(this, "mActivityInfo");
          }
          this.mHookedActivityInfo.screenOrientation = p0;
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public void startActivityForCallback(Intent p0,int p1,a p2){
       if (PatchProxy.isSupport(BaseActivity.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, BaseActivity.class, "3")) {
          return;
       }
       this.mActivityRequestCode = p1;
       this.mActivityCallback = p2;
       this.startActivityForResult(p0, p1);
       return;
    }
    public final void startImmersiveMode(){
       if (PatchProxy.applyVoid(null, this, BaseActivity.class, "4")) {
          return;
       }
       if (!this.isCustomImmersiveMode()) {
          int[] ointArray = new int[]{0x101020d};
          TypedArray typedArray = this.getTheme().obtainStyledAttributes(ointArray);
          if (!typedArray.getBoolean(0, 0)) {
             k.b(this, this.getStatusColor(), this.isDarkImmersiveMode(), 0);
          }
          typedArray.recycle();
       }
       return;
    }
    public final boolean targetSdkVersionAbove26(){
       Object obj = PatchProxy.apply(null, this, BaseActivity.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (this.getApplicationInfo().targetSdkVersion > 26) {
          return true;
       }
       return false;
    }
    public final void unSetScreenOrientation(){
       if (PatchProxy.applyVoid(null, this, BaseActivity.class, "6")) {
          return;
       }
       if (this.targetSdkVersionAbove26() && (Build$VERSION.SDK_INT == 26 && (-1 != this.getRequestedOrientation() && this.isTranslucentOrFloating()))) {
          this.mCurrentRequestedOrientation = this.getRequestedOrientation();
          this.setValue(-1);
       }
    label_002e :
       return;
    }
}
