package com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$c;
import com.yxcorp.gifshow.tti.module.ResourceDownloadInitModule$a;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;

public final class ResourceDownloadInitModule$c	// class@001dc9
{
    public final ResourceDownloadInitModule$a a;
    public final RequestTiming b;

    public void ResourceDownloadInitModule$c(ResourceDownloadInitModule$a p0,RequestTiming p1){
       a.p(p0, "config");
       a.p(p1, "requestTiming");
       super();
       this.a = p0;
       this.b = p1;
    }
}
