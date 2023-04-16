package com.kwai.framework.config.stat.utils.a;
import java.lang.Object;
import java.nio.channels.FileChannel;
import android.util.Pair;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Number;
import java.lang.Math;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.lang.Long;
import com.kwai.framework.config.stat.utils.SignatureNotFoundException;
import java.lang.StringBuilder;
import java.io.IOException;
import java.util.Map;
import java.lang.Integer;
import java.nio.Buffer;
import java.util.LinkedHashMap;
import java.nio.BufferUnderflowException;
import java.lang.IllegalArgumentException;

public final class a	// class@00150d
{

    public void a(){
       super();
    }
    public static Pair a(FileChannel p0){
       long l;
       Pair pair;
       long l1;
       Object obj = p0;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object obj1 = null;
       ByteBuffer obj2 = PatchProxy.applyOneRefs(obj, obj1, uoa, "4");
       if (obj2 != patchProxyRe) {
          return obj2;
       }
       obj2 = PatchProxy.applyOneRefs(obj, obj1, uoa, "2");
       if (obj2 != patchProxyRe) {
          l = obj2.longValue();
       }else {
          obj2 = PatchProxy.applyOneRefs(obj, obj1, uoa, "1");
          l = 4;
          if (obj2 != patchProxyRe) {
             l1 = obj2.longValue();
          }else {
             l1 = p0.size();
             long l2 = 22;
             if (l1 - l2 >= 0) {
                l1 = l1 - l2;
                l2 = Math.min(l1, 0xffff);
                int i1 = 0;
                while (true) {
                   long l3 = (long)i1;
                   if (l3 - l2 > 0) {
                      throw new IOException("ZIP End of Central Directory \(EOCD\) record not found");
                   }
                   l3 = l1 - l3;
                   ByteBuffer uByteBuffer1 = ByteBuffer.allocate(l);
                   obj.position(l3);
                   obj.read(uByteBuffer1);
                   ByteOrder lITTLE_ENDIA1 = ByteOrder.LITTLE_ENDIAN;
                   uByteBuffer1.order(lITTLE_ENDIA1);
                   if (uByteBuffer1.getInt(0) == 0x6054b50) {
                      uByteBuffer1 = ByteBuffer.allocate(2);
                      l3 = l3 + 20;
                      obj.position(l3);
                      obj.read(uByteBuffer1);
                      uByteBuffer1.order(lITTLE_ENDIA1);
                      short shortx = uByteBuffer1.getShort(0);
                      if (shortx == i1) {
                         l1 = (long)shortx;
                      }
                   }
                   i1 = i1 + 1;
                }
                return pair;
             }else {
                throw new IOException("APK too small for ZIP End of Central Directory \(EOCD\) record");
             }
          }
          if (PatchProxy.isSupport(uoa)) {
             obj2 = PatchProxy.applyTwoRefs(obj, Long.valueOf(l1), obj1, uoa, "3");
             if (obj2 != patchProxyRe) {
                l = obj2.longValue();
             }
          }
          obj2 = ByteBuffer.allocate(l);
          obj2.order(ByteOrder.LITTLE_ENDIAN);
          obj.position(((p0.size() - l1) - 6));
          obj.read(obj2);
          l = (long)obj2.getInt(0);
       }
       if (PatchProxy.isSupport(uoa)) {
          pair = PatchProxy.applyTwoRefs(obj, Long.valueOf(l), obj1, uoa, "5");
          if (pair != patchProxyRe) {
             goto label_013f ;
          }
       }
       if (l - 32 >= 0) {
          obj.position((l - 24));
          ByteBuffer uByteBuffer = ByteBuffer.allocate(24);
          obj.read(uByteBuffer);
          ByteOrder lITTLE_ENDIA = ByteOrder.LITTLE_ENDIAN;
          uByteBuffer.order(lITTLE_ENDIA);
          if (!uByteBuffer.getLong(8) - 0x20676953204b5041 && !uByteBuffer.getLong(16) - 0x3234206b636f6c42) {
             long longx = uByteBuffer.getLong(0);
             if (longx - (long)uByteBuffer.capacity() >= 0 && longx - 0x7ffffff7 <= 0) {
                int i = (int)(8 + longx);
                l = l - (long)i;
                if (l >= 0) {
                   obj.position(l);
                   uByteBuffer = ByteBuffer.allocate(i);
                   obj.read(uByteBuffer);
                   uByteBuffer.order(lITTLE_ENDIA);
                   long longx1 = uByteBuffer.getLong(0);
                   if (!longx1 - longx) {
                      pair = new Pair(uByteBuffer, Long.valueOf(l));
                      goto label_013f ;
                   }else {
                      throw new SignatureNotFoundException("APK Signing Block sizes in header and footer do not match: "+longx1+" vs "+longx);
                   }
                }else {
                   throw new SignatureNotFoundException("APK Signing Block offset out of range: "+l);
                }
             }else {
                throw new SignatureNotFoundException("APK Signing Block size out of range: "+longx);
             }
          }else {
             throw new SignatureNotFoundException("No APK Signing Block before ZIP Central Directory");
          }
       }else {
          throw new SignatureNotFoundException("APK too small for APK Signing Block. ZIP Central Directory offset: "+l);
       }
    }
    public static Map b(ByteBuffer p0){
       ByteBuffer uByteBuffer;
       ByteBuffer uByteBuffer1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       String obj = PatchProxy.applyOneRefs(p0, null, uoa, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, null, uoa, "9") && p0.order() != ByteOrder.LITTLE_ENDIAN) {
          throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
       }
       int i = p0.capacity() - 24;
       int i1 = 0;
       if (PatchProxy.isSupport(uoa)) {
          uByteBuffer = PatchProxy.applyThreeRefs(p0, Integer.valueOf(8), Integer.valueOf(i), null, a.class, "7");
          if (uByteBuffer != patchProxyRe) {
          label_0079 :
             LinkedHashMap linkedHashMa = new LinkedHashMap();
             while (true) {
                if (!uByteBuffer.hasRemaining()) {
                   return linkedHashMa;
                }
                i1 = i1 + 1;
                if (uByteBuffer.remaining() >= 8) {
                   long longx = uByteBuffer.getLong();
                   obj = " size out of range: ";
                   String str = "APK Signing Block entry #";
                   if (longx - 4 >= 0 && longx - 0x7fffffff <= 0) {
                      int i2 = (int)longx;
                      int i3 = uByteBuffer.position() + i2;
                      if (i2 <= uByteBuffer.remaining()) {
                         Integer integer = Integer.valueOf(uByteBuffer.getInt());
                         i2 = i2 - 4;
                         if (PatchProxy.isSupport(uoa)) {
                            uByteBuffer1 = PatchProxy.applyTwoRefs(uByteBuffer, Integer.valueOf(i2), null, uoa, "8");
                            if (uByteBuffer1 != patchProxyRe) {
                            label_00f0 :
                               linkedHashMa.put(integer, uByteBuffer1);
                               uByteBuffer.position(i3);
                            }
                         }
                         if (i2 >= 0) {
                            int i4 = uByteBuffer.limit();
                            int i5 = uByteBuffer.position();
                            i2 = i2 + i5;
                            if (i2 >= i5 && i2 <= i4) {
                               uByteBuffer.limit(i2);
                               ByteBuffer uByteBuffer2 = uByteBuffer.slice();
                               uByteBuffer2.order(uByteBuffer.order());
                               uByteBuffer.position(i2);
                               uByteBuffer.limit(i4);
                               uByteBuffer1 = uByteBuffer2;
                               goto label_00f0 ;
                            }else {
                               break ;
                            }
                         }else {
                            throw new IllegalArgumentException("size: "+i2);
                         }
                      }else {
                         throw new SignatureNotFoundException(str+i1+obj+i2+", available: "+uByteBuffer.remaining());
                      }
                   }else {
                      throw new SignatureNotFoundException(str+i1+obj+longx);
                   }
                }else {
                   throw new SignatureNotFoundException("Insufficient data to read size of APK Signing Block entry #"+i1);
                }
             }
             throw new BufferUnderflowException();
          }
       }
       if (i >= 8) {
          int i6 = p0.capacity();
          if (i <= p0.capacity()) {
             p0.position(i1);
             p0.limit(i);
             p0.position(8);
             ByteBuffer uByteBuffer3 = p0.slice();
             uByteBuffer3.order(p0.order());
             p0.position(i1);
             p0.limit(p0.limit());
             p0.position(p0.position());
             uByteBuffer = uByteBuffer3;
             goto label_0079 ;
          }else {
             throw new IllegalArgumentException("end > capacity: "+i+" > "+i6);
          }
       }else {
          throw new IllegalArgumentException("end < start: "+i+" < "+8);
       }
    }
}
