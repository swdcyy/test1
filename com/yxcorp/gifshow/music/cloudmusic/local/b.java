package com.yxcorp.gifshow.music.cloudmusic.local.b;
import io.reactivex.g;
import com.yxcorp.gifshow.music.cloudmusic.local.d;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import brd.a0;
import voc.a0;
import bpb.g;
import com.yxcorp.gifshow.music.cloudmusic.local.c;
import erd.g;
import crd.b;
import java.lang.Throwable;
import brd.g;

public final class b implements g	// class@00202a
{
    public final d b;

    public void b(d p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       b tb = this.b;
       Objects.requireNonNull(tb);
       g og = new g(tb, p0);
       tb.r.load().R(og, c.b);
       return;
    }
}
