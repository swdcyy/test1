package com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.Dynamic;
import java.util.Iterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;

public interface abstract ReadableMap	// class@00122e
{

    ReadableArray getArray(String p0);
    boolean getBoolean(String p0);
    double getDouble(String p0);
    Dynamic getDynamic(String p0);
    Iterator getEntryIterator();
    int getInt(String p0);
    ReadableMap getMap(String p0);
    String getString(String p0);
    ReadableType getType(String p0);
    boolean hasKey(String p0);
    boolean isNull(String p0);
    ReadableMapKeySetIterator keySetIterator();
    HashMap toHashMap();
}
