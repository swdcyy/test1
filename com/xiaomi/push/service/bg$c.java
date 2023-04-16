package com.xiaomi.push.service.bg$c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class bg$c extends Enum	// class@001163
{
    public static final bg$c a;
    public static final bg$c[] a;
    public static final bg$c b;
    public static final bg$c c;

    static {
       bg$c uoc = new bg$c("unbind", 0);
       bg$c.a = uoc;
       bg$c uoc1 = new bg$c("binding", 1);
       bg$c.b = uoc1;
       bg$c uoc2 = new bg$c("binded", 2);
       bg$c.c = uoc2;
       bg$c[] uocArray = new bg$c[]{uoc,uoc1,uoc2};
       bg$c.a = uocArray;
    }
    public void bg$c(String p0,int p1){
       super(p0, p1);
    }
    public static bg$c valueOf(String p0){
       return Enum.valueOf(bg$c.class, p0);
    }
    public static bg$c[] values(){
       return bg$c.a.clone();
    }
}
