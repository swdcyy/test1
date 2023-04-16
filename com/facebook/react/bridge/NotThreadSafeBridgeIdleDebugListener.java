package com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;

public interface abstract NotThreadSafeBridgeIdleDebugListener	// class@001211
{

    void onBridgeDestroyed();
    void onTransitionToBridgeBusy();
    void onTransitionToBridgeIdle();
}
