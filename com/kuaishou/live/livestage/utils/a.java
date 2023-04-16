package com.kuaishou.live.livestage.utils.a;
import java.lang.Runnable;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class a implements Runnable	// class@000bfe
{
    public final Throwable b;

    public void a(Throwable p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       a tb = this.b;
       a.o(tb, "it");
       throw tb;
    }
}
