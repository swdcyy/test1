package com.yxcorp.gifshow.photoad.l;
import erd.g;
import java.lang.Object;
import java.lang.String;
import wkd.b;
import com.yxcorp.gifshow.retrofit.service.KwaiAdService;
import brd.t;
import io.reactivex.internal.functions.Functions;
import com.yxcorp.gifshow.photoad.m;
import crd.b;

public final class l implements g	// class@000f99
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final void accept(Object p0){
       b.a(0x311225af).collectAdLog(p0, "gzip2").subscribe(Functions.d(), m.b);
    }
}
