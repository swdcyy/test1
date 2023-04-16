package com.xiaomi.push.go$a;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class go$a extends Enum	// class@00110c
{
    public static final go$a a;
    public static final go$a[] a;
    public static final go$a b;
    public static final go$a c;
    public static final go$a d;
    public static final go$a e;

    static {
       go$a uoa = new go$a("chat", 0);
       go$a.a = uoa;
       go$a uoa1 = new go$a("available", 1);
       go$a.b = uoa1;
       go$a uoa2 = new go$a("away", 2);
       go$a.c = uoa2;
       go$a uoa3 = new go$a("xa", 3);
       go$a.d = uoa3;
       go$a uoa4 = new go$a("dnd", 4);
       go$a.e = uoa4;
       go$a[] uoaArray = new go$a[]{uoa,uoa1,uoa2,uoa3,uoa4};
       go$a.a = uoaArray;
    }
    public void go$a(String p0,int p1){
       super(p0, p1);
    }
    public static go$a valueOf(String p0){
       return Enum.valueOf(go$a.class, p0);
    }
    public static go$a[] values(){
       return go$a.a.clone();
    }
}
