package com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor$c;
import erd.a;
import com.yxcrop.gifshow.v3.editor.sticker_v2.NewStickerPicTemplateProcessor;
import com.yxcorp.gifshow.edit.draft.model.workspace.c;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import faa.a;
import q87.c;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import maa.a;
import haa.a;
import java.util.List;
import com.yxcorp.gifshow.edit.draft.model.c;
import kotlin.jvm.internal.a;
import java.util.Iterator;
import java.lang.Iterable;
import com.kuaishou.edit.draft.Asset;
import com.kuaishou.edit.draft.AssetSegment;
import com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.AddTemplateStickerAction;
import xvc.b;

public final class NewStickerPicTemplateProcessor$c implements a	// class@000a43
{
    public final NewStickerPicTemplateProcessor b;
    public final c c;
    public final String d;
    public final c e;

    public void NewStickerPicTemplateProcessor$c(NewStickerPicTemplateProcessor p0,c p1,String p2,c p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void run(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NewStickerPicTemplateProcessor$c.class, "1")) {
          return;
       }
       int i = 0;
       Object[] objArray1 = new Object[i];
       a.D().w("StickerPicTemplateProcessorV2", "apply: ", objArray1);
       NewStickerPicTemplateProcessor$c tb = this.b;
       NewStickerPicTemplateProcessor$c tc = this.c;
       NewStickerPicTemplateProcessor$c td = this.d;
       Objects.requireNonNull(tb);
       List obj = PatchProxy.applyTwoRefs(tc, td, tb, NewStickerPicTemplateProcessor.class, "12");
       if (obj != PatchProxyResult.class) {
          objArray = obj;
       }else {
          obj = a.c(tc).z();
          a.o(obj, "assetDraft.messages");
          Iterator iterator = obj.iterator();
          while (iterator.hasNext()) {
             Asset uAsset = iterator.next();
             a.o(uAsset, "it");
             if (a.g(td, uAsset.getIdentifier()) && uAsset.getAssetSegmentCount() > 0) {
                Object obj1 = uAsset.getAssetSegmentList().get(i);
                a.o(obj1, "it.assetSegmentList[0]");
                objArray = obj1.getIdentifier();
                break ;
             }
          }
       }
       this.b.l(new AddTemplateStickerAction(this.e, this.d, objArray));
       return;
    }
}
