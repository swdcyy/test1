package com.facebook.react.bridge.JsonWriterHelper;
import java.lang.Object;
import android.util.JsonWriter;
import com.facebook.react.bridge.Dynamic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.facebook.react.bridge.JsonWriterHelper$1;
import com.facebook.react.bridge.ReadableType;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map$Entry;
import java.lang.Number;
import java.lang.Boolean;
import com.facebook.react.bridge.ReadableMapKeySetIterator;

public class JsonWriterHelper	// class@0011ff
{

    public void JsonWriterHelper(){
       super();
    }
    public static void dynamicValue(JsonWriter p0,Dynamic p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsonWriterHelper.class, "2")) {
          return;
       }
       switch (JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType[p1.getType().ordinal()]){
           case 1:
             p0.nullValue();
             break;
           case 2:
             p0.value(p1.asBoolean());
             break;
           case 3:
             p0.value(p1.asDouble());
             break;
           case 4:
             p0.value(p1.asString());
             break;
           case 5:
             JsonWriterHelper.readableMapValue(p0, p1.asMap());
             break;
           case 6:
             JsonWriterHelper.readableArrayValue(p0, p1.asArray());
             break;
           default:
             throw new IllegalArgumentException("Unknown data type: "+p1.getType());
       }
       return;
    }
    public static void listValue(JsonWriter p0,List p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsonWriterHelper.class, "6")) {
          return;
       }
       p0.beginArray();
       Iterator iterator = p1.iterator();
       while (iterator.hasNext()) {
          JsonWriterHelper.objectValue(p0, iterator.next());
       }
       p0.endArray();
       return;
    }
    public static void mapValue(JsonWriter p0,Map p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsonWriterHelper.class, "5")) {
          return;
       }
       p0.beginObject();
       Iterator iterator = p1.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.name(uEntry.getKey().toString());
          JsonWriterHelper.value(p0, uEntry.getValue());
       }
       p0.endObject();
       return;
    }
    public static void objectValue(JsonWriter p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsonWriterHelper.class, "7")) {
          return;
       }
       if (p1 == null) {
          p0.nullValue();
       }else if(p1 instanceof String){
          p0.value(p1);
       }else if(p1 instanceof Number){
          p0.value(p1);
       }else if(p1 instanceof Boolean){
          p0.value(p1.booleanValue());
       }else {
          throw new IllegalArgumentException("Unknown value: "+p1);
       }
       return;
    }
    public static void readableArrayValue(JsonWriter p0,ReadableArray p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsonWriterHelper.class, "4")) {
          return;
       }
       p0.beginArray();
       int i = 0;
       while (true) {
          if (i < p1.size()) {
             switch (JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType[p1.getType(i).ordinal()]){
                 case 1:
                   p0.nullValue();
                   break;
                 case 2:
                   p0.value(p1.getBoolean(i));
                   break;
                 case 3:
                   p0.value(p1.getDouble(i));
                   break;
                 case 4:
                   p0.value(p1.getString(i));
                   break;
                 case 5:
                   JsonWriterHelper.readableMapValue(p0, p1.getMap(i));
                   break;
                 case 6:
                   JsonWriterHelper.readableArrayValue(p0, p1.getArray(i));
                   break;
                 default:
                   throw new IllegalArgumentException("Unknown data type: "+p1.getType(i));
             }
             i = i + 1;
          }else {
             p0.endArray();
             return;
          }
       }
    }
    public static void readableMapValue(JsonWriter p0,ReadableMap p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsonWriterHelper.class, "3")) {
          return;
       }
       p0.beginObject();
       ReadableMapKeySetIterator readableMapK = p1.keySetIterator();
       while (true) {
          if (readableMapK.hasNextKey()) {
             String str = readableMapK.nextKey();
             p0.name(str);
             switch (JsonWriterHelper$1.$SwitchMap$com$facebook$react$bridge$ReadableType[p1.getType(str).ordinal()]){
                 case 1:
                   p0.nullValue();
                   break;
                 case 2:
                   p0.value(p1.getBoolean(str));
                   break;
                 case 3:
                   p0.value(p1.getDouble(str));
                   break;
                 case 4:
                   p0.value(p1.getString(str));
                   break;
                 case 5:
                   JsonWriterHelper.readableMapValue(p0, p1.getMap(str));
                   break;
                 case 6:
                   JsonWriterHelper.readableArrayValue(p0, p1.getArray(str));
                   break;
                 default:
                   throw new IllegalArgumentException("Unknown data type: "+p1.getType(str));
             }
          }else {
             p0.endObject();
             return;
          }
       }
    }
    public static void value(JsonWriter p0,Object p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, JsonWriterHelper.class, "1")) {
          return;
       }
       if (p1 instanceof Map) {
          JsonWriterHelper.mapValue(p0, p1);
       }else if(p1 instanceof List){
          JsonWriterHelper.listValue(p0, p1);
       }else if(p1 instanceof ReadableMap){
          JsonWriterHelper.readableMapValue(p0, p1);
       }else if(p1 instanceof ReadableArray){
          JsonWriterHelper.readableArrayValue(p0, p1);
       }else if(p1 instanceof Dynamic){
          JsonWriterHelper.dynamicValue(p0, p1);
       }else {
          JsonWriterHelper.objectValue(p0, p1);
       }
       return;
    }
}
