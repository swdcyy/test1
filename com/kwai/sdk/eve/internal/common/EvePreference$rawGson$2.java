package com.kwai.sdk.eve.internal.common.EvePreference$rawGson$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.Gson;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class EvePreference$rawGson$2 extends Lambda implements a	// class@001470
{
    public static final EvePreference$rawGson$2 INSTANCE;

    static {
       EvePreference$rawGson$2.INSTANCE = new EvePreference$rawGson$2();
    }
    public void EvePreference$rawGson$2(){
       super(0);
    }
    public final Gson invoke(){
       Object obj = PatchProxy.apply(null, this, EvePreference$rawGson$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new Gson();
    }
    public Object invoke(){
       return this.invoke();
    }
}