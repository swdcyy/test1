package com.yxcorp.gifshow.albumwrapper.imagecrop.d;
import erd.g;
import com.yxcorp.gifshow.albumwrapper.imagecrop.ImageSelectSupplier;
import m26.a;
import java.lang.Object;
import r16.d;
import z79.e;
import com.yxcorp.gifshow.activity.GifshowActivity;
import n3d.a;

public final class d implements g	// class@001b66
{
    public final ImageSelectSupplier b;
    public final int c;
    public final a d;

    public void d(ImageSelectSupplier p0,int p1,a p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final void accept(Object p0){
       d tb = this.b;
       p0.WF(tb.m, this.c, this.d, new e(tb));
    }
}
