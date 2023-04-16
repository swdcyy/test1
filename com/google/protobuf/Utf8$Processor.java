package com.google.protobuf.Utf8$Processor;
import java.lang.Object;
import java.nio.ByteBuffer;
import com.google.protobuf.Utf8;
import java.lang.String;
import com.google.protobuf.Utf8$DecodeUtil;
import com.google.protobuf.InvalidProtocolBufferException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Integer;
import java.lang.CharSequence;
import java.nio.Buffer;
import java.lang.Character;
import com.google.protobuf.Utf8$UnpairedSurrogateException;
import java.lang.Math;
import java.lang.StringBuilder;

public abstract class Utf8$Processor	// class@0004eb
{

    public void Utf8$Processor(){
       super();
    }
    public static int partialIsValidUtf8(ByteBuffer p0,int p1,int p2){
       p1 = p1 + Utf8.estimateConsecutiveAscii(p0, p1, p2);
       while (true) {
          if (p1 >= p2) {
             return 0;
          }
          int i = p1 + 1;
          byte b = p0.get(p1);
          if (b < 0) {
             int i1 = -32;
             if (b < i1) {
                if (i >= p2) {
                   return b;
                }else if(b < -62 || p0.get(i) > -65){
                   return -1;
                }else {
                   i = i + 1;
                }
             }else if(b < -16){
                int i2 = p2 - 1;
                if (i >= i2) {
                   return Utf8.incompleteStateFor(p0, b, i, (p2 - i));
                }else {
                   i2 = i + 1;
                   i = p0.get(i);
                   if (i <= -65 && (b != i1 || (i < -96 || (b != -19 || (i >= -96 || p0.get(i2) > -65))))) {
                      return -1;
                   }else {
                      i2 = i2 + 1;
                      b = i2;
                   }
                }
             }else {
                i1 = p2 - 2;
                if (i >= i1) {
                   return Utf8.incompleteStateFor(p0, b, i, (p2 - i));
                }else {
                   i1 = i + 1;
                   i = p0.get(i);
                   if (i <= -65) {
                      b = b << 28;
                      i = i + 112;
                      b = b + i;
                      b = b >> 30;
                      if (!b) {
                         b = i1 + 1;
                         if (p0.get(i1) <= -65) {
                            i = b + 1;
                            if (p0.get(b) <= -65) {
                            label_0084 :
                               b = i;
                            }
                         }
                      }
                   }
                   break ;
                }
             }
          }else {
             goto label_0084 ;
          }
       }
       return -1;
    }
    public final String decodeUtf8(ByteBuffer p0,int p1,int p2){
       if (p0.hasArray()) {
          return this.decodeUtf8(p0.array(), (p0.arrayOffset() + p1), p2);
       }
       if (p0.isDirect()) {
          return this.decodeUtf8Direct(p0, p1, p2);
       }
       return this.decodeUtf8Default(p0, p1, p2);
    }
    public abstract String decodeUtf8(byte[] p0,int p1,int p2);
    public final String decodeUtf8Default(ByteBuffer p0,int p1,int p2){
       int b;
       int i3;
       byte i4;
       if (((p1 | p2) | ((p0.limit() - p1) - p2)) >= 0) {
          int i = p1 + p2;
          char[] uocharArray = new char[p2];
          int i1 = 0;
          while (p1 < i) {
             b = p0.get(p1);
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
             byte b1 = p0.get(p1);
             if (Utf8$DecodeUtil.isOneByte(b1)) {
                b = i2 + 1;
                Utf8$DecodeUtil.handleOneByte(b1, uocharArray, i2);
                while (i1 < i) {
                   b1 = p0.get(i1);
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
                   Utf8$DecodeUtil.handleTwoBytes(b1, p0.get(i1), uocharArray, i2);
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
                i4 = i2 + 1;
                Utf8$DecodeUtil.handleThreeBytes(b1, p0.get(i1), p0.get(b), uocharArray, i2);
                b1 = i3;
                i2 = i4;
             }else {
                b = i - 2;
                if (i1 >= b) {
                   throw InvalidProtocolBufferException.invalidUtf8();
                }
                b = i1 + 1;
                i1 = b + 1;
                i4 = p0.get(b);
                int i5 = i1 + 1;
                byte b2 = p0.get(i1);
                int i6 = i2 + 1;
                i3 = i4;
                i4 = b2;
                Utf8$DecodeUtil.handleFourBytes(b1, p0.get(i1), i3, i4, uocharArray, i2);
                i6 = i6 + 1;
                b1 = i5;
                i2 = i6;
             }
          }
          throw InvalidProtocolBufferException.invalidUtf8();
       }else {
          Object[] objArray = new Object[]{Integer.valueOf(p0.limit()),Integer.valueOf(p1),Integer.valueOf(p2)};
          throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", objArray));
       }
    }
    public abstract String decodeUtf8Direct(ByteBuffer p0,int p1,int p2);
    public abstract int encodeUtf8(CharSequence p0,byte[] p1,int p2,int p3);
    public final void encodeUtf8(CharSequence p0,ByteBuffer p1){
       if (p1.hasArray()) {
          int i = p1.arrayOffset();
          p1.position((Utf8.encode(p0, p1.array(), (p1.position() + i), p1.remaining()) - i));
       }else if(p1.isDirect()){
          this.encodeUtf8Direct(p0, p1);
       }else {
          this.encodeUtf8Default(p0, p1);
       }
       return;
    }
    public final void encodeUtf8Default(CharSequence p0,ByteBuffer p1){
       int i4;
       int i5;
       int i6;
       int i = p0.length();
       int i1 = p1.position();
       int i2 = 0;
       try{
          int i3 = 128;
          while (i2 < i) {
             char c = p0.charAt(i2);
             if (c < i3) {
                i3 = i1 + i2;
                p1.put(i3, (byte)c);
                i2 = i2 + 1;
             }else if(i2 == i){
                p1.position((i1 + i2));
                return;
             }else {
                i1 = i1 + i2;
                try{
                   while (true) {
                      if (i2 < i) {
                         try{
                            c = p0.charAt(i2);
                            if (c < i3) {
                               p1.put(i1, (byte)c);
                            }else if(c < 2048){
                               i4 = i1 + 1;
                               i5 = c >> 6;
                               i5 = i5 | 0x00c0;
                               i5 = (byte)i5;
                               try{
                                  p1.put(i1, i5);
                                  i1 = c & 0x3f;
                                  i1 = i1 | i3;
                                  p1.put(i4, (byte)i1);
                                  i1 = i4;
                               }catch(java.lang.IndexOutOfBoundsException e0){
                                  i1 = i4;
                               }
                            label_00c7 :
                               throw new ArrayIndexOutOfBoundsException("Failed writing "+p0.charAt(i2)+" at index "+(p1.position() + Math.max(i2, ((i1 - p1.position()) + 1))));
                            }else if(c < 0xd800 || 0xdfff < c){
                               i4 = i1 + 1;
                               i5 = c >> 12;
                               i5 = i5 | 0x00e0;
                               i5 = (byte)i5;
                               p1.put(i1, i5);
                               i1 = i4 + 1;
                               i5 = c >> 6;
                               i5 = i5 & 0x3f;
                               i5 = i5 | i3;
                               p1.put(i4, (byte)i5);
                               i6 = c & 0x3f;
                               i6 = i6 | i3;
                               p1.put(i1, (byte)i6);
                            }else {
                               i4 = i2 + 1;
                               if (i4 != i) {
                                  char c1 = p0.charAt(i4);
                                  if (Character.isSurrogatePair(c, c1)) {
                                     i2 = Character.toCodePoint(c, c1);
                                     i6 = i1 + 1;
                                     i5 = i2 >> 18;
                                     i5 = i5 | 0x00f0;
                                     i5 = (byte)i5;
                                     p1.put(i1, i5);
                                     i1 = i6 + 1;
                                     i5 = i2 >> 12;
                                     i5 = i5 & 0x3f;
                                     i5 = i5 | i3;
                                     p1.put(i6, (byte)i5);
                                     i6 = i1 + 1;
                                     i5 = i2 >> 6;
                                     i5 = i5 & 0x3f;
                                     i5 = i5 | i3;
                                     p1.put(i1, (byte)i5);
                                     i1 = i2 & 0x3f;
                                     i1 = i1 | i3;
                                     p1.put(i6, (byte)i1);
                                     i1 = i6;
                                     i2 = i4;
                                  }else {
                                     i2 = i4;
                                     break ;
                                  }
                               }
                               break ;
                            }
                            i2 = i2 + 1;
                            i1 = i1 + 1;
                         }catch(java.lang.IndexOutOfBoundsException e0){
                         }
                      }else {
                         p1.position(i1);
                         return;
                      }
                   }
                   throw new Utf8$UnpairedSurrogateException(i2, i);
                }catch(java.lang.IndexOutOfBoundsException e0){
                }
             }
          }
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
    public abstract void encodeUtf8Direct(CharSequence p0,ByteBuffer p1);
    public final boolean isValidUtf8(ByteBuffer p0,int p1,int p2){
       int i = 0;
       if (!this.partialIsValidUtf8(i, p0, p1, p2)) {
          i = true;
       }
       return i;
    }
    public final boolean isValidUtf8(byte[] p0,int p1,int p2){
       int i = 0;
       if (!this.partialIsValidUtf8(i, p0, p1, p2)) {
          i = true;
       }
       return i;
    }
    public final int partialIsValidUtf8(int p0,ByteBuffer p1,int p2,int p3){
       if (p1.hasArray()) {
          int i = p1.arrayOffset();
          p2 = p2 + i;
          return this.partialIsValidUtf8(p0, p1.array(), p2, (i + p3));
       }else if(p1.isDirect()){
          return this.partialIsValidUtf8Direct(p0, p1, p2, p3);
       }else {
          return this.partialIsValidUtf8Default(p0, p1, p2, p3);
       }
    }
    public abstract int partialIsValidUtf8(int p0,byte[] p1,int p2,int p3);
    public final int partialIsValidUtf8Default(int p0,ByteBuffer p1,int p2,int p3){
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
                   if (p1.get(p2) <= -65) {
                   label_001a :
                      p2 = p0;
                   }
                }
                return -1;
             }else if(b < -16){
                byte b1 = (byte)(~ (p0 >> 8));
                if (!b1) {
                   b1 = p2 + 1;
                   b2 = p1.get(p2);
                   if (b1 >= p3) {
                      return Utf8.incompleteStateFor(b, b2);
                   }else {
                      b2 = b1;
                      b1 = b2;
                   }
                }
                if (b1 <= -65 && (b != i || (b1 >= -96 && (b != -19 || b1 < -96)))) {
                   b1 = b2 + 1;
                   if (p1.get(b2) <= -65) {
                   }
                }
                return -1;
             }else {
                i = (byte)(~ (p0 >> 8));
                byte b3 = 0;
                if (!i) {
                   p0 = p2 + 1;
                   i = p1.get(p2);
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
                   b3 = p1.get(p2);
                   if (p0 >= p3) {
                      return Utf8.incompleteStateFor(b, i, b3);
                   }else {
                      p2 = p0;
                   }
                }
                if (i <= -65 && (!(((b << 28) + (i + 112)) >> 30) && b3 <= -65)) {
                   p0 = p2 + 1;
                   if (p1.get(p2) <= -65) {
                   }
                }
                return -1;
             }
          }
       }
       return Utf8$Processor.partialIsValidUtf8(p1, p2, p3);
    }
    public abstract int partialIsValidUtf8Direct(int p0,ByteBuffer p1,int p2,int p3);
}
