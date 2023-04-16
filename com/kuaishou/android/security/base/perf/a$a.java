package com.kuaishou.android.security.base.perf.a$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;

public final class a$a extends Enum	// class@000ef6
{
    public int a;
    public int b;
    public static final a$a c;
    public static final a$a d;
    public static final a$a e;
    public static final a$a f;
    public static final a$a g;
    public static final a$a h;
    public static final a$a i;
    public static final a$a j;
    public static final a$a k;
    public static final a$a l;
    public static final a$a m;
    public static final a$a n;
    public static final a$a o;
    public static final a$a p;
    public static final a$a q;
    public static final a$a r;
    public static final a$a s;
    public static final a$a t;
    public static final a$a u;
    public static final a$a v;
    public static final a$a w;
    public static final a$a[] x;

    static {
       a$a uoa = new a$a("INIT", 0, 0, 1);
       a$a.c = uoa;
       a$a uoa1 = new a$a("SIGN", 1, 1, 30);
       a$a.d = uoa1;
       a$a uoa2 = new a$a("AENC", 2, 2, 20);
       a$a.e = uoa2;
       a$a uoa3 = new a$a("ADEC", 3, 3, 20);
       a$a.f = uoa3;
       a$a uoa4 = new a$a("UENC", 4, 4);
       a$a.g = uoa4;
       a$a uoa5 = new a$a("UDEC", 5, 5);
       a$a.h = uoa5;
       a$a uoa6 = new a$a("ASMENC", 6, 6);
       a$a.i = uoa6;
       a$a uoa7 = new a$a("ASMDEC", 7, 7);
       a$a.j = uoa7;
       a$a uoa8 = new a$a("GETSVALUE", 8, 8, 20);
       a$a.k = uoa8;
       a$a uoa9 = new a$a("ENV", 9, 9, 1);
       a$a.l = uoa9;
       a$a uoa10 = new a$a("SDKSIGN", 10, 10, 1);
       a$a.m = uoa10;
       a$a uoa11 = new a$a("SDKAENC", 11, 11, 1);
       a$a.n = uoa11;
       a$a uoa12 = new a$a("SDKADEC", 12, 12, 1);
       a$a.o = uoa12;
       a$a uoa13 = uoa12;
       a$a uoa14 = new a$a("SDKSVALUE", 13, 13, 1);
       a$a.p = uoa14;
       a$a uoa15 = uoa14;
       a$a uoa16 = new a$a("AINIT_SUCC", 14, 14, 1);
       a$a.q = uoa16;
       a$a uoa17 = uoa16;
       uoa12 = new a$a("AINIT_FAIL", 15, 15, 1);
       a$a.r = uoa12;
       a$a uoa18 = uoa12;
       uoa14 = new a$a("AINIT_ERROR", 16, 16, 1);
       a$a.s = uoa14;
       a$a uoa19 = uoa14;
       uoa16 = new a$a("SINIT_SUCC", 17, 17, 1);
       a$a.t = uoa16;
       a$a uoa20 = uoa16;
       uoa12 = new a$a("SINIT_FAIL", 18, 18, 1);
       a$a.u = uoa12;
       a$a uoa21 = uoa12;
       uoa14 = new a$a("AIO_ALL_INIT", 19, 19, 1);
       a$a.v = uoa14;
       a$a uoa22 = uoa14;
       uoa16 = new a$a("AIO_AIO_BLOCK_TIMEMILLS", 20, 20, 5);
       a$a.w = uoa16;
       a$a[] uoaArray = new a$a[21];
       uoaArray[0] = uoa;
       uoaArray[1] = uoa1;
       uoaArray[2] = uoa2;
       uoaArray[3] = uoa3;
       uoaArray[4] = uoa4;
       uoaArray[5] = uoa5;
       uoaArray[6] = uoa6;
       uoaArray[7] = uoa7;
       uoaArray[8] = uoa8;
       uoaArray[9] = uoa9;
       uoaArray[10] = uoa10;
       uoaArray[11] = uoa11;
       uoaArray[12] = uoa13;
       uoaArray[13] = uoa15;
       uoaArray[14] = uoa17;
       uoaArray[15] = uoa18;
       uoaArray[16] = uoa19;
       uoaArray[17] = uoa20;
       uoaArray[18] = uoa21;
       uoaArray[19] = uoa22;
       uoaArray[20] = uoa16;
       a$a.x = uoaArray;
    }
    public void a$a(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
       this.b = 100;
    }
    public void a$a(String p0,int p1,int p2,int p3){
       super(p0, p1);
       this.a = p2;
       this.b = p3;
    }
    public static a$a a(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a$a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return Enum.valueOf(a$a.class, p0);
    }
    public static a$a[] values(){
       Object obj = PatchProxy.apply(null, null, a$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a$a.x.clone();
    }
    public int a(){
       return this.b;
    }
    public int b(){
       return this.a;
    }
}
