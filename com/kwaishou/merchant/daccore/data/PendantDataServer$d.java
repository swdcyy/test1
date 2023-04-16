package com.kwaishou.merchant.daccore.data.PendantDataServer$d;
import erd.g;
import com.kwaishou.merchant.daccore.data.PendantDataServer;
import com.kuaishou.bowl.data.center.data.model.live.signal.SignalPendant;
import java.lang.Object;
import com.google.gson.JsonObject;
import o56.a;
import com.kwaishou.merchant.troubleshooting.core.TroubleShooting;
import fg6.a;
import com.google.gson.JsonElement;
import java.lang.String;
import com.google.gson.Gson;

public final class PendantDataServer$d implements g	// class@001310
{
    public final PendantDataServer b;
    public final SignalPendant c;

    public void PendantDataServer$d(PendantDataServer p0,SignalPendant p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (a.d()) {
          TroubleShooting.a.o(this.b.i, this.c.callbackApi, "½Ó¿Ú", "", a.a.p(p0));
       }
       this.b.n(true, this.c, p0);
       return;
    }
}
