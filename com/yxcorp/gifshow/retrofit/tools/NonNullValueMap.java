package com.yxcorp.gifshow.retrofit.tools.NonNullValueMap;
import java.util.HashMap;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class NonNullValueMap extends HashMap	// class@001b18
{

    public void NonNullValueMap(){
       super();
    }
    public Object put(Object p0,Object p1){
       return this.put(p0, p1);
    }
    public String put(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, NonNullValueMap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p1 == null)? null: super.put(p0, p1);
       return p0;
    }
}
