package com.loc.ef;
import java.lang.Object;
import com.loc.ef$b;
import com.loc.ef$a;
import java.lang.System;
import java.lang.IllegalArgumentException;
import java.lang.String;

public class ef	// class@001401
{
    public static final boolean a = true;

    public void ef(){
       super();
    }
    public static byte[] a(byte[] p0){
       return ef.a(p0, p0.length);
    }
    public static byte[] a(byte[] p0,int p1){
       byte[] uobyteArray = new byte[((p1 * 3) / 4)];
       ef$b uob = new ef$b(uobyteArray);
       if (!uob.a(p0, p1)) {
          throw new IllegalArgumentException("bad base-64");
       }
       ef$a b = uob.b;
       ef$a a = uob.a;
       if (b == a.length) {
          return a;
       }
       byte[] uobyteArray1 = new byte[b];
       System.arraycopy(a, 0, uobyteArray1, 0, b);
       return uobyteArray1;
    }
}
