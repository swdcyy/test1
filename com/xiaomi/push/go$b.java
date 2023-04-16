package com.xiaomi.push.go$b;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class go$b extends Enum	// class@00110d
{
    public static final go$b a;
    public static final go$b[] a;
    public static final go$b b;
    public static final go$b c;
    public static final go$b d;
    public static final go$b e;
    public static final go$b f;
    public static final go$b g;
    public static final go$b h;

    static {
       go$b uob = new go$b("available", 0);
       go$b.a = uob;
       go$b uob1 = new go$b("unavailable", 1);
       go$b.b = uob1;
       go$b uob2 = new go$b("subscribe", 2);
       go$b.c = uob2;
       go$b uob3 = new go$b("subscribed", 3);
       go$b.d = uob3;
       go$b uob4 = new go$b("unsubscribe", 4);
       go$b.e = uob4;
       go$b uob5 = new go$b("unsubscribed", 5);
       go$b.f = uob5;
       go$b uob6 = new go$b("error", 6);
       go$b.g = uob6;
       go$b uob7 = new go$b("probe", 7);
       go$b.h = uob7;
       go$b[] uobArray = new go$b[]{uob,uob1,uob2,uob3,uob4,uob5,uob6,uob7};
       go$b.a = uobArray;
    }
    public void go$b(String p0,int p1){
       super(p0, p1);
    }
    public static go$b valueOf(String p0){
       return Enum.valueOf(go$b.class, p0);
    }
    public static go$b[] values(){
       return go$b.a.clone();
    }
}
