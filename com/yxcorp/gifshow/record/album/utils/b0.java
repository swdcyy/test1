package com.yxcorp.gifshow.record.album.utils.b0;
import erd.r;
import java.lang.Object;
import java.lang.Boolean;
import k8c.a;
import java.lang.String;
import q87.c;

public final class b0 implements r	// class@00175e
{
    public static final b0 b;

    static {
       b0.b = new b0();
    }
    public void b0(){
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
