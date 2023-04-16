package com.yxcorp.gifshow.share.util.PhotoForward$DefaultImpls$e;
import erd.o;
import com.yxcorp.gifshow.share.OperationModel;
import java.lang.Object;
import android.graphics.Bitmap;
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
import brd.t;

public final class PhotoForward$DefaultImpls$e implements o	// class@001c87
{
    public final OperationModel b;
    public final boolean c;
    public final boolean d;

    public void PhotoForward$DefaultImpls$e(OperationModel p0,boolean p1,boolean p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public Object apply(Object p0){
       t ot = PatchProxy.applyOneRefs(p0, this, PhotoForward$DefaultImpls$e.class, "1");
       if (ot != PatchProxyResult.class) {
       }else {
          a.p(p0, "it");
          Object obj = b.a(0x91df3e4);
          a.o(obj, "Singleton.get\(ForwardService::class.java\)");
          BaseFeed uBaseFeed = this.b.i();
          a.m(uBaseFeed);
          ot = obj.b().a(uBaseFeed, p0, this.c, this.d);
       }
       return ot;
    }
}
