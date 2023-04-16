package com.yxcorp.gifshow.util.l0;
import ok.x;
import java.lang.Object;
import lnc.s6;
import xf6.d;
import java.lang.Float;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.reflect.Type;

public final class l0 implements x	// class@001f8b
{
    public static final l0 b;

    static {
       l0.b = new l0();
    }
    public void l0(){
       super();
    }
    public final Object get(){
       Float uFloat = (d.N() - null)? Float.valueOf(d.N()): a.t().getValue("revertScalePostEntranceRatio", Float.class, Float.valueOf(0xbf800000));
       return uFloat;
    }
}
