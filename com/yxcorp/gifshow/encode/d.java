package com.yxcorp.gifshow.encode.d;
import erd.o;
import com.yxcorp.gifshow.encode.i;
import com.kwai.feature.post.api.feature.kuaishan.model.KSAssetExportInfo;
import com.yxcorp.gifshow.encode.i$b;
import java.lang.Object;
import com.yxcorp.gifshow.models.QMedia;
import java.util.Map;
import com.kwai.video.minecraft.model.nano.Minecraft$WesterosFaceMagicParam;
import com.yxcorp.gifshow.encode.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import pca.a;
import io.reactivex.g;
import t45.d;
import brd.z;
import pca.j;
import erd.g;

public final class d implements o	// class@000d16
{
    public final i b;
    public final KSAssetExportInfo c;
    public final i$b d;
    public final boolean e;

    public void d(i p0,KSAssetExportInfo p1,i$b p2,boolean p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final Object apply(Object p0){
       t ot;
       d tb = this.b;
       d te = this.e;
       int i = 1;
       tb.d = tb.d + i;
       Object obj = tb.h.get(p0.path);
       KSAssetExportInfo mScale = this.c.mScale;
       g og = new g(tb, this.d);
       i oi = i.class;
       if (PatchProxy.isSupport(oi)) {
          Object[] objArray = new Object[]{p0,Float.valueOf(mScale),obj,og,Boolean.valueOf(te)};
          ot = PatchProxy.apply(objArray, tb, oi, "1");
          if (ot != PatchProxyResult.class) {
          label_005e :
             return ot.observeOn(d.c).doOnNext(new j(tb, p0));
          }
       }
       a uoa = new a(tb, p0, te, mScale, obj, og);
       ot = t.create(v9);
       goto label_005e ;
    }
}
