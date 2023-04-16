package com.yxcorp.gifshow.camera.record.magic.sticker.b$a;
import android.os.Handler;
import com.yxcorp.gifshow.camera.record.magic.sticker.b;
import android.os.Looper;
import android.os.Message;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;

public class b$a extends Handler	// class@000e5b
{
    public final b a;

    public void b$a(b p0,Looper p1){
       this.a = p0;
       super(p1);
    }
    public void handleMessage(Message p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b$a.class, "1")) {
          return;
       }
       if (p0.what == 4132) {
          this.a.m2();
       }
       return;
    }
}
