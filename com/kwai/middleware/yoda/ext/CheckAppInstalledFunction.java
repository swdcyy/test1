package com.kwai.middleware.yoda.ext.CheckAppInstalledFunction;
import com.kwai.yoda.function.c;
import com.kwai.yoda.bridge.YodaBaseWebView;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import org.json.JSONObject;
import java.lang.CharSequence;
import android.text.TextUtils;
import android.content.Context;
import android.widget.AbsoluteLayout;
import android.content.pm.PackageManager;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.kwai.middleware.yoda.ext.CheckAppInstalledFunction$AppInstalledResultParams;
import com.kwai.yoda.function.FunctionResultParams;
import com.kwai.yoda.bridge.YodaException;

public class CheckAppInstalledFunction extends c	// class@000f62
{

    public void CheckAppInstalledFunction(){
       super();
    }
    public void a(YodaBaseWebView p0,String p1,String p2,String p3,String p4){
       PackageInfo packageInfo;
       object oobject = p3;
       CheckAppInstalledFunction uCheckAppIns = CheckAppInstalledFunction.class;
       int i = 1;
       if (PatchProxy.isSupport(uCheckAppIns)) {
          Object[] objArray = new Object[]{p0,p1,p2,oobject,p4};
          if (PatchProxy.applyVoid(objArray, this, uCheckAppIns, "1")) {
             return;
          }
       }else {
          int i1 = this;
       }
       String str = "identifier";
       String str1 = new JSONObject(oobject).optString(str);
       if (!TextUtils.isEmpty(str1)) {
          try{
             packageInfo = p0.getContext().getPackageManager().getPackageInfo(str1, 0);
          }catch(android.content.pm.PackageManager$NameNotFoundException e0){
             e0.printStackTrace();
             packageInfo = null;
          }
          CheckAppInstalledFunction$AppInstalledResultParams uAppInstalle = new CheckAppInstalledFunction$AppInstalledResultParams();
          uAppInstalle.mResult = i;
          if (packageInfo == null) {
             i = false;
          }
          uAppInstalle.mInstalled = i;
          this.l(p0, uAppInstalle, p1, p2, null, p4);
          return;
       }else {
          Object[] objArray1 = new Object[i];
          objArray1[0] = str;
          throw new YodaException(0x1e84e, String.format("The Input [%s] can NOT be null.", objArray1));
       }
    }
}
