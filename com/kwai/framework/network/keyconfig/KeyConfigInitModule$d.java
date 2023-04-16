package com.kwai.framework.network.keyconfig.KeyConfigInitModule$d;
import java.lang.Runnable;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import wkd.b;
import ob6.p;
import brd.a0;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule$d$a;
import com.kwai.framework.network.keyconfig.KeyConfigInitModule$d$b;
import erd.g;
import crd.b;

public final class KeyConfigInitModule$d implements Runnable	// class@0017dc
{
    public final RequestTiming b;

    public void KeyConfigInitModule$d(RequestTiming p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, KeyConfigInitModule$d.class, "1")) {
          return;
       }
       b.a(0x36463d96).j(this.b).R(KeyConfigInitModule$d$a.b, KeyConfigInitModule$d$b.b);
       return;
    }
}
