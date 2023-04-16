package com.kwai.framework.abtest.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.abtest.ABTestInitModule;
import com.kwai.framework.abtest.f;
import wu8.p;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcorp.experiment.c;
import java.lang.String;
import java.lang.reflect.Type;

public final class c implements Runnable	// class@000b0a
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       f.c().g();
       Boolean fALSE = Boolean.FALSE;
       Objects.requireNonNull(p.d());
       c.h().m(fALSE);
       f.b("init", Boolean.class, fALSE);
    }
}
