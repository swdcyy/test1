package com.yxcorp.plugin.setting.entries.holder.b0;
import erd.c;
import java.lang.Object;
import java.lang.Integer;
import java.lang.Boolean;

public final class b0 implements c	// class@000846
{
    public static final b0 a;

    static {
       b0.a = new b0();
    }
    public void b0(){
       super();
    }
    public final Object a(Object p0,Object p1){
       boolean b = ((p0.intValue() + p1.intValue()) > 0)? true: false;
       return Boolean.valueOf(b);
    }
}
