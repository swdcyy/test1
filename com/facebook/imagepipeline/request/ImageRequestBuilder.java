package com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.lang.Object;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import uc.b;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import vc.h;
import vc.h$c;
import com.facebook.imagepipeline.common.Priority;
import com.facebook.imagepipeline.request.ImageRequest;
import android.net.Uri;
import uc.a;
import jd.c;
import uc.d;
import dd.d;
import uc.e;
import java.lang.Boolean;
import ib.c;
import java.lang.String;
import java.lang.Integer;
import com.facebook.imagepipeline.request.ImageRequestBuilder$BuilderException;
import ab.e;

public class ImageRequestBuilder	// class@001150
{
    public Uri a;
    public ImageRequest$RequestLevel b;
    public d c;
    public e d;
    public b e;
    public ImageRequest$CacheChoice f;
    public boolean g;
    public boolean h;
    public Priority i;
    public c j;
    public boolean k;
    public boolean l;
    public Boolean m;
    public d n;
    public a o;
    public Boolean p;
    public int q;

    public void ImageRequestBuilder(){
       super();
       this.a = null;
       this.b = ImageRequest$RequestLevel.FULL_FETCH;
       this.c = null;
       this.d = null;
       this.e = b.a();
       this.f = ImageRequest$CacheChoice.DEFAULT;
       this.g = h.J.a;
       this.h = false;
       this.i = Priority.HIGH;
       this.j = null;
       this.k = true;
       this.l = true;
       this.m = null;
       this.o = null;
       this.p = null;
    }
    public static ImageRequestBuilder d(ImageRequest p0){
       ImageRequestBuilder imageRequest = ImageRequestBuilder.k(p0.s());
       imageRequest.o(p0.g());
       imageRequest.m(p0.d());
       imageRequest.n(p0.e());
       imageRequest.p(p0.h());
       imageRequest.q(p0.i());
       imageRequest.r(p0.j());
       imageRequest.s(p0.n());
       imageRequest.u(p0.m());
       imageRequest.v(p0.p());
       imageRequest.t(p0.o());
       imageRequest.w(p0.q());
       imageRequest.m = p0.w();
       imageRequest.q = p0.f();
       return imageRequest;
    }
    public static ImageRequestBuilder j(int p0){
       return ImageRequestBuilder.k(c.e(p0));
    }
    public static ImageRequestBuilder k(Uri p0){
       ImageRequestBuilder imageRequest = new ImageRequestBuilder();
       imageRequest.x(p0);
       return imageRequest;
    }
    public ImageRequest a(){
       ImageRequestBuilder ta = this.a;
       if (ta == null) {
          throw new ImageRequestBuilder$BuilderException("Source must be set!");
       }
       if (c.j(ta)) {
          if (this.a.isAbsolute()) {
             if (!(this.a.getPath()).isEmpty()) {
                try{
                   Integer.parseInt((this.a.getPath()).substring(1));
                }catch(java.lang.NumberFormatException e0){
                   throw new ImageRequestBuilder$BuilderException("Resource URI path must be a resource id.");
                }
             }else {
                throw new ImageRequestBuilder$BuilderException("Resource URI must not be empty");
             }
          }else {
             throw new ImageRequestBuilder$BuilderException("Resource URI path must be absolute.");
          }
       }
       if (!c.f(this.a) || this.a.isAbsolute()) {
          return new ImageRequest(this);
       }else {
          throw new ImageRequestBuilder$BuilderException("Asset URI path must be absolute.");
       }
    }
    public ImageRequestBuilder b(){
       this.k = false;
       return this;
    }
    public ImageRequestBuilder c(){
       this.l = false;
       return this;
    }
    public b e(){
       return this.e;
    }
    public c f(){
       return this.j;
    }
    public d g(){
       return this.c;
    }
    public e h(){
       return this.d;
    }
    public Uri i(){
       return this.a;
    }
    public ImageRequestBuilder l(boolean p0){
       if (p0) {
          this.w(e.a());
          return this;
       }else {
          this.w(e.c());
          return this;
       }
    }
    public ImageRequestBuilder m(a p0){
       this.o = p0;
       return this;
    }
    public ImageRequestBuilder n(ImageRequest$CacheChoice p0){
       this.f = p0;
       return this;
    }
    public ImageRequestBuilder o(b p0){
       this.e = p0;
       return this;
    }
    public ImageRequestBuilder p(boolean p0){
       this.h = p0;
       return this;
    }
    public ImageRequestBuilder q(ImageRequest$RequestLevel p0){
       this.b = p0;
       return this;
    }
    public ImageRequestBuilder r(c p0){
       this.j = p0;
       return this;
    }
    public ImageRequestBuilder s(boolean p0){
       this.g = p0;
       return this;
    }
    public ImageRequestBuilder t(d p0){
       this.n = p0;
       return this;
    }
    public ImageRequestBuilder u(Priority p0){
       this.i = p0;
       return this;
    }
    public ImageRequestBuilder v(d p0){
       this.c = p0;
       return this;
    }
    public ImageRequestBuilder w(e p0){
       this.d = p0;
       return this;
    }
    public ImageRequestBuilder x(Uri p0){
       e.d(p0);
       this.a = p0;
       return this;
    }
}
