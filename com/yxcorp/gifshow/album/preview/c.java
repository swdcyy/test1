package com.yxcorp.gifshow.album.preview.c;
import com.yxcorp.gifshow.album.preview.d$a;
import com.yxcorp.gifshow.album.widget.preview.f;
import r79.e;
import j79.m0;
import androidx.lifecycle.ViewModel;
import java.io.File;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import g79.a;
import android.app.Application;
import java.lang.StringBuilder;
import r79.c;
import ekd.a0;
import qkd.b;
import com.yxcorp.gifshow.album.preview.MediaPreviewGenerateCoverManager$a;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import com.yxcorp.gifshow.album.preview.c$a;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import ic7.b;
import com.yxcorp.gifshow.album.imageloader.CompatImageView;
import com.yxcorp.gifshow.album.widget.preview.KsAlbumVideoPlayerView;
import com.yxcorp.gifshow.album.preview.b$a;
import com.yxcorp.gifshow.album.preview.b;
import c79.c$a;
import c79.c;
import com.yxcorp.utility.Log;
import android.net.Uri;
import ic7.d;
import c79.a;
import java.util.Objects;
import c79.a$a;
import kotlin.jvm.internal.a;
import android.widget.ImageView;
import java.lang.Boolean;

public class c extends f implements d$a	// class@001a4d
{
    public c$a E;

    public void c(int p0,e p1,m0 p2,ViewModel p3){
       super(p0, p1, p2, p3);
    }
    public final File E(){
       Object obj = PatchProxy.apply(null, this, c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new File(a.c.b().getCacheDir(), a0.c(this.e.getPath())+".png");
    }
    public final String F(){
       File obj = PatchProxy.apply(null, this, c.class, "5");
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
       Object obj = PatchProxy.apply(objArray, this, c.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.E == null) {
          if (TextUtils.x(this.e.getPath()) || TextUtils.x(this.E().getAbsolutePath())) {
             b.a(new IllegalArgumentException("AlbumVideoPreviewItem add task illegal task info, index = "+this.f+", media path = "+this.e.getPath()));
             return objArray;
          }else {
             this.E = new c$a(this.f, this.e.getPath(), this.E().getAbsolutePath());
          }
       }
       return this.E;
    }
    public void m(){
       b$a c;
       Uri uri;
       a$a a;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, c.class, "2")) {
          return;
       }
       f tc = this.c;
       if (tc != null && tc.getCoverView() != null) {
          c = b.b(4, 0x3f800000).c;
          c$a uoa = new c$a();
          uoa.j(c);
          uoa.e(c);
          c uoc = uoa.a();
          String str = b.a(this.F(), this.e, true, 4);
          if (TextUtils.x(str)) {
             Log.g("AlbumVideoPreviewItem", "cover and album cache not exist, bind file, media path = "+this.e.getPath());
             uri = d.a(new File(this.e.getPath()));
             if (uri != null) {
                a.b(this.c.getCoverView(), uri, uoc);
             }
          }else {
             Uri uri1 = d.a(new File(str));
             if (uri1 != null) {
                CompatImageView coverView = this.c.getCoverView();
                String str1 = "5";
                if (!PatchProxy.applyVoidTwoRefs(coverView, uri1, objArray, a.class, str1)) {
                   a = a.a;
                   Objects.requireNonNull(a);
                   if (!PatchProxy.applyVoidTwoRefs(coverView, uri1, a, a$a.class, str1)) {
                      a.q(coverView, "imageView");
                      a.q(uri1, "uri");
                      a.a(coverView, uri1, objArray);
                   }
                }
             }
          }
          if (!this.c.b()) {
             this.c.getCoverView().setVisibility(0);
          }
       }
    label_00c3 :
       return;
    }
    public void p(){
       if (PatchProxy.applyVoid(null, this, c.class, "4")) {
          return;
       }
       f tc = this.c;
       if (tc != null) {
          tc.getCoverView().setVisibility(0);
       }
       super.p();
       return;
    }
    public boolean s(){
       Object obj = PatchProxy.apply(null, this, c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return (TextUtils.x(this.F()) ^ 0x01);
    }
}
