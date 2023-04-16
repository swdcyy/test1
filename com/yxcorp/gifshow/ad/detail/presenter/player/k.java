package com.yxcorp.gifshow.ad.detail.presenter.player.k;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import yx.j0;

public final class k implements g	// class@001685
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final void accept(Object p0){
       Object[] objArray = new Object[0];
       j0.f("SourcePhotoDownload", "生产插件下载失败： "+p0.getMessage(), objArray);
    }
}
