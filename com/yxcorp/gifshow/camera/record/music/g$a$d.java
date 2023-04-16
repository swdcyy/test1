package com.yxcorp.gifshow.camera.record.music.g$a$d;
import io.reactivex.g;
import com.yxcorp.gifshow.activity.GifshowActivity;
import com.kuaishou.android.model.music.Music;
import com.kwai.feature.post.api.music.data.MusicSource;
import android.content.Intent;
import java.lang.Object;
import brd.v;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import tkd.b;
import tkd.d;
import a46.c;
import com.yxcorp.gifshow.camera.record.music.g$a$d$a;
import d46.b;
import a46.d;

public final class g$a$d implements g	// class@000e7a
{
    public final GifshowActivity b;
    public final Music c;
    public final MusicSource d;
    public final Intent[] e;

    public void g$a$d(GifshowActivity p0,Music p1,MusicSource p2,Intent[] p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void subscribe(v p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, g$a$d.class, "1")) {
          return;
       }
       a.p(p0, "emitter");
       d.a(-93013550).Wj(this.b, this.c, this.d, new g$a$d$a(this, p0), false, false);
       return;
    }
}
