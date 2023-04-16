package com.yxcorp.gifshow.widget.ClientEditorSdk2AnimatedRenderView$a;
import android.view.TextureView$SurfaceTextureListener;
import com.yxcorp.gifshow.widget.ClientEditorSdk2AnimatedRenderView;
import java.lang.Object;
import android.graphics.SurfaceTexture;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderView;

public class ClientEditorSdk2AnimatedRenderView$a implements TextureView$SurfaceTextureListener	// class@0017ff
{
    public final TextureView$SurfaceTextureListener b;
    public final ClientEditorSdk2AnimatedRenderView c;

    public void ClientEditorSdk2AnimatedRenderView$a(ClientEditorSdk2AnimatedRenderView p0,TextureView$SurfaceTextureListener p1){
       this.c = p0;
       this.b = p1;
       super();
    }
    public void onSurfaceTextureAvailable(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(ClientEditorSdk2AnimatedRenderView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClientEditorSdk2AnimatedRenderView$a.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ClientEditorSdk2AnimatedRenderView", "onSurfaceTextureAvailable, width:"+p1+",height:"+p2+",preview:"+this, objArray);
       this.b.onSurfaceTextureAvailable(p0, p1, p2);
       return;
    }
    public boolean onSurfaceTextureDestroyed(SurfaceTexture p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ClientEditorSdk2AnimatedRenderView$a.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       Object[] objArray = new Object[0];
       a.D().w("ClientEditorSdk2AnimatedRenderView", "onSurfaceTextureDestroyed assetId:"+this.c.getAssetId()+",preview:"+this, objArray);
       return this.b.onSurfaceTextureDestroyed(p0);
    }
    public void onSurfaceTextureSizeChanged(SurfaceTexture p0,int p1,int p2){
       if (PatchProxy.isSupport(ClientEditorSdk2AnimatedRenderView$a.class) && PatchProxy.applyVoidThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, ClientEditorSdk2AnimatedRenderView$a.class, "2")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ClientEditorSdk2AnimatedRenderView", "onSurfaceTextureSizeChanged, width:"+p1+",height:"+p2+",preview:"+this, objArray);
       this.b.onSurfaceTextureSizeChanged(p0, p1, p2);
       return;
    }
    public void onSurfaceTextureUpdated(SurfaceTexture p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ClientEditorSdk2AnimatedRenderView$a.class, "4")) {
          return;
       }
       Object[] objArray = new Object[0];
       a.D().w("ClientEditorSdk2AnimatedRenderView", "onSurfaceTextureUpdated assetId:"+this.c.getAssetId()+",preview:"+this, objArray);
       this.b.onSurfaceTextureUpdated(p0);
       return;
    }
}
