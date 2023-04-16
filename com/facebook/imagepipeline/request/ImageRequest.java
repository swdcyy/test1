package com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest$a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.lang.Object;
import android.net.Uri;
import ib.c;
import java.lang.String;
import db.a;
import java.util.Locale;
import db.b;
import java.util.Map;
import com.kuaishou.webkit.MimeTypeMap;
import uc.b;
import uc.d;
import uc.e;
import jd.c;
import java.io.File;
import uc.a;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import ab.d;
import com.facebook.cache.common.CacheKey;
import java.lang.Boolean;
import java.lang.Integer;
import com.facebook.imagepipeline.request.ImageRequest$RequestLevel;
import com.facebook.imagepipeline.common.Priority;
import dd.d;
import ab.d$b;

public class ImageRequest	// class@00114e
{
    public int a;
    public final ImageRequest$CacheChoice b;
    public final Uri c;
    public final int d;
    public File e;
    public final boolean f;
    public final boolean g;
    public final b h;
    public final d i;
    public final e j;
    public final a k;
    public final Priority l;
    public final ImageRequest$RequestLevel m;
    public final boolean n;
    public final boolean o;
    public final Boolean p;
    public final c q;
    public final d r;
    public final Boolean s;
    public final int t;
    public static boolean u;
    public static boolean v;
    public static final c w;

