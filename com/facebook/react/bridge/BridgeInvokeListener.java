package com.facebook.react.bridge.BridgeInvokeListener;
import com.facebook.react.bridge.BaseJavaModule;
import java.lang.String;
import java.lang.Object;

public interface abstract BridgeInvokeListener	// class@00119f
{

    void onBridgeInvoked(BaseJavaModule p0,String p1,String p2,Object[] p3);
}
