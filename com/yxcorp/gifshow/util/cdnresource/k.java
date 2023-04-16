package com.yxcorp.gifshow.util.cdnresource.k;
import java.lang.Object;
import java.lang.String;
import java.io.File;
import brd.t;
import pnc.k;
import io.reactivex.g;
import pnc.l;
import erd.o;
import com.yxcorp.gifshow.util.v;
import wkd.b;
import j80.c;
import com.yxcorp.download.DownloadManager;
import qkd.b;
import java.lang.StringBuilder;
import com.yxcorp.utility.Log;
import java.util.Objects;

public class k	// class@001f73
{
    public int a;
    public boolean b;

    public void k(){
       super();
    }
    public final t a(String p0,File p1){
       return t.create(new k(this, p0, p1)).map(new l(p1));
    }
    public boolean b(){
       return this.b;
    }
    public t c(String p0){
       File uFile = new File(b.a(-1504323719).j("like_resource"), v.h(p0));
       DownloadManager.C("feed_like_source", null);
       File uFile1 = new File(uFile, "keymap.json");
       if (uFile.exists() && uFile1.exists()) {
          return t.just(uFile);
       }
       b.m(uFile);
       return this.a(p0, uFile);
    }
    public void d(boolean p0){
       this.b = p0;
    }
    public void e(){
       Log.g("FeedResourceManagerImpl", "touchResumeTask : resourceDownload : sDownloadId "+this.a+"£¬sPreparingResource = "+this.b);
       if (this.b != null && this.a != null) {
          Objects.requireNonNull(DownloadManager.n());
          DownloadManager.n().F(this.a);
       }
       return;
    }
}
