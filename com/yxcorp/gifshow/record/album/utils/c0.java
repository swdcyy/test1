package com.yxcorp.gifshow.record.album.utils.c0;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import k8c.a;
import java.lang.String;
import q87.c;

public final class c0 implements r	// class@001760
{
    public static final c0 b;

    static {
       c0.b = new c0();
    }
    public void c0(){
       super();
    }
    public final boolean test(Object p0){
       if (!p0.booleanValue()) {
          Object[] objArray = new Object[0];
          a.D().w("DraftRecoverUtil", "postWork cache is not load complete", objArray);
       }
       return p0.booleanValue();
    }
}
