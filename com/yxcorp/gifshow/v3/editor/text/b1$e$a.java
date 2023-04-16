package com.yxcorp.gifshow.v3.editor.text.b1$e$a;
import ekd.q$a;
import com.yxcorp.gifshow.v3.editor.text.b1$e;
import java.lang.Object;
import com.kuaishou.edit.draft.Text;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.edit.draft.StickerResult;

public class b1$e$a implements q$a	// class@0013ae
{
    public final b1$e a;

    public void b1$e$a(b1$e p0){
       this.a = p0;
       super();
    }
    public Object apply(Object p0){
       StickerResult stickerResul = PatchProxy.applyOneRefs(p0, this, b1$e$a.class, "1");
       if (stickerResul != PatchProxyResult.class) {
       }else {
          stickerResul = p0.getResult();
       }
       return stickerResul;
    }
}
