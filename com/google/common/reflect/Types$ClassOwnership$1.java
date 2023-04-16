package com.google.common.reflect.Types$ClassOwnership$1;
import com.google.common.reflect.Types$ClassOwnership;
import java.lang.String;
import com.google.common.reflect.Types$a;
import java.lang.Class;

public final class Types$ClassOwnership$1 extends Types$ClassOwnership	// class@0018ff
{

    public void Types$ClassOwnership$1(String p0,int p1){
       super(p0, p1, null);
    }
    public Class getOwnerType(Class p0){
       return p0.getEnclosingClass();
    }
}
