package com.yxcorp.gifshow.camera.record.widget.i$b;
import java.lang.Runnable;
import com.yxcorp.gifshow.camera.record.widget.i;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class i$b implements Runnable	// class@000fec
{
    public final i b;

    public void i$b(i p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, i$b.class, "1")) {
          return;
       }
       this.b.s(0);
       return;
    }
}
