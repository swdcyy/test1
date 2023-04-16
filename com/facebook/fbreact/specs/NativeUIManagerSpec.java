package com.facebook.fbreact.specs.NativeUIManagerSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.lang.Double;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.Callback;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import java.util.Map;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableArray;

public abstract class NativeUIManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010d1
{

    public void NativeUIManagerSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void blur(Double p0);
    public abstract void clearJSResponder();
    public abstract void configureNextLayoutAnimation(ReadableMap p0,Callback p1,Callback p2);
    public abstract void createView(Double p0,String p1,double p2,ReadableMap p3);
    public abstract void dismissPopupMenu();
    public abstract void dispatchViewManagerCommand(Double p0,double p1,ReadableArray p2);
    public abstract void findSubviewIn(Double p0,ReadableArray p1,Callback p2);
    public abstract void focus(Double p0);
    public final Map getConstants(){
       return this.getTypedExportedConstants();
    }
    public abstract WritableMap getConstantsForViewManager(String p0);
    public abstract WritableArray getDefaultEventTypes();
    public abstract Map getTypedExportedConstants();
    public abstract WritableMap lazilyLoadView(String p0);
    public abstract void manageChildren(Double p0,ReadableArray p1,ReadableArray p2,ReadableArray p3,ReadableArray p4,ReadableArray p5);
    public abstract void measure(Double p0,Callback p1);
    public abstract void measureInWindow(Double p0,Callback p1);
    public abstract void measureLayout(Double p0,Double p1,Callback p2,Callback p3);
    public abstract void measureLayoutRelativeToParent(Double p0,Callback p1,Callback p2);
    public abstract void playTouchSound();
    public abstract void removeSubviewsFromContainerWithID(double p0);
    public abstract void replaceExistingNonRootView(Double p0,Double p1);
    public abstract void sendAccessibilityEvent(Double p0,double p1);
    public abstract void setChildren(Double p0,ReadableArray p1);
    public abstract void setJSResponder(Double p0,boolean p1);
    public abstract void setLayoutAnimationEnabledExperimental(boolean p0);
    public abstract void showPopupMenu(Double p0,ReadableArray p1,Callback p2,Callback p3);
    public abstract void updateView(double p0,String p1,ReadableMap p2);
    public abstract void viewIsDescendantOf(Double p0,Double p1,Callback p2);
}
