package com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$c;
import erd.o;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;

public final class RemoteFontRepo$c implements o	// class@0010a6
{
    public final RemoteFontRepo b;
    public final Integer c;

    public void RemoteFontRepo$c(RemoteFontRepo p0,Integer p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, RemoteFontRepo$c.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uArrayList = new ArrayList();
          this.b.e(p0, uArrayList, this.c);
       }
       return uArrayList;
    }
}
