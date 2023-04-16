package com.kuaishou.android.live.log.c$a;
import java.lang.ThreadLocal;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public class c$a extends ThreadLocal	// class@0007d9
{

    public void c$a(){
       super();
    }
    public StringBuilder a(){
       Object obj = PatchProxy.apply(null, this, c$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new StringBuilder(512);
    }
    public Object initialValue(){
       return this.a();
    }
}
