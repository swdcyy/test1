package com.loc.t$c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class t$c extends Enum	// class@001469
{
    public final int j;
    public static final t$c a;
    public static final t$c b;
    public static final t$c c;
    public static final t$c d;
    public static final t$c e;
    public static final t$c f;
    public static final t$c g;
    public static final t$c h;
    public static final t$c i;
    public static final t$c[] k;

    static {
       t$c uoc = new t$c("SuccessCode", 0, 0);
       t$c.a = uoc;
       t$c uoc1 = new t$c("ShowUnknowCode", 1, 0x87a32);
       t$c.b = uoc1;
       t$c uoc2 = new t$c("ShowNoShowCode", 2, 0x87a33);
       t$c.c = uoc2;
       t$c uoc3 = new t$c("InfoUnknowCode", 3, 0x87a34);
       t$c.d = uoc3;
       t$c uoc4 = new t$c("InfoNotContainCode", 4, 0x87a35);
       t$c.e = uoc4;
       t$c uoc5 = new t$c("AgreeUnknowCode", 5, 0x87a36);
       t$c.f = uoc5;
       t$c uoc6 = new t$c("AgreeNotAgreeCode", 6, 0x87a37);
       t$c.g = uoc6;
       t$c uoc7 = new t$c("InvaildUserKeyCode", 7, 0x2711);
       t$c.h = uoc7;
       t$c uoc8 = new t$c("IllegalArgument", 8, 0x4e21);
       t$c.i = uoc8;
       t$c[] uocArray = new t$c[9];
       uocArray[0] = uoc;
       uocArray[1] = uoc1;
       uocArray[2] = uoc2;
       uocArray[3] = uoc3;
       uocArray[4] = uoc4;
       uocArray[5] = uoc5;
       uocArray[6] = uoc6;
       uocArray[7] = uoc7;
       uocArray[8] = uoc8;
       t$c.k = uocArray;
    }
    public void t$c(String p0,int p1,int p2){
       this.j = p2;
    }
    public static t$c valueOf(String p0){
       return Enum.valueOf(t$c.class, p0);
    }
    public static t$c[] values(){
       return t$c.k.clone();
    }
    public final int a(){
       return this.j;
    }
}
