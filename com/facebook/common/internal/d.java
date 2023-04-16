package com.facebook.common.internal.d;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import com.facebook.common.internal.a;
import java.util.Arrays;
import com.facebook.common.internal.a$b;
import com.facebook.common.internal.a$a;
import java.lang.Object;
import java.lang.System;
import java.lang.OutOfMemoryError;
import java.lang.StringBuilder;
import java.lang.String;

public class d	// class@00105d
{

    public static byte[] a(InputStream p0,long p1){
       byte[] uobyteArray;
       if (p1 - 0x7fffffff > 0) {
          throw new OutOfMemoryError("file is too large to fit in a byte array: "+p1+" bytes");
       }
       if (!p1) {
          ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
          a.a(p0, uByteArrayOu);
          uobyteArray = uByteArrayOu.toByteArray();
       }else {
          int i = (int)p1;
          byte[] uobyteArray1 = new byte[i];
          int i1 = i;
          while (true) {
             a$b uob = -1;
             if (i1 > 0) {
                int i2 = i - i1;
                int i3 = p0.read(uobyteArray1, i2, i1);
                if (i3 == uob) {
                   uobyteArray = Arrays.copyOf(uobyteArray1, i2);
                   break ;
                }else {
                   i1 = i1 - i3;
                }
             }else {
                i1 = p0.read();
                if (i1 == uob) {
                   uobyteArray = uobyteArray1;
                   break ;
                }else {
                   uob = new a$b(null);
                   uob.write(i1);
                   a.a(p0, uob);
                   uobyteArray = new byte[(uob.size() + i)];
                   System.arraycopy(uobyteArray1, 0, uobyteArray, 0, i);
                   uob.a(uobyteArray, i);
                   break ;
                }
             }
          }
       }
       return uobyteArray;
    }
}
