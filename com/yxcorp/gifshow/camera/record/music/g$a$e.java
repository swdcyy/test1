package com.yxcorp.gifshow.camera.record.music.g$a$e;
import io.reactivex.g;
import com.kuaishou.android.model.music.Music;
import t16.a;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.Pair;
import java.lang.Float;
import brd.g;
import java.io.File;
import kqb.b0;
import qkd.b;
import j8c.a;
import com.yxcorp.gifshow.camera.record.music.g;
import nsd.r0;
import java.util.Arrays;
import q87.c;
import wkd.b;
import com.yxcorp.gifshow.music.utils.a;
import com.yxcorp.gifshow.camera.record.music.g$a$e$a;
import com.yxcorp.gifshow.model.CDNUrl;
import com.yxcorp.gifshow.music.utils.a$a;

public final class g$a$e implements g	// class@000e7c
{
    public final Music b;
    public final a c;

    public void g$a$e(Music p0,a p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a$e.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       Object[] obj = null;
       p0.onNext(new Pair(Float.valueOf(0), obj));
       File uFile = b0.h(this.b);
       if (b.S(uFile)) {
          p0.onNext(new Pair(Float.valueOf(0x3f733333), obj));
          p0.onComplete();
          Object[] objArray = new Object[]{uFile.getAbsolutePath()};
          a.m(uFile);
          String str = String.format("use cached file file=%s", Arrays.copyOf(objArray, 1));
          a.o(str, "java.lang.String.format\(format, *args\)");
          obj = new Object[0];
          a.D().w(g.d, str, obj);
       }else {
          g$a$e tb = this.b;
          b.a(-905856758).i(this.c, tb, tb.mUrl, tb.mUrls, new g$a$e$a(p0));
       }
       return;
    }
}
