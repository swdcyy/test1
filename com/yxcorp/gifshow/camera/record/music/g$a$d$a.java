package com.yxcorp.gifshow.camera.record.music.g$a$d$a;
import d46.b;
import com.yxcorp.gifshow.camera.record.music.g$a$d;
import brd.v;
import java.lang.Object;
import android.content.Intent;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import j8c.a;
import com.yxcorp.gifshow.camera.record.music.g;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Exception;
import java.lang.Throwable;
import brd.g;
import kotlin.Pair;
import java.lang.Float;

public final class g$a$d$a implements b	// class@000e79
{
    public final g$a$d a;
    public final v b;

    public void g$a$d$a(g$a$d p0,v p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(Intent p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a$d$a.class, "1")) {
          return;
       }
       a uoa = a.D();
       String d = g.d;
       StringBuilder str = "music response ";
       boolean b = (p0 != null)? true: false;
       Object[] objArray = new Object[0];
       uoa.s(d, str+b, objArray);
       if (p0 == null) {
          this.b.onError(new Exception());
          return;
       }else {
          this.a.e[0] = p0;
          this.b.onNext(new Pair(Float.valueOf(0x3f75c28f), null));
          this.b.onComplete();
          return;
       }
    }
}
