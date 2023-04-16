package com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder$p;
import com.yxcorp.gifshow.v3.editor.BaseEditorFragment$e;
import com.yxcorp.gifshow.v3.previewer.player.viewbinder.PicturesViewBinder;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.video.editorsdk2.PreviewPlayer;
import com.kwai.video.editorsdk2.PreviewTextureView;

public final class PicturesViewBinder$p implements BaseEditorFragment$e	// class@0015fd
{
    public final PicturesViewBinder a;

    public void PicturesViewBinder$p(PicturesViewBinder p0){
       this.a = p0;
       super();
    }
    public final void a(boolean p0){
       PicturesViewBinder$p op = PicturesViewBinder$p.class;
       if (PatchProxy.isSupport(op) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, op, "1")) {
          return;
       }
       if (p0) {
          PicturesViewBinder t = this.a.t;
          if (t != null) {
             t.setPreviewPlayer(null);
          }
       }else {
          PicturesViewBinder$p ta = this.a;
          PicturesViewBinder t1 = ta.t;
          if (t1 != null) {
             t1.setPreviewPlayer(ta.P);
          }
       }
       return;
    }
}
