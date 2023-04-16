package com.yxcorp.gifshow.v3.previewer.i;
import io.reactivex.g;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import java.lang.Object;
import brd.v;
import com.yxcorp.gifshow.v3.previewer.s;
import crd.b;
import ok.h;
import lnc.b9;
import nwc.c;
import java.util.Map;
import java.lang.Class;
import t36.f;
import com.yxcorp.gifshow.v3.previewer.b;
import t36.f$a;

public final class i implements g	// class@0015a2
{
    public final PhotosEditPreviewV3Fragment b;

    public void i(PhotosEditPreviewV3Fragment p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       i tb = this.b;
       tb.R = b9.c(tb.R, new s(tb, p0));
       f.p0(tb.X0, c.class).s0(b.a);
    }
}
