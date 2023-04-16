package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder$c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerAtlasOrSinglePictureSubViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import wpc.k;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Objects;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import mod.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import smd.d;
import kotlin.jvm.internal.a;
import a17.b$b;
import a17.b$a;
import xld.a;

public final class StickerAtlasOrSinglePictureSubViewBinder$c implements EditDecorationContainerView$b	// class@000ab3
{
    public final StickerAtlasOrSinglePictureSubViewBinder a;

    public void StickerAtlasOrSinglePictureSubViewBinder$c(StickerAtlasOrSinglePictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StickerAtlasOrSinglePictureSubViewBinder$c obj = PatchProxy.applyOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$c.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewEditTextBaseElement && !p0 instanceof NewEditStickerBaseDrawer) {
          return k.a(this, p0);
       }
       if (this.a.n.H() == null) {
          obj = this.a;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(null, obj, StickerAtlasOrSinglePictureSubViewBinder.class, "9");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.d.o0().y().f();
          if (!b || (p0.mIsSelected != null && !this.a.G().o0().B())) {
             b1 = true;
          label_006c :
             return b1;
          }
       }
    label_006b :
       b1 = false;
       goto label_006c ;
    }
    public boolean b(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "drawer");
       boolean b = (p0 instanceof NewEditTextBaseElement || p0 instanceof NewEditStickerBaseDrawer)? true: false;
       return b;
    }
    public void c(b$b p0,b$a p1){
       k.d(this, p0, p1);
    }
    public boolean d(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerAtlasOrSinglePictureSubViewBinder$c.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       v0 = p0 instanceof NewEditTextBaseElement;
       boolean b = false;
       if (!obj && !p0 instanceof NewEditStickerBaseDrawer) {
          return b;
       }
       b uob = this.a.G().o0();
       obj = (obj || (p0 instanceof NewEditStickerBaseDrawer && (uob.y().f() && p0.getLayerIndex() != uob.o())))? 0: 1;
       if (this.a.D(p0) && obj) {
          b = true;
       }
       return b;
    }
    public boolean e(EditDecorationBaseDrawer p0){
       return k.b(this, p0);
    }
    public boolean f(EditDecorationBaseDrawer p0){
       return k.c(this, p0);
    }
}
