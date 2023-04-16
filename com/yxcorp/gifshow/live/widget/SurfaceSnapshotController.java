package com.yxcorp.gifshow.live.widget.SurfaceSnapshotController;
import android.view.ViewGroup;
import java.lang.Object;
import com.yxcorp.gifshow.live.widget.SurfaceSnapshotController$1;
import android.widget.ImageView;
import android.content.Context;
import android.graphics.Bitmap;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import l1b.b;
import java.lang.StringBuilder;
import android.graphics.Bitmap$Config;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.os.Handler;
import android.os.Build$VERSION;
import com.yxcorp.gifshow.live.widget.a;
import android.view.PixelCopy$OnPixelCopyFinishedListener;
import android.view.PixelCopy;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleObserver;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.BitmapDrawable;

public class SurfaceSnapshotController	// class@001a91
{
    public final ViewGroup a;
    public final ImageView b;
    public SurfaceHolder c;
    public boolean d;
    public Bitmap e;
    public LifecycleOwner f;
    public final LifecycleObserver g;

    public void SurfaceSnapshotController(ViewGroup p0){
       super();
       this.d = false;
       this.g = new SurfaceSnapshotController$1(this);
       this.a = p0;
       this.b = new ImageView(p0.getContext());
    }
    public final Bitmap a(){
       boolean b;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SurfaceSnapshotController surfaceSnaps = SurfaceSnapshotController.class;
       Object[] objArray = null;
       SurfaceSnapshotController obj = PatchProxy.apply(objArray, this, surfaceSnaps, "15");
       if (obj != patchProxyRe) {
          return obj;
       }
       obj = this.e;
       if (obj != null && !obj.isRecycled()) {
          obj = this.e;
          Object obj1 = PatchProxy.applyOneRefs(obj, this, surfaceSnaps, "16");
          if (obj1 != patchProxyRe) {
             b = obj1.booleanValue();
          }else {
             int width = this.a.getWidth();
             int height = this.a.getHeight();
             b = (obj.getWidth() >= (width >> 2) && (obj.getHeight() < (height >> 2) || (int)(((double)obj.getWidth() / (double)obj.getHeight()) * 100.00f) != (int)(((double)width / (double)height) * 100.00f)))? true: false;
          }
          if (!b) {
          label_00c3 :
             return this.e;
          }
       }
    label_0066 :
       obj = this.e;
       if (obj != null && !obj.isRecycled()) {
          this.b.setImageBitmap(objArray);
          this.e.recycle();
          b.b("SurfaceSnapshotController", "bitmap will be recreated due to size changed");
       }
       Object obj2 = PatchProxy.apply(objArray, this, surfaceSnaps, "17");
       if (obj2 != patchProxyRe) {
          objArray = obj2;
       }else {
          int i = this.a.getWidth() >> 1;
          int i1 = this.a.getHeight() >> 1;
          if (i > 0 && i1 > 0) {
             b.b("SurfaceSnapshotController", "createBitmapForSnapshot: "+i+" "+i1);
             objArray = Bitmap.createBitmap(i, i1, Bitmap$Config.ARGB_8888);
          }
       }
       this.e = objArray;
       goto label_00c3 ;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SurfaceSnapshotController.class, "8")) {
          return;
       }
       b.b("SurfaceSnapshotController", "hideCover");
       this.b.setVisibility(8);
       return;
    }
    public final Bitmap c(){
       Object[] objArray = null;
       SurfaceSnapshotController obj = PatchProxy.apply(objArray, this, SurfaceSnapshotController.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.c;
       if (obj == null) {
          return objArray;
       }
       Surface surface = obj.getSurface();
       if (surface == null || !surface.isValid()) {
          return objArray;
       }
       Bitmap uBitmap = this.a();
       if (uBitmap == null) {
          return objArray;
       }
       Handler handler = this.a.getHandler();
       if (Build$VERSION.SDK_INT >= 24 && handler != null) {
          PixelCopy.request(surface, uBitmap, a.a, handler);
       }else {
          b.a("SurfaceSnapshotController", "SurfaceView snapshot is not supported");
       }
       return uBitmap;
    }
    public boolean d(){
       SurfaceSnapshotController surfaceSnaps = SurfaceSnapshotController.class;
       Object obj = PatchProxy.apply(null, this, surfaceSnaps, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b.b("SurfaceSnapshotController", "tryUpdateAndShowCover");
       if (!this.f()) {
          return 0;
       }
       if (!PatchProxy.applyVoid(null, this, surfaceSnaps, "9")) {
          b.b("SurfaceSnapshotController", "showCover");
          this.b.setVisibility(0);
       }
       return true;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, SurfaceSnapshotController.class, "11")) {
          return;
       }
       SurfaceSnapshotController tf = this.f;
       if (tf != null) {
          tf.getLifecycle().removeObserver(this.g);
       }
       return;
    }
    public boolean f(){
       boolean b;
       Object obj = PatchProxy.apply(null, this, SurfaceSnapshotController.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       b.b("SurfaceSnapshotController", "updateCover");
       b = false;
       if (this.d == null) {
          return b;
       }
       Bitmap uBitmap = this.c();
       if (uBitmap == null) {
          return b;
       }
       this.b.setImageBitmap(uBitmap);
       Drawable drawable = this.b.getDrawable();
       if (drawable instanceof BitmapDrawable) {
          drawable.setFilterBitmap(true);
          drawable.setAntiAlias(true);
       }
       b.b("SurfaceSnapshotController", "cover updated");
       return true;
    }
}
