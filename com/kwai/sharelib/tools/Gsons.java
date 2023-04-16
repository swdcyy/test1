package com.kwai.sharelib.tools.Gsons;
import com.kwai.sharelib.tools.Gsons$KWAI_GSON$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Object;
import com.google.gson.Gson;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class Gsons	// class@0016fe
{
    public static final p a;
    public static final Gsons b;

    static {
       Gsons.b = new Gsons();
       Gsons.a = s.c(Gsons$KWAI_GSON$2.INSTANCE);
    }
    public void Gsons(){
       super();
    }
    public final Gson a(){
       Object obj = PatchProxy.apply(null, this, Gsons.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Gsons.a.getValue();
    }
}
