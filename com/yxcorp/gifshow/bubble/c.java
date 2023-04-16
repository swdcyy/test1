package com.yxcorp.gifshow.bubble.c;
import ok.o;
import java.lang.Object;
import com.yxcorp.gifshow.bubble.a;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import ra9.c;

public final class c implements o	// class@001c78
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final boolean apply(Object p0){
       boolean b = (!p0.d().isBlockedAfterShowingSelf() || p0.f())? true: false;
       return b;
    }
}
