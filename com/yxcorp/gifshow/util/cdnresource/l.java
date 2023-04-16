package com.yxcorp.gifshow.util.cdnresource.l;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.like.resource.SearchLikeResourceConfig$a;
import com.yxcorp.gifshow.util.cdnresource.m;
import java.util.Objects;
import wkd.b;
import j80.c;
import java.lang.String;
import java.io.File;
import com.yxcorp.download.DownloadManager;
import brd.t;
import qkd.b;
import com.yxcorp.gifshow.util.cdnresource.k;
import pnc.q;

public final class l implements o	// class@001f74
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       t ot;
       k b = m.b;
       Objects.requireNonNull(b);
       File uFile = new File(b.a(-1504323719).j("like_resource_search"), p0.mUniqId);
       File uFile1 = new File(uFile, "keymap.json");
       DownloadManager.C("feed_like_source", null);
       if (uFile.exists() && uFile1.exists()) {
          ot = t.just(uFile);
       }else {
          b.m(uFile);
          ot = b.a(p0.mUrl, uFile);
       }
       return ot.map(new q(p0));
    }
}
