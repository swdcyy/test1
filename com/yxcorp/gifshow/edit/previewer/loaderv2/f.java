package com.yxcorp.gifshow.edit.previewer.loaderv2.f;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a;
import com.yxcorp.gifshow.edit.previewer.loaderv2.base.a$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qba.c;
import com.kwai.video.editorsdk2.model.ImmutableArray;
import com.kwai.video.minecraft.model.EditorSdk2V2$VideoEditorProject;
import com.kwai.video.minecraft.model.EditorSdk2V2$AudioAsset;

public class f extends a	// class@001b3e
{
    public EditorSdk2V2$AudioAsset[] h;
    public boolean i;

    public void f(){
       super();
    }
    public void c(a$a p0,Object[] p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, f.class, "1")) {
          return;
       }
       this.i = p0.c.b;
       return;
    }
    public void d(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, f.class, "2")) {
          return;
       }
       if (this.i != null) {
          this.h = this.b.audioAssets().toNormalArray();
          EditorSdk2V2$AudioAsset[] uAudioAssetA = new EditorSdk2V2$AudioAsset[0];
          this.b.setAudioAssets(uAudioAssetA);
       }else {
          f th = this.h;
          if (th != null) {
             this.b.setAudioAssets(th);
             this.h = objArray;
          }
       }
       return;
    }
    public int g(){
       return 1;
    }
}
