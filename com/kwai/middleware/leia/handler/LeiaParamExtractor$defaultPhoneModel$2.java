package com.kwai.middleware.leia.handler.LeiaParamExtractor$defaultPhoneModel$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import android.os.Build;

public final class LeiaParamExtractor$defaultPhoneModel$2 extends Lambda implements a	// class@000d71
{
    public static final LeiaParamExtractor$defaultPhoneModel$2 INSTANCE;

    static {
       LeiaParamExtractor$defaultPhoneModel$2.INSTANCE = new LeiaParamExtractor$defaultPhoneModel$2();
    }
    public void LeiaParamExtractor$defaultPhoneModel$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final String invoke(){
       return Build.MANUFACTURER+'('+Build.MODEL+')';
    }
}
