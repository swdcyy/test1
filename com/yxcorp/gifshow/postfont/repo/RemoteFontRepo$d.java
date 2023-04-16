package com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$d;
import erd.g;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo;
import com.yxcorp.gifshow.postfont.repo.RemoteFontRepo$b;
import java.lang.Object;
import com.kwai.middleware.resourcemanager.cache.type.Result;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.util.List;

public final class RemoteFontRepo$d implements g	// class@0010a7
{
    public final RemoteFontRepo b;
    public final RemoteFontRepo$b c;

    public void RemoteFontRepo$d(RemoteFontRepo p0,RemoteFontRepo$b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RemoteFontRepo$d.class, "1")) {
       }else {
          ArrayList uArrayList = new ArrayList();
          a.o(p0, "it");
          this.b.e(p0, uArrayList, Integer.valueOf(0));
          p0 = this.c;
          if (p0 != null) {
             p0.a(uArrayList);
          }
       }
       return;
    }
}
