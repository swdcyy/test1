package com.yxcorp.gifshow.follow.stagger.header.b;
import java.lang.Runnable;
import com.yxcorp.gifshow.follow.stagger.header.a$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.follow.stagger.header.a;

public final class b implements Runnable	// class@0011ba
{
    public final a$b b;

    public void b(a$b p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, b.class, "1")) {
          return;
       }
       this.b.b.b9();
       return;
    }
}
