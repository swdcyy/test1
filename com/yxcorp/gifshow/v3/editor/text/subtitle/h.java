package com.yxcorp.gifshow.v3.editor.text.subtitle.h;
import erd.o;
import com.yxcorp.gifshow.v3.editor.text.subtitle.k;
import java.lang.Object;
import njd.a;
import java.util.Objects;
import faa.a;
import java.lang.String;
import q87.c;
import dvc.x;
import kuaishou.perf.page.impl.d;
import evc.a;
import brd.t;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.v3.editor.text.subtitle.g;

public final class h implements o	// class@00149b
{
    public final k b;

    public void h(k p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       h tb = this.b;
       Objects.requireNonNull(tb);
       Object[] objArray = new Object[0];
       a.D().s("SubtitleAudioAssetUploadHelper", "upload audio complete", objArray);
       d.d(x.a).h(x.c);
       d.d(x.a).g(x.d);
       a mDelayMs = p0.a().mDelayMs;
       tb.a = p0.a().a();
       return t.just(p0).delay(mDelayMs, TimeUnit.MILLISECONDS).flatMap(new g(mDelayMs));
    }
}
