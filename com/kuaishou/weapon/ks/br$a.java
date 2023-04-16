package com.kuaishou.weapon.ks.br$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class br$a extends Enum	// class@0011ee
{
    public static final br$a a;
    public static final br$a b;
    public static final br$a c;
    public static final br$a[] d;

    static {
       br$a uoa = new br$a("UNKNOWN", 0);
       br$a.a = uoa;
       br$a uoa1 = new br$a("ARMEABI_V7A", 1);
       br$a.b = uoa1;
       br$a uoa2 = new br$a("ARM64_V8A", 2);
       br$a.c = uoa2;
       br$a[] uoaArray = new br$a[]{uoa,uoa1,uoa2};
       br$a.d = uoaArray;
    }
    public void br$a(String p0,int p1){
       super(p0, p1);
    }
    public static br$a valueOf(String p0){
       return Enum.valueOf(br$a.class, p0);
    }
    public static br$a[] values(){
       return br$a.d.clone();
    }
}
