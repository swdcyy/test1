package com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.String;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;

public abstract class NativeAnimatedModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@00109c
{

    public void NativeAnimatedModuleSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void addAnimatedEventToView(double p0,String p1,ReadableMap p2);
    public abstract void addListener(String p0);
    public abstract void connectAnimatedNodeToView(double p0,double p1);
    public abstract void connectAnimatedNodes(double p0,double p1);
    public abstract void createAnimatedNode(double p0,ReadableMap p1);
    public abstract void disconnectAnimatedNodeFromView(double p0,double p1);
    public abstract void disconnectAnimatedNodes(double p0,double p1);
    public abstract void dropAnimatedNode(double p0);
    public abstract void extractAnimatedNodeOffset(double p0);
    public abstract void flattenAnimatedNodeOffset(double p0);
    public abstract void removeAnimatedEventFromView(double p0,String p1,double p2);
    public abstract void removeListeners(double p0);
    public abstract void restoreDefaultValues(double p0);
    public abstract void setAnimatedNodeOffset(double p0,double p1);
    public abstract void setAnimatedNodeValue(double p0,double p1);
    public abstract void startAnimatingNode(double p0,double p1,ReadableMap p2,Callback p3);
    public abstract void startListeningToAnimatedNodeValue(double p0);
    public abstract void stopAnimation(double p0);
    public abstract void stopListeningToAnimatedNodeValue(double p0);
}
