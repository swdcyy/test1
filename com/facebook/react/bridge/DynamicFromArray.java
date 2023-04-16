package com.facebook.react.bridge.DynamicFromArray;
import com.facebook.react.bridge.Dynamic;
import androidx.core.util.Pools$SimplePool;
import java.lang.Object;
import com.facebook.react.bridge.ReadableArray;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;
import java.lang.Boolean;
import java.lang.Number;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

public class DynamicFromArray implements Dynamic	// class@0011bc
{
    public ReadableArray mArray;
    public int mIndex;
    public static final Pools$SimplePool sPool;

    static {
       DynamicFromArray.sPool = new Pools$SimplePool(10);
    }
    public void DynamicFromArray(){
       super();
       this.mIndex = -1;
    }
    public static DynamicFromArray create(ReadableArray p0,int p1){
       DynamicFromArray uDynamicFrom = DynamicFromArray.class;
       if (PatchProxy.isSupport(uDynamicFrom)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Integer.valueOf(p1), null, uDynamicFrom, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       uDynamicFrom = DynamicFromArray.sPool.q();
       if (uDynamicFrom == null) {
          uDynamicFrom = new DynamicFromArray();
       }
       uDynamicFrom.mArray = p0;
       uDynamicFrom.mIndex = p1;
       return uDynamicFrom;
    }
    public ReadableArray asArray(){
       DynamicFromArray obj = PatchProxy.apply(null, this, DynamicFromArray.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mArray;
       if (obj != null) {
          return obj.getArray(this.mIndex);
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public boolean asBoolean(){
       DynamicFromArray obj = PatchProxy.apply(null, this, DynamicFromArray.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mArray;
       if (obj != null) {
          return obj.getBoolean(this.mIndex);
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public double asDouble(){
       DynamicFromArray obj = PatchProxy.apply(null, this, DynamicFromArray.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj.doubleValue();
       }
       obj = this.mArray;
       if (obj != null) {
          return obj.getDouble(this.mIndex);
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public int asInt(){
       DynamicFromArray obj = PatchProxy.apply(null, this, DynamicFromArray.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.mArray;
       if (obj != null) {
          return obj.getInt(this.mIndex);
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public ReadableMap asMap(){
       DynamicFromArray obj = PatchProxy.apply(null, this, DynamicFromArray.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mArray;
       if (obj != null) {
          return obj.getMap(this.mIndex);
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public String asString(){
       DynamicFromArray obj = PatchProxy.apply(null, this, DynamicFromArray.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mArray;
       if (obj != null) {
          return obj.getString(this.mIndex);
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public ReadableType getType(){
       DynamicFromArray obj = PatchProxy.apply(null, this, DynamicFromArray.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mArray;
       if (obj != null) {
          return obj.getType(this.mIndex);
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public boolean isNull(){
       DynamicFromArray obj = PatchProxy.apply(null, this, DynamicFromArray.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.mArray;
       if (obj != null) {
          return obj.isNull(this.mIndex);
       }
       throw new IllegalStateException("This dynamic value has been recycled");
    }
    public void recycle(){
       if (PatchProxy.applyVoid(null, this, DynamicFromArray.class, "2")) {
          return;
       }
       this.mArray = null;
       this.mIndex = -1;
       DynamicFromArray.sPool.a(this);
       return;
    }
}
