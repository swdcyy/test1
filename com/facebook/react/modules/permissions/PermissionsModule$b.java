package com.facebook.react.modules.permissions.PermissionsModule$b;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.permissions.PermissionsModule;
import java.util.ArrayList;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.Promise;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import je.d;
import java.lang.Boolean;
import td.a;

public class PermissionsModule$b implements Callback	// class@0012dc
{
    public final ArrayList a;
    public final WritableMap b;
    public final Promise c;
    public final PermissionsModule d;

    public void PermissionsModule$b(PermissionsModule p0,ArrayList p1,WritableMap p2,Promise p3){
       this.d = p0;
       this.a = p1;
       this.b = p2;
       this.c = p3;
       super();
    }
    public void invoke(Object[] p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PermissionsModule$b.class, "1")) {
          return;
       }
       int i = 0;
       object oobject = p0[i];
       object oobject1 = p0[1];
       while (i < this.a.size()) {
          String str = this.a.get(i);
          if (oobject.length > 0 && !oobject[i]) {
             this.b.putString(str, "granted");
          }else if(oobject1.shouldShowRequestPermissionRationale(str)){
             this.b.putString(str, "denied");
          }else {
             this.b.putString(str, "never_ask_again");
          }
          i = i + 1;
       }
       this.c.resolve(this.b);
       return;
    }
    public void invokeNew(Boolean p0,String[] p1){
       a.a(this, p0, p1);
    }
}
