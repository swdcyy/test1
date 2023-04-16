package com.kwai.framework.network.keyconfig.a$j;
import erd.a;
import com.kwai.framework.network.keyconfig.a;
import java.lang.String;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import qrd.l1;
import ta6.c;
import q87.c;

public final class a$j implements a	// class@0017e9
{
    public final a b;
    public final String c;
    public final RequestTiming d;

    public void a$j(a p0,String p1,RequestTiming p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoidWithListener(objArray, this, a$j.class, "1")) {
          return;
       }
       a$j tb = this.b;
       _monitor_enter(tb);
       this.b.k = objArray;
       _monitor_exit(tb);
       Object[] objArray1 = new Object[0];
       c.C().w("KeyConfigManager", "KeyConfig isRequesting = false", objArray1);
       PatchProxy.onMethodExit(a$j.class, "1");
       return;
    }
}
