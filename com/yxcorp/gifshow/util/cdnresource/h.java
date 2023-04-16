package com.yxcorp.gifshow.util.cdnresource.h;
import erd.o;
import com.yxcorp.gifshow.util.cdnresource.j;
import java.lang.Object;
import com.yxcorp.gifshow.loading.PullDownActivityResourceConfig;
import java.lang.String;
import brd.t;
import com.yxcorp.gifshow.util.cdnresource.k;
import pnc.i;

public final class h implements o	// class@001f70
{
    public final j b;

    public void h(j p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return this.b.b.c(p0.mResourceUrl).map(new i(p0));
    }
}
