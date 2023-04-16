package com.google.flatbuffers.Utf8Safe;
import com.google.flatbuffers.a;
import java.nio.ByteBuffer;
import java.lang.String;
import com.google.flatbuffers.a$a;
import java.lang.IllegalArgumentException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.Object;
import java.lang.Integer;
import java.lang.CharSequence;
import java.lang.Character;
import com.google.flatbuffers.Utf8Safe$UnpairedSurrogateException;
import java.lang.StringBuilder;
import java.nio.Buffer;
import java.lang.Math;

public final class Utf8Safe extends a	// class@000542
{

    public void Utf8Safe(){
       super();
    }
    public String a(ByteBuffer p0,int p1,int p2){
       char[] uocharArray;
       int i2;
       int b1;
       int i3;
       Object[] objArray;
       String str = "Invalid UTF-8";
       int i = 2;
       int b = 3;
       if (p0.hasArray()) {
          byte[] uobyteArray = p0.array();
          int i1 = p0.arrayOffset() + p1;
          if (((i1 | p2) | ((uobyteArray.length - i1) - p2)) >= 0) {
             p1 = i1 + p2;
             uocharArray = new char[p2];
             i = 0;
             while (i1 < p1) {
                b = uobyteArray[i1];
                if (!a$a.f(b)) {
                   break ;
                }else {
                   i1++;
                   b1 = i + 1;
                   a$a.b(b, uocharArray, i);
                   i = b1;
                }
             }
             i2 = i;
             while (true) {
                if (i1 >= p1) {
                   return new String(uocharArray, 0, i2);
                }
                i = i1 + 1;
                b1 = uobyteArray[i1];
                if (a$a.f(b1)) {
                   i1 = i2 + 1;
                   a$a.b(b1, uocharArray, i2);
                   i2 = i1;
                   i1 = i;
                   while (i1 < p1) {
                      i = uobyteArray[i1];
                      if (!a$a.f(i)) {
                         continue ;
                      }else {
                         i1++;
                         b = i2 + 1;
                         a$a.b(i, uocharArray, i2);
                         i2 = b;
                      }
                   }
                }else if(a$a.h(b1)){
                   if (i < p1) {
                      i1 = i + 1;
                      b = i2 + 1;
                      a$a.d(b1, uobyteArray[i], uocharArray, i2);
                      i2 = b;
                   }else {
                      break ;
                   }
                }else if(a$a.g(b1)){
                   i1 = p1 - 1;
                   if (i >= i1) {
                      throw new IllegalArgumentException(str);
                   }
                   i1 = i + 1;
                   b = i1 + 1;
                   i3 = i2 + 1;
                   a$a.c(b1, uobyteArray[i], uobyteArray[i1], uocharArray, i2);
                   i1 = b;
                   i2 = i3;
                }else {
                   i1 = p1 - 2;
                   if (i >= i1) {
                      throw new IllegalArgumentException(str);
                   }
                   i1 = i + 1;
                   i = i1 + 1;
                   i1 = i + 1;
                   i = i2 + 1;
                   a$a.a(b1, uobyteArray[i], uobyteArray[i1], uobyteArray[i], uocharArray, i2);
                   i2 = i + 1;
                }
             }
             throw new IllegalArgumentException(str);
          }else {
             objArray = new Object[b];
             objArray[0] = Integer.valueOf(uobyteArray.length);
             objArray[1] = Integer.valueOf(i1);
             objArray[i] = Integer.valueOf(p2);
             throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", objArray));
          }
       }else if(((p1 | p2) | ((p0.limit() - p1) - p2)) >= 0){
          int i4 = p1 + p2;
          uocharArray = new char[p2];
          i = 0;
          while (p1 < i4) {
             b = p0.get(p1);
             if (!a$a.f(b)) {
                break ;
             }else {
                p1++;
                b1 = i + 1;
                a$a.b(b, uocharArray, i);
                i = b1;
             }
          }
          i2 = i;
          while (true) {
             if (p1 >= i4) {
                return new String(uocharArray, 0, i2);
             }
             i = p1 + 1;
             b1 = p0.get(p1);
             if (a$a.f(b1)) {
                p1 = i2 + 1;
                a$a.b(b1, uocharArray, i2);
                i2 = p1;
                p1 = i;
                while (p1 < i4) {
                   i = p0.get(p1);
                   if (!a$a.f(i)) {
                      continue ;
                   }else {
                      p1++;
                      b = i2 + 1;
                      a$a.b(i, uocharArray, i2);
                      i2 = b;
                   }
                }
             }else if(a$a.h(b1)){
                if (i < i4) {
                   p1 = i + 1;
                   b = i2 + 1;
                   a$a.d(b1, p0.get(i), uocharArray, i2);
                   i2 = b;
                }else {
                   break ;
                }
             }else if(a$a.g(b1)){
                p1 = i4 - 1;
                if (i >= p1) {
                   throw new IllegalArgumentException(str);
                }
                p1 = i + 1;
                b = p1 + 1;
                i3 = i2 + 1;
                a$a.c(b1, p0.get(i), p0.get(p1), uocharArray, i2);
                p1 = b;
                i2 = i3;
             }else {
                p1 = i4 - 2;
                if (i >= p1) {
                   throw new IllegalArgumentException(str);
                }
                p1 = i + 1;
                i = p1 + 1;
                byte b2 = p0.get(p1);
                p1 = i + 1;
                byte b3 = p0.get(i);
                i = i2 + 1;
                a$a.a(b1, p0.get(i), b2, b3, uocharArray, i2);
                i2 = i + 1;
             }
          }
          throw new IllegalArgumentException(str);
       }else {
          objArray = new Object[b];
          objArray[0] = Integer.valueOf(p0.limit());
          objArray[1] = Integer.valueOf(p1);
          objArray[i] = Integer.valueOf(p2);
          throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", objArray));
       }
    }
    public void b(CharSequence p0,ByteBuffer p1){
       int i2;
       int i3;
       int i4;
       int i5;
       char c1;
       int i7;
       char c2;
       int i9;
       try{
          CharSequence uCharSequenc = p0;
          ByteBuffer uByteBuffer = p1;
          Utf8Safe$UnpairedSurrogateException unpairedSurr = 0xdfff;
          int i = 2048;
          int i1 = 0;
          if (p1.hasArray()) {
             i2 = p1.arrayOffset();
             byte[] uobyteArray = p1.array();
             i3 = p1.position() + i2;
             i4 = p0.length();
             i5 = p1.remaining() + i3;
             for (; i1 < i4; i1 = i1 + 1) {
                int i6 = i1 + i3;
                if (i6 < i5) {
                   char c = uCharSequenc.charAt(i1);
                   if (c < 128) {
                      uobyteArray[i6] = (byte)c;
                   }else if(i1 == i4){
                      i3 = i3 + i4;
                   }else {
                      i3 = i3 + i1;
                      while (true) {
                         if (i1 < i4) {
                            c1 = uCharSequenc.charAt(i1);
                            if (c1 < 128 && i3 < i5) {
                               i7 = i3 + 1;
                               uobyteArray[i3] = (byte)c1;
                            label_0093 :
                               i3 = i7;
                            }else if(c1 < i){
                               i7 = i5 - 2;
                               if (i3 <= i7) {
                                  i7 = i3 + 1;
                                  i = c1 >> 6;
                                  i = i | 0x03c0;
                                  uobyteArray[i3] = (byte)i;
                                  i = i7 + 1;
                                  i3 = c1 & 0x3f;
                                  i3 = i3 | 128;
                                  uobyteArray[i7] = (byte)i3;
                                  i3 = i;
                               }
                            }
                            if (c1 < 0xd800 || unpairedSurr < c1) {
                               i = i5 - 3;
                               if (i3 <= i) {
                                  i = i3 + 1;
                                  i7 = c1 >> 12;
                                  i7 = i7 | 0x01e0;
                                  uobyteArray[i3] = (byte)i7;
                                  i3 = i + 1;
                                  i7 = c1 >> 6;
                                  i7 = i7 & 0x3f;
                                  i7 = i7 | 128;
                                  uobyteArray[i] = (byte)i7;
                                  i7 = i3 + 1;
                                  i = c1 & 0x3f;
                                  i = i | 128;
                                  uobyteArray[i3] = (byte)i;
                                  goto label_0093 ;
                               }
                            }
                            i = i5 - 4;
                            if (i3 <= i) {
                               i = i1 + 1;
                               if (i != p0.length()) {
                                  c2 = uCharSequenc.charAt(i);
                                  if (Character.isSurrogatePair(c1, c2)) {
                                     i1 = Character.toCodePoint(c1, c2);
                                     i6 = i3 + 1;
                                     i7 = i1 >> 18;
                                     i7 = i7 | 0x00f0;
                                     uobyteArray[i3] = (byte)i7;
                                     i3 = i6 + 1;
                                     i7 = i1 >> 12;
                                     i7 = i7 & 0x3f;
                                     i7 = i7 | 128;
                                     uobyteArray[i6] = (byte)i7;
                                     i6 = i3 + 1;
                                     i7 = i1 >> 6;
                                     i7 = i7 & 0x3f;
                                     i7 = i7 | 128;
                                     uobyteArray[i3] = (byte)i7;
                                     i3 = i6 + 1;
                                     i1 = i1 & 0x3f;
                                     i1 = i1 | 128;
                                     uobyteArray[i6] = (byte)i1;
                                     i1 = i;
                                  }else {
                                     i1 = i;
                                  }
                               }
                               throw new Utf8Safe$UnpairedSurrogateException((i1 - 1), i4);
                            }else if(0xd800 <= c1 && c1 <= unpairedSurr){
                               int i8 = i1 + 1;
                               if (i8 == p0.length() || !Character.isSurrogatePair(c1, uCharSequenc.charAt(i8))) {
                                  throw new Utf8Safe$UnpairedSurrogateException(i1, i4);
                               }
                            }
                            break ;
                            i1 = i1 + 1;
                            i = 2048;
                         }
                      }
                      throw new ArrayIndexOutOfBoundsException("Failed writing "+c1+" at index "+i3);
                   }
                   uByteBuffer.position((i3 - i2));
                }else {
                   goto label_0041 ;
                }
             }
          }else {
             i2 = p0.length();
             i = p1.position();
             try{
                for (; i1 < i2; i1 = i1 + 1) {
                   char c3 = uCharSequenc.charAt(i1);
                   if (c3 < 128) {
                      i3 = i + i1;
                      uByteBuffer.put(i3, (byte)c3);
                   }else if(i1 == i2){
                      uByteBuffer.position((i + i1));
                   }else {
                      i = i + i1;
                      while (true) {
                         if (i1 < i2) {
                            c3 = uCharSequenc.charAt(i1);
                            if (c3 < 128) {
                               uByteBuffer.put(i, (byte)c3);
                               i3 = 2048;
                            }else if(c3 < 2048){
                               i5 = i + 1;
                               i4 = c3 >> 6;
                               i4 = i4 | 0x00c0;
                               i4 = (byte)i4;
                               try{
                                  uByteBuffer.put(i, i4);
                                  i = c3 & 0x3f;
                                  i = i | 128;
                                  uByteBuffer.put(i5, (byte)i);
                                  i = i5;
                               }catch(java.lang.IndexOutOfBoundsException e0){
                                  i = i5;
                               }
                            label_01e2 :
                               throw new ArrayIndexOutOfBoundsException("Failed writing "+e0.charAt(i1)+" at index "+(p1.position() + Math.max(i1, ((i - p1.position()) + 1))));
                            }else if(c3 < 0xd800 || unpairedSurr < c3){
                               i5 = i + 1;
                               i4 = c3 >> 12;
                               i4 = i4 | 0x00e0;
                               i4 = (byte)i4;
                               uByteBuffer.put(i, i4);
                               i = i5 + 1;
                               i4 = c3 >> 6;
                               i4 = i4 & 0x3f;
                               i4 = i4 | 128;
                               uByteBuffer.put(i5, (byte)i4);
                               i9 = c3 & 0x3f;
                               i9 = i9 | 128;
                               uByteBuffer.put(i, (byte)i9);
                            }else {
                               i5 = i1 + 1;
                               if (i5 != i2) {
                                  c2 = uCharSequenc.charAt(i5);
                                  if (Character.isSurrogatePair(c3, c2)) {
                                     i1 = Character.toCodePoint(c3, c2);
                                     i9 = i + 1;
                                     i4 = i1 >> 18;
                                     i4 = i4 | 0x00f0;
                                     i4 = (byte)i4;
                                     uByteBuffer.put(i, i4);
                                     i = i9 + 1;
                                     i4 = i1 >> 12;
                                     i4 = i4 & 0x3f;
                                     i4 = i4 | 128;
                                     uByteBuffer.put(i9, (byte)i4);
                                     i9 = i + 1;
                                     i4 = i1 >> 6;
                                     i4 = i4 & 0x3f;
                                     i4 = i4 | 128;
                                     uByteBuffer.put(i, (byte)i4);
                                     i = i1 & 0x3f;
                                     i = i | 128;
                                     uByteBuffer.put(i9, (byte)i);
                                     i = i9;
                                     i1 = i5;
                                  }else {
                                     i1 = i5;
                                  }
                               }
                               throw new Utf8Safe$UnpairedSurrogateException(i1, i2);
                            }
                            i1 = i1 + 1;
                            i = i + 1;
                         }else {
                            uByteBuffer.position(i);
                            break ;
                         }
                      }
                   }
                }
             }catch(java.lang.IndexOutOfBoundsException e0){
             }
          }
          return;
       }catch(java.lang.IndexOutOfBoundsException e0){
       }catch(java.lang.IndexOutOfBoundsException e0){
       }
    }
    public int c(CharSequence p0){
       int i4;
       int i = p0.length();
       int i1 = 0;
       int i2 = 0;
       while (i2 < i && p0.charAt(i2) < 128) {
          i2 = i2 + 1;
       }
       int i3 = i;
       while (true) {
          if (i2 < i) {
             char c = p0.charAt(i2);
             if (c < 2048) {
                i4 = c - 127;
                i4 = i4 >> 31;
                i3 = i3 + i4;
                i2 = i2 + 1;
             }else {
                i4 = p0.length();
                while (true) {
                   if (i2 < i4) {
                      char c1 = p0.charAt(i2);
                      if (c1 < 2048) {
                         int i5 = c1 - 127;
                         i5 = i5 >> 31;
                         i1 = i1 + i5;
                      }else {
                         i1 = i1 + 2;
                         if (0xd800 <= c1 && c1 <= 0xdfff) {
                            if (Character.codePointAt(p0, i2) >= 0x10000) {
                               i2 = i2 + 1;
                            }else {
                            }
                         }
                      }
                      i2 = i2 + 1;
                   }else {
                      i3 = i3 + i1;
                   label_0059 :
                      if (i3 >= i) {
                         return i3;
                      }
                   }
                }
                throw new Utf8Safe$UnpairedSurrogateException(i2, i4);
             }
          }else {
             goto label_0059 ;
          }
       }
       throw new IllegalArgumentException("UTF-8 length does not fit in int: "+((long)i3 + 0x100000000));
    }
}
