package com.kwai.component.imageextension.util.ImageMetaImagePrefetchUtil;
import java.lang.Object;
import com.kuaishou.android.model.mix.ImageMeta;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import com.kuaishou.android.model.mix.ImageMeta$Atlas;
import ekd.j;
import java.lang.Math;
import java.util.List;
import com.kuaishou.android.model.mix.ImageMetaExt;
import java.util.Collection;
import ekd.q;
import s0d.b;
import java.lang.Iterable;
import com.facebook.imagepipeline.request.ImageRequest;
import com.yxcorp.image.callercontext.a$a;
import com.yxcorp.image.callercontext.a;
import com.yxcorp.image.callercontext.SubSolution;
import com.yxcorp.image.callercontext.UpBizFt;
import com.yxcorp.image.callercontext.ImageSource;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.common.Priority;
import kb.c;

public final class ImageMetaImagePrefetchUtil	// class@000987
{

    public void ImageMetaImagePrefetchUtil(){
       super();
    }
    public static void prefetchAtlas(ImageMeta p0,String p1,int p2,int p3){
       if (PatchProxy.isSupport(ImageMetaImagePrefetchUtil.class) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), Integer.valueOf(p3), null, ImageMetaImagePrefetchUtil.class, "1")) {
          return;
       }
       ImageMeta mAtlas = p0.mAtlas;
       if (mAtlas != null && !j.h(mAtlas.mList)) {
          int i = Math.min(p0.mAtlas.mList.length, (p3 + p2));
          while (p2 < i) {
             List atlasPhotoCd = ImageMetaExt.getAtlasPhotoCdn(p0, p2);
             if (!q.f(atlasPhotoCd)) {
                ImageRequest[] imageRequest = b.a(b.e(atlasPhotoCd));
                if (imageRequest.length > 0) {
                   a$a uoa = a.d();
                   uoa.b(":ks-components:image-extension");
                   uoa.e(SubSolution.Video);
                   uoa.f(UpBizFt.FT_Feed);
                   uoa.d(ImageSource.FEED_COVER_PREFETCH);
                   Fresco.getImagePipeline().prefetchToDiskCache(imageRequest[0], uoa.a(), Priority.LOW);
                }
             }
             p2++;
          }
       }
       return;
    }
}
