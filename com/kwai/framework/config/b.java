package com.kwai.framework.config.b;
import erd.g;
import java.lang.Object;
import io.reactivex.subjects.PublishSubject;
import com.kwai.framework.config.ConfigAutoParseJsonConsumer;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.google.gson.JsonObject;
import java.lang.StringBuilder;
import java.lang.Exception;
import z56.b;
import crd.b;
import brd.t;

public final class b implements g	// class@0014fe
{
    public final PublishSubject b;
    public JsonObject c;

    public void b(){
       super();
       this.b = PublishSubject.g();
    }
    public b a(ConfigAutoParseJsonConsumer p0){
       b obj = PatchProxy.applyOneRefs(p0, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj != null) {
          try{
             p0.a(obj);
          }catch(java.lang.Exception e0){
             if ("error in ConfigAutoParseJsonConsumer:"+p0+",throwable:"+e0 != null) {
                e0.toString();
             }
          }
       }
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          this.c = p0;
          this.b.onNext(p0);
       }
       return;
    }
    public JsonObject b(){
       return this.c;
    }
}
