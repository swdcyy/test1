package com.kwai.middleware.azeroth.Azeroth2$initAppLifecycle$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import qrd.l1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import java.lang.String;
import kotlin.jvm.internal.a;
import androidx.lifecycle.Lifecycle;
import com.kwai.middleware.azeroth.Azeroth2$initAppLifecycle$1$1;
import androidx.lifecycle.LifecycleObserver;

public final class Azeroth2$initAppLifecycle$1 extends Lambda implements a	// class@000ef2
{
    public static final Azeroth2$initAppLifecycle$1 INSTANCE;

    static {
       Azeroth2$initAppLifecycle$1.INSTANCE = new Azeroth2$initAppLifecycle$1();
    }
    public void Azeroth2$initAppLifecycle$1(){
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       LifecycleOwner lifecycleOwn = ProcessLifecycleOwner.get();
       a.h(lifecycleOwn, "ProcessLifecycleOwner.get\(\)");
       lifecycleOwn.getLifecycle().addObserver(new Azeroth2$initAppLifecycle$1$1());
    }
}
