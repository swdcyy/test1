package com.loc.cj;
import com.loc.cl;
import com.loc.ci$a;
import java.lang.String;
import com.loc.ci;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.lang.Throwable;
import com.loc.an;

public final class cj extends cl	// class@0013bd
{
    public static cj c;

    static {
       cj.c = new cj(new ci$a().a("amap-global-threadPool").a());
    }
    public void cj(ci p0){
       ThreadPoolExecutor threadPoolEx = new ThreadPoolExecutor(p0.a(), p0.b(), (long)p0.d(), TimeUnit.SECONDS, p0.c(), p0);
       this.a = v8;
       v8.allowCoreThreadTimeOut(true);
    }
    public static cj a(){
       return cj.c;
    }
}
