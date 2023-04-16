package com.facebook.react.bridge.NativeModule;
import java.lang.String;

public interface abstract NativeModule	// class@00120c
{

    boolean canOverrideExistingModule();
    String getName();
    void initialize();
    void onCatalystInstanceDestroy();
}
