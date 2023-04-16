package com.kwai.middleware.azeroth.sdk.SDKHandler$Companion$PERMISSION_UPDATE_SDK_CONFIG$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import c97.d;
import kotlin.jvm.internal.a;
import android.content.Context;

public final class SDKHandler$Companion$PERMISSION_UPDATE_SDK_CONFIG$2 extends Lambda implements a	// class@000d67
{
    public static final SDKHandler$Companion$PERMISSION_UPDATE_SDK_CONFIG$2 INSTANCE;

    static {
       SDKHandler$Companion$PERMISSION_UPDATE_SDK_CONFIG$2.INSTANCE = new SDKHandler$Companion$PERMISSION_UPDATE_SDK_CONFIG$2();
    }
    public void SDKHandler$Companion$PERMISSION_UPDATE_SDK_CONFIG$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       d uod = d.a();
       a.h(uod, "Azeroth.get\(\)");
       Context uContext = uod.d();
       a.h(uContext, "Azeroth.get\(\).context");
       return uContext.getPackageName()+".PERMISSION_UPDATE_SDK_CONFIG";
    }
}
