package com.loc.br;
import android.content.Context;
import java.lang.String;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import com.loc.k;
import java.io.ByteArrayOutputStream;
import com.loc.x;
import com.loc.o;
import java.lang.System;
import java.lang.Throwable;
import com.loc.an;

public final class br	// class@0013a7
{
    public Context a;
    public String b;
    public String c;
    public String d;
    public String e;

    public void br(Context p0,String p1,String p2,String p3){
       super();
       if (TextUtils.isEmpty(p3) || p3.length() > 256) {
          throw new k("无效的参数 - IllegalArgumentException");
       }
       this.a = p0.getApplicationContext();
       this.c = p1;
       this.d = p2;
       this.b = p3;
       return;
    }
    public static byte[] a(int p0){
       byte[] uobyteArray = new byte[]{(byte)((p0 >> 24) & 0x00ff),(byte)((p0 >> 16) & 0x00ff),(byte)((p0 >> 8) & 0x00ff),(byte)(p0 & 0x00ff)};
       return uobyteArray;
    }
    public final void a(String p0){
       if (TextUtils.isEmpty(p0) || p0.length() > 0x10000) {
          throw new k("无效的参数 - IllegalArgumentException");
       }
       this.e = p0;
       return;
    }
    public final byte[] a(){
       byte[] uobyteArray = new byte[0];
       ByteArrayOutputStream uByteArrayOu = new ByteArrayOutputStream();
       x.a(uByteArrayOu, this.c);
       x.a(uByteArrayOu, this.d);
       x.a(uByteArrayOu, this.b);
       x.a(uByteArrayOu, String.valueOf(o.o(this.a)));
       uByteArrayOu.write(br.a((int)(System.currentTimeMillis() / 1000)));
       uByteArrayOu.write(this.b(this.e));
       uByteArrayOu.write(x.a(this.e));
       uobyteArray = uByteArrayOu.toByteArray();
       uByteArrayOu.close();
       return uobyteArray;
    }
    public final byte[] b(String p0){
       if (TextUtils.isEmpty(p0)) {
          return new byte[2]{0x00,0x00};
       }
       byte[] uobyteArray = x.a(this.e);
       if (uobyteArray == null) {
          return new byte[2]{0x00,0x00};
       }
       return x.a(uobyteArray.length);
    }
}
