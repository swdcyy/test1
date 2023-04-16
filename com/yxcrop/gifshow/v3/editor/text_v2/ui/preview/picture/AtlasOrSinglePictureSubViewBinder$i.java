package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$i;
import com.yxcorp.gifshow.decoration.widget.DecorationContainerView$e;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.v3.editor.sticker.drawer.EditStickerBaseDrawer;
import com.kuaishou.edit.draft.Workspace$Type;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;

public final class AtlasOrSinglePictureSubViewBinder$i extends DecorationContainerView$e	// class@000b3f
{
    public final AtlasOrSinglePictureSubViewBinder a;

    public void AtlasOrSinglePictureSubViewBinder$i(AtlasOrSinglePictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public void h(BaseDrawer p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$i.class, "1")) {
       }else {
          super.h(p0);
          this.a.h.R();
       }
       return;
    }
    public boolean r(BaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$i.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (p0 instanceof EditStickerBaseDrawer && this.a.w.getType() == Workspace$Type.SINGLE_PICTURE)? true: false;
       return b;
    }
}
