package com.yxcorp.gifshow.v3.previewer.y0;
import ok.h;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import java.lang.Void;
import brd.a0;
import lwc.d;
import lwc.h2;
import erd.a;
import erd.g;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.v3.previewer.s0;
import crd.b;

public final class y0 implements h	// class@001617
{
    public final VideoEditPreviewV3Fragment b;
    public final boolean c;

    public void y0(VideoEditPreviewV3Fragment p0,boolean p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       y0 tb = this.b;
       return tb.b1.e().n(new h2(tb, this.c)).R(Functions.d(), s0.b);
    }
}
