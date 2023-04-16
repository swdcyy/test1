package com.kwai.sdk.eve.internal.nn.TensorBufferCache;
import java.util.TreeMap;
import com.kwai.sdk.eve.internal.nn.TensorBufferCache$a;
import nsd.u;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import mxd.a;
import java.util.Set;
import nn7.c;
import kotlin.jvm.internal.a;
import java.nio.ByteBuffer;
import java.util.Map;
import com.kwai.sdk.eve.internal.nn.api.DataType;
import org.tensorflow.lite.DataType;
import mn7.a;
import java.lang.Enum;
import java.lang.IllegalStateException;
import java.nio.Buffer;
import java.lang.Number;
import java.util.Collection;

public final class TensorBufferCache extends TreeMap	// class@001577
{
    public static final TensorBufferCache$a Companion;

    static {
       TensorBufferCache.Companion = new TensorBufferCache$a(null);
    }
    public void TensorBufferCache(){
       super();
    }
    public void TensorBufferCache(u p0){
       super();
    }
    public void clear(){
       if (PatchProxy.applyVoid(null, this, TensorBufferCache.class, "5")) {
          return;
       }
       super.clear();
       return;
    }
    public final boolean containsKey(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof String) {
          return this.containsKey(p0);
       }
       return false;
    }
    public boolean containsKey(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsKey(p0);
    }
    public final boolean containsValue(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (p0 instanceof a) {
          return this.containsValue(p0);
       }
       return false;
    }
    public boolean containsValue(a p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.containsValue(p0);
    }
    public final Set entrySet(){
       Object obj = PatchProxy.apply(null, this, TensorBufferCache.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getEntries();
    }
    public final Object get(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.get(p0);
       }
       return null;
    }
    public a get(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.get(p0);
    }
    public final a get(c p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "tensor");
       return this.get(p0.name());
    }
    public Set getEntries(){
       Object obj = PatchProxy.apply(null, this, TensorBufferCache.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.entrySet();
    }
    public Set getKeys(){
       Object obj = PatchProxy.apply(null, this, TensorBufferCache.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.keySet();
    }
    public final Object getOrDefault(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TensorBufferCache.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.getOrDefault(p0, p1);
       }
       return p1;
    }
    public a getOrDefault(String p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TensorBufferCache.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.getOrDefault(p0, p1);
    }
    public final ByteBuffer getOrPutBuffer(c p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       String obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "2");
       if (obj != patchProxyRe) {
          return obj;
       }
       a.p(p0, "tensor");
       obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "3");
       if (obj != patchProxyRe) {
       }else {
          obj = p0.name();
          a uoa = this.get(obj);
          if (uoa == null) {
             int[] ointArray = p0.e();
             DataType uDataType = p0.d();
             DataType uDataType1 = PatchProxy.applyOneRefs(uDataType, this, TensorBufferCache.class, "4");
             if (uDataType1 != patchProxyRe) {
             }else {
                switch (a.a[uDataType.ordinal()]){
                    case 1:
                      uDataType = DataType.FLOAT32;
                      break;
                    case 2:
                      uDataType = DataType.INT32;
                      break;
                    case 3:
                      uDataType = DataType.UINT8;
                      break;
                    case 4:
                      uDataType = DataType.INT64;
                      break;
                    case 5:
                      uDataType = DataType.STRING;
                      break;
                    case 6:
                      uDataType = DataType.BOOL;
                      break;
                    case 7:
                      uDataType = DataType.INT8;
                      break;
                    default:
                      throw new IllegalStateException("unknown data type".toString());
                }
                uDataType1 = uDataType;
             }
             uoa = a.c(ointArray, uDataType1);
             a.o(uoa, "TensorBuffer.createFixed¡­ataType\(\).toTFDataType\(\)\)");
             this.put(obj, uoa);
          }
          Object obj1 = uoa;
       }
       obj.d().rewind();
       ByteBuffer uByteBuffer = obj.d();
       a.o(uByteBuffer, "getOrPut\(tensor\).apply { buffer.rewind\(\) }.buffer");
       return uByteBuffer;
    }
    public int getSize(){
       Object obj = PatchProxy.apply(null, this, TensorBufferCache.class, "24");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return super.size();
    }
    public Collection getValues(){
       Object obj = PatchProxy.apply(null, this, TensorBufferCache.class, "22");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.values();
    }
    public final Set keySet(){
       Object obj = PatchProxy.apply(null, this, TensorBufferCache.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getKeys();
    }
    public final Object remove(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof String) {
          return this.remove(p0);
       }
       return null;
    }
    public a remove(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, TensorBufferCache.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return super.remove(p0);
    }
    public final boolean remove(Object p0,Object p1){
       int i;
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TensorBufferCache.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = 1;
       v1 = (p0 != null)? p0 instanceof String: 1;
       if (v1) {
          if (p1 != null) {
             v0 = p1 instanceof a;
          }
          if (obj) {
             return this.remove(p0, p1);
          }
       }
       return false;
    }
    public boolean remove(String p0,a p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, TensorBufferCache.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return super.remove(p0, p1);
    }
    public final int size(){
       Object obj = PatchProxy.apply(null, this, TensorBufferCache.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return this.getSize();
    }
    public final Collection values(){
       Object obj = PatchProxy.apply(null, this, TensorBufferCache.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.getValues();
    }
}
