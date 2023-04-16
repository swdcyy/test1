package com.loc.by;
import com.loc.ca;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.lang.StringBuilder;
import java.lang.String;
import com.loc.x;
import com.loc.o;
import android.os.Build;
import com.loc.l;
import java.lang.Throwable;
import com.loc.an;
import java.lang.Object;
import java.lang.System;

public final class by extends ca	// class@0013af
{
    public Context e;
    public static int a = 13;
    public static int b = 6;

    public void by(Context p0,ca p1){
       this.e = p0;
    }
    public static byte[] a(Context p0){
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       byte[] uobyteArray = new byte[0];
       x.a(uByteArrayOu, "1.2."+by.a+"."+by.b);
       x.a(uByteArrayOu, "Android");
       x.a(uByteArrayOu, o.v(p0));
       x.a(uByteArrayOu, o.k(p0));
       x.a(uByteArrayOu, o.h(p0));
       x.a(uByteArrayOu, Build.MANUFACTURER);
       x.a(uByteArrayOu, Build.MODEL);
       x.a(uByteArrayOu, Build.DEVICE);
       x.a(uByteArrayOu, o.y(p0));
       x.a(uByteArrayOu, l.c(p0));
       x.a(uByteArrayOu, l.d(p0));
       x.a(uByteArrayOu, l.f(p0));
       byte[] uobyteArray1 = new byte[]{0};
       uByteArrayOu.write(uobyteArray1);
       uobyteArray = uByteArrayOu.toByteArray();
       uByteArrayOu.close();
       return uobyteArray;
    }
    public final byte[] a(byte[] p0){
       byte[] uobyteArray = by.a(this.e);
       byte[] uobyteArray1 = new byte[(uobyteArray.length + p0.length)];
       System.arraycopy(uobyteArray, 0, uobyteArray1, 0, uobyteArray.length);
       System.arraycopy(p0, 0, uobyteArray1, uobyteArray.length, p0.length);
       return uobyteArray1;
    }
}
