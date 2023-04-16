package com.yxcorp.gifshow.camera.record.followshoot.c;
import com.yxcorp.gifshow.camera.record.followshoot.f$c;
import com.yxcorp.gifshow.camera.record.followshoot.d;
import java.lang.Object;
import com.yxcorp.gifshow.camera.record.followshoot.f;
import java.util.Objects;
import j8c.a;
import java.lang.StringBuilder;
import java.lang.String;
import w46.b;
import com.yxcorp.gifshow.camera.record.base.d;
import com.yxcorp.gifshow.camerasdk.q;
import hd9.w;
import java.lang.Runnable;
import t45.c;

public final class c implements f$c	// class@000dc8
{
    public final d a;

    public void c(d p0){
       this.a = p0;
    }
    public final boolean a(f p0,int p1,int p2){
       c ta = this.a;
       Objects.requireNonNull(ta);
       Object[] objArray = new Object[0];
       a.D().t("UseSampleController", "onError "+p1+" "+p2, objArray);
       c.a(new w(ta, p1, p2, ta.h.isRecording()));
       ta.n2();
       return 0;
    }
}
