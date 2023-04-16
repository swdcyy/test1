package com.alipay.sdk.m.q.f;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class f extends Enum	// class@000ea0
{
    public int a;
    public String b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;
    public static final f i;
    public static final f j;
    public static final f k;
    public static final f l;
    public static final f m;
    public static final f n;
    public static final f o;
    public static final f p;
    public static final f q;
    public static final f r;
    public static final f[] s;

    static {
       f uof = new f("WIFI", 0, 0, "WIFI");
       f.c = uof;
       f uof1 = new f("NETWORK_TYPE_1", 1, 1, "unicom2G");
       f.d = uof1;
       f uof2 = new f("NETWORK_TYPE_2", 2, 2, "mobile2G");
       f.e = uof2;
       f uof3 = new f("NETWORK_TYPE_4", 3, 4, "telecom2G");
       f.f = uof3;
       f uof4 = new f("NETWORK_TYPE_5", 4, 5, "telecom3G");
       f.g = uof4;
       f uof5 = new f("NETWORK_TYPE_6", 5, 6, "telecom3G");
       f.h = uof5;
       f uof6 = new f("NETWORK_TYPE_12", 6, 12, "telecom3G");
       f.i = uof6;
       f uof7 = new f("NETWORK_TYPE_8", 7, 8, "unicom3G");
       f.j = uof7;
       f uof8 = new f("NETWORK_TYPE_3", 8, 3, "unicom3G");
       f.k = uof8;
       f uof9 = new f("NETWORK_TYPE_13", 9, 13, "LTE");
       f.l = uof9;
       f uof10 = new f("NETWORK_TYPE_11", 10, 11, "IDEN");
       f.m = uof10;
       f uof11 = new f("NETWORK_TYPE_9", 11, 9, "HSUPA");
       f.n = uof11;
       f uof12 = uof11;
       f uof13 = new f("NETWORK_TYPE_10", 12, 10, "HSPA");
       f.o = uof13;
       f uof14 = uof13;
       f uof15 = new f("NETWORK_TYPE_15", 13, 15, "HSPAP");
       f.p = uof15;
       f uof16 = uof15;
       uof13 = new f("NETWORK_TYPE_20", 14, 20, "5G");
       f.q = uof13;
       f uof17 = uof13;
       uof15 = new f("NONE", 15, -1, "none");
       f.r = uof15;
       f[] uofArray = new f[16];
       uofArray[0] = uof;
       uofArray[1] = uof1;
       uofArray[2] = uof2;
       uofArray[3] = uof3;
       uofArray[4] = uof4;
       uofArray[5] = uof5;
       uofArray[6] = uof6;
       uofArray[7] = uof7;
       uofArray[8] = uof8;
       uofArray[9] = uof9;
       uofArray[10] = uof10;
       uofArray[11] = uof12;
       uofArray[12] = uof14;
       uofArray[13] = uof16;
       uofArray[14] = uof17;
       uofArray[15] = uof15;
       f.s = uofArray;
    }
    public void f(String p0,int p1,int p2,String p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static f a(int p0){
       object oobject;
       f[] uofArray = f.values();
       int len = uofArray.length;
       int i = 0;
       while (true) {
          if (i >= len) {
             return f.r;
          }
          oobject = uofArray[i];
          if (oobject.a() == p0) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return oobject;
    }
    public static f valueOf(String p0){
       return Enum.valueOf(f.class, p0);
    }
    public static f[] values(){
       return f.s.clone();
    }
    public final int a(){
       return this.a;
    }
    public final String b(){
       return this.b;
    }
}
