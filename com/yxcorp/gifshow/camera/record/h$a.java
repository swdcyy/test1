package com.yxcorp.gifshow.camera.record.h$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.h;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class h$a implements Runnable	// class@001d44
{
    public int b;
    public final h c;

    public void h$a(h p0){
       this.c = p0;
       super();
       this.b = -1;
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, h$a.class, "1")) {
          return;
       }
       this.c.e(this.b);
       return;
    }
}
