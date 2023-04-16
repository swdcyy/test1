package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$2$b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$TaskType;
import lnc.p3;
import java.lang.StringBuilder;
import w46.b;

public final class PostStickerEveManager$activate$2$b implements g	// class@001242
{
    public static final PostStickerEveManager$activate$2$b b;

    static {
       PostStickerEveManager$activate$2$b.b = new PostStickerEveManager$activate$2$b();
    }
    public void PostStickerEveManager$activate$2$b(){
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PostStickerEveManager$activate$2$b.class, "1")) {
       }else {
          PostStickerEveLogger.d.c(PostStickerEveLogger$TaskType.EveInference, p0.getMessage());
          Object[] objArray = new Object[0];
          p3.D().t("PostStickerEveManager", "onInfer err: "+p0.getMessage(), objArray);
       }
       return;
    }
}
