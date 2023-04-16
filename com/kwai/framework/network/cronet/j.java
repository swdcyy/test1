package com.kwai.framework.network.cronet.j;
import bo.s;
import com.kwai.framework.network.cronet.i;
import java.lang.Object;
import java.lang.String;
import bo.s$a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import db6.d;
import java.lang.Runnable;
import ekd.s1;
import com.kwai.sdk.switchconfig.a;
import db6.c;
import io7.a;
import java.lang.reflect.Type;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import f66.e;
import java.io.File;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import com.google.gson.JsonElement;

public class j implements s	// class@0017b0
{
    public final i a;

    public void j(i p0){
       this.a = p0;
       super();
    }
    public void a(String p0,s$a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, j.class, "2")) {
          return;
       }
       Objects.requireNonNull(p1);
       s1.e(new d(p1), 500);
       a.t().p(p0, new c(p1));
       return;
    }
    public Object b(String p0,Type p1,Object p2){
       return null;
    }
    public String c(String p0,String p1){
       JsonObject obj = PatchProxy.applyTwoRefs(p0, p1, this, j.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = a.t().getValue(p0, JsonObject.class, null);
          if (obj == null) {
             return p1;
          }
          File parentFile = e.a.getParentFile();
          if (parentFile != null) {
             obj.c0("netlog_path", parentFile.getAbsolutePath());
          }
          Log.g("AegonCronetManager", "after append netlog_path: "+p0+", netLogJson: "+obj);
          return obj.toString();
       }catch(java.lang.Exception e0){
       }
    }
}
