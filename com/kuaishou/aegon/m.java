package com.kuaishou.aegon.m;
import java.lang.Runnable;
import java.lang.Object;
import com.kuaishou.aegon.NetworkActivationHelper;

public final class m implements Runnable	// class@0007b1
{
    public static final m b;

    static {
       m.b = new m();
    }
    public void m(){
       super();
    }
    public final void run(){
       NetworkActivationHelper.nativeSetResetNetworkWithErrorCodeMethod(NetworkActivationHelper.h);
    }
}
