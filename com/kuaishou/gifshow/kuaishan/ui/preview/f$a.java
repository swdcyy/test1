package com.kuaishou.gifshow.kuaishan.ui.preview.f$a;
import android.view.TextureView$SurfaceTextureListener;
import com.kuaishou.gifshow.kuaishan.ui.preview.f;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import u80.e;
import java.lang.StringBuilder;
import q87.c;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import w46.b;
import bya.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import android.widget.ImageView;

public class f$a implements TextureView$SurfaceTextureListener	// class@001aef
{
    public final f b;

    public void f$a(f p0){
       this.b = p0;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       Object[] objArray1;
       if (PatchProxy.isSupport(f$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, f$a.class, "1")) {
          return;
       }
       p2 = 0;
       Object[] objArray = new Object[p2];
       e.D().s("VideoIjkPlayerPreviewItem", "onSurfaceTextureAvailable: width="+p1+" height="+p2+" ", objArray);
       f$a tb = this.b;
       if (tb.g == null) {
          objArray1 = new Object[p2];
          e.D().w("VideoIjkPlayerPreviewItem", "setupPlayerSurface: is unbinded ignore this", objArray1);
          return;
       }else if(TextUtils.x(tb.c)){
          objArray1 = new Object[p2];
          e.D().t("VideoIjkPlayerPreviewItem", " setupPlayerSurface: wrong video source", objArray1);
          return;
       }else {
          f h = this.b.h;
          if (h == null || !h.b()) {
             this.b.j();
          }
          h = this.b.h;
          if (h != null) {
             h.h(p0);
          }
          f$a tb1 = this.b;
          if (tb1.k != null) {
             tb1.r();
          }
          return;
       }
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       p0 = PatchProxy.applyOneRefs(p0, this, f$a.class, "2");
       if (p0 != PatchProxyResult.class) {
          return p0.booleanValue();
       }
       int i = 0;
       Object[] objArray = new Object[i];
       e.D().w("VideoIjkPlayerPreviewItem", " onSurfaceTextureDestroyed index="+this.b.b, objArray);
       f h = this.b.h;
       if (h != null && h.b()) {
          Object[] objArray1 = new Object[i];
          e.D().A("VideoIjkPlayerPreviewItem", "onSurfaceTextureDestroyed: mKwaiMediaPlayer is not released", objArray1);
       }
       return true;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, f$a.class, "3")) {
          return;
       }
       f t = this.b.t;
       if (t != null && !t.getVisibility()) {
          this.b.t.setVisibility(4);
       }
       t = this.b.s;
       if (t != null && !t.getVisibility()) {
          t = this.b.h;
          if (t != null && t.c()) {
             this.b.w(false, false);
          }
       }
       return;
    }
}
