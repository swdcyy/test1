package com.yxcorp.gifshow.widget.ClientEditorSdk2AnimatedRenderView;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.TextureView$SurfaceTextureListener;
import android.view.TextureView;
import com.yxcorp.gifshow.widget.ClientEditorSdk2AnimatedRenderView$a;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.EditorSdk2AnimatedRenderViewListener;
import gq.a;
import java.lang.StringBuilder;
import q87.c;
import android.view.View;

public class ClientEditorSdk2AnimatedRenderView extends EditorSdk2AnimatedRenderView	// class@001800
{
    public PreviewPlayer p;
    public EditorSdk2AnimatedRenderViewListener q;

    public void ClientEditorSdk2AnimatedRenderView(Context p0){
       super(p0);
    }
    public void ClientEditorSdk2AnimatedRenderView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d();
    }
    public void ClientEditorSdk2AnimatedRenderView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d();
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, ClientEditorSdk2AnimatedRenderView.class, "1")) {
          return;
       }
       this.setSurfaceTextureListener(new ClientEditorSdk2AnimatedRenderView$a(this, this.getSurfaceTextureListener()));
       return;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ClientEditorSdk2AnimatedRenderView.class, "2")) {
          return;
       }
       super.onAttachedToWindow();
       ClientEditorSdk2AnimatedRenderView tp = this.p;
       if (tp != null) {
          tp.addAnimatedRenderView(this);
       }
       this.setListener(this.q);
       Object[] objArray = new Object[0];
       a.D().w("ClientEditorSdk2AnimatedRenderView", "onAttachedToWindow assetId:"+this.getAssetId()+",preview:"+this, objArray);
       return;
    }
    public void onDetachedFromWindow(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ClientEditorSdk2AnimatedRenderView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       ClientEditorSdk2AnimatedRenderView tp = this.p;
       if (tp != null) {
          tp.removeAnimatedRenderView(this);
       }
       this.setListener(objArray);
       Object[] objArray1 = new Object[0];
       a.D().w("ClientEditorSdk2AnimatedRenderView", "onDetachedFromWindow assetId:"+this.getAssetId()+",preview:"+this, objArray1);
       return;
    }
    public void setEditorSdk2AnimatedRenderViewListener(EditorSdk2AnimatedRenderViewListener p0){
       this.q = p0;
    }
    public void setPreviewPlayer(PreviewPlayer p0){
       this.p = p0;
    }
}
