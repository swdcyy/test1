package com.yxcorp.gifshow.v3.previewer.s;
import ok.h;
import com.yxcorp.gifshow.v3.previewer.PhotosEditPreviewV3Fragment;
import brd.v;
import java.lang.Object;
import java.lang.Void;
import lwc.x;
import java.util.Objects;
import q14.n;
import erd.g;
import crd.b;
import brd.t;

public final class s implements h	// class@00160c
{
    public final PhotosEditPreviewV3Fragment b;
    public final v c;

    public void s(PhotosEditPreviewV3Fragment p0,v p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       s tc = this.c;
       Objects.requireNonNull(tc);
       return this.b.Y0.subscribe(new x(tc), new n(tc));
    }
}
