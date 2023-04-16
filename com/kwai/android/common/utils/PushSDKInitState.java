package com.kwai.android.common.utils.PushSDKInitState;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Object;

public final class PushSDKInitState	// class@0009a5
{
    public static final PushSDKInitState INSTANCE;
    public static final AtomicBoolean isInit;
    public static final AtomicBoolean reentryFlag;

    static {
       PushSDKInitState.INSTANCE = new PushSDKInitState();
       PushSDKInitState.isInit = new AtomicBoolean(false);
       PushSDKInitState.reentryFlag = new AtomicBoolean(false);
    }
    public void PushSDKInitState(){
       super();
    }
    public final AtomicBoolean getReentryFlag$lib_common_release(){
       return PushSDKInitState.reentryFlag;
    }
    public final AtomicBoolean isInit(){
       return PushSDKInitState.isInit;
    }
}
