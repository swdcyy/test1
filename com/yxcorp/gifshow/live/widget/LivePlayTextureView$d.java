package com.yxcorp.gifshow.live.widget.LivePlayTextureView$d;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$a;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import java.lang.Object;
import android.graphics.Bitmap;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import android.view.TextureView;
import android.view.Surface;
import java.lang.Boolean;
import android.util.Pair;
import android.graphics.SurfaceTexture;
import android.os.Build$VERSION;
import java.lang.Exception;
import android.content.Context;
import android.widget.FrameLayout;
import android.view.TextureView$SurfaceTextureListener;
import android.view.View;
import android.graphics.Matrix;
import m1b.a;
import android.graphics.Paint;
import java.lang.Integer;

public class LivePlayTextureView$d implements LivePlayTextureView$a	// class@001a8e
{
    public TextureView b;
    public Pair c;
    public final LivePlayTextureView d;

    public void LivePlayTextureView$d(LivePlayTextureView p0){
       this.d = p0;
       super();
    }
    public Bitmap a(Bitmap p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlayTextureView$d.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getBitmap(p0);
    }
    public Surface b(boolean p0){
       Surface obj;
       SurfaceTexture surfaceTextu;
       Pair pair;
       LivePlayTextureView$d uod = LivePlayTextureView$d.class;
       if (PatchProxy.isSupport(uod)) {
          obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, uod, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       obj = null;
       if (p0) {
          LivePlayTextureView$d tc = this.c;
          if (tc != null) {
             if (tc.first != this.b.getSurfaceTexture()) {
                try{
                   if (Build$VERSION.SDK_INT >= 23) {
                      this.b.setSurfaceTexture(this.c.first);
                      pair = this.c.second;
                   }
                }catch(java.lang.Exception e4){
                   e4.printStackTrace();
                }
             }else {
                pair = this.c.second;
             }
          }
       }
    }
    public void c(boolean p0){
       LivePlayTextureView$d uod = LivePlayTextureView$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "6")) {
          return;
       }
       this.b.setOpaque(p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, LivePlayTextureView$d.class, "1")) {
          return;
       }
       if (this.b == null) {
          TextureView textureView = new TextureView(this.d.getContext());
          this.b = textureView;
          textureView.setSurfaceTextureListener(this.d);
       }
       this.d.removeAllViews();
       this.d.addView(this.b, -1, -1);
       return;
    }
    public void e(Matrix p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureView$d.class, "8")) {
          return;
       }
       this.b.setTransform(p0);
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LivePlayTextureView$d.class, "5")) {
          return;
       }
       LivePlayTextureView$d tc = this.c;
       if (tc != null) {
          tc.first.release();
       }
       this.c = null;
       return;
    }
    public Bitmap getBitmap(){
       Object obj = PatchProxy.apply(null, this, LivePlayTextureView$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.b.getBitmap();
    }
    public void onFirstFrameRender(){
       a.c(this);
    }
    public void onVideoSizeChanged(int p0,int p1){
       a.d(this, p0, p1);
    }
    public void prepareForStartAnim(){
       a.e(this);
    }
    public void prepareForStopAnim(){
       a.f(this);
    }
    public void setLayerType(int p0,Paint p1){
       LivePlayTextureView$d uod = LivePlayTextureView$d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uod, "7")) {
          return;
       }
       this.b.setLayerType(p0, p1);
       return;
    }
}
