package com.yxcorp.gifshow.apm.a;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.init.e;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import a76.b;

public final class a implements Runnable	// class@001b9b
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, null, e.class, "11")) {
       }else if(e.c){
          e.c = true;
          e.g.c();
       }
       return;
    }
}