    static {
       ImageRequest.w = new ImageRequest$a();
    }
    public void ImageRequest(ImageRequestBuilder p0){
       super();
       this.b = p0.f;
       Uri uri = p0.i();
       this.c = uri;
       int i = -1;
       boolean b = true;
       if (uri == null) {
       }else if(c.k(uri)){
          i = 0;
       }else if(c.i(uri)){
          String path = uri.getPath();
          int i1 = path.lastIndexOf(46);
          String str = null;
          path = (i1 < 0 || i1 == (path.length() + i))? str: path.substring((i1 + b));
          if (path != null) {
             path = path.toLowerCase(Locale.US);
             String str1 = b.c.get(path);
             if (str1 == null) {
                str1 = b.a.getMimeTypeFromExtension(path);
             }
             str = str1;
             if (str == null) {
                str = a.a.get(path);
             }
          }
          if (a.a(str)) {
             i = 2;
          }else {
             i = 3;
          }
       }else if(c.h(uri)){
          i = 4;
       }else if(c.f(uri)){
          i = 5;
       }else if(c.j(uri)){
          i = 6;
       }else if(("data").equals(c.c(uri))){
          i = 7;
       }else if(("android.resource").equals(c.c(uri))){
          i = 8;
       }
       this.d = i;
       this.f = p0.g;
       this.g = p0.h;
       this.h = p0.e();
       this.i = p0.g();
       e uoe = (p0.h() == null)? e.a(): p0.h();
       this.j = uoe;
       this.k = p0.o;
       this.l = p0.i;
       this.m = p0.b;
       if (p0.k == null || !c.k(p0.a)) {
          b = false;
       }
       this.n = b;
       this.o = p0.l;
       this.p = p0.m;
       this.q = p0.f();
       this.r = p0.n;
       this.s = p0.p;
       this.t = p0.q;
       return;
    }
    public static ImageRequest a(File p0){
       ImageRequest imageRequest = (p0 == null)? null: ImageRequest.b(c.d(p0));
       return imageRequest;
    }
    public static ImageRequest b(Uri p0){
       ImageRequest imageRequest = (p0 == null)? null: ImageRequestBuilder.k(p0).a();
       return imageRequest;
    }
    public static ImageRequest c(String p0){
       ImageRequest imageRequest = (p0 == null || !p0.length())? null: ImageRequest.b(Uri.parse(p0));
       return imageRequest;
    }
    public a d(){
       return this.k;
    }
    public ImageRequest$CacheChoice e(){
       return this.b;
    }
    public boolean equals(Object p0){
       ImageRequest ta;
       boolean b = false;
       if (!p0 instanceof ImageRequest) {
          return b;
       }
       if (ImageRequest.u) {
          ta = this.a;
          ImageRequest a = p0.a;
          if (ta != null && (a != null && ta != a)) {
             return b;
          }
       }
       if (this.g != p0.g) {
          return b;
       }else if(this.n != p0.n){
          return b;
       }else if(this.o != p0.o){
          return b;
       }else if(d.a(this.c, p0.c) && (d.a(this.b, p0.b) && (d.a(this.e, p0.e) && (d.a(this.k, p0.k) && (d.a(this.h, p0.h) && (d.a(this.i, p0.i) && (d.a(this.l, p0.l) && (d.a(this.m, p0.m) && (d.a(this.p, p0.p) && (!d.a(this.s, p0.s) || !d.a(this.j, p0.j))))))))))){
          ta = this.q;
          CacheKey uCacheKey = null;
          CacheKey uCacheKey1 = (ta != null)? ta.a(): uCacheKey;
          ImageRequest q = p0.q;
          if (q != null) {
             uCacheKey = q.a();
          }
          if (!d.a(uCacheKey1, uCacheKey)) {
             return b;
          }else if(this.t == p0.t){
             b = true;
          }
       }
    label_00bc :
       return b;
    }
    public int f(){
       return this.t;
    }
    public b g(){
       return this.h;
    }
    public boolean h(){
       return this.g;
    }
    public int hashCode(){
       boolean v = ImageRequest.v;
       int i = 0;
       ImageRequest ta = (v)? this.a: null;
       if (ta == null) {
          ta = this.q;
          CacheKey uCacheKey = (ta != null)? ta.a(): null;
          Object[] objArray = new Object[15];
          objArray[i] = this.b;
          objArray[1] = this.c;
          objArray[2] = Boolean.valueOf(this.g);
          objArray[3] = this.k;
          objArray[4] = this.l;
          objArray[5] = this.m;
          objArray[6] = Boolean.valueOf(this.n);
          objArray[7] = Boolean.valueOf(this.o);
          objArray[8] = this.h;
          objArray[9] = this.p;
          objArray[10] = this.i;
          objArray[11] = this.j;
          objArray[12] = uCacheKey;
          objArray[13] = this.s;
          objArray[14] = Integer.valueOf(this.t);
          ta = d.b(objArray);
          if (v) {
             this.a = ta;
          }
       }
       return ta;
    }
    public ImageRequest$RequestLevel i(){
       return this.m;
    }
    public c j(){
       return this.q;
    }
    public int k(){
       ImageRequest ti = this.i;
       d b = (ti != null)? ti.b: 2048;
       return b;
    }
    public int l(){
       ImageRequest ti = this.i;
       d a = (ti != null)? ti.a: 2048;
       return a;
    }
    public Priority m(){
       return this.l;
    }
    public boolean n(){
       return this.f;
    }
    public d o(){
       return this.r;
    }
    public d p(){
       return this.i;
    }
    public e q(){
       return this.j;
    }
    public synchronized File r(){
       if (this.e == null) {
          this.e = new File(this.c.getPath());
       }
       return this.e;
    }
    public Uri s(){
       return this.c;
    }
    public int t(){
       return this.d;
    }
    public String toString(){
       d$b uob = d.c(this);
       uob.b("uri", this.c);
       uob.b("cacheChoice", this.b);
       uob.b("decodeOptions", this.h);
       uob.b("postprocessor", this.q);
       uob.b("priority", this.l);
       uob.b("resizeOptions", this.i);
       uob.b("rotationOptions", this.j);
       uob.b("bytesRange", this.k);
       uob.b("resizingAllowedOverride", this.s);
       uob.c("progressiveRenderingEnabled", this.f);
       uob.c("localThumbnailPreviewsEnabled", this.g);
       uob.b("lowestPermittedRequestLevel", this.m);
       uob.c("isDiskCacheEnabled", this.n);
       uob.c("isMemoryCacheEnabled", this.o);
       uob.b("decodePrefetches", this.p);
       uob.a("delayMs", this.t);
       return uob.toString();
    }
    public boolean u(){
       return this.n;
    }
    public boolean v(){
       return this.o;
    }
    public Boolean w(){
       return this.p;
    }
}
