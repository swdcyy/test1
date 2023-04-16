package com.kwai.nearby.local.presenter.g;
import erd.h;
import java.lang.Object;
import java.lang.Boolean;

public final class g implements h	// class@000fb2
{
    public static final g a;

    static {
       g.a = new g();
    }
    public void g(){
       super();
    }
    public final Object a(Object p0,Object p1,Object p2){
       boolean b = (p0.booleanValue() && p1.booleanValue())? true: false;
       return Boolean.valueOf(b);
    }
}
