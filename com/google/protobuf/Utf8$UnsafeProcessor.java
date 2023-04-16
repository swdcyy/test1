package com.google.protobuf.Utf8$UnsafeProcessor;
import com.google.protobuf.Utf8$Processor;
import com.google.protobuf.UnsafeUtil;
import com.google.protobuf.Utf8;
import java.lang.AssertionError;
import java.lang.String;
import com.google.protobuf.Utf8$DecodeUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Object;
import java.lang.Integer;
import java.nio.ByteBuffer;
import java.lang.CharSequence;
import java.lang.Character;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.lang.StringBuilder;
import java.nio.Buffer;

public final class Utf8$UnsafeProcessor extends Utf8$Processor	// class@0004ee
{

    public void Utf8$UnsafeProcessor(){
       super();
    }
    public static boolean isAvailable(){
       boolean b = (UnsafeUtil.hasUnsafeArrayOperations() && UnsafeUtil.hasUnsafeByteBufferOperations())? true: false;
       return b;
    }
    public static int partialIsValidUtf8(long p0,int p1){
       byte b;
       long l1;
       long l2;
       int bytex;
       int i1;
       int i = Utf8$UnsafeProcessor.unsafeEstimateConsecutiveAscii(p0, p1);
       p0 = p0 + (long)i;
       p1 = p1 - i;
       while (true) {
          i = 0;
          b = 0;
          break ;
       }
       long l = 1;
       while (p1 > 0) {
          l1 = p0 + l;
          b = UnsafeUtil.getByte(p0);
          if (b >= 0) {
             p1--;
             p0 = l1;
          }else {
             p0 = l1;
             break ;
          }
       }
       if (!p1) {
          return i;
       }
       p1--;
       i = -32;
       l1 = -65;
       if (b < i) {
          if (!p1) {
             return b;
          }else {
             p1--;
             if (b >= -62) {
                l = l + p0;
                if (UnsafeUtil.getByte(p0) <= l1) {
                label_0037 :
                   p0 = l;
                }
             }
             return -1;
          }
       }else if(b < -16){
          if (p1 < 2) {
             return Utf8$UnsafeProcessor.unsafeIncompleteStateFor(p0, b, p1);
          }else {
             p1 = p1 - 2;
             l2 = p0 + l;
             bytex = UnsafeUtil.getByte(p0);
             if (bytex <= l1) {
                i1 = -96;
                if (b != i || (bytex >= i1 && (b != -19 || bytex < i1))) {
                   l = l + l2;
                   if (UnsafeUtil.getByte(l2) <= l1) {
                   }
                }
             }
             return -1;
          }
       }else if(p1 < 3){
          return Utf8$UnsafeProcessor.unsafeIncompleteStateFor(p0, b, p1);
       }else {
          p1 = p1 - 3;
          l2 = p0 + l;
          bytex = UnsafeUtil.getByte(p0);
          if (bytex <= l1) {
             i1 = b << 28;
             bytex = bytex + 112;
             i1 = i1 + bytex;
             bytex = i1 >> 30;
             if (!bytex) {
                bytex = l2 + l;
                if (UnsafeUtil.getByte(l2) <= l1) {
                   l = l + bytex;
                   if (UnsafeUtil.getByte(bytex) <= l1) {
                   }
                }
             }
          }
          return -1;
       }
    }
    public static int partialIsValidUtf8(byte[] p0,long p1,int p2){
       byte b;
       long l1;
       long l2;
       int bytex;
       int i1;
       int i = Utf8$UnsafeProcessor.unsafeEstimateConsecutiveAscii(p0, p1, p2);
       p2 = p2 - i;
       p1 = p1 + (long)i;
       while (true) {
          i = 0;
          b = 0;
          break ;
       }
       long l = 1;
       while (p2 > 0) {
          l1 = p1 + l;
          b = UnsafeUtil.getByte(p0, p1);
          if (b >= 0) {
             p2--;
             p1 = l1;
          }else {
             p1 = l1;
             break ;
          }
       }
       if (!p2) {
          return i;
       }
       p2--;
       i = -32;
       l1 = -65;
       if (b < i) {
          if (!p2) {
             return b;
          }else {
             p2--;
             if (b >= -62) {
                l = l + p1;
                if (UnsafeUtil.getByte(p0, p1) <= l1) {
                label_0037 :
                   p1 = l;
                }
             }
             return -1;
          }
       }else if(b < -16){
          if (p2 < 2) {
             return Utf8$UnsafeProcessor.unsafeIncompleteStateFor(p0, b, p1, p2);
          }else {
             p2 = p2 - 2;
             l2 = p1 + l;
             bytex = UnsafeUtil.getByte(p0, p1);
             if (bytex <= l1) {
                i1 = -96;
                if (b != i || (bytex >= i1 && (b != -19 || bytex < i1))) {
                   l = l + l2;
                   if (UnsafeUtil.getByte(p0, l2) <= l1) {
                   }
                }
             }
             return -1;
          }
       }else if(p2 < 3){
          return Utf8$UnsafeProcessor.unsafeIncompleteStateFor(p0, b, p1, p2);
       }else {
          p2 = p2 - 3;
          l2 = p1 + l;
          bytex = UnsafeUtil.getByte(p0, p1);
          if (bytex <= l1) {
             i1 = b << 28;
             bytex = bytex + 112;
             i1 = i1 + bytex;
             bytex = i1 >> 30;
             if (!bytex) {
                bytex = l2 + l;
                if (UnsafeUtil.getByte(p0, l2) <= l1) {
                   l = l + bytex;
                   if (UnsafeUtil.getByte(p0, bytex) <= l1) {
                   }
                }
             }
          }
          return -1;
       }
    }
    public static int unsafeEstimateConsecutiveAscii(long p0,int p1){
       if (p1 < 16) {
          return 0;
       }
       int i = ((int)p0 & 0x07) - 8;
       int i1 = i;
       while (true) {
          if (i1 > 0) {
             long l = 1 + p0;
             if (UnsafeUtil.getByte(p0) < 0) {
                return (i - i1);
             }
             i1 = i1 - 1;
             p0 = l;
          }else {
             for (i = p1 - i; i >= 8; i = i - 8) {
                long l1 = UnsafeUtil.getLong(p0) & 0x8080808080808080;
                if (!l1) {
                   p0 = p0 + 8;
                }else {
                   break ;
                }
             }
             return (p1 - i);
          }
       }
    }
    public static int unsafeEstimateConsecutiveAscii(byte[] p0,long p1,int p2){
       int i = 0;
       if (p2 < 16) {
          return i;
       }
       while (true) {
          if (i >= p2) {
             return p2;
          }
          long l = 1 + p1;
          if (UnsafeUtil.getByte(p0, p1) < 0) {
             break ;
          }else {
             i = i + 1;
             p1 = l;
          }
       }
       return i;
    }
    public static int unsafeIncompleteStateFor(long p0,int p1,int p2){
       if (!p2) {
          return Utf8.incompleteStateFor(p1);
       }
       if (p2 == 1) {
          return Utf8.incompleteStateFor(p1, UnsafeUtil.getByte(p0));
       }
       if (p2 == 2) {
          return Utf8.incompleteStateFor(p1, UnsafeUtil.getByte(p0), UnsafeUtil.getByte((p0 + 1)));
       }
       throw new AssertionError();
    }
    public static int unsafeIncompleteStateFor(byte[] p0,int p1,long p2,int p3){
       if (!p3) {
          return Utf8.incompleteStateFor(p1);
       }
       if (p3 == 1) {
          return Utf8.incompleteStateFor(p1, UnsafeUtil.getByte(p0, p2));
       }
       if (p3 == 2) {
          return Utf8.incompleteStateFor(p1, UnsafeUtil.getByte(p0, p2), UnsafeUtil.getByte(p0, (p2 + 1)));
       }
       throw new AssertionError();
    }
    public String decodeUtf8(byte[] p0,int p1,int p2){
       int bytex;
       int i3;
       if (((p1 | p2) | ((p0.length - p1) - p2)) >= 0) {
          int i = p1 + p2;
          char[] uocharArray = new char[p2];
          int i1 = 0;
          while (p1 < i) {
             bytex = UnsafeUtil.getByte(p0, (long)p1);
             if (!Utf8$DecodeUtil.isOneByte(bytex)) {
                break ;
             }else {
                p1++;
                i3 = i1 + 1;
                Utf8$DecodeUtil.handleOneByte(bytex, uocharArray, i1);
                i1 = i3;
             }
          }
          int i2 = i1;
          while (true) {
             if (p1 >= i) {
                return new String(uocharArray, 0, i2);
             }
             i1 = p1 + 1;
             byte bytex1 = UnsafeUtil.getByte(p0, (long)p1);
             if (Utf8$DecodeUtil.isOneByte(bytex1)) {
                bytex = i2 + 1;
                Utf8$DecodeUtil.handleOneByte(bytex1, uocharArray, i2);
                while (i1 < i) {
                   bytex1 = UnsafeUtil.getByte(p0, (long)i1);
                   if (!Utf8$DecodeUtil.isOneByte(bytex1)) {
                   }else {
                      i1 = i1 + 1;
                      i3 = bytex + 1;
                      Utf8$DecodeUtil.handleOneByte(bytex1, uocharArray, bytex);
                      bytex = i3;
                   }
                }
                bytex1 = i1;
                i2 = bytex;
             }else if(Utf8$DecodeUtil.isTwoBytes(bytex1)){
                if (i1 < i) {
                   bytex = i1 + 1;
                   i3 = i2 + 1;
                   Utf8$DecodeUtil.handleTwoBytes(bytex1, UnsafeUtil.getByte(p0, (long)i1), uocharArray, i2);
                   bytex1 = bytex;
                   i2 = i3;
                }else {
                   break ;
                }
             }else if(Utf8$DecodeUtil.isThreeBytes(bytex1)){
                bytex = i - 1;
                if (i1 >= bytex) {
                   throw InvalidProtocolBufferException.invalidUtf8();
                }
                bytex = i1 + 1;
                i3 = bytex + 1;
                int i4 = i2 + 1;
                Utf8$DecodeUtil.handleThreeBytes(bytex1, UnsafeUtil.getByte(p0, (long)i1), UnsafeUtil.getByte(p0, (long)bytex), uocharArray, i2);
                bytex1 = i3;
                i2 = i4;
             }else {
                bytex = i - 2;
                if (i1 >= bytex) {
                   throw InvalidProtocolBufferException.invalidUtf8();
                }
                bytex = i1 + 1;
                i1 = bytex + 1;
                int i5 = i1 + 1;
                int i6 = i2 + 1;
                Utf8$DecodeUtil.handleFourBytes(bytex1, UnsafeUtil.getByte(p0, (long)i1), UnsafeUtil.getByte(p0, (long)bytex), UnsafeUtil.getByte(p0, (long)i1), uocharArray, i2);
                i6 = i6 + 1;
                bytex1 = i5;
                i2 = i6;
             }
          }
          throw InvalidProtocolBufferException.invalidUtf8();
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0.length),Integer.valueOf(p1),Integer.valueOf(p2)};
          throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArray));
       }
    }
    public String decodeUtf8Direct(ByteBuffer p0,int p1,int p2){
       int bytex1;
       int i3;
       int i = p1;
       int i1 = p2;
       if (((i | i1) | ((p0.limit() - i) - i1)) >= 0) {
          long l = UnsafeUtil.addressOffset(p0) + (long)i;
          long l1 = (long)i1 + l;
          char[] uocharArray = new char[i1];
          i1 = 0;
          while (l - l1 < 0) {
             byte bytex = UnsafeUtil.getByte(l);
             if (!Utf8$DecodeUtil.isOneByte(bytex)) {
                break ;
             }else {
                l = l + 1;
                bytex1 = i1 + 1;
                Utf8$DecodeUtil.handleOneByte(bytex, uocharArray, i1);
                i1 = bytex1;
             }
          }
          while (true) {
             int i2 = i1;
             break ;
          }
          while (true) {
             if (l - l1 >= 0) {
                return new String(uocharArray, 0, i2);
             }
             long l2 = l + 1;
             bytex1 = UnsafeUtil.getByte(l);
             if (Utf8$DecodeUtil.isOneByte(bytex1)) {
                i3 = i2 + 1;
                Utf8$DecodeUtil.handleOneByte(bytex1, uocharArray, i2);
                while (l2 - l1 < 0) {
                   byte bytex2 = UnsafeUtil.getByte(l2);
                   if (!Utf8$DecodeUtil.isOneByte(bytex2)) {
                   }else {
                      l2 = l2 + 1;
                      bytex1 = i3 + 1;
                      Utf8$DecodeUtil.handleOneByte(bytex2, uocharArray, i3);
                      i3 = bytex1;
                   }
                }
                i2 = i3;
                l = l2;
             }else if(Utf8$DecodeUtil.isTwoBytes(bytex1)){
                if (l2 - l1 < 0) {
                   l = l2 + 1;
                   bytex = i2 + 1;
                   Utf8$DecodeUtil.handleTwoBytes(bytex1, UnsafeUtil.getByte(l2), uocharArray, i2);
                   i2 = bytex;
                }else {
                   break ;
                }
             }else if(Utf8$DecodeUtil.isThreeBytes(bytex1)){
                l = l1 - 1;
                if (l2 - l >= 0) {
                   throw InvalidProtocolBufferException.invalidUtf8();
                }
                l = l2 + 1;
                long l3 = l + 1;
                bytex = UnsafeUtil.getByte(l);
                i3 = i2 + 1;
                Utf8$DecodeUtil.handleThreeBytes(bytex1, UnsafeUtil.getByte(l2), bytex, uocharArray, i2);
                i2 = i3;
                l = l3;
             }else {
                l = l1 - 2;
                if (l2 - l >= 0) {
                   throw InvalidProtocolBufferException.invalidUtf8();
                }
                l = l2 + 1;
                l2 = l + 1;
                byte bytex3 = UnsafeUtil.getByte(l);
                l = l2 + 1;
                byte bytex4 = UnsafeUtil.getByte(l2);
                i1 = i2 + 1;
                Utf8$DecodeUtil.handleFourBytes(bytex1, UnsafeUtil.getByte(l2), bytex3, bytex4, uocharArray, i2);
                i1 = i1 + 1;
             }
          }
          throw InvalidProtocolBufferException.invalidUtf8();
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0.limit()),Integer.valueOf(p1),Integer.valueOf(p2)};
          throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", objArray));
       }
    }
    public int encodeUtf8(CharSequence p0,byte[] p1,int p2,int p3){
       long l3;
       long l4;
       long l5;
       int i3;
       int i4;
       CharSequence uCharSequenc = p0;
       byte[] uobyteArray = p1;
       int i = p2;
       int i1 = p3;
       long l = (long)i;
       long l1 = (long)i1 + l;
       int i2 = p0.length();
       if (i2 > i1 || (uobyteArray.length - i1) < i) {
          throw new ArrayIndexOutOfBoundsException("Failed writing "+uCharSequenc.charAt((i2 - 1))+" at index "+(i + i1));
       }
       i = 0;
       i1 = 128;
       long l2 = 1;
       while (i < i2) {
          char c = uCharSequenc.charAt(i);
          if (c < i1) {
             l2 = l2 + l;
             UnsafeUtil.putByte(uobyteArray, l, (byte)c);
             i = i + 1;
             l = l2;
          }else if(i == i2){
             return (int)l;
          }else {
             while (true) {
                if (i >= i2) {
                   return (int)l;
                }
                c = uCharSequenc.charAt(i);
                if (c < i1 && l - l1 < 0) {
                   l3 = l + l2;
                   UnsafeUtil.putByte(uobyteArray, l, (byte)c);
                   l = l2;
                   l4 = l3;
                label_0047 :
                   l2 = 128;
                }else if(c < 2048){
                   l3 = l1 - 2;
                   if (l - l3 <= 0) {
                      l3 = l + l2;
                      i1 = c >> 6;
                      i1 = i1 | 0x03c0;
                      UnsafeUtil.putByte(uobyteArray, l, (byte)i1);
                      l5 = l3 + l2;
                      i3 = c & 0x3f;
                      i3 = i3 | 128;
                      UnsafeUtil.putByte(uobyteArray, l3, (byte)i3);
                      l4 = l5;
                      l = l2;
                   }
                }
                i1 = 0xdfff;
                l3 = 0xd800;
                if (c < l3 || i1 < c) {
                   long l6 = l1 - 3;
                   if (l - l6 <= 0) {
                      l3 = l + l2;
                      i1 = c >> 12;
                      i1 = i1 | 0x01e0;
                      UnsafeUtil.putByte(uobyteArray, l, (byte)i1);
                      l5 = l3 + l2;
                      i3 = c >> 6;
                      i3 = i3 & 0x3f;
                      i4 = 128;
                      i3 = i3 | i4;
                      UnsafeUtil.putByte(uobyteArray, l3, (byte)i3);
                      long l7 = l5 + 1;
                      i3 = c & 0x3f;
                      i3 = i3 | i4;
                      UnsafeUtil.putByte(uobyteArray, l5, (byte)i3);
                      l4 = l7;
                      l = 1;
                      goto label_0047 ;
                   }
                }
                l2 = l1 - 4;
                if (l - l2 <= 0) {
                   i1 = i + 1;
                   if (i1 != i2) {
                      char c1 = uCharSequenc.charAt(i1);
                      if (Character.isSurrogatePair(c, c1)) {
                         i = Character.toCodePoint(c, c1);
                         long l8 = l + 1;
                         int i5 = i >> 18;
                         i5 = i5 | 0x00f0;
                         UnsafeUtil.putByte(uobyteArray, l, (byte)i5);
                         l = l8 + 1;
                         i5 = i >> 12;
                         i5 = i5 & 0x3f;
                         i4 = 128;
                         int i6 = i5 | 0x0080;
                         UnsafeUtil.putByte(uobyteArray, l8, (byte)i6);
                         l3 = l + 1;
                         int i7 = i >> 6;
                         i6 = i7 & 0x3f;
                         i6 = i6 | i4;
                         UnsafeUtil.putByte(uobyteArray, l, (byte)i6);
                         l = 1;
                         l4 = l3 + l;
                         i = i & 0x3f;
                         i = i | i4;
                         UnsafeUtil.putByte(uobyteArray, l3, (byte)i);
                         i = i1;
                      }else {
                         i = i1;
                         break ;
                      }
                   }
                   break ;
                }else if(l3 <= c && c <= i1){
                   int i8 = i + 1;
                   if (i8 == i2 || !Character.isSurrogatePair(c, uCharSequenc.charAt(i8))) {
                      throw new Utf8$UnpairedSurrogateException(i, i2);
                   }
                }
                throw new ArrayIndexOutOfBoundsException("Failed writing "+c+" at index "+l);
                i = i + 1;
                i1 = 128;
                l = l4;
                l2 = l;
             }
             throw new Utf8$UnpairedSurrogateException((i - 1), i2);
          }
       }
    }
    public void encodeUtf8Direct(CharSequence p0,ByteBuffer p1){
       long l5;
       long l6;
       int i2;
       long l7;
       int i3;
       long l8;
       int i5;
       CharSequence uCharSequenc = p0;
       ByteBuffer uByteBuffer = p1;
       long l = UnsafeUtil.addressOffset(p1);
       long l1 = (long)p1.position() + l;
       long l2 = (long)p1.limit() + l;
       int i = p0.length();
       if ((long)i - (l2 - l1) > 0) {
          throw new ArrayIndexOutOfBoundsException("Failed writing "+uCharSequenc.charAt((i - 1))+" at index "+p1.limit());
       }
       int i1 = 0;
       long l3 = 128;
       while (i1 < i) {
          char c = uCharSequenc.charAt(i1);
          if (c < l3) {
             l3 = l1 + 1;
             UnsafeUtil.putByte(l1, (byte)c);
             i1 = i1 + 1;
             l1 = l3;
          }else if(i1 == i){
             uByteBuffer.position((int)(l1 - l));
             return;
          }else {
             while (true) {
                if (i1 < i) {
                   c = uCharSequenc.charAt(i1);
                   if (c < l3 && l1 - l2 < 0) {
                      long l4 = l1 + 1;
                      UnsafeUtil.putByte(l1, (byte)c);
                      l1 = l4;
                      l5 = l;
                   }else if(c < 2048){
                      l5 = l2 - 2;
                      if (l1 - l5 <= 0) {
                         l5 = l;
                         l6 = l1 + 1;
                         i2 = c >> 6;
                         i2 = i2 | 0x03c0;
                         UnsafeUtil.putByte(l1, (byte)i2);
                         l7 = l6 + 1;
                         i3 = c & 0x3f;
                         i3 = i3 | 128;
                         UnsafeUtil.putByte(l6, (byte)i3);
                         l1 = l7;
                      label_0080 :
                         c = 128;
                      }
                   }
                   l5 = l;
                   l6 = 0xdfff;
                   l = 0xd800;
                   if (c < l || l6 < c) {
                      l8 = l2 - 3;
                      if (l1 - l8 <= 0) {
                         l6 = l1 + 1;
                         i2 = c >> 12;
                         i2 = i2 | 0x01e0;
                         UnsafeUtil.putByte(l1, (byte)i2);
                         l7 = l6 + 1;
                         i3 = c >> 6;
                         i3 = i3 & 0x3f;
                         int i4 = 128;
                         i3 = i3 | i4;
                         UnsafeUtil.putByte(l6, (byte)i3);
                         l6 = l7 + 1;
                         i3 = c & 0x3f;
                         i3 = i3 | i4;
                         UnsafeUtil.putByte(l7, (byte)i3);
                         l1 = l6;
                         goto label_0080 ;
                      }
                   }
                   l8 = l2 - 4;
                   if (l1 - l8 <= 0) {
                      i5 = i1 + 1;
                      if (i5 != i) {
                         char c1 = uCharSequenc.charAt(i5);
                         if (Character.isSurrogatePair(c, c1)) {
                            int i6 = Character.toCodePoint(c, c1);
                            long l9 = l1 + 1;
                            i2 = i6 >> 18;
                            i2 = i2 | 0x00f0;
                            UnsafeUtil.putByte(l1, (byte)i2);
                            l7 = l9 + 1;
                            i3 = i6 >> 12;
                            i3 = i3 & 0x3f;
                            int i7 = 128;
                            i3 = i3 | i7;
                            UnsafeUtil.putByte(l9, (byte)i3);
                            l9 = l7 + 1;
                            i3 = i6 >> 6;
                            i3 = i3 & 0x3f;
                            i3 = i3 | i7;
                            UnsafeUtil.putByte(l7, (byte)i3);
                            l7 = l9 + 1;
                            i6 = i6 & 0x3f;
                            i6 = i6 | i7;
                            UnsafeUtil.putByte(l9, (byte)i6);
                            i1 = i5;
                            l1 = l7;
                         }else {
                            i1 = i5;
                            break ;
                         }
                      }
                      break ;
                   }else if(l <= c && c <= l6){
                      i5 = i1 + 1;
                      if (i5 == i || !Character.isSurrogatePair(c, uCharSequenc.charAt(i5))) {
                         throw new Utf8$UnpairedSurrogateException(i1, i);
                      }
                   }
                   throw new ArrayIndexOutOfBoundsException("Failed writing "+c+" at index "+l1);
                   i1 = i1 + 1;
                   l = l5;
                   l3 = 128;
                }else {
                   p1.position((int)(l1 - l));
                   return;
                }
             }
             throw new Utf8$UnpairedSurrogateException((i1 - 1), i);
          }
       }
    }
    public int partialIsValidUtf8(int p0,byte[] p1,int p2,int p3){
       long l3;
       long l4;
       byte b = 0;
       if (((p2 | p3) | (p1.length - p3)) >= 0) {
          long l = (long)p2;
          long l1 = (long)p3;
          if (p0) {
             if (l - l1 >= 0) {
                return p0;
             }else {
                byte b1 = (byte)p0;
                byte i = -32;
                long l2 = 1;
                if (b1 < i) {
                   if (b1 >= -62) {
                      l2 = l2 + l;
                      if (UnsafeUtil.getByte(p1, l) <= -65) {
                         l = l2;
                      }
                   }
                   return -1;
                }else if(b1 < -16){
                   byte b2 = (byte)(~ (p0 >> 8));
                   if (!b2) {
                      l3 = l + l2;
                      b2 = UnsafeUtil.getByte(p1, l);
                      if (l3 - l1 >= 0) {
                         return Utf8.incompleteStateFor(b1, b2);
                      }else {
                         l = l3;
                      }
                   }
                   if (b2 <= -65 && (b1 != i || (b2 >= -96 && (b1 != -19 || b2 < -96)))) {
                      l4 = l + l2;
                      if (UnsafeUtil.getByte(p1, l) <= -65) {
                      label_005c :
                         l = l4;
                      }
                   }
                   return -1;
                }else {
                   i = (byte)(~ (p0 >> 8));
                   if (!i) {
                      l3 = l + l2;
                      i = UnsafeUtil.getByte(p1, l);
                      if (l3 - l1 >= 0) {
                         return Utf8.incompleteStateFor(b1, i);
                      }else {
                         l = l3;
                      }
                   }else {
                      b = (byte)(p0 >> 16);
                   }
                   if (!b) {
                      l3 = l + l2;
                      b = UnsafeUtil.getByte(p1, l);
                      if (l3 - l1 >= 0) {
                         return Utf8.incompleteStateFor(b1, i, b);
                      }else {
                         l = l3;
                      }
                   }
                   if (i <= -65 && (!(((b1 << 28) + (i + 112)) >> 30) && b <= -65)) {
                      l4 = l + l2;
                      if (UnsafeUtil.getByte(p1, l) <= -65) {
                      }
                   }
                   return -1;
                }
             }
          }
          return Utf8$UnsafeProcessor.partialIsValidUtf8(p1, l, (int)(l1 - l));
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p1.length),Integer.valueOf(p2),Integer.valueOf(p3)};
          throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", objArray));
       }
    }
    public int partialIsValidUtf8Direct(int p0,ByteBuffer p1,int p2,int p3){
       long l3;
       long l4;
       byte b = 0;
       if (((p2 | p3) | (p1.limit() - p3)) >= 0) {
          long l = UnsafeUtil.addressOffset(p1) + (long)p2;
          long l1 = (long)(p3 - p2) + l;
          if (p0) {
             if (l - l1 >= 0) {
                return p0;
             }else {
                byte b1 = (byte)p0;
                byte i = -32;
                long l2 = 1;
                if (b1 < i) {
                   if (b1 >= -62) {
                      l2 = l2 + l;
                      if (UnsafeUtil.getByte(l) <= -65) {
                         l = l2;
                      }
                   }
                   return -1;
                }else if(b1 < -16){
                   byte b2 = (byte)(~ (p0 >> 8));
                   if (!b2) {
                      l3 = l + l2;
                      b2 = UnsafeUtil.getByte(l);
                      if (l3 - l1 >= 0) {
                         return Utf8.incompleteStateFor(b1, b2);
                      }else {
                         l = l3;
                      }
                   }
                   if (b2 <= -65 && (b1 != i || (b2 >= -96 && (b1 != -19 || b2 < -96)))) {
                      l4 = l + l2;
                      if (UnsafeUtil.getByte(l) <= -65) {
                      label_0066 :
                         l = l4;
                      }
                   }
                   return -1;
                }else {
                   i = (byte)(~ (p0 >> 8));
                   if (!i) {
                      l3 = l + l2;
                      i = UnsafeUtil.getByte(l);
                      if (l3 - l1 >= 0) {
                         return Utf8.incompleteStateFor(b1, i);
                      }else {
                         l = l3;
                      }
                   }else {
                      b = (byte)(p0 >> 16);
                   }
                   if (!b) {
                      l3 = l + l2;
                      b = UnsafeUtil.getByte(l);
                      if (l3 - l1 >= 0) {
                         return Utf8.incompleteStateFor(b1, i, b);
                      }else {
                         l = l3;
                      }
                   }
                   if (i <= -65 && (!(((b1 << 28) + (i + 112)) >> 30) && b <= -65)) {
                      l4 = l + l2;
                      if (UnsafeUtil.getByte(l) <= -65) {
                      }
                   }
                   return -1;
                }
             }
          }
          return Utf8$UnsafeProcessor.partialIsValidUtf8(l, (int)(l1 - l));
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p1.limit()),Integer.valueOf(p2),Integer.valueOf(p3)};
          throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", objArray));
       }
    }
}
