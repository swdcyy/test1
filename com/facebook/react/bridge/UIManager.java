package com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.PerformanceCounter;
import android.view.View;
import com.facebook.react.bridge.WritableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public interface abstract UIManager implements PerformanceCounter	// class@00123c
{

    int addRootView(View p0,WritableMap p1,String p2);
    void dispatchCommand(int p0,int p1,ReadableArray p2);
    void dispatchCommand(int p0,String p1,ReadableArray p2);
    void sendAccessibilityEvent(int p0,int p1);
    void setAllowImmediateUIOperationExecution(boolean p0);
    void synchronouslyUpdateViewOnUIThread(int p0,ReadableMap p1);
    void updateRootLayoutSpecs(int p0,int p1,int p2);
}
