package com.yxcorp.gifshow.v3.previewer.ktv.d0;
import ok.h;
import com.yxcorp.gifshow.v3.previewer.ktv.KtvSongEditPreviewFragment;
import java.lang.Object;
import java.lang.Void;
import mwc.r0;
import com.kuaishou.live.common.core.basic.tools.h;
import erd.g;
import crd.b;
import brd.t;

public final class d0 implements h	// class@0015ba
{
    public final KtvSongEditPreviewFragment b;

    public void d0(KtvSongEditPreviewFragment p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       d0 tb = this.b;
       r0 or0 = new r0(tb);
       return tb.l2.subscribe(or0, h.b);
    }
}
