package com.meizu.cloud.pushsdk.c.a.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class e extends Enum	// class@0014c2
{
    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    public static final e e;
    public static final e f;
    public static final e g;
    public static final e[] h;

    static {
       e uoe = new e("STRING", 0);
       e.a = uoe;
       e uoe1 = new e("JSON_OBJECT", 1);
       e.b = uoe1;
       e uoe2 = new e("JSON_ARRAY", 2);
       e.c = uoe2;
       e uoe3 = new e("OK_HTTP_RESPONSE", 3);
       e.d = uoe3;
       e uoe4 = new e("BITMAP", 4);
       e.e = uoe4;
       e uoe5 = new e("PREFETCH", 5);
       e.f = uoe5;
       e uoe6 = new e("PARSED", 6);
       e.g = uoe6;
       e[] uoeArray = new e[]{uoe,uoe1,uoe2,uoe3,uoe4,uoe5,uoe6};
       e.h = uoeArray;
    }
    public void e(String p0,int p1){
       super(p0, p1);
    }
    public static e valueOf(String p0){
       return Enum.valueOf(e.class, p0);
    }
    public static e[] values(){
       return e.h.clone();
    }
}
