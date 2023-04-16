package com.xiaomi.mipush.sdk.e;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class e extends Enum	// class@0010ef
{
    public int a;
    public static final e a;
    public static final e[] a;
    public static final e b;
    public static final e c;
    public static final e d;

    static {
       e uoe = new e("ASSEMBLE_PUSH_HUAWEI", 0, 1);
       e.a = uoe;
       e uoe1 = new e("ASSEMBLE_PUSH_FCM", 1, 2);
       e.b = uoe1;
       e uoe2 = new e("ASSEMBLE_PUSH_COS", 2, 3);
       e.c = uoe2;
       e uoe3 = new e("ASSEMBLE_PUSH_FTOS", 3, 4);
       e.d = uoe3;
       e[] uoeArray = new e[]{uoe,uoe1,uoe2,uoe3};
       e.a = uoeArray;
    }
    public void e(String p0,int p1,int p2){
       this.a = p2;
    }
    public static e valueOf(String p0){
       return Enum.valueOf(e.class, p0);
    }
    public static e[] values(){
       return e.a.clone();
    }
}
