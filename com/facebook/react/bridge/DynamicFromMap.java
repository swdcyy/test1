package com.facebook.react.bridge.DynamicFromMap;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromMap$1;
import java.lang.Object;
import com.facebook.react.bridge.ReadableMap;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.ThreadLocal;
import androidx.core.util.Pools$SimplePool;
import com.facebook.react.bridge.ReadableArray;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import java.lang.Number;
import com.facebook.react.bridge.ReadableType;

public class DynamicFromMap implements Dynamic	// class@0011be
{
    public ReadableMap mMap;
    public String mName;
    public static final ThreadLocal sPool;

    static {
       DynamicFromMap.sPool = new DynamicFromMap$1();
    }
    public void DynamicFromMap(){
       super();
    }
    public static DynamicFromMap create(ReadableMap p0,String p1){
       DynamicFromMap obj = PatchProxy.applyTwoRefs(p0, p1, null, DynamicFromMap.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = DynamicFromMap.sPool.get().q();
       if (obj == null) {
          obj = new DynamicFromMap();
       }
       obj.mMap = p0;
       obj.mName = p1;
       return obj;
    }
    public ReadableArray asArray(){
       DynamicFromMap obj = PatchProxy.apply(null, this, DynamicFromMap.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMap;
       if (obj != null) {
          DynamicFromMap tmName = this.mName;
          if (tmName != null) {
             return obj.getArray(tmName);
          }
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public boolean asBoolean(){
       DynamicFromMap obj = PatchProxy.apply(null, this, DynamicFromMap.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mMap;
       if (obj != null) {
          DynamicFromMap tmName = this.mName;
          if (tmName != null) {
             return obj.getBoolean(tmName);
          }
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public double asDouble(){
       DynamicFromMap obj = PatchProxy.apply(null, this, DynamicFromMap.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.mMap;
       if (obj != null) {
          DynamicFromMap tmName = this.mName;
          if (tmName != null) {
             return obj.getDouble(tmName);
          }
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public int asInt(){
       DynamicFromMap obj = PatchProxy.apply(null, this, DynamicFromMap.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mMap;
       if (obj != null) {
          DynamicFromMap tmName = this.mName;
          if (tmName != null) {
             return obj.getInt(tmName);
          }
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public ReadableMap asMap(){
       DynamicFromMap obj = PatchProxy.apply(null, this, DynamicFromMap.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMap;
       if (obj != null) {
          DynamicFromMap tmName = this.mName;
          if (tmName != null) {
             return obj.getMap(tmName);
          }
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public String asString(){
       DynamicFromMap obj = PatchProxy.apply(null, this, DynamicFromMap.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMap;
       if (obj != null) {
          DynamicFromMap tmName = this.mName;
          if (tmName != null) {
             return obj.getString(tmName);
          }
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public ReadableType getType(){
       DynamicFromMap obj = PatchProxy.apply(null, this, DynamicFromMap.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mMap;
       if (obj != null) {
          DynamicFromMap tmName = this.mName;
          if (tmName != null) {
             return obj.getType(tmName);
          }
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public boolean isNull(){
       DynamicFromMap obj = PatchProxy.apply(null, this, DynamicFromMap.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mMap;
       if (obj != null) {
          DynamicFromMap tmName = this.mName;
          if (tmName != null) {
             return obj.isNull(tmName);
          }
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public void recycle(){
       if (PatchProxy.applyVoid(null, this, DynamicFromMap.class, "2")) {
          return;
       }
       this.mMap = null;
       this.mName = null;
       DynamicFromMap.sPool.get().a(this);
       return;
    }
}
