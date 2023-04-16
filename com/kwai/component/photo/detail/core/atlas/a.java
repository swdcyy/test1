package com.kwai.component.photo.detail.core.atlas.a;
import tyc.v1;
import java.lang.Object;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.image.callercontext.a;
import dd.d;
import tyc.k;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import s0d.e;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.List;
import kp.r1;
import com.kuaishou.android.model.mix.ImageMeta$AtlasCoverSize;
import com.kwai.video.wayne.player.util.ViewUtil;
import s0d.f;
import java.util.Collection;
import xf6.d;
import s0d.a;
import com.facebook.imagepipeline.request.ImageRequest;
import java.lang.Number;
import com.yxcorp.gifshow.model.CDNUrl;
import wb5.d;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import vb5.a;
import jd.c;
import uc.d;
import java.util.ArrayList;
import jd5.e;
import jd5.d;
import kb.f;
import kb.c;
import com.kwai.component.photo.detail.core.atlas.a$a;
import ya.i;
import com.facebook.datasource.AbstractDataSource;
import kb.e;
import java.util.concurrent.Executor;

public class a implements v1	// class@000a1b
{
    public final QPhoto a;

    public void a(){
       super();
       this.a = null;
    }
    public void a(QPhoto p0){
       super();
       this.a = p0;
    }
    public int a(int p0){
       return p0;
    }
    public void b(a p0,d p1,int p2,k p3){
       List obj;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidFourRefs(p0, p1, Integer.valueOf(p2), p3, this, a.class, "4")) {
          return;
       }
       float f = this.f(p2);
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyThreeRefs(Integer.valueOf(p2), Float.valueOf(f), p1, this, a.class, "7");
          if (obj != PatchProxyResult.class) {
          }else {
          label_003e :
             uoa = this.a;
             if (uoa != null) {
                obj = r1.m0(uoa.mEntity, p2);
                ImageMeta$AtlasCoverSize[] uAtlasCoverS = r1.n0(this.a.mEntity);
                if (obj == null || (uAtlasCoverS != null && p2 < uAtlasCoverS.length)) {
                   p2 = ViewUtil.getScreenWidth();
                   int i = (int)((float)p2 / f);
                   f uof = f.x().q(obj);
                   if (!d.f()) {
                      p1 = null;
                   }
                   obj = uof.m(p1).o(p2, i).w();
                }
             }
             obj = null;
          }
       }else {
          goto label_003e ;
       }
       if (obj != null && obj.length) {
          this.g(obj, p0, p3);
       }
       return;
    }
    public float c(int p0){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "1");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       return this.f(p0);
    }
    public void d(k p0,int p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, uoa, "3")) {
          return;
       }
       uoa = this.a;
       if (uoa == null) {
          return;
       }
       int i = uoa.getHeight() / 8;
       int i1 = this.a.getWidth() / 8;
       List atlasPhotosC = this.a.getAtlasPhotosCdn(p1);
       if (i <= 0 || (i1 <= 0 || (atlasPhotosC != null && atlasPhotosC.size()))) {
          int i2 = 0;
          CDNUrl[] uCDNUrlArray = new CDNUrl[i2];
          ImageRequest[] imageRequest = d.b(atlasPhotosC.toArray(uCDNUrlArray));
          ImageRequest[] imageRequest1 = new ImageRequest[imageRequest.length];
          for (; i2 < imageRequest.length; i2 = i2 + 1) {
             ImageRequestBuilder imageRequest2 = ImageRequestBuilder.d(imageRequest[i2]);
             imageRequest2.r(new a(10));
             imageRequest2.v(new d(i, i1));
             imageRequest1[i2] = imageRequest2.a();
          }
          this.g(imageRequest1, null, p0);
       }
    label_0073 :
       return;
    }
    public void e(ImageRequest[] p0,int p1,int p2,k p3){
       if (PatchProxy.isSupport(a.class) && PatchProxy.applyVoidFourRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), p3, this, a.class, "5")) {
          return;
       }
       this.g(p0, null, p3);
       return;
    }
    public final float f(int p0){
       ImageMeta$AtlasCoverSize[] obj;
       float f1;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, uoa, "2");
          if (obj != PatchProxyResult.class) {
             return obj.floatValue();
          }
       }
       uoa = this.a;
       float f = 0x3f800000;
       if (uoa == null) {
          return f;
       }else {
          obj = r1.n0(uoa.mEntity);
          if (obj == null) {
             return f;
          }else if(obj[p0].mHeight){
             f1 = obj[p0].mWidth / obj[p0].mHeight;
          }else {
             f1 = 0x3f800000;
          }
          if (f1) {
             f = f1;
          }
          return f;
       }
    }
    public final void g(ImageRequest[] p0,a p1,k p2){
       int this;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, a.class, "6")) {
          return;
       }
       ArrayList uArrayList = new ArrayList((p0.length * 2));
       int len = p0.length;
       int i = 0;
       for (this = 0; this < len; this++) {
          uArrayList.add(new e(p0[this], p1));
       }
       len = p0.length;
       for (; i < len; i = i + 1) {
          uArrayList.add(new d(p0[i], p1));
       }
       f.b(uArrayList).c().f(new a$a(this, p2), i.d());
       return;
    }
}
