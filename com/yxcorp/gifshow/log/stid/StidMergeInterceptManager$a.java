package com.yxcorp.gifshow.log.stid.StidMergeInterceptManager$a;
import com.google.gson.JsonObject;
import java.lang.Object;
import java.lang.String;
import com.google.gson.JsonElement;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.StringBuilder;

public class StidMergeInterceptManager$a	// class@001b3d
{
    public String a;
    public String b;
    public int c;
    public int d;

    public void StidMergeInterceptManager$a(JsonObject p0){
       super();
       this.a = null;
       this.b = null;
       this.c = -1;
       this.d = -1;
       JsonElement jsonElement = p0.e0("action2");
       if (jsonElement != null) {
          this.a = jsonElement.w();
       }
       jsonElement = p0.e0("page2");
       if (jsonElement != null) {
          this.b = jsonElement.w();
       }
       jsonElement = p0.e0("action");
       if (jsonElement != null) {
          this.c = jsonElement.p();
       }
       JsonElement jsonElement1 = p0.e0("page");
       if (jsonElement1 != null) {
          this.d = jsonElement1.p();
       }
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, StidMergeInterceptManager$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "StidInterceptRule{action2=\'"+this.a+'''+", page2=\'"+this.b+'''+", action="+this.c+", page="+this.d+'}';
    }
}
