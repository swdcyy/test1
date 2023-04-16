package com.yxcorp.gifshow.v3.editor.sticker.j0$a$a;
import ekd.q$a;
import com.yxcorp.gifshow.v3.editor.sticker.j0$a;
import java.lang.Object;
import com.kuaishou.edit.draft.Sticker;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.StickerResult;

public class j0$a$a implements q$a	// class@001258
{
    public final j0$a a;

    public void j0$a$a(j0$a p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       StickerResult stickerResul = PatchProxy.applyOneRefs(p0, this, j0$a$a.class, "1");
       if (stickerResul != PatchProxyResult.class) {
       }else {
          stickerResul = p0.getResult();
       }
       return stickerResul;
    }
}
