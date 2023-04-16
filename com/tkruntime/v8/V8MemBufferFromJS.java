package com.tkruntime.v8.V8MemBufferFromJS;
import java.lang.Object;
import java.util.HashMap;
import android.util.LruCache;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.tkruntime.v8.V8;
import java.lang.Integer;
import java.lang.Double;
import java.lang.Long;
import java.nio.ByteBuffer;
import com.tkruntime.v8.V8MemBufferFromJS$BufferAbbrev;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import com.tkruntime.v8.V8Map;
import com.tkruntime.v8.StringPool;
import java.util.Map;
import com.tkruntime.v8.V8TypedArray;
import com.tkruntime.v8.V8Function;
import com.tkruntime.v8.V8Object;
import com.tkruntime.v8.V8Array;
import com.tkruntime.v8.V8ArrayBuffer;
import java.lang.Number;

public class V8MemBufferFromJS	// class@000fbf
{
    public V8MemBufferFromJS$BufferAbbrev mBuffer;
    public int mCnt;
    public int mReadIndex;
    public V8 mV8;
    public static Object[] EMPTY_OBJECT_ARRAY;
    public static int sAvailIndex;
    public static V8MemBufferFromJS[] sBuffers;
    public static boolean sEndianInited;
    public static boolean sIsBigEndian;
    public static Map sStrongCache;
    public static Map sStrongCacheIndex;
    public static LruCache sWeakCache;

