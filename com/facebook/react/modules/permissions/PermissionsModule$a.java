package com.facebook.react.modules.permissions.PermissionsModule$a;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.permissions.PermissionsModule;
import com.facebook.react.bridge.Promise;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import je.d;
import java.lang.Boolean;
import td.a;

public class PermissionsModule$a implements Callback	// class@0012db
{
    public final Promise a;
    public final String b;
    public final PermissionsModule c;

    public void PermissionsModule$a(PermissionsModule p0,Promise p1,String p2){
       this.c = p0;
       this.a = p1;
       this.b = p2;
       super();
    }
    public void invoke(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PermissionsModule$a.class, "1")) {
          return;
       }
       int i = 0;
       object oobject = p0[i];
       if (oobject.length > 0 && !oobject[i]) {
          this.a.resolve("granted");
       }else if(p0[1].shouldShowRequestPermissionRationale(this.b)){
          this.a.resolve("denied");
       }else {
          this.a.resolve("never_ask_again");
       }
       return;
    }
    public void invokeNew(Boolean p0,String[] p1){
       a.a(this, p0, p1);
    }
}
