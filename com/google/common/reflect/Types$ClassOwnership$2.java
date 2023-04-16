package com.google.common.reflect.Types$ClassOwnership$2;
import com.google.common.reflect.Types$ClassOwnership;
import java.lang.String;
import com.google.common.reflect.Types$a;
import java.lang.Class;

public final class Types$ClassOwnership$2 extends Types$ClassOwnership	// class@001900
{

    public void Types$ClassOwnership$2(String p0,int p1){
       super(p0, p1, null);
    }
    public Class getOwnerType(Class p0){
       if (p0.isLocalClass()) {
          return null;
       }
       return p0.getEnclosingClass();
    }
}
