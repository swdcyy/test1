package com.kuaishou.merchant.live.basic.effect.a;
import kb.b;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.String;
import brd.v;
import kb.c;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.merchant.live.MerchantLiveLogBiz;
import p74.a;
import o74.a;
import brd.g;
import com.yxcorp.utility.f;
import brd.t;
import n14.b;
import erd.g;
import crd.b;

public class a extends b	// class@00188e
{
    public final ImagePipeline a;
    public final ImageRequest b;
    public final String c;
    public final v d;

    public void a(ImagePipeline p0,ImageRequest p1,String p2,v p3){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       super();
    }
    public void onFailureImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       a.t(MerchantLiveLogBiz.MAGIC_EFFECT, "ImageResUtil", "return empty url for image: download failed", "url", this.c);
       this.d.onNext("");
       this.d.onComplete();
       return;
    }
    public void onNewResultImpl(c p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       f.d().e(10).subscribe(new b(this.a, this.b, this.c, this.d));
       return;
    }
}
