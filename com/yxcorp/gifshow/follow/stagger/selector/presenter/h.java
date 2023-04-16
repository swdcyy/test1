package com.yxcorp.gifshow.follow.stagger.selector.presenter.h;
import erd.c;
import java.lang.Object;
import java.lang.Float;
import java.lang.Boolean;

public final class h implements c	// class@001246
{
    public static final h a;

    static {
       h.a = new h();
    }
    public void h(){
       super();
    }
    public final Object a(Object p0,Object p1){
       boolean b = (!p0.floatValue() - 0x3f800000 && p1.booleanValue())? true: false;
       return Boolean.valueOf(b);
    }
}
