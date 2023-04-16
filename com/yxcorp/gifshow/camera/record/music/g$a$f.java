package com.yxcorp.gifshow.camera.record.music.g$a$f;
import io.reactivex.g;
import android.content.Intent;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.io.FileNotFoundException;
import java.lang.Throwable;
import brd.g;
import java.io.Serializable;
import ekd.j0;
import com.kuaishou.android.model.music.Music;
import android.net.Uri;
import com.yxcorp.gifshow.camera.record.music.g;
import com.yxcorp.gifshow.camera.record.music.g$a;
import com.yxcorp.gifshow.music.utils.m;
import com.yxcorp.gifshow.camera.record.music.n$d;
import java.io.File;
import com.yxcorp.gifshow.media.util.c;
import kotlin.Pair;
import java.lang.Float;
import java.lang.Exception;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import j8c.a;
import w46.b;

public final class g$a$f implements g	// class@000e7d
{
    public final Intent[] b;
    public final boolean c;

    public void g$a$f(Intent[] p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       Music music;
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a$f.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       object oobject = this.b[0];
       if (oobject == null) {
          p0.onError(new FileNotFoundException());
          return;
       }else {
          try{
             music = j0.e(oobject, "music");
             if (music != null) {
                Uri data = oobject.getData();
                String path = (data != null)? data.getPath(): null;
                if (path != null) {
                   g$a e = g.e;
                   e.g(oobject, music);
                   e.f(oobject, music);
                   if (this.c != null) {
                      m.i(music);
                   }
                   e.h(oobject, music);
                   data = oobject.getData();
                   a.m(data);
                   a.o(data, "data.data!!");
                   path = data.getPath();
                   a.m(path);
                   oobject.putExtra("duration", (long)c.i(new File(path).getAbsolutePath()));
                   p0.onNext(new Pair(Float.valueOf(0x3f800000), oobject));
                label_0087 :
                   p0.onComplete();
                   return;
                }
             }
             p0.onError(new FileNotFoundException());
             goto label_0087 ;
          }catch(java.lang.Exception e0){
             p0.onError(e0);
             ExceptionHandler.handleCaughtException(new Exception("Download music resources failed", e0));
             a.D().e(g.d, "Download music error", e0);
             return;
          }
       }
    }
}
