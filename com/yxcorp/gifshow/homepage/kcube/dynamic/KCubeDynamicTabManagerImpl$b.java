package com.yxcorp.gifshow.homepage.kcube.dynamic.KCubeDynamicTabManagerImpl$b;
import java.lang.Runnable;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lnc.i3;
import fg6.a;
import com.google.gson.Gson;
import tra.b;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Throwable;

public final class KCubeDynamicTabManagerImpl$b implements Runnable	// class@001727
{
    public final String b;
    public final List c;

    public void KCubeDynamicTabManagerImpl$b(String p0,List p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       String str = "KCubeDynamicTabManagerImpl";
       if (PatchProxy.applyVoidWithListener(null, this, KCubeDynamicTabManagerImpl$b.class, "1")) {
          return;
       }
       int i = 0;
       try{
          i3 oi3 = i3.f();
          oi3.d("reason", this.b);
          oi3.d("updateTabs", a.a.q(this.c));
          Object[] objArray = new Object[i];
          b.C().w(str, "checkData "+oi3.e(), objArray);
       }catch(java.lang.Exception e2){
          Object[] objArray1 = new Object[i];
          b.C().u(str, e2, objArray1);
       }
       PatchProxy.onMethodExit(KCubeDynamicTabManagerImpl$b.class, "1");
       return;
    }
}
