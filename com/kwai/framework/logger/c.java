package com.kwai.framework.logger.c;
import java.lang.Runnable;
import com.kwai.framework.logger.LogManagerInitModule;
import java.lang.Object;
import java.util.Objects;
import w96.j;
import t45.c;

public final class c implements Runnable	// class@00165a
{
    public final LogManagerInitModule b;

    public void c(LogManagerInitModule p0){
       this.b = p0;
    }
    public final void run(){
       c tb = this.b;
       Objects.requireNonNull(tb);
       c.a(new j(tb));
    }
}
