package com.kwai.video.westeros.Westeros$3;
import java.lang.Runnable;
import com.kwai.video.westeros.Westeros;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.camerasdk.log.Log;

public class Westeros$3 implements Runnable	// class@000e69
{
    public final Westeros this$0;

    public void Westeros$3(Westeros p0){
       this.this$0 = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, Westeros$3.class, "1")) {
          return;
       }
       Log.d("Westeros", "Disposed");
       return;
    }
}
