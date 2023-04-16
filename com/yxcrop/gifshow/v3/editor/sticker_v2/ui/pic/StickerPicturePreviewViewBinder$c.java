package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder$c;
import androidx.lifecycle.Observer;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerPicturePreviewViewBinder;
import uwc.b;
import java.lang.Object;
import com.kuaishou.edit.draft.Workspace$Type;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import faa.a;
import java.lang.StringBuilder;
import q87.c;
import androidx.fragment.app.Fragment;
import nmd.v;
import lwc.h;
import com.yxcorp.gifshow.v3.f;
import androidx.fragment.app.FragmentActivity;
import java.util.List;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import android.app.Activity;
import kotlin.jvm.internal.a;
import ei0.a;

public final class StickerPicturePreviewViewBinder$c implements Observer	// class@000ac1
{
    public final StickerPicturePreviewViewBinder b;
    public final b c;

    public void StickerPicturePreviewViewBinder$c(StickerPicturePreviewViewBinder p0,b p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public void onChanged(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, StickerPicturePreviewViewBinder$c.class, "1")) {
       }else {
          Object[] objArray = new Object[0];
          a.D().s("PicturePreviewViewBinder", "changeWorkspaceType: "+p0, objArray);
          f.l(this.b.W()).O0(this.b.W().getActivity(), p0, this.c.r0(), this.c.w0());
          StickerPicturePreviewViewBinder$c tb = this.b;
          a.o(p0, "it");
          tb.p0(tb.r0(p0));
       }
       return;
    }
}
