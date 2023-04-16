package com.facebook.react.turbomodule.core.CallInvokerHolderImpl;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import com.facebook.jni.HybridData;
import java.lang.Object;
import java.lang.String;
import com.facebook.soloader.SoLoader;

public class CallInvokerHolderImpl implements CallInvokerHolder	// class@001306
{
    public HybridData mHybridData;
    public static boolean a;

    public void CallInvokerHolderImpl(HybridData p0){
       super();
       _monitor_enter(CallInvokerHolderImpl.class);
       if (!CallInvokerHolderImpl.a) {
          SoLoader.b("turbomodulejsijni");
          CallInvokerHolderImpl.a = true;
       }
       _monitor_exit(CallInvokerHolderImpl.class);
       this.mHybridData = p0;
       return;
    }
}
