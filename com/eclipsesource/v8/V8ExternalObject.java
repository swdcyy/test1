package com.eclipsesource.v8.V8ExternalObject;
import com.eclipsesource.v8.V8;
import java.lang.Object;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;

public class V8ExternalObject	// class@000fde
{
    public Object mExternal;
    public String mKey;

    public void V8ExternalObject(V8 p0,Object p1){
       super();
       p0 = null;
       this.mExternal = p0;
       this.mKey = p0;
       this.mExternal = p1;
       if (p1 != null) {
          this.mKey = "#of*#$%kt_"+p1.getClass()+"@"+p1.hashCode();
       }
       return;
    }
    public static boolean isExternalObject(String p0){
       if (p0 == null || (p0.length() > 10 && (35 == p0.charAt(false) && p0.startsWith("#of*#$%kt_")))) {
          return true;
       }
       return false;
    }
    public String getKey(){
       return this.mKey;
    }
    public Object getValue(){
       return this.mExternal;
    }
}
