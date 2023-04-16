package com.yxcorp.gifshow.v3.previewer.t0;
import ok.h;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import brd.v;
import java.lang.Object;
import java.lang.Void;
import lwc.p2;
import java.util.Objects;
import q14.n;
import erd.g;
import crd.b;
import brd.t;

public final class t0 implements h	// class@00160d
{
    public final VideoEditPreviewV3Fragment b;
    public final v c;

    public void t0(VideoEditPreviewV3Fragment p0,v p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       t0 tc = this.c;
       Objects.requireNonNull(tc);
       return this.b.I.subscribe(new p2(tc), new n(tc));
    }
}
