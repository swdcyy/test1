package com.kwai.wake.strategy.BackgroundWake$Companion$1;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kwai.wake.strategy.BackgroundWake;
import java.lang.Class;
import java.lang.String;
import android.content.Context;
import java.lang.Object;
import kotlin.jvm.internal.a;

public final class BackgroundWake$Companion$1 extends FunctionReferenceImpl implements l	// class@001125
{
    public static final BackgroundWake$Companion$1 INSTANCE;

    static {
       BackgroundWake$Companion$1.INSTANCE = new BackgroundWake$Companion$1();
    }
    public void BackgroundWake$Companion$1(){
       super(1, BackgroundWake.class, "<init>", "<init>\(Landroid/content/Context;\)V", 0);
    }
    public final BackgroundWake invoke(Context p0){
       a.p(p0, "p1");
       return new BackgroundWake(p0);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
}
