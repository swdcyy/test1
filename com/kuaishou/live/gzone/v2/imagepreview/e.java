package com.kuaishou.live.gzone.v2.imagepreview.e;
import mm8.b;
import java.lang.Object;
import com.smile.gifshow.annotation.provider.v2.a;
import com.kuaishou.live.gzone.v2.imagepreview.GzoneImagePreviewFragment$a;
import com.kuaishou.live.gzone.v2.imagepreview.a;
import java.lang.String;
import com.smile.gifshow.annotation.provider.v2.Accessor;
import com.kuaishou.live.gzone.v2.imagepreview.b;
import com.kuaishou.live.gzone.v2.imagepreview.c;
import com.kuaishou.live.gzone.v2.imagepreview.d;
import java.lang.Class;
import mm8.a;

public final class e implements b	// class@001cca
{

    public void e(){
       super();
    }
    public void a(a p0,Object p1){
       p0.i("LIVE_GZONE_IMAGE_PREVIEW_PUBLISH_SUBJECT", new a(this, p1));
       p0.i("LIVE_GZONE_IMAGE_PREVIEW_CURRENT_POSITION", new b(this, p1));
       c uoc = new c(this, p1);
       String str = "LIVE_GZONE_IMAGE_PREVIEW_MODELS_FRAGMENT";
       try{
          p0.i(str, uoc);
          p0.h(GzoneImagePreviewFragment$a.class, new d(this, p1));
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public a b(Object p0){
       return a.a(this, p0);
    }
    public b init(){
       return a.b(this);
    }
}
