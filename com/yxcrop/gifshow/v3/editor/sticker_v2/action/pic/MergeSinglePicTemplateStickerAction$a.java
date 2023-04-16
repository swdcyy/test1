package com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.MergeSinglePicTemplateStickerAction$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.Sticker;
import com.kuaishou.edit.draft.StickerResult;
import kotlin.jvm.internal.a;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class MergeSinglePicTemplateStickerAction$a implements Comparator	// class@000a5d
{

    public void MergeSinglePicTemplateStickerAction$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, MergeSinglePicTemplateStickerAction$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       p0 = p0.getResult();
       a.o(p0, "it.result");
       p1 = p1.getResult();
       a.o(p1, "it.result");
       return b.f(Integer.valueOf(p0.getZIndex()), Integer.valueOf(p1.getZIndex()));
    }
}