    static {
       V8MemBufferFromJS[] v8MemBufferF = new V8MemBufferFromJS[16];
       V8MemBufferFromJS.sBuffers = v8MemBufferF;
       Object[] objArray = new Object[0];
       V8MemBufferFromJS.EMPTY_OBJECT_ARRAY = objArray;
       V8MemBufferFromJS.sStrongCache = new HashMap();
       V8MemBufferFromJS.sStrongCacheIndex = new HashMap();
       V8MemBufferFromJS.sWeakCache = new LruCache(256);
       V8MemBufferFromJS.isBigEndian();
    }
    public void V8MemBufferFromJS(){
       super();
       this.mV8 = null;
       this.mCnt = 0;
       this.mReadIndex = 0;
       this.mBuffer = null;
    }
    public static boolean isBigEndian(){
       Object obj = PatchProxy.apply(null, null, V8MemBufferFromJS.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!V8MemBufferFromJS.sEndianInited) {
          V8MemBufferFromJS.sIsBigEndian = V8._isBigEndian();
          V8MemBufferFromJS.sEndianInited = true;
       }
       return V8MemBufferFromJS.sIsBigEndian;
    }
    public static void loadDoubleIntoBytes(byte[] p0,int p1,double p2){
       if (PatchProxy.isSupport(V8MemBufferFromJS.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Double.valueOf(p2), null, V8MemBufferFromJS.class, "3")) {
          return;
       }
       V8MemBufferFromJS.loadLongIntoBytes(p0, p1, Double.doubleToLongBits(p2));
       return;
    }
    public static void loadIntIntoBytes(byte[] p0,int p1,int p2){
       if (!V8MemBufferFromJS.sIsBigEndian) {
          p0[p1] = (byte)(p2 & 0x00ff);
          p0[(p1 + 1)] = (byte)((p2 >> 8) & 0x00ff);
          p0[(p1 + 2)] = (byte)((p2 >> 16) & 0x00ff);
          p0[(p1 + 3)] = (byte)((p2 >> 24) & 0x00ff);
       }else {
          p0[p1] = (byte)((p2 >> 24) & 0x00ff);
          p0[(p1 + 1)] = (byte)((p2 >> 16) & 0x00ff);
          p0[(p1 + 2)] = (byte)((p2 >> 8) & 0x00ff);
          p0[(p1 + 3)] = (byte)(p2 & 0x00ff);
       }
       return;
    }
    public static void loadLongIntoBytes(byte[] p0,int p1,long p2){
       if (PatchProxy.isSupport(V8MemBufferFromJS.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Long.valueOf(p2), null, V8MemBufferFromJS.class, "2")) {
          return;
       }
       if (!V8MemBufferFromJS.sIsBigEndian) {
          V8MemBufferFromJS.loadIntIntoBytes(p0, p1, (int)(p2 & 0xffffffff));
          V8MemBufferFromJS.loadIntIntoBytes(p0, (p1 + 4), (int)((p2 >> 32) & 0xffffffff));
       }else {
          V8MemBufferFromJS.loadIntIntoBytes(p0, p1, (int)((p2 >> 32) & 0xffffffff));
          V8MemBufferFromJS.loadIntIntoBytes(p0, (p1 + 4), (int)(p2 & 0xffffffff));
       }
       return;
    }
    public static V8MemBufferFromJS obtain(ByteBuffer p0,V8 p1){
       object oobject = null;
       V8MemBufferFromJS[] obj = PatchProxy.applyTwoRefs(p0, p1, oobject, V8MemBufferFromJS.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = V8MemBufferFromJS.sBuffers;
       _monitor_enter(obj);
       int sAvailIndex = V8MemBufferFromJS.sAvailIndex;
       if (sAvailIndex >= 0) {
          V8MemBufferFromJS[] sBuffers = V8MemBufferFromJS.sBuffers;
          object oobject1 = sBuffers[sAvailIndex];
          V8MemBufferFromJS.sAvailIndex = sAvailIndex - 1;
          sBuffers[sAvailIndex] = oobject;
          oobject = oobject1;
       }
       _monitor_exit(obj);
       if (oobject == null) {
          oobject = new V8MemBufferFromJS();
       }
       oobject.init(p0, p0.arrayOffset(), p1);
       return oobject;
    }
    public static V8MemBufferFromJS$BufferAbbrev obtainBuffer(){
       Object obj = PatchProxy.apply(null, null, V8MemBufferFromJS.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new V8MemBufferFromJS$BufferAbbrev();
    }
    public static long readLong(byte[] p0,int p1){
       int i;
       int i1;
       int i2;
       long l1;
       long l = 32;
       if (!V8MemBufferFromJS.sIsBigEndian) {
          i = p1 + 1;
          i1 = i + 1;
          i = i1 + 1;
          i1 = i + 1;
          i = i1 + 1;
          i2 = i + 1;
          i1 = i2 + 1;
          l = (long)(((p0[i1] & 0x00ff) << 24) | ((((p0[i] & 0x00ff) << 8) | ((p0[i1] & 0x00ff) << 0)) | ((p0[i2] & 0x00ff) << 16))) << l;
          l1 = (long)(((((p0[p1] & 0x00ff) << 0) | ((p0[i] & 0x00ff) << 8)) | ((p0[i1] & 0x00ff) << 16)) | ((p0[i] & 0x00ff) << 24));
       }else {
          i = p1 + 1;
          i1 = i + 1;
          i = i1 + 1;
          i1 = i + 1;
          i = i1 + 1;
          i2 = i + 1;
          i1 = i2 + 1;
          l = (long)(((((p0[p1] & 0x00ff) << 24) | ((p0[i] & 0x00ff) << 16)) | ((p0[i1] & 0x00ff) << 8)) | ((p0[i] & 0x00ff) << 0)) << l;
          l1 = (long)(((p0[i1] & 0x00ff) << 0) | ((((p0[i] & 0x00ff) << 16) | ((p0[i1] & 0x00ff) << 24)) | ((p0[i2] & 0x00ff) << 8)));
       }
       return ((l1 & 0xffffffff) | l);
    }
    public final Object _readObject(){
       Map sStrongCache;
       int i3;
       char[] uocharArray;
       String str;
       long l;
       Object trackedObj;
       LruCache sWeakCache;
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, V8MemBufferFromJS.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.mReadIndex >= this.mCnt) {
          throw new RuntimeException("nothing to read anymore!");
       }
       int i = this.mBuffer.readByte() & 0x00ff;
       int i1 = this.mReadIndex + 1;
       this.mReadIndex = i1;
       if (i != 10) {
          if (i == 17) {
             return this.mV8.getTrackedObj(this.mBuffer.readLong());
          }
          Map map = null;
          int i2 = 0;
          switch (i){
              case 0:
                return objArray;
              case 1:
                return Integer.valueOf(this.mBuffer.readInt());
              case 2:
                return Double.valueOf(this.mBuffer.readDouble());
              case 3:
                if (!this.mBuffer.readByte()) {
                   return Boolean.FALSE;
                }else {
                   return Boolean.TRUE;
                }
                break;
              case 4:
                i = this.mBuffer.readInt();
                if (i) {
                   sStrongCache = V8MemBufferFromJS.sStrongCache;
                   _monitor_enter(sStrongCache);
                   objArray = V8MemBufferFromJS.sStrongCache.get(Integer.valueOf(i));
                   _monitor_exit(sStrongCache);
                }
                i1 = this.mBuffer.readInt();
                i3 = i1 / 2;
                if (objArray != null && i3 == objArray.length()) {
                   this.mBuffer.skip(i1);
                   return objArray;
                }else if(i1 <= 0){
                   return "";
                }else {
                   uocharArray = new char[i3];
                   for (; i2 < i3; i2 = i2 + 1) {
                      uocharArray[i2] = (char)this.mBuffer.readShort();
                   }
                   str = new String(uocharArray);
                   if ((long)i - map) {
                      sStrongCache = V8MemBufferFromJS.sStrongCache;
                      _monitor_enter(sStrongCache);
                      V8MemBufferFromJS.sStrongCache.put(Integer.valueOf(i), str);
                      V8MemBufferFromJS.sStrongCacheIndex.put(str, Integer.valueOf(i));
                      _monitor_exit(sStrongCache);
                   }
                   return str;
                }
                break;
              case 5:
                l = this.mBuffer.readLong();
                trackedObj = this.mV8.getTrackedObj(l);
                if (trackedObj != null) {
                   return trackedObj;
                }else {
                   return new V8Array(this.mV8, l);
                }
                break;
              case 6:
                l = this.mBuffer.readLong();
                trackedObj = this.mV8.getTrackedObj(l);
                if (trackedObj != null) {
                   return trackedObj;
                }else {
                   return new V8Object(this.mV8, l);
                }
                break;
              case 7:
                l = this.mBuffer.readLong();
                trackedObj = this.mV8.getTrackedObj(l);
                if (trackedObj != null) {
                   return trackedObj;
                }else {
                   return new V8Function(this.mV8, l);
                }
                break;
              case 8:
                l = this.mBuffer.readLong();
                trackedObj = this.mV8.getTrackedObj(l);
                if (trackedObj != null) {
                   return trackedObj;
                }else {
                   return new V8TypedArray(this.mV8, l);
                }
                break;
              default:
                switch (i){
                    case 20:
                      i = this.mBuffer.readInt();
                      if (i) {
                         sWeakCache = V8MemBufferFromJS.sWeakCache;
                         _monitor_enter(sWeakCache);
                         str = V8MemBufferFromJS.sWeakCache.get(Integer.valueOf(i));
                         _monitor_exit(sWeakCache);
                         if (str == null) {
                            sStrongCache = V8MemBufferFromJS.sStrongCache;
                            _monitor_enter(sStrongCache);
                            str = V8MemBufferFromJS.sStrongCache.get(Integer.valueOf(i));
                            _monitor_exit(sStrongCache);
                         }
                      }
                      i1 = this.mBuffer.readInt();
                      i3 = i1 / 2;
                      if (str != null && i3 == str.length()) {
                         this.mBuffer.skip(i1);
                         return str;
                      }else if(i1 <= 0){
                         return "";
                      }else {
                         uocharArray = new char[i3];
                         for (; i2 < i3; i2 = i2 + 1) {
                            uocharArray[i2] = (char)this.mBuffer.readShort();
                         }
                         str = new String(uocharArray);
                         if ((long)i - map) {
                            sWeakCache = V8MemBufferFromJS.sWeakCache;
                            _monitor_enter(sWeakCache);
                            V8MemBufferFromJS.sWeakCache.put(Integer.valueOf(i), str);
                            _monitor_exit(sWeakCache);
                         }
                         return str;
                      }
                      break;
                    case 21:
                      i = this.mBuffer.readInt();
                      if (i >= 0) {
                         String[] sSortedHighF = StringPool.sSortedHighFrequencyStrings;
                         if (i < sSortedHighF.length) {
                            return sSortedHighF[i];
                         }
                      }
                      return objArray;
                      break;
                    case 22:
                      l = this.mBuffer.readLong();
                      trackedObj = this.mV8.getTrackedObj(l);
                      if (trackedObj != null) {
                         return trackedObj;
                      }
                      return new V8Map(this.mV8, l);
                      break;
                    case 23:
                    default:
                      this.mReadIndex = i1 - 1;
                      throw new RuntimeException("unknown type  "+i);
                }
                return Long.valueOf(this.mBuffer.readLong());
          }
       }else {
          i = this.mBuffer.readInt();
          if (i <= 0) {
             return objArray;
          }
          this.mBuffer.skip(i);
          l = this.mBuffer.readLong();
          Object trackedObj1 = this.mV8.getTrackedObj(l);
          if (trackedObj1 != null) {
             return trackedObj1;
          }
          return new V8ArrayBuffer(this.mV8, l, objArray);
       }
    }
    public Object[] getAllObjects(){
       V8MemBufferFromJS obj = PatchProxy.apply(null, this, V8MemBufferFromJS.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.mCnt;
       V8MemBufferFromJS tmReadIndex = this.mReadIndex;
       if ((obj - tmReadIndex) <= 0) {
          return V8MemBufferFromJS.EMPTY_OBJECT_ARRAY;
       }
       Object[] objArray = new Object[(obj - tmReadIndex)];
       int i = 0;
       while (tmReadIndex < this.mCnt) {
          int i1 = i + 1;
          objArray[i] = this.readObject();
          tmReadIndex = tmReadIndex + 1;
          i = i1;
       }
       return objArray;
    }
    public V8MemBufferFromJS$BufferAbbrev getBuffer(){
       return this.mBuffer;
    }
    public int getObjectCnt(){
       return this.mCnt;
    }
    public boolean hasRemaining(){
       int i = 1;
       if (this.mReadIndex < (this.mCnt - i)) {
       }else {
          i = false;
       }
       return i;
    }
    public void init(ByteBuffer p0,int p1,V8 p2){
       if (PatchProxy.isSupport(V8MemBufferFromJS.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), p2, this, V8MemBufferFromJS.class, "5")) {
          return;
       }
       this.mV8 = p2;
       byte[] uobyteArray = p0.array();
       int i = 0;
       if (uobyteArray == null) {
          this.mCnt = i;
          return;
       }else {
          this.mReadIndex = i;
          if (this.mBuffer == null) {
             this.mBuffer = V8MemBufferFromJS.obtainBuffer();
          }
          V8MemBufferFromJS tmBuffer = this.mBuffer;
          tmBuffer.bytes = uobyteArray;
          tmBuffer.byteIndex = p1;
          tmBuffer.bufferLen = uobyteArray.length;
          tmBuffer.bigEndian = V8MemBufferFromJS.sIsBigEndian;
          tmBuffer.skip(4);
          this.mCnt = this.mBuffer.readInt();
          return;
       }
    }
    public int readInt(){
       Object obj = PatchProxy.apply(null, this, V8MemBufferFromJS.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       if (this.mReadIndex >= this.mCnt) {
          throw new RuntimeException("nothing to read anymore!");
       }
       int i = this.mBuffer.readByte() & 0x00ff;
       int i1 = 1;
       this.mReadIndex = this.mReadIndex + i1;
       if (i == i1) {
          return this.mBuffer.readInt();
       }
       throw new RuntimeException("expect integer ,but provide type = "+i);
    }
    public long readLong(){
       Object obj = PatchProxy.apply(null, this, V8MemBufferFromJS.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj.longValue();
       }
       if (this.mReadIndex >= this.mCnt) {
          throw new RuntimeException("nothing to read anymore!");
       }
       this.mBuffer.readByte();
       this.mReadIndex = this.mReadIndex + 1;
       return this.mBuffer.readLong();
    }
    public Object readObject(){
       Object obj = PatchProxy.apply(null, this, V8MemBufferFromJS.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this._readObject();
    }
    public void recycle(){
       V8MemBufferFromJS[] sBuffers = V8MemBufferFromJS.sBuffers;
       _monitor_enter(sBuffers);
       int sAvailIndex = V8MemBufferFromJS.sAvailIndex;
       V8MemBufferFromJS[] sBuffers1 = V8MemBufferFromJS.sBuffers;
       if (sAvailIndex >= (sBuffers1.length - 1)) {
          _monitor_exit(sBuffers);
          return;
       }else {
          sAvailIndex = sAvailIndex + 1;
          V8MemBufferFromJS.sAvailIndex = sAvailIndex;
          sBuffers1[sAvailIndex] = this;
          this.mV8 = null;
          _monitor_exit(sBuffers);
          return;
       }
    }
}
