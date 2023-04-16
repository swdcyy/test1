package com.kwai.middleware.skywalker.gson.KwaiGsonBuilder$Companion$defaultGson$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.google.gson.Gson;
import com.kwai.middleware.skywalker.gson.KwaiGsonBuilder;
import java.lang.Object;

public final class KwaiGsonBuilder$Companion$defaultGson$2 extends Lambda implements a	// class@000d74
{
    public static final KwaiGsonBuilder$Companion$defaultGson$2 INSTANCE;

    static {
       KwaiGsonBuilder$Companion$defaultGson$2.INSTANCE = new KwaiGsonBuilder$Companion$defaultGson$2();
    }
    public void KwaiGsonBuilder$Companion$defaultGson$2(){
       super(0);
    }
    public final Gson invoke(){
       Gson gson = new KwaiGsonBuilder().b();
       return gson;
    }
    public Object invoke(){
       return this.invoke();
    }
}
