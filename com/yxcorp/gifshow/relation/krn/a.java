package com.yxcorp.gifshow.relation.krn.a;
import java.util.concurrent.Callable;
import java.lang.String;
import com.facebook.react.bridge.ReactContext;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.util.HashMap;
import java.lang.Long;
import java.lang.Exception;
import java.util.Map;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.bridge.Arguments;
import com.kuaishou.krn.NativeToJsKt;

public final class a implements Callable	// class@001933
{
    public final String b;
    public final String c;
    public final ReactContext d;

    public void a(String p0,String p1,ReactContext p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object call(){
       HashMap hashMap;
       Boolean uBoolean = PatchProxy.apply(null, this, a.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          try{
             hashMap = new HashMap();
             hashMap.put("userId", Long.valueOf(Long.parseLong(this.b)));
             hashMap.put("remarkName", this.c);
          }catch(java.lang.Exception e1){
             e1.printStackTrace();
          }
          a td = this.d;
          if (td != null) {
             NativeToJsKt.e(td, "krnRemarkNameDidChange", Arguments.makeNativeMap(hashMap));
          }
          uBoolean = Boolean.TRUE;
       }
       return uBoolean;
    }
}
