package com.yxcorp.gifshow.share.post.b;
import erd.g;
import android.os.Bundle;
import java.lang.Object;
import android.content.Intent;
import java.lang.String;
import com.kwai.feature.post.api.music.data.MusicSource;
import java.io.Serializable;
import com.kwai.plugin.dva.feature.core.hook.SerializableHook;
import a46.b;
import com.yxcorp.gifshow.util.LoadPolicy;
import java.lang.Class;
import brd.a0;
import lnc.y6;
import qic.c;
import com.yxcorp.gifshow.share.post.e;
import crd.b;

public final class b implements g	// class@001c36
{
    public final Bundle b;

    public void b(Bundle p0){
       this.b = p0;
    }
    public final void accept(Object p0){
       b tb = this.b;
       p0.putExtra("live_on", false);
       SerializableHook.putExtra(p0, "music_source", MusicSource.DETAIL);
       p0.putExtra("camera_page_source", 9);
       if (tb != null) {
          p0.putExtras(tb);
       }
       y6.s(b.class, LoadPolicy.DIALOG).R(new c(p0), e.b);
       return;
    }
}
