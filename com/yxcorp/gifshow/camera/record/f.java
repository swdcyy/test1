package com.yxcorp.gifshow.camera.record.f;
import android.view.OrientationEventListener;
import com.yxcorp.gifshow.camera.record.h;
import android.content.Context;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.h$a;
import java.lang.Runnable;
import ekd.k1;

public class f extends OrientationEventListener	// class@001d40
{
    public final h a;

    public void f(h p0,Context p1){
       this.a = p0;
       super(p1);
    }
    public void onOrientationChanged(int p0){
       if (PatchProxy.isSupport(f.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, f.class, "1")) {
          return;
       }
       this.a.l.b = p0;
       k1.o(this.a.l);
       return;
    }
}
