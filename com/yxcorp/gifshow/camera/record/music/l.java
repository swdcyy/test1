package com.yxcorp.gifshow.camera.record.music.l;
import erd.g;
import com.yxcorp.gifshow.camera.record.music.n;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.lang.Object;
import com.kuaishou.android.model.music.Music;
import java.util.Objects;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.yxcorp.gifshow.camera.record.base.d;
import yf9.b;
import com.yxcorp.gifshow.camera.record.base.b;
import j8c.a;
import q87.c;
import tkd.b;
import tkd.d;
import a46.c;
import vf9.u0;
import com.yxcorp.gifshow.activity.GifshowActivity;
import d46.b;
import a46.d;

public final class l implements g	// class@000e84
{
    public final n b;
    public final boolean c;
    public final MusicSource d;

    public void l(n p0,boolean p1,MusicSource p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       l ol = this;
       l b = ol.b;
       l c = ol.c;
       l d = ol.d;
       Music music = p0;
       Objects.requireNonNull(b);
       if (!PatchProxy.isSupport(n.class) || !PatchProxy.applyVoidThreeRefs(music, Boolean.valueOf(c), d, b, n.class, "31")) {
          int i = 0;
          if (b.d.d(b.b).a != null) {
             Object[] objArray = new Object[i];
             a.D().w("MusicView", "onMusicResponseSuccess but music panel is showing", objArray);
          }else {
             b uob = d.a(-93013550);
             d e = b.e;
             u0 ou0 = new u0(b, music, c);
             boolean b1 = (b.L != MusicSource.MAGIC_FACE && b.e1 != null)? true: false;
             uob.Wj(e, music, d, ou0, b1, true);
          }
       }
       return;
    }
}
