package c.t.m.g.l;
import java.lang.Integer;
import java.lang.String;
import java.lang.Throwable;
import c.t.m.g.bt;
import c.t.m.g.bf;
import c.t.m.g.bj;
import c.t.m.g.by;
import java.lang.Object;
import java.lang.System;
import android.util.Base64;

public class l	// class@000c9c
{
    public static final byte[] a;

    static {
       byte[] uobyteArray = new byte[0];
       l.a = uobyteArray;
    }
    public static byte[] a(int p0){
       byte[] uobyteArray = new byte[2];
       for (int i = 0; i < 2; i = i + 1) {
          int i1 = p0 & 0x00ff;
          uobyteArray[i] = Integer.valueOf(i1).byteValue();
          p0 = p0 >> 8;
       }
       return uobyteArray;
    }
    public static byte[] a(String p0){
       return l.a(p0.getBytes("UTF-8"), 4);
    }
    public static byte[] a(byte[] p0,int p1){
       p0 = bf.a(p0);
       String str = bj.a("fc_base");
       if (by.a(str)) {
          bt.b("SosoLocUtils", "get pwd empty.");
       }
       if (p1 != 1 && p1 != 2) {
          if (p1 == 3) {
             p0 = bj.a(p0, str);
          }else if(p1 == 4){
             p0 = bj.a(p0, str);
             if (!by.a(p0)) {
                p0 = Base64.encode(p0, 2);
                if (!by.a(p0)) {
                   return p0;
                }
             }
             return l.a;
          }else {
             return l.a;
          }
       }
       if (by.a(p0)) {
          bt.b("SosoLocUtils", "encrypt failed");
          return l.a;
       }else {
          byte[] uobyteArray = new byte[(p0.length + 2)];
          System.arraycopy(l.a(p0.length), 0, uobyteArray, 0, 2);
          System.arraycopy(p0, 0, uobyteArray, 2, p0.length);
          return uobyteArray;
       }
    }
}
