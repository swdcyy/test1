package com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder$h;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcrop.gifshow.v3.editor.text_v2.ui.preview.picture.AtlasOrSinglePictureSubViewBinder;
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
import java.util.Objects;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import lnd.a;
import mod.a;
import xld.c;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import kotlin.jvm.internal.a;
import a17.b$b;
import a17.b$a;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import uwc.b;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;

public final class AtlasOrSinglePictureSubViewBinder$h implements EditDecorationContainerView$b	// class@000b3e
{
    public final AtlasOrSinglePictureSubViewBinder a;

    public void AtlasOrSinglePictureSubViewBinder$h(AtlasOrSinglePictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AtlasOrSinglePictureSubViewBinder$h obj = PatchProxy.applyOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$h.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewEditTextBaseElement && !p0 instanceof NewEditStickerBaseDrawer) {
          return k.a(this, p0);
       }
       if (!this.a.J()) {
          obj = this.a;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(null, obj, AtlasOrSinglePictureSubViewBinder.class, "13");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.e.o0().y().f();
          if (!b || p0.mIsSelected != null) {
             b1 = true;
          label_0058 :
             return b1;
          }
       }
       b1 = false;
       goto label_0058 ;
    }
    public boolean b(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       a.p(p0, "drawer");
       boolean b = (p0 instanceof NewEditStickerBaseDrawer || p0 instanceof NewEditTextBaseElement)? true: false;
       return b;
    }
    public void c(b$b p0,b$a p1){
       k.d(this, p0, p1);
    }
    public boolean d(EditDecorationBaseDrawer p0){
       List identifyList;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       AtlasOrSinglePictureSubViewBinder$h obj = PatchProxy.applyOneRefs(p0, this, AtlasOrSinglePictureSubViewBinder$h.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof NewEditTextBaseElement && !p0 instanceof NewEditStickerBaseDrawer) {
          return b;
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, AtlasOrSinglePictureSubViewBinder.class, "16");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else if(obj.w.H() != EditorItemFunc.CROP){
          String str = CollectionsKt___CollectionsKt.F2(obj.G(), obj.E().q0());
          if (p0 != null) {
             identifyList = p0.getIdentifyList();
             if (identifyList != null) {
             label_005d :
                b = identifyList.contains(str);
             }
          }
          identifyList = new ArrayList();
          goto label_005d ;
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
