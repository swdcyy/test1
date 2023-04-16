package com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$f;
import erd.o;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.util.List;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.lang.Integer;

public final class RemoteFontRepo$f implements o	// class@0010a9
{
    public final RemoteFontRepo b;

    public void RemoteFontRepo$f(RemoteFontRepo p0){
       this.b = p0;
       super();
    }
    public Object apply(Object p0){
       ArrayList uArrayList = PatchProxy.applyOneRefs(p0, this, RemoteFontRepo$f.class, "1");
       if (uArrayList != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          uArrayList = new ArrayList();
          this.b.e(p0, uArrayList, Integer.valueOf(0));
       }
       return uArrayList;
    }
}
