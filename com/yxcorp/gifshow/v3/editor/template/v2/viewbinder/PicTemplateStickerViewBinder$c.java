package com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder$c;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationContainerView$b;
import com.yxcorp.gifshow.v3.editor.template.v2.viewbinder.PicTemplateStickerViewBinder;
import java.lang.Object;
import com.yxcorp.gifshow.v3.editor.decoration.EditDecorationBaseDrawer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.util.Objects;
import com.yxcrop.gifshow.v3.editor.sticker_v2_share.element.NewEditStickerBaseDrawer;
import a17.b$b;
import a17.b$a;
import wpc.k;
import uwc.b;
import com.yxcorp.gifshow.v3.previewer.player.viewmodel.PicturesViewModel;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import com.yxcorp.gifshow.v3.editor.EditorDelegate;
import kotlin.jvm.internal.a;
import maa.a;
import haa.a;
import java.util.ArrayList;
import com.yxcorp.gifshow.edit.draft.model.c;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.c;
import wba.h;
import com.kuaishou.edit.draft.AssetSegment;
import kotlin.collections.CollectionsKt___CollectionsKt;

public final class PicTemplateStickerViewBinder$c implements EditDecorationContainerView$b	// class@00139b
{
    public final PicTemplateStickerViewBinder a;

    public void PicTemplateStickerViewBinder$c(PicTemplateStickerViewBinder p0){
       this.a = p0;
       super();
    }
    public boolean a(EditDecorationBaseDrawer p0){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, PicTemplateStickerViewBinder$c.class, "2");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = true;
       if (this.a.J()) {
          return b;
       }
       boolean b1 = false;
       if (p0 != null) {
          PicTemplateStickerViewBinder$c ta = this.a;
          Objects.requireNonNull(ta);
          Object obj1 = PatchProxy.applyOneRefs(p0, ta, PicTemplateStickerViewBinder.class, "6");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(p0 instanceof NewEditStickerBaseDrawer && p0.isFromPicTemplate()){
             b = 0;
          }
          b1 = b;
       }
       return b1;
    }
    public boolean b(EditDecorationBaseDrawer p0){
       return true;
    }
    public void c(b$b p0,b$a p1){
       k.d(this, p0, p1);
    }
    public boolean d(EditDecorationBaseDrawer p0){
       boolean b;
       List identifyList;
       String identifier;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       PicTemplateStickerViewBinder$c obj = PatchProxy.applyOneRefs(p0, this, PicTemplateStickerViewBinder$c.class, "1");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       obj = this.a;
       Objects.requireNonNull(obj);
       PicTemplateStickerViewBinder picTemplateS = PicTemplateStickerViewBinder.class;
       Object obj1 = PatchProxy.applyOneRefs(p0, obj, picTemplateS, "7");
       if (obj1 != patchProxyRe) {
          b = obj1.booleanValue();
       }else {
          int i = obj.H().q0();
          c obj2 = PatchProxy.apply(null, obj, picTemplateS, "8");
          if (obj2 != patchProxyRe) {
          }else {
             obj2 = obj.q.N();
             a.o(obj2, "editorDelegate.workspaceDraft");
             a uoa = a.c(obj2);
             List obj3 = PatchProxy.applyOneRefs(uoa, obj, picTemplateS, "9");
             if (obj3 != patchProxyRe) {
                obj2 = obj3;
             }else {
                ArrayList uArrayList = new ArrayList();
                obj3 = uoa.z();
                a.o(obj3, "assetDraft.messages");
                Iterator iterator = obj3.iterator();
                while (iterator.hasNext()) {
                   Asset uAsset = iterator.next();
                   a.o(uAsset, "it");
                   if (h.b(uAsset) > 0) {
                      AssetSegment assetSegment = uAsset.getAssetSegment(0);
                      a.o(assetSegment, "it.getAssetSegment\(0\)");
                      identifier = assetSegment.getIdentifier();
                      a.o(identifier, "it.getAssetSegment\(0\).identifier");
                      uArrayList.add(identifier);
                   }else {
                      identifier = uAsset.getIdentifier();
                      a.o(identifier, "it.identifier");
                      uArrayList.add(identifier);
                   }
                }
                obj2 = uArrayList;
             }
          }
          String str = CollectionsKt___CollectionsKt.F2(obj2, i);
          if (p0 != null) {
             identifyList = p0.getIdentifyList();
             if (identifyList != null) {
             label_00bb :
                b = identifyList.contains(str);
             }
          }
          identifyList = new ArrayList();
          goto label_00bb ;
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
