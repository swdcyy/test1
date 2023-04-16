package com.kwai.middleware.leia.handler.LeiaParamExtractor$defaultSystemVersion$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import android.os.Build$VERSION;

public final class LeiaParamExtractor$defaultSystemVersion$2 extends Lambda implements a	// class@000d72
{
    public static final LeiaParamExtractor$defaultSystemVersion$2 INSTANCE;

    static {
       LeiaParamExtractor$defaultSystemVersion$2.INSTANCE = new LeiaParamExtractor$defaultSystemVersion$2();
    }
    public void LeiaParamExtractor$defaultSystemVersion$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       return "ANDROID_"+Build$VERSION.RELEASE;
    }
}
