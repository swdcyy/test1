package com.loc.aa;
import java.lang.Object;
import java.lang.String;
import java.lang.AssertionError;
import java.io.IOException;
import java.util.Objects;
import java.lang.System;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.io.ByteArrayOutputStream;
import java.io.ByteArrayInputStream;
import java.util.zip.GZIPInputStream;
import java.io.InputStream;

public class aa	// class@00135f
{
    public static final boolean a = true;
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;

    static {
       aa.b = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','+','/'};
       aa.c = new byte[256]{0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xfb,0xfb,0xf7,0xf7,0xfb,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xfb,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,'>',0xf7,0xf7,0xf7,'?','4','5','6','7','8','9',':',';','<','=',0xf7,0xf7,0xf7,0xff,0xf7,0xf7,0xf7,0x00,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0a,0x0b,0x0c,0x0d,0x0e,0x0f,0x10,0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0x1a,0x1b,0x1c,0x1d,0x1e,0x1f,0x20,'!','"','#','$','%','&',0x27,'(',')','*','+',',','-','.','/','0','1','2','3',0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7};
       aa.d = new byte[64]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','-','_'};
       aa.e = new byte[256]{0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xfb,0xfb,0xf7,0xf7,0xfb,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xfb,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,'>',0xf7,0xf7,'4','5','6','7','8','9',':',';','<','=',0xf7,0xf7,0xf7,0xff,0xf7,0xf7,0xf7,0x00,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0a,0x0b,0x0c,0x0d,0x0e,0x0f,0x10,0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19,0xf7,0xf7,0xf7,0xf7,'?',0xf7,0x1a,0x1b,0x1c,0x1d,0x1e,0x1f,0x20,'!','"','#','$','%','&',0x27,'(',')','*','+',',','-','.','/','0','1','2','3',0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7};
       aa.f = new byte[64]{'-','0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','_','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
       aa.g = new byte[257]{0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xfb,0xfb,0xf7,0xf7,0xfb,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xfb,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0x00,0xf7,0xf7,0x01,0x02,0x03,0x04,0x05,0x06,0x07,0x08,0x09,0x0a,0xf7,0xf7,0xf7,0xff,0xf7,0xf7,0xf7,0x0b,0x0c,0x0d,0x0e,0x0f,0x10,0x11,0x12,0x13,0x14,0x15,0x16,0x17,0x18,0x19,0x1a,0x1b,0x1c,0x1d,0x1e,0x1f,0x20,'!','"','#','$',0xf7,0xf7,0xf7,0xf7,'%',0xf7,'&',0x27,'(',')','*','+',',','-','.','/','0','1','2','3','4','5','6','7','8','9',':',';','<','=','>','?',0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7,0xf7};
    }
    public void aa(){
       super();
    }
    public static String a(byte[] p0){
       String str;
       try{
          str = aa.a(p0, p0.length);
       }catch(java.io.IOException e1){
          if (!aa.a) {
             throw new AssertionError(e1.getMessage());
          }
          str = null;
       }
       if (aa.a || str != null) {
          return str;
       }
       throw new AssertionError();
    }
    public static String a(byte[] p0,int p1){
       Objects.requireNonNull(p0, "Cannot serialize a null array.");
       if (p1 < 0) {
          throw new IllegalArgumentException(("Cannot have length offset: ").concat(String.valueOf(p1)));
       }
       int i = 3;
       if ((p1 + 0) <= p0.length) {
          int i1 = 4;
          int i2 = (p1 / 3) * 4;
          if ((p1 % 3) <= 0) {
             i1 = 0;
          }
          i2 = i2 + i1;
          byte[] uobyteArray = new byte[i2];
          int i3 = p1 - 2;
          int i4 = 0;
          int i5 = 0;
          while (i4 < i3) {
             int i6 = i4 + 0;
             aa.a(p0, i6, i, uobyteArray, i5);
             i4 = i4 + 3;
             i5 = i5 + 4;
          }
          if (i4 < p1) {
             aa.a(p0, (i4 + 0), (p1 - i4), uobyteArray, i5);
             i5 = i5 + 4;
          }
          if (i5 <= (i2 - 1)) {
             p0 = new byte[i5];
             System.arraycopy(uobyteArray, 0, p0, 0, i5);
             uobyteArray = p0;
          }
          try{
             return new String(uobyteArray, "US-ASCII");
          }catch(java.io.UnsupportedEncodingException e0){
             return new String(uobyteArray);
          }
       }else {
          Object[] objArray = new Object[i];
          objArray[0] = Integer.valueOf(0);
          objArray[1] = Integer.valueOf(p1);
          objArray[2] = Integer.valueOf(p0.length);
          throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", objArray));
       }
    }
    public static byte[] a(String p0){
       return aa.b(p0);
    }
    public static byte[] a(byte[] p0,int p1,int p2,byte[] p3,int p4){
       byte[] b = aa.b;
       int i = 0;
       int i1 = (p2 > 0)? (p0[p1] << 24) >> 8: 0;
       int i2 = (p2 > 1)? (p0[(p1 + 1)] << 24) >> 16: 0;
       i1 = i1 | i2;
       if (p2 > 2) {
          i = (p0[(p1 + 2)] << 24) >> 24;
       }
       int i3 = i1 | i;
       p1 = 61;
       if (p2 != 1) {
          if (p2 != 2) {
             if (p2 != 3) {
                return p3;
             }else {
                p3[p4] = b[(i3 >> 18)];
                p3[(p4 + 1)] = b[((i3 >> 12) & 0x3f)];
                p3[(p4 + 2)] = b[((i3 >> 6) & 0x3f)];
                p3[(p4 + 3)] = b[(i3 & 0x3f)];
                return p3;
             }
          }else {
             p3[p4] = b[(i3 >> 18)];
             p3[(p4 + 1)] = b[((i3 >> 12) & 0x3f)];
             p3[(p4 + 2)] = b[((i3 >> 6) & 0x3f)];
             p3[(p4 + 3)] = p1;
             return p3;
          }
       }else {
          p3[p4] = b[(i3 >> 18)];
          p3[(p4 + 1)] = b[((i3 >> 12) & 0x3f)];
          p3[(p4 + 2)] = p1;
          p3[(p4 + 3)] = p1;
          return p3;
       }
    }
    public static byte[] b(String p0){
       byte[] bytes;
       ByteArrayInputStream uByteArrayIn;
       GZIPInputStream gZIPInputStr;
       ByteArrayOutputStream uByteArrayOu1;
       String str = "Input string was null.";
       try{
          Objects.requireNonNull(p0, str);
          bytes = p0.getBytes("US-ASCII");
       }catch(java.io.UnsupportedEncodingException e0){
          bytes = bytes.getBytes();
       }
       bytes = aa.b(bytes, bytes.length);
       if (bytes.length >= 4 && 0x8b1f == ((bytes[0] & 0x00ff) | ((bytes[1] << 8) & 0xff00))) {
          byte[] uobyteArray = new byte[2048];
          int i = 0;
          try{
             try{
                ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
                try{
                   uByteArrayIn = new ByteArrayInputStream(bytes);
                   gZIPInputStr = new GZIPInputStream(uByteArrayIn);
                   try{
                      i = gZIPInputStr.read(uobyteArray);
                      while (i >= 0) {
                         uByteArrayOu.write(uobyteArray, 0, i);
                      }
                      bytes = uByteArrayOu.toByteArray();
                      try{
                         uByteArrayOu.close();
                         try{
                         label_0052 :
                            gZIPInputStr.close();
                            try{
                               uByteArrayIn.close();
                            }catch(java.lang.Exception e0){
                            }
                         }catch(java.lang.Exception e0){
                         }
                      }catch(java.lang.Exception e0){
                      }
                   }catch(java.io.IOException e0){
                   }
                }catch(java.io.IOException e0){
                   gZIPInputStr = i;
                }
             }catch(java.io.IOException e0){
                uByteArrayIn = i;
                gZIPInputStr = uByteArrayIn;
             }
             try{
                e0.printStackTrace();
                i.close();
                goto label_0052 ;
             }catch(java.lang.Exception e0){
             }
          }catch(java.io.IOException e0){
             uByteArrayIn = i;
             gZIPInputStr = uByteArrayIn;
             goto label_0074 ;
          }
       }
    }
    public static byte[] b(byte[] p0,int p1){
       int i9;
       Object[] objArray;
       byte[] obj = p0;
       int i = p1;
       Objects.requireNonNull(obj, "Cannot decode null source array.");
       int i1 = i + 0;
       int i2 = 3;
       int i3 = 1;
       if (i1 <= obj.length) {
          if (!i) {
             obj = new byte[0];
             return obj;
          }else {
             int i4 = 4;
             if (i < i4) {
                throw new IllegalArgumentException(("Base64Util-encoded string must have at least four characters, but length specified was ").concat(String.valueOf(p1)));
             }
             byte[] c = aa.c;
             i = (i * 3) / i4;
             byte[] uobyteArray = new byte[i];
             byte[] uobyteArray1 = new byte[i4];
             int i5 = 0;
             int i6 = 0;
             int i7 = 0;
             while (true) {
                if (i5 < i1) {
                   int i8 = obj[i5] & 0x00ff;
                   i8 = c[i8];
                   if (i8 >= -5) {
                      if (i8 >= -1) {
                         i8 = i6 + 1;
                         uobyteArray1[i6] = obj[i5];
                         if (i8 > i2) {
                            if (i7 >= 0) {
                               i6 = i7 + 2;
                               if (i6 < i) {
                                  byte[] c1 = aa.c;
                                  if (uobyteArray1[2] == 61) {
                                     i6 = c1[uobyteArray1[0]] & 0x00ff;
                                     i6 = i6 << 18;
                                     i8 = c1[uobyteArray1[i3]] & 0x00ff;
                                     i8 = i8 << 12;
                                     i6 = i6 | i8;
                                     i6 = i6 >> 16;
                                     uobyteArray[i7] = (byte)i6;
                                  }else if(uobyteArray1[i2] == 61){
                                     i6 = c1[uobyteArray1[0]] & 0x00ff;
                                     i6 = i6 << 18;
                                     i9 = c1[uobyteArray1[i3]] & 0x00ff;
                                     i9 = i9 << 12;
                                     i6 = i6 | i9;
                                     i8 = c1[uobyteArray1[2]] & 0x00ff;
                                     i8 = i8 << 6;
                                     i6 = i6 | i8;
                                     i8 = i6 >> 16;
                                     uobyteArray[i7] = (byte)i8;
                                     i8 = i7 + 1;
                                     i6 = i6 >> 8;
                                     uobyteArray[i8] = (byte)i6;
                                     i3 = 2;
                                  }else {
                                     i9 = c1[uobyteArray1[0]] & 0x00ff;
                                     i9 = i9 << 18;
                                     i3 = c1[uobyteArray1[i3]] & 0x00ff;
                                     i3 = i3 << 12;
                                     i3 = i3 | i9;
                                     i9 = c1[uobyteArray1[2]] & 0x00ff;
                                     i9 = i9 << 6;
                                     i3 = i3 | i9;
                                     i8 = c1[uobyteArray1[i2]] & 0x00ff;
                                     i3 = i3 | i8;
                                     i8 = i3 >> 16;
                                     uobyteArray[i7] = (byte)i8;
                                     i8 = i7 + 1;
                                     i9 = i3 >> 8;
                                     uobyteArray[i8] = (byte)i9;
                                     uobyteArray[i6] = (byte)i3;
                                     i3 = 3;
                                  }
                                  i7 = i7 + i3;
                                  if (obj[i5] == 61) {
                                  label_0106 :
                                     obj = new byte[i7];
                                     System.arraycopy(uobyteArray, 0, obj, 0, i7);
                                     return obj;
                                  }else {
                                     i6 = 0;
                                  }
                               }
                            }
                            break ;
                         }else {
                            i6 = i8;
                         }
                      }
                      i5 = i5 + 1;
                      i3 = 1;
                   }else {
                      objArray = new Object[]{Integer.valueOf((obj[i5] & 0x00ff)),Integer.valueOf(i5)};
                      throw new IOException(String.format("Bad Base64Util input character decimal %d in array position %d", objArray));
                   }
                }else {
                   goto label_0106 ;
                }
             }
             objArray = new Object[]{Integer.valueOf(i),Integer.valueOf(i7)};
             throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", objArray));
          }
       }else {
          Object[] objArray1 = new Object[i2];
          objArray1[0] = Integer.valueOf(obj.length);
          objArray1[1] = Integer.valueOf(0);
          objArray1[2] = Integer.valueOf(p1);
          throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", objArray1));
       }
    }
}
