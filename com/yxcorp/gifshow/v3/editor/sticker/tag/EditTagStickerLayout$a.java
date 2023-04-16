package com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout$a;
import qvc.b;
import com.yxcorp.gifshow.v3.editor.sticker.tag.EditTagStickerLayout;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;

public final class EditTagStickerLayout$a implements b	// class@0012b1
{
    public final EditTagStickerLayout a;

    public void EditTagStickerLayout$a(EditTagStickerLayout p0){
       this.a = p0;
       super();
    }
    public void a(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, EditTagStickerLayout$a.class, "1")) {
          return;
       }
       a.p(p0, "oldString");
       a.p(p1, "newString");
       this.a.g();
       return;
    }
}
