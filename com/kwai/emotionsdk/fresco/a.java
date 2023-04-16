package com.kwai.emotionsdk.fresco.a;
import kk5.a;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import kk5.b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.model.CDNUrl;
import android.net.Uri;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;
import uc.c;
import android.graphics.Bitmap$Config;
import uc.b;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.io.File;

public class a extends a	// class@000dad
{
    public CDNUrl f;
    public String g;
    public Uri h;

    public void a(){
       super();
    }
    public void a(ImageRequestBuilder p0){
       super(p0);
    }
    public void a(a p0){
       super(p0);
    }
    public b a(){
       Uri uri;
       a uoa = a.class;
       Object[] objArray = null;
       Bitmap$Config obj = PatchProxy.apply(objArray, this, uoa, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!PatchProxy.applyVoid(objArray, this, uoa, "8")) {
          int i = 0;
          obj = 1;
          if (this.f != null) {
             i = 1;
          }
          if (this.g != null) {
             i = i + 1;
          }
          if (this.h != null) {
             i = i + 1;
          }
          if (i <= obj) {
             if (i <= 0) {
                throw new RuntimeException("No image source");
             }
          }else {
             throw new RuntimeException("More than one image source");
          }
       }
       uoa = this.f;
       if (uoa != null) {
          a tb = this.b;
          String specialSizeU = (tb > null)? uoa.getSpecialSizeUrl(tb): uoa.getUrl();
          try{
             uri = this.b(specialSizeU);
          }catch(java.lang.Exception e1){
             throw new RuntimeException("cdn url error "+uri, e1);
          }
       }else {
          uoa = this.g;
          uri = (uoa != null)? this.b(uoa): this.h;
       }
       if (uri != null) {
          this.a.x(uri);
          c uoc = new c();
          uoc.b(Bitmap$Config.RGB_565);
          this.a.o(uoc.a());
          return new b(this);
       }else {
          throw new RuntimeException("no valid uri");
       }
    }
    public final Uri b(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, a.class, "7");
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
}
