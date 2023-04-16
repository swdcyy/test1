package com.yxcorp.gifshow.camerasdk.h;
import com.kwai.video.westeros.v2.ycnn.YcnnPlugin$OnYcnnGeneralRecogDetectionListener;
import qi9.u1;
import java.lang.Object;
import java.lang.String;
import qi9.c0;
import java.lang.Runnable;
import ekd.k1;

public final class h implements YcnnPlugin$OnYcnnGeneralRecogDetectionListener	// class@001018
{
    public final u1 a;

    public void h(u1 p0){
       this.a = p0;
    }
    public final void OnYcnnGeneralRecogDetectionResult(String p0){
       k1.o(new c0(this.a, p0));
    }
}
