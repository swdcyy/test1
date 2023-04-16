package com.yxcorp.gifshow.v3.previewer.p0;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.previewer.VideoEditPreviewV3Fragment;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.v3.previewer.t0;
import crd.b;
import ok.h;
import lnc.b9;
import nwc.c;
import java.util.Map;
import java.lang.Class;
import t36.f;
import com.yxcorp.gifshow.v3.previewer.b;
import t36.f$a;

public final class p0 implements g	// class@0015e8
{
    public final VideoEditPreviewV3Fragment b;

    public void p0(VideoEditPreviewV3Fragment p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       p0 tb = this.b;
       tb.v1 = b9.c(tb.v1, new t0(tb, p0));
       f.p0(tb.R, c.class).s0(b.a);
    }
}
