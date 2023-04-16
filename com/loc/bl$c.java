package com.loc.bl$c;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class bl$c extends Enum	// class@00139f
{
    public int c;
    public static final bl$c a;
    public static final bl$c b;
    public static final bl$c[] d;

    static {
       bl$c uoc = new bl$c("HTTP", 0, 0);
       bl$c.a = uoc;
       bl$c uoc1 = new bl$c("HTTPS", 1, 1);
       bl$c.b = uoc1;
       bl$c[] uocArray = new bl$c[]{uoc,uoc1};
       bl$c.d = uocArray;
    }
    public void bl$c(String p0,int p1,int p2){
       this.c = p2;
    }
    public static bl$c valueOf(String p0){
       return Enum.valueOf(bl$c.class, p0);
    }
    public static bl$c[] values(){
       return bl$c.d.clone();
    }
}
