package com.meizu.cloud.pushsdk.d.b.h;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class h extends Enum	// class@001512
{
    public static final h a;
    public static final h b;
    public static final h[] c;

    static {
       h oh = new h("HTTP", 0);
       h.a = oh;
       h oh1 = new h("HTTPS", 1);
       h.b = oh1;
       h[] ohArray = new h[]{oh,oh1};
       h.c = ohArray;
    }
    public void h(String p0,int p1){
       super(p0, p1);
    }
    public static h valueOf(String p0){
       return Enum.valueOf(h.class, p0);
    }
    public static h[] values(){
       return h.c.clone();
    }
}
