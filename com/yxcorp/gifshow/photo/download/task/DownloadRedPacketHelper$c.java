package com.yxcorp.gifshow.photo.download.task.DownloadRedPacketHelper$c;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.photo.download.model.config.NebulaDownloadRedPacketConfig;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.photo.download.task.l;
import io.reactivex.g;
import brd.t;

public final class DownloadRedPacketHelper$c implements o	// class@000ee9
{
    public static final DownloadRedPacketHelper$c b;

    static {
       DownloadRedPacketHelper$c.b = new DownloadRedPacketHelper$c();
    }
    public void DownloadRedPacketHelper$c(){
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, DownloadRedPacketHelper$c.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "config");
          ot = t.create(new l(p0));
       }
       return ot;
    }
}
