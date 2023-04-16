package com.kwai.middleware.azeroth.scheduler.AzerothSchedulers$Companion$mAzerothApiThread$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.String;
import f97.a;

public final class AzerothSchedulers$Companion$mAzerothApiThread$2 extends Lambda implements a	// class@000d64
{
    public static final AzerothSchedulers$Companion$mAzerothApiThread$2 INSTANCE;

    static {
       AzerothSchedulers$Companion$mAzerothApiThread$2.INSTANCE = new AzerothSchedulers$Companion$mAzerothApiThread$2();
    }
    public void AzerothSchedulers$Companion$mAzerothApiThread$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final ThreadPoolExecutor invoke(){
       return a.d("azeroth-api-thread", 4);
    }
}
