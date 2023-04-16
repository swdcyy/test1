package com.yxcorp.gifshow.camera.record.assistant.utils.f;
import om6.l;
import java.lang.Object;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.camera.record.assistant.utils.e;
import java.util.concurrent.Callable;
import t45.d;
import brd.z;
import dc9.e;
import erd.o;
import cjd.e;
import com.yxcorp.gifshow.camera.record.assistant.utils.b;
import erd.g;
import com.yxcorp.gifshow.camera.record.assistant.utils.c;
import dc9.f;
import com.yxcorp.gifshow.camera.record.assistant.utils.d;

public class f implements l	// class@001d25
{

    public void f(){
       super();
    }
    public t JM(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       z c = d.c;
       return t.fromCallable(e.b).subscribeOn(c).flatMap(new e(p0, p1)).map(new e()).observeOn(c).doOnNext(new b(this, p0)).observeOn(d.a).map(c.b);
    }
    public boolean isAvailable(){
       return true;
    }
    public t wx(String p0,String p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, f.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return t.fromCallable(e.b).subscribeOn(d.c).flatMap(new f(p0, p1)).map(new e()).observeOn(d.a).map(d.b);
    }
}
