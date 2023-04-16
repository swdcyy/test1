package com.kwai.live.gzone.accompanyplay.audience.j0;
import erd.o;
import java.lang.Object;
import java.lang.Integer;
import com.yxcorp.retrofit.model.KwaiException;
import njd.a;
import java.lang.Boolean;
import java.lang.String;
import java.lang.Throwable;
import brd.t;

public final class j0 implements o	// class@000b87
{
    public static final j0 b;

    static {
       j0.b = new j0();
    }
    public void j0(){
       super();
    }
    public final Object apply(Object p0){
       if (p0.intValue()) {
          a uoa = new a(Boolean.FALSE, p0.intValue(), null, null, 0, 0);
          p0 = t.error(new KwaiException(v10));
       }else {
          p0 = t.just(Boolean.TRUE);
       }
       return p0;
    }
}
