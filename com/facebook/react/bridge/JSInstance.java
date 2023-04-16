package com.facebook.react.bridge.JSInstance;
import com.facebook.react.bridge.NativeArrayInterface;
import java.lang.Boolean;

public interface abstract JSInstance	// class@0011df
{

    void invokeCallback(int p0,NativeArrayInterface p1);
    void invokeCallback(Boolean p0,int p1,NativeArrayInterface p2);
    boolean isDestroyed();
}
