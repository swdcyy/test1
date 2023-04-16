package com.facebook.react.bridge.BridgeHookInvoked;
import com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.BaseJavaModule;
import java.lang.String;
import java.lang.Object;

public interface abstract BridgeHookInvoked	// class@00119e
{

    boolean matchBridgeHookCondition(JSInstance p0,BaseJavaModule p1,String p2,String p3,Object[] p4);
}
