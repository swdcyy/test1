package com.yxcrop.gifshow.v3.editor.sticker_v2.action.pic.AddTemplateStickerAction$a;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import com.kuaishou.edit.draft.Sticker;
import kotlin.jvm.internal.a;
import com.kuaishou.edit.draft.StickerResult;
import java.lang.Integer;
import java.lang.Comparable;
import xrd.b;

public final class AddTemplateStickerAction$a implements Comparator	// class@000a58
{

    public void AddTemplateStickerAction$a(){
       super();
    }
    public final int compare(Object p0,Object p1){
       Object obj = PatchProxy.applyTwoRefs(p0, p1, this, AddTemplateStickerAction$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       a.o(p0, "it");
       p0 = p0.getResult();
       a.o(p0, "it.result");
       a.o(p1, "it");
       p1 = p1.getResult();
       a.o(p1, "it.result");
       return b.f(Integer.valueOf(p0.getZIndex()), Integer.valueOf(p1.getZIndex()));
    }
}
