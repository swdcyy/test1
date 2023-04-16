package com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;

public interface abstract WritableMap implements ReadableMap	// class@001241
{

    WritableMap copy();
    void merge(ReadableMap p0);
    void putArray(String p0,ReadableArray p1);
    void putBoolean(String p0,boolean p1);
    void putDouble(String p0,double p1);
    void putInt(String p0,int p1);
    void putMap(String p0,ReadableMap p1);
    void putNull(String p0);
    void putString(String p0,String p1);
}
