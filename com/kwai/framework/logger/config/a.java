package com.kwai.framework.logger.config.a;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kwai.framework.logger.config.b;
import w96.d;
import java.lang.String;
import q87.c;

public final class a implements g	// class@00165e
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void accept(Object p0){
       d.C().r("LogConfiguration", "Failed to connect to logger.com: ", p0);
    }
}
