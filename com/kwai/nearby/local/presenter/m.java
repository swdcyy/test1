package com.kwai.nearby.local.presenter.m;
import erd.c;
import java.lang.Object;
import java.lang.Boolean;

public final class m implements c	// class@000fb8
{
    public static final m a;

    static {
       m.a = new m();
    }
    public void m(){
       super();
    }
    public final Object a(Object p0,Object p1){
       boolean b = (p0.booleanValue() && p1.booleanValue())? true: false;
       return Boolean.valueOf(b);
    }
}
