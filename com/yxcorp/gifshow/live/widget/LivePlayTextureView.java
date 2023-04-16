package com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import android.view.TextureView$SurfaceTextureListener;
import android.widget.FrameLayout;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArraySet;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$d;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$b;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Set;
import android.view.Surface;
import java.lang.Boolean;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView$a;
import android.graphics.Bitmap;
import java.lang.RuntimeException;
import android.graphics.SurfaceTexture;
import java.lang.Integer;
import java.util.Iterator;
import android.graphics.Paint;
import android.graphics.Matrix;
import java.lang.StringBuilder;

public class LivePlayTextureView extends FrameLayout implements TextureView$SurfaceTextureListener	// class@001a8f
{
    public final Set b;
    public final Set c;
    public LivePlayTextureView$a d;
    public final LivePlayTextureView$a e;
    public final LivePlayTextureView$a f;

    public void LivePlayTextureView(Context p0){
       super(p0);
       this.b = new CopyOnWriteArraySet();
       this.c = new CopyOnWriteArraySet();
       this.e = new LivePlayTextureView$d(this);
       this.f = new LivePlayTextureView$b(this);
       this.c();
    }
    public void LivePlayTextureView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = new CopyOnWriteArraySet();
       this.c = new CopyOnWriteArraySet();
       this.e = new LivePlayTextureView$d(this);
       this.f = new LivePlayTextureView$b(this);
       this.c();
    }
    public void LivePlayTextureView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new CopyOnWriteArraySet();
       this.c = new CopyOnWriteArraySet();
       this.e = new LivePlayTextureView$d(this);
       this.f = new LivePlayTextureView$b(this);
       this.c();
    }
    public void a(TextureView$SurfaceTextureListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureView.class, "2")) {
          return;
       }
       this.b.add(p0);
       return;
    }
    public Surface b(boolean p0){
       if (PatchProxy.isSupport(LivePlayTextureView.class)) {
          Object obj = PatchProxy.applyOneRefs(Boolean.valueOf(p0), this, LivePlayTextureView.class, "10");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return this.d.b(p0);
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, LivePlayTextureView.class, "1")) {
          return;
       }
       this.h(LivePlayTextureView$d.class);
       return;
    }
    public boolean d(){
       return this.d instanceof LivePlayTextureView$b;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, LivePlayTextureView.class, "17")) {
          return;
       }
       this.d.onFirstFrameRender();
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, LivePlayTextureView.class, "11")) {
          return;
       }
       this.d.f();
       return;
    }
    public void g(TextureView$SurfaceTextureListener p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureView.class, "3")) {
          return;
       }
       this.b.remove(p0);
       return;
    }
    public Bitmap getBitmap(){
       Object obj = PatchProxy.apply(null, this, LivePlayTextureView.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.d.getBitmap();
    }
    public void h(Class p0){
       LivePlayTextureView te;
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureView.class, "16")) {
          return;
       }
       if (p0.isAssignableFrom(LivePlayTextureView$d.class)) {
          if (!this.d instanceof LivePlayTextureView$d) {
             te = this.e;
             this.d = te;
             te.d();
          }
       }else if(p0.isAssignableFrom(LivePlayTextureView$b.class)){
          if (!this.d instanceof LivePlayTextureView$b) {
             te = this.f;
             this.d = te;
             te.d();
          }
       }else {
          throw new RuntimeException("LivePlayTextureView.switchSurfaceProvider, not a support type");
       }
       return;
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(LivePlayTextureView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LivePlayTextureView.class, "4")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          TextureView$SurfaceTextureListener surfaceTextu = iterator.next();
          if (surfaceTextu != null) {
             surfaceTextu.onSurfaceTextureAvailable(p0, p1, p2);
          }
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, LivePlayTextureView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 1;
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          TextureView$SurfaceTextureListener surfaceTextu = iterator.next();
          if (surfaceTextu != null) {
             i = i & surfaceTextu.onSurfaceTextureDestroyed(p0);
          }
       }
       return i;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(LivePlayTextureView.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, LivePlayTextureView.class, "5")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          TextureView$SurfaceTextureListener surfaceTextu = iterator.next();
          if (surfaceTextu != null) {
             surfaceTextu.onSurfaceTextureSizeChanged(p0, p1, p2);
          }
       }
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureView.class, "7")) {
          return;
       }
       Iterator iterator = this.b.iterator();
       while (iterator.hasNext()) {
          TextureView$SurfaceTextureListener surfaceTextu = iterator.next();
          if (surfaceTextu != null) {
             surfaceTextu.onSurfaceTextureUpdated(p0);
          }
       }
       return;
    }
    public void setLayerType(int p0,Paint p1){
       if (PatchProxy.isSupport(LivePlayTextureView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, LivePlayTextureView.class, "13")) {
          return;
       }
       this.d.setLayerType(p0, p1);
       return;
    }
    public void setOpaque(boolean p0){
       if (PatchProxy.isSupport(LivePlayTextureView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LivePlayTextureView.class, "12")) {
          return;
       }
       this.d.c(p0);
       return;
    }
    public void setTransform(Matrix p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlayTextureView.class, "14")) {
          return;
       }
       this.d.e(p0);
       return;
    }
    public String toString(){
       Object obj = PatchProxy.apply(null, this, LivePlayTextureView.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return "LivePlayTextureView{mCurrentSurfaceProvider="+this.d+'}';
    }
}
