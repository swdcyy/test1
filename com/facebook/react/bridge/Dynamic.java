package com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import com.facebook.react.bridge.ReadableType;

public interface abstract Dynamic	// class@0011bb
{

    ReadableArray asArray();
    boolean asBoolean();
    double asDouble();
    int asInt();
    ReadableMap asMap();
    String asString();
    ReadableType getType();
    boolean isNull();
    void recycle();
}
