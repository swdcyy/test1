package com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder$d;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcrop.gifshow.v3.editor.sticker_v2.ui.pic.StickerLongPictureSubViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import com.yxcrop.gifshow.v3.editor.text_v2_share.element.NewEditTextBaseElement;
import wpc.k;
import com.yxcorp.gifshow.v3.EditorItemFunc;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import java.util.Objects;
import tvc.e;
import com.yxcorp.gifshow.v3.framework.post.EditReduxViewModel;
import mmd.b;
import mod.a;
import com.yxcorp.gifshow.decoration.widget.BaseDrawer;
import kotlin.jvm.internal.a;
import a17.b$b;
import a17.b$a;
import java.util.List;
import kotlin.Pair;
import java.lang.Number;
import xld.a;

public final class StickerLongPictureSubViewBinder$d implements EditDecorationContainerView$b	// class@000aba
{
    public final StickerLongPictureSubViewBinder a;

    public void StickerLongPictureSubViewBinder$d(StickerLongPictureSubViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       StickerLongPictureSubViewBinder$d obj = PatchProxy.applyOneRefs(p0, this, StickerLongPictureSubViewBinder$d.class, "3");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (!p0 instanceof NewEditStickerBaseDrawer && !p0 instanceof NewEditTextBaseElement) {
          return k.a(this, p0);
       }
       if (this.a.l.H() == null) {
          obj = this.a;
          Objects.requireNonNull(obj);
          Object obj1 = PatchProxy.apply(null, obj, StickerLongPictureSubViewBinder.class, "15");
          boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): obj.c.o0().y().f();
          if (!b || (p0.mIsSelected != null && !this.a.c.o0().B())) {
             b1 = true;
          label_006a :
             return b1;
          }
       }
    label_0069 :
       b1 = false;
       goto label_006a ;
    }
    public boolean b(EditDecorationBaseDrawer p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerLongPictureSubViewBinder$d.class, "1");
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
       Object obj = PatchProxy.applyOneRefs(p0, this, StickerLongPictureSubViewBinder$d.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!p0 instanceof NewEditStickerBaseDrawer && !p0 instanceof NewEditTextBaseElement) {
          return b;
       }
       List identifyList = p0.getIdentifyList();
       a.o(identifyList, "drawer.identifyList");
       int i = this.a.D(identifyList).getFirst().intValue();
       b uob = this.a.c.o0();
       int i1 = (p0 instanceof NewEditTextBaseElement || (p0 instanceof NewEditStickerBaseDrawer && (uob.y().f() && p0.getLayerIndex() != uob.o())))? 0: 1;
       if (i != -1 && i1) {
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
