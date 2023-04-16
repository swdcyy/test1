package com.ta.utdid2.a.a.f;
import java.lang.String;
import com.ta.utdid2.a.a.f$a;
import com.ta.utdid2.a.a.f$1;

public class f	// class@000cc5
{

    public static f$a a(String p0){
       if (p0 == null) {
          return null;
       }
       f$a uoa = new f$a(null);
       int i = 0;
       int i1 = 0;
       f$a uoa1 = 256;
       while (i1 < uoa1) {
          uoa.d[i1] = i1;
          i1 = i1 + 1;
       }
       uoa.x = i;
       uoa.y = i;
       i1 = 0;
       int i2 = 0;
       for (; i < uoa1; i = i + 1) {
          try{
             f$a d = uoa.d;
             int i3 = p0.charAt(i1) + d[i];
             i3 = i3 + i2;
             i2 = i3 % 256;
             i3 = d[i];
             d[i] = d[i2];
             d[i2] = i3;
             i1 = i1 + 1;
             i1 = i1 % p0.length();
          }catch(java.lang.Exception e0){
             return e0;
          }
       }
       return uoa;
    }
    public static byte[] a(byte[] p0){
       if (p0 != null) {
          f$a uoa = f.a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK");
          if (uoa != null) {
             return f.a(p0, uoa);
          }
       }
       return null;
    }
    public static byte[] a(byte[] p0,f$a p1){
       if (p0 == null || p1 == null) {
          return null;
       }
       f$a x = p1.x;
       f$a y = p1.y;
       for (int i = 0; i < p0.length; i = i + 1) {
          int i1 = x + 1;
          i1 = i1 % 256;
          f$a d = p1.d;
          int i2 = d[i1] + y;
          y = i2 % 256;
          i2 = d[i1];
          d[i1] = d[y];
          d[y] = i2;
          i2 = d[i1] + d[y];
          i2 = i2 % 256;
          int i3 = d[i2] ^ p0[i];
          p0[i] = (byte)i3;
       }
       p1.x = x;
       p1.y = y;
       return p0;
    }
}
