package com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;

public interface abstract WritableArray implements ReadableArray	// class@001240
{

    void pushArray(ReadableArray p0);
    void pushBoolean(boolean p0);
    void pushDouble(double p0);
    void pushInt(int p0);
    void pushMap(ReadableMap p0);
    void pushNull();
    void pushString(String p0);
}
