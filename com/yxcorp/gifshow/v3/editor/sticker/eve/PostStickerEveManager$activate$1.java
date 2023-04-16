package com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveManager$activate$1;
import msd.l;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import otc.a;
import java.lang.StringBuilder;
import java.util.UUID;
import java.lang.System;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger;
import com.yxcorp.gifshow.v3.editor.sticker.eve.PostStickerEveLogger$TaskType;
import lnc.p3;
import q87.c;
import com.kuaishou.eve.kit.api.init.EveManagerWrapper;

public final class PostStickerEveManager$activate$1 extends Lambda implements l	// class@001240
{
    public static final PostStickerEveManager$activate$1 INSTANCE;

    static {
       PostStickerEveManager$activate$1.INSTANCE = new PostStickerEveManager$activate$1();
    }
    public void PostStickerEveManager$activate$1(){
       super(1);
    }
    public Object invoke(Object p0){
       return this.invoke(p0);
    }
    public final String invoke(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, PostStickerEveManager$activate$1.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "pipeline");
       obj = a.c;
       _monitor_enter(obj);
       p0 = UUID.randomUUID()+'_'+System.nanoTime()+'_'+p0;
       PostStickerEveLogger.d.e(PostStickerEveLogger$TaskType.EveInference);
       Object[] objArray = new Object[0];
       p3.D().w("PostStickerEveManager", "onInfer start: "+p0, objArray);
       String b = a.b;
       if (b != null) {
          EveManagerWrapper.e.e("PostStickerRerank", b);
       }
       a.b = p0;
       _monitor_exit(obj);
       return p0;
    }
}
