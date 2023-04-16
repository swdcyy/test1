package com.kuaishou.tk.api.view.player.TextureRenderView$c;
import android.view.TextureView$SurfaceTextureListener;
import com.kwai.video.player.ISurfaceTextureHost;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.tk.api.view.player.TextureRenderView$b;
import java.lang.ref.WeakReference;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import wx4.a$b;
import wx4.a$c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public final class TextureRenderView$c implements TextureView$SurfaceTextureListener, ISurfaceTextureHost	// class@000fb3
{
    public SurfaceTexture b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public WeakReference i;
    public final Map j;

    public void TextureRenderView$c(){
       super();
       this.f = true;
       this.j = new ConcurrentHashMap();
    }
    public final void a(boolean p0){
       this.f = p0;
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(TextureRenderView$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TextureRenderView$c.class, "4")) {
          return;
       }
       a.p(p0, "surface");
       this.b = p0;
       this.c = false;
       this.d = 0;
       this.e = 0;
       TextureRenderView$c ti = this.i;
       TextureRenderView textureRende = (ti != null)? ti.get(): null;
       TextureRenderView$b uob = new TextureRenderView$b(textureRende, p0);
       Iterator iterator = this.j.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().a(uob, false, false);
       }
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       TextureRenderView$b obj = PatchProxy.applyOneRefs(p0, this, TextureRenderView$c.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "surface");
       this.b = p0;
       this.c = false;
       this.d = 0;
       this.e = 0;
       TextureRenderView$c ti = this.i;
       TextureRenderView textureRende = (ti != null)? ti.get(): null;
       obj = new TextureRenderView$b(textureRende, p0);
       Iterator iterator = this.j.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().c(obj);
       }
       return this.f;
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(TextureRenderView$c.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, TextureRenderView$c.class, "5")) {
          return;
       }
       a.p(p0, "surface");
       this.b = p0;
       this.c = true;
       this.d = p1;
       this.e = p2;
       TextureRenderView$c ti = this.i;
       TextureRenderView textureRende = (ti != null)? ti.get(): null;
       TextureRenderView$b uob = new TextureRenderView$b(textureRende, p0);
       Iterator iterator = this.j.keySet().iterator();
       while (iterator.hasNext()) {
          iterator.next().b(uob, 0, p1, p2);
       }
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureRenderView$c.class, "7")) {
          return;
       }
       a.p(p0, "surface");
       return;
    }
    public void releaseSurfaceTexture(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, TextureRenderView$c.class, "8")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (this.h != null) {
          if (p0 != this.b) {
             p0.release();
          }else if(this.f == null){
             p0.release();
          }
       }else if(this.g != null){
          if (p0 != this.b) {
             p0.release();
          }else if(this.f == null){
             this.a(true);
          }
       }else if(p0 != this.b){
          p0.release();
       }else if(this.f == null){
          this.a(true);
       }
       return;
    }
}
