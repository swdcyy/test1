package com.yxcorp.gifshow.album.preview.e;
import z0.a;
import com.yxcorp.gifshow.album.preview.MediaPreviewFragment;
import java.lang.Object;
import java.lang.Void;
import j79.l0;
import j79.j;
import erd.g;
import crd.b;
import brd.t;

public final class e implements a	// class@001a50
{
    public final MediaPreviewFragment a;

    public void e(MediaPreviewFragment p0){
       this.a = p0;
    }
    public final Object apply(Object p0){
       e ta = this.a;
       return ta.i.G.subscribe(new j(ta));
    }
}
