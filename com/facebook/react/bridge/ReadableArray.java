package com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

public interface abstract ReadableArray	// class@00122d
{

    ReadableArray getArray(int p0);
    boolean getBoolean(int p0);
    double getDouble(int p0);
    Dynamic getDynamic(int p0);
    int getInt(int p0);
    ReadableMap getMap(int p0);
    String getString(int p0);
    ReadableType getType(int p0);
    boolean isNull(int p0);
    int size();
    ArrayList toArrayList();
}
