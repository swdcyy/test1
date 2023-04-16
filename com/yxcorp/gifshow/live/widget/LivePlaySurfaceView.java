package com.yxcorp.gifshow.live.widget.LivePlaySurfaceView;
import android.view.SurfaceHolder$Callback;
import android.view.SurfaceView;
import android.content.Context;
import android.view.ViewGroup;
import android.view.SurfaceHolder;
import com.yxcorp.gifshow.live.widget.SurfaceSnapshotController;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import l1b.b;
import com.kwai.robust.PatchProxyResult;
import androidx.lifecycle.LifecycleOwner;
import android.content.ContextWrapper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import android.graphics.Bitmap;
import android.widget.ImageView;

public class LivePlaySurfaceView extends SurfaceView implements SurfaceHolder$Callback	// class@001a8a
{
    public final SurfaceSnapshotController b;

    public void LivePlaySurfaceView(Context p0,ViewGroup p1){
       super(p0);
       this.getHolder().addCallback(this);
       this.b = new SurfaceSnapshotController(p1);
    }
    public void onAttachedToWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePlaySurfaceView.class, "1")) {
          return;
       }
       super.onAttachedToWindow();
       LivePlaySurfaceView tb = this.b;
       Objects.requireNonNull(tb);
       SurfaceSnapshotController surfaceSnaps = SurfaceSnapshotController.class;
       if (!PatchProxy.applyVoid(objArray, tb, surfaceSnaps, "2")) {
          tb.d = true;
          b.b("SurfaceSnapshotController", "onAttach");
          Context context = tb.a.getContext();
          Object obj = PatchProxy.applyOneRefs(context, objArray, surfaceSnaps, "12");
          if (obj != PatchProxyResult.class) {
             objArray = obj;
          }else {
             while (context instanceof ContextWrapper) {
                if (context instanceof LifecycleOwner) {
                   objArray = context;
                   break ;
                }
                context = context.getBaseContext();
             }
          }
          if (objArray != null && !PatchProxy.applyVoidOneRefs(objArray, tb, surfaceSnaps, "10")) {
             tb.e();
             tb.f = objArray;
             objArray.getLifecycle().addObserver(tb.g);
          }
       }
    label_0069 :
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LivePlaySurfaceView.class, "2")) {
          return;
       }
       super.onDetachedFromWindow();
       LivePlaySurfaceView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoid(null, tb, SurfaceSnapshotController.class, "3")) {
          tb.d = false;
          b.b("SurfaceSnapshotController", "onDetach");
          tb.e();
          if (tb.e != null) {
             tb.b.setImageBitmap(null);
             tb.e.recycle();
             tb.e = null;
          }
       }
       return;
    }
    public void surfaceChanged(SurfaceHolder p0,int p1,int p2,int p3){
    }
    public void surfaceCreated(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaySurfaceView.class, "7")) {
          return;
       }
       LivePlaySurfaceView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, SurfaceSnapshotController.class, "4")) {
          b.b("SurfaceSnapshotController", "onSurfaceCreated");
          tb.c = p0;
       }
       return;
    }
    public void surfaceDestroyed(SurfaceHolder p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LivePlaySurfaceView.class, "8")) {
          return;
       }
       LivePlaySurfaceView tb = this.b;
       Objects.requireNonNull(tb);
       if (!PatchProxy.applyVoidOneRefs(p0, tb, SurfaceSnapshotController.class, "5")) {
          b.b("SurfaceSnapshotController", "onSurfaceDestroyed");
          tb.c = p0;
          tb.d();
       }
       return;
    }
}
