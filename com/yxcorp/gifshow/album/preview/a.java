package com.yxcorp.gifshow.album.preview.a;
import com.yxcorp.gifshow.album.preview.d$a;
import com.yxcorp.gifshow.album.widget.preview.c;
import r79.d;
import j79.m0;
import androidx.lifecycle.ViewModel;
import ekd.b0;
import r79.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.io.File;
import com.kwai.robust.PatchProxyResult;
import g79.a;
import android.app.Application;
import java.lang.StringBuilder;
import ekd.a0;
import qkd.b;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.album.preview.a$b;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import ic7.b;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.viewbinder.AbsPreviewItemViewBinder;
import android.widget.ImageView;
import com.yxcorp.gifshow.album.preview.b$a;
import com.yxcorp.gifshow.album.preview.b;
import com.yxcorp.utility.Log;
import c79.c$a;
import c79.c;
import android.net.Uri;
import ic7.d;
import com.yxcorp.gifshow.album.preview.a$a;
import c79.e;
import c79.d;
import c79.a;
import java.lang.Boolean;

public class a extends c implements d$a	// class@001a49
{
    public a$b w;
    public boolean x;

    public void a(int p0,d p1,m0 p2,ViewModel p3){
       super(p0, p1, p2, p3);
       this.m = p1;
       this.D(new b0(p1.getWidth(), p1.getHeight()));
    }
    public void D(b0 p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "1")) {
          return;
       }
       super.D(p0);
       this.x = true;
       return;
    }
    public final File E(){
       Object obj = PatchProxy.apply(null, this, a.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.x == null) {
          return new File(this.c);
       }
       return new File(a.c.b().getCacheDir(), a0.c(this.c)+".png");
    }
    public final String F(){
       File obj = PatchProxy.apply(null, this, a.class, "5");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.E();
       if (b.S(obj)) {
          return obj.getAbsolutePath();
       }
       return null;
    }
    public MediaPreviewGenerateCoverManager$a j(){
       Object[] objArray = null;
       a$b obj = PatchProxy.apply(objArray, this, a.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.w == null) {
          if (TextUtils.x(this.m.getPath()) || TextUtils.x(this.E().getAbsolutePath())) {
             b.a(new IllegalArgumentException("AlbumImagePreviewItem add task illegal task info, index = "+this.b+", media path = "+this.m.getPath()));
             return objArray;
          }else {
             obj = new a$b(this.b, this.m.getPath(), this.E().getAbsolutePath());
             this.w = obj;
             obj.d = this.h;
          }
       }
       return this.w;
    }
    public void m(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "4")) {
          return;
       }
       c tf = this.f;
       if (tf != null && tf.m() != null) {
          if (this.x == null || this.g != null) {
             this.f.m().setVisibility(8);
          }else {
             this.f.m().setVisibility(0);
             b$a c = b.b(4, 0x3f800000).c;
             Log.g("AlbumImagePreviewItem", "show cover called, index = "+this.b+" size: "+c);
             String str = b.a(this.F(), this.m, 0, 4);
             int i = 1;
             this.f.m().setActualImageScaleType(i);
             if (TextUtils.x(str)) {
                c$a uoa = new c$a();
                uoa.j(c);
                uoa.e(c);
                uoa.d(i);
                uoa.h(i);
                tf = uoa.a();
                Log.g("AlbumImagePreviewItem", "cover and album cache not exist, bind file, media path = "+this.m.getPath());
                Uri uri = d.a(new File(this.m.getPath()));
                if (uri != null) {
                   a.c(this.f.m(), uri, tf, objArray, new a$a(this));
                }
             }else {
                c$a uoa1 = new c$a();
                uoa1.j(c);
                uoa1.e(c);
                uoa1.d(i);
                uoa1.h(i);
                tf = uoa1.a();
                Uri uri1 = d.a(new File(str));
                if (uri1 != null) {
                   CompatImageView uCompatImage = this.f.m();
                   if (uCompatImage != null) {
                      Object tag = uCompatImage.getTag(R.id.cover_image_source);
                      if (!tag instanceof String || !tag.equals(this.m.getPath())) {
                         a.b(uCompatImage, uri1, tf);
                      }
                   }
                }
             }
             return;
          }
       }
       return;
    }
    public boolean s(){
       Object obj = PatchProxy.apply(null, this, a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.F()) ^ 0x01);
    }
}
