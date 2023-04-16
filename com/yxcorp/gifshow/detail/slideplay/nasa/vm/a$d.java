package com.yxcorp.gifshow.detail.slideplay.nasa.vm.a$d;
import im8.f;
import v6a.o0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class a$d implements f	// class@0017ec
{
    public final o0 b;

    public void a$d(o0 p0){
       this.b = p0;
       super();
    }
    public Object get(){
       Boolean uBoolean = PatchProxy.applyWithListener(null, this, a$d.class, "1");
       if (uBoolean != PatchProxyResult.class) {
       }else {
          uBoolean = Boolean.valueOf(this.b.F1);
          PatchProxy.onMethodExit(a$d.class, "1");
       }
       return uBoolean;
    }
    public void set(Object p0){
       if (PatchProxy.applyVoidOneRefsWithListener(p0, this, a$d.class, "2")) {
       }else {
          this.b.F1 = p0.booleanValue();
          PatchProxy.onMethodExit(a$d.class, "2");
       }
       return;
    }
}
