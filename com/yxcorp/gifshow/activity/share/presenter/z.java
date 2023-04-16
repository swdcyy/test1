package com.yxcorp.gifshow.activity.share.presenter.z;
import erd.o;
import com.yxcorp.gifshow.activity.share.presenter.c0;
import com.kwai.feature.post.api.feature.cover.PhotoEditInfo;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.activity.GifshowActivity;
import brd.t;
import com.yxcorp.gifshow.activity.share.presenter.PublishResourceDownloadManager;
import t45.d;
import brd.z;
import com.yxcorp.gifshow.activity.share.presenter.a0;

public final class z implements o	// class@001462
{
    public final c0 b;
    public final PhotoEditInfo c;

    public void z(c0 p0,PhotoEditInfo p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object apply(Object p0){
       z tb = this.b;
       return tb.U.a(tb.G, tb.W8(), tb.x, p0.getCustomUploadCoverUrls()).observeOn(d.a).map(new a0(tb, this.c, p0));
    }
}
