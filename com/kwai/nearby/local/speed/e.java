package com.kwai.nearby.local.speed.e;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.nearby.local.speed.HomeLocalSpeedUpInitModule;
import wkd.b;
import com.kwai.nearby.local.speed.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public final class e implements Runnable	// class@000fe8
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void run(){
       a uoa = b.a(-1360575218);
       Objects.requireNonNull(uoa);
       if (PatchProxy.applyVoid(null, uoa, a.class, "1")) {
       }else {
          uoa.m = false;
          uoa.k();
       }
       return;
    }
}
