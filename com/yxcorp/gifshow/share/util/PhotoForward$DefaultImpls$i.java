package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$i;
import erd.o;
import java.lang.Object;
import kotlin.Pair;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import brd.w;
import kotlin.jvm.internal.a;
import wkd.b;
import mhc.y;
import mhc.a2;
import com.kwai.framework.model.feed.BaseFeed;
import java.io.File;
import brd.t;

public final class PhotoForward$DefaultImpls$i implements o	// class@001c8b
{
    public final boolean b;
    public final boolean c;

    public void PhotoForward$DefaultImpls$i(boolean p0,boolean p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, PhotoForward$DefaultImpls$i.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object obj = b.a(0x91df3e4);
          a.o(obj, "Singleton.get\(ForwardService::class.java\)");
          ot = obj.b().b(p0.getFirst(), p0.getSecond().getAbsolutePath(), this.b, this.c);
       }
       return ot;
    }
}
