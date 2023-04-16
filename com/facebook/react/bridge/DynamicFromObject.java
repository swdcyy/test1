package com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.Dynamic;
import java.lang.Object;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.Number;
import java.lang.Double;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.lang.StringBuilder;
import cb.a;

public class DynamicFromObject implements Dynamic	// class@0011bf
{
    public Object mObject;

    public void DynamicFromObject(Object p0){
       super();
       this.mObject = p0;
    }
    public ReadableArray asArray(){
       return this.mObject;
    }
    public boolean asBoolean(){
       DynamicFromObject uDynamicFrom = PatchProxy.apply(null, this, DynamicFromObject.class, "1");
       if (uDynamicFrom == PatchProxyResult.class) {
          uDynamicFrom = this.mObject;
       }
       return uDynamicFrom.booleanValue();
    }
    public double asDouble(){
       Object obj = PatchProxy.apply(null, this, DynamicFromObject.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       return this.mObject.doubleValue();
    }
    public int asInt(){
       Object obj = PatchProxy.apply(null, this, DynamicFromObject.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.mObject.intValue();
    }
    public ReadableMap asMap(){
       return this.mObject;
    }
    public String asString(){
       return this.mObject;
    }
    public ReadableType getType(){
       DynamicFromObject obj = PatchProxy.apply(null, this, DynamicFromObject.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.isNull()) {
          return ReadableType.Null;
       }
       obj = this.mObject;
       if (obj instanceof Boolean) {
          return ReadableType.Boolean;
       }
       if (obj instanceof Number) {
          return ReadableType.Number;
       }
       if (obj instanceof String) {
          return ReadableType.String;
       }
       if (obj instanceof ReadableMap) {
          return ReadableType.Map;
       }
       if (obj instanceof ReadableArray) {
          return ReadableType.Array;
       }
       a.g("ReactNative", "Unmapped object type "+this.mObject.getClass().getName());
       return ReadableType.Null;
    }
    public boolean isNull(){
       boolean b = (this.mObject == null)? true: false;
       return b;
    }
    public void recycle(){
    }
}
