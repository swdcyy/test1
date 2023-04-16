package com.meizu.cloud.pushsdk.c.c.f$a$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class f$a$a extends Enum	// class@0014d0
{
    public static final f$a$a a;
    public static final f$a$a b;
    public static final f$a$a c;
    public static final f$a$a d;
    public static final f$a$a e;
    public static final f$a$a[] f;

    static {
       f$a$a uoa$a = new f$a$a("SUCCESS", 0);
       f$a$a.a = uoa$a;
       f$a$a uoa$a1 = new f$a$a("MISSING_SCHEME", 1);
       f$a$a.b = uoa$a1;
       f$a$a uoa$a2 = new f$a$a("UNSUPPORTED_SCHEME", 2);
       f$a$a.c = uoa$a2;
       f$a$a uoa$a3 = new f$a$a("INVALID_PORT", 3);
       f$a$a.d = uoa$a3;
       f$a$a uoa$a4 = new f$a$a("INVALID_HOST", 4);
       f$a$a.e = uoa$a4;
       f$a$a[] uoa$aArray = new f$a$a[]{uoa$a,uoa$a1,uoa$a2,uoa$a3,uoa$a4};
       f$a$a.f = uoa$aArray;
    }
    public void f$a$a(String p0,int p1){
       super(p0, p1);
    }
    public static f$a$a valueOf(String p0){
       return Enum.valueOf(f$a$a.class, p0);
    }
    public static f$a$a[] values(){
       return f$a$a.f.clone();
    }
}
