package com.google.protobuf.Utf8$SafeProcessor;
import com.google.protobuf.Utf8$Processor;
import com.google.protobuf.Utf8;
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

public final class Utf8$SafeProcessor extends Utf8$Processor	// class@0004ec
{

    public void Utf8$SafeProcessor(){
       super();
    }
    public static int partialIsValidUtf8(byte[] p0,int p1,int p2){
       while (p1 < p2 && p0[p1] >= 0) {
          p1++;
       }
       int i = (p1 >= p2)? 0: Utf8$SafeProcessor.partialIsValidUtf8NonAscii(p0, p1, p2);
       return i;
    }
    public static int partialIsValidUtf8NonAscii(byte[] p0,int p1,int p2){
       while (true) {
          if (p1 >= p2) {
             return 0;
          }
          int i = p1 + 1;
          byte b = p0[p1];
          if (b < 0) {
             int i1 = -32;
             if (b < i1) {
                if (i >= p2) {
                   return b;
                }else if(b >= -62){
                   b = i + 1;
                   if (p0[i] <= -65) {
                   }
                }
                return -1;
             }else if(b < -16){
                int i2 = p2 - 1;
                if (i >= i2) {
                   return Utf8.incompleteStateFor(p0, i, p2);
                }else {
                   i2 = i + 1;
                   i = p0[i];
                   if (i <= -65 && (b != i1 || (i >= -96 && (b != -19 || i < -96)))) {
                      b = i2 + 1;
                      if (p0[i2] <= -65) {
                      }
                   }
                   return -1;
                }
             }else {
                i1 = p2 - 2;
                if (i >= i1) {
                   return Utf8.incompleteStateFor(p0, i, p2);
                }else {
                   i1 = i + 1;
                   i = p0[i];
                   if (i <= -65) {
                      b = b << 28;
                      i = i + 112;
                      b = b + i;
                      b = b >> 30;
                      if (!b) {
                         b = i1 + 1;
                         if (p0[i1] <= -65) {
                            i = b + 1;
                            if (p0[b] <= -65) {
                            label_006a :
                               b = i;
                            }
                         }
                      }
                   }
                   break ;
                }
             }
          }else {
             goto label_006a ;
          }
       }
       return -1;
    }
    public String decodeUtf8(byte[] p0,int p1,int p2){
       int b;
       int i3;
       if (((p1 | p2) | ((p0.length - p1) - p2)) >= 0) {
          int i = p1 + p2;
          char[] uocharArray = new char[p2];
          int i1 = 0;
          while (p1 < i) {
             b = p0[p1];
             if (!Utf8$DecodeUtil.isOneByte(b)) {
                break ;
             }else {
                p1++;
                i3 = i1 + 1;
                Utf8$DecodeUtil.handleOneByte(b, uocharArray, i1);
                i1 = i3;
             }
          }
          int i2 = i1;
          while (true) {
             if (p1 >= i) {
                return new String(uocharArray, 0, i2);
             }
             i1 = p1 + 1;
             byte b1 = p0[p1];
             if (Utf8$DecodeUtil.isOneByte(b1)) {
                b = i2 + 1;
                Utf8$DecodeUtil.handleOneByte(b1, uocharArray, i2);
                while (i1 < i) {
                   b1 = p0[i1];
                   if (!Utf8$DecodeUtil.isOneByte(b1)) {
                   }else {
                      i1 = i1 + 1;
                      i3 = b + 1;
                      Utf8$DecodeUtil.handleOneByte(b1, uocharArray, b);
                      b = i3;
                   }
                }
                b1 = i1;
                i2 = b;
             }else if(Utf8$DecodeUtil.isTwoBytes(b1)){
                if (i1 < i) {
                   b = i1 + 1;
                   i3 = i2 + 1;
                   Utf8$DecodeUtil.handleTwoBytes(b1, p0[i1], uocharArray, i2);
                   b1 = b;
                   i2 = i3;
                }else {
                   break ;
                }
             }else if(Utf8$DecodeUtil.isThreeBytes(b1)){
                b = i - 1;
                if (i1 >= b) {
                   throw InvalidProtocolBufferException.invalidUtf8();
                }
                b = i1 + 1;
                i3 = b + 1;
                int i4 = i2 + 1;
                Utf8$DecodeUtil.handleThreeBytes(b1, p0[i1], p0[b], uocharArray, i2);
                b1 = i3;
                i2 = i4;
             }else {
                b = i - 2;
                if (i1 >= b) {
                   throw InvalidProtocolBufferException.invalidUtf8();
                }
                b = i1 + 1;
                i1 = b + 1;
                int i5 = i1 + 1;
                int i6 = i2 + 1;
                Utf8$DecodeUtil.handleFourBytes(b1, p0[i1], p0[b], p0[i1], uocharArray, i2);
                i6 = i6 + 1;
                b1 = i5;
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
       return this.decodeUtf8Default(p0, p1, p2);
    }
    public int encodeUtf8(CharSequence p0,byte[] p1,int p2,int p3){
       int i3;
       int i4;
       int i5;
       int i = p0.length();
       p3 = p3 + p2;
       int i1 = 0;
       byte b = 128;
       while (i1 < i) {
          int i2 = i1 + p2;
          if (i2 < p3) {
             char c = p0.charAt(i1);
             if (c < b) {
                p1[i2] = (byte)c;
                i1 = i1 + 1;
             }else if(i1 == i){
                return (p2 + i);
             }else {
                p2 = p2 + i1;
                while (true) {
                   if (i1 >= i) {
                      return p2;
                   }
                   char c1 = p0.charAt(i1);
                   if (c1 < b && p2 < p3) {
                      i3 = p2 + 1;
                      p1[p2] = (byte)c1;
                   label_002e :
                      p2 = i3;
                   }else if(c1 < 2048){
                      i3 = p3 - 2;
                      if (p2 <= i3) {
                         i3 = p2 + 1;
                         i4 = c1 >> 6;
                         i4 = i4 | 0x03c0;
                         p1[p2] = (byte)i4;
                         p2 = i3 + 1;
                         i2 = c1 & 0x3f;
                         i2 = i2 | b;
                         p1[i3] = (byte)i2;
                      }
                   }
                   i3 = 0xdfff;
                   i4 = 0xd800;
                   if (c1 < i4 || i3 < c1) {
                      i5 = p3 - 3;
                      if (p2 <= i5) {
                         i3 = p2 + 1;
                         i4 = c1 >> 12;
                         i4 = i4 | 0x01e0;
                         p1[p2] = (byte)i4;
                         p2 = i3 + 1;
                         i4 = c1 >> 6;
                         i4 = i4 & 0x3f;
                         i4 = i4 | b;
                         p1[i3] = (byte)i4;
                         i3 = p2 + 1;
                         i2 = c1 & 0x3f;
                         i2 = i2 | b;
                         p1[p2] = (byte)i2;
                         goto label_002e ;
                      }
                   }
                   i5 = p3 - 4;
                   if (p2 <= i5) {
                      i3 = i1 + 1;
                      if (i3 != p0.length()) {
                         char c2 = p0.charAt(i3);
                         if (Character.isSurrogatePair(c1, c2)) {
                            i1 = Character.toCodePoint(c1, c2);
                            i2 = p2 + 1;
                            i4 = i1 >> 18;
                            i4 = i4 | 0x00f0;
                            p1[p2] = (byte)i4;
                            p2 = i2 + 1;
                            i4 = i1 >> 12;
                            i4 = i4 & 0x3f;
                            i4 = i4 | b;
                            p1[i2] = (byte)i4;
                            i2 = p2 + 1;
                            i4 = i1 >> 6;
                            i4 = i4 & 0x3f;
                            i4 = i4 | b;
                            p1[p2] = (byte)i4;
                            p2 = i2 + 1;
                            i1 = i1 & 0x3f;
                            i1 = i1 | b;
                            p1[i2] = (byte)i1;
                            i1 = i3;
                         }else {
                            i1 = i3;
                            break ;
                         }
                      }
                      break ;
                   }else if(i4 <= c1 && c1 <= i3){
                      int i6 = i1 + 1;
                      if (i6 == p0.length() || !Character.isSurrogatePair(c1, p0.charAt(i6))) {
                         throw new Utf8$UnpairedSurrogateException(i1, i);
                      }
                   }
                   throw new ArrayIndexOutOfBoundsException("Failed writing "+c1+" at index "+p2);
                   i1 = i1 + 1;
                }
                throw new Utf8$UnpairedSurrogateException((i1 - 1), i);
             }
          }else {
             goto label_001a ;
          }
       }
    }
    public void encodeUtf8Direct(CharSequence p0,ByteBuffer p1){
       this.encodeUtf8Default(p0, p1);
    }
    public int partialIsValidUtf8(int p0,byte[] p1,int p2,int p3){
       byte b2;
       if (p0) {
          if (p2 >= p3) {
             return p0;
          }else {
             byte b = (byte)p0;
             byte i = -32;
             if (b < i) {
                if (b >= -62) {
                   p0 = p2 + 1;
                   if (p1[p2] <= -65) {
                   label_0018 :
                      p2 = p0;
                   }
                }
                return -1;
             }else if(b < -16){
                byte b1 = (byte)(~ (p0 >> 8));
                if (!b1) {
                   b1 = p2 + 1;
                   b2 = p1[p2];
                   if (b1 >= p3) {
                      return Utf8.incompleteStateFor(b, b2);
                   }else {
                      b2 = b1;
                      b1 = b2;
                   }
                }
                if (b1 <= -65 && (b != i || (b1 >= -96 && (b != -19 || b1 < -96)))) {
                   b1 = b2 + 1;
                   if (p1[b2] <= -65) {
                   }
                }
                return -1;
             }else {
                i = (byte)(~ (p0 >> 8));
                byte b3 = 0;
                if (!i) {
                   p0 = p2 + 1;
                   i = p1[p2];
                   if (p0 >= p3) {
                      return Utf8.incompleteStateFor(b, i);
                   }else {
                      p2 = p0;
                   }
                }else {
                   b3 = (byte)(p0 >> 16);
                }
                if (!b3) {
                   p0 = p2 + 1;
                   b3 = p1[p2];
                   if (p0 >= p3) {
                      return Utf8.incompleteStateFor(b, i, b3);
                   }else {
                      p2 = p0;
                   }
                }
                if (i <= -65 && (!(((b << 28) + (i + 112)) >> 30) && b3 <= -65)) {
                   p0 = p2 + 1;
                   if (p1[p2] <= -65) {
                   }
                }
                return -1;
             }
          }
       }
       return Utf8$SafeProcessor.partialIsValidUtf8(p1, p2, p3);
    }
    public int partialIsValidUtf8Direct(int p0,ByteBuffer p1,int p2,int p3){
       return this.partialIsValidUtf8Default(p0, p1, p2, p3);
    }
}
