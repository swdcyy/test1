package com.kwai.component.saber.executor.c$a;
import pg5.e;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class c$a implements e	// class@000b2c
{

    public void c$a(){
       super();
    }
    public void onFailure(Throwable p0){
       PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "2");
    }
    public void onSuccess(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c$a.class, "1")) {
          return;
       }
       p0.toString();
       return;
    }
}
