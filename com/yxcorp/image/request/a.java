package com.yxcorp.image.request.a;
import s0d.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.yxcorp.gifshow.model.CDNUrl;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import s0d.e;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest$CacheChoice;
import java.lang.Math;
import android.net.Uri;
import com.yxcorp.image.request.KwaiImageBuilderException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import s0d.d;
import uc.b;
import uc.c;
import jd.c;
import hd.c;
import e0d.h;
import android.graphics.Bitmap$Config;
import com.yxcorp.image.request.cdntransform.c;
import java.util.Objects;
import t0d.a;
import com.yxcorp.image.request.cdntransform.IImageCDNTransformer;
import java.lang.CharSequence;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Set;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import android.text.TextUtils;
import java.io.File;

public class a extends a	// class@001a23
{
    public CDNUrl i;
    public String j;
    public Uri k;
    public boolean l;

    public void a(){
       super();
       this.l = false;
    }
    public void a(ImageRequestBuilder p0){
       super(p0);
       this.l = false;
    }
    public void a(a p0){
       super(p0);
       this.l = false;
    }
    public static a r(CDNUrl p0){
       a obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.w(p0);
       return obj;
    }
    public static a s(e p0){
       a obj = PatchProxy.applyOneRefs(p0, null, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a(ImageRequestBuilder.d(p0)).f(p0.e());
       obj.g(Math.max(p0.z(), p0.y()));
       obj.y(p0.s());
       return obj;
    }
    public static a t(Uri p0){
       a obj = PatchProxy.applyOneRefs(p0, null, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.y(p0);
       return obj;
    }
    public static a u(String p0){
       a obj = PatchProxy.applyOneRefs(p0, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new a();
       obj.z(p0);
       return obj;
    }
    public a i(boolean p0){
       this.x(p0);
       return this;
    }
    public e q(){
       Uri uri;
       Bitmap$Config uConfig;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       a uoa = a.class;
       Object[] objArray = null;
       a obj = PatchProxy.apply(objArray, this, uoa, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       a uoa1 = null;
       boolean b = true;
       if (!PatchProxy.applyVoid(objArray, this, uoa, "10")) {
          int i1 = (this.i != null)? 1: 0;
          if (this.j != null) {
             i1 = i1 + 1;
          }
          if (this.k != null) {
             i1 = i1 + 1;
          }
          if (i1 <= b) {
             if (i1 <= 0) {
                throw new KwaiImageBuilderException("No image source");
             }
          }else {
             throw new KwaiImageBuilderException("More than one image source");
          }
       }
       obj = this.i;
       if (obj != null) {
          a tb = this.b;
          String specialSizeU = (tb > null)? obj.getSpecialSizeUrl(tb): obj.getUrl();
          try{
             uri = this.v(specialSizeU);
          }catch(java.lang.Exception e0){
             throw new KwaiImageBuilderException("cdn url error "+uri, e0);
          }
       }else {
          obj = this.j;
          uri = (obj != null)? this.v(obj): this.k;
       }
       if (uri != null) {
          this.a.x(uri);
          obj = this.a;
          d uod = PatchProxy.applyOneRefs(obj, this, uoa, "7");
          if (uod != patchProxyRe) {
          }else {
             uod = new d();
             b uob = obj.e();
             if (uob != null) {
                uod.e(uob);
             }
          }
          uod.l = "hello-world";
          if (this.l != null) {
             uod.d(b);
             uod.c(b);
             uConfig = 1;
          }else {
             uConfig = null;
          }
          if (!this.a.f() instanceof c && h.j()) {
             uod.b(Bitmap$Config.RGB_565);
             uConfig = 1;
          }
          if (uConfig != null) {
             this.a.o(uod.a());
          }
          if (this.g != null) {
             uoa1 = 1;
          }
          if (uoa1) {
             Uri uri1 = this.a.i();
             c uoc = this.c();
             Uri uri2 = PatchProxy.applyTwoRefs(uri1, uoc, this, a.class, "2");
             if (uri2 != patchProxyRe) {
             }else {
                uoa1 = this.f;
                Objects.requireNonNull(uoa1);
                Map$Entry obj1 = PatchProxy.applyOneRefs(uri1, uoa1, a.class, "1");
                if (obj1 != patchProxyRe) {
                   objArray = obj1;
                }else {
                   String lastPathSegm = uri1.getLastPathSegment();
                   if (lastPathSegm != null) {
                      int i = lastPathSegm.lastIndexOf(".");
                      if (i >= 0) {
                         lastPathSegm = lastPathSegm.substring((i + b));
                      label_0121 :
                         if (a.f.matcher(lastPathSegm).find()) {
                            Iterator iterator = a.g.entrySet().iterator();
                            while (iterator.hasNext()) {
                               obj1 = iterator.next();
                               Pattern key = obj1.getKey();
                               IImageCDNTransformer value = obj1.getValue();
                               if (key.matcher(uri1.toString()).find()) {
                                  objArray = value;
                                  break ;
                               }
                            }
                         }
                      }
                   }
                   lastPathSegm = "";
                   goto label_0121 ;
                }
                if (objArray != null) {
                   uri1 = objArray.a(uri1, uoc);
                }
                uri2 = uri1;
             }
             this.a.x(uri2);
          }
          return new e(this);
       }else {
          throw new KwaiImageBuilderException("no valid uri");
       }
    }
    public final Uri v(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       Uri uri = Uri.parse(p0);
       obj = uri.getFragment();
       if (!TextUtils.isEmpty(obj)) {
          File uFile = new File(obj);
          if (uFile.exists() && uFile.length() > 0) {
             uri = Uri.fromFile(uFile);
          }
       }
       return uri;
    }
    public a w(CDNUrl p0){
       this.i = p0;
       this.k = null;
       this.j = null;
       return this;
    }
    public a x(boolean p0){
       this.l = p0;
       return this;
    }
    public a y(Uri p0){
       this.k = p0;
       this.i = null;
       this.j = null;
       return this;
    }
    public a z(String p0){
       this.j = p0;
       this.i = null;
       this.k = null;
       return this;
    }
}
