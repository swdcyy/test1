package com.kuaishou.tk.api.view.player.TextureRenderView$b;
import wx4.a$c;
import com.kuaishou.tk.api.view.player.TextureRenderView;
import android.graphics.SurfaceTexture;
import java.lang.Object;
import com.kwai.framework.player.core.b;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.video.player.ISurfaceTextureHolder;
import kotlin.jvm.internal.a;
import com.kuaishou.tk.api.view.player.TextureRenderView$c;
import android.view.TextureView;
import com.kwai.robust.PatchProxyResult;
import android.view.Surface;
import wx4.a;
import android.view.SurfaceHolder;

public final class TextureRenderView$b implements a$c	// class@000fb2
{
    public final TextureRenderView a;
    public final SurfaceTexture b;

    public void TextureRenderView$b(TextureRenderView p0,SurfaceTexture p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public void a(b p0){
       TextureRenderView$b uob = TextureRenderView$b.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, uob, "1")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       if (p0 instanceof ISurfaceTextureHolder) {
          uob = this.a;
          a.m(uob);
          uob.c.a(false);
          SurfaceTexture surfaceTextu = p0.getSurfaceTexture();
          a.o(surfaceTextu, "textureHolder.surfaceTexture");
          this.a.setSurfaceTexture(surfaceTextu);
       }else {
          Object[] objArray = null;
          Object[] objArray1 = PatchProxy.apply(objArray, this, uob, "2");
          if (objArray1 != PatchProxyResult.class) {
          }else if(this.getSurfaceTexture() == null){
             objArray = new Surface(this.getSurfaceTexture());
          }
          objArray1 = objArray;
          p0.setSurface(objArray1);
       }
       return;
    }
    public a getRenderView(){
       return this.a;
    }
    public SurfaceHolder getSurfaceHolder(){
       return null;
    }
    public SurfaceTexture getSurfaceTexture(){
       return this.b;
    }
    public Surface openSurface(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, TextureRenderView$b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.getSurfaceTexture() != null) {
          objArray = new Surface(this.getSurfaceTexture());
       }
       return objArray;
    }
}
