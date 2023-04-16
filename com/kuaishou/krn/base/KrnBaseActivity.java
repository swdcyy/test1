package com.kuaishou.krn.base.KrnBaseActivity;
import androidx.appcompat.app.AppCompatActivity;
import com.kuaishou.krn.base.KrnBaseActivity$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import ukd.a;
import kotlin.jvm.internal.a;
import android.content.res.TypedArray;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import java.lang.Exception;
import java.lang.Integer;
import android.os.Build$VERSION;
import android.content.Context;
import com.kuaishou.krn.c;
import kj0.f;
import kj0.e;
import android.os.Bundle;
import android.content.pm.ApplicationInfo;

public abstract class KrnBaseActivity extends AppCompatActivity	// class@000803
{
    public int b;
    public ActivityInfo c;
    public HashMap d;
    public static final KrnBaseActivity$a e;

    static {
       KrnBaseActivity.e = new KrnBaseActivity$a(null);
    }
    public void KrnBaseActivity(){
       super();
       this.b = -9999;
    }
    private final boolean isTranslucentOrFloating(){
       Object obj = PatchProxy.apply(null, this, KrnBaseActivity.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean i = 0;
       try{
          TypedArray obj1 = a.h("com.android.internal.R$styleable", "Window");
          a.o(obj1, "JavaCalls.getStaticField¡­.R\\$styleable\", \"Window\"\)");
          obj1 = this.obtainStyledAttributes(obj1);
          a.o(obj1, "obtainStyledAttributes\(styleableRes\)");
          Object[] objArray = new Object[]{obj1};
          Object obj2 = a.b(ActivityInfo.class.getCanonicalName(), "isTranslucentOrFloating", objArray);
          a.o(obj2, "JavaCalls\n          .cal¡­anslucentOrFloating\", ta\)");
          i = obj2.booleanValue();
          obj1.recycle();
       }catch(java.lang.Exception e1){
          e1.printStackTrace();
       }
       return i;
    }
    private final void setValue(int p0){
       KrnBaseActivity krnBaseActiv = KrnBaseActivity.class;
       if (PatchProxy.isSupport(krnBaseActiv) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, krnBaseActiv, "7")) {
          return;
       }
       try{
          if (this.c == null) {
             this.c = a.d(this, "mActivityInfo");
          label_0023 :
             krnBaseActiv = this.c;
             if (krnBaseActiv != null) {
                krnBaseActiv.screenOrientation = p0;
             }
          }else {
             goto label_0023 ;
          }
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
       }
       return;
    }
    public final boolean E2(){
       Object obj = PatchProxy.apply(null, this, KrnBaseActivity.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (Build$VERSION.SDK_INT == 26 && (this.targetSdkVersionAbove26() && (-1 != this.getRequestedOrientation() && this.isTranslucentOrFloating())))? true: false;
       return b;
    }
    public void attachBaseContext(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnBaseActivity.class, "1")) {
          return;
       }
       super.attachBaseContext(p0);
       c uoc = c.b();
       a.o(uoc, "KrnManager.get\(\)");
       f n = uoc.f().n;
       if (n != null) {
          n.attachBaseContext(this);
       }
       return;
    }
    public void onCreate(Bundle p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KrnBaseActivity.class, "2")) {
          return;
       }
       if (this.E2()) {
          this.unSetScreenOrientation();
       }
       super.onCreate(p0);
       this.resetScreenOrientation();
       return;
    }
    public final void resetScreenOrientation(){
       if (PatchProxy.applyVoid(null, this, KrnBaseActivity.class, "5")) {
          return;
       }
       KrnBaseActivity tb = this.b;
       if (-9999 != tb) {
          this.setValue(tb);
       }
       return;
    }
    public void setRequestedOrientation(int p0){
       KrnBaseActivity krnBaseActiv = KrnBaseActivity.class;
       if (PatchProxy.isSupport(krnBaseActiv) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, krnBaseActiv, "3")) {
          return;
       }
       if (this.E2()) {
          try{
             this.unSetScreenOrientation();
             super.setRequestedOrientation(p0);
          }catch(java.lang.Exception e4){
             e4.printStackTrace();
          }
          this.resetScreenOrientation();
          return;
       }else {
          super.setRequestedOrientation(p0);
          return;
       }
    }
    public final boolean targetSdkVersionAbove26(){
       Object obj = PatchProxy.apply(null, this, KrnBaseActivity.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.getApplicationInfo().targetSdkVersion > 26)? true: false;
       return b;
    }
    public final void unSetScreenOrientation(){
       if (PatchProxy.applyVoid(null, this, KrnBaseActivity.class, "6")) {
          return;
       }
       this.b = this.getRequestedOrientation();
       this.setValue(-1);
       return;
    }
}
