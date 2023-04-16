package com.yxcorp.gifshow.activity.share.presenter.d;
import erd.o;
import com.yxcorp.gifshow.activity.share.presenter.PublishResourceDownloadManager;
import java.lang.Object;
import com.yxcorp.gifshow.model.CDNUrl;
import java.util.Objects;
import zw8.d;
import io.reactivex.g;
import brd.t;
import android.util.Pair;

public final class d implements o	// class@0013d9
{
    public final PublishResourceDownloadManager b;

    public void d(PublishResourceDownloadManager p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       d tb = this.b;
       Objects.requireNonNull(tb);
       return t.create(new d(tb, p0)).onErrorReturnItem(new Pair(null, ""));
    }
}
