package r87.c;
import java.lang.Object;
import r87.u;
import r87.v;
import java.lang.StringBuilder;
import java.lang.System;
import r87.u$a;
import q87.d;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;

public class c	// class@002317
{
    public final u a;
    public final v b;
    public final StringBuilder c;

    public void c(){
       super();
       u ou = new u();
       this.a = ou;
       v ov = new v();
       this.b = ov;
       this.c = new StringBuilder(1024);
       ou.a = new u$a();
       ou.a(System.currentTimeMillis());
       ou = ou.a;
       char[] uocharArray = new char[23];
       ov.h = uocharArray;
       ov.i = 0;
       ov.g(ou.a);
       ov.e(ou.b);
       ov.a(ou.c);
       ov.b(ou.d);
       ov.d(ou.e);
       ov.f(ou.f);
       ov.c(ou.g);
    }
    public byte[] a(d p0){
       byte[] uobyteArray;
       String str1;
       c uoc = this;
       d uod = p0;
       d c = uod.c;
       StringBuilder str = (c != null && c.length() > 1024)? new StringBuilder(((uod.c).length() + 100)): uoc.c;
       int i = 0;
       try{
          str.setLength(i);
          d a = uod.a;
          u ou = 1;
          char c1 = ' ';
          if (a != ou) {
             if (a != 2) {
                if (a != 4) {
                   if (a != 8) {
                      if (a != 16) {
                         str1 = (a != c1)? "-": "A";
                      }else {
                         str1 = "E";
                      }
                   }else {
                      str1 = "W";
                   }
                }else {
                   str1 = "I";
                }
             }else {
                str1 = "D";
             }
          }else {
             str1 = "V";
          }
          char c2 = '|';
          str = str+str1+c2;
          c a1 = uoc.a;
          d d = uod.d;
          u b = a1.b;
          if (d - b < 0 || (d - b) - 0x5265c00 >= 0) {
             ou = null;
          }
          if (!ou) {
             a1.a(d);
          }else {
             ou = a1.a;
             int i1 = (int)(d - b);
             ou.d = i1 / 0x36ee80;
             i1 = i1 % 0x36ee80;
             ou.e = i1 / 0xea60;
             i1 = i1 % 0xea60;
             ou.f = i1 / 1000;
             ou.g = i1 % 1000;
          }
          ou = a1.a;
          a1 = uoc.b;
          a1.i = i;
          a1.g(ou.a);
          a1.e(ou.b);
          a1.a(ou.c);
          a1.b(ou.d);
          a1.d(ou.e);
          a1.f(ou.f);
          a1.c(ou.g);
          str = str+a1.h;
          String str2 = "N/A";
          str = (TextUtils.isEmpty(uod.h))? str+c2+str2+c1: str+c2+uod.h+c1;
          str = (TextUtils.isEmpty(uod.i))? str+str2: str+uod.i+'-'+uod.j;
          str = str+"|M:";
          if (!TextUtils.isEmpty(uod.e)) {
             str = str+uod.e;
          }
          str = str+"|T:";
          if (!TextUtils.isEmpty(uod.b)) {
             str = str+uod.b;
          }
          str = str+"|D:";
          if (!TextUtils.isEmpty(uod.c)) {
             str = str+uod.c;
          }
          if (!TextUtils.isEmpty(uod.f)) {
             str = str+c1+uod.f;
          }
          a = uod.k;
          if (a != null && a.length > 0) {
             byte[] bytes = (str).getBytes();
             uod = uod.k;
             byte[] bytes1 = ("\n").getBytes();
             int len = bytes1.length;
             uobyteArray = new byte[((bytes.length + uod.length) + len)];
             System.arraycopy(bytes, i, uobyteArray, i, bytes.length);
             System.arraycopy(uod, i, uobyteArray, bytes.length, uod.length);
             System.arraycopy(bytes1, i, uobyteArray, (bytes.length + uod.length), len);
          }else {
             uobyteArray = (str+10).getBytes();
          }
          return uobyteArray;
       }catch(java.lang.OutOfMemoryError e0){
       }
    }
}
