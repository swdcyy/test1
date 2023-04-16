package com.facebook.fbreact.specs.NativeImagePickerIOSSpec;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;

public abstract class NativeImagePickerIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, TurboModule	// class@0010b6
{

    public void NativeImagePickerIOSSpec(ReactApplicationContext p0){
       super(p0);
    }
    public abstract void canRecordVideos(Callback p0);
    public abstract void canUseCamera(Callback p0);
    public abstract void clearAllPendingVideos();
    public abstract void openCameraDialog(ReadableMap p0,Callback p1,Callback p2);
    public abstract void openSelectDialog(ReadableMap p0,Callback p1,Callback p2);
    public abstract void removePendingVideo(String p0);
}
